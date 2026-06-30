package zl1;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.p f473602d;

    public o(zl1.p pVar) {
        this.f473602d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.p pVar = this.f473602d;
        if (pVar.f473604e.getParent() instanceof zl1.q) {
            ((com.tencent.mm.plugin.appbrand.page.l2) ((zl1.q) pVar.f473604e.getParent())).a(pVar.f473604e, true);
        }
    }
}
