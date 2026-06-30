package dk2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f234402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dk2.g0 g0Var) {
        super(0);
        this.f234402d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f234402d.f233469b;
        if (k0Var != null) {
            k0Var.showProgress();
        }
        return jz5.f0.f302826a;
    }
}
