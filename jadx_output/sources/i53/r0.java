package i53;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f288703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.v0 f288704e;

    public r0(i53.v0 v0Var, int i17) {
        this.f288704e = v0Var;
        this.f288703d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.v0 v0Var = this.f288704e;
        java.util.LinkedList linkedList = new java.util.LinkedList(v0Var.f288749a);
        java.util.Set set = v0Var.f288750b;
        set.addAll(linkedList);
        com.tencent.mm.plugin.webview.model.i4 bj6 = com.tencent.mm.plugin.webview.modeltools.z.bj();
        com.tencent.mm.plugin.webview.model.n0 n0Var = v0Var.f288759k;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f182937d;
        if (copyOnWriteArraySet != null && n0Var != null && !copyOnWriteArraySet.contains(n0Var)) {
            copyOnWriteArraySet.add(n0Var);
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().b(v0Var.f288758j);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload, list : %s", linkedList.toString());
        v0Var.f288752d = false;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            int i17 = this.f288703d;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload image");
                if (!i53.v0.a(v0Var, str, 20301, 215, 2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload, ret is false, remove: %s", str);
                    ((java.util.HashSet) set).remove(str);
                    m33.o1 o1Var = v0Var.f288753e;
                    if (o1Var != null) {
                        ((u93.m) o1Var).a(false, -1, null, null, null, null);
                    }
                    i53.v0.b(v0Var);
                    return;
                }
            } else if (i17 != 2) {
                continue;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload video");
                if (v0Var.f288757i.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "thumbLocalId is empty");
                } else {
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str);
                    if (b17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameHaowanUploadTask", "get webview file chooser item  by local id failed : %s", str);
                        m33.o1 o1Var2 = v0Var.f288753e;
                        if (o1Var2 != null) {
                            ((u93.m) o1Var2).a(false, -2, null, null, null, null);
                            return;
                        }
                        return;
                    }
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b18 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(v0Var.f288757i);
                    if (b18 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameHaowanUploadTask", "get thumb webview file chooser item  by local id failed : %s", v0Var.f288757i);
                        m33.o1 o1Var3 = v0Var.f288753e;
                        if (o1Var3 != null) {
                            ((u93.m) o1Var3).a(false, -2, null, null, null, null);
                            return;
                        }
                        return;
                    }
                    java.lang.String str2 = b18.f182738g;
                    b17.f182737f = str2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "item.thumFilePath:%s", str2);
                }
                if (!i53.v0.a(v0Var, str, 20302, 214, 2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload, ret is false, remove: %s", str);
                    ((java.util.HashSet) set).remove(str);
                    m33.o1 o1Var4 = v0Var.f288753e;
                    if (o1Var4 != null) {
                        ((u93.m) o1Var4).a(false, -1, null, null, null, null);
                    }
                    i53.v0.b(v0Var);
                    return;
                }
            }
        }
        v0Var.f288752d = true;
    }
}
