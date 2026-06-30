package fh1;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f262587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f262588e;

    public q0(fq0.x xVar, int i17) {
        this.f262587d = xVar;
        this.f262588e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.lang.Integer num = (java.lang.Integer) fh1.x0.K.get(this.f262587d.f265478b);
        fh1.o0 o0Var = (fh1.o0) fh1.x0.f262621J.get(num);
        jc3.o oVar = fh1.x0.P;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasIdAndFrameSetIdBind canvasId:" + this.f262588e + ", textureId:" + num + ", surfaceTexture:" + o0Var + ", canvasEventConsumer:" + oVar);
        if (o0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclMBFrameBiz", "mbFrameSurface is null, return");
            return;
        }
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclMBFrameBiz", "canvasEventConsumer is null when runnable executes, canvasId:" + this.f262588e + ", return");
            return;
        }
        int i17 = this.f262588e;
        o0Var.f262573b = i17;
        o0Var.f262574c = oVar;
        ((rc3.w0) oVar).pg(i17, (android.view.Surface) ((jz5.n) o0Var.f262575d).getValue(), 100, 100);
        android.util.SparseIntArray sparseIntArray = fh1.x0.M;
        int i18 = this.f262588e;
        synchronized (sparseIntArray) {
            int indexOfKey = sparseIntArray.indexOfKey(i18);
            if (indexOfKey >= 0) {
                sparseIntArray.removeAt(indexOfKey);
                z17 = true;
            } else {
                z17 = false;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasIdAndFrameSetIdBind redraw for canvasId:" + this.f262588e);
            this.f262587d.f();
        }
    }
}
