package z;

/* loaded from: classes14.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.w0 f468853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f468854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(z.w0 w0Var, int i17) {
        super(2);
        this.f468853d = w0Var;
        this.f468854e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f468854e | 1;
        this.f468853d.a((n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
