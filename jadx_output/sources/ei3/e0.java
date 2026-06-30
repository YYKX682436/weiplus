package ei3;

/* loaded from: classes10.dex */
public class e0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f253038a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ei3.k0 k0Var, android.os.Looper looper) {
        super(looper);
        this.f253038a = k0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        ei3.k0 k0Var = this.f253038a;
        if (k0Var.f253091u == -1) {
            k0Var.f253091u = android.os.Process.myTid();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "writeCameraTid: %s", java.lang.Integer.valueOf(k0Var.f253091u));
        }
        if (message.what == 1) {
            k0Var.f253071a.d();
            byte[] bArr = (byte[]) message.obj;
            if (k0Var.f253093w) {
                k0Var.f253072b.c(bArr, bArr.length, k0Var.f253085o, k0Var.f253086p);
            } else {
                ei3.y0 y0Var = k0Var.f253072b;
                int length = bArr.length;
                int i17 = k0Var.f253087q;
                y0Var.c(bArr, length, (i17 == 0 || i17 == 180) ? k0Var.f253085o : k0Var.f253086p, (i17 == 0 || i17 == 180) ? k0Var.f253086p : k0Var.f253085o);
            }
            ei3.x.f253187d.o(bArr);
            k0Var.D = true;
        }
    }
}
