package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class h1 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.h1 f171147c = new com.tencent.mm.plugin.sns.ui.widget.h1();

    /* renamed from: a, reason: collision with root package name */
    public nm0.a f171148a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f171149b = 0;

    public static com.tencent.mm.plugin.sns.ui.widget.h1 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.widget.h1 h1Var = f171147c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        return h1Var;
    }

    public nm0.a b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int b17 = i65.a.b(context, (int) (i65.a.q(context) * 15.0f));
        nm0.a aVar = this.f171148a;
        if (aVar == null || ((int) aVar.f338462l) != b17) {
            nm0.b a17 = nm0.b.a();
            a17.f338466a.f338462l = b17;
            int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0_5);
            nm0.a aVar2 = a17.f338466a;
            aVar2.f338463m = color;
            aVar2.f338457g = 16;
            aVar2.f338456f = android.text.TextUtils.TruncateAt.END;
            this.f171148a = aVar2;
        }
        nm0.a aVar3 = this.f171148a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        return aVar3;
    }
}
