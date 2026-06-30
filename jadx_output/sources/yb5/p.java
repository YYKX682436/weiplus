package yb5;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.sdk.platformtools.o3 {
    static {
        yb5.f fVar = yb5.f.f460733a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p() {
        /*
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            r2.<init>(r0)
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = kotlin.jvm.internal.o.b(r1, r0)
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "ChattingMMHandler can only be created for mainThread"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yb5.p.<init>():void");
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void afterDispatchMessage(android.os.Message message) {
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void beforeDispatchMessage(android.os.Message message) {
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void beforeSendMessage(android.os.Message message, long j17) {
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void postUI(java.lang.Runnable runnable) {
        d(runnable);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void postUIDelayed(java.lang.Runnable runnable, long j17) {
        postDelayed(runnable, j17);
    }
}
