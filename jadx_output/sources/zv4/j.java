package zv4;

/* loaded from: classes7.dex */
public final class j implements qj5.q {
    @Override // qj5.q
    public p15.n b(boolean z17) {
        org.json.JSONObject jSONObject = zv4.m.f476482b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getJumpInfo: ");
        sb6.append(jSONObject != null ? jSONObject.toString() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchSourceImgJumpInfoUtil", sb6.toString());
        p15.n nVar = new p15.n();
        if (jSONObject != null) {
            p15.m mVar = new p15.m();
            mVar.l(16);
            mVar.n(jSONObject.toString());
            nVar.n(mVar);
        }
        return nVar;
    }

    @Override // qj5.q
    public int i() {
        return 4;
    }
}
