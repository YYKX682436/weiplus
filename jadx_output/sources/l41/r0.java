package l41;

/* loaded from: classes15.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315912a;

    public r0(l41.j1 j1Var) {
        this.f315912a = j1Var;
    }

    public void a(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        l41.j1 j1Var = this.f315912a;
        j1Var.getClass();
        boolean z17 = false;
        if (i18 == -3601) {
            boolean z18 = errMsg.length() > 0;
            android.app.Activity activity = j1Var.f315842a;
            if (!z18) {
                errMsg = activity.getString(com.tencent.mm.R.string.hex);
                kotlin.jvm.internal.o.d(errMsg);
            }
            java.lang.String string = activity.getString(com.tencent.mm.R.string.f490454vi);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.ui.widget.dialog.j0 y17 = db5.e1.y(activity, "", errMsg, string, new l41.b1(j1Var));
            if (y17 != null) {
                y17.setCancelable(false);
            }
            if (y17 != null) {
                y17.setCanceledOnTouchOutside(false);
            }
            z17 = true;
        }
        if (z17) {
            return;
        }
        l41.e2.c(j1Var.l(), j1Var.m(), false, 2, "get contact failed");
        j1Var.g(2, "get contact failed");
    }
}
