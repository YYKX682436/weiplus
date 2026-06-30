package zb3;

/* loaded from: classes9.dex */
public class u implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zb3.v f471293d;

    public u(zb3.v vVar) {
        this.f471293d = vVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        zb3.v vVar = this.f471293d;
        android.app.Dialog dialog = vVar.f471294d.f145765s;
        if (dialog != null && dialog.isShowing()) {
            vVar.f471294d.f145765s.hide();
        }
        if (vVar.f471294d.getContentView().getVisibility() == 8 || vVar.f471294d.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
            vVar.f471294d.finish();
        }
        vVar.f471294d.forceCancel();
    }
}
