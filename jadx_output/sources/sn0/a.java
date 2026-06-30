package sn0;

/* loaded from: classes3.dex */
public final class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn0.b f409963d;

    public a(sn0.b bVar) {
        this.f409963d = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        sn0.b bVar = this.f409963d;
        com.tencent.trtc.TRTCCloud T = bVar.T();
        bVar.getClass();
        cl0.d dVar = new cl0.d();
        dVar.e("userId", bVar.D.f309586f);
        r45.rm1 rm1Var = bVar.M;
        dVar.e("songId", java.lang.Integer.valueOf(rm1Var != null ? rm1Var.getInteger(0) : 0));
        r45.rm1 rm1Var2 = bVar.M;
        dVar.e("songType", java.lang.Integer.valueOf(rm1Var2 != null ? rm1Var2.getInteger(2) : 0));
        r45.rm1 rm1Var3 = bVar.M;
        java.lang.Object string = rm1Var3 != null ? rm1Var3.getString(1) : null;
        if (string == null) {
            string = "";
        }
        dVar.e("listenId", string);
        dVar.e("playStatus", java.lang.Integer.valueOf(bVar.N ? 1 : 0));
        dVar.e("st", java.lang.Long.valueOf(c01.id.c()));
        cl0.g gVar = new cl0.g();
        try {
            hn0.u uVar = hn0.u.f282437e;
            gVar.s("wxT", 16);
            gVar.s("d", dVar.toString());
        } catch (cl0.f | java.io.IOException unused) {
        }
        gVar.toString();
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        byte[] bytes = gVar2.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        T.sendSEIMsg(bytes, 1);
        return true;
    }
}
