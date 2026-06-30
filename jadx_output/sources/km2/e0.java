package km2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f309092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f309093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f309094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.g0 f309095g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.util.List list, java.util.ArrayList arrayList, km2.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f309093e = list;
        this.f309094f = arrayList;
        this.f309095g = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        km2.e0 e0Var = new km2.e0(this.f309093e, this.f309094f, this.f309095g, continuation);
        e0Var.f309092d = obj;
        return e0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        km2.e0 e0Var = (km2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f309092d;
        java.util.Iterator it = this.f309093e.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.l.d(y0Var, null, null, new km2.d0(this.f309094f, this.f309095g, (com.tencent.mm.modelbase.i) it.next(), null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
