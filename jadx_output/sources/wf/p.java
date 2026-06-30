package wf;

/* loaded from: classes7.dex */
public class p extends tf.d {

    /* renamed from: a, reason: collision with root package name */
    public wf.a0 f445478a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wf.b f445479b;

    public p(wf.b bVar) {
        this.f445479b = bVar;
    }

    @Override // tf.d
    public int c() {
        return this.f445479b.f252497d;
    }

    @Override // tf.d
    public java.lang.String d() {
        return this.f445479b.v();
    }

    @Override // tf.d
    public java.lang.String e() {
        return this.f445479b.w();
    }

    @Override // tf.d
    public tf.f g() {
        if (this.f445478a == null) {
            this.f445478a = new wf.a0(this.f445479b);
        }
        return this.f445478a;
    }

    @Override // tf.d
    public pd1.n i() {
        return pd1.n.LivePlayer;
    }
}
