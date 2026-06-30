package pk2;

/* loaded from: classes3.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(boolean z17, pk2.o9 o9Var) {
        super(0);
        this.f356051d = z17;
        this.f356052e = o9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(!this.f356051d && pm0.v.z((int) ((mm2.c1) this.f356052e.c(mm2.c1.class)).f328866q, 64));
    }
}
