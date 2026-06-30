package sc3;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(sc3.k1 k1Var, int i17) {
        super(0);
        this.f406530d = k1Var;
        this.f406531e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f406530d.onDestroy(this.f406531e);
        return jz5.f0.f302826a;
    }
}
