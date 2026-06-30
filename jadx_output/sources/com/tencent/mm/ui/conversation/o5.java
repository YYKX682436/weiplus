package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class o5 implements c01.y8, l75.z0, xg3.h0 {
    public boolean A;
    public boolean B;
    public ag5.b D;
    public final com.tencent.mm.sdk.event.IListener E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public long f207923J;
    public final java.util.concurrent.atomic.AtomicBoolean K;

    /* renamed from: d, reason: collision with root package name */
    public yf5.j0 f207924d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f207925e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.ConversationListView f207926f;

    /* renamed from: g, reason: collision with root package name */
    public s35.b f207927g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f207928h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f207929i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f207930m;

    /* renamed from: n, reason: collision with root package name */
    public int f207931n;

    /* renamed from: o, reason: collision with root package name */
    public int f207932o;

    /* renamed from: p, reason: collision with root package name */
    public int f207933p;

    /* renamed from: q, reason: collision with root package name */
    public int f207934q;

    /* renamed from: r, reason: collision with root package name */
    public int f207935r;

    /* renamed from: s, reason: collision with root package name */
    public int f207936s;

    /* renamed from: t, reason: collision with root package name */
    public int f207937t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f207939v;

    /* renamed from: w, reason: collision with root package name */
    public int f207940w;

    /* renamed from: x, reason: collision with root package name */
    public int f207941x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f207942y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f207943z;

    /* renamed from: u, reason: collision with root package name */
    public int f207938u = -1;
    public final java.lang.Runnable C = new com.tencent.mm.ui.conversation.b5(this);

    public o5() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetConvEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.FolderHelper$convBoxEventListener$1
            {
                this.__eventId = -1733768384;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetConvEvent getConvEvent) {
                com.tencent.mm.ui.conversation.d8 d8Var;
                java.util.ArrayList arrayList;
                java.util.HashMap hashMap;
                java.util.Collection values;
                jz5.f0 f0Var;
                yf5.a aVar;
                android.util.SparseArray sparseArray;
                int i17;
                int i18;
                int i19;
                jz5.f0 f0Var2;
                jz5.f0 f0Var3;
                jz5.f0 f0Var4;
                jz5.f0 f0Var5;
                java.util.Collection values2;
                com.tencent.mm.autogen.events.GetConvEvent event = getConvEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.pf pfVar = event.f54388g;
                int i27 = pfVar.f7618c;
                com.tencent.mm.ui.conversation.o5 o5Var = com.tencent.mm.ui.conversation.o5.this;
                if (i27 == 0) {
                    yf5.j0 j0Var = o5Var.f207924d;
                    if (j0Var == null || (sparseArray = (aVar = ((yf5.w0) j0Var).f461985q).f461845b) == null) {
                        f0Var = null;
                    } else {
                        java.util.HashMap hashMap2 = aVar.f461846c;
                        if (hashMap2 == null || (values2 = hashMap2.values()) == null) {
                            i17 = 0;
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (java.lang.Object obj : values2) {
                                if (((com.tencent.mm.storage.m4) c01.d9.b().r()).J((com.tencent.mm.storage.l4) obj)) {
                                    arrayList2.add(obj);
                                }
                            }
                            i17 = arrayList2.size();
                        }
                        int size = sparseArray.size();
                        if (size >= 0) {
                            int i28 = 0;
                            i18 = 0;
                            while (true) {
                                java.lang.String str = (java.lang.String) sparseArray.get(i28);
                                if (i28 < o5Var.f207937t + i17) {
                                    com.tencent.mm.storage.l4 l17 = o5Var.l(str);
                                    if (kotlin.jvm.internal.o.b(l17 != null ? l17.W0() : null, "conversationboxservice") || kotlin.jvm.internal.o.b(str, "conversationboxservice") || kotlin.jvm.internal.o.b(str, pfVar.f7617b)) {
                                        i18++;
                                    }
                                }
                                if (i28 == size) {
                                    break;
                                }
                                i28++;
                            }
                        } else {
                            i18 = 0;
                        }
                        if (kotlin.jvm.internal.o.b(sparseArray.get(o5Var.f207937t + i17), "conversationboxservice")) {
                            i18++;
                        }
                        int i29 = i17 + o5Var.f207937t + i18;
                        java.lang.String str2 = (java.lang.String) sparseArray.get(i29);
                        jz5.f0 f0Var6 = jz5.f0.f302826a;
                        if (str2 != null) {
                            com.tencent.mm.storage.l4 l18 = o5Var.l(str2);
                            if (l18 != null) {
                                com.tencent.mm.ui.conversation.d8 d8Var2 = pfVar.f7616a;
                                if (d8Var2 != null) {
                                    i19 = size;
                                    d8Var2.b(l18.w0() + 1000);
                                } else {
                                    i19 = size;
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: " + l18.w0() + ", talker: " + l18.h1() + ", position: " + i29 + ", offset: " + i18);
                                f0Var5 = f0Var6;
                            } else {
                                i19 = size;
                                f0Var5 = null;
                            }
                            if (f0Var5 == null) {
                                com.tencent.mm.ui.conversation.d8 d8Var3 = pfVar.f7616a;
                                if (d8Var3 != null) {
                                    d8Var3.b(0L);
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: 0");
                            }
                            f0Var2 = f0Var6;
                        } else {
                            i19 = size;
                            f0Var2 = null;
                        }
                        if (f0Var2 == null) {
                            int i37 = i19;
                            int i38 = i37 < 1 ? 0 : i37 - 1;
                            java.lang.String str3 = (java.lang.String) sparseArray.get(i38);
                            if (str3 != null) {
                                com.tencent.mm.storage.l4 l19 = o5Var.l(str3);
                                if (l19 != null) {
                                    com.tencent.mm.ui.conversation.d8 d8Var4 = pfVar.f7616a;
                                    if (d8Var4 != null) {
                                        d8Var4.b(l19.w0() - 1000);
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime _lastUserName:" + str3 + " pos:" + i38);
                                    f0Var4 = f0Var6;
                                } else {
                                    f0Var4 = null;
                                }
                                if (f0Var4 == null) {
                                    com.tencent.mm.ui.conversation.d8 d8Var5 = pfVar.f7616a;
                                    if (d8Var5 != null) {
                                        d8Var5.b(0L);
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: 0, pos item is empty for findConversationWithDB");
                                }
                                f0Var3 = f0Var6;
                            } else {
                                f0Var3 = null;
                            }
                            if (f0Var3 == null) {
                                com.tencent.mm.ui.conversation.d8 d8Var6 = pfVar.f7616a;
                                if (d8Var6 != null) {
                                    d8Var6.b(0L);
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: 0, pos item is empty");
                            }
                        }
                        f0Var = f0Var6;
                    }
                    if (f0Var == null) {
                        com.tencent.mm.ui.conversation.d8 d8Var7 = pfVar.f7616a;
                        if (d8Var7 != null) {
                            d8Var7.b(0L);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: 0, pos is empty");
                    }
                } else if (i27 == 1 && (d8Var = pfVar.f7616a) != null) {
                    yf5.j0 j0Var2 = o5Var.f207924d;
                    if (j0Var2 == null || (hashMap = ((yf5.w0) j0Var2).f461985q.f461846c) == null || (values = hashMap.values()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : values) {
                            if (r01.z.n(((com.tencent.mm.storage.l4) obj2).h1())) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    d8Var.a(arrayList);
                }
                return true;
            }
        };
        this.G = -1;
        this.H = -1;
        this.K = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (((va3.z0) q21.d.a()).f(r9.Q0()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r9.getType() != 268445456) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.ui.conversation.o5 r7, xg3.l0 r8, com.tencent.mm.storage.f9 r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.o5.a(com.tencent.mm.ui.conversation.o5, xg3.l0, com.tencent.mm.storage.f9, boolean):void");
    }

    public static /* synthetic */ void h(com.tencent.mm.ui.conversation.o5 o5Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkFoldBannerVisible");
        }
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        o5Var.f(i17, z17);
    }

    public final void A(boolean z17) {
        if (this.f207925e == null || !gm0.j1.a() || this.f207928h == null || this.f207926f == null || this.f207924d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FolderHelper", "acc is not ready!");
            return;
        }
        boolean z18 = z17 || this.I;
        this.I = false;
        pm0.v.V(100L, new com.tencent.mm.ui.conversation.n5(this, z18));
    }

    public final void B(java.util.List userNames, java.lang.String parentRef) {
        kotlin.jvm.internal.o.g(userNames, "userNames");
        kotlin.jvm.internal.o.g(parentRef, "parentRef");
        g95.x.f269827a.f(userNames, parentRef);
    }

    @Override // c01.y8
    public void a0() {
        A(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (kotlin.jvm.internal.o.b(r0 != null ? r0.W0() : null, "hidden_conv_parent") != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.tencent.mm.storage.l4 r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.o5.b(com.tencent.mm.storage.l4, boolean, boolean):int");
    }

    public final void c(int i17, boolean z17) {
        if (z17) {
            try {
                i17 -= com.tencent.mm.ui.bl.c(this.f207925e);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FolderHelper", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        int h17 = com.tencent.mm.ui.bl.h(this.f207925e);
        int a17 = com.tencent.mm.ui.bl.a(this.f207925e);
        int h18 = i65.a.h(this.f207925e, com.tencent.mm.R.dimen.f479627b2);
        int i18 = (i17 - a17) - h18;
        this.f207934q = i18;
        this.f207936s = i17 - h18;
        this.f207935r = a17 + h17;
        this.f207937t = i18 / this.f207931n;
        com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "configParams, height: " + i17);
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.conversation.g5(l0Var, this), "FolderHelper");
    }

    public final void d(com.tencent.mm.storage.l4 conv) {
        kotlin.jvm.internal.o.g(conv, "conv");
        if (p()) {
            return;
        }
        java.lang.String W0 = conv.W0();
        if (!(W0 == null || W0.length() == 0) || com.tencent.mm.storage.z3.X3(conv.h1())) {
            return;
        }
        conv.e2(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        boolean r17 = r();
        g95.w wVar = g95.x.f269827a;
        if (!r17) {
            java.lang.String h17 = conv.h1();
            kotlin.jvm.internal.o.f(h17, "getUsername(...)");
            wVar.e(h17, conv.W0(), conv.u0());
        } else {
            conv.T1("message_fold");
            java.lang.String h18 = conv.h1();
            kotlin.jvm.internal.o.f(h18, "getUsername(...)");
            wVar.e(h18, "message_fold", conv.u0());
        }
    }

    public final void e(java.lang.String str, boolean z17) {
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
        if (kotlin.jvm.internal.o.b(p17 != null ? p17.W0() : null, "message_fold")) {
            if (z17) {
                p17.c2(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            }
            g95.w wVar = g95.x.f269827a;
            java.lang.String h17 = p17.h1();
            kotlin.jvm.internal.o.f(h17, "getUsername(...)");
            wVar.e(h17, "", p17.u0());
        }
    }

    public final void f(int i17, boolean z17) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2 = this.f207928h;
        if (!(linearLayout2 != null && linearLayout2.getVisibility() == i17) && (linearLayout = this.f207928h) != null) {
            linearLayout.setVisibility(i17);
        }
        if (i17 == 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072;
            z(z18 ? 131072 : 262144, this.f207929i, this.f207930m, z17 ? !z18 ? this.f207940w : g95.x.f269827a.c() : this.f207940w);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 stg, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stg, "stg");
        kotlin.jvm.internal.o.g(obj, "obj");
        if (gm0.j1.a() && stg == c01.d9.b().p()) {
            int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
            if (8193 == o17) {
                A(true);
            }
            if (42 == o17) {
                A(true);
                return;
            }
            return;
        }
        if (stg instanceof com.tencent.mm.storage.l8) {
            java.lang.String str = (java.lang.String) obj;
            if (i17 == 5) {
                if (com.tencent.mm.storage.z3.X3(str)) {
                    pm0.v.X(new com.tencent.mm.ui.conversation.h5(this));
                } else {
                    A(true);
                }
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                if (c01.v1.y(str)) {
                    if (((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).Ai() == 0) {
                        ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("conversationboxservice");
                    } else {
                        ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).aj(false);
                    }
                }
                g95.d0.f269796a.a(str);
                ti3.c.f419579a.c(str, "");
            }
        }
    }

    public final void i(boolean z17, int i17) {
        yf5.n m17 = m("message_fold");
        if (m17 != null) {
            z(z17 ? 131072 : 262144, m17.f461932s, m17.f461933t, i17);
        }
        android.widget.LinearLayout linearLayout = this.f207928h;
        boolean z18 = false;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            z18 = true;
        }
        if (z18) {
            z(z17 ? 131072 : 262144, this.f207929i, this.f207930m, i17);
        }
        if (p()) {
            return;
        }
        this.f207940w = i17;
    }

    public final boolean j(boolean z17) {
        java.util.Map map;
        boolean z18 = k("message_fold") != null;
        if (!z17 && z18) {
            return false;
        }
        yf5.j0 j0Var = this.f207924d;
        if (j0Var == null || (map = ((yf5.w0) j0Var).f461985q.f461846c) == null) {
            map = kz5.q0.f314001d;
        }
        java.util.Collection values = java.util.Collections.synchronizedMap(map).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) obj;
            if (com.tencent.mm.storage.l8.f195092b.contains(java.lang.Integer.valueOf(l4Var.f195085g2)) && ((com.tencent.mm.storage.m4) c01.d9.b().r()).J(l4Var) && !com.tencent.mm.storage.z3.X3(l4Var.h1())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size() + (r() ? g95.x.f269827a.c() : 0);
        boolean o17 = o(size);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIfShowFoldItem, ifShow:");
        sb6.append(o17);
        sb6.append(", existFoldItem:");
        sb6.append(z18);
        sb6.append(", topSize:");
        sb6.append(size);
        sb6.append(", forceShowBanner:");
        sb6.append(z17);
        sb6.append(", isCollapse:");
        sb6.append(com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072);
        com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", sb6.toString());
        return o17;
    }

    public final com.tencent.mm.storage.l4 k(java.lang.String str) {
        yf5.j0 j0Var = this.f207924d;
        if (j0Var != null) {
            return ((yf5.w0) j0Var).h(str);
        }
        return null;
    }

    public final com.tencent.mm.storage.l4 l(java.lang.String str) {
        com.tencent.mm.storage.l4 h17;
        yf5.j0 j0Var = this.f207924d;
        return (j0Var == null || (h17 = ((yf5.w0) j0Var).h(str)) == null) ? ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str) : h17;
    }

    public final yf5.n m(java.lang.String str) {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207926f;
        if (conversationListView != null) {
            int childCount = conversationListView.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = conversationListView.getChildAt(i17);
                android.view.View findViewById = childAt != null ? childAt.findViewById(com.tencent.mm.R.id.f483944cj1) : null;
                if (findViewById != null && (findViewById.getTag() instanceof yf5.n)) {
                    java.lang.Object tag = findViewById.getTag();
                    kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
                    yf5.n nVar = (yf5.n) tag;
                    if (kotlin.jvm.internal.o.b(nVar.f461926m, str)) {
                        return nVar;
                    }
                }
            }
        }
        return null;
    }

    public final java.util.Collection n() {
        java.util.Map map;
        yf5.j0 j0Var = this.f207924d;
        if (j0Var == null || (map = ((yf5.w0) j0Var).f461985q.f461846c) == null) {
            map = kz5.q0.f314001d;
        }
        java.util.Collection values = java.util.Collections.synchronizedMap(map).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (!com.tencent.mm.storage.z3.X3(((com.tencent.mm.storage.l4) obj).h1())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean o(int i17) {
        if (this.G == -1) {
            this.G = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_msg_fold_limit_num, Integer.MAX_VALUE);
        }
        return i17 <= this.G && ((float) (i17 * this.f207931n)) >= ((float) this.f207934q) * 1.0f;
    }

    public final boolean p() {
        java.util.HashMap hashMap;
        java.util.Collection values;
        yf5.j0 j0Var = this.f207924d;
        java.lang.Object obj = null;
        if (j0Var != null && (hashMap = ((yf5.w0) j0Var).f461985q.f461846c) != null && (values = hashMap.values()) != null) {
            java.util.Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                int i17 = ((com.tencent.mm.storage.l4) next).f195085g2;
                if (i17 == 66 || i17 == 132) {
                    obj = next;
                    break;
                }
            }
            obj = (com.tencent.mm.storage.l4) obj;
        }
        return obj != null || this.A || this.B;
    }

    public final void q() {
        java.util.HashMap hashMap;
        if (((com.tencent.mm.storage.m4) c01.d9.b().r()).p("message_fold") != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "fold item exist");
            return;
        }
        com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
        l4Var.f195085g2 = 262144;
        l4Var.b2("message_fold");
        android.content.Context context = this.f207925e;
        l4Var.l1(context != null ? context.getString(com.tencent.mm.R.string.b1q) : null);
        l4Var.n1(0L);
        l4Var.z1(xg3.b.b(l4Var, 2, 0L));
        if (((com.tencent.mm.storage.m4) c01.d9.b().r()).G(l4Var) == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FolderHelper", "insert fold item failed, ignore it");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").A("fold_button_status_int_sync", 262144);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        yf5.j0 j0Var = this.f207924d;
        if (j0Var != null && (hashMap = ((yf5.w0) j0Var).f461985q.f461846c) != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.l4 l4Var2 = (com.tencent.mm.storage.l4) ((java.util.Map.Entry) it.next()).getValue();
                if (l4Var2 != null) {
                    l4Var2.f195085g2 = b(l4Var2, false, false);
                }
                int i17 = l4Var2.f195085g2;
                if (i17 == 2 || i17 == 66) {
                    arrayList.add(l4Var2.h1());
                }
            }
        }
        B(arrayList, "message_fold");
        com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "insert fold item suc");
    }

    public final boolean r() {
        return com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072;
    }

    public final boolean s() {
        int o17 = com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536);
        return o17 == 262144 || o17 == 65536;
    }

    public final void t() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "onTabPause");
        if (this.F) {
            this.F = false;
            s35.b bVar = this.f207927g;
            if (bVar != null) {
                bVar.j();
            }
            c01.d9.b().p().e(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(yf5.n nVar) {
        long j17;
        int i17;
        boolean z17;
        float f17;
        int i18;
        java.lang.String str;
        com.tencent.mm.ui.conversation.i5 i5Var;
        int i19;
        java.lang.String str2;
        long j18;
        android.view.View view;
        java.util.HashMap hashMap;
        jz5.f0 f0Var;
        com.tencent.mm.ui.conversation.o5 o5Var = this;
        yf5.j0 j0Var = o5Var.f207924d;
        int i27 = 132;
        android.view.View view2 = null;
        boolean z18 = false;
        long j19 = 0;
        if (j0Var == null || (hashMap = ((yf5.w0) j0Var).f461985q.f461846c) == null) {
            j17 = 0;
            i17 = 0;
            z17 = false;
        } else {
            java.util.Iterator it = hashMap.entrySet().iterator();
            i17 = 0;
            z17 = false;
            while (it.hasNext()) {
                com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) ((java.util.Map.Entry) it.next()).getValue();
                int b17 = o5Var.b(l4Var, false, false);
                if (b17 == 2 || b17 == 66) {
                    if (o5Var.m(l4Var.h1()) != null) {
                        o5Var.y(l4Var, 132, null);
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        o5Var.y(l4Var, 4, "message_fold");
                    }
                    i17++;
                }
                if (com.tencent.mm.storage.z3.X3(l4Var.h1())) {
                    o5Var.y(l4Var, 131072, null);
                    z17 = true;
                } else if (((com.tencent.mm.storage.m4) c01.d9.b().r()).J(l4Var)) {
                    j19++;
                }
            }
            j17 = j19;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String str3 = ", allTopCount: ";
        java.lang.String str4 = "MicroMsg.FolderHelper";
        if (!z17) {
            p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
            p75.y yVar = (p75.y) dm.i2.T.o(4611686018427387904L).c(dm.i2.W.m());
            yVar.f(dm.i2.M.i(0));
            yVar.f(dm.i2.f237526p0.i(0));
            yVar.f(dm.i2.X.g(537919488, 0));
            g17.f352657d = yVar;
            java.util.List l17 = g17.a().l(gm0.j1.u().f273153f);
            h0Var.f310123d = l17;
            i17 = l17.size();
            com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "performAllCollapse, fold item not exit! topFoldCount: " + i17 + ", allTopCount: " + j17);
        }
        int i28 = i17;
        com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").A("fold_button_status_int_sync", 131072);
        o5Var.i(true, i28);
        o5Var.f207939v = false;
        o5Var.f207943z = false;
        o5Var.A = true;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = o5Var.f207926f;
        if (conversationListView != null) {
            int headerViewsCount = conversationListView != null ? conversationListView.getHeaderViewsCount() : 0;
            com.tencent.mm.ui.conversation.ConversationListView conversationListView2 = o5Var.f207926f;
            int footerViewsCount = headerViewsCount + (conversationListView2 != null ? conversationListView2.getFooterViewsCount() : 0);
            yf5.j0 j0Var2 = o5Var.f207924d;
            f17 = conversationListView.c(footerViewsCount + (j0Var2 != null ? ((yf5.w0) j0Var2).f461985q.f461844a : 0), i28, true);
        } else {
            f17 = 0.0f;
        }
        float f18 = f17;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView3 = o5Var.f207926f;
        int emptyFooterHeight = conversationListView3 != null ? conversationListView3.getEmptyFooterHeight() : 0;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView4 = o5Var.f207926f;
        int count = conversationListView4 != null ? conversationListView4.getCount() : 0;
        com.tencent.mm.ui.conversation.i5 i5Var2 = new com.tencent.mm.ui.conversation.i5(new kotlin.jvm.internal.f0(), count, o5Var, h0Var);
        boolean z19 = false;
        int i29 = 0;
        while (i29 < count) {
            com.tencent.mm.ui.conversation.ConversationListView conversationListView5 = o5Var.f207926f;
            android.view.View childAt = conversationListView5 != null ? conversationListView5.getChildAt(i29) : view2;
            android.view.View findViewById = childAt != null ? childAt.findViewById(com.tencent.mm.R.id.f483944cj1) : view2;
            if (findViewById == null || !(findViewById.getTag() instanceof yf5.n)) {
                i18 = i29;
                str = str4;
                i5Var = i5Var2;
                i19 = count;
                str2 = str3;
                j18 = j17;
                view = null;
                i5Var.a(null);
            } else {
                java.lang.Object tag = findViewById.getTag();
                kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
                yf5.n nVar2 = (yf5.n) tag;
                yf5.j0 j0Var3 = o5Var.f207924d;
                com.tencent.mm.storage.l4 item = j0Var3 != null ? ((yf5.w0) j0Var3).getItem(nVar2.f461928o) : view2;
                if ((item == 0 || item.f195085g2 != i27) ? z18 : true) {
                    android.view.ViewGroup.LayoutParams layoutParams = nVar2.f461930q.getLayoutParams();
                    int measuredHeight = nVar2.f461930q.getMeasuredHeight();
                    j18 = j17;
                    oa5.b p17 = oa5.b.b(nVar2.f461930q).g(250L).p(new com.tencent.mm.ui.conversation.j5(nVar2, o5Var));
                    i18 = i29;
                    str = str4;
                    i5Var = i5Var2;
                    i19 = count;
                    str2 = str3;
                    p17.k(new com.tencent.mm.ui.conversation.k5(measuredHeight, layoutParams, nVar2, emptyFooterHeight, f18, this)).o(new com.tencent.mm.ui.conversation.l5(nVar2, layoutParams, i5Var)).l();
                } else {
                    i18 = i29;
                    str = str4;
                    i5Var = i5Var2;
                    i19 = count;
                    str2 = str3;
                    j18 = j17;
                    i5Var.a(nVar2);
                }
                z19 = true;
                view = null;
            }
            i29 = i18 + 1;
            str3 = str2;
            str4 = str;
            i5Var2 = i5Var;
            j17 = j18;
            count = i19;
            i27 = 132;
            z18 = false;
            o5Var = this;
            view2 = view;
        }
        java.lang.String str5 = str4;
        com.tencent.mm.ui.conversation.i5 i5Var3 = i5Var2;
        java.lang.String str6 = str3;
        long j27 = j17;
        if (!z19) {
            java.util.List list = (java.util.List) i5Var3.f207745d.f310123d;
            com.tencent.mm.ui.conversation.o5 o5Var2 = i5Var3.f207744c;
            o5Var2.x(false, list);
            o5Var2.K.set(false);
        }
        com.tencent.mm.autogen.mmdata.rpt.TopSessionFoldStruct topSessionFoldStruct = new com.tencent.mm.autogen.mmdata.rpt.TopSessionFoldStruct();
        topSessionFoldStruct.f61314d = j27;
        topSessionFoldStruct.f61315e = 1L;
        topSessionFoldStruct.k();
        com.tencent.mars.xlog.Log.i(str5, "[perform collapse] topFoldCount: " + i28 + str6 + j27);
    }

    public final void v() {
        boolean z17;
        java.util.HashMap hashMap;
        jz5.f0 f0Var;
        if (p()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FolderHelper", "performFoldItemClick in animation");
            return;
        }
        if (s()) {
            yf5.n m17 = m("message_fold");
            if (m17 != null) {
                u(m17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                u(null);
                return;
            }
            return;
        }
        if (!r()) {
            h(this, 8, false, 2, null);
            com.tencent.mars.xlog.Log.e("MicroMsg.FolderHelper", "fold item no exist or no need collapse or expand !");
            return;
        }
        yf5.j0 j0Var = this.f207924d;
        long j17 = 0;
        if (j0Var == null || (hashMap = ((yf5.w0) j0Var).f461985q.f461846c) == null) {
            z17 = false;
        } else {
            java.util.Iterator it = hashMap.entrySet().iterator();
            z17 = false;
            while (it.hasNext()) {
                com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) ((java.util.Map.Entry) it.next()).getValue();
                if (com.tencent.mm.storage.z3.X3(l4Var.h1())) {
                    y(l4Var, 262144, null);
                    z17 = true;
                } else if (((com.tencent.mm.storage.m4) c01.d9.b().r()).J(l4Var)) {
                    j17++;
                }
            }
        }
        if (!z17) {
            h(this, 8, false, 2, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "performAllExpand, fold item not exit!");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").A("fold_button_status_int_sync", 262144);
        this.f207939v = true;
        this.K.set(true);
        x(true, null);
        int i17 = this.f207940w;
        long j18 = j17 + i17;
        i(false, i17);
        com.tencent.mm.autogen.mmdata.rpt.TopSessionFoldStruct topSessionFoldStruct = new com.tencent.mm.autogen.mmdata.rpt.TopSessionFoldStruct();
        topSessionFoldStruct.f61314d = j18;
        topSessionFoldStruct.f61315e = 2L;
        topSessionFoldStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "[perform expand], allPlaceTopCount: " + j18 + ", foldedItemCounts:" + this.f207940w);
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207926f;
        java.lang.Runnable runnable = this.C;
        if (conversationListView != null) {
            conversationListView.removeCallbacks(runnable);
        }
        com.tencent.mm.ui.conversation.ConversationListView conversationListView2 = this.f207926f;
        if (conversationListView2 != null) {
            conversationListView2.postDelayed(runnable, 500L);
        }
    }

    public final void w(boolean z17) {
        int i17;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207926f;
        if (conversationListView != null) {
            yf5.j0 j0Var = this.f207924d;
            android.util.SparseArray sparseArray = j0Var != null ? ((yf5.w0) j0Var).f461985q.f461845b : null;
            if (sparseArray != null) {
                int size = sparseArray.size();
                i17 = 0;
                while (i17 < size) {
                    if (kotlin.jvm.internal.o.b(sparseArray.get(i17), "message_fold")) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            i17 = -1;
            int intValue = java.lang.Integer.valueOf(i17).intValue();
            if (intValue >= 0) {
                if (z17) {
                    conversationListView.smoothScrollToPositionFromTop(conversationListView.getHeaderViewsCount() + intValue, 0, (int) 100);
                } else {
                    conversationListView.smoothScrollToPositionFromTop(conversationListView.getHeaderViewsCount() + intValue, 0, 0);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if ((r6 != null && r6.f195085g2 == 132) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r11, java.util.List r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            yf5.j0 r2 = r10.f207924d
            java.lang.String r3 = "message_fold"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L86
            yf5.w0 r2 = (yf5.w0) r2
            yf5.a r2 = r2.f461985q
            java.util.HashMap r2 = r2.f461846c
            if (r2 == 0) goto L86
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L86
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            com.tencent.mm.storage.l4 r6 = (com.tencent.mm.storage.l4) r6
            c01.f r7 = c01.d9.b()
            com.tencent.mm.storage.l8 r7 = r7.r()
            com.tencent.mm.storage.m4 r7 = (com.tencent.mm.storage.m4) r7
            boolean r7 = r7.J(r6)
            r8 = 0
            if (r7 == 0) goto L82
            if (r6 != 0) goto L48
            goto L4e
        L48:
            int r7 = r10.b(r6, r5, r5)
            r6.f195085g2 = r7
        L4e:
            if (r6 == 0) goto L57
            int r7 = r6.f195085g2
            r9 = 4
            if (r7 != r9) goto L57
            r7 = r4
            goto L58
        L57:
            r7 = r5
        L58:
            if (r7 != 0) goto L67
            if (r6 == 0) goto L64
            int r7 = r6.f195085g2
            r9 = 132(0x84, float:1.85E-43)
            if (r7 != r9) goto L64
            r7 = r4
            goto L65
        L64:
            r7 = r5
        L65:
            if (r7 == 0) goto L6e
        L67:
            java.lang.String r7 = r6.h1()
            r0.add(r7)
        L6e:
            if (r6 == 0) goto L74
            java.lang.String r8 = r6.W0()
        L74:
            boolean r7 = kotlin.jvm.internal.o.b(r8, r3)
            if (r7 == 0) goto L22
            java.lang.String r6 = r6.h1()
            r1.add(r6)
            goto L22
        L82:
            r10.y(r6, r5, r8)
            goto L22
        L86:
            if (r11 != 0) goto Lb0
            ag5.b r11 = r10.D
            if (r11 == 0) goto L8f
            r11.a()
        L8f:
            r10.f207941x = r5
            com.tencent.mm.ui.conversation.ConversationListView r11 = r10.f207926f
            if (r11 == 0) goto L98
            r11.h(r5)
        L98:
            if (r12 == 0) goto L9f
            int r11 = r12.size()
            goto La3
        L9f:
            int r11 = r0.size()
        La3:
            r10.f207940w = r11
            r10.A = r5
            r10.f207943z = r4
            if (r12 != 0) goto Lac
            r12 = r0
        Lac:
            r10.B(r12, r3)
            goto Lce
        Lb0:
            java.lang.System.currentTimeMillis()
            g95.w r11 = g95.x.f269827a
            java.util.List r11 = r11.b()
            r12 = r11
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r12 = r12.size()
            r10.f207940w = r12
            r10.f207941x = r12
            r10.B = r4
            java.lang.String r12 = ""
            r10.B(r11, r12)
            java.lang.System.currentTimeMillis()
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.o5.x(boolean, java.util.List):void");
    }

    public final void y(com.tencent.mm.storage.l4 l4Var, int i17, java.lang.String str) {
        if (l4Var != null) {
            l4Var.f195085g2 = i17;
        }
        if (l4Var == null) {
            return;
        }
        l4Var.T1(str);
    }

    public final void z(int i17, android.view.View view, android.widget.TextView textView, int i18) {
        if (i17 == 131072) {
            if (view != null) {
                view.setRotation(0.0f);
            }
            if (textView != null) {
                android.content.res.Resources resources = textView.getResources();
                textView.setText(resources != null ? resources.getString(com.tencent.mm.R.string.b1p, java.lang.Integer.valueOf(i18)) : null);
            }
            this.f207940w = i18;
            return;
        }
        if (view != null) {
            view.setRotation(180.0f);
        }
        if (textView == null) {
            return;
        }
        android.content.res.Resources resources2 = textView.getResources();
        textView.setText(resources2 != null ? resources2.getString(com.tencent.mm.R.string.b1q) : null);
    }
}
