package qm3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm3.a f364776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm3.i f364777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f364778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f364779g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qm3.a aVar, qm3.i iVar, kp4.a aVar2, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f364776d = aVar;
        this.f364777e = iVar;
        this.f364778f = aVar2;
        this.f364779g = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qm3.f(this.f364776d, this.f364777e, this.f364778f, this.f364779g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qm3.f fVar = (qm3.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm5.k kVar = this.f364776d.f364759a;
        if (kVar == null) {
            kVar = this.f364777e.f364784a.a(this.f364778f, null);
            this.f364776d.f364759a = kVar;
        }
        if (!kotlinx.coroutines.z0.h(this.f364777e.f364786c)) {
            kVar.destroy();
        }
        kp4.a aVar2 = this.f364778f;
        kVar.setSize(aVar2.f311071a, aVar2.f311072b);
        kVar.a(this.f364779g, new qm3.e(this.f364777e, this.f364776d, this.f364778f));
        return jz5.f0.f302826a;
    }
}
