package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public final class b5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f160856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.component.UIComponentActivity f160857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f160859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.ui.component.UIComponentActivity uIComponentActivity, java.lang.String str, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f160857e = uIComponentActivity;
        this.f160858f = str;
        this.f160859g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.b5(this.f160857e, this.f160858f, this.f160859g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting.b5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f160856d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean n17 = gm0.j1.b().n();
            yz5.a aVar2 = this.f160859g;
            java.lang.String str = this.f160858f;
            com.tencent.mm.ui.component.UIComponentActivity uIComponentActivity = this.f160857e;
            com.tencent.mm.plugin.setting.ui.setting.c5 c5Var = com.tencent.mm.plugin.setting.ui.setting.c5.f160900a;
            if (n17) {
                this.f160856d = 2;
                if (com.tencent.mm.plugin.setting.ui.setting.c5.a(c5Var, uIComponentActivity, str, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f160856d = 1;
                if (com.tencent.mm.plugin.setting.ui.setting.c5.b(c5Var, uIComponentActivity, str, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
