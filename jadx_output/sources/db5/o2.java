package db5;

/* loaded from: classes15.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridPaper f228454d;

    public o2(com.tencent.mm.ui.base.MMGridPaper mMGridPaper) {
        this.f228454d = mMGridPaper;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.MMGridPaper", "post do setDotView");
        int i17 = com.tencent.mm.ui.base.MMGridPaper.N;
        this.f228454d.f();
    }
}
