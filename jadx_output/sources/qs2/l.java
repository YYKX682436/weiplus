package qs2;

/* loaded from: classes4.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f366307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f366308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f366311h;

    public l(android.content.Intent intent, int i17, java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f366307d = intent;
        this.f366308e = i17;
        this.f366309f = str;
        this.f366310g = str2;
        this.f366311h = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = this.f366307d;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (itemId == 2) {
            intent.putExtra("key_finder_post_router", 3);
        }
        intent.putExtra("key_finder_post_from", this.f366308e);
        intent.putExtra("key_finder_post_id", this.f366309f);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", this.f366310g);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(this.f366311h, intent);
    }
}
