package vn2;

/* loaded from: classes2.dex */
public final class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f438416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f438417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f438418h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f438419i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f438420m;

    public y(java.lang.String str, android.content.Context context, r45.qt2 qt2Var, ym5.q1 q1Var, com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f438414d = str;
        this.f438415e = context;
        this.f438416f = qt2Var;
        this.f438417g = q1Var;
        this.f438418h = megaVideoFlowLoader;
        this.f438419i = i17;
        this.f438420m = baseFinderFeed;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            vn2.u0.f438387a.d(this.f438414d, this.f438415e, this.f438416f, this.f438417g, this.f438418h, this.f438419i, this.f438420m, false, true);
        }
    }
}
