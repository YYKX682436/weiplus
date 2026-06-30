package fp0;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f265258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.d f265259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.u f265260f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fp0.o oVar, fp0.d dVar, fp0.u uVar) {
        super(0);
        this.f265258d = oVar;
        this.f265259e = dVar;
        this.f265260f = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (fp0.p pVar : this.f265258d.f265272d) {
            fp0.d dVar = this.f265259e;
            kotlin.jvm.internal.o.e(dVar, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.dispatch.<no name provided>.invoke$lambda$0");
            pVar.a(dVar, this.f265260f);
        }
        return jz5.f0.f302826a;
    }
}
