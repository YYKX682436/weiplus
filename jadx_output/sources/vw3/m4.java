package vw3;

/* loaded from: classes.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI f441032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI) {
        super(0);
        this.f441032d = repairerResDownloadUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI = this.f441032d;
        ((android.widget.TextView) repairerResDownloadUI.findViewById(com.tencent.mm.R.id.knd)).setText(repairerResDownloadUI.d.toString());
        return jz5.f0.f302826a;
    }
}
