package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class o implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI f152341a;

    public o(com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI checkInLifeUI) {
        this.f152341a = checkInLifeUI;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckInLifeUI", "get info %s", addr.toString());
        com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI checkInLifeUI = this.f152341a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(checkInLifeUI.Z)) {
            java.lang.String str = addr.f71214g;
            checkInLifeUI.Z = str;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !checkInLifeUI.f152255x1) {
                return;
            }
            checkInLifeUI.V.l(checkInLifeUI.Z, addr.f71223s, addr.f71230z);
        }
    }
}
