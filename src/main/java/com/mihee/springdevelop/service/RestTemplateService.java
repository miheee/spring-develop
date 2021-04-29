package com.mihee.springdevelop.service;

import com.mihee.springdevelop.repository.JsonVo;
import com.mihee.springdevelop.repository.RestTemplateUtil;
import com.mihee.springdevelop.repository.XmlVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RestTemplateService {
    public XmlVo getXmlData() {
        return RestTemplateUtil.getXmlResponse();
    }

    public JsonVo getJsonData() {
        return RestTemplateUtil.getJsonRsponse();
    }

    public ResponseEntity<String> getEntity(String key) {
        return RestTemplateUtil.getResponseEntity(key);
    }

    public ResponseEntity<String> addData() {
        return RestTemplateUtil.post();
    }
}
