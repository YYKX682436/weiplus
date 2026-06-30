package qu0;

/* loaded from: classes5.dex */
public final class g extends qu0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu0.i f366728a;

    public g(qu0.i iVar) {
        this.f366728a = iVar;
    }

    @Override // uu0.b
    public void c(int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        if (fy0.i.a()) {
            this.f366728a.f366732c.c(i17, str, str2, bool);
        } else {
            fy0.i.b(new qu0.f(this, i17, str, str2, bool));
        }
    }

    @Override // qu0.c
    public void d(uu0.k recordParam) {
        kotlin.jvm.internal.o.g(recordParam, "recordParam");
        if (fy0.i.a()) {
            this.f366728a.f366732c.d(recordParam);
        } else {
            fy0.i.b(new qu0.e(this, recordParam));
        }
    }
}
