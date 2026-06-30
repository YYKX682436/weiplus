package sp2;

/* loaded from: classes2.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(sp2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411058e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.j1(this.f411058e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411057d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f411057d = 1;
            if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        sp2.o2 o2Var = this.f411058e;
        up2.m mVar = o2Var.f411160v;
        if (mVar != null) {
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
            if (finderParentRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            mVar.a(finderParentRecyclerView);
        }
        return jz5.f0.f302826a;
    }
}
