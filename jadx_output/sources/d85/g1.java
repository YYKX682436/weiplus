package d85;

@j95.b
/* loaded from: classes15.dex */
public final class g1 extends i95.w implements d85.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f227194d = 86400000;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if ((r6 - r4) > r32.f227194d) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAccountInitialized(android.content.Context r33) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d85.g1.onAccountInitialized(android.content.Context):void");
    }

    public final void wi(d85.g0 g0Var, d85.f0 f0Var, org.json.JSONArray jSONArray, d85.m0 m0Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", g0Var.f227193e);
        jSONObject.put("biz", f0Var.f227177e);
        if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
            jSONObject.put("status", 1);
        } else {
            jSONObject.put("status", 2);
        }
        g0Var.toString();
        f0Var.toString();
        jSONObject.toString();
        jSONArray.put(jSONObject);
    }
}
