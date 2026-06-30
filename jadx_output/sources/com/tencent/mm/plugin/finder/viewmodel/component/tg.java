package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f136022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f136023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f136024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.protobuf.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136023e = appCompatActivity;
        this.f136024f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.tg(this.f136023e, this.f136024f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.tg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f136022d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            db2.b5 b5Var = new db2.b5(this.f136023e, this.f136024f);
            this.f136022d = 1;
            obj = rm0.h.b(b5Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((com.tencent.mm.modelbase.f) obj).b()) {
            obj = null;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            return (bw5.ig) fVar.f70618d;
        }
        return null;
    }
}
