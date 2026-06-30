package na1;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "onStartReportCanvasData";

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.ipc.l0 f335951i;

    public void x(com.tencent.mm.plugin.appbrand.e9 e9Var, na1.c cVar, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OnStartReportCanvasDataEvent", "hy: trigger event %d", java.lang.Integer.valueOf(cVar.f335950d));
        u(e9Var);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("event", java.lang.Integer.valueOf(cVar.f335950d));
        hashMap.put("viewId", java.lang.Integer.valueOf(i17));
        t(hashMap);
        m();
    }
}
