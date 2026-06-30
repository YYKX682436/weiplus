package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class sg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f135899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f135900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135900e = appCompatActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.sg(this.f135900e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.sg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135899d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.appcompat.app.AppCompatActivity context = this.f135900e;
            kotlin.jvm.internal.o.g(context, "context");
            kotlinx.coroutines.flow.j d17 = kotlinx.coroutines.flow.l.d(new hc2.z(context, null));
            com.tencent.mm.plugin.finder.viewmodel.component.pg pgVar = com.tencent.mm.plugin.finder.viewmodel.component.pg.f135550d;
            this.f135899d = 1;
            java.lang.Object a17 = d17.a(new com.tencent.mm.plugin.finder.viewmodel.component.rg(pgVar), this);
            if (a17 != pz5.a.f359186d) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
