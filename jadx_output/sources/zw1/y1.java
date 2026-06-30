package zw1;

/* loaded from: classes9.dex */
public class y1 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476857d;

    public y1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476857d = collectMainUI;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI;
        java.lang.String str2;
        if (str == null || (str2 = (collectMainUI = this.f476857d).f96412x1) == null || !str.equals(str2)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", collectMainUI.f96412x1, str);
        collectMainUI.o7();
    }
}
