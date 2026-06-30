package com.tencent.mm.plugin.report.service;

/* loaded from: classes5.dex */
public class l0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f158287d;

    public l0(com.tencent.mm.plugin.report.service.g0 g0Var, java.lang.Runnable runnable) {
        this.f158287d = runnable;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0) {
            return;
        }
        gm0.j1.e().k(this.f158287d, 5000L);
    }
}
