package es;

/* loaded from: classes14.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static es.j f256268a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f256269b = new java.util.LinkedList();

    public static void a(boolean z17, int i17) {
        es.j jVar = f256268a;
        if (jVar != null) {
            ((com.tencent.mm.plugin.lite.n) jVar).getClass();
            al5.a3.a(z17, i17, true);
        }
        java.util.LinkedList linkedList = f256269b;
        if (linkedList.size() <= 0) {
            kd.c.e("MicroMsg.LiteAppSwipeBackHelper", "notifySettle callback stack empty!, open:%B, speed:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
            return;
        }
        es.i iVar = (es.i) ((java.lang.ref.WeakReference) linkedList.get(0)).get();
        if (iVar == null) {
            kd.c.e("MicroMsg.LiteAppSwipeBackHelper", "notifySettle null, open:%B, speed:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.ext.ui.SwipeBackActivity swipeBackActivity = (com.tencent.mm.ext.ui.SwipeBackActivity) iVar;
        if (swipeBackActivity.f64959e == null) {
            swipeBackActivity.f64959e = es.u.a(swipeBackActivity.getWindow(), swipeBackActivity.getSupportActionBar().j());
        }
        android.view.View view = swipeBackActivity.f64959e;
        if (z17) {
            es.g.a(view, i17 <= 0 ? 260L : 130L, 0.0f, 0.0f, null);
        } else {
            es.g.a(view, i17 <= 0 ? 260L : 130L, (view.getWidth() * (-1)) / 3.5f, 0.0f, null);
        }
        kd.c.d("MicroMsg.LiteAppSwipeBackHelper", "notifySettle, open:%B speed:%d callback:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), iVar);
    }

    public static void b(float f17) {
        es.j jVar = f256268a;
        if (jVar != null) {
            ((com.tencent.mm.plugin.lite.n) jVar).getClass();
            al5.a3.b(f17);
        }
        java.util.LinkedList linkedList = f256269b;
        if (linkedList.size() <= 0) {
            kd.c.e("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe callback stack empty!, scrollParent:%f", java.lang.Float.valueOf(f17));
            return;
        }
        es.i iVar = (es.i) ((java.lang.ref.WeakReference) linkedList.get(0)).get();
        if (iVar == null) {
            kd.c.e("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe null, scrollParent:%f", java.lang.Float.valueOf(f17));
            return;
        }
        com.tencent.mm.ext.ui.SwipeBackActivity swipeBackActivity = (com.tencent.mm.ext.ui.SwipeBackActivity) iVar;
        swipeBackActivity.onSwipe(f17);
        kd.c.d("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe scrollParent:%f, callback:%s ", java.lang.Float.valueOf(f17), swipeBackActivity);
    }
}
