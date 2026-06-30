package nx;

/* loaded from: classes12.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BizPreSearchEvent bizPreSearchEvent = (com.tencent.mm.autogen.events.BizPreSearchEvent) iEvent;
        if (bizPreSearchEvent != null) {
            am.v0 v0Var = bizPreSearchEvent.f54005g;
            if (v0Var.f8155e == 1) {
                android.content.Context context = v0Var.f8151a;
                java.lang.String str = v0Var.f8153c;
                java.lang.String str2 = v0Var.f8156f;
                int i17 = v0Var.f8152b;
                long j17 = v0Var.f8154d;
                if (context != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    gm0.j1.d().a(1071, new lr1.n(context, str, j17, 0, i17, str2, false, bizPreSearchEvent));
                    gm0.j1.d().g(new lr1.g0(str, j17, 0, i17, ""));
                    return true;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BrandServiceLogic", "context(%s) or keyword(%s) is null or nil.", context, str);
            }
        }
        return false;
    }
}
