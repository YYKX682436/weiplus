package k02;

/* loaded from: classes8.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f303074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k02.k f303075f;

    public f(android.content.Context context, h02.a aVar, k02.k kVar) {
        this.f303073d = context;
        this.f303074e = aVar;
        this.f303075f = kVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        k02.k kVar = this.f303075f;
        h02.a aVar = this.f303074e;
        android.content.Context context = this.f303073d;
        if (itemId == 1) {
            k02.l.e(context, 5, aVar);
            k02.s.b(context, aVar.field_appId, 0);
            if (kVar != null) {
                kVar.d();
                return;
            }
            return;
        }
        k02.l.e(context, 4, aVar);
        k02.s.b(context, aVar.field_appId, 1);
        if (kVar != null) {
            kVar.c();
        }
    }
}
