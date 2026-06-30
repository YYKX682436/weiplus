package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes9.dex */
public final class k extends xm3.t0 implements sb5.z {
    public final java.util.Set A1;
    public com.tencent.mm.ui.chatting.e6 B1;
    public final com.tencent.mm.ui.chatting.e6 C1;
    public com.tencent.mm.ui.chatting.d6 D1;
    public final com.tencent.mm.ui.chatting.d6 E1;
    public com.tencent.mm.pluginsdk.ui.chat.x9 F1;
    public final com.tencent.mm.pluginsdk.ui.chat.x9 G1;
    public com.tencent.mm.ui.df H1;
    public final com.tencent.mm.ui.df I1;
    public com.tencent.mm.ui.chatting.u0 J1;
    public final yb5.d K;
    public final com.tencent.mm.ui.chatting.u0 K1;
    public final com.tencent.mm.pluginsdk.ui.tools.v3 L;
    public final com.tencent.mm.pluginsdk.ui.span.z L1;
    public final java.util.List M;
    public final com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$chatMsgChange$1 M1;
    public final jz5.g N;
    public final wf0.u1 N1;
    public final com.tencent.mm.sdk.platformtools.b4 O1;
    public long P;
    public final xg3.h0 P1;
    public final java.util.Map Q;
    public final com.tencent.mm.sdk.event.IListener Q1;
    public final java.util.Map R;
    public boolean R1;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final java.util.concurrent.CopyOnWriteArraySet W;
    public android.view.View.OnClickListener X;
    public int Y;
    public ke5.f0 Z;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f198422l1;

    /* renamed from: p0, reason: collision with root package name */
    public o11.g f198423p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f198424p1;

    /* renamed from: x0, reason: collision with root package name */
    public final long f198425x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f198426x1;

    /* renamed from: y0, reason: collision with root package name */
    public long f198427y0;

