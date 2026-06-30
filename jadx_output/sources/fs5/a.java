package fs5;

/* loaded from: classes13.dex */
public abstract class a implements tr5.q {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f266347d = tr5.c.f421455a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f266348e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f266349f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f266350g = 0;

    @Override // tr5.q
    public boolean b() {
        return this.f266348e;
    }

    @Override // tr5.q
    public boolean d() {
        return tr5.c.f421455a != this.f266347d;
    }

    public void h() {
        this.f266349f = (int) (java.lang.System.currentTimeMillis() - this.f266350g);
    }
}
