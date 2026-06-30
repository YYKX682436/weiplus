package gf0;

/* loaded from: classes.dex */
public final class q implements com.tencent.mm.ui.yc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f271230a;

    public q(android.app.Activity activity) {
        this.f271230a = activity;
    }

    @Override // com.tencent.mm.ui.yc
    public void a(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 == 80) {
            android.app.Activity activity = this.f271230a;
            ((com.tencent.mm.ui.MMFragmentActivity) activity).unregisterMMOnRequestPermissionsResult(this);
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
            u1Var.g(activity.getString(com.tencent.mm.R.string.hhn));
            u1Var.i(gf0.o.f271228a);
            u1Var.n(activity.getString(com.tencent.mm.R.string.g6z));
            u1Var.l(new gf0.p(activity));
            u1Var.q(false);
        }
    }
}
