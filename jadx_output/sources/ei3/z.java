package ei3;

/* loaded from: classes10.dex */
public class z implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f253200d;

    public z(ei3.k0 k0Var) {
        this.f253200d = k0Var;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            ei3.k0 k0Var = this.f253200d;
            if (k0Var.f253073c.f253039a == ei3.l.Start) {
                if (!k0Var.f253096z) {
                    k0Var.f253096z = true;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    s75.d.b(new ei3.f0(k0Var, bArr2), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
                }
                if (k0Var.f253090t != null) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 1;
                    obtain.obj = bArr;
                    k0Var.f253090t.sendMessage(obtain);
                }
                return true;
            }
        }
        return false;
    }
}
