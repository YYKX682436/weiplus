package n22;

/* loaded from: classes9.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f334285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334286g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334287h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f334288i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f334289m;

    public e(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, android.app.Activity activity, int i27) {
        this.f334283d = str;
        this.f334284e = str2;
        this.f334285f = i18;
        this.f334286g = str3;
        this.f334287h = str4;
        this.f334288i = i19;
        this.f334289m = activity;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId != 1001) {
            if (itemId == 1000) {
                y12.k.a(this.f334289m, this.f334283d, this.f334284e, this.f334286g, ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().R(), com.tencent.mm.plugin.emoji.model.EmojiLogic.c(this.f334285f, this.f334283d, this.f334284e, this.f334286g, this.f334287h, this.f334288i, null), 12);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 2, 1, "", java.lang.Integer.valueOf(this.f334285f));
                return;
            }
            return;
        }
        se5.a aVar = new se5.a();
        aVar.l(n13.v.f334140a.a(this.f334283d, this.f334284e, this.f334285f, this.f334286g, this.f334287h, this.f334288i, null));
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334120d.f334139a = 5;
        ((dk5.b0) b0Var).Bi(this.f334289m, aVar, rVar);
    }
}
