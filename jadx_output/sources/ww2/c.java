package ww2;

/* loaded from: classes2.dex */
public final class c implements ww2.b {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f450379b = new java.util.LinkedHashSet();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f450380a;

    public c(boolean z17) {
        this.f450380a = z17;
    }

    @Override // ww2.b
    public java.util.List a(vw2.f event, com.tencent.mm.plugin.finder.model.BaseFinderFeed data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((event instanceof vw2.e) && ((vw2.e) event).f440838b <= 1 && (!this.f450380a || !hc2.b0.i(data))) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_THUMB_LIKE_EDU_TIMESTAMP_LONG;
            long t17 = c17.t(u3Var, 0L);
            long a17 = c01.id.a();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127936se).getValue()).r()).booleanValue()) {
                if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127918re).getValue()).r()).intValue() < 0 || (a17 - t17) / 3600000 < ((java.lang.Number) ((lb2.j) ((jz5.n) r9).getValue()).r()).intValue()) {
                    return arrayList;
                }
            }
            nv2.o oVar = nv2.o.f340558e;
            if (oVar.b(data.getFeedObject().getFeedObject()) != 0 && !oVar.c(data.getFeedObject().getFeedObject())) {
                java.util.Set set = f450379b;
                if (!set.contains(java.lang.Long.valueOf(data.getItemId()))) {
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(a17));
                    set.add(java.lang.Long.valueOf(data.getItemId()));
                    arrayList.add(new vw2.b(500L, 5000L, vw2.c.f440832d));
                }
            }
        }
        return arrayList;
    }

    @Override // ww2.b
    public void b(java.util.List views, com.tencent.mm.plugin.finder.model.BaseFinderFeed data) {
        kotlin.jvm.internal.o.g(views, "views");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList<android.widget.TextView> arrayList = new java.util.ArrayList();
        java.util.Iterator it = views.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            android.widget.TextView textView = lVar.f302833d == vw2.c.f440832d ? (android.widget.TextView) lVar.f302834e : null;
            if (textView != null) {
                arrayList.add(textView);
            }
        }
        for (android.widget.TextView textView2 : arrayList) {
            textView2.setText(textView2.getContext().getString(com.tencent.mm.R.string.mhx));
        }
    }
}
