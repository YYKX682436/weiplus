package wt1;

/* loaded from: classes15.dex */
public class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.g f449265d;

    public e(wt1.g gVar) {
        this.f449265d = gVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        wt1.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "onTimerExpired, do refresh code one minute");
        wt1.g gVar = this.f449265d;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "onCodeChange()");
        if (gVar.f449269d != null) {
            for (int i17 = 0; i17 < ((java.util.ArrayList) gVar.f449269d).size(); i17++) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) gVar.f449269d).get(i17);
                if (weakReference != null && (fVar = (wt1.f) weakReference.get()) != null) {
                    fVar.F1();
                }
            }
        }
        gVar.d();
        return true;
    }
}
