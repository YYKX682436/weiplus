package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public ln2.f f120812d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f120813e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f120814f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f120815g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f120816h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f120817i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f120818m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f120819n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f120820o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120821p;

    public y(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var, ln2.f fVar) {
        this.f120821p = t0Var;
        this.f120812d = fVar;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(t0Var.f118381d);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = t0Var.A;
        if (constraintLayout == null) {
            kotlin.jvm.internal.o.o("giftPanelLayout");
            throw null;
        }
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.anm, (android.view.ViewGroup) constraintLayout, false);
        this.f120813e = inflate;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f0s);
        this.f120814f = relativeLayout;
        this.f120815g = (androidx.constraintlayout.widget.ConstraintLayout) inflate.findViewById(com.tencent.mm.R.id.f0v);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f0t);
        this.f120816h = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f0o);
        this.f120817i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484648f11);
        android.widget.TextView giftPrice = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f2w);
        this.f120818m = giftPrice;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484652f15);
        this.f120819n = textView;
        this.f120820o = inflate.findViewById(com.tencent.mm.R.id.f3g);
        relativeLayout.setOnClickListener(this);
        weImageView.setOnClickListener(this);
        textView.setOnClickListener(this);
        inflate.setId(inflate.hashCode());
        kotlin.jvm.internal.o.f(giftPrice, "giftPrice");
        hc2.o.a(giftPrice, false);
        a(this.f120812d);
    }

    public final void a(ln2.f fVar) {
        r45.kv1 kv1Var;
        this.f120812d = fVar;
        android.view.View view = this.f120813e;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f120815g;
        android.widget.RelativeLayout relativeLayout = this.f120814f;
        if (fVar == null) {
            relativeLayout.setVisibility(0);
            constraintLayout.setVisibility(8);
            view.setTag("NULL_ITEM");
        } else {
            relativeLayout.setVisibility(8);
            constraintLayout.setVisibility(0);
            view.setTag(fVar.f319890a.getString(0));
        }
        if (fVar != null) {
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            r45.kv1 kv1Var2 = fVar.f319890a;
            wo0.c a17 = d1Var.a(new mn2.q3(kv1Var2.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f));
            android.widget.ImageView giftView = this.f120816h;
            kotlin.jvm.internal.o.f(giftView, "giftView");
            a17.c(giftView);
            this.f120817i.setText(kv1Var2.getString(8));
            this.f120818m.setText(java.lang.String.valueOf((int) kv1Var2.getFloat(9)));
            this.f120819n.setText(this.f120821p.f118381d.getResources().getString(com.tencent.mm.R.string.ekr, java.lang.Long.valueOf(fVar.f319891b)));
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.view.View tagView = this.f120820o;
        kotlin.jvm.internal.o.f(tagView, "tagView");
        r4Var.P2(tagView, (fVar == null || (kv1Var = fVar.f319890a) == null) ? null : ce2.i.U1.b(kv1Var));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        r45.kv1 kv1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$GiftItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120821p;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f0s) {
            com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = (com.tencent.mm.plugin.finder.live.plugin.wn0) t0Var.f120778o;
            wn0Var.z1().a();
            ((mm2.s2) wn0Var.P0(mm2.s2.class)).f329404f.postValue(new mm2.q2(true, 1));
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f0t) {
            ((com.tencent.mm.plugin.finder.live.wish.widget.a0) t0Var.f120789z).invoke(this.f120812d);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484652f15) {
            t0Var.a();
            jz5.g gVar = t0Var.f120780q;
            com.tencent.mm.plugin.finder.live.wish.widget.a1 a1Var = (com.tencent.mm.plugin.finder.live.wish.widget.a1) ((jz5.n) gVar).getValue();
            ln2.f fVar = this.f120812d;
            if (fVar == null || (kv1Var = fVar.f319890a) == null || (str = kv1Var.getString(0)) == null) {
                str = "";
            }
            ln2.f fVar2 = this.f120812d;
            long j17 = fVar2 != null ? fVar2.f319891b : 0L;
            a1Var.getClass();
            a1Var.f120687m = str;
            a1Var.f120688n = j17;
            com.tencent.mm.ui.widget.MMEditText mMEditText = a1Var.f120686i;
            if (mMEditText == null) {
                kotlin.jvm.internal.o.o("editText");
                throw null;
            }
            mMEditText.setText("");
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = a1Var.f120686i;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("editText");
                throw null;
            }
            mMEditText2.setSelection(0);
            com.tencent.mars.xlog.Log.i("WishKeyBoardInputWidget", "bindCurrentGift: ".concat(str));
            ((com.tencent.mm.plugin.finder.live.wish.widget.a1) ((jz5.n) gVar).getValue()).w();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$GiftItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
