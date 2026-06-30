package i53;

/* loaded from: classes15.dex */
public class u0 implements com.tencent.mm.plugin.webview.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.v0 f288742a;

    public u0(i53.v0 v0Var) {
        this.f288742a = v0Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        i53.v0 v0Var = this.f288742a;
        if (!((java.util.HashSet) v0Var.f288750b).contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "onFinish, not in uploadingList, localId: %s", str);
            return;
        }
        ((java.util.HashSet) v0Var.f288750b).remove(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "success : %b, errCode: %d, localId : %s, mediaId : %s, mediaUrl : %s, thumbUrl: %s costTime: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str, str2, str3, str4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) v0Var.f288751c.remove(str), java.lang.System.currentTimeMillis())));
        p95.a.a(new i53.t0(this, z17, str, str2, str3, i17, str4));
    }
}
