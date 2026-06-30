package mu1;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu1.e f331344d;

    public d(mu1.e eVar) {
        this.f331344d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mu1.e eVar = this.f331344d;
        int B = (i65.a.B(eVar.f331335b) - i65.a.h(eVar.f331335b, com.tencent.mm.R.dimen.f479688cn)) - i65.a.h(eVar.f331335b, com.tencent.mm.R.dimen.f479714d7);
        if (eVar.f331337d.isShown()) {
            B -= i65.a.b(eVar.f331335b, 48);
        }
        if (eVar.f331355q.isShown()) {
            B -= eVar.f331355q.getWidth();
        }
        if (eVar.f331352n.isShown()) {
            B -= i65.a.b(eVar.f331335b, 20);
        }
        if (B > 0) {
            eVar.f331338e.setMaxWidth(B);
        }
    }
}
