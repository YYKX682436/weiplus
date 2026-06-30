package fh4;

/* loaded from: classes15.dex */
public class c0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh4.d0 f262670d;

    public c0(fh4.d0 d0Var) {
        this.f262670d = d0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        android.graphics.Canvas lockCanvas;
        float[] fArr;
        fh4.d0 d0Var = this.f262670d;
        float f17 = d0Var.f262686u;
        if (f17 >= d0Var.f262673e && f17 <= d0Var.f262674f && d0Var.f262677i != null && d0Var.f262676h != null && (lockCanvas = d0Var.f262675g.lockCanvas()) != null && d0Var.f262680o != null) {
            lockCanvas.setDrawFilter(d0Var.f262687v);
            float f18 = d0Var.f262686u;
            if (d0Var.f262690y == null) {
                float f19 = d0Var.f262674f;
                d0Var.f262690y = new float[]{f19, f19, f19, f19, f19};
            }
            int i17 = 0;
            while (true) {
                fArr = d0Var.f262690y;
                if (i17 >= fArr.length - 1) {
                    break;
                }
                int i18 = i17 + 1;
                fArr[i17] = fArr[i18];
                i17 = i18;
            }
            fArr[i17] = f18;
            float f27 = ((((fArr[0] + (fArr[1] * 4.0f)) + (fArr[2] * 6.0f)) + (fArr[3] * 4.0f)) + (fArr[4] * 1.0f)) / 16.0f;
            d0Var.f262685t = f27;
            int i19 = (int) f27;
            d0Var.f262680o.set(0, i19, d0Var.f262682q, d0Var.f262681p + i19);
            lockCanvas.drawBitmap(d0Var.f262688w ? d0Var.f262677i : d0Var.f262676h, (android.graphics.Rect) null, d0Var.f262680o, d0Var.f262679n);
            d0Var.f262675g.unlockCanvasAndPost(lockCanvas);
        }
        return d0Var.f262684s;
    }
}
