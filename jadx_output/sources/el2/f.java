package el2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f253789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(el2.i0 i0Var, com.tencent.mm.plugin.finder.live.view.gb gbVar) {
        super(2);
        this.f253788d = i0Var;
        this.f253789e = gbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        el2.i0 i0Var = this.f253788d;
        com.tencent.mm.plugin.finder.live.view.ka kaVar = (com.tencent.mm.plugin.finder.live.view.ka) ((jz5.n) i0Var.X).getValue();
        wt2.a aVar = i0Var.I;
        if (aVar != null) {
            kaVar.j0(intValue, intValue2, aVar, this.f253789e, null);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
