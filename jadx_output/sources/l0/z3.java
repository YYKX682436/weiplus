package l0;

/* loaded from: classes14.dex */
public final class z3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f314715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(boolean z17, java.lang.String str) {
        super(1);
        this.f314715d = z17;
        this.f314716e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        if (this.f314715d) {
            f06.v[] vVarArr = y1.m0.f458770a;
            java.lang.String description = this.f314716e;
            kotlin.jvm.internal.o.g(description, "description");
            ((y1.l) semantics).g(y1.i0.f458743y, description);
        }
        return jz5.f0.f302826a;
    }
}
