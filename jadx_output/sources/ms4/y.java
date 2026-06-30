package ms4;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js4.n f331132d;

    public y(ms4.z zVar, js4.n nVar) {
        this.f331132d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        js4.o oVar = this.f331132d.f301546d;
        if (oVar != null) {
            oVar.a(3, -1, "DirectRecharge productInfo is invalid.");
        }
    }
}
