package w41;

/* loaded from: classes15.dex */
public final class e implements x41.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView f442855a;

    public e(com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView openIMConfirmDialogView) {
        this.f442855a = openIMConfirmDialogView;
    }

    @Override // x41.a
    public void a(int i17) {
        ab0.r rVar = this.f442855a.C1;
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "confirmDialog onClose exitType:%s", java.lang.Integer.valueOf(i17));
            ((w41.c) ((com.tencent.mm.plugin.profile.n0) rVar).f153535a).dismiss();
        }
    }
}
