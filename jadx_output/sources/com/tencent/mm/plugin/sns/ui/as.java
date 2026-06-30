package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class as {
    public static final xe0.u0 a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildSnsHeaderItemSpanStyle", "com.tencent.mm.plugin.sns.ui.SnsTextStatusStyleHelper");
        kotlin.jvm.internal.o.g(context, "context");
        int a17 = ym5.x.a(context, 20.0f);
        int a18 = ym5.x.a(context, 8.0f);
        int b17 = i65.a.b(context, 4);
        int parseColor = android.graphics.Color.parseColor("#e5000000");
        xe0.r0 a19 = new xe0.r0().a().a();
        a19.f453773a = a17;
        a19.f453774b = xe0.m0.f453755e;
        a19.f453781i = parseColor;
        a19.f453776d = java.lang.Integer.valueOf(parseColor);
        a19.f453783k = -1;
        a19.f453782j = -1;
        a19.f453784l = android.graphics.Color.parseColor("#4df7f7f7");
        a19.f453779g = true;
        a19.f453780h = xe0.p0.f453769f;
        a19.f453791s = 0;
        a19.f453792t = a18;
        a19.f453789q = new xe0.t0(b17, b17, b17, b17);
        a19.f453790r = new xe0.t0(b17, b17, b17, b17);
        xe0.u0 a27 = a19.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSnsHeaderItemSpanStyle", "com.tencent.mm.plugin.sns.ui.SnsTextStatusStyleHelper");
        return a27;
    }
}
