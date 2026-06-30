package h34;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.f f278500d;

    public e(h34.f fVar) {
        this.f278500d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h34.f fVar = this.f278500d;
        if (fVar.f278515q) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicFingerPrintRecorder", "tryStartNetscene clientid: %d but netscene is running.", java.lang.Integer.valueOf(fVar.f278517s));
            return;
        }
        synchronized (fVar.f278505d) {
            h34.f fVar2 = this.f278500d;
            int i17 = fVar2.f278506e;
            if (i17 <= 0) {
                return;
            }
            byte[] bArr = new byte[i17];
            java.lang.System.arraycopy(fVar2.f278505d, 0, bArr, 0, i17);
            h34.f fVar3 = this.f278500d;
            fVar3.f278506e = 0;
            long j17 = fVar3.f278508g;
            fVar3.f278515q = true;
            int i18 = fVar3.f278509h;
            int i19 = fVar3.f278507f;
            int i27 = fVar3.f278517s;
            boolean z17 = fVar3.f278516r;
            int i28 = fVar3.f278518t;
            c01.d9.e().g(i18 == 367 ? new h34.k(bArr, i19, j17, i27, z17, i28) : i18 == 408 ? new h34.m(bArr, i19, j17, i27, z17, i28) : null);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|tryStartNetscene";
    }
}
