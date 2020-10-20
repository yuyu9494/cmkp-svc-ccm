package com.sktelecom.cmkp.ccm.dao;

import com.sktelecom.cmkp.ccm.dao.pagination.Criteria;
import com.sktelecom.cmkp.ccm.dao.vo.CodeGrpVo;
import com.sktelecom.cmkp.ccm.dao.vo.CodeVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CodeDao {

    @Autowired
    SqlSession sqlSession;

    // code 목록 조회
//    public List<CodeVo> selectCodeList(CodeVo codeVo) {
//        return sqlSession.selectList("cbp.comm.code.selectCodeList", codeVo);
//    }

    // 해당 group의 code 목록 조회
    public List<CodeVo> selectCodeList(String codeGrp) {
        return sqlSession.selectList("cbp.comm.code.selectCodeList", codeGrp);
    }

    // code 상세
    public CodeVo selectCodeOne(int id) {
        return sqlSession.selectOne("cbp.comm.code.selectCodeOne", id);
    }

    // code 등록
    public int insertCode(CodeVo codeVo) {
        return sqlSession.insert("cbp.comm.code.insertCode", codeVo);
    }

    // code 수정
    public int updateCode(CodeVo codeVo) {
        return sqlSession.update("cbp.comm.code.updateCode", codeVo);
    }

    // code 삭제
    public int deleteCode(int id) {
        return sqlSession.delete("cbp.comm.code.deleteCode", id);
    }


    // ------------------------------------ code group ------------------------------------------
    // codeGrp 목록 조회
    public List<CodeGrpVo> selectCodeGrpList(Criteria criteria) {
        return sqlSession.selectList("cbp.comm.codeGrp.selectCodeGrpList", criteria);
    }

    // codeGrp 상세
    public CodeGrpVo selectCodeGrpOne(int id) {
        return sqlSession.selectOne("cbp.comm.codeGrp.selectCodeGrpOne", id);
    }

    // codeGrp 등록
    public int insertCodeGrp(CodeGrpVo codeGrpVo) {
        return sqlSession.insert("cbp.comm.codeGrp.insertCodeGrp", codeGrpVo);
    }

    // codeGrp 수정
    public int updateCodeGrp(CodeGrpVo codeGrpVo) {
        return sqlSession.update("cbp.comm.codeGrp.updateCodeGrp", codeGrpVo);
    }

    // codeGrp 삭제
    public int deleteCodeGrp(int id) {
        return sqlSession.delete("cbp.comm.codeGrp.deleteCodeGrp", id);
    }

}
