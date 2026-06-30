package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class s5 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a {

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager f165486s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5 f165487t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView f165488u;

    /* renamed from: v, reason: collision with root package name */
    public int f165489v;

    /* renamed from: w, reason: collision with root package name */
    public int f165490w;

    /* renamed from: x, reason: collision with root package name */
    public ab4.r0 f165491x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f165492y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f165493z;

    static {
        new java.util.WeakHashMap();
    }

    public s5(android.content.Context context, ab4.r0 r0Var, android.view.ViewGroup viewGroup) {
        super(context, r0Var, viewGroup);
        this.f165489v = 1;
        this.f165490w = 0;
        this.f165492y = false;
        this.f165493z = true;
        this.f165488u = new com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView(context, null);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.B();
        this.f165486s.setCurrentItem(this.f165489v, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        if (super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void F(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.F(map);
        try {
            if (map.containsKey(io.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY)) {
                this.f165489v = ((java.lang.Integer) map.get(io.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY)).intValue() + 1;
            }
            com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager = this.f165486s;
            if (autoPlayViewPager != null) {
                autoPlayViewPager.setCurrentItem(this.f165489v, false);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageGroupListComponent", "when setOriginState, but viewPager is null");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageGroupListComponent", e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.J();
        com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager = this.f165486s;
        if (autoPlayViewPager != null) {
            autoPlayViewPager.startAutoPlay();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f165487t.d(this.f165490w);
        this.f165487t.c(this.f165490w);
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f165487t.c(-1);
        super.M();
        com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager = this.f165486s;
        if (autoPlayViewPager != null) {
            autoPlayViewPager.pauseAutoPlay();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a
    public java.util.List O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5 r5Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5) this.f165486s.getAdapter();
        r5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = r5Var.f165462p.values().iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q5) it.next()).f165428a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        arrayList.addAll(arrayList2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a
    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f165487t.c(this.f165490w);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    public final ab4.r0 R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        ab4.r0 r0Var = (ab4.r0) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return r0Var;
    }

    public final ab4.r0 S(ab4.r0 r0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        ab4.r0 r0Var2 = new ab4.r0();
        this.f165491x = r0Var2;
        if (r0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
            return r0Var2;
        }
        r0Var2.f2817d = r0Var.f2817d;
        r0Var2.f2818e = r0Var.f2818e;
        r0Var2.f2819f = r0Var.f2819f;
        r0Var2.f2820g = r0Var.f2820g;
        r0Var2.f2821h = r0Var.f2821h;
        r0Var2.f2822i = r0Var.f2822i;
        r0Var2.f2823m = r0Var.f2823m;
        r0Var2.f2824n = r0Var.f2824n;
        r0Var2.f2825o = r0Var.f2825o;
        r0Var2.f2826p = r0Var.f2826p;
        r0Var2.f2827q = r0Var.f2827q;
        r0Var2.f2828r = r0Var.f2828r;
        r0Var2.f2829s = r0Var.f2829s;
        r0Var2.f2830t = r0Var.f2830t;
        r0Var2.f2831u = r0Var.f2831u;
        r0Var2.f2832v = r0Var.f2832v;
        r0Var2.f2833w = r0Var.f2833w;
        r0Var2.f2834x = r0Var.f2834x;
        r0Var2.G = r0Var.G;
        r0Var2.H = r0Var.H;
        java.util.LinkedList linkedList = r0Var2.F;
        java.util.LinkedList linkedList2 = r0Var.F;
        linkedList.add((ab4.v) linkedList2.getLast());
        this.f165491x.F.addAll(linkedList2);
        this.f165491x.F.add((ab4.v) linkedList2.getFirst());
        if (linkedList2.size() > 1) {
            this.f165491x.I = r0Var.I;
            this.f165493z = true;
        } else {
            this.f165493z = false;
            this.f165491x.I = false;
        }
        ab4.r0 r0Var3 = this.f165491x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return r0Var3;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        android.view.View view = this.f165056n;
        this.f165486s = (com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager) view.findViewById(com.tencent.mm.R.id.f486997n50);
        this.f165488u = (com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView) view.findViewById(com.tencent.mm.R.id.n4k);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5 r5Var;
        float f17;
        float f18;
        int i17;
        float f19;
        int measuredHeight;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        int i18 = (this.f165058p - ((int) R().f2821h)) - ((int) R().f2822i);
        android.content.Context context = this.f165049d;
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        S(R());
        if (this.f165486s.getAdapter() == null) {
            r5Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5(this.f165049d, layoutInflater, this.f165491x, this.f165051f, this.f165486s);
            this.f165486s.setOnPageChangeListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k5(this, r5Var));
            this.f165486s.setAdapter(r5Var);
        } else {
            r5Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5) this.f165486s.getAdapter();
            ab4.r0 S = S(R());
            r5Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            r5Var.f165455f = S;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5 r5Var2 = r5Var;
        int i19 = 0;
        if (this.f165493z) {
            this.f165492y = R().I;
            this.f165488u.setVisibility(0);
            this.f165486s.enableTouchScroll(true);
        } else {
            this.f165492y = false;
            this.f165488u.setVisibility(8);
            this.f165486s.enableTouchScroll(false);
        }
        com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView viewPagerControlView = this.f165488u;
        int size = this.f165491x.F.size();
        boolean z17 = this.f165492y;
        viewPagerControlView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        viewPagerControlView.f170953e = size - 2;
        viewPagerControlView.f170955g = ((viewPagerControlView.f170954f - (((r9 - 1) * 2) * viewPagerControlView.f170957i)) - viewPagerControlView.f170956h) / 2.0f;
        viewPagerControlView.A = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f165486s.bindViewPagerControlView(this.f165488u, this.f165492y);
        boolean z18 = R().H;
        int i27 = this.f165059q;
        if (z18) {
            this.f165486s.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i18, i27));
        } else if (R().F.size() > 0) {
            ab4.v vVar = (ab4.v) R().F.get(0);
            new android.widget.LinearLayout(context).setOrientation(1);
            java.util.Iterator it = vVar.F.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                ab4.d0 d0Var = (ab4.d0) it.next();
                int i29 = (int) (i28 + d0Var.f2819f);
                float f27 = 0.0f;
                if (d0Var instanceof ab4.m0) {
                    ab4.m0 m0Var = (ab4.m0) d0Var;
                    android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f489490cq0, (android.view.ViewGroup) null);
                    inflate.setBackgroundColor(this.f165051f);
                    try {
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n4f);
                        textView.setText(m0Var.F);
                        float f28 = m0Var.G;
                        if (f28 > 0.0f) {
                            textView.setTextSize(i19, f28);
                        }
                        float f29 = m0Var.P;
                        if (f29 > 0.0f) {
                            textView.setLineSpacing(0.0f, f29 + 1.0f);
                        }
                        if (m0Var.f2856J) {
                            textView.getPaint().setFakeBoldText(true);
                        }
                        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) ((i18 - m0Var.f2821h) - m0Var.f2822i), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(i19, i19));
                        i29 = i29 + textView.getPaddingTop() + textView.getMeasuredHeight();
                        i17 = textView.getPaddingBottom();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageGroupListComponent", "txtComp measure exp=" + e17.toString());
                    }
                } else {
                    if (d0Var instanceof ab4.u) {
                        android.widget.Button button = (android.widget.Button) layoutInflater.inflate(com.tencent.mm.R.layout.cpc, (android.view.ViewGroup) null).findViewById(com.tencent.mm.R.id.n4n);
                        button.setText(((ab4.u) d0Var).F);
                        button.measure(android.view.View.MeasureSpec.makeMeasureSpec(i19, i19), android.view.View.MeasureSpec.makeMeasureSpec(i19, i19));
                        int paddingTop = i29 + button.getPaddingTop();
                        float f37 = d0Var.f2824n;
                        if (f37 <= 0.0f || ((int) f37) == Integer.MAX_VALUE) {
                            f37 = d0Var.f2830t;
                            if (f37 <= 0.0f || ((int) f37) == Integer.MAX_VALUE) {
                                measuredHeight = button.getMeasuredHeight() + paddingTop;
                                i29 = measuredHeight + button.getPaddingBottom();
                            }
                        }
                        measuredHeight = (int) (paddingTop + f37);
                        i29 = measuredHeight + button.getPaddingBottom();
                    } else {
                        boolean z19 = d0Var instanceof ab4.x;
                        if (z19) {
                            float f38 = d0Var.f2820g;
                            if (z19) {
                                ab4.x xVar = (ab4.x) d0Var;
                                f27 = xVar.f2830t;
                                f19 = xVar.f2829s;
                            } else {
                                f19 = 0.0f;
                            }
                            i29 = (int) (((int) (((((int) f27) == 0 || ((int) f19) == 0) ? i29 + i27 : (int) (i29 + ((i18 * f27) / f19))) + r11)) + f38);
                        } else {
                            if (!(d0Var instanceof ab4.w)) {
                                if (d0Var instanceof ab4.z) {
                                    ab4.z zVar = (ab4.z) d0Var;
                                    if (zVar.K != 1) {
                                        float f39 = zVar.f2829s;
                                        if (((int) f39) > 0) {
                                            i17 = (((int) zVar.f2830t) * i18) / ((int) f39);
                                        } else {
                                            f17 = i29;
                                            f18 = zVar.f2830t;
                                            i29 = (int) (f17 + f18);
                                        }
                                    }
                                } else if (d0Var instanceof ab4.u0) {
                                    ab4.u0 u0Var = (ab4.u0) d0Var;
                                    if (u0Var.G == 1) {
                                        float f47 = u0Var.f2829s;
                                        if (((int) f47) > 0) {
                                            i17 = (((int) u0Var.f2830t) * i18) / ((int) f47);
                                        } else {
                                            f17 = i29;
                                            f18 = u0Var.f2830t;
                                            i29 = (int) (f17 + f18);
                                        }
                                    }
                                } else if (!(d0Var instanceof ab4.s0)) {
                                }
                            }
                            i29 += i27;
                        }
                    }
                    i28 = (int) (i29 + d0Var.f2820g);
                    i19 = 0;
                }
                i29 += i17;
                i28 = (int) (i29 + d0Var.f2820g);
                i19 = 0;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i18, i28);
            layoutParams.leftMargin = (int) R().f2821h;
            layoutParams.rightMargin = (int) R().f2822i;
            this.f165486s.setLayoutParams(layoutParams);
        }
        this.f165487t = r5Var2;
        r5Var2.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return com.tencent.mm.R.layout.f489492cq2;
    }
}
