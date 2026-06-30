package xn4;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI f455630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI) {
        super(0);
        this.f455630d = xUpdateDownloadUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI = this.f455630d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = xUpdateDownloadUI.f175515m;
        if (j0Var != null) {
            j0Var.hide();
        }
        xUpdateDownloadUI.f175515m = null;
        return jz5.f0.f302826a;
    }
}
