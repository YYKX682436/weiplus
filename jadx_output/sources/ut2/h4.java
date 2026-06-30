package ut2;

/* loaded from: classes3.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f430902a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f430903b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f430904c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f430905d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f430906e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f430907f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zv f430908g;

    public h4(android.view.ViewGroup root, gk2.e buContext) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f430902a = root;
        this.f430903b = buContext;
        this.f430904c = root.findViewById(com.tencent.mm.R.id.v4m);
        this.f430905d = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.u0l);
        this.f430906e = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.u0k);
        this.f430907f = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.u0m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View a(bw5.yv yvVar) {
        android.widget.TextView textView;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        int i17 = yvVar.f35707d;
        boolean[] zArr = yvVar.f35716p;
        android.view.ViewGroup viewGroup = this.f430902a;
        if (i17 == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("text, wording: ");
            sb6.append(zArr[5] ? yvVar.f35711h : "");
            com.tencent.mars.xlog.Log.i("ShoppingPanelHeaderGuideHolder", sb6.toString());
            android.widget.TextView textView2 = new android.widget.TextView(viewGroup.getContext());
            textView2.setText(zArr[5] ? yvVar.f35711h : "");
            textView2.setTextSize(1, yvVar.f35712i);
            textView2.setTextColor(android.graphics.Color.parseColor(zArr[7] ? yvVar.f35713m : ""));
            textView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            textView = textView2;
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("ShoppingPanelHeaderGuideHolder", "error itemType: " + yvVar.f35707d);
            textView = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("img, url: ");
            sb7.append(zArr[2] ? yvVar.f35708e : "");
            com.tencent.mars.xlog.Log.i("ShoppingPanelHeaderGuideHolder", sb7.toString());
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(viewGroup.getContext());
            weImageView.setIconColor(0);
            weImageView.setColorFilter(0);
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(zArr[2] ? yvVar.f35708e : "", com.tencent.mm.plugin.finder.storage.y90.f128355e))).c(weImageView);
            weImageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i65.a.b(viewGroup.getContext(), yvVar.f35710g), i65.a.b(viewGroup.getContext(), yvVar.f35709f)));
            textView = weImageView;
        }
        if (textView == null) {
            return null;
        }
        if (yvVar.f35715o == 3) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(i65.a.b(viewGroup.getContext(), yvVar.f35714n));
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(i65.a.b(viewGroup.getContext(), yvVar.f35714n));
            }
        }
        return textView;
    }

    public final void b() {
        bw5.zv zvVar = this.f430908g;
        if (zvVar != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l lVar = new jz5.l("guide_bar_id", pm0.v.u(zvVar.f36190g));
            jz5.l lVar2 = new jz5.l("extra_report_json", zvVar.f36193m[5] ? zvVar.f36191h : "");
            gk2.e eVar = this.f430903b;
            ((cy1.a) rVar).Bj("ec_shelf_guide_bar", "view_exp", kz5.c1.k(lVar, lVar2, new jz5.l("live_id", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0))), new jz5.l("feed_id", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f328983m)), new jz5.l("finder_username", ((mm2.c1) eVar.a(mm2.c1.class)).f328852o)), 12, false);
        }
    }
}
