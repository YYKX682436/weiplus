package gt;

/* loaded from: classes7.dex */
public class l4 extends com.tencent.mm.sdk.event.n {
    public l4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        k91.v5 n17;
        com.tencent.mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent collectAppBrandDesktopShortcutInfoEvent = (com.tencent.mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent) iEvent;
        if (!gm0.j1.a()) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(collectAppBrandDesktopShortcutInfoEvent.f54067g.f6632a) && gm0.j1.b().f273254q && (n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(collectAppBrandDesktopShortcutInfoEvent.f54067g.f6632a, "roundedSquareIconURL", "brandIconURL", "bigHeadURL", "appId", "nickname")) != null) {
            am.g3 g3Var = collectAppBrandDesktopShortcutInfoEvent.f54068h;
            g3Var.f6736b = new java.lang.String[]{n17.field_roundedSquareIconURL, n17.field_brandIconURL, n17.field_bigHeadURL};
            g3Var.f6735a = n17.field_nickname;
        }
        return true;
    }
}
