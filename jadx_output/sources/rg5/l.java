package rg5;

/* loaded from: classes8.dex */
public final class l implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.o f395258d;

    public l(rg5.o oVar) {
        this.f395258d = oVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        rg5.o oVar = this.f395258d;
        try {
            boolean e17 = oVar.e();
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "rcv redDot. enableLiveEntry=" + e17 + " inForeground=" + oVar.f395266f);
            if (e17 && oVar.f395266f) {
                oVar.d(aVar);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("FinderLiveEntryPreferenceMgr", "handle rcv redDot fail, " + e18);
        }
    }
}
