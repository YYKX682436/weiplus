package lh3;

/* loaded from: classes7.dex */
public class m implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh3.n f318685d;

    public m(lh3.n nVar) {
        this.f318685d = nVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SimcardService", "account not init.");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "CheckMobileSIMType Timer");
        lh3.n nVar = this.f318685d;
        if (nVar.f318693h == 0) {
            nVar.wi(0);
        } else {
            nVar.wi(3);
        }
        return true;
    }
}
