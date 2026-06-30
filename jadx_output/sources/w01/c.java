package w01;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f441872a = false;

    /* renamed from: b, reason: collision with root package name */
    public r45.e67 f441873b;

    public void a(java.lang.String str) {
        if (this.f441873b != null) {
            return;
        }
        if (!this.f441872a) {
            r45.b67 b67Var = new r45.b67();
            b67Var.f370578d = 0;
            gm0.j1.n().f273288b.g(new r01.f3(str, 2, b67Var, new r01.v1(new r45.c67(), str)));
            this.f441872a = true;
        }
        r45.e67 e67Var = null;
        try {
            byte[] j17 = com.tencent.mm.sdk.platformtools.o4.N("brandService", 1, null).j(r01.w1.a(str, 2, null));
            r45.e67 e67Var2 = new r45.e67();
            e67Var2.parseFrom(j17);
            e67Var = e67Var2;
        } catch (java.lang.Throwable unused) {
        }
        this.f441873b = e67Var;
    }

    public void b(android.app.Activity activity) {
        java.lang.String str;
        r45.e67 e67Var = this.f441873b;
        if (e67Var == null) {
            return;
        }
        int i17 = e67Var.f373057d;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            r45.g67 g67Var = e67Var.f373059f;
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject();
            wXWebpageObject.webpageUrl = g67Var.f374930d;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXWebpageObject);
            wXMediaMessage.title = g67Var.f374932f;
            wXMediaMessage.description = g67Var.f374933g;
            try {
                wXMediaMessage.thumbData = android.util.Base64.decode(g67Var.f374931e.f192156a, 0);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
            req.transaction = "com.tencent.wework.webpage";
            req.message = wXMediaMessage;
            req.scene = 0;
            w01.b.b(activity, req);
            return;
        }
        r45.f67 f67Var = e67Var.f373058e;
        if (f67Var == null) {
            return;
        }
        java.lang.String str2 = f67Var.f374069d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str = null;
        } else {
            str = g83.a.b() + kk.k.g(str2.getBytes());
        }
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenSdkBridge", "doSendImage bad img_url=" + f67Var.f374069d);
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f342082f = str;
        fVar.f342078b = true;
        fVar.f342077a = true;
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenSdkBridge", "doSendImage fullPath=%s", str);
        n11.a.b().d(f67Var.f374069d, fVar.a(), new w01.a(str, new java.lang.ref.WeakReference(activity)));
    }
}
