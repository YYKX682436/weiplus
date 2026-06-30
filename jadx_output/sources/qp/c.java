package qp;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final qp.c f365679d = new qp.c();

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        sb6.append(lp0.b.h0("LivePhoto").o());
        sb6.append('/');
        java.lang.String sb7 = sb6.toString();
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(sb7, false);
        if (s17 != null) {
            java.util.List<com.tencent.mm.vfs.x1> S0 = kz5.n0.S0(s17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoFileManager", "clearVideoTempDir >> dir: " + sb7 + " size: " + S0.size());
            for (com.tencent.mm.vfs.x1 x1Var : S0) {
                java.lang.String str = sb7 + x1Var.f213232b;
                java.lang.String name = x1Var.f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                if (r26.n0.B(name, "sns_mj_template_", false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoFileManager", "is sns template no to delete by clear");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoFileManager", "clearVideoTempDir delete file path:" + str + " result: " + com.tencent.mm.vfs.w6.h(str));
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("count", S0.size());
            f65.q qVar = f65.q.f259959a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            qVar.a("clear_file", 0, currentTimeMillis2, jSONObject2);
        }
    }
}
