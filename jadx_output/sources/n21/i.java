package n21;

/* loaded from: classes8.dex */
public class i extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.o f334270d;

    public i(n21.o oVar) {
        this.f334270d = oVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        n21.o oVar = this.f334270d;
        oVar.getClass();
        android.os.Looper.myQueue().addIdleHandler(new n21.j(oVar));
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.i6 i6Var = this.f334270d.f334277a;
        synchronized (i6Var.f192744f) {
            i6Var.f192740b = true;
        }
    }
}
