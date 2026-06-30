package f12;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringCardActivity f258569d;

    public b(com.tencent.mm.plugin.eggspring.ui.SpringCardActivity springCardActivity) {
        this.f258569d = springCardActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.eggspring.ui.SpringCardActivity springCardActivity = this.f258569d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = springCardActivity.f97435h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        springCardActivity.f97435h = com.tencent.mm.ui.widget.dialog.u3.f(springCardActivity, springCardActivity.getString(com.tencent.mm.R.string.f491083bu5), true, 0, null);
    }
}
