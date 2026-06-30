package el2;

/* loaded from: classes3.dex */
public final class e0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f253781b;

    public e0(el2.i0 i0Var, com.tencent.mm.plugin.lite.s sVar) {
        this.f253780a = i0Var;
        this.f253781b = sVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i(this.f253780a.H, "actionName = " + str);
        try {
            com.tencent.mars.xlog.Log.i(this.f253780a.H, "actionName = " + str + ", data = " + obj);
            el2.i0 i0Var = this.f253780a;
            com.tencent.mm.plugin.lite.s sVar = this.f253781b;
            if (str != null && obj != null) {
                if (kotlin.jvm.internal.o.b(str, "RedEnvelopeCoverSelector/select")) {
                    if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) != null) {
                        java.lang.String optString = ((org.json.JSONObject) obj).optString("url");
                        boolean optBoolean = ((org.json.JSONObject) obj).optBoolean("isPurchase", false);
                        com.tencent.mars.xlog.Log.i(i0Var.H, "url:" + optString + ", isPurchase:" + optBoolean);
                        kotlin.jvm.internal.o.d(optString);
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.assist.x3(optString, 4, null, new el2.d0(optString, i0Var, optBoolean, this)));
                        cl0.g gVar = new cl0.g();
                        gVar.h("errMsg", "");
                        gVar.o("errCode", 0);
                        java.lang.String gVar2 = gVar.toString();
                        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                        com.tencent.mars.xlog.Log.i(i0Var.H, "callback jsonStr:" + gVar2 + " callbackId:" + i17 + " instanceId:" + j17);
                        sVar.c(j17, i17, gVar2);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(i0Var.H, "invalid action");
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(this.f253780a.H, "e = " + e17.getMessage());
        }
        return false;
    }
}
