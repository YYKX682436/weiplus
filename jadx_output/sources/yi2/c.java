package yi2;

/* loaded from: classes3.dex */
public final class c extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f462499h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462500i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.b f462501m;

    /* renamed from: n, reason: collision with root package name */
    public int f462502n;

    /* renamed from: o, reason: collision with root package name */
    public int f462503o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, yz5.l onPkMicSettingChange) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onPkMicSettingChange, "onPkMicSettingChange");
        this.f462499h = onPkMicSettingChange;
        this.f462502n = -1;
        android.view.ViewGroup.LayoutParams layoutParams = this.f118384g.f444837d.getLayoutParams();
        if (layoutParams != null) {
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z17) {
                i18 = i18 >= i17 ? i18 : i17;
            }
            layoutParams.height = i18 / 3;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return g();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        android.widget.TextView f17 = f();
        f17.setEnabled(true);
        return f17;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.e8c;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.nob);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveAnchorMicSettingsPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Mic setting option clicked: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMicSettingsPanelWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.b bVar = this.f462501m;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = bVar.f261942c.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMicSettingsPanelWidget", "Selected ALL mic mode");
            y(0);
        } else {
            fg2.b bVar2 = this.f462501m;
            if (bVar2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = bVar2.f261944e.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorMicSettingsPanelWidget", "Selected FOLLOWED_ANCHORS mic mode");
                y(1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveAnchorMicSettingsPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.sde;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.sde);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.sdf;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.sdf);
            if (constraintLayout != null) {
                i17 = com.tencent.mm.R.id.sdg;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.sdg);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.sdh;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.sdh);
                    if (weImageView2 != null) {
                        i17 = com.tencent.mm.R.id.sdi;
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.sdi);
                        if (constraintLayout2 != null) {
                            this.f462501m = new fg2.b((android.widget.LinearLayout) rootView, weImageView, constraintLayout, textView, weImageView2, constraintLayout2);
                            constraintLayout.setOnClickListener(this);
                            fg2.b bVar = this.f462501m;
                            if (bVar != null) {
                                bVar.f261944e.setOnClickListener(this);
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

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        a();
        int i17 = this.f462502n;
        if (i17 != this.f462503o) {
            fj2.s sVar = fj2.s.f263183a;
            if (i17 == 0) {
                sVar.d(ml2.q2.X, this.f462500i, null);
            } else if (i17 == 1) {
                sVar.d(ml2.q2.Y, this.f462500i, null);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMicSettingsPanelWidget", "Confirm button clicked, current: " + this.f462502n + ", old: " + this.f462503o);
        this.f462499h.invoke(java.lang.Integer.valueOf(this.f462502n));
    }

    public final void y(int i17) {
        if (this.f462502n == i17) {
            return;
        }
        this.f462502n = i17;
        if (i17 == 0) {
            fg2.b bVar = this.f462501m;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            bVar.f261941b.setVisibility(0);
            fg2.b bVar2 = this.f462501m;
            if (bVar2 != null) {
                bVar2.f261943d.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        fg2.b bVar3 = this.f462501m;
        if (bVar3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        bVar3.f261941b.setVisibility(8);
        fg2.b bVar4 = this.f462501m;
        if (bVar4 != null) {
            bVar4.f261943d.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }
}
