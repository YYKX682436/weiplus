package dd5;

/* loaded from: classes9.dex */
public final class e2 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.e2 f229124p = new dd5.e2();

    public e2() {
        super(dd5.h2.f229161b.f426539a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.g2 g2Var = (dd5.g2) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (g2Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        z(d17, context, g2Var.f229154a);
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        z(b17, context, g2Var.f229155b);
        int width = binding.c().getWidth();
        r45.zs4 zs4Var = g2Var.f229156c;
        zs4Var.f392357o = width;
        ff0.q qVar = (ff0.q) i95.n0.c(ff0.q.class);
        com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView c17 = binding.c();
        kotlin.jvm.internal.o.f(c17, "getIconIv(...)");
        ((if0.w) qVar).Bi(context, c17, null, zs4Var);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.g2 g2Var = (dd5.g2) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(context, null) && g2Var != null) {
            com.tencent.mm.storage.f9 f9Var = g2Var.f229157d;
            com.tencent.mm.ui.chatting.o6.f202065a.d(context, f9Var, ot0.q.v(f9Var.j()));
        }
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String string;
        l15.e j17;
        java.lang.String U1 = f9Var.U1();
        boolean z17 = false;
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        int i17 = bVar.f432315e;
        e15.b bVar2 = (e15.b) bVar.getCustom(i17 + 49);
        e15.c cVar = (e15.c) bVar.getCustom(i17 + 48);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        if (D2 == null) {
            D2 = "";
        }
        java.lang.String x17 = bVar2 != null ? bVar2.x() : null;
        boolean z18 = x17 == null || x17.length() == 0;
        int i18 = bVar.f368365d;
        if (z18) {
            string = bVar.getString(i18 + 3);
        } else if (bVar2 == null || (string = bVar2.x()) == null) {
            string = "";
        }
        java.lang.String str = f9Var.getMsgId() + "_msg";
        ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
        r45.zs4 zs4Var = new r45.zs4();
        zs4Var.f392358p = il4.l.g(cVar != null ? cVar.getType() : 0);
        java.lang.String string2 = bVar.getString(i17 + 46);
        zs4Var.f392351f = string2 != null ? string2 : "";
        zs4Var.f392352g = D2;
        l15.d dVar = (l15.d) bVar.getCustom(i17 + 30);
        if (dVar != null && (j17 = dVar.j()) != null && j17.k() == 1) {
            z17 = true;
        }
        zs4Var.f392354i = z17;
        zs4Var.f392349d = bVar.getString(i18 + 2);
        zs4Var.f392350e = string;
        zs4Var.f392355m = true;
        zs4Var.f392356n = kotlin.jvm.internal.o.b(str, te5.t.c(cVar != null ? new java.lang.Long(cVar.j()).toString() : null));
        return new dd5.g2(bVar.getString(i18 + 2), string, zs4Var, f9Var);
    }

    @Override // uc5.b0, uc5.n
    /* renamed from: y */
    public void n(android.content.Context context, em.a2 binding, java.lang.String query) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlin.jvm.internal.o.g(query, "query");
        android.content.res.Resources resources = context.getResources();
        uc5.e eVar = uc5.n.f426527n;
        eVar.a();
        int color = resources.getColor(com.tencent.mm.R.color.f478502m, null);
        android.widget.TextView d17 = binding.d();
        java.lang.CharSequence text = binding.d().getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        d17.setText(eVar.b(text, query, color));
        android.widget.TextView b17 = binding.b();
        java.lang.CharSequence text2 = binding.b().getText();
        kotlin.jvm.internal.o.f(text2, "getText(...)");
        b17.setText(eVar.b(text2, query, color));
    }
}
