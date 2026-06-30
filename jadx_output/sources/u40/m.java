package u40;

/* loaded from: classes8.dex */
public final class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "receive logoutEvent, liveId:" + e1Var.f328988r.getLong(0));
            dk2.ef.T(efVar, false, null, 3, null);
        }
        return false;
    }
}
