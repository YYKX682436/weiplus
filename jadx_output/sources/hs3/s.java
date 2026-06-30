package hs3;

@j95.b
/* loaded from: classes8.dex */
public class s extends i95.w implements ks3.t {

    /* renamed from: d, reason: collision with root package name */
    public ks3.k0 f284596d;

    /* renamed from: e, reason: collision with root package name */
    public ks3.q0 f284597e;

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        gm0.j1.e().j(new hs3.r(this));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        ks3.k0 k0Var = this.f284596d;
        if (k0Var != null) {
            k0Var.f();
        }
    }

    public ks3.k0 wi() {
        gm0.j1.b().c();
        if (this.f284596d == null) {
            this.f284596d = new ks3.k0();
        }
        return this.f284596d;
    }
}
