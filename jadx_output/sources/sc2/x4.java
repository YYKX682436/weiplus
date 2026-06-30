package sc2;

/* loaded from: classes2.dex */
public final class x4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b5 f406362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f406363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406365g;

    public x4(sc2.b5 b5Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, android.view.View view) {
        this.f406362d = b5Var;
        this.f406363e = baseFinderFeed;
        this.f406364f = str;
        this.f406365g = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            sc2.a5.a(this.f406362d, this.f406363e, this.f406364f, this.f406365g);
        }
    }
}
