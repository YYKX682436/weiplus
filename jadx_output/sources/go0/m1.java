package go0;

/* loaded from: classes14.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f273802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f273803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(java.lang.Object obj, go0.q1 q1Var) {
        super(0);
        this.f273802d = obj;
        this.f273803e = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f273802d;
        if (obj != null) {
            go0.q1 q1Var = this.f273803e;
            if (!kotlin.jvm.internal.o.b(obj, q1Var.f273826m)) {
                q1Var.f273826m = obj;
                q1Var.f273827n = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
