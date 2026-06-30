package ts3;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421696d;

    public q(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI) {
        this.f421696d = readerAppUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.f421696d;
        ((ts3.d0) readerAppUI.f155059g).t(readerAppUI.f155056d.getFirstVisiblePosition(), readerAppUI.f155056d.getLastVisiblePosition());
    }
}
