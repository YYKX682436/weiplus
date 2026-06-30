package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class q0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176788d;

    public q0(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176788d = g1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f176788d.B.a(null, false, 7);
        return true;
    }
}
