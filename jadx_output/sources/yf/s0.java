package yf;

/* loaded from: classes7.dex */
public class s0 extends tf.d {

    /* renamed from: a, reason: collision with root package name */
    public yf.h0 f461460a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461461b;

    public s0(yf.i0 i0Var) {
        this.f461461b = i0Var;
    }

    @Override // tf.d
    public int c() {
        return this.f461461b.f252497d;
    }

    @Override // tf.d
    public java.lang.String d() {
        return this.f461461b.w();
    }

    @Override // tf.d
    public java.lang.String e() {
        return this.f461461b.x();
    }

    @Override // tf.d
    public tf.f g() {
        if (this.f461460a == null) {
            this.f461460a = new yf.h0(this.f461461b);
        }
        return this.f461460a;
    }

    @Override // tf.d
    public pd1.n i() {
        return pd1.n.LivePusher;
    }
}
