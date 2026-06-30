package ls0;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ls0.r0 r0Var) {
        super(4);
        this.f320844d = r0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        long j17;
        fs0.g gVar;
        long longValue = ((java.lang.Number) obj2).longValue();
        boolean booleanValue = ((java.lang.Boolean) obj4).booleanValue();
        kotlin.jvm.internal.o.g((android.media.MediaCodec.BufferInfo) obj3, "<anonymous parameter 2>");
        ls0.r0 r0Var = this.f320844d;
        r0Var.X++;
        if (!booleanValue && (gVar = r0Var.B) != null) {
            gVar.d(true);
        }
        ls0.r0 r0Var2 = this.f320844d;
        long j18 = r0Var2.f320922z;
        long j19 = 0;
        if (j18 < 0) {
            j19 = longValue;
        } else if (r0Var2.X == 1) {
            r0Var2.f320922z = longValue / 1000;
        } else {
            j19 = longValue - (j18 * 1000);
        }
        if (!r0Var2.f320908l) {
            if (r0Var2.X == 1) {
                j17 = j19;
                r0Var2.H.f((-1) * java.lang.Math.round(((float) 1000) / r0Var2.f320907k) * 1000);
                i17 = 1;
                this.f320844d.f320890b0++;
            } else {
                i17 = 1;
                j17 = j19;
            }
            j19 = j17;
            this.f320844d.H.f(j19);
            this.f320844d.f320890b0 += i17;
        }
        com.tencent.mars.xlog.Log.i(this.f320844d.f320916t, "onDecode, drawPts:" + j19 + ", pts:" + longValue + ", remuxStartTime:" + this.f320844d.f320922z);
        ls0.r0 r0Var3 = this.f320844d;
        float f17 = (((float) j19) / ((float) 1000)) / ((float) (r0Var3.A - r0Var3.f320922z));
        if (f17 >= 0.9f) {
            f17 = 0.9f;
        }
        yz5.l lVar = r0Var3.f320914r;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(f17));
        }
        if (this.f320844d.f320900g0) {
            ls0.r0 r0Var4 = this.f320844d;
            android.graphics.Bitmap bitmap = r0Var4.P;
            if (bitmap != null) {
                ls0.k kVar = r0Var4.F;
                if (kVar != null) {
                    kVar.d(new ls0.e(kVar, true, 1000 * j19, bitmap, null));
                }
            } else {
                ls0.k kVar2 = r0Var4.F;
                if (kVar2 != null) {
                    long j27 = 1000 * j19;
                    yz5.l lVar2 = r0Var4.O;
                    android.graphics.Bitmap bitmap2 = lVar2 != null ? (android.graphics.Bitmap) lVar2.invoke(java.lang.Long.valueOf(j19)) : null;
                    yz5.l lVar3 = this.f320844d.R;
                    kVar2.d(new ls0.e(kVar2, true, j27, bitmap2, lVar3 != null ? (android.graphics.Bitmap) lVar3.invoke(java.lang.Long.valueOf(j19)) : null));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
