package pr;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final pr.l f357744d = new pr.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gr.v.f274696a.a(false);
        long H1 = com.tencent.mm.sdk.platformtools.t8.H1(r0.b().getInt("designer_sync_time", 0));
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_designer_sync_interval, be1.r0.CTRL_INDEX);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "checkStart: " + (H1 / 3600) + ", " + Ni);
        if (Ni > 0 && H1 > Ni * 3600 && pr.o.f357750e == null) {
            pr.o oVar = new pr.o();
            pr.o.f357750e = oVar;
            oVar.a();
        }
        return jz5.f0.f302826a;
    }
}
