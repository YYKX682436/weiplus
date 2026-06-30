package ug0;

/* loaded from: classes8.dex */
public final class k implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug0.q f427461d;

    public k(ug0.q qVar) {
        this.f427461d = qVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        this.f427461d.getClass();
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        ug0.q qVar = this.f427461d;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "requestRedDotSync by configs.");
        qVar.U6(3003, 8, true, null);
    }
}
