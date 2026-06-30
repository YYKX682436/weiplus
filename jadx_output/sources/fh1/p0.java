package fh1;

/* loaded from: classes7.dex */
public final class p0 implements gf.a0 {
    @Override // gf.a0
    public boolean a(int i17, int i18, int i19, int i27) {
        return false;
    }

    @Override // gf.a0
    public boolean b(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onDestroyTexture engineId:" + i17 + " id:" + i18);
        fh1.x0.f262621J.remove(java.lang.Integer.valueOf(i18));
        return true;
    }

    @Override // gf.a0
    public boolean c(int i17, int i18, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        int[] iArr = new int[motionEvent.getPointerCount()];
        float[] fArr = new float[motionEvent.getPointerCount()];
        float[] fArr2 = new float[motionEvent.getPointerCount()];
        int pointerCount = motionEvent.getPointerCount();
        for (int i19 = 0; i19 < pointerCount; i19++) {
            iArr[i19] = motionEvent.getPointerId(i19);
            fArr[i19] = motionEvent.getX(i19);
            fArr2[i19] = motionEvent.getY(i19);
        }
        fh1.o0 o0Var = (fh1.o0) fh1.x0.f262621J.get(java.lang.Integer.valueOf(i18));
        if (o0Var != null) {
            int action = motionEvent.getAction();
            int actionIndex = motionEvent.getActionIndex();
            long eventTime = motionEvent.getEventTime();
            jc3.o oVar = o0Var.f262574c;
            if (oVar != null) {
                ((rc3.w0) oVar).p(o0Var.f262573b, action, actionIndex, eventTime, iArr, fArr, fArr2);
            }
        }
        motionEvent.recycle();
        return true;
    }

    @Override // gf.a0
    public android.graphics.SurfaceTexture d(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCreateTexture id:" + i18);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.HashMap hashMap = fh1.x0.f262621J;
        hashMap.put(valueOf, new fh1.o0());
        java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i18));
        kotlin.jvm.internal.o.d(obj);
        return ((fh1.o0) obj).f262572a;
    }
}
