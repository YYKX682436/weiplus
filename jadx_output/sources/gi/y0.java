package gi;

/* loaded from: classes12.dex */
public class y0 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gi.w0 f272224b;

    public y0(gi.w0 w0Var) {
        this.f272224b = w0Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        qh.f0 f0Var = this.f272224b.f395329k;
        if (f0Var != null) {
            f0Var.f363337f.post(new gi.y0$$a(this, 2));
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        qh.f0 f0Var = this.f272224b.f395329k;
        if (f0Var != null) {
            f0Var.f363337f.post(new gi.y0$$a(this, 1));
        }
    }
}
