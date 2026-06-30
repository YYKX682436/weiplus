package u22;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.k f423991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f423992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f423993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u22.k kVar, java.util.List list, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f423991d = kVar;
        this.f423992e = list;
        this.f423993f = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        u22.k kVar = this.f423991d;
        kVar.f423996a.b(this.f423992e);
        ((androidx.recyclerview.widget.c0) this.f423993f.f310123d).a(new u22.h(kVar));
        return jz5.f0.f302826a;
    }
}
