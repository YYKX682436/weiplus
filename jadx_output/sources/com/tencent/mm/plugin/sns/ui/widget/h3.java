package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class h3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.h3 f171151e = new com.tencent.mm.plugin.sns.ui.widget.h3();

    /* renamed from: f, reason: collision with root package name */
    public static final int f171152f = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479575r);

    /* renamed from: a, reason: collision with root package name */
    public int f171153a = 0;

    /* renamed from: b, reason: collision with root package name */
    public nm0.a f171154b = null;

    /* renamed from: c, reason: collision with root package name */
    public nm0.a f171155c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f171156d;

    public static com.tencent.mm.plugin.sns.ui.widget.h3 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.widget.h3 h3Var = f171151e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return h3Var;
    }

    public static void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        a();
        com.tencent.mm.plugin.sns.ui.widget.h3 h3Var = f171151e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetImp", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f171154b = null;
        h3Var.f171155c = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetImp", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
    }

    public float b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        float q17 = (int) (f171152f * i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return q17;
    }

    public nm0.a c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        int q17 = (int) (f171152f * i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a));
        nm0.a aVar = this.f171154b;
        if (aVar == null || ((int) aVar.f338462l) != q17) {
            if (android.os.Build.VERSION.SDK_INT == 28) {
                nm0.b a17 = nm0.b.a();
                a17.f338466a.f338457g = 8388627;
                int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c);
                nm0.a aVar2 = a17.f338466a;
                aVar2.f338463m = color;
                aVar2.f338462l = q17;
                aVar2.f338465o = 1;
                this.f171154b = aVar2;
            } else {
                nm0.b a18 = nm0.b.a();
                a18.f338466a.f338457g = 8388627;
                int color2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c);
                nm0.a aVar3 = a18.f338466a;
                aVar3.f338463m = color2;
                aVar3.f338462l = q17;
                this.f171154b = aVar3;
            }
        }
        nm0.a aVar4 = this.f171154b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return aVar4;
    }

    public nm0.a d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewShortConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        int q17 = (int) (f171152f * i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a));
        if (android.os.Build.VERSION.SDK_INT == 28) {
            nm0.b a17 = nm0.b.a();
            a17.f338466a.f338457g = 8388627;
            int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c);
            nm0.a aVar = a17.f338466a;
            aVar.f338463m = color;
            aVar.f338462l = q17;
            aVar.f338451a = 6;
            aVar.f338465o = 1;
            this.f171155c = aVar;
        } else {
            nm0.b a18 = nm0.b.a();
            a18.f338466a.f338457g = 8388627;
            int color2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c);
            nm0.a aVar2 = a18.f338466a;
            aVar2.f338463m = color2;
            aVar2.f338462l = q17;
            aVar2.f338451a = 6;
            this.f171155c = aVar2;
        }
        nm0.a aVar3 = this.f171155c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewShortConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return aVar3;
    }

    public int e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        if (this.f171153a <= 0) {
            int i17 = com.tencent.mm.plugin.sns.model.l4.rj().x;
            int dimension = (int) (com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.i_) + com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.i_));
            int dimension2 = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.aau);
            int dimension3 = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.i_);
            int i18 = (i17 - dimension2) - dimension;
            this.f171153a = i18;
            if (i18 <= 0) {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                i17 = displayMetrics.widthPixels;
                this.f171153a = (i17 - dimension2) - dimension;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostDescPreloadTextViewConfig", "try again, screenWidth " + i17 + " textViewWidth " + this.f171153a + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
            }
            ca4.e1 e1Var = ca4.f1.f39897a;
            android.app.Activity activity = this.f171156d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTimelineUIContext", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            boolean z17 = activity instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTimelineUIContext", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (z17) {
                int s17 = e1Var.s(this.f171156d);
                if (s17 <= 0) {
                    s17 = this.f171153a;
                }
                this.f171153a = s17;
            } else if (com.tencent.mm.ui.bk.v0()) {
                if (fp.h.c(30) && com.tencent.mm.ui.ee.a(com.tencent.mm.sdk.platformtools.x2.f193071a) && !com.tencent.mm.ui.bk.Y()) {
                    this.f171153a = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aav);
                } else {
                    android.app.Activity activity2 = this.f171156d;
                    if (activity2 != null && ((com.tencent.mm.ui.bk.N(activity2.getTaskId()) || (com.tencent.mm.ui.bk.O(this.f171156d.getContentResolver()) && !this.f171156d.isInMultiWindowMode())) && !com.tencent.mm.ui.ee.b(this.f171156d.getTaskId()))) {
                        this.f171153a = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aav);
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finally, screenWidth ");
            sb6.append(i17);
            sb6.append(" textViewWidth ");
            sb6.append(this.f171153a);
            sb6.append(" padding: ");
            sb6.append(dimension);
            sb6.append(" marginLeft: ");
            sb6.append(dimension2);
            sb6.append(" thisviewPadding: ");
            sb6.append(dimension3);
            sb6.append("activity: ");
            sb6.append(this.f171156d == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostDescPreloadTextViewConfig", sb6.toString());
        }
        int i19 = this.f171153a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return i19;
    }
}
