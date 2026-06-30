package kp;

@j95.b
/* loaded from: classes7.dex */
public final class s extends i95.w implements gz.l {

    /* renamed from: d, reason: collision with root package name */
    public gz.k f310831d;

    public s() {
        com.tencent.wechat.aff.local_connection.d dVar = com.tencent.wechat.aff.local_connection.d.f217358c;
        dVar.k("NearConnectionService@Connected", new kp.o(this));
        dVar.l("NearConnectionService@Disconnected", new kp.p(this));
        dVar.j("NearConnectionService@ConnectFailed", new kp.q(this));
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.wechat.aff.local_connection.g.f217361a = kp.r.f310821a;
    }

    public bw5.yf0 wi(java.lang.String bizName, bw5.ge0 userInfo, bw5.zf0 sessionInfo, bw5.wd0 wd0Var) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(userInfo, "userInfo");
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.NearConnectionService", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            throw new java.lang.RuntimeException("initialize should NOT be called in main thread");
        }
        com.tencent.wechat.aff.local_connection.d.f217358c.i(sessionInfo);
        if (wd0Var != null && wd0Var.f34662d.isEmpty()) {
            bw5.yf0 yf0Var = new bw5.yf0();
            yf0Var.f35471g = 100901;
            boolean[] zArr = yf0Var.f35473i;
            zArr[4] = true;
            yf0Var.f35472h = "IllegalArgument: empty addr info";
            zArr[5] = true;
            return yf0Var;
        }
        if (wd0Var == null) {
            wd0Var = new bw5.wd0();
        }
        java.util.LinkedList linkedList = wd0Var.f34662d;
        kotlin.jvm.internal.o.f(linkedList, "getAddrInfo(...)");
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.vd0 vd0Var = (bw5.vd0) obj;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init AddrInfo[");
            sb6.append(i17);
            sb6.append("]: ip = ");
            sb6.append(vd0Var.f34340g[1] ? vd0Var.f34337d : "");
            sb6.append(", port = ");
            sb6.append(vd0Var.f34338e);
            sb6.append(", addr_type = ");
            sb6.append(vd0Var.f34340g[3] ? vd0Var.f34339f : bw5.u.ADDR_TYPE_WIFI);
            com.tencent.mars.xlog.Log.i("MicroMsg.NearConnectionService", sb6.toString());
            i17 = i18;
        }
        bw5.yf0 e17 = com.tencent.wechat.aff.local_connection.d.f217358c.e(bizName, userInfo, wd0Var);
        kotlin.jvm.internal.o.f(e17, "initialize(...)");
        return e17;
    }
}
