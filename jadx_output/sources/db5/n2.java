package db5;

/* loaded from: classes15.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridPaper f228444d;

    public n2(com.tencent.mm.ui.base.MMGridPaper mMGridPaper) {
        this.f228444d = mMGridPaper;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.MMGridPaper", "post do setDotView");
        int i17 = com.tencent.mm.ui.base.MMGridPaper.N;
        this.f228444d.f();
    }
}
