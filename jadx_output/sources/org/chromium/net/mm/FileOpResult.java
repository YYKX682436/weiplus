package org.chromium.net.mm;

@org.chromium.base.annotations.JNINamespace("weapp_core")
/* loaded from: classes7.dex */
public class FileOpResult {
    private final int errorCode;
    private final java.lang.String errorMessage;
    private final java.lang.String result;

    public FileOpResult(int i17, java.lang.String str, java.lang.String str2) {
        this.errorCode = i17;
        this.errorMessage = str;
        this.result = str2;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public java.lang.String getResult() {
        return this.result;
    }
}
