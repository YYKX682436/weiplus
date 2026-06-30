package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class ul extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.SettingFragment f129929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f129930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.ViewBindUIC f129931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(com.tencent.mm.plugin.finder.ui.SettingFragment settingFragment, java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.ui.ViewBindUIC viewBindUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129929d = settingFragment;
        this.f129930e = arrayList;
        this.f129931f = viewBindUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.ul(this.f129929d, this.f129930e, this.f129931f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.ul ulVar = (com.tencent.mm.plugin.finder.ui.ul) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ulVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.ui.SettingFragment settingFragment = this.f129929d;
        settingFragment.f128821t.clear();
        java.util.ArrayList arrayList = settingFragment.f128821t;
        java.util.ArrayList arrayList2 = this.f129930e;
        arrayList.addAll(arrayList2);
        this.f129931f.O6(arrayList2);
        return jz5.f0.f302826a;
    }
}
