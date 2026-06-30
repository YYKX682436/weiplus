package zl2;

/* loaded from: classes.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f473948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(boolean z17, android.content.Context context) {
        super(0);
        this.f473948d = z17;
        this.f473949e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        if (this.f473948d) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = zl2.r4.f473957h;
            if (u3Var2 == null) {
                android.content.Context context = this.f473949e;
                zl2.r4.f473957h = com.tencent.mm.ui.widget.dialog.u3.f(context, i65.a.r(context, com.tencent.mm.R.string.f9y), false, 2, null);
            } else {
                if ((u3Var2.isShowing() ? false : true) && (u3Var = zl2.r4.f473957h) != null) {
                    u3Var.show();
                }
            }
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = zl2.r4.f473957h;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
            zl2.r4.f473957h = null;
        }
        return jz5.f0.f302826a;
    }
}
