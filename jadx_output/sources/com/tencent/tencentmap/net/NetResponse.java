package com.tencent.tencentmap.net;

/* loaded from: classes13.dex */
public class NetResponse {
    public java.lang.String charset;
    public byte[] data;
    public int errorCode;
    public byte[] errorData;
    public java.lang.Exception exception;
    public int statusCode;

    public NetResponse() {
        this.errorCode = -1;
        this.charset = "GBK";
    }

    public boolean available() {
        if (this.errorCode == 0 && this.statusCode == 200) {
            return true;
        }
        byte[] bArr = this.data;
        return bArr != null && bArr.length > 0;
    }

    public java.lang.String toString() {
        try {
            byte[] bArr = this.data;
            return bArr != null ? new java.lang.String(bArr, this.charset) : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public NetResponse(com.tencent.map.tools.net.NetResponse netResponse) {
        this.errorCode = -1;
        this.charset = "GBK";
        if (netResponse != null) {
            this.errorCode = netResponse.errorCode;
            this.statusCode = netResponse.statusCode;
            this.data = netResponse.data;
            this.charset = netResponse.charset;
            this.exception = netResponse.exception;
            this.errorData = netResponse.errorData;
        }
    }

    public NetResponse(java.lang.Exception exc) {
        this.errorCode = -1;
        this.charset = "GBK";
        this.exception = exc;
        if (exc instanceof com.tencent.map.tools.net.exception.NetErrorException) {
            com.tencent.map.tools.net.exception.NetErrorException netErrorException = (com.tencent.map.tools.net.exception.NetErrorException) exc;
            this.errorCode = netErrorException.errorCode;
            this.statusCode = netErrorException.statusCode;
        }
    }
}
