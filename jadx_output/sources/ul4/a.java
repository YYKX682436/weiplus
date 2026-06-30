package ul4;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul4.i f428603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f428604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f428605f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ul4.i iVar, int i17, byte[] bArr) {
        super(0);
        this.f428603d = iVar;
        this.f428604e = i17;
        this.f428605f = bArr;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jm4.e0 e0Var = this.f428603d.f428621i;
        if (e0Var != null) {
            byte[] context = this.f428605f;
            kotlin.jvm.internal.o.g(context, "context");
            urgen.ur_0025.UR_9CE7.UR_7756(((jm4.f0) e0Var).getCppPointer(), this.f428604e, context);
        }
        return jz5.f0.f302826a;
    }
}
