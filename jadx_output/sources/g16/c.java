package g16;

/* loaded from: classes15.dex */
public abstract class c implements g16.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final g16.u0 f267596a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f267597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g16.d f267598c;

    public c(g16.d dVar, g16.u0 signature) {
        kotlin.jvm.internal.o.g(signature, "signature");
        this.f267598c = dVar;
        this.f267596a = signature;
        this.f267597b = new java.util.ArrayList();
    }

    @Override // g16.o0
    public void a() {
        java.util.ArrayList arrayList = this.f267597b;
        if (!arrayList.isEmpty()) {
            this.f267598c.f267602b.put(this.f267596a, arrayList);
        }
    }

    @Override // g16.o0
    public g16.m0 b(n16.b classId, o06.x1 source) {
        kotlin.jvm.internal.o.g(classId, "classId");
        kotlin.jvm.internal.o.g(source, "source");
        return this.f267598c.f267601a.r(classId, source, this.f267597b);
    }
}
