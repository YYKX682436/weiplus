package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class x0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f171474d;

    /* renamed from: e, reason: collision with root package name */
    public int f171475e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f171476f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f171477g;

    public x0(android.content.Context context) {
        super(context);
        this.f171474d = 0;
        this.f171475e = 6;
        this.f171476f = context;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.AutoLayout");
        if (this.f171474d % this.f171475e == 0) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.f171476f);
            this.f171477g = linearLayout;
            linearLayout.setOrientation(0);
            this.f171477g.addView(view);
            super.addView(this.f171477g);
        } else {
            this.f171477g.addView(view);
        }
        this.f171474d++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.AutoLayout");
    }

    public void setLineMaxCounte(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLineMaxCounte", "com.tencent.mm.plugin.sns.ui.AutoLayout");
        if (i17 > 0) {
            this.f171475e = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLineMaxCounte", "com.tencent.mm.plugin.sns.ui.AutoLayout");
    }
}
