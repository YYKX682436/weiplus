package os3;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.m f348129d;

    public k(os3.m mVar) {
        this.f348129d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.m mVar = this.f348129d;
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = mVar.f348147d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(mVar.f348147d.getString(com.tencent.mm.R.string.f491071bs5));
        sb6.append(" : ");
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage2 = mVar.f348147d;
        int i17 = com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.F;
        sb6.append(attachDownloadPage2.Z6(false));
        dp.a.makeText(attachDownloadPage, sb6.toString(), 5000).show();
        mVar.f348147d.b7();
    }
}
