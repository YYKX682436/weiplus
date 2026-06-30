package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f134844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nb f134845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(com.tencent.mm.plugin.finder.viewmodel.component.nb nbVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134845e = nbVar;
        this.f134846f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.jb(this.f134845e, this.f134846f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.jb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f134844d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.f134845e.f135287a;
            jz5.l lVar = new jz5.l(java.lang.Boolean.FALSE, this.f134846f);
            this.f134844d = 1;
            if (((u26.o) obj2).t(lVar, this) == aVar) {
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
