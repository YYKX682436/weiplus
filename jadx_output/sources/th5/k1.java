package th5;

/* loaded from: classes12.dex */
public final class k1 implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final th5.q f419399a;

    public k1(th5.q live) {
        kotlin.jvm.internal.o.g(live, "live");
        this.f419399a = live;
    }

    @Override // mf3.k
    public gg3.c a() {
        return this.f419399a.a();
    }

    @Override // mf3.k
    public eg3.i c() {
        this.f419399a.getClass();
        return null;
    }

    @Override // mf3.k
    public sf3.g e() {
        return this.f419399a.e();
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        kotlin.jvm.internal.o.g(level, "level");
        th5.q qVar = this.f419399a;
        qVar.getClass();
        qVar.f419450h = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        return this.f419399a.b();
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return this.f419399a.getId();
    }

    @Override // mf3.k
    public mf3.w getLevel() {
        return this.f419399a.f419450h;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326123e;
    }
}
