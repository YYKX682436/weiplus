package dd5;

/* loaded from: classes9.dex */
public final class k extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.k f229187p = new dd5.k();

    public k() {
        super(dd5.n.f229222b.f426539a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        jz5.f0 f0Var;
        em.a2 binding = (em.a2) obj;
        dd5.m mVar = (dd5.m) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (mVar == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        z(d17, context, mVar.f229207a);
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        z(b17, context, mVar.f229208b);
        int width = binding.c().getWidth();
        gk0.k kVar = new gk0.k(width, width);
        kVar.f272434e = com.tencent.mm.R.color.f478490b;
        kVar.f272433d = 0.5f;
        java.lang.String str = mVar.f229209c;
        if (str != null) {
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView c17 = binding.c();
            kotlin.jvm.internal.o.f(c17, "getIconIv(...)");
            ((h83.g) n0Var).wi(c17, str, kVar);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            gk0.n0 n0Var2 = (gk0.n0) i95.n0.c(gk0.n0.class);
            com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView c18 = binding.c();
            kotlin.jvm.internal.o.f(c18, "getIconIv(...)");
            ((h83.g) n0Var2).Ai(c18, mVar.f229210d, kVar);
        }
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.m mVar = (dd5.m) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (mVar == null) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = mVar.f229215i;
        boolean R4 = com.tencent.mm.storage.z3.R4(f9Var.Q0());
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        java.lang.String d17 = g95.e0.d(f9Var);
        if (d17 == null) {
            d17 = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_username", mVar.f229211e);
        if (R4) {
            intent.putExtra("key_scene_note", Q0 + ':' + d17);
        } else {
            intent.putExtra("key_scene_note", Q0);
        }
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = mVar.f229212f;
        z5Var.f305872j = 6;
        z5Var.f305870h = mVar.f229214h;
        z5Var.f305869g = mVar.f229213g;
        intent.putExtra("key_scene_exposed_params", z5Var.a());
        j45.l.j(context, "appbrand", ".ui.AppBrandProfileUI", intent, null);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String B;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        int i17 = bVar.f432315e;
        s05.d dVar = (s05.d) bVar.getCustom(i17 + 39);
        if (dVar == null || dVar.getType() != 1) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
        k91.v5 Bi = f6Var != null ? ((k91.g4) f6Var).Bi(dVar.y()) : null;
        java.lang.String str = Bi != null ? Bi.field_nickname : null;
        if (str == null) {
            str = bVar.getString(i17 + 12);
        }
        java.lang.String str2 = str;
        java.lang.String string = context.getString(com.tencent.mm.R.string.n8d);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (Bi == null || (B = Bi.field_brandIconURL) == null) {
            B = dVar.B();
        }
        java.lang.String str3 = (B == null || r26.n0.N(B)) ^ true ? B : null;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        kotlin.jvm.internal.o.f(D2, "getFullThumbPathByCache(...)");
        java.lang.String y17 = dVar.y();
        java.lang.String str4 = y17 == null ? "" : y17;
        java.lang.String appId = dVar.getAppId();
        java.lang.String str5 = appId == null ? "" : appId;
        int version = dVar.getVersion();
        s05.e q17 = dVar.q();
        return new dd5.m(str2, string, str3, D2, str4, str5, version, q17 != null ? q17.getType() : 0, f9Var);
    }
}
