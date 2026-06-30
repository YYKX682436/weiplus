package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public class ErrorInfo {
    public final java.lang.String errMsg;
    public final int errno;

    public ErrorInfo(int i17) {
        this(i17, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.errno == ((com.tencent.shadow.dynamic.host.ErrorInfo) obj).errno;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.errno));
    }

    public boolean isOk() {
        return this.errno == 0;
    }

    public java.lang.String toJsonString() {
        return "{'errno':" + this.errno + ",'errMsg'='" + this.errMsg + "'}";
    }

    public java.lang.String toString() {
        return "ErrorInfo{errno=" + this.errno + ", errMsg='" + this.errMsg + "'}";
    }

    public ErrorInfo(int i17, java.lang.String str) {
        this.errno = i17;
        this.errMsg = str;
    }

    public ErrorInfo(com.tencent.shadow.dynamic.host.FailedException failedException) {
        this.errno = failedException.errorCode;
        this.errMsg = failedException.errorMessage;
    }
}