    /* renamed from: y1, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.dr f198428y1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.Runnable f198429z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$chatMsgChange$1] */
    public k(final yb5.d context, com.tencent.mm.pluginsdk.ui.tools.v3 mListView, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        super(mvvmList, new in5.s() { // from class: com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$Companion$buildItemConvertFactory$1
            @Override // in5.s
            public od5.g getItemConvert(int type) {
                return new od5.g(type, yb5.d.this);
            }
        }, true);
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent> iListener;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mListView, "mListView");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
        this.K = context;
        this.L = mListView;
        this.M = new te5.q1();
        this.N = jz5.h.b(new com.tencent.mm.ui.chatting.adapter.d(this));
        jz5.h.b(new com.tencent.mm.ui.chatting.adapter.c(this));
        this.Q = new java.util.HashMap();
        this.R = new java.util.HashMap();
        this.S = -1L;
        this.W = new java.util.concurrent.CopyOnWriteArraySet();
        this.Y = -1;
        this.f198425x0 = -1L;
        this.f198427y0 = -1L;
        this.f198428y1 = new com.tencent.mm.ui.chatting.viewitems.wr(context);
        this.A1 = new java.util.HashSet();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.M1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChatMsgNotifyEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$chatMsgChange$1
            {
                this.__eventId = -195924424;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChatMsgNotifyEvent chatMsgNotifyEvent) {
                jz5.f0 f0Var;
                java.lang.Object obj;
                com.tencent.mm.autogen.events.ChatMsgNotifyEvent event = chatMsgNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.a2 a2Var = event.f54036g;
                boolean z17 = a2Var.f6119c;
                com.tencent.mm.ui.chatting.adapter.k kVar = com.tencent.mm.ui.chatting.adapter.k.this;
                if (z17) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(a2Var.f6117a);
                    java.lang.String str = a2Var.f6118b;
                    long longValue = valueOf.longValue();
                    java.util.Iterator it = kVar.I.f152065o.iterator();
                    while (true) {
                        f0Var = null;
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((rd5.d) obj).f394254d.f445300b.getMsgId() == longValue) {
                            break;
                        }
                    }
                    rd5.d dVar = (rd5.d) obj;
                    if (dVar != null) {
                        kVar.h(dVar);
                        f0Var = jz5.f0.f302826a;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingDataAdapterV3", "onChatMsgChange() wrong with: msgId = " + longValue + ", talker = " + str);
                    }
                } else {
                    ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) kVar.K.f460708c.a(sb5.z.class))).Q0();
                }
                return true;
            }
        };
        this.f293107q = true;
        context.z(sb5.z.class, this);
        com.tencent.mm.ui.chatting.e6 e6Var = new com.tencent.mm.ui.chatting.e6();
        this.C1 = e6Var;
        this.B1 = e6Var;
        com.tencent.mm.ui.chatting.d6 d6Var = new com.tencent.mm.ui.chatting.d6(context);
        this.E1 = d6Var;
        this.D1 = d6Var;
        com.tencent.mm.pluginsdk.ui.chat.x9 x9Var = new com.tencent.mm.pluginsdk.ui.chat.x9(context.g());
        this.G1 = x9Var;
        this.F1 = x9Var;
        com.tencent.mm.ui.df dfVar = new com.tencent.mm.ui.df(context);
        this.I1 = dfVar;
        this.H1 = dfVar;
        com.tencent.mm.ui.chatting.u0 u0Var = new com.tencent.mm.ui.chatting.u0(context);
        this.K1 = u0Var;
        this.J1 = u0Var;
        this.L1 = new com.tencent.mm.ui.chatting.ib(context);
        S0();
        setHasStableIds(true);
        registerAdapterDataObserver(new com.tencent.mm.ui.chatting.adapter.a());
        this.F = new com.tencent.mm.ui.chatting.adapter.b(this);
        this.N1 = new com.tencent.mm.ui.chatting.adapter.h(this);
        this.O1 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.chatting.adapter.j(this), true);
        this.P1 = new com.tencent.mm.ui.chatting.adapter.i(this);
        if (com.tencent.mm.storage.z3.F4(context.x())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "init brandEscTmplMsgChangeListener");
            iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$brandEscTmplMsgChangeListener$1
                {
                    this.__eventId = -1204934276;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent brandEcsTmplMsgChangeEvent) {
                    com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent event = brandEcsTmplMsgChangeEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    com.tencent.mm.ui.chatting.adapter.k.this.Q0();
                    return false;
                }
            };
        } else {
            iListener = null;
        }
        this.Q1 = iListener;
    }

    public boolean F0(com.tencent.mm.storage.f9 f9Var) {
        return f9Var != null && com.tencent.mm.ui.chatting.adapter.m.a(f9Var);
    }

    public void G0(int i17, int i18) {
        com.tencent.mm.storage.z3 u17;
        ot0.q v17;
        java.lang.String d17;
        boolean z17;
        int i19 = i17;
        yb5.d dVar = this.K;
        if (dVar == null || (u17 = dVar.u()) == null) {
            return;
        }
        int i27 = (i18 - i19) + 2;
        java.util.ArrayList arrayList = new java.util.ArrayList(i27);
        ((zq1.a0) gm0.j1.s(zq1.a0.class)).getClass();
        boolean z18 = false;
        if (!u17.k2()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(i27);
            if (i19 <= i18) {
                while (true) {
                    com.tencent.mm.storage.f9 item = getItem(i19);
                    if (item != null && (item.getType() & 49) != 0 && (v17 = ot0.q.v(item.U1())) != null && !android.text.TextUtils.isEmpty(v17.f348674k)) {
                        java.lang.String url = v17.f348674k;
                        kotlin.jvm.internal.o.f(url, "url");
                        java.lang.String a17 = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);
                        kotlin.jvm.internal.o.f(a17, "domainString(...)");
                        if (r26.n0.B(url, a17, z18)) {
                            com.tencent.mm.ui.chatting.viewitems.wr wrVar = (com.tencent.mm.ui.chatting.viewitems.wr) com.tencent.mm.ui.chatting.viewitems.xr.a(this.K);
                            java.lang.String A = wrVar.b(wrVar.c(item)).A(this.K, item);
                            if (A != null && (d17 = u17.d1()) != null) {
                                int a18 = c01.h2.a(A, this.K.x());
                                ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
                                int i28 = fVar != null ? fVar.f348455b : -1;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.lang.String url2 = v17.f348674k;
                                kotlin.jvm.internal.o.f(url2, "url");
                                arrayList3.add(url2);
                                arrayList3.add(java.lang.String.valueOf(i28));
                                java.lang.String str = v17.f348722w;
                                if (str == null) {
                                    str = "";
                                }
                                arrayList3.add(str);
                                arrayList3.add(java.lang.String.valueOf(item.I0()));
                                arrayList3.add(d17);
                                arrayList3.add(java.lang.String.valueOf(a18));
                                arrayList3.add(A);
                                arrayList3.add(java.lang.String.valueOf(item.getCreateTime()));
                                arrayList3.add(java.lang.String.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).h(d17)));
                                arrayList2.add(arrayList3);
                            }
                        }
                    }
                    if (i19 == i18) {
                        break;
                    }
                    i19++;
                    z18 = false;
                }
            }
            if (arrayList2.size() > 0) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).v(arrayList2, 1);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (i19 <= i18) {
            while (true) {
                com.tencent.mm.storage.f9 item2 = getItem(i19);
                if (item2 != null && item2.getType() == 285212721) {
                    java.lang.String d18 = u17.d1();
                    if (d18 == null) {
                        d18 = "";
                    }
                    java.lang.String valueOf = java.lang.String.valueOf(item2.getMsgId());
                    java.lang.String j17 = item2.j();
                    kotlin.jvm.internal.o.f(j17, "getContent(...)");
                    arrayList4.add(new java.lang.String[]{valueOf, j17, "-1", d18});
                    ot0.l0 l0Var = new ot0.l0();
                    l0Var.f348574h = item2.getMsgId();
                    l0Var.f348573g = item2.j();
                    arrayList.add(l0Var);
                }
                if (i19 == i18) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        if (arrayList4.size() > 0) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList4) {
                java.lang.String h17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.h(((java.lang.String[]) obj)[0]);
                com.tencent.mm.sdk.platformtools.a3 a3Var = yq1.z.f464496g;
                if (a3Var.n(h17)) {
                    z17 = false;
                } else {
                    a3Var.m(h17);
                    z17 = true;
                }
                if (z17) {
                    arrayList5.add(obj);
                }
            }
            if (!arrayList5.isEmpty()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData: preloadByInfoIdAndBuffer:");
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
                java.util.Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    arrayList6.add(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.h(((java.lang.String[]) it.next())[0]));
                }
                sb6.append(arrayList6);
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", sb6.toString());
                ((ku5.t0) ku5.t0.f312615d).h(new yq1.w(arrayList5, 0), "tmplPreload");
            }
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new yq1.s(arrayList, 0), "getAppMsgRelatedInfo");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        if (r3.f394254d.f445300b.getMsgId() == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int H0(long r9) {
        /*
            r8 = this;
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = r8.I
            java.util.ArrayList r0 = r0.f152065o
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        La:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r0.next()
            rd5.d r3 = (rd5.d) r3
            boolean r4 = r3 instanceof qd5.i
            r5 = 1
            if (r4 == 0) goto L4e
            qd5.i r3 = (qd5.i) r3
            we5.s0 r3 = r3.f361911o
            if (r3 == 0) goto L5b
            java.util.List r3 = r3.f445387a
            if (r3 == 0) goto L5b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2c
            goto L5b
        L2c:
            java.util.Iterator r3 = r3.iterator()
        L30:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r3.next()
            rd5.d r4 = (rd5.d) r4
            we5.a r4 = r4.f394254d
            com.tencent.mm.storage.f9 r4 = r4.f445300b
            long r6 = r4.getMsgId()
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 != 0) goto L4a
            r4 = r5
            goto L4b
        L4a:
            r4 = r1
        L4b:
            if (r4 == 0) goto L30
            goto L5c
        L4e:
            we5.a r3 = r3.f394254d
            com.tencent.mm.storage.f9 r3 = r3.f445300b
            long r3 = r3.getMsgId()
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L5b
            goto L5c
        L5b:
            r5 = r1
        L5c:
            if (r5 == 0) goto L5f
            goto L63
        L5f:
            int r2 = r2 + 1
            goto La
        L62:
            r2 = -1
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.adapter.k.H0(long):int");
    }

    public void I0(int i17) {
        com.tencent.mm.storage.f9 item = getItem(i17);
        if (item == null || item.getMsgId() == 0) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.f6) ((sb5.g1) this.K.f460708c.a(sb5.g1.class))).f199014f.add(new com.tencent.mm.plugin.msg.MsgIdTalker(item.getMsgId(), item.Q0()));
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ChattingDataAdapterV3", "fixShowTime: " + i17 + " : " + item.getMsgId(), new java.lang.Object[0]);
        com.tencent.mm.autogen.events.ChatMsgNotifyEvent chatMsgNotifyEvent = new com.tencent.mm.autogen.events.ChatMsgNotifyEvent();
        long msgId = item.getMsgId();
        am.a2 a2Var = chatMsgNotifyEvent.f54036g;
        a2Var.f6117a = msgId;
        a2Var.f6118b = item.Q0();
        chatMsgNotifyEvent.e();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.storage.f9 getItem(int i17) {
        rd5.d dVar = (rd5.d) kz5.n0.a0(this.I.f152065o, i17);
        if (dVar != null) {
            return dVar.f394254d.f445300b;
        }
        return null;
    }

    public com.tencent.mm.storage.f9 K0(long j17) {
        int i17 = 0;
        for (java.lang.Object obj : this.M) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
            if (f9Var.getMsgId() == j17) {
                return f9Var;
            }
            i17 = i18;
        }
        return null;
    }

    public int L0() {
        return this.W.size();
    }

    public int M0() {
        if (-1 == this.Y) {
            this.Y = ((com.tencent.mm.storage.g9) c01.d9.b().u()).j7(this.K.x());
        }
        return this.Y;
    }

    public com.tencent.mm.ui.chatting.e6 N0() {
        return this.B1;
    }

    public android.view.View O0(long j17) {
        java.lang.ref.WeakReference weakReference;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = this.Q;
        if (map.containsKey(valueOf) && (weakReference = (java.lang.ref.WeakReference) map.get(java.lang.Long.valueOf(j17))) != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    public android.view.View P0(int i17) {
        com.tencent.mm.storage.f9 item = getItem(i17);
        if (item == null) {
            return null;
        }
        long msgId = item.getMsgId();
        java.util.Map map = this.Q;
        if (!((java.util.HashMap) map).containsKey(java.lang.Long.valueOf(msgId))) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) map).get(java.lang.Long.valueOf(msgId));
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    public void Q0() {
        if (this.f198422l1) {
            this.f198424p1++;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "[handleMsgChange] isLockNotify:" + this.f198424p1);
            return;
        }
        if (!this.f198426x1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "[handleMsgChange] is not resumeState ");
            return;
        }
        ke5.f0 f0Var = this.Z;
        if (f0Var != null) {
            f0Var.b(hd5.n.ACTION_UPDATE, false);
        }
    }

    public int R0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return -1;
        }
        int i17 = 0;
        for (java.lang.Object obj : this.I.f152065o) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((rd5.d) obj).f394254d.f445300b.getMsgId() == f9Var.getMsgId()) {
                return i17;
            }
            i17 = i18;
        }
        return -1;
    }

    public final void S0() {
        if (this.f198423p0 == null) {
            o11.f fVar = new o11.f();
            yb5.d dVar = this.K;
            fVar.f342083g = s01.r.k(dVar.x());
            fVar.f342078b = true;
            fVar.f342095s = true;
            fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
            if (dVar.g() != null) {
                fVar.f342097u = ym5.x.a(r1, 52.0f) * 0.1f;
                fVar.f342096t = true;
            }
            try {
                this.f198423p0 = fVar.a();
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingDataAdapterV3", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public void T0(java.lang.String str, long j17, hd5.n nVar, sb5.y yVar) {
        r15.f fVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Boolean.valueOf(yVar != null ? yVar.f405596a : false);
        objArr[2] = nVar;
        objArr[3] = java.lang.Integer.valueOf(yVar != null ? yVar.f405600e : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "[locationByMsgId] messageId:%s loadAllBottomMsg:%s mode:%s topOffset:%s", objArr);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("MSG_ID", j17);
        bundle.putString("MSG_TALKER", str);
        bundle.putInt("SCENE", 1);
        bundle.putBoolean("IS_LOAD_ALL", yVar != null ? yVar.f405596a : false);
        bundle.putBoolean("IS_HIGHLIGHT_ITEM", yVar != null ? yVar.f405597b : false);
        bundle.putBoolean("IS_IDLE_VISBLE", yVar != null ? yVar.f405598c : false);
        bundle.putBoolean("IS_ALWAYS_HIGHLIGHT_MODE", yVar != null ? yVar.f405599d : false);
        bundle.putInt("SELECTION_TOP_OFFSET", yVar != null ? yVar.f405600e : 0);
        bundle.putBoolean("IS_SMOOTH_SCROLL", yVar != null ? yVar.f405601f : false);
        bundle.putBoolean("SELECT_BY_MSG_ID", yVar != null ? yVar.f405602g : false);
        if (yVar != null && (fVar = yVar.f405603h) != null) {
            android.os.Bundle bundle2 = yVar.f405604i;
            if (bundle2 != null) {
                bundle2.putInt("locate_start", fVar.f368644a);
            }
            if (bundle2 != null) {
                bundle2.putInt("locate_end", fVar.f368645b);
            }
        }
        bundle.putBundle("EXTRA_BUNDLE", yVar != null ? yVar.f405604i : null);
        ke5.f0 f0Var = this.Z;
        if (f0Var != null) {
            f0Var.a(nVar, true, bundle);
        }
    }

    public void U0(int i17, boolean z17, boolean z18) {
        fl5.i toSendEt;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) this.K.f460708c.a(sb5.i0.class))).v0();
        qa5.g sizeAnimController = (v07 == null || (toSendEt = v07.getToSendEt()) == null) ? null : toSendEt.getSizeAnimController();
        if (sizeAnimController == null) {
            return;
        }
        sizeAnimController.hashCode();
    }

    public void V0(int i17) {
        rd5.d dVar = (rd5.d) kz5.n0.a0(this.I.f152065o, i17);
        com.tencent.mm.storage.f9 f9Var = dVar != null ? dVar.f394254d.f445300b : null;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Long.valueOf(f9Var != null ? f9Var.getMsgId() : -1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "[setShowHistoryMsgTipId] pos:%s msgId:%s", objArr);
        if (f9Var != null && f9Var.getMsgId() != 0) {
            if (this.P == f9Var.getMsgId()) {
                return;
            } else {
                this.P = f9Var.getMsgId();
            }
        }
        h(null);
    }

    public boolean W0(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        java.lang.String string;
        android.view.View childAt;
        android.view.View view;
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.W;
        boolean contains = copyOnWriteArraySet.contains(msgIdTalker);
        yb5.d dVar = this.K;
        if (contains) {
            copyOnWriteArraySet.remove(msgIdTalker);
        } else {
            if (copyOnWriteArraySet.size() >= 100) {
                if (this.U) {
                    string = dVar.s().getString(com.tencent.mm.R.string.c1y, 100);
                    kotlin.jvm.internal.o.d(string);
                } else {
                    string = dVar.s().getString(com.tencent.mm.R.string.c1x, 100);
                    kotlin.jvm.internal.o.d(string);
                }
                db5.e1.s(dVar.g(), string, "");
                return false;
            }
            copyOnWriteArraySet.add(msgIdTalker);
        }
        long j17 = msgIdTalker.f149480d;
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = this.L;
        if (v3Var != null) {
            int childCount = v3Var.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                childAt = v3Var.getChildAt(i17);
                java.lang.Object tag = childAt != null ? childAt.getTag() : null;
                com.tencent.mm.ui.chatting.viewitems.g0 g0Var = tag instanceof com.tencent.mm.ui.chatting.viewitems.g0 ? (com.tencent.mm.ui.chatting.viewitems.g0) tag : null;
                if (g0Var != null && (view = g0Var.maskView) != null) {
                    java.lang.Object tag2 = view.getTag();
                    kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.msg.MsgIdTalker");
                    if (((com.tencent.mm.plugin.msg.MsgIdTalker) tag2).f149480d == j17) {
                        break;
                    }
                }
            }
        }
        childAt = null;
        if (childAt != null) {
            java.lang.Object tag3 = childAt.getTag();
            kotlin.jvm.internal.o.e(tag3, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
            com.tencent.mm.ui.chatting.viewitems.g0 g0Var2 = (com.tencent.mm.ui.chatting.viewitems.g0) tag3;
            android.widget.CheckBox checkBox = g0Var2.checkBox;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                g0Var2.checkBox.setChecked(copyOnWriteArraySet.contains(msgIdTalker));
            }
        } else {
            h(null);
        }
        dVar.f460710e.U(j17, msgIdTalker.a());
        return true;
    }

    public void X0(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        if (this.W.contains(msgIdTalker)) {
            return;
        }
        W0(msgIdTalker);
    }

    @Override // androidx.recyclerview.widget.f2, com.tencent.mm.pluginsdk.ui.tools.u3
    public int getCount() {
        return this.I.f152065o.size();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public void h(java.lang.Object obj) {
        getCount();
        java.lang.Runnable runnable = this.f198429z1;
        if (runnable != null) {
            runnable.run();
        }
        this.A1.clear();
        if (obj == null) {
            notifyDataSetChanged();
            return;
        }
        boolean z17 = obj instanceof rd5.d;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.I;
        if (z17) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, (xm3.d) obj, false, 2, null);
        } else {
            mvvmList.v(rd5.b.f394253a.a(this.K, this.M), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (((com.tencent.mm.storage.z3.F4(r0.x()) || r0.E()) ? false : true) == false) goto L15;
     */
    @Override // xm3.t0, xm3.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(xm3.o0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "pendingData"
            kotlin.jvm.internal.o.g(r6, r0)
            super.k(r6)
            java.lang.String r0 = "MicroMsg.ChattingDataAdapterV3"
            java.lang.String r1 = "[onDataSetChangeFinish]"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r5.getCount()
            yb5.d r0 = r5.K
            r0.getClass()
            java.lang.String r1 = "setOnDataSetChangedCalled:true"
            java.lang.String r2 = "MicroMsg.ChattingContext"
            com.tencent.mars.xlog.Log.i(r2, r1)
            r1 = 1
            r0.f460724s = r1
            java.util.List r2 = r5.M
            r3 = 0
            java.lang.Object r2 = kz5.n0.a0(r2, r3)
            com.tencent.mm.storage.f9 r2 = (com.tencent.mm.storage.f9) r2
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.Q0()
            goto L32
        L31:
            r2 = 0
        L32:
            java.lang.String r4 = r0.x()
            boolean r2 = kotlin.jvm.internal.o.b(r2, r4)
            if (r2 != 0) goto L53
            jz5.g r2 = hd5.j.f280609h
            java.lang.String r2 = r0.x()
            boolean r2 = com.tencent.mm.storage.z3.F4(r2)
            if (r2 == 0) goto L4a
        L48:
            r1 = r3
            goto L51
        L4a:
            boolean r2 = r0.E()
            if (r2 == 0) goto L51
            goto L48
        L51:
            if (r1 != 0) goto L61
        L53:
            com.tencent.mm.pluginsdk.ui.tools.v3 r1 = r0.p()
            r1.setVisibility(r3)
            com.tencent.mm.ui.chatting.gb r1 = r0.f460719n
            com.tencent.mm.ui.chatting.ChattingUIFragment r1 = (com.tencent.mm.ui.chatting.ChattingUIFragment) r1
            r1.l1(r3)
        L61:
            com.tencent.mm.ui.chatting.component.g7 r0 = r0.f460710e
            r0.S(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.adapter.k.k(xm3.o0):void");
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        long nanoTime = java.lang.System.nanoTime();
        super.I(holder, i17);
        long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
        yb5.d dVar = this.K;
        tb5.v vVar = ((tb5.y) ((tb5.m0) dVar.f460708c.a(tb5.m0.class))).f417105f;
        int itemViewType = holder.getItemViewType();
        vVar.getClass();
        java.util.HashMap hashMap = vVar.f417094k;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(itemViewType);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new tb5.e(itemViewType, nanoTime2, "", vVar.f417084a, 0, 16, null));
        holder.itemView.setTag(com.tencent.mm.R.id.ego, java.lang.Integer.valueOf(holder.getItemViewType()));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[" + holder.getItemViewType() + "][" + i17 + "] cost[" + nanoTime2 + ']');
        sb5.k kVar = (sb5.k) dVar.f460708c.a(sb5.k.class);
        com.tencent.mm.storage.f9 msgInfo = ((rd5.d) this.I.f152065o.get(i17)).f394254d.f445300b;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.ui.chatting.component.s0 s0Var = (com.tencent.mm.ui.chatting.component.s0) kVar;
        s0Var.getClass();
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.bkj);
        if (findViewById != null) {
            itemView = findViewById;
        }
        com.tencent.mm.sdk.event.pending.UIPendingEventNotifier uIPendingEventNotifier = s0Var.f199893f;
        if (uIPendingEventNotifier != null) {
            uIPendingEventNotifier.a(new com.tencent.mm.ui.chatting.component.q0(msgInfo, itemView), true);
        }
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: r0 */
    public in5.s0 M(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        in5.s0 M = super.M(parent, i17);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        tb5.v vVar = ((tb5.y) ((tb5.m0) this.K.f460708c.a(tb5.m0.class))).f417105f;
        vVar.getClass();
        java.util.HashMap hashMap = vVar.f417093j;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new tb5.e(i17, currentTimeMillis2, "", vVar.f417084a, 0, 16, null));
        return M;
    }

    @Override // xm3.t0, com.tencent.mm.view.recyclerview.WxRecyclerAdapter
    public boolean x0() {
        return false;
    }
}
