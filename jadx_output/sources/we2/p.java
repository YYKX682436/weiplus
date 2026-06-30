package we2;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public we2.a f445249b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f445248a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: c, reason: collision with root package name */
    public int[] f445250c = new int[0];

    public final void a(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17, java.util.List payloads) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        we2.o oVar = (we2.o) this.f445248a.get(java.lang.Integer.valueOf(msg.getType()));
        if (oVar != null) {
            holder.f21927e.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            boolean z17 = msg instanceof dk2.eg;
            if (!z17 || payloads.isEmpty()) {
                oVar.d(context, holder, msg, i17);
            } else {
                oVar.p(context, holder, msg, i17, payloads);
            }
            if (z17) {
                ((dk2.eg) msg).c(false);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentItemConfig", "invalid type:" + msg.getType());
            android.view.View view = holder.itemView;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/msginterceptor/FinderLiveCommentItemConfig", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/msginterceptor/FinderLiveCommentItemConfig", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final dk2.zf b(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        we2.o oVar = (we2.o) this.f445248a.get(java.lang.Integer.valueOf(msg.getInteger(1)));
        if (oVar != null) {
            return oVar.e(msg);
        }
        return null;
    }

    public final dk2.zf c(r45.t12 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        we2.o oVar = (we2.o) this.f445248a.get(java.lang.Integer.valueOf(msg.getInteger(3)));
        if (oVar != null) {
            return oVar.f(msg);
        }
        return null;
    }

    public final we2.a d() {
        we2.a aVar = this.f445249b;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("commentItemDependency");
        throw null;
    }

    public final yz5.l e(dk2.zf msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        we2.o oVar = (we2.o) this.f445248a.get(java.lang.Integer.valueOf(msg.getType()));
        if (oVar != null) {
            return oVar.c(msg);
        }
        return null;
    }

    public final int[] f() {
        if (this.f445248a.isEmpty()) {
            return new int[0];
        }
        if (this.f445250c.length == this.f445248a.size()) {
            return this.f445250c;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = this.f445248a;
        kotlin.jvm.internal.o.d(map);
        synchronized (map) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((java.util.Map.Entry) it.next()).getKey());
            }
        }
        int[] R0 = kz5.n0.R0(arrayList);
        this.f445250c = R0;
        return R0;
    }

    public final void g(we2.a dep) {
        kotlin.jvm.internal.o.g(dep, "dep");
        this.f445249b = dep;
        i(new fk2.y2(d()));
        i(new fk2.a(d()));
        i(new fk2.s(d()));
        i(new fk2.q(d()));
        i(new fk2.p(d()));
        i(new fk2.r(d()));
        i(new fk2.g0(d()));
        i(new fk2.n0(d()));
        i(new fk2.k1(d()));
        i(new fk2.s1(d()));
        i(new fk2.u1(d()));
        i(new fk2.a2(d()));
        i(new fk2.g2(d()));
        i(new fk2.l2(d()));
        i(new fk2.s2(d()));
        i(new fk2.o2(d(), false));
        i(new fk2.p2(d()));
        i(new fk2.h3(d()));
        i(new fk2.f2(d()));
        i(new fk2.k(d()));
        i(new fk2.r1(d()));
        i(new fk2.d1(d()));
        i(new fk2.h1(d()));
        i(new fk2.i0(d()));
        i(new fk2.i3(d()));
        i(new fk2.z0(d()));
        i(new fk2.y0(d()));
        i(new fk2.s0(d()));
        i(new fk2.i2(d()));
        i(new fk2.n(d()));
        i(new fk2.x2(d()));
        i(new fk2.v2(d()));
        i(new fk2.b(d()));
        i(new fk2.e1(d()));
        i(new fk2.q1(d()));
        i(new fk2.j0(d()));
        i(new fk2.h0(d()));
        i(new fk2.j1(d()));
        i(new fk2.p1(d()));
        i(new fk2.m0(d()));
    }

    public final void h() {
        java.util.Map map = this.f445248a;
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((we2.o) ((java.util.Map.Entry) it.next()).getValue()).o();
        }
        map.clear();
    }

    public final void i(we2.o oVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(oVar.n());
        java.util.Map map = this.f445248a;
        if (map.containsKey(valueOf)) {
            return;
        }
        kotlin.jvm.internal.o.d(map);
        map.put(java.lang.Integer.valueOf(oVar.n()), oVar);
    }
}
