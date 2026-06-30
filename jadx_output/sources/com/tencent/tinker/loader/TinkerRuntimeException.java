package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public class TinkerRuntimeException extends java.lang.RuntimeException {
    private static final java.lang.String TINKER_RUNTIME_EXCEPTION_PREFIX = "Tinker Exception:";
    private static final long serialVersionUID = 1;

    public TinkerRuntimeException(java.lang.String str) {
        super(TINKER_RUNTIME_EXCEPTION_PREFIX + str);
    }

    public TinkerRuntimeException(java.lang.String str, java.lang.Throwable th6) {
        super(TINKER_RUNTIME_EXCEPTION_PREFIX + str, th6);
    }
}
