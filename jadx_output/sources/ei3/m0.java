package ei3;

/* loaded from: classes10.dex */
public class m0 implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.w0 f253112d;

    public m0(ei3.w0 w0Var) {
        this.f253112d = w0Var;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preview callback data is null");
            return false;
        }
        ei3.w0 w0Var = this.f253112d;
        ei3.e1 e1Var = w0Var.f253176p;
        ei3.l lVar = e1Var.f253039a;
        ei3.l lVar2 = ei3.l.Start;
        ei3.l lVar3 = ei3.l.PrepareStop;
        if (lVar != lVar2 && lVar != lVar3) {
            return false;
        }
        if (lVar == lVar3) {
            e1Var.f253039a = ei3.l.WaitStop;
        }
        w0Var.A.a(1L);
        ei3.j jVar = this.f253112d.f253168h;
        if (jVar != null) {
            jVar.d();
        }
        ei3.w0 w0Var2 = this.f253112d;
        if (w0Var2.f253169i != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.obj = bArr;
            com.tencent.mm.sdk.platformtools.n3 n3Var = w0Var2.f253180t;
            if (n3Var != null) {
                n3Var.sendMessage(obtain);
            }
        }
        return true;
    }
}
