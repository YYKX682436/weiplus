package nc4;

/* loaded from: classes.dex */
public final class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336168d;

    public o(nc4.d0 d0Var) {
        this.f336168d = d0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$2");
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity context = this.f336168d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$2");
    }
}
