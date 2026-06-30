package um2;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428912d;

    public p(um2.x5 x5Var) {
        this.f428912d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um2.x5 startUIC;
        um2.x5 x5Var = this.f428912d;
        fm2.c cVar = x5Var.f19606c;
        if (cVar != null) {
            org.json.JSONObject fullSEIData = cVar != null ? cVar.getFullSEIData() : null;
            fm2.c cVar2 = x5Var.f19606c;
            org.json.JSONObject currentMicData = cVar2 != null ? cVar2.getCurrentMicData() : null;
            fm2.c cVar3 = x5Var.f19606c;
            cVar.notifySEIMicUserChange(fullSEIData, currentMicData, cVar3 != null ? cVar3.getAnchorSEIMsg() : null, true, null);
        }
        fm2.c cVar4 = x5Var.f19606c;
        if (cVar4 == null || (startUIC = cVar4.getStartUIC()) == null) {
            return;
        }
        um2.x5.p(startUIC, null, false, 3, null);
    }
}
