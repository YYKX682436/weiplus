package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class s2 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.s2 f171265d = new com.tencent.mm.plugin.sns.ui.widget.s2();

    /* renamed from: a, reason: collision with root package name */
    public nm0.a f171266a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f171267b = 0;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f171268c;

    public static com.tencent.mm.plugin.sns.ui.widget.s2 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.widget.s2 s2Var = f171265d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return s2Var;
    }

    public nm0.a b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int b17 = i65.a.b(context, (int) (i65.a.q(context) * 15.0f));
        nm0.a aVar = this.f171266a;
        if (aVar == null || ((int) aVar.f338462l) != b17) {
            nm0.b a17 = nm0.b.a();
            a17.f338466a.f338462l = b17;
            int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0_5);
            nm0.a aVar2 = a17.f338466a;
            aVar2.f338463m = color;
            aVar2.f338457g = 16;
            this.f171266a = aVar2;
        }
        nm0.a aVar3 = this.f171266a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return aVar3;
    }

    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        if (this.f171267b <= 0) {
            int i17 = com.tencent.mm.plugin.sns.model.l4.rj().x;
            int dimension = (int) (com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.i_) + com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.i_));
            int dimension2 = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.aau);
            int dimension3 = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.i_);
            int i18 = ((i17 - dimension2) - dimension) - dimension3;
            this.f171267b = i18;
            if (i18 <= 0) {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                i17 = displayMetrics.widthPixels;
                this.f171267b = ((i17 - dimension2) - dimension) - dimension3;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentPreloadTextViewConfig", "try again, screenWidth " + i17 + " textViewWidth " + this.f171267b + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
            }
            ca4.e1 e1Var = ca4.f1.f39897a;
            android.app.Activity activity = this.f171268c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTimelineUIContext", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            boolean z17 = activity instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTimelineUIContext", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (z17) {
                int s17 = e1Var.s(this.f171268c);
                if (s17 <= 0) {
                    s17 = this.f171267b;
                }
                this.f171267b = s17;
            } else if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.y()) {
                if (fp.h.c(30) && com.tencent.mm.ui.ee.a(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    this.f171267b = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aav);
                } else if ((com.tencent.mm.ui.bk.N(this.f171268c.getTaskId()) || (com.tencent.mm.ui.bk.O(this.f171268c.getContentResolver()) && !this.f171268c.isInMultiWindowMode())) && !com.tencent.mm.ui.ee.b(this.f171268c.getTaskId())) {
                    this.f171267b = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aav);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentPreloadTextViewConfig", "screenWidth " + i17 + " textViewWidth " + this.f171267b + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
        }
        int i19 = this.f171267b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return i19;
    }
}
