package i63;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f289042d;

    public z(i63.b0 b0Var) {
        this.f289042d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!((java.util.HashMap) this.f289042d.f288976i).isEmpty()) {
            java.util.Iterator it = ((java.util.HashMap) this.f289042d.f288976i).entrySet().iterator();
            while (it.hasNext()) {
                ua1.b bVar = (ua1.b) ((java.util.Map.Entry) it.next()).getValue();
                if (bVar.f425924b) {
                    this.f289042d.f288977m.c(bVar.f425923a, bVar.f425926d, bVar.f425925c, bVar.a());
                }
            }
            byte[] a17 = this.f289042d.f288977m.a();
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] getData fail");
                return;
            }
            i63.b0 b0Var = this.f289042d;
            float f17 = b0Var.f288982r / b0Var.f288981q;
            for (int i17 = 0; i17 < a17.length; i17 += 2) {
                short s17 = (short) (((short) (((a17[r5] << 8) | (a17[i17] & 255)) & 65535)) * f17);
                a17[i17] = (byte) (s17 & 255);
                a17[i17 + 1] = (byte) ((s17 >> 8) & 255);
            }
            if (((java.lang.Boolean) ((jz5.n) ((p60.u) i95.n0.c(p60.u.class)).f352200d).getValue()).booleanValue()) {
                try {
                    this.f289042d.f288979o.write(a17);
                } catch (java.io.IOException unused) {
                }
            }
            i63.m0 m0Var = new i63.m0((byte[]) a17.clone(), java.lang.System.currentTimeMillis());
            i63.b0 b0Var2 = this.f289042d;
            com.tencent.mm.sdk.platformtools.n3 n3Var = b0Var2.f288974g;
            if (n3Var != null) {
                n3Var.post(new i63.y(b0Var2, m0Var));
            }
        }
        i63.b0 b0Var3 = this.f289042d;
        if (b0Var3.f288978n == 0) {
            b0Var3.f288978n = android.os.SystemClock.uptimeMillis();
        }
        long j17 = 40;
        this.f289042d.f288978n += j17;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (uptimeMillis > this.f289042d.f288978n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "fix next update time, now:%d updateTime:%d", java.lang.Long.valueOf(uptimeMillis), java.lang.Long.valueOf(this.f289042d.f288978n));
            this.f289042d.f288978n = uptimeMillis + j17;
        }
        synchronized (this) {
            i63.b0 b0Var4 = this.f289042d;
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = b0Var4.f288973f;
            if (n3Var2 != null && !b0Var4.f288984t) {
                n3Var2.postAtTime(b0Var4.A, b0Var4.f288978n);
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        i63.b0 b0Var5 = this.f289042d;
        if (currentTimeMillis2 - b0Var5.f288986v > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            b0Var5.f288986v = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "send audio data, cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
