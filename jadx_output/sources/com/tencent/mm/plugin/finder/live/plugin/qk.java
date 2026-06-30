package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce2.i f114019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.m f114020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(ce2.i iVar, vg2.m mVar, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f114019d = iVar;
        this.f114020e = mVar;
        this.f114021f = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ce2.i iVar = this.f114019d;
        iVar.field_audienceAiCustomGiftInfo.set(0, 1);
        java.lang.String str = (java.lang.String) this.f114021f.f310123d;
        vg2.m mVar = this.f114020e;
        mVar.f436540J = str;
        ce2.i iVar2 = (ce2.i) dk2.u7.f234185e.get(iVar.field_rewardProductId);
        if (iVar2 != null) {
            iVar = iVar2;
        }
        mVar.I = iVar;
        mVar.g0(iVar);
        return jz5.f0.f302826a;
    }
}
