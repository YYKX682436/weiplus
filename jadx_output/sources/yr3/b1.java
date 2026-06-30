package yr3;

/* loaded from: classes11.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f464730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f464731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yr3.c1 f464732f;

    public b1(boolean z17, boolean z18, yr3.c1 c1Var) {
        this.f464730d = z17;
        this.f464731e = z18;
        this.f464732f = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f464731e;
        boolean z18 = this.f464730d;
        int i17 = (z18 && z17) ? com.tencent.mm.R.string.pgy : (!z18 || z17) ? com.tencent.mm.R.string.pgx : com.tencent.mm.R.string.pgp;
        int i18 = com.tencent.mm.R.raw.icons_outlined_listen_later_medium;
        if ((!z18 || !z17) && ((z18 && !z17) || z17)) {
            i18 = com.tencent.mm.R.raw.add_check_medium;
        }
        yr3.c1 c1Var = this.f464732f;
        c1Var.f464750o.setImageResource(i18);
        if (z18) {
            c1Var.f464757v = java.lang.Boolean.valueOf(!z17);
        }
        android.content.Context context = c1Var.f464745g;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(i17), null, activity, null, null);
        }
    }
}
