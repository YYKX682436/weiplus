package vr3;

/* loaded from: classes11.dex */
public final class i implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher f439633d;

    public i(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher) {
        this.f439633d = bizProfileDataFetcher;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.wl wlVar = (r45.wl) oVar.f70711b.f70700a;
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher = this.f439633d;
        if (i17 == 0 && i18 == 0 && wlVar != null) {
            qr3.c0.f366082a.e(wlVar.f389235f);
            try {
                try {
                    qr3.c0.c(wlVar);
                    bizProfileDataFetcher.f154282m.setValue(wlVar);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizProfileDataFetcher", e17, "profileInfo.parseFrom", new java.lang.Object[0]);
                }
                bizProfileDataFetcher.f154293x = false;
                return 0;
            } finally {
                gr3.c.e(bizProfileDataFetcher.f154278f);
            }
        }
        if (i18 == -3003) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "get profile info -3003, dismiss biz menu");
            r45.wl wlVar2 = bizProfileDataFetcher.f154281i;
            r45.km kmVar = wlVar2.f389238i;
            if (kmVar != null) {
                kmVar.f378815d = null;
                if (wlVar2.f389233d != null) {
                    qr3.c0.c(wlVar2);
                }
                bizProfileDataFetcher.f154282m.setValue(bizProfileDataFetcher.f154281i);
            }
        }
        gr3.c.c(54L);
        return 0;
    }
}
