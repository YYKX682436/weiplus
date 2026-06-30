package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public abstract class ts {
    public static final int a(java.lang.Number number) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("AtoPx", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBarKt");
        kotlin.jvm.internal.o.g(number, "<this>");
        int f17 = (int) (i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv) * number.floatValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("AtoPx", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBarKt");
        return f17;
    }
}
