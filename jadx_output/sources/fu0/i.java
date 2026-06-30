package fu0;

/* loaded from: classes5.dex */
public final class i extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fu0.l f266784d;

    public i(fu0.l lVar) {
        this.f266784d = lVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        fu0.l lVar = this.f266784d;
        if (lVar.f266789c) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MJCC.MusicPicking", "onAppBackground: pause music picker");
        lVar.f266796j = true;
        fu0.q qVar = lVar.f266790d;
        if (qVar != null) {
            ev0.t.c(qVar.f222353c, false, null, 3, null);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        fu0.l lVar = this.f266784d;
        if (lVar.f266789c || !lVar.f266796j) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MJCC.MusicPicking", "onAppForeground: resume music picker");
        lVar.f266796j = false;
        fu0.q qVar = lVar.f266790d;
        if (qVar != null) {
            qVar.f222353c.d();
        }
    }
}
