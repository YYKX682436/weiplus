package com.tencent.xsummary.jni;

/* loaded from: classes5.dex */
public class XSummary {

    /* renamed from: a, reason: collision with root package name */
    public long f220188a = newNativeXSummary();

    private native void deleteNativeXSummary(long j17);

    private native com.tencent.xsummary.jni.XSummaryResult[] extractNative(long j17, java.lang.String str);

    private native boolean initializeNative(long j17, java.lang.String str);

    private native boolean isInitializedNative(long j17);

    private native long newNativeXSummary();

    public com.tencent.xsummary.jni.XSummaryResult[] a(java.lang.String str) {
        return extractNative(this.f220188a, str);
    }

    public boolean b(java.lang.String str) {
        return initializeNative(this.f220188a, str);
    }

    public void finalize() {
        long j17 = this.f220188a;
        if (0 != j17) {
            deleteNativeXSummary(j17);
            this.f220188a = 0L;
        }
        super.finalize();
    }
}
