package in0;

/* loaded from: classes3.dex */
public final class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f292742d;

    public b(in0.q qVar) {
        this.f292742d = qVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        in0.q qVar = this.f292742d;
        com.tencent.trtc.TRTCCloud T = qVar.T();
        cl0.g X0 = qVar.X0();
        qVar.Y0(X0, qVar.U().f474319w);
        java.lang.String gVar = X0.toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        byte[] bytes = gVar.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        T.sendSEIMsg(bytes, 1);
        return true;
    }
}
