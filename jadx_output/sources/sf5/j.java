package sf5;

/* loaded from: classes10.dex */
public final class j implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf5.k f407642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f407643e;

    public j(sf5.k kVar, kotlinx.coroutines.flow.i2 i2Var) {
        this.f407642d = kVar;
        this.f407643e = i2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pf5.s0 s0Var = (pf5.s0) obj;
        sf5.k kVar = this.f407642d;
        yz5.l lVar = kVar.f407645c;
        if (lVar != null) {
            lVar.invoke(s0Var);
        }
        yz5.p pVar = kVar.f407644b;
        if (pVar != null) {
            sf5.l lVar2 = kVar.f407638a;
            java.lang.Object obj2 = lVar2.f407646a.get(0);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type S1 of com.tencent.mm.ui.component.support.StateTransform.StateBuilder2.bindFlow$lambda$0");
            java.lang.Object obj3 = lVar2.f407646a.get(1);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type S2 of com.tencent.mm.ui.component.support.StateTransform.StateBuilder2.bindFlow$lambda$0");
            java.lang.Object invoke = pVar.invoke((pf5.s0) obj2, (pf5.s0) obj3);
            if (invoke != null) {
                this.f407643e.e(invoke);
            }
        }
        return jz5.f0.f302826a;
    }
}
