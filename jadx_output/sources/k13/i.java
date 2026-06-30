package k13;

/* loaded from: classes5.dex */
public final class i implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI f303221a;

    public i(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI forceNotifyAcceptUI) {
        this.f303221a = forceNotifyAcceptUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        k13.h hVar = com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI.f137329f;
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI forceNotifyAcceptUI = this.f303221a;
        if (hVar != null) {
            m13.a aVar = (m13.a) hVar;
            boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(aVar.f322861b);
            com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission cancel, ok:" + Ui);
            if (forceNotifyAcceptUI != null) {
                forceNotifyAcceptUI.finish();
            }
            aVar.f322860a.a(Ui);
        }
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI.f137329f = null;
        forceNotifyAcceptUI.finish();
    }
}
