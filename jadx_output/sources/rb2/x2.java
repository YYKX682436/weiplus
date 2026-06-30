package rb2;

/* loaded from: classes2.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f393822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f393823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393826h;

    public x2(java.lang.Object obj, boolean z17, rb2.z2 z2Var, in5.s0 s0Var, android.view.View view) {
        this.f393822d = obj;
        this.f393823e = z17;
        this.f393824f = z2Var;
        this.f393825g = s0Var;
        this.f393826h = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (kotlin.jvm.internal.o.b(this.f393822d, 2) && this.f393823e) {
            android.content.Context context = this.f393825g.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.view.View recommendContainer = this.f393826h;
            kotlin.jvm.internal.o.f(recommendContainer, "$recommendContainer");
            this.f393824f.getClass();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_RECOMMEND_TEACH_COUNT_INT_SYNC;
            int r17 = c17.r(u3Var, 0);
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_RECOMMEND_TEACH_TIME_LONG_SYNC;
            long t17 = c18.t(u3Var2, 0L);
            if (r17 >= 3 || java.lang.System.currentTimeMillis() - t17 <= 60000) {
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
            gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mm.plugin.finder.view.rm rmVar = new com.tencent.mm.plugin.finder.view.rm(context, null);
            rmVar.setContentView(com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488788e64, (android.view.ViewGroup) null, false));
            if (((android.widget.TextView) rmVar.getContentView().findViewById(com.tencent.mm.R.id.o5r)) != null) {
                rmVar.f132974m = 5000L;
                rmVar.f132972k = -context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                rmVar.c(recommendContainer);
            }
        }
    }
}
