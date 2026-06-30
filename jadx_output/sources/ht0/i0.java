package ht0;

/* loaded from: classes10.dex */
public class i0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ht0.o0 f284700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ht0.o0 o0Var, android.os.Looper looper) {
        super(looper);
        this.f284700a = o0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        ht0.o0 o0Var = this.f284700a;
        if (o0Var.f284743u == -1) {
            o0Var.f284743u = android.os.Process.myTid();
            com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "writeCameraTid: %s", java.lang.Integer.valueOf(o0Var.f284743u));
        }
        if (message.what == 1) {
            ht0.a aVar = o0Var.f284723a;
            if (aVar != null) {
                aVar.f253133j = true;
            }
            byte[] bArr = (byte[]) message.obj;
            if (o0Var.f284745w) {
                o0Var.f284724b.c(bArr, bArr.length, o0Var.f284737o, o0Var.f284738p);
            } else {
                ei3.y0 y0Var = o0Var.f284724b;
                int length = bArr.length;
                int i17 = o0Var.f284739q;
                y0Var.c(bArr, length, (i17 == 90 || i17 == 270) ? o0Var.f284737o : o0Var.f284738p, (i17 == 90 || i17 == 270) ? o0Var.f284738p : o0Var.f284737o);
            }
            ei3.x.f253187d.o(bArr);
            o0Var.E = true;
        }
    }
}
