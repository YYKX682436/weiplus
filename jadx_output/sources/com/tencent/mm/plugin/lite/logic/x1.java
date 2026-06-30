package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class x1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData f144088b;

    public x1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData) {
        this.f144087a = str;
        this.f144088b = mMLiteAppScheduleData;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "create store fail.");
    }

    @Override // q80.f0
    public void success() {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData = this.f144088b;
        ((com.tencent.mm.feature.lite.i) g0Var).rj(this.f144087a, mMLiteAppScheduleData.f143883f, mMLiteAppScheduleData.f143884g);
    }
}
