package com.qiantao.service;

import com.qiantao.domain.NoteTypeDomain;
import com.qiantao.vo.ResponseVo;

public interface NoteTypeService {
	
	public NoteTypeDomain getModel(Long id);

	public ResponseVo save(NoteTypeDomain domain);

}
