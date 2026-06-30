package pi2;

/* loaded from: classes3.dex */
public final class t extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final qf2.q3 H;
    public final yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public fg2.l1 f354811J;
    public int K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, qf2.q3 controller, yz5.l back) {
        super(context, false, null, 0.0f, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(back, "back");
        this.H = controller;
        this.I = back;
        this.K = 10;
        this.L = 10;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.f488954ds4;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View E(zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f118183e).inflate(com.tencent.mm.R.layout.f488954ds4, (android.view.ViewGroup) z(), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getResources().getString(com.tencent.mm.R.string.mlo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.mhh;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.mhh);
        if (frameLayout != null) {
            i17 = com.tencent.mm.R.id.r2_;
            com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) x4.b.a(rootView, com.tencent.mm.R.id.r2_);
            if (weButton != null) {
                i17 = com.tencent.mm.R.id.f482710r34;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f482710r34);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.s28;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.s28);
                    if (frameLayout2 != null) {
                        i17 = com.tencent.mm.R.id.f487717sa1;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f487717sa1);
                        if (weImageView != null) {
                            this.f354811J = new fg2.l1((androidx.constraintlayout.widget.ConstraintLayout) rootView, frameLayout, weButton, textView, frameLayout2, weImageView);
                            frameLayout2.setOnClickListener(this);
                            fg2.l1 l1Var = this.f354811J;
                            if (l1Var == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            l1Var.f262129b.setOnClickListener(this);
                            fg2.l1 l1Var2 = this.f354811J;
                            if (l1Var2 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            android.widget.TextView addPriceText = l1Var2.f262131d;
                            kotlin.jvm.internal.o.f(addPriceText, "addPriceText");
                            com.tencent.mm.ui.fk.a(addPriceText);
                            fg2.l1 l1Var3 = this.f354811J;
                            if (l1Var3 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            android.widget.TextView addPriceText2 = l1Var3.f262131d;
                            kotlin.jvm.internal.o.f(addPriceText2, "addPriceText");
                            hc2.o.a(addPriceText2, false);
                            fg2.l1 l1Var4 = this.f354811J;
                            if (l1Var4 != null) {
                                l1Var4.f262130c.setOnClickListener(this);
                                return;
                            } else {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void T() {
        super.T();
        yz5.l lVar = this.I;
        if (lVar != null) {
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        r45.kf5 kf5Var;
        r45.kf5 kf5Var2;
        super.V(e0Var, z17, i17);
        qf2.q3 q3Var = this.H;
        r45.il4 il4Var = ((mm2.o4) q3Var.business(mm2.o4.class)).U;
        this.K = (il4Var == null || (kf5Var2 = il4Var.f377132g) == null) ? 10 : kf5Var2.f378661i;
        r45.il4 il4Var2 = ((mm2.o4) q3Var.business(mm2.o4.class)).U;
        this.L = (il4Var2 == null || (kf5Var = il4Var2.f377132g) == null) ? 0 : kf5Var.f378660h;
        e0();
        f0();
        fg2.l1 l1Var = this.f354811J;
        if (l1Var != null) {
            l1Var.f262130c.setEnabled(this.L > 0);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void e0() {
        r45.kf5 kf5Var;
        r45.il4 il4Var = ((mm2.o4) this.H.business(mm2.o4.class)).U;
        int i17 = (il4Var == null || (kf5Var = il4Var.f377132g) == null) ? 0 : kf5Var.f378660h;
        if (this.L > i17) {
            fg2.l1 l1Var = this.f354811J;
            if (l1Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            l1Var.f262132e.setAlpha(1.0f);
            fg2.l1 l1Var2 = this.f354811J;
            if (l1Var2 != null) {
                l1Var2.f262132e.setEnabled(true);
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        this.L = i17;
        fg2.l1 l1Var3 = this.f354811J;
        if (l1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        l1Var3.f262132e.setAlpha(0.5f);
        fg2.l1 l1Var4 = this.f354811J;
        if (l1Var4 != null) {
            l1Var4.f262132e.setEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void f0() {
        fg2.l1 l1Var = this.f354811J;
        if (l1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        l1Var.f262131d.setText(java.lang.String.valueOf(this.L));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicAddPricePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.l1 l1Var = this.f354811J;
        if (l1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = l1Var.f262132e.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            this.L -= this.K;
            e0();
            f0();
        } else {
            fg2.l1 l1Var2 = this.f354811J;
            if (l1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = l1Var2.f262129b.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                this.L += this.K;
                f0();
                e0();
            } else {
                fg2.l1 l1Var3 = this.f354811J;
                if (l1Var3 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                int id8 = l1Var3.f262130c.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    int i17 = this.L;
                    pi2.s sVar = new pi2.s(this);
                    qf2.q3 q3Var = this.H;
                    q3Var.getClass();
                    com.tencent.mm.plugin.finder.live.util.y.d(q3Var, null, null, new qf2.f3(q3Var, i17, sVar, null), 3, null);
                }
            }
        }
        fg2.l1 l1Var4 = this.f354811J;
        if (l1Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        l1Var4.f262130c.setEnabled(this.L > 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicAddPricePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View u() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118183e);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_arrow);
        weImageView.setRotation(180.0f);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 12), i65.a.b(weImageView.getContext(), 24)));
        return weImageView;
    }
}
