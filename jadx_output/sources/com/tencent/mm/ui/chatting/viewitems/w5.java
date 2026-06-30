package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class w5 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f205898b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f205899c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f205900d;

    /* renamed from: e, reason: collision with root package name */
    public int f205901e;

    /* renamed from: f, reason: collision with root package name */
    public int f205902f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f205903g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f205904h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f205905i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f205906j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f205907k;

    public final com.tencent.mm.ui.chatting.viewitems.w5 a(android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.create(view);
        this.clickArea = this.convertView.findViewById(com.tencent.mm.R.id.bkg);
        com.tencent.mm.view.StretchFrameLayout stretchFrameLayout = (com.tencent.mm.view.StretchFrameLayout) view.findViewById(com.tencent.mm.R.id.f483651sq4);
        if (stretchFrameLayout != null) {
            stretchFrameLayout.setLayoutConfig(new ym5.a6(5.0d, 0.0d, 3.5d, 0.0d, 0, 26, null));
        }
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f205898b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.sez);
        this.f205899c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.set);
        this.f205900d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.sev);
        this.f205903g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.sqv);
        this.f205904h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.sqw);
        this.f205905i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.squ);
        this.f205906j = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.sqx);
        android.view.ViewStub viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.v_3);
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.m wi6 = ((q31.t) ((q31.r) c17)).wi();
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f205907k = ((ko.a) wi6).b(context);
        kotlin.jvm.internal.o.d(viewStub);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f205907k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        if (mvvmView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        } else {
            try {
                android.view.ViewParent parent = viewStub.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                int indexOfChild = viewGroup != null ? viewGroup.indexOfChild(viewStub) : -1;
                if (indexOfChild >= 0) {
                    if (viewGroup != null) {
                        viewGroup.removeViewInLayout(viewStub);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                    if (layoutParams != null) {
                        if (viewGroup != null) {
                            viewGroup.addView(mvvmView, indexOfChild, layoutParams);
                        }
                    } else if (viewGroup != null) {
                        viewGroup.addView(mvvmView, indexOfChild);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("DSLComponents", "inflateWithView exp=" + e17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        }
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f205907k;
        if (mvvmView2 != null) {
            a11.b bVar = new a11.b();
            bVar.f500d = false;
            bVar.f501e = "礼物";
            bVar.f502f = view.getContext().getColor(com.tencent.mm.R.color.BW_F_Alpha_0_8);
            mvvmView2.setViewModel(bVar);
        }
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f205902f = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479568k);
        this.f205901e = (int) (i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479568k) * 3.0f);
        return this;
    }
}
