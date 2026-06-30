package ub5;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ub5.g f426229a = new ub5.g();

    public final void a(android.app.Activity context, com.tencent.mm.ui.widget.dialog.k0 bottomSheet, java.util.List msgList, com.tencent.mm.storage.z3 z3Var, ub5.j jVar, yz5.a aVar, xj.m adInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(msgList, "msgList");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToYuanBao, msgList: ");
        sb6.append(msgList.size());
        sb6.append(", talker: ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
        bc5.e eVar = new bc5.e(context, msgList, z3Var);
        eVar.f19195k = ac5.f.f3090a.b(context, z3Var == null ? new com.tencent.mm.storage.z3() : z3Var);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 2);
        z2Var.q(context.getResources().getString(com.tencent.mm.R.string.olt));
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489465eo2, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a1p)).setText(((ht.w) ((jt.c0) i95.n0.c(jt.c0.class))).wi(context));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a17);
        gk0.k kVar = new gk0.k(imageView.getWidth(), imageView.getHeight());
        kVar.f272433d = 0.5f;
        ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).wi(imageView, com.tencent.mm.ui.bk.C() ? adInfo.f454757e : adInfo.f454756d, kVar);
        jt.x xVar = (jt.x) i95.n0.c(jt.x.class);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ty9);
        ((jb0.g) xVar).getClass();
        boolean a17 = lb0.q.f317688a.a(textView, 8, false, null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485915ug5)).setText(context.getString(com.tencent.mm.R.string.f492837i25, java.lang.Integer.valueOf(eVar.b(true, 1, true, true).size())));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cwk)).setOnClickListener(new ub5.a(eVar, context));
        z2Var.m(context.getString(com.tencent.mm.R.string.f490347sg), context.getString(a17 ? com.tencent.mm.R.string.f490568yq : com.tencent.mm.R.string.f490358sq));
        ub5.b bVar = new ub5.b(z2Var);
        ub5.d dVar = new ub5.d(z2Var, eVar, adInfo, context, jVar, aVar, z3Var);
        z2Var.D = bVar;
        z2Var.E = dVar;
        z2Var.f212058g.setBackgroundResource(com.tencent.mm.R.drawable.cw_);
        z2Var.j(inflate);
        z2Var.C();
    }
}
