package nv2;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final nv2.i1 f340573a;

    /* renamed from: b, reason: collision with root package name */
    public int f340574b;

    /* renamed from: c, reason: collision with root package name */
    public final long f340575c = c01.id.a();

    public r(nv2.i1 i1Var) {
        this.f340573a = i1Var;
    }

    public void a(nv2.o1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f340574b++;
    }

    public final boolean b() {
        return this.f340574b < 2 && c01.id.a() - this.f340575c <= ((long) 1200000);
    }

    public abstract java.lang.String c();
}
