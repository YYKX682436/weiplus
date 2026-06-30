package f26;

/* loaded from: classes16.dex */
public abstract class l extends f26.r {

    /* renamed from: b, reason: collision with root package name */
    public final e26.x f259188b;

    public l(e26.c0 storageManager) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        e26.u uVar = (e26.u) storageManager;
        this.f259188b = new e26.f(uVar, uVar, new f26.i(this), f26.j.f259177d, new f26.k(this));
    }

    public abstract java.util.Collection c();

    public abstract f26.o0 d();

    public abstract o06.c2 e();

    @Override // f26.c2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.util.List a() {
        return ((f26.h) ((e26.p) this.f259188b).invoke()).f259168b;
    }

    public java.util.List g(java.util.List supertypes) {
        kotlin.jvm.internal.o.g(supertypes, "supertypes");
        return supertypes;
    }
}
