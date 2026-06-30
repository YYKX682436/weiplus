package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class rg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI f129779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129779d = finderSettingInfoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.rg(this.f129779d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.rg rgVar = (com.tencent.mm.plugin.finder.ui.rg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rgVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI.f128721p;
        this.f129779d.X6(true);
        return jz5.f0.f302826a;
    }
}
