package op0;

/* loaded from: classes12.dex */
public final class j implements cl.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uq3.g f347230a;

    public j(uq3.g gVar) {
        this.f347230a = gVar;
    }

    @Override // cl.n
    public void a(cl.p runtime) {
        com.tencent.mm.sdk.platformtools.g gVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        uq3.e b17 = ((com.tencent.mm.feature.performance.p4) this.f347230a).b(runtime);
        try {
            gVar = (com.tencent.mm.sdk.platformtools.g) com.tencent.mm.sdk.platformtools.h.f192721a.call();
        } catch (java.lang.Exception unused) {
            gVar = null;
        }
        if (gVar == null || android.text.TextUtils.isEmpty(gVar.f192712b)) {
            return;
        }
        b17.f430226e = gVar.f192712b;
    }

    @Override // cl.n
    public void b(cl.p runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        ((com.tencent.mm.feature.performance.p4) this.f347230a).a(runtime);
    }

    @Override // cl.n
    public void c(cl.p runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        ((com.tencent.mm.feature.performance.p4) this.f347230a).a(runtime);
    }
}
