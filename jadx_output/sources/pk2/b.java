package pk2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f355560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pk2.o9 o9Var, long j17) {
        super(0);
        this.f355559d = o9Var;
        this.f355560e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf((((mm2.c1) this.f355559d.c(mm2.c1.class)).f328866q & this.f355560e) == 0);
    }
}
