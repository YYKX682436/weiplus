package n0;

/* loaded from: classes13.dex */
public abstract class a implements n0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f333424a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f333425b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f333426c;

    public a(java.lang.Object obj) {
        this.f333424a = obj;
        this.f333426c = obj;
    }

    @Override // n0.e
    public java.lang.Object a() {
        return this.f333426c;
    }

    @Override // n0.e
    public void c() {
    }

    @Override // n0.e
    public final void clear() {
        ((java.util.ArrayList) this.f333425b).clear();
        this.f333426c = this.f333424a;
        j();
    }

    @Override // n0.e
    public void d() {
    }

    @Override // n0.e
    public void h(java.lang.Object obj) {
        ((java.util.ArrayList) this.f333425b).add(this.f333426c);
        this.f333426c = obj;
    }

    @Override // n0.e
    public void i() {
        java.util.List list = this.f333425b;
        if (!(!list.isEmpty())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f333426c = ((java.util.ArrayList) list).remove(((java.util.ArrayList) list).size() - 1);
    }

    public abstract void j();
}
