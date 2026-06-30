package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zz extends com.tencent.mm.plugin.finder.live.plugin.l implements tk2.a {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f115391p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f115392q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f115393r;

    /* renamed from: s, reason: collision with root package name */
    public long f115394s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f115395t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f115391p = statusMonitor;
        this.f115392q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.vz(root, this));
        this.f115393r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.qz(root, this));
        K0(8);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.zz zzVar, java.util.LinkedList linkedList) {
        mm2.h7 h7Var = (mm2.h7) zzVar.P0(mm2.h7.class);
        if (linkedList.size() > 0) {
            com.tencent.mars.xlog.Log.i("MultiStreamPlugin", "notifyMultiStreamUpdate before pos: " + ((mm2.h7) h7Var.business(mm2.h7.class)).f329116h);
            if (((mm2.h7) h7Var.business(mm2.h7.class)).f329116h >= linkedList.size()) {
                ((mm2.h7) h7Var.business(mm2.h7.class)).f329116h = 0;
            }
            java.util.LinkedList linkedList2 = h7Var.f329117i;
            int i17 = ((mm2.h7) h7Var.business(mm2.h7.class)).f329116h;
            r45.la4 la4Var = i17 >= linkedList2.size() ? null : (r45.la4) linkedList2.get(i17);
            java.lang.String str = la4Var != null ? la4Var.f379274e : null;
            int i18 = ((mm2.h7) h7Var.business(mm2.h7.class)).f329116h;
            r45.la4 la4Var2 = i18 >= linkedList.size() ? null : (r45.la4) linkedList.get(i18);
            if (!kotlin.jvm.internal.o.b(str, la4Var2 != null ? la4Var2.f379274e : null)) {
                mm2.h7 h7Var2 = (mm2.h7) h7Var.business(mm2.h7.class);
                java.util.Iterator it = linkedList.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(((r45.la4) it.next()).f379274e, str)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                h7Var2.f329116h = i19;
            }
            if (((mm2.h7) h7Var.business(mm2.h7.class)).f329116h < 0) {
                ((mm2.h7) h7Var.business(mm2.h7.class)).f329116h = 0;
            }
            com.tencent.mars.xlog.Log.i("MultiStreamPlugin", "notifyMultiStreamUpdate pos: " + ((mm2.h7) h7Var.business(mm2.h7.class)).f329116h);
        }
        h7Var.f329117i = linkedList;
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.ka4 ka4Var = ((r45.la4) it6.next()).f379273d;
            ka4Var.S = h7Var.f329123r;
            ka4Var.T = h7Var.f329124s;
            ka4Var.U = h7Var.f329125t;
        }
        zzVar.y1(linkedList);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.live.plugin.l.b1(this, this.f365323d, "MultiStreamPlugin", false, 4, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.pz.f113937a[status.ordinal()] == 1) {
            java.util.LinkedList linkedList = ((mm2.h7) P0(mm2.h7.class)).f329117i;
            com.tencent.mars.xlog.Log.i("MultiStreamPlugin", "initPlugin multiChannelParamsList: " + linkedList.size());
            if (linkedList.size() > 0) {
                dk2.tb tbVar = dk2.ef.f233392k;
                tbVar.f(13);
                r45.e22 e22Var = new r45.e22();
                e22Var.set(0, java.lang.Long.valueOf(this.f115394s));
                tbVar.e(13, e22Var, new com.tencent.mm.plugin.finder.live.plugin.xz(this, r45.a22.class), false);
                K0(0);
                rk2.q w17 = w1();
                w17.getClass();
                com.tencent.mars.xlog.Log.i("MultiStreamWidget", "initWidget");
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$1 = w17.f396474e;
                finderLiveMultiStreamWidget$liveLayoutManager$1.f115991y = -1;
                finderLiveMultiStreamWidget$liveLayoutManager$1.f115989w = 0;
                finderLiveMultiStreamWidget$liveLayoutManager$1.f115990x = false;
                w17.f396480k = true;
                w17.f396475f = -1;
                w17.f396476g = false;
                w17.f396477h = -1;
                w17.f396478i = -1;
                w17.f396479j = false;
                w17.f396483n = true;
                w17.f396481l = "";
                y1(linkedList);
            } else {
                K0(8);
            }
            ((mm2.h7) P0(mm2.h7.class)).f329114f.observe(this, new com.tencent.mm.plugin.finder.live.plugin.rz(this));
            ((mm2.h7) P0(mm2.h7.class)).f329118m.observe(this, new com.tencent.mm.plugin.finder.live.plugin.tz(this));
            ((mm2.h7) P0(mm2.h7.class)).f329119n.observe(this, new com.tencent.mm.plugin.finder.live.plugin.uz(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        com.tencent.mars.xlog.Log.i("MultiStreamPlugin", "multiStreamUnMount: " + hashCode());
        this.f115395t = true;
        dk2.ef.f233392k.f(13);
        if (((jz5.n) this.f115392q).isInitialized()) {
            rk2.q w17 = w1();
            w17.getClass();
            java.util.HashMap hashMap = rk2.d.f396450a;
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) ((com.tencent.mm.plugin.finder.live.plugin.zz) w17.f396470a).X0(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
            mn0.b0 B1 = ob0Var != null ? ob0Var.B1() : null;
            com.tencent.mars.xlog.Log.i("MultiStreamPlayerManager", "onDestroy curPlayer: " + B1);
            java.util.HashMap hashMap2 = rk2.d.f396450a;
            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                if (!kotlin.jvm.internal.o.b(entry.getValue(), B1)) {
                    mn0.b0.C((mn0.b0) entry.getValue(), true, false, false, 6, null);
                    ((mn0.y) ((mn0.b0) entry.getValue())).w();
                }
            }
            hashMap2.clear();
            w17.f396480k = false;
            w17.f396475f = -1;
            w17.f396476g = false;
            w17.f396477h = -1;
            w17.f396478i = -1;
            w17.f396479j = false;
            w17.f396483n = true;
            w17.f396481l = "";
        }
        if (((jz5.n) this.f115393r).isInitialized()) {
            wk2.c cVar = u1().y().f446952h;
            cVar.f446937c.post(new wk2.b(cVar));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void g1(android.content.res.Configuration configuration) {
        rk2.q w17 = w1();
        w17.getClass();
        if (com.tencent.mm.ui.bk.Q()) {
            com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView multiStreamRecyclerView = w17.f396471b;
            int childCount = multiStreamRecyclerView.getChildCount();
            if (childCount >= 0) {
                int i17 = 0;
                while (true) {
                    com.tencent.mars.xlog.Log.i("MultiStreamWidget", "multistream onConfigurationChanged pos: " + i17);
                    android.view.View childAt = multiStreamRecyclerView.getChildAt(i17);
                    com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = childAt instanceof com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout ? (com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout) childAt : null;
                    if (finderLiveMultiStreamViewLayout != null) {
                        finderLiveMultiStreamViewLayout.f(true);
                    }
                    if (i17 == childCount) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView multiStreamRecyclerView2 = w17.f396471b;
            int i18 = w17.f396482m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(multiStreamRecyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            multiStreamRecyclerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(multiStreamRecyclerView2, "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final vk2.h u1() {
        return (vk2.h) ((jz5.n) this.f115393r).getValue();
    }

    public java.lang.String v1() {
        return ((mm2.c1) ((mm2.c1) P0(mm2.c1.class)).business(mm2.c1.class)).t7();
    }

    public final rk2.q w1() {
        return (rk2.q) ((jz5.n) this.f115392q).getValue();
    }

    public void x1(int i17) {
        ((mm2.c1) P0(mm2.c1.class)).N1 = !((mm2.c1) P0(mm2.c1.class)).N1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) P0(mm2.c1.class)).N1);
        this.f115391p.statusChange(qo0.b.Z2, bundle);
    }

    public final void y1(java.util.LinkedList linkedList) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMultiStream size: ");
        sb6.append(linkedList.size());
        sb6.append(" multiStreamData =  ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.la4 la4Var = (r45.la4) it.next();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("stream_id: ");
            sb8.append(la4Var.f379274e);
            sb8.append(" desc: ");
            java.lang.String str2 = la4Var.f379275f;
            if (str2 != null) {
                byte[] decode = android.util.Base64.decode(str2, 0);
                kotlin.jvm.internal.o.f(decode, "decode(...)");
                str = new java.lang.String(decode, r26.c.f368865a);
            } else {
                str = "";
            }
            sb8.append(str);
            sb8.append(" cdnSize: ");
            sb8.append(la4Var.f379273d.f378540m.size());
            sb8.append('\n');
            sb7.append(sb8.toString());
        }
        java.lang.String sb9 = sb7.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        sb6.append(sb9);
        com.tencent.mars.xlog.Log.i("MultiStreamPlugin", sb6.toString());
        if (linkedList.size() <= 0) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.yz(linkedList, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mars.xlog.Log.i("MultiStreamPlugin", "multiStreamMount: " + hashCode());
        this.f115395t = false;
    }
}
