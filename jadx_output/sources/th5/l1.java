package th5;

/* loaded from: classes12.dex */
public final class l1 implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final th5.q f419406a;

    public l1(th5.q live) {
        kotlin.jvm.internal.o.g(live, "live");
        this.f419406a = live;
    }

    @Override // mf3.k
    public gg3.c a() {
        return this.f419406a.a();
    }

    @Override // mf3.k
    public eg3.i c() {
        this.f419406a.getClass();
        return null;
    }

    @Override // mf3.k
    public sf3.g e() {
        return this.f419406a.e();
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        kotlin.jvm.internal.o.g(level, "level");
        th5.q qVar = this.f419406a;
        qVar.getClass();
        qVar.f419450h = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        th5.q qVar = this.f419406a;
        java.lang.String str = qVar.f419454l;
        return str.length() == 0 ? qVar.f419453k : str;
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return this.f419406a.getId();
    }

    @Override // mf3.k
    public mf3.w getLevel() {
        return this.f419406a.f419450h;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326124f;
    }
}
