package com.tencent.mm.plugin.sns.lucky.view;

/* loaded from: classes4.dex */
public class SnsDetailLuckyHeader extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f164029d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f164030e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f164031f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f164032g;

    public SnsDetailLuckyHeader(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f164029d = null;
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bvc, this);
        this.f164029d = inflate.findViewById(com.tencent.mm.R.id.f482876qi);
        this.f164030e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482855pw);
        this.f164031f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f482856px);
        this.f164032g = getLinearSeparator();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    public void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        java.lang.String str;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
        r45.da6 da6Var = e17.SnsRedEnvelops;
        if (da6Var != null) {
            java.util.LinkedList linkedList = da6Var.f372275e;
            if (linkedList.size() != 0) {
                setVisibility(0);
                this.f164030e.setText(getContext().getString(com.tencent.mm.R.string.jcn, java.lang.Integer.valueOf(e17.SnsRedEnvelops.f372274d), com.tencent.mm.sdk.platformtools.t8.t((ha4.k.e(snsInfo, e17) * 1.0d) / 100.0d)));
                this.f164029d.setTag(snsInfo);
                this.f164029d.setOnClickListener(iVar.f169821x);
                boolean isEmpty = linkedList.isEmpty();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                com.tencent.mm.sdk.platformtools.j.d(getContext(), 32.0f);
                com.tencent.mm.sdk.platformtools.j.d(getContext(), 6.0f);
                com.tencent.mm.sdk.platformtools.j.d(getContext(), 10.0f);
                com.tencent.mm.sdk.platformtools.j.d(getContext(), 17.0f);
                int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq9);
                int f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq8);
                int f19 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq7);
                int f27 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq6);
                int f28 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq_);
                int f29 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aqa);
                if (this.f164031f == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    str = "setContent";
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("guessWidth", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    android.view.Display defaultDisplay = ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
                    defaultDisplay.getRealMetrics(new android.util.DisplayMetrics());
                    int rotation = defaultDisplay.getRotation();
                    str = "setContent";
                    float min = ((rotation == 0 || rotation == 2) ? java.lang.Math.min(r8.widthPixels, r8.heightPixels) : java.lang.Math.max(r8.widthPixels, r8.heightPixels)) - (getResources().getDimension(com.tencent.mm.R.dimen.i_) * 2.0f);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("guessWidth", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    if (linkedList.size() <= 0) {
                        if (this.f164031f.getParent() != null) {
                            i17 = 8;
                            this.f164031f.setVisibility(8);
                        } else {
                            i17 = 8;
                        }
                        this.f164031f.removeAllViews();
                        this.f164031f.setVisibility(i17);
                        this.f164031f.setVisibility(i17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    } else {
                        this.f164031f.getParent();
                        this.f164031f.removeAllViews();
                        this.f164031f.setVisibility(0);
                        this.f164031f.setPadding(0, f17, 0, f18 - f28);
                        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                        imageView.setImageResource(com.tencent.mm.R.raw.friendactivity_luckymoney_icon);
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(f19, f19);
                        layoutParams.leftMargin = f27;
                        layoutParams.rightMargin = f27;
                        layoutParams.topMargin = (f29 - f19) / 2;
                        layoutParams.gravity = 48;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setClickable(false);
                        imageView.setFocusable(false);
                        this.f164031f.addView(imageView);
                        float f37 = min - (f19 + (f27 * 2));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateLikeIconRightMargin", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                        int a17 = i65.a.a(getContext(), 4.0f);
                        int i18 = f29 * 2;
                        int a18 = i65.a.a(getContext(), 4.0f);
                        for (float f38 = 4.0f; f38 <= 8.0f; f38 += 0.25f) {
                            int a19 = i65.a.a(getContext(), f38);
                            int i19 = ((int) (f37 - a18)) % (f29 + a19);
                            int i27 = i19 >= f29 ? i19 - f29 : i19 + a19;
                            if (i27 < i18) {
                                a17 = a19;
                                i18 = i27;
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateLikeIconRightMargin", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                        float f39 = f29 + a17;
                        int i28 = (int) (f37 / f39);
                        if (((int) (f37 % f39)) > f29) {
                            i28++;
                        }
                        com.tencent.mm.plugin.sns.ui.x0 x0Var = new com.tencent.mm.plugin.sns.ui.x0(getContext());
                        x0Var.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
                        x0Var.setLineMaxCounte(i28);
                        for (int i29 = 0; i29 < linkedList.size(); i29++) {
                            r45.b96 b96Var = (r45.b96) linkedList.get(i29);
                            android.widget.ImageView touchImageView = new com.tencent.mm.plugin.sns.ui.TouchImageView(getContext());
                            touchImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                            touchImageView.setImageResource(com.tencent.mm.R.drawable.ady);
                            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(f29, f29);
                            layoutParams2.setMargins(0, 0, a17, f28);
                            touchImageView.setLayoutParams(layoutParams2);
                            touchImageView.setTag(b96Var.f370639d);
                            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(touchImageView, b96Var.f370639d, pc4.d.f353410a.l());
                            touchImageView.setOnClickListener(iVar.f169810m);
                            x0Var.addView(touchImageView);
                        }
                        this.f164031f.addView(x0Var);
                        this.f164032g.setVisibility(isEmpty ? 8 : 0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                return;
            }
        }
        setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    public android.widget.LinearLayout getLinearSeparator() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLinearSeparator", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, com.tencent.mm.sdk.platformtools.j.d(getContext(), 1.0f) / 2);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f482118d93);
        linearLayout.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLinearSeparator", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        return linearLayout;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        super.setVisibility(i17);
        android.view.View view = this.f164029d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/lucky/view/SnsDetailLuckyHeader", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/lucky/view/SnsDetailLuckyHeader", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    public SnsDetailLuckyHeader(android.content.Context context) {
        super(context);
        this.f164029d = null;
        a();
    }

    public SnsDetailLuckyHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f164029d = null;
        a();
    }
}
