package mt1;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final mt1.f f331216d = new mt1.f();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            aw1.t0.f14682a.d();
            aw1.v0.a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CalcWxNewService", th6, "", new java.lang.Object[0]);
            jx3.f.INSTANCE.d(21019, 0, 0, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL), "Calc-reportDaily", jz5.a.b(th6));
        }
    }
}
