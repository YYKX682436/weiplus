package ip5;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(com.tencent.mm.ui.widget.dialog.u1 u1Var) {
        boolean z17;
        kotlin.jvm.internal.o.g(u1Var, "<this>");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        if (jVar != null) {
            z17 = ((sb0.f) jVar).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } else {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MMFloatWinDialogCompat", "FloatWindowOp Not Allowed. Use Compat Mode");
            u1Var.q(false);
            return;
        }
        android.content.Context context = u1Var.f211997b;
        boolean z18 = context instanceof android.app.Activity;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = u1Var.f211996a;
        if (z18) {
            if (u1Var.f211998c == null) {
                u1Var.f211998c = i0Var.a();
            }
            android.view.Window window = u1Var.f211998c.getWindow();
            if (window != null) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    window.setType(2038);
                } else {
                    window.setType(2002);
                }
                com.tencent.mm.ui.yk.a("dialog", "show top window not null!!", new java.lang.Object[0]);
            }
            u1Var.f211998c.show();
            return;
        }
        com.tencent.mm.ui.AlertActivity.f196556m = i0Var;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.AlertActivity.class);
        intent.setFlags(335544320);
        intent.putExtra("dialog_show_top", true);
        android.content.Context context2 = u1Var.f211997b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMConfirmDialog$Builder", "showTop", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/MMConfirmDialog$Builder", "showTop", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
