package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class o0 implements com.tencent.mm.plugin.finder.uniComments.d, im5.b, com.tencent.mm.plugin.finder.uniComments.p0, in5.x, in5.y {
    public fp0.t A;
    public boolean B;
    public com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer C;
    public java.lang.String D;
    public final com.tencent.mm.sdk.event.IListener E;
    public android.app.Dialog F;
    public final com.tencent.mm.plugin.finder.uniComments.j G;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f130322d;

    /* renamed from: e, reason: collision with root package name */
    public jv2.d f130323e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f130324f;

    /* renamed from: g, reason: collision with root package name */
    public int f130325g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.uniComments.o1 f130326h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f130327i;

    /* renamed from: m, reason: collision with root package name */
    public iv2.a f130328m;

    /* renamed from: n, reason: collision with root package name */
    public int f130329n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.a2 f130330o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.g f130331p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.c f130332q;

    /* renamed from: r, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f130333r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f130334s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f130335t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f130336u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f130337v;

    /* renamed from: w, reason: collision with root package name */
    public long f130338w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f130339x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f130340y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f130341z;

    public o0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f130322d = context;
        this.f130325g = 58;
        this.f130326h = new com.tencent.mm.plugin.finder.uniComments.o1();
        this.f130327i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f130329n = 2;
        this.f130335t = true;
        this.f130337v = true;
        this.f130341z = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UniCommentChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawerPresenter$commentChangeEventListener$1
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
                    com.tencent.mm.plugin.finder.uniComments.o0 r1 = com.tencent.mm.plugin.finder.uniComments.o0.this
                    r2 = 0
                    am.oz r3 = r8.f54909g
                    if (r3 == 0) goto L25
                    long r3 = r3.f7585a
                    iv2.a r5 = r1.f130328m
                    if (r5 == 0) goto L1e
                    int r5 = r5.f295123f
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
                    com.tencent.mm.plugin.finder.uniComments.i r2 = new com.tencent.mm.plugin.finder.uniComments.i
                    r2.<init>(r8, r1)
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    android.os.Looper r3 = android.os.Looper.getMainLooper()
                    java.lang.Thread r3 = r3.getThread()
                    boolean r8 = kotlin.jvm.internal.o.b(r8, r3)
                    if (r8 == 0) goto L45
                    r2.invoke()
                    goto L55
                L45:
                    com.tencent.mm.plugin.finder.uniComments.a2 r8 = r1.f130330o
                    if (r8 == 0) goto L55
                    com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer r8 = r8.e()
                    com.tencent.mm.plugin.finder.uniComments.h r1 = new com.tencent.mm.plugin.finder.uniComments.h
                    r1.<init>(r2)
                    r8.post(r1)
                L55:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawerPresenter$commentChangeEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.G = new com.tencent.mm.plugin.finder.uniComments.j(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (((jv2.d) r18.get(r5)).f302207d.A0() != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(com.tencent.mm.plugin.finder.uniComments.o0 r17, java.util.List r18) {
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
            jv2.d r4 = (jv2.d) r4
            r0.add(r4)
            jv2.a r7 = r4.f302207d
            long r7 = r7.A0()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto Lbc
            jv2.a r7 = r4.f302207d
            java.util.LinkedList r7 = r7.w0()
            int r7 = r7.size()
            if (r7 <= 0) goto Lbc
            int r7 = r18.size()
            r8 = 1
            int r7 = r7 - r8
            if (r3 >= r7) goto L58
            r3 = r18
            java.lang.Object r7 = r3.get(r5)
            jv2.d r7 = (jv2.d) r7
            jv2.a r7 = r7.f302207d
            long r11 = r7.A0()
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
            jv2.a r7 = r4.f302207d
            java.util.LinkedList r7 = r7.w0()
            int r7 = r7.size()
            r9 = r2
        L7d:
            if (r9 >= r7) goto Lb0
            jv2.a r10 = r4.f302207d
            java.util.LinkedList r10 = r10.w0()
            java.lang.Object r10 = r10.remove()
            r12 = r10
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) r12
            hv2.b r11 = hv2.b.f285286a
            kotlin.jvm.internal.o.d(r12)
            r10 = r17
            iv2.a r13 = r10.f130328m
            if (r13 == 0) goto Laa
            int r13 = r13.f295123f
            long r13 = (long) r13
            long r15 = r4.getItemId()
            jv2.d r11 = r11.b(r12, r13, r15)
            r11.f302215o = r8
            r0.add(r11)
            int r9 = r9 + 1
            goto L7d
        Laa:
            java.lang.String r0 = "feedObj"
            kotlin.jvm.internal.o.o(r0)
            throw r6
        Lb0:
            r10 = r17
            int r6 = r4.f302214n
            int r6 = r6 - r7
            r4.f302214n = r6
            if (r6 >= 0) goto Lc0
            r4.f302214n = r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.uniComments.o0.a(com.tencent.mm.plugin.finder.uniComments.o0, java.util.List):java.util.List");
    }

    public static final void b(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, java.util.List itemList, jv2.d rootComment, boolean z17) {
        int i17;
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        int i18;
        com.tencent.mm.plugin.finder.uniComments.o1 o1Var = o0Var.f130326h;
        o1Var.getClass();
        kotlin.jvm.internal.o.g(itemList, "itemList");
        kotlin.jvm.internal.o.g(rootComment, "rootComment");
        java.util.List c17 = o1Var.c(itemList);
        int d17 = o1Var.d(rootComment.f302207d.t0(), z17);
        o1Var.f130342a.addAll(d17, c17);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(d17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((java.util.ArrayList) c17).size());
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "insertLevel2CommentsAndNotify, positionInsert:" + intValue + ", itemCount:" + intValue2 + ", level2Comments size:" + itemList.size() + ", down:" + z17 + ", rootCommentId:" + rootComment.getItemId());
        if (intValue2 < 0 || intValue < 0 || intValue >= o1Var.e() || (i17 = intValue + intValue2) > o1Var.e() || (a2Var = o0Var.f130330o) == null || (recyclerView = a2Var.k().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        if (intValue2 > 0) {
            adapter.notifyItemRangeInserted(intValue, intValue2);
        }
        if (!z17 || (i18 = intValue - 1) < 0) {
            if (z17 || i17 >= o1Var.e()) {
                return;
            }
            adapter.notifyItemChanged(i17, 1);
            return;
        }
        adapter.notifyItemChanged(i18, 1);
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var2 = o0Var.f130330o;
        if (a2Var2 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.r(a2Var2.k(), false, null, com.tencent.mm.plugin.finder.uniComments.t.f130407d, 3, null);
        }
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (this.f130340y) {
            return false;
        }
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onItemLongClick position:" + i17);
            return false;
        }
        java.lang.Object obj = this.f130326h.f130342a.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        jv2.d dVar = (jv2.d) obj;
        rl5.r rVar = new rl5.r(this.f130322d);
        iv2.a aVar = this.f130328m;
        if (aVar != null) {
            rVar.g(view, 0, 0L, new com.tencent.mm.plugin.finder.uniComments.p1(dVar, aVar.f295119b, this.f130329n == 1), new com.tencent.mm.plugin.finder.uniComments.r1(dVar, this.f130325g, new com.tencent.mm.plugin.finder.uniComments.e0(this)), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            return true;
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    public boolean d(jv2.d comment, boolean z17) {
        kotlin.jvm.internal.o.g(comment, "comment");
        long A0 = comment.f302207d.A0();
        com.tencent.mm.plugin.finder.uniComments.o1 o1Var = this.f130326h;
        boolean z18 = false;
        if (A0 == 0) {
            if (!z17) {
                return false;
            }
            o1Var.getClass();
            if (comment.getItemId() != 0) {
                java.util.Iterator it = o1Var.f130342a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((jv2.d) it.next()).f302207d.A0() == comment.getItemId()) {
                        z18 = true;
                        break;
                    }
                }
            }
            return !z18;
        }
        int i17 = -1;
        if (z17) {
            o1Var.getClass();
            java.util.Iterator it6 = o1Var.f130342a.iterator();
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
                jv2.d comment1 = (jv2.d) next;
                kotlin.jvm.internal.o.g(comment1, "comment1");
                if (!(comment1.getItemId() == comment.getItemId())) {
                    if (i17 >= 0 && o1Var.f(comment1, comment)) {
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
        o1Var.getClass();
        java.util.Iterator it7 = o1Var.f130342a.iterator();
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
            jv2.d comment12 = (jv2.d) next2;
            kotlin.jvm.internal.o.g(comment12, "comment1");
            if (!(comment12.getItemId() == comment.getItemId())) {
                if (o1Var.f(comment12, comment)) {
                    i17 = i27;
                }
                i27 = i28;
            } else if (i17 >= 0 && i17 < i27) {
                z18 = true;
            }
        }
        return !z18;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawerPresenter$getAdapter$adapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 1) {
                    return new gv2.k(com.tencent.mm.plugin.finder.uniComments.o0.this, false);
                }
                if (type == 2) {
                    return new gv2.w(com.tencent.mm.plugin.finder.uniComments.o0.this);
                }
                hc2.l.a("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, this.f130326h.f130342a, false);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = this;
        wxRecyclerAdapter.f293104n = this;
        return wxRecyclerAdapter;
    }

    public final int f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateCommentCount ");
        com.tencent.mm.plugin.finder.uniComments.o1 o1Var = this.f130326h;
        sb6.append(o1Var.e());
        sb6.append(", ");
        iv2.a aVar = this.f130328m;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        sb6.append(aVar.f295121d);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        int e17 = o1Var.e() + 0;
        iv2.a aVar2 = this.f130328m;
        if (aVar2 != null) {
            return java.lang.Math.max(e17, aVar2.f295121d);
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderCommentEditText g() {
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var = this.f130330o;
        if (a2Var != null) {
            return a2Var.f().getEditText();
        }
        return null;
    }

    public jv2.d h(long j17) {
        java.lang.Object obj = null;
        if (j17 == 0) {
            return null;
        }
        java.util.Iterator it = this.f130326h.f130342a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((jv2.d) next).f302207d.t0() == j17) {
                obj = next;
                break;
            }
        }
        return (jv2.d) obj;
    }

    public void i(jv2.d rootComment, boolean z17) {
        kotlin.jvm.internal.o.g(rootComment, "rootComment");
        if (z17) {
            java.util.LinkedList w07 = rootComment.f302207d.w0();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(w07)) {
                java.util.Iterator it = this.f130326h.f130342a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        fp0.t tVar = this.A;
                        if (tVar != null) {
                            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.uniComments.s(w07, this, rootComment), null, 2, null));
                        }
                    } else if (((jv2.d) it.next()).f302207d.t0() == ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) w07.getFirst()).getCommentId()) {
                        break;
                    }
                }
            }
        }
        fp0.t tVar2 = this.A;
        if (tVar2 != null) {
            tVar2.b(new fp0.r(new com.tencent.mm.plugin.finder.uniComments.z(rootComment, this, z17), null, 2, null));
        }
    }

    public void j() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        androidx.recyclerview.widget.RecyclerView recyclerView4;
        if (this.f130341z) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onDetach: can not detach, because it is not attached");
            return;
        }
        this.f130341z = true;
        this.B = false;
        fp0.t tVar = this.A;
        if (tVar != null) {
            tVar.f();
        }
        this.A = null;
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var = this.f130330o;
        if (((a2Var == null || (recyclerView4 = a2Var.k().getRecyclerView()) == null) ? null : recyclerView4.getLayoutManager()) instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var2 = this.f130330o;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (a2Var2 == null || (recyclerView3 = a2Var2.k().getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var3 = this.f130330o;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f17 = a2Var3 != null ? a2Var3.f() : null;
        if (f17 != null) {
            f17.setFooterMode(0);
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var4 = this.f130330o;
        if (a2Var4 != null && (recyclerView2 = a2Var4.k().getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
            adapter2.unregisterAdapterDataObserver(this.G);
        }
        java.util.Iterator it = this.f130327i.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        this.f130327i.clear();
        this.E.dead();
        iv2.a aVar = this.f130328m;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        aVar.f295121d = f();
        java.util.Map map = com.tencent.mm.plugin.finder.uniComments.a.f130164a;
        iv2.a aVar2 = this.f130328m;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.util.Map map2 = com.tencent.mm.plugin.finder.uniComments.a.f130164a;
        kotlin.jvm.internal.o.f(map2, "access$getCacheItems$cp(...)");
        map2.put(java.lang.Long.valueOf(aVar2.a()), aVar2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onDetach] updateFeedCommentCount feedId=");
        if (this.f130328m == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        sb6.append(r6.f295123f);
        sb6.append(" commentCount ");
        sb6.append(f());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        com.tencent.mm.plugin.finder.uniComments.c cVar = this.f130332q;
        if (cVar != null) {
            int f18 = f();
            java.util.ArrayList data = this.f130326h.f130342a;
            kotlin.jvm.internal.o.g(data, "data");
            zy2.y5 y5Var = ((c61.z6) cVar).f39443a;
            if (y5Var != null) {
                com.tencent.mm.plugin.textstatus.ui.l5 l5Var = (com.tencent.mm.plugin.textstatus.ui.l5) y5Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentTransparentActivity", "onClose: commentCount:" + f18);
                ai4.m0 m0Var = ai4.m0.f5173a;
                mj4.h t17 = m0Var.G().t(l5Var.f174047a);
                if (t17 != null) {
                    mj4.j jVar = new mj4.j((mj4.k) t17);
                    jVar.f327066b.put("field_CommentCount", java.lang.Integer.valueOf(f18));
                    m0Var.G().s(jVar.a());
                }
                l5Var.f174048b.finish();
            }
        }
        if (this.f130336u || !this.f130337v) {
            this.f130326h.f130342a.clear();
        } else {
            if (this.f130338w != 0 && !com.tencent.mm.sdk.platformtools.t8.L0(this.f130326h.f130342a)) {
                java.util.Iterator it6 = this.f130326h.f130342a.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    jv2.d dVar = (jv2.d) next;
                    if (dVar.getItemId() == this.f130338w) {
                        dVar.f302213m = false;
                    }
                    i17 = i18;
                }
            }
            this.f130326h.f130342a.clear();
        }
        this.f130333r = null;
        m(false);
        l(true);
        if (!this.f130324f) {
            o();
        }
        com.tencent.mm.plugin.finder.view.FinderCommentEditText g17 = g();
        this.D = java.lang.String.valueOf(g17 != null ? g17.getText() : null);
        com.tencent.mm.plugin.finder.view.FinderCommentEditText g18 = g();
        if (g18 != null) {
            g18.setText((java.lang.CharSequence) null);
        }
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer = this.C;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter footer = textStatusCommentDrawer != null ? textStatusCommentDrawer.getFooter() : null;
        if (footer != null) {
            footer.setUseDraft(false);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentEditText g19 = g();
        if (g19 != null) {
            ((java.util.HashMap) g19.pastedList).clear();
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var5 = this.f130330o;
        com.tencent.mm.view.RefreshLoadMoreLayout k17 = a2Var5 != null ? a2Var5.k() : null;
        if (k17 != null) {
            k17.setHasBottomMore(true);
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var6 = this.f130330o;
        if (a2Var6 != null && (recyclerView = a2Var6.k().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var7 = this.f130330o;
        androidx.recyclerview.widget.RecyclerView recyclerView5 = a2Var7 != null ? a2Var7.k().getRecyclerView() : null;
        if (recyclerView5 != null) {
            recyclerView5.setLayoutFrozen(true);
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var8 = this.f130330o;
        com.tencent.mm.view.RefreshLoadMoreLayout k18 = a2Var8 != null ? a2Var8.k() : null;
        if (k18 != null) {
            k18.setActionCallback(null);
        }
        this.f130330o = null;
    }

    public final void k(boolean z17) {
        fp0.t tVar = this.A;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.uniComments.l0(z17, this), null, 2, null));
        }
    }

    @Override // im5.b
    public void keep(im5.a p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f130327i.add(p07);
    }

    public final void l(boolean z17) {
        this.f130335t = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "set downContinue " + z17);
    }

    public final void m(boolean z17) {
        this.f130334s = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "set upContinue " + z17);
    }

    public void n() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.uniComments.o1 o1Var;
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "startHideVkb: ");
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var = this.f130330o;
        if (a2Var != null && (recyclerView = a2Var.e().getRecyclerView()) != null && (o1Var = this.f130326h) != null && (arrayList = o1Var.f130342a) != null) {
            if (arrayList.size() >= 1) {
                ((jv2.d) arrayList.get(arrayList.size() - 1)).f302208e = false;
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(arrayList.size() - 1);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jv2.d) it.next()).f302209f = false;
            }
            androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
        o();
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var2 = this.f130330o;
        if (a2Var2 != null) {
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f17 = a2Var2.f();
            java.lang.String b17 = hc2.t.b(this.f130322d, this.f130329n);
            iv2.a aVar = this.f130328m;
            if (aVar != null) {
                f17.h(b17, aVar.f295122e, null);
            } else {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
        }
    }

    public final void o() {
        android.text.Editable text;
        java.lang.String obj;
        android.text.Editable text2;
        java.lang.String obj2;
        if (!this.f130324f) {
            jv2.d dVar = this.f130323e;
            if (dVar != null) {
                com.tencent.mm.plugin.finder.view.FinderCommentEditText g17 = g();
                if (g17 != null && (text2 = g17.getText()) != null && (obj2 = text2.toString()) != null) {
                    iu2.a aVar = iu2.a.f294983a;
                    jv2.a commentObj = dVar.f302207d;
                    kotlin.jvm.internal.o.g(commentObj, "commentObj");
                    aVar.b(aVar.a(commentObj), obj2);
                }
            } else {
                com.tencent.mm.plugin.finder.view.FinderCommentEditText g18 = g();
                if (g18 == null || (text = g18.getText()) == null || (obj = text.toString()) == null) {
                    java.lang.String str = this.D;
                    if (str != null) {
                        iu2.a aVar2 = iu2.a.f294983a;
                        iv2.a aVar3 = this.f130328m;
                        if (aVar3 == null) {
                            kotlin.jvm.internal.o.o("feedObj");
                            throw null;
                        }
                        aVar2.b(aVar3.f295118a, str);
                    }
                } else {
                    iu2.a aVar4 = iu2.a.f294983a;
                    iv2.a aVar5 = this.f130328m;
                    if (aVar5 == null) {
                        kotlin.jvm.internal.o.o("feedObj");
                        throw null;
                    }
                    aVar4.b(aVar5.f295118a, obj);
                }
            }
            if (this.f130323e != null) {
                this.f130323e = null;
                com.tencent.mm.plugin.finder.view.FinderCommentEditText g19 = g();
                if (g19 != null) {
                    g19.setText((java.lang.CharSequence) null);
                }
                com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer = this.C;
                com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter footer = textStatusCommentDrawer != null ? textStatusCommentDrawer.getFooter() : null;
                if (footer != null) {
                    footer.setUseDraft(false);
                }
            }
        }
        this.f130324f = false;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.uniComments.d dVar;
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter footer;
        jv2.d dVar2;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText g17;
        android.text.Editable text;
        java.lang.String obj;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter footer2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.getItemViewType() == 3 || this.f130340y) {
            return;
        }
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onItemClick position:" + i17);
            return;
        }
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer = this.C;
        boolean z17 = false;
        if (((textStatusCommentDrawer == null || (footer2 = textStatusCommentDrawer.getFooter()) == null || footer2.getFooterMode() != 2) ? false : true) && (dVar2 = this.f130323e) != null && (g17 = g()) != null && (text = g17.getText()) != null && (obj = text.toString()) != null) {
            iu2.a aVar = iu2.a.f294983a;
            jv2.a commentObj = dVar2.f302207d;
            kotlin.jvm.internal.o.g(commentObj, "commentObj");
            aVar.b(aVar.a(commentObj), obj);
            com.tencent.mm.plugin.finder.view.FinderCommentEditText g18 = g();
            if (g18 != null) {
                g18.setText((java.lang.CharSequence) null);
            }
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer2 = this.C;
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter footer3 = textStatusCommentDrawer2 != null ? textStatusCommentDrawer2.getFooter() : null;
            if (footer3 != null) {
                footer3.setUseDraft(false);
            }
            this.f130324f = true;
        }
        com.tencent.mm.plugin.finder.uniComments.o1 o1Var = this.f130326h;
        java.lang.Object obj2 = o1Var.f130342a.get(i17);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        jv2.d dVar3 = (jv2.d) obj2;
        this.f130323e = dVar3;
        if (dVar3.f302210g && ((com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d)).i()) {
            return;
        }
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer3 = this.C;
        if (textStatusCommentDrawer3 != null && (footer = textStatusCommentDrawer3.getFooter()) != null) {
            if (footer.getFooterMode() != 0) {
                android.content.Context context = footer.getContext();
                com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
                if (mMActivity != null) {
                    mMActivity.hideVKB();
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onItemClick: state:" + dVar3.f302207d.field_state);
        int i18 = dVar3.f302207d.field_state;
        if ((i18 == 1 || i18 == -1) ? false : true) {
            iv2.a aVar2 = this.f130328m;
            if (aVar2 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (aVar2.f295120c) {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context2, context2.getString(com.tencent.mm.R.string.jwi));
                hu2.a aVar3 = hu2.a.f285081a;
                iv2.a aVar4 = this.f130328m;
                if (aVar4 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                aVar3.a(aVar4.f295119b, aVar4.f295118a, aVar4.f295120c);
            } else {
                com.tencent.mm.plugin.finder.uniComments.a2 a2Var2 = this.f130330o;
                if (a2Var2 != null) {
                    com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f17 = a2Var2.f();
                    int i19 = this.f130329n;
                    jv2.a commentObj2 = dVar3.f302207d;
                    boolean z18 = i19 == 2;
                    kotlin.jvm.internal.o.g(commentObj2, "commentObj");
                    if (z18) {
                        java.lang.String str = f17.lastFromName;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
                        android.content.res.Resources resources = f17.getResources();
                        i95.m c17 = i95.n0.c(c61.yb.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        sb6.append(resources.getString(com.tencent.mm.R.string.f490925ba1, f17.i(c61.yb.md((c61.yb) c17, commentObj2.D0(), commentObj2.y0(), false, 4, null))));
                        f17.f(str, sb6.toString(), commentObj2, true);
                    } else {
                        f17.f(f17.lastFromName, " " + f17.getResources().getString(com.tencent.mm.R.string.f490925ba1, f17.i(commentObj2.y0())), commentObj2, true);
                    }
                    f17.getEditText().setShowSoftInputOnFocus(true);
                    f17.getEditText().requestFocus();
                    java.lang.String key = iu2.a.f294983a.a(commentObj2);
                    kotlin.jvm.internal.o.g(key, "key");
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDraftCache", "getDraft() called with: key = ".concat(key));
                    java.lang.String str2 = (java.lang.String) iu2.a.f294984b.get(key);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        f17.getEditText().setText(str2);
                        f17.getEditText().setSelection(str2 != null ? str2.length() : 0);
                        f17.isUseDraft = true;
                        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).ij(f17.getContext(), 19L, "", f17.mFeedUserName);
                    }
                    f17.m(true);
                }
            }
            boolean z19 = dVar3.h() == 2;
            iv2.a aVar5 = this.f130328m;
            if (aVar5 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            java.util.ArrayList arrayList = o1Var.f130342a;
            if (!aVar5.f295120c && (a2Var = this.f130330o) != null && (recyclerView2 = a2Var.e().getRecyclerView()) != null && arrayList != null) {
                if (z19) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jv2.d dVar4 = (jv2.d) it.next();
                        long A0 = dVar3.f302207d.A0();
                        if (dVar4.f302207d.A0() == A0 || dVar4.f302207d.t0() == A0) {
                            dVar4.f302209f = false;
                        } else {
                            dVar4.f302209f = true;
                        }
                    }
                } else {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        jv2.d dVar5 = (jv2.d) it6.next();
                        long t07 = dVar3.f302207d.t0();
                        if (dVar5.f302207d.A0() == t07 || dVar5.f302207d.t0() == t07) {
                            dVar5.f302209f = false;
                        } else {
                            dVar5.f302209f = true;
                        }
                    }
                }
                androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                }
            }
            boolean z27 = dVar3.h() == 2;
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var3 = this.f130330o;
            if (a2Var3 != null && (dVar = a2Var3.f130167d) != null && ((com.tencent.mm.plugin.finder.uniComments.o0) dVar).d(dVar3, true)) {
                z17 = true;
            }
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var4 = this.f130330o;
            if (a2Var4 == null || (recyclerView = a2Var4.e().getRecyclerView()) == null) {
                return;
            }
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.dz_);
            if (findViewById == null) {
                findViewById = view.findViewById(com.tencent.mm.R.id.dza);
            }
            iv2.a aVar6 = this.f130328m;
            if (aVar6 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (!aVar6.f295120c && arrayList != null && arrayList.size() >= 1) {
                ((jv2.d) arrayList.get(arrayList.size() - 1)).f302208e = true;
                androidx.recyclerview.widget.f2 adapter3 = recyclerView.getAdapter();
                if (adapter3 != null) {
                    adapter3.notifyItemChanged(arrayList.size() - 1);
                }
            }
            if (findViewById != null) {
                recyclerView.post(new com.tencent.mm.plugin.finder.uniComments.n0(findViewById, this, z27, z17, recyclerView));
            }
        }
    }
}
