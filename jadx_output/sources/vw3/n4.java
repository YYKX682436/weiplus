package vw3;

/* loaded from: classes.dex */
public final class n4 implements q01.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI f441041d;

    public n4(com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI) {
        this.f441041d = repairerResDownloadUI;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        q01.g event = (q01.g) obj;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI = this.f441041d;
        repairerResDownloadUI.d.append("========================\n");
        repairerResDownloadUI.d.append("netSceneAction:" + event.f359279a + " errType:" + event.f359280b + " errCode:" + event.f359281c + '\n');
        pm0.v.X(new vw3.m4(repairerResDownloadUI));
    }
}
