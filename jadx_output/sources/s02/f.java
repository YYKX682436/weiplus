package s02;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f401950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f401951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f401952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s02.g f401953g;

    public f(s02.g gVar, boolean z17, android.app.ProgressDialog progressDialog, android.content.Context context) {
        this.f401953g = gVar;
        this.f401950d = z17;
        this.f401951e = progressDialog;
        this.f401952f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f401953g.getClass();
        int n17 = c01.z1.n();
        boolean z17 = this.f401950d;
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-134217729) : n17 | 134217728));
        r45.u85 u85Var = new r45.u85();
        u85Var.f387136d = 134217728;
        u85Var.f387137e = !z17 ? 1 : 0;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
        if (!z17) {
            c01.w9.k("downloaderapp");
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("downloaderapp");
        }
        com.tencent.mm.sdk.platformtools.u3.i(new s02.e(this), 1000L);
    }
}
