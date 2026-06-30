package dl;

/* loaded from: classes10.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f235146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f235147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl.y f235149g;

    public w(dl.y yVar, boolean z17, boolean z18, java.lang.String str) {
        this.f235149g = yVar;
        this.f235146d = z17;
        this.f235147e = z18;
        this.f235148f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hk0.n g17;
        hk0.n g18;
        dl.y yVar = this.f235149g;
        if (yVar.l() != null && ((this.f235146d || this.f235147e) && (g17 = yVar.l().f281818i.g(this.f235148f)) != null && (g18 = yVar.l().f281818i.g(g17.c())) != null && g18.a() != null)) {
            g18.a().w(false);
            ((um.g) yVar.d()).add(g18.a());
        }
        yVar.E(true);
        yVar.r();
        yVar.f235048j = null;
    }
}
