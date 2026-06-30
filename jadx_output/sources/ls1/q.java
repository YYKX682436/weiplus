package ls1;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321007a;

    public q(ls1.e0 e0Var) {
        this.f321007a = e0Var;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String __getString() {
        java.lang.String str = this.f321007a.Y1;
        if (str != null) {
            com.tencent.mm.vfs.r6 c17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.c(com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94439e, str);
            return c17 != null ? com.tencent.mm.vfs.s6.b(c17, null, 1, null) : "";
        }
        kotlin.jvm.internal.o.o("contentId");
        throw null;
    }

    @android.webkit.JavascriptInterface
    public final void __log(java.lang.String str) {
        org.json.JSONObject jSONObject;
        ls1.e0 e0Var = this.f321007a;
        e0Var.getClass();
        if (str == null || (jSONObject = new org.json.JSONObject(str).getJSONObject("err")) == null) {
            return;
        }
        int i17 = jSONObject.getInt("errCode");
        java.lang.String string = jSONObject.getString("msg");
        java.lang.String B1 = e0Var.B1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onWebLog:");
        java.lang.String str2 = e0Var.Y1;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("contentId");
            throw null;
        }
        sb6.append(str2);
        sb6.append(',');
        sb6.append(i17);
        sb6.append(',');
        sb6.append(string);
        com.tencent.mars.xlog.Log.e(B1, sb6.toString());
        ax4.a.c(114);
    }
}
