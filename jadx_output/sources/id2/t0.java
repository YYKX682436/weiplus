package id2;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f290800d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f290800d.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
