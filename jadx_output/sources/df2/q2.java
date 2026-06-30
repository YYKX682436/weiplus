package df2;

/* loaded from: classes3.dex */
public final class q2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t2 f231129d;

    public q2(df2.t2 t2Var) {
        this.f231129d = t2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        df2.t2 t2Var = this.f231129d;
        if (!t2Var.e7()) {
            t2Var.f231404u = null;
            return;
        }
        boolean z17 = !pm0.v.z(t2Var.d7(), 2);
        java.lang.Boolean bool = t2Var.f231404u;
        if (bool != null && !kotlin.jvm.internal.o.b(bool, java.lang.Boolean.valueOf(z17))) {
            android.content.Context O6 = t2Var.O6();
            if (z17) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
                e4Var.d(com.tencent.mm.R.string.oml);
                e4Var.b(com.tencent.mm.R.raw.video_filled);
                e4Var.c();
            } else {
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(O6);
                e4Var2.d(com.tencent.mm.R.string.omd);
                e4Var2.b(com.tencent.mm.R.raw.icon_video_off);
                e4Var2.c();
            }
        }
        t2Var.f231404u = java.lang.Boolean.valueOf(z17);
        df2.t2.g7(t2Var, kz5.c0.i(com.tencent.mm.plugin.finder.live.view.n6.f116517e, com.tencent.mm.plugin.finder.live.view.n6.f116518f, com.tencent.mm.plugin.finder.live.view.n6.f116516d), false, 2, null);
    }
}
