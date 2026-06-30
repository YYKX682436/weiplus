package k53;

/* loaded from: classes8.dex */
public class p0 implements com.tencent.mm.plugin.webview.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f304381a;

    public p0(k53.u0 u0Var) {
        this.f304381a = u0Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        k53.u0 u0Var = this.f304381a;
        if (u0Var.f304398d.equals(str)) {
            android.view.View view = u0Var.f304396b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper$5", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper$5", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.VideoShareWrapper", "success : %b, errCode: %d, localId : %s, mediaId : %s, mediaUrl : %s, costTime: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str, str2, str3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - u0Var.f304401g));
            k53.s0 s0Var = u0Var.f304400f;
            if (s0Var != null) {
                s0Var.a(new k53.t0(u0Var, u0Var.f304399e, str3, str4));
            }
        }
    }
}
