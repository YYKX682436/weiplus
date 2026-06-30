package yw1;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.h f466599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f466600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yw1.c f466601g;

    public a(yw1.c cVar, java.lang.String str, dn.h hVar, int i17) {
        this.f466601g = cVar;
        this.f466598d = str;
        this.f466599e = hVar;
        this.f466600f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        yw1.c cVar = this.f466601g;
        java.util.HashMap hashMap = (java.util.HashMap) cVar.f466603d;
        java.lang.String str = this.f466598d;
        yw1.b bVar = (yw1.b) hashMap.get(str);
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.QrRewardCdnDownloadHelper", "no callback");
            return;
        }
        dn.h hVar = this.f466599e;
        if (hVar != null) {
            int i17 = hVar.field_retCode;
            com.tencent.mm.plugin.collect.reward.ui.p pVar = (com.tencent.mm.plugin.collect.reward.ui.p) bVar;
            int i18 = this.f466600f;
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "callback ret: %s, %s, %s", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            if (i18 == 0 && i17 == 0) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.collect.reward.ui.o(pVar));
            }
            ((java.util.HashMap) cVar.f466603d).remove(str);
            if (hVar.field_retCode == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 8L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 9L, 1L, false);
            }
        }
    }
}
