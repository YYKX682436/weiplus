package y;

/* loaded from: classes14.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f458317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f458318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f458319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(s1.o1 o1Var, long j17, long j18) {
        super(1);
        this.f458317d = o1Var;
        this.f458318e = j17;
        this.f458319f = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        s1.o1 o1Var = this.f458317d;
        int i17 = p2.m.f351389c;
        long j17 = this.f458318e;
        long j18 = this.f458319f;
        s1.n1.b(layout, o1Var, ((int) (j18 >> 32)) + ((int) (j17 >> 32)), p2.m.b(j18) + p2.m.b(j17), 0.0f, 4, null);
        return jz5.f0.f302826a;
    }
}
