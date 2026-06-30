package qe5;

/* loaded from: classes12.dex */
public final class t1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC f362194a;

    public t1(com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC filePreviewUIC) {
        this.f362194a = filePreviewUIC;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewUIC", "Start liteApp preview failed");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePreviewUIC", "Start liteApp preview success");
        com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC filePreviewUIC = this.f362194a;
        filePreviewUIC.f202751h = true;
        kd5.e Y6 = filePreviewUIC.Y6();
        if (Y6 != null) {
            Y6.L = filePreviewUIC.f202751h;
        }
    }
}
