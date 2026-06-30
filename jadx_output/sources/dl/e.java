package dl;

/* loaded from: classes10.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl.b f235090d;

    public e(dl.b bVar) {
        this.f235090d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.b bVar = this.f235090d;
        bVar.C();
        bVar.r();
        bVar.f235048j = null;
    }
}
