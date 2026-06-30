package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class s1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.t1 f144056d;

    public s1(com.tencent.mm.plugin.lite.logic.t1 t1Var) {
        this.f144056d = t1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.lite.logic.t1 t1Var = this.f144056d;
        t1Var.f144064f.P(t1Var.f144062d, t1Var.f144063e);
        return true;
    }
}
