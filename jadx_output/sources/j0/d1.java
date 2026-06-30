package j0;

/* loaded from: classes14.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f296257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f296258f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(j0.c5 c5Var, c1.d0 d0Var, boolean z17) {
        super(0);
        this.f296256d = c5Var;
        this.f296257e = d0Var;
        this.f296258f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j0.p1.e(this.f296256d, this.f296257e, !this.f296258f);
        return java.lang.Boolean.TRUE;
    }
}
