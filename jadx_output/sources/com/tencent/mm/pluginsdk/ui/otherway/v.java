package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public class v implements com.tencent.mm.pluginsdk.model.m2, w35.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f191000a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.g2 f191001b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f191002c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f191003d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f191004e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f191005f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f191006g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f191007h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f191008i;

    /* renamed from: j, reason: collision with root package name */
    public kb0.b f191009j;

    /* renamed from: k, reason: collision with root package name */
    public kb0.g f191010k;

    /* renamed from: l, reason: collision with root package name */
    public db5.t4 f191011l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f191012m;

    /* renamed from: n, reason: collision with root package name */
    public rl5.r f191013n;

    public v(android.content.Context context, com.tencent.mm.pluginsdk.model.g2 params) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f191000a = context;
        this.f191001b = params;
        this.f191002c = "MicroMsg.BaseBottomSheetOpenWayEnhance";
        this.f191003d = params.f189308a;
        this.f191004e = new java.util.ArrayList();
        this.f191005f = new java.util.ArrayList();
        this.f191008i = new java.util.HashMap();
        i();
        this.f191012m = new java.util.HashMap();
    }

    public void a(java.util.ArrayList openWayList) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(openWayList, "openWayList");
        if (openWayList.isEmpty()) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.util.Iterator it = openWayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) it.next();
                java.lang.String wi6 = ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).wi(wVar.a());
                if (wi6 == null) {
                    wi6 = wVar.a();
                }
                kotlin.jvm.internal.o.g(wi6, "<set-?>");
                wVar.f191026s = wi6;
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(openWayList, 10));
            java.util.Iterator it6 = openWayList.iterator();
            while (it6.hasNext()) {
                arrayList.add(((com.tencent.mm.pluginsdk.ui.otherway.w) it6.next()).a());
            }
            bundle.putStringArrayList("name_list", new java.util.ArrayList<>(arrayList));
            android.os.Bundle bundle2 = (android.os.Bundle) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.pluginsdk.ui.otherway.b.class);
            if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("pin_yin_list")) != null) {
                int i17 = 0;
                for (java.lang.Object obj : stringArrayList) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str = (java.lang.String) obj;
                    com.tencent.mm.pluginsdk.ui.otherway.w wVar2 = (com.tencent.mm.pluginsdk.ui.otherway.w) kz5.n0.a0(openWayList, i17);
                    if (wVar2 != null) {
                        kotlin.jvm.internal.o.d(str);
                        wVar2.f191026s = str;
                    }
                    i17 = i18;
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f191004e;
        arrayList2.addAll(openWayList);
        this.f191005f = com.tencent.mm.pluginsdk.ui.otherway.h0.f190945a.f(arrayList2, this.f191003d);
        java.lang.ref.WeakReference weakReference = this.f191006g;
        if (weakReference == null || (k0Var = (com.tencent.mm.ui.widget.dialog.k0) weakReference.get()) == null) {
            return;
        }
        f(k0Var);
        androidx.recyclerview.widget.RecyclerView recyclerView = k0Var.G1;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    public void b(java.lang.String str, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        androidx.recyclerview.widget.f2 adapter;
        if (str == null || r26.n0.N(str)) {
            return;
        }
        if (this.f191005f.removeIf(new com.tencent.mm.pluginsdk.ui.otherway.c(str)) && (weakReference = this.f191006g) != null && (k0Var = (com.tencent.mm.ui.widget.dialog.k0) weakReference.get()) != null) {
            f(k0Var);
            androidx.recyclerview.widget.RecyclerView recyclerView = k0Var.G1;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
        if (z17) {
            return;
        }
        this.f191001b.f189314g.add(str);
        this.f191004e.removeIf(new com.tencent.mm.pluginsdk.ui.otherway.d(str));
    }

    public final void c(android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w data) {
        jz5.f0 f0Var;
        yz5.l lVar;
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.ref.WeakReference weakReference = this.f191006g;
        if (weakReference != null && (k0Var = (com.tencent.mm.ui.widget.dialog.k0) weakReference.get()) != null) {
            k0Var.u();
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f191007h;
        if (z2Var != null) {
            z2Var.B();
        }
        com.tencent.mm.pluginsdk.model.f2 f2Var = this.f191001b.f189318k;
        if (f2Var == null || (lVar = f2Var.f189299c) == null) {
            f0Var = null;
        } else {
            lVar.invoke(new com.tencent.mm.pluginsdk.ui.otherway.e(this, context, data));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            d(context, data);
        }
    }

    public final void d(android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i(h(), "clickItem " + wVar.a() + ", " + wVar.h() + ' ' + wVar.b());
        w35.b bVar = (w35.b) this.f191008i.get(java.lang.Integer.valueOf(wVar.h()));
        if (bVar != null) {
            bVar.b(context, wVar);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (wVar.f191018h) {
                l(context);
                return;
            }
            com.tencent.mars.xlog.Log.w(h(), "clickItem, unknown item type: " + wVar.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(com.tencent.mm.ui.widget.dialog.k0 r8) {
        /*
            r7 = this;
            kb0.b r0 = r7.f191009j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            if (r8 == 0) goto Ld
            int r3 = r8.hashCode()
            goto Le
        Ld:
            r3 = r2
        Le:
            int r4 = r0.f306189c
            if (r4 != r3) goto L14
            r0 = r1
            goto L17
        L14:
            r0.f306189c = r3
            r0 = r2
        L17:
            if (r0 != 0) goto L1b
            r0 = r1
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto Lb4
        L1e:
            com.tencent.mm.pluginsdk.model.g2 r0 = r7.f191001b
            r3 = 0
            r0.f189319l = r3
            java.util.ArrayList r0 = r7.f191004e
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.tencent.mm.pluginsdk.ui.otherway.w r5 = (com.tencent.mm.pluginsdk.ui.otherway.w) r5
            boolean r5 = r5.f191019i
            if (r5 == 0) goto L29
            goto L3c
        L3b:
            r4 = r3
        L3c:
            com.tencent.mm.pluginsdk.ui.otherway.w r4 = (com.tencent.mm.pluginsdk.ui.otherway.w) r4
            kb0.b r0 = new kb0.b
            kb0.j r5 = kb0.j.f306209a
            com.tencent.mm.pluginsdk.model.g2 r6 = r7.f191001b
            java.util.HashMap r5 = r5.b(r6)
            java.util.HashMap r6 = r7.f191012m
            r0.<init>(r5, r6, r4)
            r7.f191009j = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            jz5.l r4 = new jz5.l
            java.lang.String r5 = "style_type"
            r4.<init>(r5, r1)
            jz5.l[] r1 = new jz5.l[]{r4}
            java.util.HashMap r1 = kz5.c1.i(r1)
            java.util.HashMap r0 = r0.f306187a
            r1.putAll(r0)
            java.lang.Class<dy1.r> r0 = dy1.r.class
            i95.m r0 = i95.n0.c(r0)
            dy1.r r0 = (dy1.r) r0
            cy1.a r0 = (cy1.a) r0
            java.lang.String r4 = "view_exp"
            r5 = 35480(0x8a98, float:4.9718E-41)
            java.lang.String r6 = "view_share_sheet"
            r0.Hj(r6, r4, r1, r5)
            kb0.b r0 = r7.f191009j
            if (r0 == 0) goto La3
            if (r8 == 0) goto L86
            androidx.recyclerview.widget.RecyclerView r3 = r8.G1
        L86:
            java.lang.ref.WeakReference r1 = r0.f306191e
            androidx.recyclerview.widget.w2 r4 = r0.f306192f
            if (r1 == 0) goto L97
            java.lang.Object r1 = r1.get()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L97
            r1.V0(r4)
        L97:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.f306191e = r1
            if (r3 == 0) goto La3
            r3.i(r4)
        La3:
            kb0.b r0 = r7.f191009j
            if (r0 == 0) goto Lb4
            if (r8 == 0) goto Lad
            int r2 = r8.hashCode()
        Lad:
            int r1 = r0.f306189c
            if (r1 != r2) goto Lb2
            goto Lb4
        Lb2:
            r0.f306189c = r2
        Lb4:
            r7.f(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.otherway.v.e(com.tencent.mm.ui.widget.dialog.k0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.tencent.mm.ui.widget.dialog.k0 r18) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.otherway.v.f(com.tencent.mm.ui.widget.dialog.k0):void");
    }

    public final java.util.ArrayList g() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f191005f);
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = new com.tencent.mm.pluginsdk.ui.otherway.w();
        wVar.f191018h = true;
        arrayList.add(wVar);
        return arrayList;
    }

    public java.lang.String h() {
        return this.f191002c;
    }

    public final void i() {
        java.util.HashMap i17 = kz5.c1.i(new jz5.l(2, new w35.q(this.f191001b, this)), new jz5.l(3, new w35.t(this.f191001b, this)), new jz5.l(4, new w35.l(this.f191001b, this)), new jz5.l(5, new w35.g(this.f191001b, this)), new jz5.l(7, new w35.g(this.f191001b, this)), new jz5.l(6, new w35.d(this.f191001b, this)));
        this.f191008i = i17;
        if (this.f191001b.f189309b != null) {
            for (java.util.Map.Entry entry : i17.entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                ((w35.b) entry.getValue()).a();
            }
        }
    }

    public void j() {
        yz5.a aVar = this.f191001b.f189317j;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, java.lang.String str, yz5.l onMenuItemSelected) {
        kotlin.jvm.internal.o.g(onMenuItemSelected, "onMenuItemSelected");
        if (recyclerView != null) {
            if (str == null || r26.n0.N(str)) {
                return;
            }
            rl5.r rVar = this.f191013n;
            if (rVar != null) {
                rVar.a();
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            android.view.View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i17) : null;
            android.view.View findViewById = findViewByPosition != null ? findViewByPosition.findViewById(i18) : null;
            if (findViewById == null) {
                findViewById = findViewByPosition;
            }
            if (findViewById != null) {
                rl5.r rVar2 = new rl5.r(findViewById.getContext());
                rVar2.D = true;
                rVar2.L = new com.tencent.mm.pluginsdk.ui.otherway.l(this);
                this.f191013n = rVar2;
                int[] iArr = {0, 0};
                findViewById.getLocationInWindow(iArr);
                com.tencent.mm.pluginsdk.ui.otherway.n nVar = new com.tencent.mm.pluginsdk.ui.otherway.n(this, str, onMenuItemSelected);
                int f17 = i65.a.f(findViewById.getContext(), com.tencent.mm.R.dimen.f479646bl);
                rl5.r rVar3 = this.f191013n;
                if (rVar3 != null) {
                    int width = (int) (iArr[0] + (findViewById.getWidth() / 2.0f));
                    int i19 = iArr[1] - f17;
                    rVar3.f397354x = nVar;
                    rVar3.f397338f = findViewByPosition;
                    if (!(findViewByPosition instanceof android.widget.TextView) && (width == 0 || i19 == 0)) {
                        rVar3.l();
                    }
                    rVar3.f397356z.clear();
                    rVar3.f397356z.a(0, com.tencent.mm.R.string.o_u);
                    if (width == 0 && i19 == 0) {
                        rVar3.m();
                    } else {
                        rVar3.n(width, i19);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    public void l(android.content.Context context) {
        final java.util.ArrayList arrayList;
        ?? r47;
        android.view.View view;
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.pluginsdk.ui.otherway.h0 h0Var = com.tencent.mm.pluginsdk.ui.otherway.h0.f190945a;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.String str = this.f191003d;
        com.tencent.mm.pluginsdk.model.g2 g2Var = this.f191001b;
        java.lang.String str2 = g2Var.f189309b;
        java.lang.String str3 = g2Var.f189310c;
        int i17 = g2Var.f189315h;
        java.util.HashSet blockSet = g2Var.f189314g;
        kotlin.jvm.internal.o.g(blockSet, "blockSet");
        android.content.Intent e17 = h0Var.e(context2, str, str2, str3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.tencent.mm.sdk.platformtools.x2.f193072b);
        hashSet.addAll(blockSet);
        h0Var.a(context2, e17, hashSet, arrayList2);
        android.content.Intent c17 = h0Var.c(context2, str, str2, str3);
        h0Var.a(context2, c17, hashSet, arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.ui.otherway.x xVar = (com.tencent.mm.pluginsdk.ui.otherway.x) it.next();
            com.tencent.mm.pluginsdk.ui.otherway.w wVar = new com.tencent.mm.pluginsdk.ui.otherway.w();
            wVar.f191014d = xVar;
            arrayList3.add(wVar);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
        if (kz5.c0.i(3, 4, 2, 1, 5, 6).contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mm.pluginsdk.ui.otherway.w wVar2 = new com.tencent.mm.pluginsdk.ui.otherway.w();
            com.tencent.mm.pluginsdk.model.o0 o0Var = new com.tencent.mm.pluginsdk.model.o0("common_local_app");
            o0Var.f189392d = java.lang.Integer.valueOf(com.tencent.mm.R.raw.rectangle_4_regular);
            o0Var.f189390b = context2.getString(com.tencent.mm.R.string.obc);
            o0Var.f189394f = new com.tencent.mm.pluginsdk.ui.otherway.b0(i17, str2, c17);
            wVar2.f191020m = 1;
            wVar2.f191017g = o0Var;
            arrayList4.add(wVar2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mimeType: ");
        sb6.append(str);
        sb6.append(", displayList: ");
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
        java.util.Iterator it6 = arrayList4.iterator();
        while (true) {
            java.lang.String str4 = null;
            if (!it6.hasNext()) {
                break;
            }
            com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = ((com.tencent.mm.pluginsdk.ui.otherway.w) it6.next()).f191014d;
            if (xVar2 != null && (resolveInfo = xVar2.f191028d) != null && (activityInfo = resolveInfo.activityInfo) != null) {
                str4 = activityInfo.packageName;
            }
            arrayList5.add(str4);
        }
        sb6.append(kz5.n0.g0(arrayList5, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherAppHelper", sb6.toString());
        java.util.Iterator it7 = arrayList4.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            arrayList = this.f191004e;
            if (!hasNext) {
                break;
            } else {
                arrayList.removeIf(new com.tencent.mm.pluginsdk.ui.otherway.o((com.tencent.mm.pluginsdk.ui.otherway.w) it7.next()));
            }
        }
        a(arrayList4);
        if (arrayList.isEmpty()) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.o_t);
            e4Var.c();
            com.tencent.mars.xlog.Log.w(h(), "dataList is empty");
            return;
        }
        h0Var.g(arrayList, this.f191003d, this.f191001b.f189315h);
        boolean Bi = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(this.f191001b.f189315h);
        java.util.Collection collection = kz5.p0.f313996d;
        if (Bi) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                java.lang.Object next = it8.next();
                if (((com.tencent.mm.pluginsdk.ui.otherway.w) next).h() == 6) {
                    arrayList6.add(next);
                }
            }
            r47 = new java.util.ArrayList();
            java.util.Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                xj.m mVar = ((com.tencent.mm.pluginsdk.ui.otherway.w) it9.next()).f191022o;
                java.lang.String str5 = mVar != null ? mVar.f454758f : null;
                if (str5 != null) {
                    r47.add(str5);
                }
            }
        } else {
            r47 = collection;
        }
        arrayList.removeIf(new com.tencent.mm.pluginsdk.ui.otherway.p(r47));
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f191007h;
        if (z2Var == null || !z2Var.h()) {
            java.util.Iterator it10 = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it10.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((java.util.ArrayList) kz5.n0.t0(kz5.c0.i(2, 3, 4, 5), Bi ? kz5.b0.c(6) : collection)).contains(java.lang.Integer.valueOf(((com.tencent.mm.pluginsdk.ui.otherway.w) it10.next()).h()))) {
                    break;
                } else {
                    i19++;
                }
            }
            java.util.Iterator it11 = arrayList.iterator();
            int i27 = 0;
            while (it11.hasNext()) {
                java.lang.Object next2 = it11.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.pluginsdk.ui.otherway.w wVar3 = (com.tencent.mm.pluginsdk.ui.otherway.w) next2;
                wVar3.f191024q = i27 == i19;
                wVar3.f191025r = i19 >= 0 && i27 == arrayList.size() - 1;
                i27 = i28;
            }
            this.f191007h = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 3, true, false);
            com.tencent.mm.pluginsdk.model.g2 g2Var2 = this.f191001b;
            com.tencent.mm.pluginsdk.model.f2 f2Var = g2Var2.f189318k;
            this.f191010k = new kb0.g(g2Var2, f2Var != null ? f2Var.f189301e : null, arrayList);
            java.lang.Object obj = this.f191008i.get(6);
            w35.d dVar = obj instanceof w35.d ? (w35.d) obj : null;
            if (dVar != null) {
                dVar.f442729e = this.f191010k;
            }
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eli, (android.view.ViewGroup) null);
            inflate.findViewById(com.tencent.mm.R.id.qlj).setOnClickListener(new com.tencent.mm.pluginsdk.ui.otherway.q(this));
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.f191007h;
            if (z2Var2 != null && (view = z2Var2.f212058g) != null) {
                view.setBackgroundResource(com.tencent.mm.R.drawable.cw_);
            }
            com.tencent.mm.ui.widget.dialog.z2 z2Var3 = this.f191007h;
            if (z2Var3 != null) {
                z2Var3.s(inflate);
            }
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = new com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView(context, null);
            maxHeightWxRecyclerView.setMaxHeight((int) (context.getResources().getDisplayMetrics().heightPixels * 0.7d));
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.pluginsdk.ui.otherway.BottomSheetOpenWayEnhance$showMoreOpenWay$adapter$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (type != 6) {
                        return type != 7 ? new com.tencent.mm.pluginsdk.ui.otherway.p0() : new com.tencent.mm.pluginsdk.ui.otherway.q0();
                    }
                    com.tencent.mm.pluginsdk.ui.otherway.u uVar = new com.tencent.mm.pluginsdk.ui.otherway.u(arrayList, com.tencent.mm.pluginsdk.ui.otherway.v.this);
                    return ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(com.tencent.mm.pluginsdk.ui.otherway.v.this.f191001b.f189315h) ? new com.tencent.mm.pluginsdk.ui.otherway.m0(uVar, com.tencent.mm.pluginsdk.ui.otherway.v.this.f191010k) : new com.tencent.mm.pluginsdk.ui.otherway.l0(uVar, com.tencent.mm.pluginsdk.ui.otherway.v.this.f191010k);
                }
            }, arrayList, false);
            wxRecyclerAdapter.f293105o = new com.tencent.mm.pluginsdk.ui.otherway.r(arrayList, this, context);
            kb0.g gVar = this.f191010k;
            if (gVar != null) {
                maxHeightWxRecyclerView.i(new kb0.d(gVar));
            }
            android.view.View view2 = new android.view.View(context);
            view2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479723df)));
            wxRecyclerAdapter.O(view2, 2147483646, false);
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false);
            maxHeightWxRecyclerView.setAdapter(wxRecyclerAdapter);
            maxHeightWxRecyclerView.setLayoutManager(linearLayoutManager);
            maxHeightWxRecyclerView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            maxHeightWxRecyclerView.setClipToPadding(false);
            com.tencent.mm.ui.widget.dialog.z2 z2Var4 = this.f191007h;
            if (z2Var4 != null) {
                z2Var4.k(maxHeightWxRecyclerView, 0, 0);
            }
            com.tencent.mm.ui.widget.dialog.z2 z2Var5 = this.f191007h;
            if (z2Var5 != null) {
                z2Var5.w(new com.tencent.mm.pluginsdk.ui.otherway.s(this));
            }
            com.tencent.mm.ui.widget.dialog.z2 z2Var6 = this.f191007h;
            if (z2Var6 != null) {
                z2Var6.l(new com.tencent.mm.pluginsdk.ui.otherway.t(this));
            }
            com.tencent.mm.ui.widget.dialog.z2 z2Var7 = this.f191007h;
            if (z2Var7 != null) {
                z2Var7.C();
            }
        }
    }
}
