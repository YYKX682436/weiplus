package qs3;

/* loaded from: classes15.dex */
public final class u implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarSearchUI f366395a;

    public u(com.tencent.mm.plugin.radar.ui.RadarSearchUI radarSearchUI) {
        this.f366395a = radarSearchUI;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.radar.ui.RadarSearchUI radarSearchUI = this.f366395a;
        if (!booleanValue) {
            radarSearchUI.finish();
        } else {
            int i17 = com.tencent.mm.plugin.radar.ui.RadarSearchUI.f154992h;
            radarSearchUI.P6();
        }
    }
}
