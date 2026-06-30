package gk5;

/* loaded from: classes9.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f272676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(gk5.r0 r0Var) {
        super(0);
        this.f272676d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f272676d.f272715e;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
