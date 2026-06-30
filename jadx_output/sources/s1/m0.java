package s1;

/* loaded from: classes14.dex */
public final class m0 implements s1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1.u0 f402035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.q0 f402036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f402037c;

    public m0(s1.u0 u0Var, s1.q0 q0Var, int i17) {
        this.f402035a = u0Var;
        this.f402036b = q0Var;
        this.f402037c = i17;
    }

    @Override // s1.u0
    public java.util.Map c() {
        return this.f402035a.c();
    }

    @Override // s1.u0
    public void e() {
        s1.q0 q0Var = this.f402036b;
        q0Var.f402064d = this.f402037c;
        this.f402035a.e();
        q0Var.a(q0Var.f402064d);
    }

    @Override // s1.u0
    public int getHeight() {
        return this.f402035a.getHeight();
    }

    @Override // s1.u0
    public int getWidth() {
        return this.f402035a.getWidth();
    }
}
