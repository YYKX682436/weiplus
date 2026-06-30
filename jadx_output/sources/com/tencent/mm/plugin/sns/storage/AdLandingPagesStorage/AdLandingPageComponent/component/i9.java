package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class i9 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: s */
    public android.widget.TextView f165269s;

    /* renamed from: t */
    public android.view.ViewGroup f165270t;

    /* renamed from: u */
    public wu5.b f165271u;

    /* renamed from: v */
    public volatile boolean f165272v;

    public i9(android.content.Context context, ab4.m0 m0Var, android.view.ViewGroup viewGroup) {
        super(context, m0Var, viewGroup);
        this.f165272v = false;
    }

    public static /* synthetic */ android.widget.TextView O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i9 i9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        android.widget.TextView textView = i9Var.f165269s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        return textView;
    }

    public static /* synthetic */ ab4.m0 P(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i9 i9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        ab4.m0 R = i9Var.R();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        return R;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ab4.d0 d0Var = this.f165050e;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f2821h, (int) d0Var.f2819f, (int) d0Var.f2822i, (int) d0Var.f2820g);
        }
        this.f165056n.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        super.L();
        wu5.b bVar = this.f165271u;
        if (bVar != null) {
            bVar.b();
        }
        this.f165272v = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        super.M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    public final ab4.m0 R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        ab4.m0 m0Var = (ab4.m0) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        return m0Var;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        android.view.View view = this.f165056n;
        view.setBackgroundColor(this.f165051f);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.n4e);
        this.f165270t = viewGroup;
        viewGroup.setBackgroundColor(this.f165051f);
        view.findViewById(com.tencent.mm.R.id.n4f).setBackgroundColor(this.f165051f);
        this.f165269s = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n4f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        if (R().G > 0.0f) {
            this.f165269s.setTextSize(0, R().G);
        }
        if (R().f2826p == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(R().F)) {
                java.lang.String replace = R().F.trim().replace("<icon", "<img");
                wu5.b bVar = this.f165271u;
                if (bVar != null) {
                    bVar.b();
                }
                this.f165271u = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h9(this, replace);
                ((ku5.t0) ku5.t0.f312615d).g(this.f165271u);
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(R().F)) {
            this.f165269s.setText(com.tencent.mm.smiley.x1.Di().Ri(R().F.trim(), true));
        }
        if (R().H == 0) {
            this.f165269s.setGravity(3);
        } else if (R().H == 1) {
            this.f165269s.setGravity(17);
        } else if (R().H == 2) {
            this.f165269s.setGravity(5);
        }
        int i17 = R().Q;
        if (i17 != 0) {
            try {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f165270t.getLayoutParams();
                this.f165269s.setIncludeFontPadding(false);
                if (i17 == 1) {
                    layoutParams.addRule(10, -1);
                } else if (i17 == 2) {
                    layoutParams.addRule(15, -1);
                } else if (i17 == 3) {
                    layoutParams.addRule(12, -1);
                }
                this.f165270t.setLayoutParams(layoutParams);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageTextComponent", "textVerticalAlignment is " + i17 + ", " + th6.toString());
            }
        }
        if (R().I == null || R().I.length() <= 0) {
            this.f165269s.setTextColor(android.graphics.Color.parseColor("#FFFFFF"));
        } else {
            try {
                this.f165269s.setTextColor(android.graphics.Color.parseColor(R().I));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageTextComponent", "parse the color is error : " + R().I);
            }
        }
        if (R().P > 0.0f) {
            this.f165269s.setLineSpacing(0.0f, R().P + 1.0f);
        }
        android.text.TextPaint paint = this.f165269s.getPaint();
        if (R().f2856J) {
            paint.setFakeBoldText(true);
        }
        if (R().K) {
            paint.setTextSkewX(-0.25f);
        }
        if (R().L) {
            paint.setUnderlineText(true);
        }
        if (R().M > 0) {
            this.f165269s.setMaxLines(R().M);
        }
        if (R().N == 1) {
            android.widget.TextView textView = this.f165269s;
            android.content.Context context = this.f165049d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWechatNumTypeFace", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            if (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.f165323a == null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.f165323a = android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatNum.ttf");
            }
            android.graphics.Typeface typeface = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.f165323a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWechatNumTypeFace", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            textView.setTypeface(typeface);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        return com.tencent.mm.R.layout.f489490cq0;
    }
}
