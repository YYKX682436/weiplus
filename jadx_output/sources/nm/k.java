package nm;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.blink.FirstScreenFrameLayout f338450d;

    public k(com.tencent.mm.blink.FirstScreenFrameLayout firstScreenFrameLayout) {
        this.f338450d = firstScreenFrameLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.blink.FirstScreenFrameLayout firstScreenFrameLayout = this.f338450d;
        nm.l lVar = firstScreenFrameLayout.f63232d;
        if (lVar != null) {
            lVar.a();
            firstScreenFrameLayout.f63232d = null;
        }
    }
}
