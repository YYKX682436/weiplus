package p16;

/* loaded from: classes15.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351358d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f351359e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Iterator f351360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p16.w0 f351361g;

    public u0(p16.w0 w0Var, p16.p0 p0Var) {
        this.f351361g = w0Var;
    }

    public final java.util.Iterator a() {
        if (this.f351360f == null) {
            this.f351360f = this.f351361g.f351366f.entrySet().iterator();
        }
        return this.f351360f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351358d + 1 < this.f351361g.f351365e.size() || a().hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        this.f351359e = true;
        int i17 = this.f351358d + 1;
        this.f351358d = i17;
        p16.w0 w0Var = this.f351361g;
        return i17 < w0Var.f351365e.size() ? (java.util.Map.Entry) w0Var.f351365e.get(this.f351358d) : (java.util.Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f351359e) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.f351359e = false;
        int i17 = p16.w0.f351363i;
        p16.w0 w0Var = this.f351361g;
        w0Var.b();
        if (this.f351358d >= w0Var.f351365e.size()) {
            a().remove();
            return;
        }
        int i18 = this.f351358d;
        this.f351358d = i18 - 1;
        w0Var.f(i18);
    }
}
