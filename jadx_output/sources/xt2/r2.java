package xt2;

/* loaded from: classes3.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(xt2.e3 e3Var) {
        super(0);
        this.f456977d = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xt2.e3 e3Var = this.f456977d;
        android.view.ViewGroup viewGroup = e3Var.f456709n;
        if ((viewGroup != null ? viewGroup.getTag() : null) != null) {
            e3Var.getPlugin().w1(true);
        }
        return jz5.f0.f302826a;
    }
}
