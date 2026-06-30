package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class a2 extends com.tencent.mm.plugin.finder.convert.d implements com.tencent.mm.plugin.finder.feed.k8 {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.k8 f128839i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f128840m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.k8 f128841n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f128842o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f128843p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f128844q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f128845r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f128846s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed currentItem, com.tencent.mm.plugin.finder.feed.k8 contract, boolean z17) {
        super(holder, currentItem);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(currentItem, "currentItem");
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f128839i = contract;
        this.f128840m = z17;
        if (!com.tencent.mm.plugin.finder.feed.k8.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(com.tencent.mm.plugin.finder.feed.k8.class.getClassLoader(), new java.lang.Class[]{com.tencent.mm.plugin.finder.feed.k8.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderFeedContract");
        }
        this.f128841n = (com.tencent.mm.plugin.finder.feed.k8) newProxyInstance;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return this.f128841n.A0(feed, sheet, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean A3() {
        return this.f128841n.A3();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder, yz5.a aVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return this.f128841n.D1(feed, i17, holder, aVar);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: H1 */
    public cw2.f8 getS() {
        return this.f128841n.getS();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return this.f128841n.K0(bottomSheet, feed, i17, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer W3() {
        return this.f128841n.W3();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f128841n.W4(feed, z17, z18, i17, z19, bc1Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return this.f128841n.Y(feed, sheet);
    }

    @Override // com.tencent.mm.plugin.finder.convert.d, com.tencent.mm.plugin.finder.convert.s0
    public void b() {
        in5.s0 holder = this.f103103d;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_x);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        this.f128842o = p17;
        android.view.View p18 = holder.p(com.tencent.mm.R.id.i1g);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        this.f128844q = (android.widget.TextView) p18;
        android.view.View p19 = holder.p(com.tencent.mm.R.id.h6i);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        this.f128843p = (com.tencent.mm.ui.widget.imageview.WeImageView) p19;
        android.view.View p27 = holder.p(com.tencent.mm.R.id.a_x);
        kotlin.jvm.internal.o.f(p27, "getView(...)");
        this.f128845r = (android.view.ViewGroup) p27;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = this.f128842o;
        if (view == null) {
            kotlin.jvm.internal.o.o("awesomeContainer");
            throw null;
        }
        ((cy1.a) rVar).pk(view, "finder_feed_like");
        android.view.View view2 = this.f128842o;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("awesomeContainer");
            throw null;
        }
        view2.setHapticFeedbackEnabled(false);
        if (this.f103104e.getFeedObject().isLive() || ((java.lang.Boolean) ((jz5.n) this.f103106g).getValue()).booleanValue()) {
            android.view.View view3 = this.f128842o;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("awesomeContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        c();
        android.view.View view4 = this.f128842o;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("awesomeContainer");
            throw null;
        }
        view4.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.finder.ui.x1
            /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
            
                if (r0 != 6) goto L12;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
                /*
                    r10 = this;
                    java.lang.String r0 = "com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper$bindInteractionListeners$1"
                    java.lang.String r1 = "android/view/View$OnTouchListener"
                    java.lang.String r2 = "onTouch"
                    java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    r4.add(r11)
                    r4.add(r12)
                    java.lang.Object[] r5 = r4.toArray()
                    r4.clear()
                    r4 = r10
                    yj0.a.b(r0, r1, r2, r3, r4, r5)
                    java.lang.String r0 = "p0"
                    kotlin.jvm.internal.o.g(r11, r0)
                    java.lang.String r11 = "p1"
                    kotlin.jvm.internal.o.g(r12, r11)
                    com.tencent.mm.plugin.finder.ui.a2 r11 = com.tencent.mm.plugin.finder.ui.a2.this
                    r11.getClass()
                    int r0 = r12.getActionMasked()
                    fo3.s r1 = fo3.s.INSTANCE
                    r2 = 1
                    java.lang.String r3 = "ce_feed_like"
                    if (r0 == 0) goto L48
                    if (r0 == r2) goto L41
                    r4 = 5
                    if (r0 == r4) goto L48
                    r11 = 6
                    if (r0 == r11) goto L41
                    goto L4f
                L41:
                    r1.H2(r3, r12)
                    r1.Qa(r3)
                    goto L4f
                L48:
                    r11.f128846s = r2
                    java.lang.String r11 = "<FeedLike>"
                    r1.Z7(r3, r11)
                L4f:
                    java.lang.String r6 = "com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper$bindInteractionListeners$1"
                    java.lang.String r7 = "android/view/View$OnTouchListener"
                    java.lang.String r8 = "onTouch"
                    java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                    r4 = 0
                    r5 = r10
                    yj0.a.i(r4, r5, r6, r7, r8, r9)
                    r11 = 0
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.x1.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        android.view.View view5 = this.f128842o;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("awesomeContainer");
            throw null;
        }
        view5.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.ui.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View p07) {
                java.lang.String str;
                com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer;
                ec2.d e27;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(p07);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper$bindInteractionListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                kotlin.jvm.internal.o.g(p07, "p0");
                com.tencent.mm.plugin.finder.ui.a2 a2Var = com.tencent.mm.plugin.finder.ui.a2.this;
                if (a2Var.f128846s) {
                    a2Var.f128846s = false;
                } else {
                    fo3.s sVar = fo3.s.INSTANCE;
                    sVar.Z7("ce_feed_like", "<FeedLike>");
                    sVar.H2("ce_feed_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                    sVar.Qa("ce_feed_like");
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = a2Var.f103104e;
                if (baseFinderFeed != null) {
                    if (hc2.o0.c(baseFinderFeed.getFeedObject().getFeedObject())) {
                        boolean d07 = a2Var.f128839i.d0();
                        in5.s0 s0Var = a2Var.f103103d;
                        if (d07) {
                            android.content.Context context = s0Var.itemView.getContext();
                            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                            if (activity != null && (finderLikeDrawer = (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) activity.findViewById(com.tencent.mm.R.id.edo)) != null) {
                                com.tencent.mm.plugin.finder.view.FinderLikeDrawer.w(finderLikeDrawer, a2Var.f103103d, baseFinderFeed.getFeedObject(), null, 0, null, null, 56, null);
                            }
                            str = "open like in self scene";
                        } else {
                            android.os.SystemClock.elapsedRealtime();
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
                            jz5.l k17 = nv2.n1.f340551h.k(baseFinderFeed2.getFeedObject().getFeedObject());
                            boolean booleanValue = ((java.lang.Boolean) k17.f302833d).booleanValue();
                            boolean booleanValue2 = ((java.lang.Boolean) k17.f302834e).booleanValue();
                            boolean z17 = !booleanValue;
                            if (z17) {
                                hc2.f1.x(s0Var.itemView);
                                android.view.View p28 = s0Var.p(com.tencent.mm.R.id.f484958g22);
                                if (p28 != null) {
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                    arrayList3.add(8);
                                    java.util.Collections.reverse(arrayList3);
                                    yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper", "likeFeed", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                    yj0.a.f(p28, "com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper", "likeFeed", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                baseFinderFeed2.e1(true);
                                baseFinderFeed2.C1(false);
                            }
                            boolean z18 = z17 ? false : booleanValue2;
                            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(s0Var, baseFinderFeed2.getItemId(), baseFinderFeed2.getFeedObject());
                            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                            android.content.Context context2 = s0Var.f293121e;
                            kotlin.jvm.internal.o.f(context2, "getContext(...)");
                            long itemId = baseFinderFeed2.getItemId();
                            java.lang.String w17 = baseFinderFeed2.w();
                            uw2.h0 h0Var = uw2.h0.f431674a;
                            h0Var.h();
                            o3Var.Ri(context2, itemId, w17, "animation_effects_type", java.lang.Integer.valueOf(h0Var.h() != 0 ? 1 : 0));
                            a2Var.f128839i.W4(baseFinderFeed2, z17, false, 1, z18, null);
                            boolean z19 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity;
                            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = z19 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                            if (nyVar != null) {
                                nyVar.V6();
                            }
                            a2Var.c();
                            if (baseFinderFeed2.getFeedObject().isMsgLikeEvent()) {
                                if (z17) {
                                    com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed2.getFeedObject().getFeedObject();
                                    feedObject.setIncFriendLikeCount(feedObject.getIncFriendLikeCount() + 1);
                                } else if (!booleanValue2) {
                                    com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = baseFinderFeed2.getFeedObject().getFeedObject();
                                    feedObject2.setIncFriendLikeCount(feedObject2.getIncFriendLikeCount() - 1);
                                }
                            }
                            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                            long itemId2 = baseFinderFeed2.getItemId();
                            am.ia iaVar = feedUpdateEvent.f54252g;
                            iaVar.f6918a = itemId2;
                            iaVar.f6919b = 4;
                            iaVar.f6922e = z17 ? 1 : 0;
                            feedUpdateEvent.e();
                            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = z19 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                            if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
                                if (z17) {
                                    e27.a(new ec2.a(7, baseFinderFeed2.getItemId(), baseFinderFeed2.w()));
                                } else {
                                    e27.a(new ec2.a(8, baseFinderFeed2.getItemId(), baseFinderFeed2.w()));
                                }
                            }
                            if (z17 && s0Var.getAdapterPosition() == 0) {
                                pf5.z zVar = pf5.z.f353948a;
                                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                zu2.q qVar = ((zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(zu2.a0.class)).f475694f;
                                if (qVar != null) {
                                    qVar.a();
                                    qVar.d("like");
                                }
                            }
                            s0Var.p(com.tencent.mm.R.id.a_x).setTag(com.tencent.mm.R.id.e5w, java.lang.Boolean.valueOf(z17));
                            str = "can like other";
                        }
                    } else {
                        str = "forbid like";
                    }
                    com.tencent.mars.xlog.Log.i("FinderColumnCardAwesomeLayoutHelper", "[onClickLike] feedId:" + pm0.v.u(baseFinderFeed.getItemId()) + " res=" + str);
                    d92.s sVar2 = d92.k0.f227486e;
                    p07.announceForAccessibility(sVar2.a(p07, true));
                    p07.setContentDescription(sVar2.a(p07, false));
                }
                yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper$bindInteractionListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.view.View view6 = this.f128842o;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("awesomeContainer");
            throw null;
        }
        view6.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.plugin.finder.ui.z1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View p07) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(p07);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper$bindInteractionListeners$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                kotlin.jvm.internal.o.g(p07, "p0");
                com.tencent.mm.plugin.finder.ui.a2 a2Var = com.tencent.mm.plugin.finder.ui.a2.this;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = a2Var.f103104e;
                if (baseFinderFeed != null && !hc2.o0.h(baseFinderFeed.getFeedObject().getFeedObject()) && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.O8).getValue()).r()).intValue() != 0 && hc2.o0.c(baseFinderFeed.getFeedObject().getFeedObject()) && !a2Var.f128839i.d0() && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.M1).getValue()).r()).intValue() == 1) {
                    hc2.s.f(baseFinderFeed.getContact());
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/finder/ui/FinderColumnCardAwesomeLayoutHelper$bindInteractionListeners$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        });
        this.f103107h.alive();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public java.lang.String b2(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        return this.f128841n.b2(baseFinderFeed);
    }

    public final void c() {
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103104e;
        jz5.l k17 = n1Var.k(baseFinderFeed.getFeedObject().getFeedObject());
        boolean booleanValue = ((java.lang.Boolean) k17.f302833d).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) k17.f302834e).booleanValue();
        if (baseFinderFeed != null) {
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            zy2.r6 r6Var = new zy2.r6();
            r6Var.f477551b = booleanValue;
            r6Var.f477550a = baseFinderFeed.getIsPreview();
            r6Var.f477552c = baseFinderFeed.getFeedObject().getFeedObject().getObjectType();
            r6Var.f477553d = this.f128839i.d0();
            r6Var.f477554e = this.f128840m;
            r6Var.f477555f = hc2.s.f(baseFinderFeed.getContact());
            r6Var.f477556g = booleanValue2;
            r6Var.f477557h = cu2.f0.f222391a.e(baseFinderFeed.getFeedObject().getFeedObject().getObjectType());
            r6Var.f477558i = baseFinderFeed.getFeedObject().getFeedObject();
            r6Var.f477560k = hc2.o0.c(baseFinderFeed.getFeedObject().getFeedObject());
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f128843p;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("likeIcon");
                throw null;
            }
            ht2.y0 y0Var = (ht2.y0) s6Var;
            y0Var.Di(weImageView, r6Var);
            android.widget.TextView textView = this.f128844q;
            if (textView == null) {
                kotlin.jvm.internal.o.o("likeTv");
                throw null;
            }
            android.view.ViewGroup viewGroup = this.f128845r;
            if (viewGroup != null) {
                y0Var.Ui(textView, viewGroup, r6Var);
            } else {
                kotlin.jvm.internal.o.o("likeContainer");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return this.f128841n.c4(feed, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return this.f128841n.d0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean e0() {
        return this.f128841n.e0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: e2 */
    public androidx.recyclerview.widget.y2 getG() {
        return this.f128841n.getG();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: getActivity */
    public com.tencent.mm.ui.MMActivity getF122643d() {
        return this.f128841n.getF122643d();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.f5 j2() {
        return this.f128841n.j2();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f128841n.n0(feed, z17, i17, qt2Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void o0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f128841n.o0(holder, feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return this.f128841n.p1(feed, sheet);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f128841n.s0(feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer s6() {
        return this.f128841n.s6();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void u2(com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f128841n.u2(feed, z17, s0Var, i17, bc1Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 w4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return this.f128841n.w4(feed, sheet, i17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean z5() {
        return this.f128841n.z5();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return this.f128841n.z6(feed, sheet);
    }
}
