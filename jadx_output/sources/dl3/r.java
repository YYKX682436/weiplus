package dl3;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n01.b f235343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.s f235344e;

    public r(dl3.s sVar, n01.b bVar) {
        this.f235344e = sVar;
        this.f235343d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl3.s sVar = this.f235344e;
        dl3.i iVar = sVar.f235345a;
        n01.b bVar = this.f235343d;
        iVar.T(bVar.f333836a);
        sVar.f235345a.U(bVar);
        sVar.f235345a.A(bVar.f333836a);
    }
}
