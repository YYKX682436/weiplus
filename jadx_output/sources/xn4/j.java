package xn4;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI f455631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI) {
        super(0);
        this.f455631d = xUpdateDownloadUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI = this.f455631d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = xUpdateDownloadUI.f175514i;
        if (j0Var != null) {
            j0Var.hide();
        }
        xUpdateDownloadUI.f175514i = null;
        return jz5.f0.f302826a;
    }
}
