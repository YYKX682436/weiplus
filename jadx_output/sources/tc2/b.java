package tc2;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final in5.r f417137a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f417138b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f417139c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f417140d;

    public b(in5.r convert, java.util.List controllerTypeList) {
        kotlin.jvm.internal.o.g(convert, "convert");
        kotlin.jvm.internal.o.g(controllerTypeList, "controllerTypeList");
        this.f417137a = convert;
        this.f417138b = controllerTypeList;
        this.f417139c = "Finder.ConvertControllerHandler";
        this.f417140d = new java.util.HashMap();
    }

    public final java.lang.Object a(in5.s0 holder, java.lang.Class ctrl) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ctrl, "ctrl");
        tc2.g c17 = c(holder);
        if (c17 != null) {
            return c17.b(ctrl);
        }
        return null;
    }

    public final void b(in5.s0 s0Var) {
        tc2.g c17 = c(s0Var);
        if (c17 != null) {
            com.tencent.mars.xlog.Log.w(this.f417139c, "destroyStore " + c17.hashCode());
            java.util.HashSet hashSet = c17.f417144d;
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((tc2.c) it.next()).X6();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear ");
            tc2.f fVar = c17.f417145e;
            sb6.append(fVar.size());
            sb6.append(", ");
            sb6.append(hashSet.size());
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedControllerStore", sb6.toString());
            try {
                hashSet.clear();
                fVar.clear();
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "FinderFeedControllerStore clear");
            }
            c17.f417149i = null;
            c17.f417148h = null;
            c17.f417150m = null;
            this.f417140d.remove(s0Var);
        }
    }

    public final tc2.g c(in5.s0 s0Var) {
        return (tc2.g) this.f417140d.get(s0Var);
    }

    public final void d(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (z17) {
            tc2.g c17 = c(holder);
            if (c17 != null) {
                c17.f417148h = item;
                java.util.Iterator it = c17.f417144d.iterator();
                while (it.hasNext()) {
                    ((tc2.c) it.next()).R6(list);
                }
                return;
            }
            return;
        }
        tc2.g c18 = c(holder);
        java.lang.String str = this.f417139c;
        if (c18 != null) {
            com.tencent.mars.xlog.Log.w(str, "createStore oldStore:" + c18.hashCode());
            b(holder);
        }
        tc2.g gVar = new tc2.g();
        gVar.f417150m = this.f417137a;
        gVar.f417149i = holder;
        gVar.f417148h = item;
        this.f417140d.put(holder, gVar);
        com.tencent.mars.xlog.Log.i(str, "createStore store:" + gVar.hashCode() + ", holder:" + holder.hashCode() + ", item:" + pm0.v.u(item.getItemId()));
        java.util.Iterator it6 = this.f417138b.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            hashSet = gVar.f417144d;
            if (!hasNext) {
                break;
            }
            java.lang.Class cls = (java.lang.Class) it6.next();
            hashSet.add((tc2.c) new androidx.lifecycle.j1(gVar.getViewModel(), new tc2.d(gVar)).b(gVar.c(cls), cls));
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            ((tc2.c) it7.next()).P6();
        }
    }

    public final void e(in5.s0 holder, android.view.View view, android.content.Intent intent) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        tc2.g c17 = c(holder);
        if (c17 == null || (hashSet = c17.f417144d) == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc2.c) it.next()).S6(view, intent);
        }
    }

    public final void f(in5.s0 holder, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        tc2.g c17 = c(holder);
        if (c17 != null) {
            kotlinx.coroutines.y0 y0Var = c17.f417147g;
            if (y0Var != null) {
                kotlinx.coroutines.z0.c(y0Var, null);
            }
            c17.f417147g = null;
            java.util.Iterator it = c17.f417144d.iterator();
            while (it.hasNext()) {
                ((tc2.c) it.next()).U6();
            }
        }
    }

    public final void g(in5.s0 holder, ec2.f ev6) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ev6, "ev");
        tc2.g c17 = c(holder);
        if (c17 == null || (hashSet = c17.f417144d) == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc2.c) it.next()).V6(ev6);
        }
    }

    public final void h(in5.s0 holder, ec2.f ev6) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ev6, "ev");
        tc2.g c17 = c(holder);
        if (c17 == null || (hashSet = c17.f417144d) == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc2.c) it.next()).W6(ev6);
        }
    }
}
