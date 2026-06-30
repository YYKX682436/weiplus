package rg5;

/* loaded from: classes8.dex */
public final class h extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.o f395254d;

    public h(rg5.o oVar) {
        this.f395254d = oVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "onAppBackground activity=" + str);
        this.f395254d.f395266f = false;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "onAppForeground activity=" + str);
        this.f395254d.f395266f = true;
    }
}
