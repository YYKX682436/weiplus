package my3;

/* loaded from: classes13.dex */
public final class z implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.c0 f332846d;

    public z(my3.c0 c0Var) {
        this.f332846d = c0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("code");
        my3.c0 c0Var = this.f332846d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchService", "handshake cgi failed " + i17);
            my3.x xVar = c0Var.f332791f;
            if (xVar != null) {
                ((iy3.c) xVar).a(false, "");
            }
            c0Var.f332791f = null;
        }
        com.tencent.wechat.rtos.WeChatApi weChatApi = c0Var.f332787b;
        if (weChatApi != null) {
            weChatApi.cloudHandShakeEnd(i17, bundle.getInt("taskid"), bundle.getString("handshke"));
        }
    }
}
