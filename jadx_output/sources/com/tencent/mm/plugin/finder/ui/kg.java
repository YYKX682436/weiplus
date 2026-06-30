package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class kg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI f129439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lk2 f129440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI finderSettingDetailInfoUI, r45.lk2 lk2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129439d = finderSettingDetailInfoUI;
        this.f129440e = lk2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.kg(this.f129439d, this.f129440e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.kg kgVar = (com.tencent.mm.plugin.finder.ui.kg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kgVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI finderSettingDetailInfoUI = this.f129439d;
        r45.lk2 lk2Var = this.f129440e;
        finderSettingDetailInfoUI.f128716n = lk2Var;
        if (lk2Var != null) {
            finderSettingDetailInfoUI.Y6();
        }
        return jz5.f0.f302826a;
    }
}
