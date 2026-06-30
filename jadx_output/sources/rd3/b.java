package rd3;

/* loaded from: classes7.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd3.e f394238d;

    public b(rd3.e eVar) {
        this.f394238d = eVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("idx", java.lang.Integer.valueOf(menuItem.getItemId()));
        rd3.e eVar = this.f394238d;
        eVar.s().invoke(eVar.l(hashMap));
    }
}
