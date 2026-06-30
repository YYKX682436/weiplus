package gk5;

/* loaded from: classes9.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f272712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(gk5.r0 r0Var) {
        super(0);
        this.f272712d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk5.r0 r0Var = this.f272712d;
        androidx.appcompat.app.AppCompatActivity activity = r0Var.getActivity();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
        e4Var.f211776c = r0Var.getString(com.tencent.mm.R.string.h0a);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.e();
        return jz5.f0.f302826a;
    }
}
