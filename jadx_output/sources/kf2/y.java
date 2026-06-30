package kf2;

/* loaded from: classes.dex */
public final class y implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kf2.a0 f307313a;

    public y(kf2.a0 a0Var) {
        this.f307313a = a0Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.Object obj2;
        kf2.a0 a0Var = this.f307313a;
        com.tencent.mars.xlog.Log.i(a0Var.f307191h, "dispatch actionName:" + str + ", data:" + obj);
        try {
            java.util.Iterator it = ((java.util.ArrayList) ((jz5.n) a0Var.f307192i).getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (r26.i0.p(((kf2.x) obj2).e(), str, true)) {
                    break;
                }
            }
            kf2.x xVar = (kf2.x) obj2;
            if (xVar != null) {
                return xVar.d(j17, str, obj, i17);
            }
            com.tencent.mars.xlog.Log.i(a0Var.f307191h, "no match");
            return false;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(a0Var.f307191h, e17, "JSONException", new java.lang.Object[0]);
            return false;
        }
    }
}
