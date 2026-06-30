package zg0;

/* loaded from: classes8.dex */
public interface q2 {
    static /* synthetic */ void b(zg0.q2 q2Var, java.lang.String str, java.util.Map map, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUrl");
        }
        if ((i17 & 2) != 0) {
            map = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        ((com.tencent.mm.plugin.webview.core.e3) q2Var).x1(str, map, z17);
    }

    java.lang.String i();

    void j(android.content.Intent intent);
}
