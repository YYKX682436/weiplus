package qk;

/* loaded from: classes10.dex */
public class r implements qk.y7 {
    public r(qk.s sVar) {
    }

    @Override // qk.y7
    public void a(qk.g6 g6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingView", "Default [onSelectedFeature] features:%s", g6Var.name());
    }

    @Override // qk.y7
    public void b(qk.g6 g6Var, int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingView", "Default [onSelectedDetailFeature] features:%s index:%s", g6Var.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
    }
}
