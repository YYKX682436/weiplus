package cw2;

/* loaded from: classes2.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f224076a;

    /* renamed from: b, reason: collision with root package name */
    public az2.f f224077b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.k0 f224078c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.j0 f224079d;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f224080e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f224081f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224082g;

    public w2(android.content.Context context) {
        this.f224076a = context;
    }

    public final void a() {
        androidx.lifecycle.j0 j0Var;
        az2.f fVar = this.f224077b;
        if (fVar != null) {
            fVar.b();
        }
        this.f224077b = null;
        androidx.lifecycle.k0 k0Var = this.f224078c;
        if (k0Var != null && (j0Var = this.f224079d) != null) {
            j0Var.removeObserver(k0Var);
        }
        this.f224079d = null;
        this.f224078c = null;
        wu5.c cVar = this.f224080e;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f224080e = null;
        this.f224081f = false;
    }

    public final void b(android.view.View view, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        if (view == null) {
            return;
        }
        java.lang.Long valueOf = (finderItem == null || (feedObject = finderItem.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null) ? null : java.lang.Long.valueOf(object_extend.getLong(30));
        if ((valueOf == null || (valueOf.longValue() & 65536) == 0) ? false : true) {
            if (finderItem != null && finderItem.isLongVideo()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo", "updateButtonVisibility", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo", "updateButtonVisibility", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo", "updateButtonVisibility", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo", "updateButtonVisibility", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
