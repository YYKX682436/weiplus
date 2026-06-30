package hr4;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f284250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kr4.e f284252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c01.o8 o8Var, java.lang.String str, kr4.e eVar) {
        super(0);
        this.f284250d = o8Var;
        this.f284251e = str;
        this.f284252f = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        c01.o8 o8Var = this.f284250d;
        if (o8Var != null) {
            o8Var.a(this.f284251e, this.f284252f != null);
        }
        return jz5.f0.f302826a;
    }
}
