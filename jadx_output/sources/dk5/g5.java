package dk5;

/* loaded from: classes9.dex */
public class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk5.r5 f234639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234640f;

    public g5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.util.List list, dk5.r5 r5Var) {
        this.f234640f = sendAppMessageWrapperUI;
        this.f234638d = list;
        this.f234639e = r5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = 0;
        while (true) {
            java.util.List list = this.f234638d;
            int size = list.size();
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234640f;
            if (i17 >= size) {
                sendAppMessageWrapperUI.runOnUiThread(new dk5.f5(this, hashMap));
                return;
            }
            dk5.p5 p5Var = (dk5.p5) list.get(i17);
            if (p5Var != null) {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                java.lang.String str = p5Var.f234801b;
                if (com.tencent.mm.pluginsdk.model.app.w.e(str) && str.startsWith("content")) {
                    zo3.p.wi();
                    java.lang.String str2 = zo3.p.Ai() + "content_" + java.lang.System.currentTimeMillis();
                    long d17 = com.tencent.mm.vfs.w6.d(str, str2, false);
                    if (d17 <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "run: doCheckAndCopyFile copy file fail");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "doCheckAndCopyFile:ret:%s localFilePath:%s filePath:%s ", java.lang.Long.valueOf(d17), str2, str);
                        hashMap.put(p5Var.f234800a, new dk5.q5(sendAppMessageWrapperUI, str2, str));
                    }
                }
            }
            i17++;
        }
    }
}
