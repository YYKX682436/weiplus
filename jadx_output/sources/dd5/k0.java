package dd5;

/* loaded from: classes9.dex */
public final class k0 extends dd5.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.k0 f229188p = new dd5.k0();

    public k0() {
        super(dd5.m0.f229216b.f426539a);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v1 v1Var = (dd5.v1) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (v1Var == null) {
            return;
        }
        java.lang.String U1 = v1Var.f229315f.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        r05.e eVar = (r05.e) bVar.getCustom(bVar.f432315e + 19);
        java.lang.String j17 = eVar != null ? eVar.j() : null;
        boolean z17 = j17 == null || r26.n0.N(j17);
        int i17 = bVar.f368365d;
        if (z17) {
            j17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).P(bVar.getString(i17 + 9));
        }
        if (android.text.TextUtils.isEmpty(j17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("rawUrl", bVar.getString(i17 + 9));
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (j17 == null) {
            j17 = "";
        }
        qk.c0 c0Var = new qk.c0(j17);
        c0Var.f364155a = 23;
        c0Var.f364198g = 123;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryTypeEmotionShared", "emoticon liteapp service not found");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, c0Var);
        }
    }
}
