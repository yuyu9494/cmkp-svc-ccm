package com.sktelecom.cmkp.ccm.dao.vo;

import lombok.Data;

/**
 * 공통코드그룹 VO
 * 슬랙에 있는 테이블 컬럼보고 유츄해서 만듬
 * 잘못된점 있으면 수정하고 진행해주시면 될것같습니다.
 */
@Data
public class CodeGrpVo {
    private int codeGrpId;
    private String codeGrp;
    private String codeGrpNm;
    private String codeGrpNmEn;
    private String codeGrpExpl;
    private String useYn;
}
