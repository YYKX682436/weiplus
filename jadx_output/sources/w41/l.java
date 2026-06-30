package w41;

/* loaded from: classes15.dex */
public final class l implements x41.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView f442870a;

    public l(com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView) {
        this.f442870a = openIMKefuConfirmDialogView;
    }

    @Override // x41.a
    public void a(int i17) {
        v41.r rVar = this.f442870a.D1;
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmDialogUIModelImpl", "showConfirmDialog onClose exitType: " + i17);
            v41.m mVar = ((v41.h) rVar).f433212a;
            mVar.j(new v41.g(mVar));
            w41.j jVar = mVar.f433219i;
            if (jVar != null) {
                jVar.dismiss();
            }
        }
    }
}
