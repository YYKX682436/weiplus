package z33;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.app.z2 implements com.tencent.mm.app.t5 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("GameChatroomProcListener", "appForegroundListener, onAppBackground(%s)", str);
        s33.n.f402531c = null;
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            gm0.m.r();
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("GameChatroomProcListener", "appForegroundListener, onAppForeground(%s)", str);
        s33.n.f402531c = str;
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            gm0.m.r();
        }
    }
}
