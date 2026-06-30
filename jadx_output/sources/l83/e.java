package l83;

/* loaded from: classes14.dex */
public class e implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l83.h f317101a;

    public e(l83.h hVar) {
        this.f317101a = hVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f317101a.f317105b) {
            if (com.tencent.mm.plugin.ipcall.model.r.bj().f142482a == 5) {
                l83.h hVar = this.f317101a;
                if (hVar.f317108e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRecorder", "isFirstRecordCallback");
                    hVar.f317108e = false;
                }
                com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a.recordCallback(bArr, i17);
            }
        }
    }
}
