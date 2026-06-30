package e22;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f246759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f246760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f246762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f246763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, boolean z18, yz5.a aVar, e22.d1 d1Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(0);
        this.f246759d = z17;
        this.f246760e = z18;
        this.f246761f = aVar;
        this.f246762g = d1Var;
        this.f246763h = finderObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!this.f246759d || this.f246760e) {
            e22.d1 d1Var = this.f246762g;
            d1Var.getClass();
            com.tencent.mm.protocal.protobuf.FinderObject finder = this.f246763h;
            kotlin.jvm.internal.o.g(finder, "finder");
            x0.i0 i0Var = d1Var.f246639m;
            if (i0Var.contains(finder)) {
                i0Var.remove(finder);
            } else {
                i0Var.add(finder);
            }
        } else {
            yz5.a aVar = this.f246761f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
