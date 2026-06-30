package n0;

/* loaded from: classes14.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f333612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f333614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i17, int i18, int i19) {
        super(3);
        this.f333612d = i17;
        this.f333613e = i18;
        this.f333614f = i19;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g((n0.o4) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        applier.e(this.f333612d, this.f333613e, this.f333614f);
        return jz5.f0.f302826a;
    }
}
