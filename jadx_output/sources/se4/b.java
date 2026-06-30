package se4;

/* loaded from: classes9.dex */
public class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public km5.b f406920a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f406921b = -1;

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        ju5.h hVar = new ju5.h(null);
        hVar.f302092a = re4.g0.b();
        hVar.f302096e = "WechatASK";
        hVar.f302093b = new int[]{1, 2, 920, 3};
        hVar.f302095d = new re4.e0();
        hVar.f302094c = new re4.a0();
        se4.m mVar = new se4.m(com.tencent.mm.sdk.platformtools.x2.f193071a, hVar);
        km5.b b17 = km5.u.b();
        this.f406920a = b17;
        b17.b();
        mVar.f302088a = new se4.a(this);
        if (ju5.n.c().a(mVar, new eu5.d())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 1);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterInitFunc", "add soterTaskInitForWX failed.");
        }
        java.lang.System.currentTimeMillis();
        return bVar;
    }
}
