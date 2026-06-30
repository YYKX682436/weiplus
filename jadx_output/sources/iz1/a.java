package iz1;

/* loaded from: classes13.dex */
public class a extends dz1.a implements cz1.b, dy1.t, dy1.v {

    /* renamed from: i, reason: collision with root package name */
    public lz1.a f296045i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f296046m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f296047n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f296048o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f296049p = sz1.i.e(new com.tencent.mm.sdk.platformtools.k3() { // from class: iz1.a$$a
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message message) {
            iz1.a aVar = iz1.a.this;
            aVar.getClass();
            int i17 = message.what;
            if (i17 == 1015) {
                try {
                    java.lang.Object obj = message.obj;
                    if (obj != null) {
                        nm5.e eVar = (nm5.e) obj;
                        aVar.V((java.util.List) eVar.a(0), (hz1.a) eVar.a(1), (java.util.Map) eVar.a(2), (java.util.List) eVar.a(3), ((java.lang.Long) eVar.a(4)).longValue());
                    }
                } catch (java.lang.Exception e17) {
                    if (sz1.a.j()) {
                        throw e17;
                    }
                    com.tencent.mars.xlog.Log.e("Amoeba.ViewEventMonitor", "[handleMessage] MSG_VIEW_DOUBLE_TAP throw Exception : " + e17.getMessage() + ", stackTrace : " + sz1.a.f(e17.getStackTrace()));
                    pz1.a.b(e17.getMessage() + ":" + sz1.a.f(e17.getStackTrace()));
                }
            } else if (i17 != 1016) {
                switch (i17) {
                    case 1007:
                        try {
                            java.lang.Object obj2 = message.obj;
                            if (obj2 != null) {
                                nm5.e eVar2 = (nm5.e) obj2;
                                aVar.U((java.util.List) eVar2.a(0), (hz1.a) eVar2.a(1), (java.util.Map) eVar2.a(2), (java.util.List) eVar2.a(3), ((java.lang.Long) eVar2.a(4)).longValue());
                                break;
                            }
                        } catch (java.lang.Exception e18) {
                            if (!sz1.a.j()) {
                                com.tencent.mars.xlog.Log.e("Amoeba.ViewEventMonitor", "[handleMessage] MSG_VIEW_CLICK throw Exception : " + e18.getMessage() + ", stackTrace : " + sz1.a.f(e18.getStackTrace()));
                                pz1.a.b(e18.getMessage() + ":" + sz1.a.f(e18.getStackTrace()));
                                break;
                            } else {
                                throw e18;
                            }
                        }
                        break;
                    case 1008:
                        try {
                            java.lang.Object obj3 = message.obj;
                            if (obj3 != null) {
                                nm5.g gVar = (nm5.g) obj3;
                                aVar.W(((java.lang.Integer) gVar.a(0)).intValue(), (java.util.List) gVar.a(1), (hz1.a) gVar.a(2), (java.util.Map) gVar.a(3), (java.util.List) gVar.a(4), ((java.lang.Long) gVar.a(5)).longValue(), ((java.lang.Integer) gVar.a(6)).intValue());
                                break;
                            }
                        } catch (java.lang.Exception e19) {
                            if (!sz1.a.j()) {
                                com.tencent.mars.xlog.Log.e("Amoeba.ViewEventMonitor", "[handleMessage] MSG_VIEW_EXP throw Exception : " + e19.getMessage() + ", stackTrace : " + sz1.a.f(e19.getStackTrace()));
                                pz1.a.b(e19.getMessage() + ":" + sz1.a.f(e19.getStackTrace()));
                                break;
                            } else {
                                throw e19;
                            }
                        }
                        break;
                    case 1009:
                        try {
                            java.lang.Object obj4 = message.obj;
                            if (obj4 != null) {
                                nm5.g gVar2 = (nm5.g) obj4;
                                aVar.Y(((java.lang.Integer) gVar2.a(0)).intValue(), (java.util.List) gVar2.a(1), (hz1.a) gVar2.a(2), (java.util.Map) gVar2.a(3), (java.util.List) gVar2.a(4), ((java.lang.Long) gVar2.a(5)).longValue(), ((java.lang.Integer) gVar2.a(6)).intValue());
                                break;
                            }
                        } catch (java.lang.Exception e27) {
                            if (!sz1.a.j()) {
                                com.tencent.mars.xlog.Log.e("Amoeba.ViewEventMonitor", "[handleMessage] MSG_VIEW_UNEXP throw Exception : " + e27.getMessage() + ", stackTrace : " + sz1.a.f(e27.getStackTrace()));
                                pz1.a.b(e27.getMessage() + ":" + sz1.a.f(e27.getStackTrace()));
                                break;
                            } else {
                                throw e27;
                            }
                        }
                        break;
                }
            } else {
                try {
                    java.lang.Object obj5 = message.obj;
                    if (obj5 != null) {
                        nm5.e eVar3 = (nm5.e) obj5;
                        aVar.X((java.util.List) eVar3.a(0), (hz1.a) eVar3.a(1), (java.util.Map) eVar3.a(2), (java.util.List) eVar3.a(3), ((java.lang.Long) eVar3.a(4)).longValue());
                    }
                } catch (java.lang.Exception e28) {
                    if (sz1.a.j()) {
                        throw e28;
                    }
                    com.tencent.mars.xlog.Log.e("Amoeba.ViewEventMonitor", "[handleMessage] MSG_VIEW_LONG_PRESS throw Exception : " + e28.getMessage() + ", stackTrace : " + sz1.a.f(e28.getStackTrace()));
                    pz1.a.b(e28.getMessage() + ":" + sz1.a.f(e28.getStackTrace()));
                }
            }
            return false;
        }
    });

    @Override // dy1.t
    public void B(android.view.View view, int i17) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.ViewEventMonitor", "[onViewExpose] viewId : %s, hash : %d", cy1.a.Ui().mj(view), java.lang.Integer.valueOf(view.hashCode()));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f296046m).put(java.lang.Integer.valueOf(view.hashCode()), java.lang.Long.valueOf(currentTimeMillis));
        if (uy1.a.o(view)) {
            vy1.c l17 = uy1.a.l(view, false);
            java.lang.String str = l17 == null ? null : l17.f441444b;
            int hj6 = cy1.a.Ui().hj(view);
            if (u46.l.e(str) && sz1.g.j("view_exp", hj6)) {
                return;
            }
            if ((hj6 & 16) == 0 || uy1.a.f(view, "view_exp_count", 0) <= 0) {
                if (currentTimeMillis - cy1.a.Ui().Vi(view, "view_exp") < cy1.a.Ui().fj(view, "view_exp")) {
                    return;
                }
                sy1.f fVar = cy1.a.Ui().f224690m;
                if (fVar != null) {
                    uy1.a.q(view, "view_expose_app_in_time", java.lang.Long.valueOf(fVar.f413857l));
                }
                uy1.a.u(view, "view_exp", currentTimeMillis);
                uy1.a.v(view, "view_exp");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("expose_type", java.lang.Integer.valueOf(i17));
                hashMap.put("expose_start_time", java.lang.Long.valueOf(currentTimeMillis));
                com.tencent.mm.sdk.platformtools.n3 n3Var = this.f296049p;
                android.os.Message obtainMessage = n3Var.obtainMessage(1008);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(view.hashCode());
                java.util.List b17 = ry1.b.b("view_exp", view);
                hz1.a c17 = sz1.a.c(view);
                java.util.List ij6 = cy1.a.Ui().ij(view, "view_exp");
                java.lang.Long valueOf2 = java.lang.Long.valueOf(currentTimeMillis);
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(hj6);
                nm5.g gVar = new nm5.g();
                gVar.f338513a = new java.lang.Object[]{valueOf, b17, c17, hashMap, ij6, valueOf2, valueOf3};
                obtainMessage.obj = gVar;
                n3Var.sendMessage(obtainMessage);
                lk.a.b(view);
                oz1.d.c().getClass();
                java.lang.String m17 = uy1.a.m(view);
                if (m17 == null || !m17.contains("tab_red_dot_")) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[viewExpose] viewId : ".concat(m17));
                if (view instanceof android.widget.TextView) {
                    ((java.util.concurrent.ConcurrentHashMap) oz1.d.f350221h).put(m17, java.lang.Long.valueOf(currentTimeMillis));
                } else {
                    ((java.util.concurrent.ConcurrentHashMap) oz1.d.f350222i).put(m17, java.lang.Long.valueOf(currentTimeMillis));
                }
            }
        }
    }

    @Override // dz1.a, e42.j0
    public void C(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        Q(view);
    }

    @Override // dz1.a, e42.j0
    public void D(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        Q(view);
    }

    @Override // dy1.t
    public void E(android.view.View view, int i17) {
        long j17;
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.ViewEventMonitor", "[onViewUnExpose] viewId : %s, hash : %d", cy1.a.Ui().mj(view), java.lang.Integer.valueOf(view.hashCode()));
        java.util.HashMap hashMap = (java.util.HashMap) this.f296046m;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(view.hashCode()));
        long j18 = 0;
        if (l17 != null) {
            j17 = l17.longValue();
            hashMap.remove(java.lang.Integer.valueOf(view.hashCode()));
        } else {
            j17 = 0;
        }
        if (uy1.a.o(view)) {
            vy1.c l18 = uy1.a.l(view, false);
            java.lang.String str = l18 == null ? null : l18.f441444b;
            int hj6 = cy1.a.Ui().hj(view);
            if (u46.l.e(str) && sz1.g.j("view_unexp", hj6)) {
                return;
            }
            if ((hj6 & 64) == 0 || uy1.a.f(view, "view_unexp_count", 0) <= 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - cy1.a.Ui().Vi(view, "view_unexp") < cy1.a.Ui().fj(view, "view_unexp")) {
                    return;
                }
                uy1.a.u(view, "view_unexp", currentTimeMillis);
                uy1.a.v(view, "view_unexp");
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("expose_type", java.lang.Integer.valueOf(i17));
                long j19 = currentTimeMillis - j17;
                if (j19 > 0 && j17 != 0) {
                    j18 = j19;
                }
                hashMap2.put("expose_time", java.lang.Long.valueOf(j18));
                hashMap2.put("expose_start_time", java.lang.Long.valueOf(j17));
                com.tencent.mm.sdk.platformtools.n3 n3Var = this.f296049p;
                android.os.Message obtainMessage = n3Var.obtainMessage(1009);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(view.hashCode());
                java.util.List b17 = ry1.b.b("view_unexp", view);
                hz1.a c17 = sz1.a.c(view);
                java.util.List ij6 = cy1.a.Ui().ij(view, "view_unexp");
                java.lang.Long valueOf2 = java.lang.Long.valueOf(currentTimeMillis);
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(hj6);
                nm5.g gVar = new nm5.g();
                gVar.f338513a = new java.lang.Object[]{valueOf, b17, c17, hashMap2, ij6, valueOf2, valueOf3};
                obtainMessage.obj = gVar;
                n3Var.sendMessage(obtainMessage);
                uy1.a.q(view, "view_expose_rate_max", 0);
                lk.a.b(view);
                oz1.d c18 = oz1.d.c();
                c18.getClass();
                final java.lang.String m17 = uy1.a.m(view);
                if (m17 == null || !m17.contains("tab_red_dot_")) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[viewUnExpose] viewId : ".concat(m17));
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
                c18.f350224d.postDelayed(new java.lang.Runnable() { // from class: oz1.d$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.view.View view2 = (android.view.View) weakReference.get();
                        boolean z17 = view2 instanceof android.widget.TextView;
                        java.lang.String str2 = m17;
                        if (!z17) {
                            ((java.util.concurrent.ConcurrentHashMap) oz1.d.f350222i).remove(str2);
                            return;
                        }
                        ((java.util.concurrent.ConcurrentHashMap) oz1.d.f350221h).remove(str2);
                        java.lang.CharSequence text = ((android.widget.TextView) view2).getText();
                        if (text == null || u46.l.e(text.toString())) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view2, "red_dot_content", "");
                        }
                    }
                }, 500L);
            }
        }
    }

    @Override // dz1.a, e42.j0
    public void K(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        S(view);
    }

    public final void P(iz1.b bVar) {
        iz1.b bVar2;
        if (bVar == null) {
            return;
        }
        int i17 = bVar.f296059b;
        java.util.List list = this.f296048o;
        if (i17 == 0) {
            if (((java.util.ArrayList) list).contains(bVar.f296060c)) {
                return;
            }
        }
        boolean z17 = true;
        if (bVar.f296059b == 1) {
            if (!((java.util.ArrayList) list).contains(bVar.f296060c)) {
                return;
            }
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f296047n;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar2 = null;
                break;
            }
            bVar2 = (iz1.b) it.next();
            if (u46.l.c(bVar.f296060c, bVar2.f296060c)) {
                long j17 = bVar.f296063f;
                long j18 = bVar2.f296063f;
                if ((j17 > j18 ? j17 - j18 : j18 - j17) > 500) {
                    continue;
                } else {
                    int i18 = bVar.f296059b;
                    if (i18 == bVar2.f296059b) {
                        z17 = false;
                    } else {
                        if (i18 == 0) {
                            try {
                                ((java.util.HashMap) this.f296046m).put(java.lang.Integer.valueOf(bVar.f296058a), (java.lang.Long) bVar2.f296061d.get("expose_start_time"));
                            } catch (java.lang.Exception unused) {
                            }
                        }
                        z17 = false;
                    }
                }
            }
        }
        if (bVar2 != null) {
            arrayList.remove(bVar2);
        }
        if (z17) {
            arrayList.add(bVar);
        }
        sz1.i.f413941b.postDelayed(new java.lang.Runnable() { // from class: iz1.a$$d
            @Override // java.lang.Runnable
            public final void run() {
                iz1.a aVar = iz1.a.this;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) aVar.f296047n;
                if (arrayList2.size() == 0) {
                    return;
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    iz1.b bVar3 = (iz1.b) it6.next();
                    int i19 = bVar3.f296059b;
                    java.util.List list2 = aVar.f296048o;
                    if (i19 == 0) {
                        if (!sz1.g.j("view_exp", bVar3.f296064g)) {
                            ((lz1.b) aVar.f296045i).k(bVar3.f296061d, bVar3.f296062e, bVar3.f296063f);
                        }
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
                        if (!arrayList3.contains(bVar3.f296060c)) {
                            arrayList3.add(bVar3.f296060c);
                        }
                    } else if (i19 == 1) {
                        if (!sz1.g.j("view_unexp", bVar3.f296064g)) {
                            ((lz1.b) aVar.f296045i).l(bVar3.f296061d, bVar3.f296062e, bVar3.f296063f);
                        }
                        java.util.ArrayList arrayList4 = (java.util.ArrayList) list2;
                        if (arrayList4.contains(bVar3.f296060c)) {
                            arrayList4.remove(bVar3.f296060c);
                        }
                    }
                }
                arrayList2.clear();
            }
        }, 500L);
    }

    public final void Q(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj() || kz1.e.Di()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.ViewEventMonitor", "[onHellViewClk] viewId : %s, hash : %d", cy1.a.Ui().mj(view), java.lang.Integer.valueOf(view.hashCode()));
        jz1.e.Di().Vi(1, 500L);
        android.view.View view2 = view;
        int i17 = 0;
        while (true) {
            if (i17 < 99) {
                if (!u46.l.e(uy1.a.m(view2))) {
                    view = view2;
                    break;
                }
                java.lang.Object parent = view2.getParent();
                if (parent == null || !(parent instanceof android.view.View)) {
                    break;
                }
                view2 = (android.view.View) parent;
                i17++;
            } else {
                break;
            }
        }
        final java.lang.String m17 = uy1.a.m(view);
        final sy1.f fVar = cy1.a.Ui().f224690m;
        if (fVar != null) {
            if (u46.l.e(m17)) {
                fVar.f413870y = "";
            } else {
                fVar.f413870y = m17;
            }
        }
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        sz1.i.b(new java.lang.Runnable() { // from class: iz1.a$$b
            @Override // java.lang.Runnable
            public final void run() {
                sy1.f fVar2 = sy1.f.this;
                if (fVar2 != null) {
                    java.lang.String str = m17;
                    boolean e17 = u46.l.e(str);
                    long j17 = currentTimeMillis;
                    if (e17) {
                        fVar2.f413853h = "";
                        fVar2.f413854i = j17;
                    } else {
                        fVar2.f413853h = str;
                        fVar2.f413854i = j17;
                    }
                }
            }
        });
        if (!uy1.a.o(view) || sz1.g.j("view_clk", cy1.a.Ui().hj(view))) {
            return;
        }
        if ((cy1.a.Ui().hj(view) & 4) != 0 && uy1.a.f(view, "view_clk_count", 0) > 0) {
            uy1.a.v(view, "view_clk");
            return;
        }
        uy1.a.v(view, "view_clk");
        if (currentTimeMillis - cy1.a.Ui().Vi(view, "view_clk") < cy1.a.Ui().fj(view, "view_clk")) {
            return;
        }
        cy1.a.Ui().Yj(view, "view_clk", currentTimeMillis);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj = ((java.util.HashMap) this.f296046m).get(view);
        if (obj != null) {
            long longValue = ((java.lang.Long) obj).longValue();
            long j17 = 0;
            if (longValue > 0) {
                long j18 = currentTimeMillis - longValue;
                if (j18 > 0 && longValue != 0) {
                    j17 = j18;
                }
                hashMap.put("expose_time", java.lang.Long.valueOf(j17));
                hashMap.put("expose_start_time", java.lang.Long.valueOf(longValue));
            }
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f296049p;
        android.os.Message obtainMessage = n3Var.obtainMessage(1007);
        obtainMessage.obj = nm5.j.f(ry1.b.b("view_clk", view), sz1.a.c(view), hashMap, cy1.a.Ui().ij(view, "view_clk"), java.lang.Long.valueOf(currentTimeMillis));
        n3Var.sendMessage(obtainMessage);
    }

    public void R(android.view.View view) {
        yy1.b bVar;
        java.lang.Object c17;
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.ViewEventMonitor", "[onViewClick] viewId : %s, hash : %d", cy1.a.Ui().mj(view), java.lang.Integer.valueOf(view.hashCode()));
        android.view.View view2 = view;
        int i17 = 0;
        while (true) {
            if (i17 < 99) {
                if (!u46.l.e(uy1.a.m(view2))) {
                    view = view2;
                    break;
                }
                java.lang.Object parent = view2.getParent();
                if (parent == null || !(parent instanceof android.view.View)) {
                    break;
                }
                view2 = (android.view.View) parent;
                i17++;
            } else {
                break;
            }
        }
        final java.lang.String m17 = uy1.a.m(view);
        final sy1.f fVar = cy1.a.Ui().f224690m;
        if (fVar != null) {
            if (u46.l.e(m17)) {
                fVar.f413870y = "";
            } else {
                fVar.f413870y = m17;
            }
        }
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        sz1.i.b(new java.lang.Runnable() { // from class: iz1.a$$c
            @Override // java.lang.Runnable
            public final void run() {
                sy1.f fVar2 = sy1.f.this;
                if (fVar2 != null) {
                    java.lang.String str = m17;
                    boolean e17 = u46.l.e(str);
                    long j17 = currentTimeMillis;
                    if (e17) {
                        fVar2.f413853h = "";
                        fVar2.f413854i = j17;
                    } else {
                        fVar2.f413853h = str;
                        fVar2.f413854i = j17;
                    }
                }
            }
        });
        if (sz1.a.j() && (bVar = cy1.a.Ui().f224686f.f413837c) != null) {
            java.util.Map a17 = ((yy1.a) bVar).a(ry1.b.b("view_clk", view), ry1.b.a("view_clk", null), null, "view_clk");
            if (((java.util.HashMap) a17).size() > 0 && (c17 = sz1.f.c(a17)) != null) {
                ((g62.b) ((e42.a0) i95.n0.c(e42.a0.class))).Ai(0, 2, c17.toString());
            }
        }
        if (!uy1.a.o(view) || sz1.g.j("view_clk", cy1.a.Ui().hj(view))) {
            return;
        }
        if ((cy1.a.Ui().hj(view) & 4) != 0 && uy1.a.f(view, "view_clk_count", 0) > 0) {
            uy1.a.v(view, "view_clk");
            return;
        }
        uy1.a.v(view, "view_clk");
        long Vi = cy1.a.Ui().Vi(view, "view_clk");
        long fj6 = cy1.a.Ui().fj(view, "view_clk");
        if (fj6 <= 0 && cy1.a.Ui().f224686f != null) {
            fj6 = 0;
        }
        if (currentTimeMillis - Vi < fj6) {
            return;
        }
        cy1.a.Ui().Yj(view, "view_clk", currentTimeMillis);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj = ((java.util.HashMap) this.f296046m).get(java.lang.Integer.valueOf(view.hashCode()));
        long longValue = obj != null ? ((java.lang.Long) obj).longValue() : 0L;
        long j17 = currentTimeMillis - longValue;
        if (j17 <= 0 || longValue <= 0) {
            j17 = 0;
        }
        if (longValue > 0) {
            hashMap.put("expose_time", java.lang.Long.valueOf(j17));
            hashMap.put("expose_start_time", java.lang.Long.valueOf(longValue));
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f296049p;
        android.os.Message obtainMessage = n3Var.obtainMessage(1007);
        obtainMessage.obj = nm5.j.f(ry1.b.b("view_clk", view), sz1.a.c(view), hashMap, cy1.a.Ui().ij(view, "view_clk"), java.lang.Long.valueOf(currentTimeMillis));
        n3Var.sendMessage(obtainMessage);
        lk.a.b(view);
    }

    public void S(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.ViewEventMonitor", "[onViewDoubleTap] viewId : %s, hash : %d", cy1.a.Ui().mj(view), java.lang.Integer.valueOf(view.hashCode()));
        if (!uy1.a.o(view) || sz1.g.j("view_double_tap", cy1.a.Ui().hj(view))) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - cy1.a.Ui().Vi(view, "view_double_tap") < cy1.a.Ui().fj(view, "view_double_tap")) {
            return;
        }
        cy1.a.Ui().Yj(view, "view_double_tap", currentTimeMillis);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj = ((java.util.HashMap) this.f296046m).get(java.lang.Integer.valueOf(view.hashCode()));
        long longValue = obj != null ? ((java.lang.Long) obj).longValue() : 0L;
        long j17 = currentTimeMillis - longValue;
        if (j17 <= 0 || longValue <= 0) {
            j17 = 0;
        }
        if (longValue > 0) {
            hashMap.put("expose_time", java.lang.Long.valueOf(j17));
            hashMap.put("expose_start_time", java.lang.Long.valueOf(longValue));
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f296049p;
        android.os.Message obtainMessage = n3Var.obtainMessage(1015);
        obtainMessage.obj = nm5.j.f(ry1.b.b("view_double_tap", view), sz1.a.c(view), hashMap, cy1.a.Ui().ij(view, "view_double_tap"), java.lang.Long.valueOf(currentTimeMillis));
        n3Var.sendMessage(obtainMessage);
        lk.a.b(view);
    }

    public void T(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.ViewEventMonitor", "[onViewLongPress] viewId : %s, hash : %d", cy1.a.Ui().mj(view), java.lang.Integer.valueOf(view.hashCode()));
        if (!uy1.a.o(view) || sz1.g.j("view_long_press", cy1.a.Ui().hj(view))) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - cy1.a.Ui().Vi(view, "view_long_press") < cy1.a.Ui().fj(view, "view_long_press")) {
            return;
        }
        cy1.a.Ui().Yj(view, "view_long_press", currentTimeMillis);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj = ((java.util.HashMap) this.f296046m).get(java.lang.Integer.valueOf(view.hashCode()));
        long longValue = obj != null ? ((java.lang.Long) obj).longValue() : 0L;
        long j17 = currentTimeMillis - longValue;
        if (j17 <= 0 || longValue <= 0) {
            j17 = 0;
        }
        if (longValue > 0) {
            hashMap.put("expose_time", java.lang.Long.valueOf(j17));
            hashMap.put("expose_start_time", java.lang.Long.valueOf(longValue));
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f296049p;
        android.os.Message obtainMessage = n3Var.obtainMessage(1016);
        obtainMessage.obj = nm5.j.f(ry1.b.b("view_long_press", view), sz1.a.c(view), hashMap, cy1.a.Ui().ij(view, "view_long_press"), java.lang.Long.valueOf(currentTimeMillis));
        n3Var.sendMessage(obtainMessage);
        lk.a.b(view);
    }

    public final void U(java.util.List list, hz1.a aVar, java.util.Map map, java.util.List list2, long j17) {
        sy1.f fVar;
        if (this.f296045i == null) {
            return;
        }
        if (aVar == null && (fVar = cy1.a.Ui().f224690m) != null) {
            aVar = fVar.f413847b;
        }
        yy1.b bVar = cy1.a.Ui().f224686f.f413837c;
        java.util.Map a17 = bVar != null ? ((yy1.a) bVar).a(list, ry1.b.a("view_clk", ry1.b.d(aVar)), map, "view_clk") : null;
        ((lz1.b) this.f296045i).getClass();
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onViewClk] time : %d", java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(a17);
        cy1.a.Ui().Lj(j17, "view_clk", hashMap, list2);
        oz1.e.a().f(j17, "view_clk", null, hashMap);
    }

    public final void V(java.util.List list, hz1.a aVar, java.util.Map map, java.util.List list2, long j17) {
        sy1.f fVar;
        if (this.f296045i == null) {
            return;
        }
        if (aVar == null && (fVar = cy1.a.Ui().f224690m) != null) {
            aVar = fVar.f413847b;
        }
        yy1.b bVar = cy1.a.Ui().f224686f.f413837c;
        java.util.Map a17 = bVar != null ? ((yy1.a) bVar).a(list, ry1.b.a("view_double_tap", ry1.b.d(aVar)), map, "view_double_tap") : null;
        ((lz1.b) this.f296045i).getClass();
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onViewDoubleTap] time : %d", java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(a17);
        cy1.a.Ui().Lj(j17, "view_double_tap", hashMap, list2);
        oz1.e.a().f(j17, "view_double_tap", null, hashMap);
    }

    public final void W(int i17, java.util.List list, hz1.a aVar, java.util.Map map, java.util.List list2, long j17, int i18) {
        sy1.f fVar;
        if (this.f296045i == null) {
            return;
        }
        if (aVar == null && (fVar = cy1.a.Ui().f224690m) != null) {
            aVar = fVar.f413847b;
        }
        yy1.b bVar = cy1.a.Ui().f224686f.f413837c;
        java.util.Map a17 = bVar != null ? ((yy1.a) bVar).a(list, ry1.b.a("view_exp", ry1.b.d(aVar)), map, "view_exp") : null;
        com.tencent.mars.xlog.Log.i("Amoeba.ViewEventMonitor", "[viewExp] viewId : " + a17.get("view_id"));
        java.lang.Object obj = a17.get("view_unique_id");
        if (obj != null && (obj instanceof java.lang.String)) {
            java.lang.String str = (java.lang.String) obj;
            if (!u46.l.e(str)) {
                iz1.b bVar2 = new iz1.b(this);
                bVar2.f296058a = i17;
                bVar2.f296059b = 0;
                bVar2.f296060c = str;
                bVar2.f296061d = a17;
                bVar2.f296062e = list2;
                bVar2.f296063f = j17;
                bVar2.f296064g = i18;
                P(bVar2);
                return;
            }
        }
        ((lz1.b) this.f296045i).k(a17, list2, j17);
    }

    public final void X(java.util.List list, hz1.a aVar, java.util.Map map, java.util.List list2, long j17) {
        sy1.f fVar;
        if (this.f296045i == null) {
            return;
        }
        if (aVar == null && (fVar = cy1.a.Ui().f224690m) != null) {
            aVar = fVar.f413847b;
        }
        yy1.b bVar = cy1.a.Ui().f224686f.f413837c;
        java.util.Map a17 = bVar != null ? ((yy1.a) bVar).a(list, ry1.b.a("view_long_press", ry1.b.d(aVar)), map, "view_long_press") : null;
        ((lz1.b) this.f296045i).getClass();
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onViewLongPress] time : %d", java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(a17);
        cy1.a.Ui().Lj(j17, "view_long_press", hashMap, list2);
        oz1.e.a().f(j17, "view_long_press", null, hashMap);
    }

    public final void Y(int i17, java.util.List list, hz1.a aVar, java.util.Map map, java.util.List list2, long j17, int i18) {
        sy1.f fVar;
        if (this.f296045i == null) {
            return;
        }
        if (aVar == null && (fVar = cy1.a.Ui().f224690m) != null) {
            aVar = fVar.f413847b;
        }
        yy1.b bVar = cy1.a.Ui().f224686f.f413837c;
        java.util.Map a17 = bVar != null ? ((yy1.a) bVar).a(list, ry1.b.a("view_unexp", ry1.b.d(aVar)), map, "view_unexp") : null;
        com.tencent.mars.xlog.Log.i("Amoeba.ViewEventMonitor", "[viewUnExp] viewId : " + a17.get("view_id"));
        java.lang.Object obj = a17.get("view_unique_id");
        if (obj != null && (obj instanceof java.lang.String)) {
            java.lang.String str = (java.lang.String) obj;
            if (!u46.l.e(str)) {
                iz1.b bVar2 = new iz1.b(this);
                bVar2.f296058a = i17;
                bVar2.f296059b = 1;
                bVar2.f296060c = str;
                bVar2.f296061d = a17;
                bVar2.f296062e = list2;
                bVar2.f296063f = j17;
                bVar2.f296064g = i18;
                P(bVar2);
                return;
            }
        }
        ((lz1.b) this.f296045i).l(a17, list2, j17);
    }

    @Override // dz1.a, e42.j0
    public void b(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        T(view);
    }

    @Override // dz1.a, e42.j0
    public void e(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        Q(view);
    }

    @Override // dz1.a, e42.j0
    public void h(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        Q(view);
    }

    @Override // dz1.a, e42.j0
    public void k(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        T(view);
    }

    @Override // dz1.a, e42.j0
    public void l(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        Q(view);
    }

    @Override // dz1.a, e42.j0
    public void x(android.view.View view) {
        if (view == null || !cy1.a.Ui().oj()) {
            return;
        }
        Q(view);
    }
}
