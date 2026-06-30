package com.tencent.wechat.aff.common;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u000bH\u0086 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/tencent/wechat/aff/common/FunctionRunnable;", "Ljava/lang/Runnable;", "<init>", "()V", "nativePointer", "", "getNativePointer", "()J", "setNativePointer", "(J)V", "run", "", "nativeRun", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FunctionRunnable implements java.lang.Runnable {
    private long nativePointer;

    public final long getNativePointer() {
        return this.nativePointer;
    }

    public final native void nativeRun();

    @Override // java.lang.Runnable
    public void run() {
        nativeRun();
    }

    public final void setNativePointer(long j17) {
        this.nativePointer = j17;
    }
}
