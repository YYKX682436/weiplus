package s82;

/* loaded from: classes9.dex */
public class b extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f404732f;

    public b(com.tencent.mm.plugin.fav.ui.ra raVar) {
        super(raVar);
        this.f404732f = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479775ew);
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        java.lang.String string = gVar.f404776c.getContext().getString(com.tencent.mm.R.string.f490614a00);
        r45.dp0 dp0Var = gVar.f404774a.field_favProto.I;
        if (dp0Var == null) {
            return string;
        }
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(dp0Var.f372634d);
        return Bi != null ? Bi.field_nickname : gVar.f404776c.getContext().getString(com.tencent.mm.R.string.f490614a00);
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_mini_program);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.a aVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new s82.a();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.aba, null);
            a(view2, aVar, r2Var);
            aVar.f404728q = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dum);
            aVar.f404729r = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dut);
            aVar.f404730s = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
        } else {
            view2 = view;
            aVar = (s82.a) view.getTag();
        }
        g(aVar, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String str = r2Var.field_favProto.f370972q;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = J2.f375404d;
        }
        aVar.f404730s.setText(str);
        r45.dp0 dp0Var = r2Var.field_favProto.I;
        if (dp0Var == null || dp0Var.f372645r != 1) {
            aVar.f404729r.setVisibility(8);
        } else {
            aVar.f404729r.setVisibility(0);
        }
        android.util.Pair kj6 = r2Var.field_favProto.I != null ? ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).kj(r2Var.field_favProto.I.f372636f) : null;
        if (kj6 == null || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) kj6.first)) {
            aVar.f404779f.setText((java.lang.CharSequence) null);
            aVar.f404779f.setVisibility(8);
        } else {
            aVar.f404779f.setText((java.lang.CharSequence) kj6.first);
            aVar.f404779f.setBackgroundResource(((java.lang.Integer) kj6.second).intValue());
            aVar.f404779f.setVisibility(0);
        }
        if (!com.tencent.mm.plugin.fav.ui.b0.a(aVar.f404728q, r2Var.field_favProto.I, 0.5f)) {
            android.widget.ImageView imageView = aVar.f404728q;
            int i17 = this.f404732f;
            com.tencent.mm.plugin.fav.ui.ra.d(imageView, com.tencent.mm.R.raw.fav_list_icon_miniprogram_default, J2, r2Var, false, i17, i17);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.dp0 dp0Var = ((s82.g) view.getTag()).f404774a.field_favProto.I;
        if (dp0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavAppBrandListItem", "onListItemClick appBrandItem null");
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = dp0Var.f372634d;
        b1Var.f317014b = dp0Var.f372635e;
        b1Var.f317016c = dp0Var.f372636f;
        b1Var.f317018d = dp0Var.f372641n;
        b1Var.f317022f = dp0Var.f372639i;
        b1Var.f317032k = 1010;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        b1Var.f317041s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f77326h = dp0Var.f372644q;
        appBrandLaunchReferrer.f77322d = 6;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(view.getContext(), b1Var);
    }
}
