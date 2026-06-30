package o;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.k f341717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f341718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o.r f341719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o.j f341720g;

    public i(o.j jVar, o.k kVar, android.view.MenuItem menuItem, o.r rVar) {
        this.f341720g = jVar;
        this.f341717d = kVar;
        this.f341718e = menuItem;
        this.f341719f = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o.k kVar = this.f341717d;
        if (kVar != null) {
            o.j jVar = this.f341720g;
            jVar.f341721d.G = true;
            kVar.f341723b.c(false);
            jVar.f341721d.G = false;
        }
        android.view.MenuItem menuItem = this.f341718e;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f341719f.q(menuItem, null, 4);
        }
    }
}
