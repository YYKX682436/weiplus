package dc4;

/* loaded from: classes4.dex */
public class v0 extends dc4.v {
    public com.tencent.mm.ui.widget.MMPinProgressBtn A;
    public com.tencent.mm.plugin.sns.storage.p B;
    public jb4.v C;
    public final i64.b1 F;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f228840p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f228841q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f228842r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f228843s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f228844t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f228845u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f228846v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f228847w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView f228848x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f228849y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f228850z;
    public java.lang.String D = null;
    public int E = 0;
    public final jb4.u G = new dc4.r0(this);
    public final jb4.c0 H = new dc4.u0(this);

    public v0(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var) {
        this.f228831d = timeLineObject;
        this.f228832e = snsInfo;
        this.f228838n = iVar;
        this.F = b1Var;
    }

    public static /* synthetic */ android.widget.ImageView l(dc4.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        android.widget.ImageView imageView = v0Var.f228849y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return imageView;
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.MMPinProgressBtn m(dc4.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = v0Var.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return mMPinProgressBtn;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.p n(dc4.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.tencent.mm.plugin.sns.storage.p pVar = v0Var.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return pVar;
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        this.f228833f = view;
        this.f228834g = view2;
        this.f228840p = view.getContext();
        this.f228850z = view.findViewById(com.tencent.mm.R.id.f22new);
        this.f228841q = view.findViewById(com.tencent.mm.R.id.ofu);
        this.f228842r = view.findViewById(com.tencent.mm.R.id.aug);
        this.f228843s = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ofw);
        this.f228844t = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ofv);
        this.f228845u = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.aui);
        this.f228846v = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.auh);
        this.f228847w = view.findViewById(com.tencent.mm.R.id.aut);
        this.f228849y = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485861jc5);
        this.f228848x = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView) view.findViewById(com.tencent.mm.R.id.nex);
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = (com.tencent.mm.ui.widget.MMPinProgressBtn) view.findViewById(com.tencent.mm.R.id.lbi);
        this.A = mMPinProgressBtn;
        mMPinProgressBtn.setMax(50);
        float I = ca4.m0.I(com.tencent.mm.R.dimen.a_q);
        float I2 = ca4.m0.I(com.tencent.mm.R.dimen.a_l);
        this.f228843s.setTextSize(0, I);
        this.f228844t.setTextSize(0, I2);
        this.f228845u.setTextSize(0, I);
        this.f228846v.setTextSize(0, I2);
        this.f228848x.i(1.8f, 30.0f, -2.0f);
        this.f228848x.setTouchSensitivity(0.45f);
        this.f228848x.setEventListener(this.H);
        this.f228848x.setTouchEnabled(true);
        this.f228848x.setSensorEnabled(false);
        this.f228848x.k();
        jb4.v vVar = new jb4.v();
        this.C = vVar;
        jb4.u uVar = this.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        vVar.f298852a = uVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "initView, hash=" + this.f228848x.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }

    @Override // dc4.v
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "refreshView, hash=" + this.f228848x.hashCode());
            com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.storage.l1.a(this.f228832e.getSnsId());
            this.f228832e = a17;
            android.view.ViewGroup.LayoutParams layoutParams = null;
            this.B = null;
            if (a17 != null && a17.getAdXml() != null) {
                this.B = this.f228832e.getAdXml().adSphereCardInfo;
            }
            android.view.View view = this.f228841q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f228843s.setVisibility(8);
            this.f228844t.setVisibility(8);
            android.view.View view2 = this.f228842r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f228845u.setVisibility(8);
            this.f228846v.setVisibility(8);
            android.view.View view3 = this.f228847w;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.B != null) {
                int y17 = ca4.m0.y("MicroMsg.SphereImageView.SphereCardAdDetailItem", this.f228840p, o(), this.f228839o);
                int i17 = this.B.f166089a;
                if (i17 == 0) {
                    layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
                    layoutParams.width = y17;
                    layoutParams.height = (int) (y17 * 0.75f);
                } else if (i17 == 1) {
                    layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
                    layoutParams.width = y17;
                    layoutParams.height = y17;
                }
                if (layoutParams != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = this.f228833f.getLayoutParams();
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                    this.f228833f.setLayoutParams(layoutParams2);
                    ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) this.f228833f).setRadius(i65.a.b(this.f228840p, 8));
                    android.view.ViewGroup.LayoutParams layoutParams3 = this.f228848x.getLayoutParams();
                    layoutParams3.width = layoutParams.width;
                    layoutParams3.height = layoutParams.height;
                    this.f228848x.setLayoutParams(layoutParams3);
                    android.view.ViewGroup.LayoutParams layoutParams4 = this.f228849y.getLayoutParams();
                    layoutParams4.width = layoutParams3.width;
                    layoutParams4.height = layoutParams3.height;
                    this.f228849y.setLayoutParams(layoutParams4);
                }
                int i18 = this.B.f166093e;
                if (i18 == 0) {
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb((int) (r0.f166092d * 2.55f), 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
                    gradientDrawable.setGradientType(0);
                    this.f228841q.setBackground(gradientDrawable);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B.f166090b) || !com.tencent.mm.sdk.platformtools.t8.K0(this.B.f166091c)) {
                        android.view.View view4 = this.f228841q;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view5 = this.f228842r;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B.f166090b)) {
                        this.f228843s.setVisibility(0);
                        this.f228843s.setText(com.tencent.mm.smiley.x1.Di().Ni(this.f228843s.getContext(), this.B.f166090b));
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B.f166091c)) {
                        this.f228844t.setVisibility(0);
                        this.f228844t.setText(com.tencent.mm.smiley.x1.Di().Ni(this.f228844t.getContext(), this.B.f166091c));
                    }
                } else if (i18 == 1) {
                    android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb((int) (r0.f166092d * 2.55f), 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
                    gradientDrawable2.setGradientType(0);
                    android.view.View view6 = this.f228841q;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f228842r.setBackground(gradientDrawable2);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B.f166090b) || !com.tencent.mm.sdk.platformtools.t8.K0(this.B.f166091c)) {
                        android.view.View view7 = this.f228842r;
                        zj0.a aVar = new zj0.a();
                        zj0.c.c(0, aVar);
                        yj0.a.d(view7, aVar.b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((java.lang.Integer) aVar.a(0)).intValue());
                        yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) this.f228847w.getLayoutParams();
                        layoutParams5.topMargin = i65.a.b(this.f228840p, 4);
                        this.f228847w.setLayoutParams(layoutParams5);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B.f166090b)) {
                        this.f228845u.setVisibility(0);
                        this.f228845u.setText(com.tencent.mm.smiley.x1.Di().Ni(this.f228845u.getContext(), this.B.f166090b));
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B.f166091c)) {
                        this.f228846v.setVisibility(0);
                        this.f228846v.setText(com.tencent.mm.smiley.x1.Di().Ni(this.f228846v.getContext(), this.B.f166091c));
                    }
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228832e;
                if (snsInfo != null && snsInfo.getAdInfo().isWeapp()) {
                    android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb((int) (this.B.f166092d * 2.55f), 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
                    gradientDrawable3.setGradientType(0);
                    android.view.View view8 = this.f228842r;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f228842r.setBackground(gradientDrawable3);
                    android.view.View view9 = this.f228847w;
                    zj0.a aVar2 = new zj0.a();
                    zj0.c.c(0, aVar2);
                    yj0.a.d(view9, aVar2.b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) aVar2.a(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f228848x.setVisibility(0);
                this.f228848x.setTag(this);
                this.f228848x.setOnClickListener(this.f228838n.T);
                java.lang.String str = this.D;
                if (str != null && str.equals(this.B.f166095g)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "invalid refreshView");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "loadImage");
                p();
                this.C.e(this.B.f166095g, this.f228848x.getLayoutParams().width, this.f228848x.getLayoutParams().height, "scene_timeline");
                this.D = this.B.f166095g;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "invalid spherecardinfo");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "refreshView, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }

    public final int o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        i64.b1 b1Var = this.F;
        if (b1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            return 1;
        }
        int i17 = b1Var.f289095j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return i17;
    }

    public void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMaskView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        try {
            this.f228849y.setVisibility(0);
            com.tencent.mm.plugin.sns.storage.p pVar = this.B;
            java.lang.String str = pVar.f166095g;
            java.lang.String str2 = pVar.f166096h;
            new jb4.t(str, str2, "scene_timeline", new dc4.q0(this, str, str2)).execute(new java.lang.Void[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "showMaskView exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMaskView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }
}
