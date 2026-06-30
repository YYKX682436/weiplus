package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public class q3 implements com.tencent.mm.plugin.finder.uniComments.g2, im5.b, com.tencent.mm.plugin.finder.uniComments.s3, in5.x, in5.y {
    public static final com.tencent.mm.plugin.finder.uniComments.h2 F = new com.tencent.mm.plugin.finder.uniComments.h2(null);
    public com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer A;
    public boolean B;
    public final com.tencent.mm.sdk.event.IListener C;
    public android.app.Dialog D;
    public final com.tencent.mm.plugin.finder.uniComments.m2 E;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f130367d;

    /* renamed from: e, reason: collision with root package name */
    public int f130368e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.uniComments.p4 f130369f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f130370g;

    /* renamed from: h, reason: collision with root package name */
    public iv2.b f130371h;

    /* renamed from: i, reason: collision with root package name */
    public int f130372i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.a5 f130373m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.j2 f130374n;

    /* renamed from: o, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f130375o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f130376p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f130377q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f130378r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f130379s;

    /* renamed from: t, reason: collision with root package name */
    public long f130380t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f130381u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f130382v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f130383w;

    /* renamed from: x, reason: collision with root package name */
    public fp0.t f130384x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f130385y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f130386z;

    public q3(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f130367d = context;
        this.f130368e = 58;
        this.f130369f = new com.tencent.mm.plugin.finder.uniComments.p4();
        this.f130370g = new java.util.concurrent.CopyOnWriteArraySet();
        this.f130372i = 2;
        this.f130377q = true;
        this.f130379s = true;
        this.f130383w = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UniCommentChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$commentChangeEventListener$1
            {
                this.__eventId = 1991739851;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.UniCommentChangeEvent r8) {
                /*
                    r7 = this;
                    com.tencent.mm.autogen.events.UniCommentChangeEvent r8 = (com.tencent.mm.autogen.events.UniCommentChangeEvent) r8
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.g(r8, r0)
                    r0 = 1
                    com.tencent.mm.plugin.finder.uniComments.q3 r1 = com.tencent.mm.plugin.finder.uniComments.q3.this
                    r2 = 0
                    am.oz r3 = r8.f54909g
                    if (r3 == 0) goto L25
                    long r3 = r3.f7585a
                    iv2.b r5 = r1.f130371h
                    if (r5 == 0) goto L1e
                    int r5 = r5.f295130f
                    long r5 = (long) r5
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 != 0) goto L25
                    r3 = r0
                    goto L26
                L1e:
                    java.lang.String r8 = "feedObj"
                    kotlin.jvm.internal.o.o(r8)
                    r8 = 0
                    throw r8
                L25:
                    r3 = r2
                L26:
                    if (r3 != 0) goto L2a
                    r0 = r2
                    goto L55
                L2a:
                    com.tencent.mm.plugin.finder.uniComments.l2 r2 = new com.tencent.mm.plugin.finder.uniComments.l2
                    r2.<init>(r8, r1)
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    android.os.Looper r3 = android.os.Looper.getMainLooper()
                    java.lang.Thread r3 = r3.getThread()
                    boolean r8 = kotlin.jvm.internal.o.b(r8, r3)
                    if (r8 == 0) goto L45
                    r2.invoke()
                    goto L55
                L45:
                    com.tencent.mm.plugin.finder.uniComments.a5 r8 = r1.f130373m
                    if (r8 == 0) goto L55
                    com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r8 = r8.h()
                    com.tencent.mm.plugin.finder.uniComments.k2 r1 = new com.tencent.mm.plugin.finder.uniComments.k2
                    r1.<init>(r2)
                    r8.post(r1)
                L55:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$commentChangeEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.E = new com.tencent.mm.plugin.finder.uniComments.m2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (((jv2.i) r18.get(r5)).f302223d.J0() != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List f(com.tencent.mm.plugin.finder.uniComments.q3 r17, java.util.List r18) {
        /*
            r17.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r18.iterator()
            r2 = 0
            r3 = r2
        Le:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lc7
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            r6 = 0
            if (r3 < 0) goto Lc3
            jv2.i r4 = (jv2.i) r4
            r0.add(r4)
            jv2.c r7 = r4.f302223d
            long r7 = r7.J0()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto Lbc
            jv2.c r7 = r4.f302223d
            java.util.LinkedList r7 = r7.A0()
            int r7 = r7.size()
            if (r7 <= 0) goto Lbc
            int r7 = r18.size()
            r8 = 1
            int r7 = r7 - r8
            if (r3 >= r7) goto L58
            r3 = r18
            java.lang.Object r7 = r3.get(r5)
            jv2.i r7 = (jv2.i) r7
            jv2.c r7 = r7.f302223d
            long r11 = r7.J0()
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 != 0) goto L55
            goto L5a
        L55:
            r10 = r17
            goto Lc0
        L58:
            r3 = r18
        L5a:
            com.tencent.mm.plugin.finder.storage.t70 r7 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r7 = com.tencent.mm.plugin.finder.storage.t70.f127591a0
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            lb2.j r7 = (lb2.j) r7
            java.lang.Object r7 = r7.r()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r8) goto L55
            jv2.c r7 = r4.f302223d
            java.util.LinkedList r7 = r7.A0()
            int r7 = r7.size()
            r9 = r2
        L7d:
            if (r9 >= r7) goto Lb0
            jv2.c r10 = r4.f302223d
            java.util.LinkedList r10 = r10.A0()
            java.lang.Object r10 = r10.remove()
            r12 = r10
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) r12
            hv2.c r11 = hv2.c.f285287a
            kotlin.jvm.internal.o.d(r12)
            r10 = r17
            iv2.b r13 = r10.f130371h
            if (r13 == 0) goto Laa
            int r13 = r13.f295130f
            long r13 = (long) r13
            long r15 = r4.getItemId()
            jv2.i r11 = r11.b(r12, r13, r15)
            r11.f302230n = r8
            r0.add(r11)
            int r9 = r9 + 1
            goto L7d
        Laa:
            java.lang.String r0 = "feedObj"
            kotlin.jvm.internal.o.o(r0)
            throw r6
        Lb0:
            r10 = r17
            int r6 = r4.f302229m
            int r6 = r6 - r7
            r4.f302229m = r6
            if (r6 >= 0) goto Lc0
            r4.f302229m = r2
            goto Lc0
        Lbc:
            r10 = r17
            r3 = r18
        Lc0:
            r3 = r5
            goto Le
        Lc3:
            kz5.c0.p()
            throw r6
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.uniComments.q3.f(com.tencent.mm.plugin.finder.uniComments.q3, java.util.List):java.util.List");
    }

    public static final void g(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, java.util.List itemList, jv2.i rootComment, boolean z17) {
        int i17;
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        int i18;
        com.tencent.mm.plugin.finder.uniComments.p4 p4Var = q3Var.f130369f;
        p4Var.getClass();
        kotlin.jvm.internal.o.g(itemList, "itemList");
        kotlin.jvm.internal.o.g(rootComment, "rootComment");
        java.util.List c17 = p4Var.c(itemList);
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        if (arrayList.size() > 1) {
            kz5.g0.t(c17, new com.tencent.mm.plugin.finder.uniComments.o4());
        }
        int e17 = p4Var.e(rootComment.f302223d.t0(), z17);
        p4Var.f130360a.addAll(e17, c17);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(arrayList.size());
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", "insertLevel2CommentsAndNotify, positionInsert:" + intValue + ", itemCount:" + intValue2 + ", level2Comments size:" + itemList.size() + ", down:" + z17 + ", rootCommentId:" + rootComment.getItemId());
        if (intValue2 < 0 || intValue < 0 || intValue >= p4Var.f() || (i17 = intValue + intValue2) > p4Var.f() || (a5Var = q3Var.f130373m) == null || (recyclerView = a5Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        if (intValue2 > 0) {
            adapter.notifyItemRangeInserted(intValue, intValue2);
        }
        if (!z17 || (i18 = intValue - 1) < 0) {
            if (z17 || i17 >= p4Var.f()) {
                return;
            }
            adapter.notifyItemChanged(i17, 1);
            return;
        }
        adapter.notifyItemChanged(i18, 1);
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var2 = q3Var.f130373m;
        if (a5Var2 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.r(a5Var2.s(), false, null, com.tencent.mm.plugin.finder.uniComments.w2.f130442d, 3, null);
        }
    }

    public final void A(boolean z17) {
        this.f130377q = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", "set downContinue " + z17);
    }

    public final void B(boolean z17) {
        this.f130376p = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", "set upContinue " + z17);
    }

    public void E(android.view.View view, int i17) {
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(view, "view");
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", "onClickResendComment position:" + i17);
        } else {
            if (this.f130369f.d(i17).f302223d.field_state != -1 || (a5Var = this.f130373m) == null || (recyclerView = a5Var.s().getRecyclerView()) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onClickResendComment", "(Landroid/view/View;I)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onClickResendComment", "(Landroid/view/View;I)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    public void R(android.widget.ImageView view, int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(view, "view");
        if (i17 < 0) {
            return;
        }
        jv2.i d17 = this.f130369f.d(i17);
        ev2.n nVar = ev2.n.f256921f;
        if (this.f130371h == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        boolean z17 = !nVar.b(r4.f295130f, d17.f302223d, this.f130372i);
        com.tencent.mm.plugin.finder.uniComments.h2 h2Var = F;
        if (this.f130371h == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        h2Var.a(null, z17 ? 3L : 4L, 1L);
        if (this.f130367d instanceof com.tencent.mm.ui.MMFragmentActivity) {
            int i18 = this.f130372i != 2 ? 3 : 2;
            iv2.b bVar = this.f130371h;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            jv2.c comment = d17.f302223d;
            kotlin.jvm.internal.o.g(comment, "comment");
            ev2.t tVar = new ev2.t(bVar, comment, z17, i18, null);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f256924c;
            java.lang.Long valueOf = java.lang.Long.valueOf(bVar.a());
            java.lang.Object obj = concurrentHashMap.get(valueOf);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new java.util.concurrent.ConcurrentHashMap()))) != null) {
                obj = putIfAbsent;
            }
            ((java.util.concurrent.ConcurrentHashMap) obj).put(new ev2.k(comment.t0(), i18), tVar);
            nVar.f256922a.b(new ev2.q(tVar), new ev2.l(nVar, tVar));
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = this.f130373m;
        if (a5Var == null || (recyclerView = a5Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemChanged(i17, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (((r0.u0().getExtFlag() & 1) > 0) == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int S() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.uniComments.p4 r0 = r3.f130369f
            java.util.ArrayList r0 = r0.f130360a
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.L0(r0)
            if (r1 != 0) goto L2d
            java.lang.Object r0 = kz5.n0.Z(r0)
            jv2.i r0 = (jv2.i) r0
            r1 = 0
            if (r0 == 0) goto L29
            jv2.c r0 = r0.f302223d
            if (r0 == 0) goto L29
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.u0()
            int r0 = r0.getExtFlag()
            r2 = 1
            r0 = r0 & r2
            if (r0 <= 0) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 != r2) goto L29
            goto L2a
        L29:
            r2 = r1
        L2a:
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r1 = -1
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.uniComments.q3.S():int");
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!this.f130382v) {
            if (i17 < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", "onItemLongClick position:" + i17);
            } else {
                jv2.i d17 = this.f130369f.d(i17);
                rl5.r rVar = new rl5.r(this.f130367d);
                iv2.b bVar = this.f130371h;
                if (bVar == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                rVar.g(view, 0, 0L, new com.tencent.mm.plugin.finder.uniComments.r4(d17, bVar.f295129e, this.f130372i == 1), new com.tencent.mm.plugin.finder.uniComments.t4(d17, this.f130368e, new com.tencent.mm.plugin.finder.uniComments.i3(this)), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            }
        }
        return false;
    }

    public boolean h(jv2.i comment, boolean z17) {
        kotlin.jvm.internal.o.g(comment, "comment");
        long J0 = comment.f302223d.J0();
        com.tencent.mm.plugin.finder.uniComments.p4 p4Var = this.f130369f;
        boolean z18 = false;
        if (J0 == 0) {
            if (!z17) {
                return false;
            }
            p4Var.getClass();
            if (comment.getItemId() != 0) {
                java.util.Iterator it = p4Var.f130360a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((jv2.i) it.next()).f302223d.J0() == comment.getItemId()) {
                        z18 = true;
                        break;
                    }
                }
            }
            return !z18;
        }
        int i17 = -1;
        if (z17) {
            p4Var.getClass();
            java.util.Iterator it6 = p4Var.f130360a.iterator();
            int i18 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jv2.i comment1 = (jv2.i) next;
                kotlin.jvm.internal.o.g(comment1, "comment1");
                if (!(comment1.getItemId() == comment.getItemId())) {
                    if (i17 >= 0 && p4Var.g(comment1, comment)) {
                        z18 = true;
                        break;
                    }
                } else {
                    i17 = i18;
                }
                i18 = i19;
            }
            return !z18;
        }
        p4Var.getClass();
        java.util.Iterator it7 = p4Var.f130360a.iterator();
        int i27 = 0;
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            java.lang.Object next2 = it7.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            jv2.i comment12 = (jv2.i) next2;
            kotlin.jvm.internal.o.g(comment12, "comment1");
            if (!(comment12.getItemId() == comment.getItemId())) {
                if (p4Var.g(comment12, comment)) {
                    i17 = i27;
                }
                i27 = i28;
            } else if (i17 >= 0 && i17 < i27) {
                z18 = true;
            }
        }
        return !z18;
    }

    public final int i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateCommentCount ");
        com.tencent.mm.plugin.finder.uniComments.p4 p4Var = this.f130369f;
        sb6.append(p4Var.f());
        sb6.append(", ");
        iv2.b bVar = this.f130371h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        sb6.append(bVar.f295127c);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        int f17 = p4Var.f() + 0;
        iv2.b bVar2 = this.f130371h;
        if (bVar2 != null) {
            return java.lang.Math.max(f17, bVar2.f295127c);
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    public int k() {
        java.util.ArrayList arrayList = this.f130369f.f130360a;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            return -1;
        }
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            jv2.i iVar = (jv2.i) next;
            if (iVar.f302223d.J0() == 0) {
                if (!((iVar.f302223d.u0().getExtFlag() & 1) > 0)) {
                    return i17;
                }
            }
            i17 = i18;
        }
        return -1;
    }

    @Override // im5.b
    public void keep(im5.a p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f130370g.add(p07);
    }

    public iv2.b m() {
        iv2.b bVar = this.f130371h;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    @Override // fs2.a
    public void onDetach() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        androidx.recyclerview.widget.RecyclerView recyclerView4;
        if (this.f130383w) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", "onDetach: can not detach, because it is not attached");
            return;
        }
        this.f130383w = true;
        this.f130385y = false;
        fp0.t tVar = this.f130384x;
        if (tVar != null) {
            tVar.f();
        }
        this.f130384x = null;
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = this.f130373m;
        if (((a5Var == null || (recyclerView4 = a5Var.s().getRecyclerView()) == null) ? null : recyclerView4.getLayoutManager()) instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var2 = this.f130373m;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (a5Var2 == null || (recyclerView3 = a5Var2.s().getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var3 = this.f130373m;
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l17 = a5Var3 != null ? a5Var3.l() : null;
        if (l17 != null) {
            l17.setFooterMode(0);
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var4 = this.f130373m;
        if (a5Var4 != null && (recyclerView2 = a5Var4.s().getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
            adapter2.unregisterAdapterDataObserver(this.E);
        }
        java.util.Iterator it = this.f130370g.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        this.f130370g.clear();
        this.C.dead();
        iv2.b bVar = this.f130371h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        bVar.f295127c = i();
        java.util.Map map = com.tencent.mm.plugin.finder.uniComments.b2.f130205a;
        iv2.b bVar2 = this.f130371h;
        if (bVar2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.util.Map map2 = com.tencent.mm.plugin.finder.uniComments.b2.f130205a;
        kotlin.jvm.internal.o.f(map2, "access$getCacheItems$cp(...)");
        map2.put(java.lang.Long.valueOf(bVar2.a()), bVar2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onDetach] updateFeedCommentCount feedId=");
        if (this.f130371h == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        sb6.append(r6.f295130f);
        sb6.append(" commentCount ");
        sb6.append(i());
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        if (this.f130378r || !this.f130379s) {
            this.f130369f.f130360a.clear();
        } else {
            if (this.f130380t != 0) {
                java.util.Iterator it6 = this.f130369f.f130360a.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    jv2.i iVar = (jv2.i) next;
                    if (iVar.getItemId() == this.f130380t) {
                        iVar.f302228i = false;
                    }
                    i17 = i18;
                }
            }
            com.tencent.mm.plugin.finder.uniComments.p4 p4Var = this.f130369f;
            p4Var.getClass();
            p4Var.f130360a.clear();
        }
        this.f130375o = null;
        B(false);
        A(true);
        com.tencent.mm.plugin.finder.view.FinderCommentEditText p17 = p();
        if (p17 != null) {
            p17.setText((java.lang.CharSequence) null);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentEditText p18 = p();
        if (p18 != null) {
            ((java.util.HashMap) p18.pastedList).clear();
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var5 = this.f130373m;
        com.tencent.mm.view.RefreshLoadMoreLayout s17 = a5Var5 != null ? a5Var5.s() : null;
        if (s17 != null) {
            s17.setHasBottomMore(true);
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var6 = this.f130373m;
        if (a5Var6 != null && (recyclerView = a5Var6.s().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var7 = this.f130373m;
        androidx.recyclerview.widget.RecyclerView recyclerView5 = a5Var7 != null ? a5Var7.s().getRecyclerView() : null;
        if (recyclerView5 != null) {
            recyclerView5.setLayoutFrozen(true);
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var8 = this.f130373m;
        com.tencent.mm.view.RefreshLoadMoreLayout s18 = a5Var8 != null ? a5Var8.s() : null;
        if (s18 != null) {
            s18.setActionCallback(null);
        }
        this.f130373m = null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderCommentEditText p() {
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = this.f130373m;
        if (a5Var != null) {
            return a5Var.l().getEditText();
        }
        return null;
    }

    public final android.content.res.Resources q() {
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = this.f130373m;
        if (a5Var != null) {
            return a5Var.k().getResources();
        }
        return null;
    }

    public jv2.i s(long j17) {
        java.lang.Object obj = null;
        if (j17 == 0) {
            return null;
        }
        java.util.Iterator it = this.f130369f.f130360a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((jv2.i) next).f302223d.t0() == j17) {
                obj = next;
                break;
            }
        }
        return (jv2.i) obj;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.getItemViewType() == 3 || this.f130382v) {
            return;
        }
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", "onItemClick position:" + i17);
            return;
        }
        jv2.i d17 = this.f130369f.d(i17);
        if (d17.f302225f && ((com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d)).i()) {
            return;
        }
        int i18 = d17.f302223d.field_state;
        if ((i18 == 1 || i18 == -1) ? false : true) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var = this.f130373m;
            if (a5Var != null) {
                com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l17 = a5Var.l();
                int i19 = this.f130372i;
                jv2.c commentObj = d17.f302223d;
                boolean z17 = i19 == 2;
                kotlin.jvm.internal.o.g(commentObj, "commentObj");
                if (z17) {
                    java.lang.String str = l17.lastFromName;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
                    android.content.res.Resources resources = l17.getResources();
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    sb6.append(resources.getString(com.tencent.mm.R.string.f490925ba1, l17.i(c61.yb.md((c61.yb) c17, commentObj.L0(), commentObj.D0(), false, 4, null))));
                    l17.f(str, sb6.toString(), commentObj, true);
                } else {
                    l17.f(l17.lastFromName, " " + l17.getResources().getString(com.tencent.mm.R.string.f490925ba1, l17.i(commentObj.D0())), commentObj, true);
                }
                l17.getEditText().setShowSoftInputOnFocus(true);
                l17.getEditText().requestFocus();
                l17.m(true);
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getGlobalVisibleRect(rect);
            int i27 = rect.bottom;
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var2 = this.f130373m;
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer h17 = a5Var2 != null ? a5Var2.h() : null;
            kotlin.jvm.internal.o.d(h17);
            h17.getGlobalVisibleRect(rect);
            int i28 = rect.bottom - i27;
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var3 = this.f130373m;
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l18 = a5Var3 != null ? a5Var3.l() : null;
            kotlin.jvm.internal.o.d(l18);
            if (i28 < l18.getHeight()) {
                int height = i28 - l18.getHeight();
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var4 = this.f130373m;
                androidx.recyclerview.widget.RecyclerView recyclerView = a5Var4 != null ? a5Var4.h().getRecyclerView() : null;
                kotlin.jvm.internal.o.d(recyclerView);
                recyclerView.animate().translationY(height).setDuration(90L).start();
            }
        }
    }

    public void v(jv2.i rootComment, boolean z17) {
        kotlin.jvm.internal.o.g(rootComment, "rootComment");
        if (z17) {
            java.util.LinkedList A0 = rootComment.f302223d.A0();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(A0)) {
                java.util.Iterator it = this.f130369f.f130360a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        fp0.t tVar = this.f130384x;
                        if (tVar != null) {
                            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.uniComments.v2(A0, this, rootComment), null, 2, null));
                        }
                    } else if (((jv2.i) it.next()).f302223d.t0() == ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) A0.getFirst()).getCommentId()) {
                        break;
                    }
                }
            }
        }
        fp0.t tVar2 = this.f130384x;
        if (tVar2 != null) {
            tVar2.b(new fp0.r(new com.tencent.mm.plugin.finder.uniComments.c3(rootComment, this, z17), null, 2, null));
        }
    }

    public final void y(boolean z17) {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", "refreshData " + z17 + " return for teen mode");
            return;
        }
        fp0.t tVar = this.f130384x;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.uniComments.p3(z17, this), null, 2, null));
        }
    }

    public final void z() {
        if (this.B) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var = this.f130373m;
            android.widget.TextView o17 = a5Var != null ? a5Var.o() : null;
            if (o17 == null) {
                return;
            }
            android.content.res.Resources q17 = q();
            o17.setText(q17 != null ? q17.getString(com.tencent.mm.R.string.cyd) : null);
            return;
        }
        if (i() <= 0) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var2 = this.f130373m;
            android.widget.TextView o18 = a5Var2 != null ? a5Var2.o() : null;
            if (o18 == null) {
                return;
            }
            android.content.res.Resources q18 = q();
            o18.setText(q18 != null ? q18.getString(com.tencent.mm.R.string.cox) : null);
            return;
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var3 = this.f130373m;
        android.widget.TextView o19 = a5Var3 != null ? a5Var3.o() : null;
        if (o19 == null) {
            return;
        }
        android.content.res.Resources q19 = q();
        o19.setText(q19 != null ? q19.getString(com.tencent.mm.R.string.cpc, java.lang.String.valueOf(i())) : null);
    }
}
