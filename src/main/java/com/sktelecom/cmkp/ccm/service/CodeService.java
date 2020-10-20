package com.sktelecom.cmkp.ccm.service;

import com.sktelecom.cmkp.ccm.dao.CodeDao;
import com.sktelecom.cmkp.ccm.dao.pagination.Criteria;
import com.sktelecom.cmkp.ccm.dao.vo.CodeGrpVo;
import com.sktelecom.cmkp.ccm.dao.vo.CodeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeService {

    @Autowired
    private CodeDao codeDao;

    public CodeVo selectCode(){
        CodeVo codeVo = new CodeVo();
        codeVo.setCodeId(1);
        codeVo.setCodeGrp("group1");
        codeVo.setCode("code");
        codeVo.setCodeNm("codeNm");
        codeVo.setCodeNmEn("codeEmEn");
        codeVo.setAddInfo("addInfo");
        codeVo.setDisplayOrder(3);
        codeVo.setUseYn("useYn");
        return codeVo;
    }

//    public List<CodeVo> selectCodeList(CodeVo codeVo) {
//        return codeDao.selectCodeList(codeVo);
//    }

    public List<CodeVo> selectCodeList(String codeGrp) {
        return codeDao.selectCodeList(codeGrp);
    }

    public CodeVo selectCodeOne(int id) {
        return codeDao.selectCodeOne(id);
    }

    public int insertCode(CodeVo codeVo) {
        return codeDao.insertCode(codeVo);
    }

    public int updateCode(int id, CodeVo codeVo) {
        codeVo.setCodeId(id);
        return codeDao.updateCode(codeVo);
    }

    public int deleteCode(int id) {
        return codeDao.deleteCode(id);
    }


    // --------------------------------------- code group ----------------------------------------------

    public List<CodeGrpVo> selectCodeGrpList(Criteria criteria) {
        return codeDao.selectCodeGrpList(criteria);
    }

    public CodeGrpVo selectCodeGrpOne(int id) {
        return codeDao.selectCodeGrpOne(id);
    }

    public int insertCodeGrp(CodeGrpVo codeGrpVo) {
        return codeDao.insertCodeGrp(codeGrpVo);
    }

    public int updateCodeGrp(int id, CodeGrpVo codeGrpVo) {
        codeGrpVo.setCodeGrpId(id);
        return codeDao.updateCodeGrp(codeGrpVo);
    }

    public int deleteCodeGrp(int id) {
        return codeDao.deleteCodeGrp(id);
    }
}
