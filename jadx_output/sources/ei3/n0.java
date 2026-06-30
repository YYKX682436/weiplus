package ei3;

/* loaded from: classes10.dex */
public class n0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.w0 f253113a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ei3.w0 w0Var, android.os.Looper looper) {
        super(looper);
        this.f253113a = w0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        byte[] bArr;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "carson：writeYuvData ");
        if (message.what != 1 || (bArr = (byte[]) message.obj) == null || this.f253113a.f253169i == null) {
            return;
        }
        ei3.w0 w0Var = this.f253113a;
        java.util.Objects.toString(w0Var.f253169i);
        synchronized (w0Var.f253161a) {
            if (w0Var.f253169i != null) {
                w0Var.f253186z.a(1L);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                android.os.SystemClock.elapsedRealtime();
                w0Var.f253169i.h(bArr, bArr.length, w0Var.f253174n, w0Var.f253175o);
                android.os.SystemClock.elapsedRealtime();
                if (!w0Var.f253183w && w0Var.K) {
                    w0Var.f253183w = true;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    s75.d.b(new ei3.v0(w0Var, bArr2), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
                }
                w0Var.D = true;
            }
        }
    }
}
