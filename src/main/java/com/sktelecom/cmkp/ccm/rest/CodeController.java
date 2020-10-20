package com.sktelecom.cmkp.ccm.rest;

import com.sktelecom.cmkp.ccm.dao.pagination.Criteria;
import com.sktelecom.cmkp.ccm.dao.vo.CodeGrpVo;
import com.sktelecom.cmkp.ccm.dao.vo.CodeVo;
import com.sktelecom.cmkp.ccm.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ccm")
public class CodeController {

    @Autowired
    CodeService codeService;

//    @RequestMapping(value = "/code/one", method = RequestMethod.GET)
//    public CodeVo selectCode(){
//        return codeService.selectCode();
//    }

//    @GetMapping("/code")
//    public List<CodeVo> selectCodeList (CodeVo codeVo) {
//        return codeService.selectCodeList(codeVo);
//    }

    @GetMapping("/code")
    public List<CodeVo> selectCodeList (@RequestParam String codeGrp) {
        return codeService.selectCodeList(codeGrp);
    }

    @GetMapping("/code/{code_id}")
    public CodeVo selectCodeOne (@PathVariable("code_id") int code_id) {
        return codeService.selectCodeOne(code_id);
    }

    @PostMapping("/code")
    public CodeVo insertCode (@RequestBody CodeVo codeVo) {
        codeService.insertCode(codeVo);
        return codeVo;
    }

    @PutMapping("/code/{code_id}")
    public int updateCode (@PathVariable("code_id") int code_id, @RequestBody CodeVo codeVo) {
        return codeService.updateCode(code_id, codeVo);
    }

    @DeleteMapping("/code/{code_id}")
    public int deleteCode (@PathVariable("code_id") int code_id) {
        return codeService.deleteCode(code_id);
    }


    // ------------------------------------ code group -------------------------------------------

    @GetMapping("/code_grp")
    public List<CodeGrpVo> selectCodeGrpList(@RequestParam int startPage, @RequestParam int recordsPerPage) {
        Criteria criteria = new Criteria();
        criteria.setCurrentPageNo(startPage);
        criteria.setRecordsPerPage(recordsPerPage);
        return  codeService.selectCodeGrpList(criteria);
    }

    @GetMapping("/code_grp/{code_grp_id}")
    public CodeGrpVo selectCodeGrpOne (@PathVariable("code_grp_id") int code_grp_id) {
        return codeService.selectCodeGrpOne(code_grp_id);
    }

    @PostMapping("/code_grp")
    public CodeGrpVo insertCodeGrp (@RequestBody CodeGrpVo codeGrpVo) {
        codeService.insertCodeGrp(codeGrpVo);
        return codeGrpVo;
    }

    @PutMapping("/code_grp/{code_grp_id}")
    public int updateCodeGrp (@PathVariable("code_grp_id") int code_grp_id, @RequestBody CodeGrpVo codeGrpVo) {
        return codeService.updateCodeGrp(code_grp_id, codeGrpVo);
    }

    @DeleteMapping("/code_grp/{code_grp_id}")
    public int deleteCodeGrp (@PathVariable("code_grp_id") int code_grp_id) {
        return codeService.deleteCodeGrp(code_grp_id);
    }


}
