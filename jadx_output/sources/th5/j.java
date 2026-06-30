package th5;

/* loaded from: classes12.dex */
public final class j implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mf3.k f419388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf3.k f419389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ th5.q f419390c;

    public j(mf3.k kVar, th5.q qVar) {
        this.f419389b = kVar;
        this.f419390c = qVar;
        this.f419388a = kVar;
    }

    @Override // mf3.k
    public gg3.c a() {
        return this.f419388a.a();
    }

    @Override // mf3.k
    public eg3.i c() {
        return this.f419388a.c();
    }

    @Override // mf3.k
    public sf3.g e() {
        return this.f419388a.e();
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        kotlin.jvm.internal.o.g(level, "level");
        this.f419388a.f(level);
    }

    @Override // mf3.k
    public java.lang.String g() {
        java.lang.String b17;
        th5.q qVar = this.f419390c;
        return (qVar == null || (b17 = qVar.b()) == null) ? this.f419389b.g() : b17;
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return this.f419388a.getId();
    }

    @Override // mf3.k
    public mf3.w getLevel() {
        return this.f419388a.getLevel();
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326123e;
    }
}
