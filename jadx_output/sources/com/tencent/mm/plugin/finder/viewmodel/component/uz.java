package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class uz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f136188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f136189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f136190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f136191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz(kotlinx.coroutines.flow.j jVar, yz5.p pVar, kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136189e = jVar;
        this.f136190f = pVar;
        this.f136191g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.uz(this.f136189e, this.f136190f, this.f136191g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.uz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f136188d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j i18 = kotlinx.coroutines.flow.l.i(new com.tencent.mm.plugin.finder.viewmodel.component.tz(this.f136189e, this.f136190f));
            this.f136188d = 1;
            if (i18.a(this.f136191g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
