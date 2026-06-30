package ts3;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f421663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f421664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f421665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts3.h f421666d;

    public f(ts3.h hVar, boolean z17, android.content.Context context, com.tencent.mm.ui.z9 z9Var) {
        this.f421666d = hVar;
        this.f421663a = z17;
        this.f421664b = context;
        this.f421665c = z9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f421663a;
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-524289) : n17 | 524288));
        r45.u85 u85Var = new r45.u85();
        u85Var.f387136d = 524288;
        u85Var.f387137e = !z17 ? 1 : 0;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
        if (z17) {
            ts3.h.a(true);
            c01.e2.z0(this.f421666d.f421671f, true);
        } else {
            android.content.Context context = this.f421664b;
            ss3.d0.wi(new ts3.e(this, db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.hrc), false, false, null)));
            ts3.h.a(false);
        }
        com.tencent.mm.ui.z9 z9Var = this.f421665c;
        if (z9Var != null) {
            z9Var.onNotifyChange(null, null);
        }
    }
}
