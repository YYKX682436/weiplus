package hr0;

/* loaded from: classes12.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final hr0.x f283340d = new hr0.x();

    public x() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String[] strArr = (java.lang.String[]) obj;
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.lang.String localCurrentThread = com.tencent.wxperf.thread.ThreadInspect.init() ? com.tencent.wxperf.thread.ThreadInspect.getLocalCurrentThread() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSetHiddenApiExemptions: ");
        java.lang.String arrays = java.util.Arrays.toString(strArr);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(",java=");
        sb6.append(android.util.Log.getStackTraceString(th6));
        sb6.append(", native=");
        sb6.append(localCurrentThread);
        com.tencent.mars.xlog.Log.w("MicroMsg.JniHookHandler", sb6.toString());
        if ((strArr != null && strArr.length == 1) && kotlin.jvm.internal.o.b(strArr[0], "L") && mm.o.j(false, 1, null)) {
            ((ku5.t0) ku5.t0.f312615d).k(new hr0.w(th6, strArr, localCurrentThread), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        return java.lang.Integer.valueOf((kotlin.jvm.internal.o.b(strArr, new java.lang.String[]{"L"}) && mm.o.b()) ? 1 : 0);
    }
}
