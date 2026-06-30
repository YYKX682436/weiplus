package dw2;

/* loaded from: classes2.dex */
public final class r implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager f244162d;

    public r(com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager) {
        this.f244162d = finderMultiFlowVideoAutoPlayManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 1) {
            com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "data change to check play...");
            int i17 = it.arg1;
            com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager = this.f244162d;
            finderMultiFlowVideoAutoPlayManager.getClass();
            finderMultiFlowVideoAutoPlayManager.f130761h.post(new dw2.p(finderMultiFlowVideoAutoPlayManager, i17));
        }
        return true;
    }
}
