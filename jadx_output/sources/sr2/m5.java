package sr2;

/* loaded from: classes.dex */
public final class m5 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f411639d;

    public m5(yz5.l lVar) {
        this.f411639d = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Finder.PostRealNameAuthUIC", "[checkRealName] requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 30001) {
            yz5.l lVar = this.f411639d;
            if (i18 == -1) {
                lVar.invoke(java.lang.Boolean.TRUE);
            } else {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        }
    }
}
