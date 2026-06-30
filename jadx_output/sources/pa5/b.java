package pa5;

/* loaded from: classes3.dex */
public final class b extends u3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f353089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f353091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa5.l f353092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlin.jvm.internal.e0 e0Var, int i17, int i18, pa5.l lVar) {
        super("intSpringProgress");
        this.f353089a = e0Var;
        this.f353090b = i17;
        this.f353091c = i18;
        this.f353092d = lVar;
    }

    @Override // u3.t
    public float a(java.lang.Object object) {
        kotlin.jvm.internal.o.g(object, "object");
        return this.f353089a.f310115d;
    }

    @Override // u3.t
    public void b(java.lang.Object object, float f17) {
        kotlin.jvm.internal.o.g(object, "object");
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        kotlin.jvm.internal.e0 e0Var = this.f353089a;
        e0Var.f310115d = e17;
        int i17 = this.f353091c;
        int i18 = this.f353090b;
        float f18 = e0Var.f310115d;
        int i19 = i18 + ((int) ((i17 - i18) * f18));
        pa5.l lVar = this.f353092d;
        if (lVar != null) {
            lVar.a(i19, f18);
        }
    }
}
