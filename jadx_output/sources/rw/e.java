package rw;

/* loaded from: classes.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f400573e;

    public e(java.util.List list, yz5.a aVar) {
        this.f400572d = list;
        this.f400573e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ((rw.a) this.f400572d.get(i17)).f400568b.invoke();
        this.f400573e.invoke();
    }
}
