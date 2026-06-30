package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.wsfold.c f171342d = new com.tencent.mm.plugin.sns.ui.wsfold.c();

    public c() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$buildCurrentRequestKey$1");
        java.lang.Long it = (java.lang.Long) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$buildCurrentRequestKey$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String t07 = ca4.z0.t0(it.longValue());
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$buildCurrentRequestKey$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$buildCurrentRequestKey$1");
        return t07;
    }
}
