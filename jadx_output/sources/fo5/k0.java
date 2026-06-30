package fo5;

/* loaded from: classes14.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bp5.h f265011f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(fo5.r0 r0Var, int i17, bp5.h hVar) {
        super(3);
        this.f265009d = r0Var;
        this.f265010e = i17;
        this.f265011f = hVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        ro5.b bVar = this.f265009d.f265097p;
        if (bVar != null) {
            bVar.i(this.f265010e, this.f265011f);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("renderController");
        throw null;
    }
}
