package sz3;

/* loaded from: classes9.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f414120d;

    public t0(sz3.v0 v0Var) {
        this.f414120d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f414120d.f401811f;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getResources().getString(com.tencent.mm.R.string.nmw);
        e4Var.b(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
        e4Var.c();
    }
}
