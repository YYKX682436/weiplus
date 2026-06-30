package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class q implements kv.e0, l75.z0, c01.y8, s72.q0 {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.network.s0 f207982i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f207983m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f207984n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f207985o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ListView f207986p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f207987q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f207977d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f207978e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f207979f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f207980g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f207981h = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f207988r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f207989s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f207990t = false;

    @Override // kv.e0
    public void U(java.lang.String str) {
        if (!gm0.j1.a() || gm0.m.r()) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0 || !str.equals(c01.z1.r())) {
            return;
        }
        h();
    }

    public final void a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((s35.b) it.next()).a();
        }
        list.clear();
    }

    @Override // c01.y8
    public void a0() {
        h();
    }

    public final void b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((s35.b) it.next()).d();
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BannerHelper", "releaseBanner");
        if (this.f207990t) {
            this.f207990t = false;
            e(this.f207977d);
            e(this.f207978e);
            e(this.f207979f);
            e(this.f207980g);
            if (gm0.j1.a()) {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ai().f70579a.j(this);
            }
            if (gm0.j1.a()) {
                c01.d9.b().p().e(this);
            }
        }
    }

    public final boolean d(java.util.List list, boolean z17) {
        java.util.Iterator it = list.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            s35.b bVar = (s35.b) it.next();
            if (bVar.i()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[true] :%s, checkAll:%b, isVisible:%b, hc:%d", bVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(bVar.g()), java.lang.Integer.valueOf(hashCode()));
                z18 = true;
                if (!z17) {
                    return true;
                }
            } else if (bVar.g()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[false] but visible :%s, checkAll:%b, hc:%d", bVar, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(hashCode()));
            }
        }
        return z18;
    }

    public final void e(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((s35.b) it.next()).j();
        }
    }

    public final void f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.widget.LinearLayout linearLayout = ((s35.b) it.next()).f402843h;
            if (linearLayout != null) {
                this.f207986p.removeHeaderView(linearLayout);
            }
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (gm0.j1.a() && a1Var == c01.d9.b().p()) {
            int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
            if (8193 == o17) {
                h();
            }
            if (42 == o17) {
                h();
            }
        }
    }

    public void h() {
        if (this.f207988r && this.f207985o != null && gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BannerHelper", "updateBanner, :%d", java.lang.Integer.valueOf(hashCode()));
            boolean d17 = d(this.f207977d, true);
            boolean d18 = d(this.f207978e, true);
            java.util.List list = this.f207979f;
            boolean d19 = d(list, true);
            java.util.List list2 = this.f207980g;
            boolean z17 = d17 || d18 || d19 || d(list2, true);
            if (d18) {
                b(list);
                b(list2);
            } else if (d19) {
                b(list2);
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (s35.b bVar : this.f207981h) {
                if (bVar != null && bVar.g()) {
                    bVar.f402839d = false;
                    bVar.f402840e = false;
                    linkedList.add(bVar);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BannerHelper", "visibleList.size() = %s", java.lang.Integer.valueOf(linkedList.size()));
            if (linkedList.size() > 0) {
                ((s35.b) linkedList.getFirst()).f402839d = true;
                ((s35.b) linkedList.getLast()).f402840e = true;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((s35.b) it.next()).i();
                }
            }
            if (!z17 || this.f207986p.getVisibility() == 0) {
                return;
            }
            this.f207986p.setVisibility(0);
            android.view.View view = this.f207987q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/BannerHelper", "updateBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/BannerHelper", "updateBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
