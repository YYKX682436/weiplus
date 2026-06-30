package ud2;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.o f426626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ud2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426626e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ud2.i(this.f426626e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ud2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.o mo133getLifecycle;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f426625d;
        ud2.o oVar = this.f426626e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.lifecycle.y d17 = oVar.d(oVar.f426635b.getView());
            if (d17 != null && (mo133getLifecycle = d17.mo133getLifecycle()) != null) {
                mo133getLifecycle.a(oVar.f426645l);
            }
            this.f426625d = 1;
            obj = ud2.o.a(oVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        if (finderObject != null) {
            oVar.f426637d = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
            ud2.o.b(oVar);
            ud2.o.c(oVar);
        }
        return jz5.f0.f302826a;
    }
}
