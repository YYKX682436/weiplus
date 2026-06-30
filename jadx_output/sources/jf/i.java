package jf;

/* loaded from: classes7.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f299334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f299335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f299336f;

    public i(java.lang.String str, android.content.Context context, com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f299334d = str;
        this.f299335e = context;
        this.f299336f = bVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            jf.q.f299342a.b(this.f299334d, 0);
            ((ku5.t0) ku5.t0.f312615d).B(new jf.g(this.f299335e, this.f299336f));
            return;
        }
        if (itemId == 1) {
            jf.q.f299342a.b(this.f299334d, 1);
            ((ku5.t0) ku5.t0.f312615d).B(new jf.e(this.f299335e, this.f299336f));
            return;
        }
        if (itemId != 2) {
            jf.q.f299342a.b(this.f299334d, 0);
            ((ku5.t0) ku5.t0.f312615d).B(new jf.h(this.f299335e, this.f299336f));
            return;
        }
        jf.q.f299342a.b(this.f299334d, 2);
        ((ku5.t0) ku5.t0.f312615d).B(new jf.f(this.f299335e, this.f299336f));
    }
}
