package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class t1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData f144063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144064f;

    public t1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData) {
        this.f144064f = g1Var;
        this.f144062d = str;
        this.f144063e = mMLiteAppScheduleData;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f144064f;
        java.lang.String str = this.f144062d;
        com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData = this.f144063e;
        g1Var.P(str, mMLiteAppScheduleData);
        if (mMLiteAppScheduleData.f143882e >= 0) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.lite.logic.s1(this), true);
            long j17 = mMLiteAppScheduleData.f143881d * 60 * 60 * 1000;
            b4Var.c(j17, j17);
            ((java.util.concurrent.ConcurrentHashMap) g1Var.f143959m).put(str, b4Var);
        }
        return true;
    }
}
