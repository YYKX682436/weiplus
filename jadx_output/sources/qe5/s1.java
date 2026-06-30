package qe5;

/* loaded from: classes12.dex */
public final class s1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC f362190a;

    public s1(com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC filePreviewUIC) {
        this.f362190a = filePreviewUIC;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewUIC", "Start liteApp preview failed");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePreviewUIC", "Start liteApp preview success");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f362190a.P6();
        if (P6 != null) {
            P6.finish();
        }
    }
}
