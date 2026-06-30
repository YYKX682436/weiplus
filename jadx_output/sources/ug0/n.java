package ug0;

/* loaded from: classes8.dex */
public final class n implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug0.q f427467d;

    public n(ug0.q qVar) {
        this.f427467d = qVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotPathDB, changed: " + aVar.f105331e);
        j75.f Ai = this.f427467d.f300267d.Ai();
        if (Ai != null) {
            Ai.B3(new tg0.j2(aVar));
        }
    }
}
