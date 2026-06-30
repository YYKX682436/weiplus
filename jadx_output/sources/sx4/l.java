package sx4;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx4.n f413627f;

    public l(sx4.n nVar, java.lang.String str, int i17) {
        this.f413627f = nVar;
        this.f413625d = str;
        this.f413626e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx4.n nVar = this.f413627f;
        java.lang.String str = this.f413625d;
        if (str != null) {
            nVar.f413632e.f413638b.setMMTitle(str);
        }
        nVar.f413632e.f413638b.setMMTitleColor(this.f413626e);
    }
}
