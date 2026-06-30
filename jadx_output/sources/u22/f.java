package u22;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.k f423985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f423986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f423987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u22.k kVar, java.util.List list, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f423985d = kVar;
        this.f423986e = list;
        this.f423987f = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        u22.k kVar = this.f423985d;
        kVar.f423997b.b(this.f423986e);
        ((androidx.recyclerview.widget.c0) this.f423987f.f310123d).a(new u22.e(kVar));
        return jz5.f0.f302826a;
    }
}
