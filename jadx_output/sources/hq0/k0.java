package hq0;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f283028a = new java.util.concurrent.ConcurrentHashMap();

    public final hq0.j0 a(int i17) {
        return (hq0.j0) this.f283028a.get(java.lang.Integer.valueOf(i17));
    }

    public final hq0.j0 b(int i17, java.lang.String str, android.view.View view, cf3.d dVar) {
        com.tencent.mm.sdk.platformtools.Log.c("MagicSclCanvasMgr", "notifyCanvasInfo canvasId:" + i17 + ",frameSetId:" + str, new java.lang.Object[0]);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f283028a;
        hq0.j0 j0Var = (hq0.j0) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            j0Var = new hq0.j0(i17, null, 0, 0, 0, 0, null, null, false, false, false, false, false, false, false, 32766, null);
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), j0Var);
        }
        if (str != null) {
            j0Var.f283013b = str;
        }
        if (view != null) {
            j0Var.f283018g = view;
        }
        if (dVar != null) {
            j0Var.f283019h = dVar;
        }
        return j0Var;
    }
}
