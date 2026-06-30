package qd1;

/* loaded from: classes7.dex */
public class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f361617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.f f361618e;

    public d(qd1.f fVar, java.util.Map map) {
        this.f361618e = fVar;
        this.f361617d = map;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        qd1.g gVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tapIndex", java.lang.Integer.valueOf(menuItem.getItemId()));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.Map map = this.f361617d;
        if (map.containsKey(valueOf) && (gVar = qd1.h.f361635g) != null) {
            int intValue = ((java.lang.Integer) map.get(java.lang.Integer.valueOf(i17))).intValue();
            ((cj1.a) gVar).getClass();
            cj1.b.a(intValue);
        }
        qd1.f fVar = this.f361618e;
        fVar.f361627d.a(fVar.f361633m, fVar.f361634n.p("ok", hashMap));
    }
}
