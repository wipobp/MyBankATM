package com.bank.td.api;

import com.bank.td.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-07-24T05:48:48.001Z")

@Api(value = "atms", description = "the atms API")
public interface AtmsApi {

    @ApiOperation(value = "To get ATMs", notes = "", response = InlineResponse200.class, tags={ "1_0_0", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = InlineResponse200.class) })
    @RequestMapping(value = "/atms",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> 1(@ApiParam(value = "") @RequestParam(value = "lac", required = false) String lac



,@ApiParam(value = "") @RequestParam(value = "lon", required = false) String lon



,@ApiParam(value = "") @RequestParam(value = "redius", required = false) String redius



) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

}
