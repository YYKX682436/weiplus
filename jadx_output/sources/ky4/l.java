package ky4;

/* loaded from: classes15.dex */
public class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ScanQrcodeKidsWatchLoginEvent scanQrcodeKidsWatchLoginEvent = (com.tencent.mm.autogen.events.ScanQrcodeKidsWatchLoginEvent) iEvent;
        if (scanQrcodeKidsWatchLoginEvent == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        am.zs zsVar = scanQrcodeKidsWatchLoginEvent.f54736g;
        intent.putExtra("intent.key.login.url", zsVar.f8604a);
        intent.putExtra("intent.key.device.name", zsVar.f8605b);
        intent.setFlags(268435456);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "kidswatch", ".ui.login.KidsWatchEntranceUI", intent, null);
        return false;
    }
}
