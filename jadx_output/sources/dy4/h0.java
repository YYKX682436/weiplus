package dy4;

/* loaded from: classes15.dex */
public final class h0 implements ye1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244663a;

    public h0(dy4.f1 f1Var) {
        this.f244663a = f1Var;
    }

    public final void a(java.lang.String str) {
        dy4.w wVar = this.f244663a.U;
        if (wVar != null) {
            java.lang.String str2 = wVar.f244715a;
            try {
                com.tencent.mars.xlog.Log.i(str2, "[TRACE_ADAPTIVE] onVideoDownStreamChange selectIndex = ".concat(str == null ? "null" : str));
                org.json.JSONObject c17 = wVar.c();
                if (str == null) {
                    str = "";
                }
                c17.put("selectIndex", str);
                wVar.a("onVideoDownStreamChange", c17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e(str2, "onVideoDownStreamChange fail", e17);
            }
        }
    }
}
