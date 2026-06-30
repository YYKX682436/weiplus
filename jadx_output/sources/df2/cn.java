package df2;

/* loaded from: classes3.dex */
public final class cn extends df2.de implements df2.l9 {
    public long A;
    public boolean B;
    public int C;
    public boolean D;
    public r45.k62 E;
    public sh2.d F;
    public boolean G;
    public r45.qq1 H;
    public r45.wm2 I;

    /* renamed from: J, reason: collision with root package name */
    public java.util.LinkedList f229891J;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f229892p;

    /* renamed from: q, reason: collision with root package name */
    public final int f229893q;

    /* renamed from: r, reason: collision with root package name */
    public final long f229894r;

    /* renamed from: s, reason: collision with root package name */
    public final long f229895s;

    /* renamed from: t, reason: collision with root package name */
    public long f229896t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f229897u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f229898v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.lifecycle.j0 f229899w;

    /* renamed from: x, reason: collision with root package name */
    public kotlinx.coroutines.r2 f229900x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.r2 f229901y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.zm f229902z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229892p = "LiveLikeRecommendController";
        this.f229893q = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
        this.f229894r = 5000L;
        this.f229895s = 1000L;
        this.f229897u = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f229898v = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f229899w = new androidx.lifecycle.j0();
        this.A = 5000L;
        this.f229891J = new java.util.LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7(df2.cn r8) {
        /*
            r8.q7()
            com.tencent.mm.plugin.finder.live.view.ub r0 = r8.f291099e
            boolean r1 = r0 instanceof android.widget.RelativeLayout
            r2 = 0
            if (r1 == 0) goto Ld
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto La5
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r8 = r8.business(r1)
            mm2.c1 r8 = (mm2.c1) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f328846n
            java.lang.Class<zy2.s6> r1 = zy2.s6.class
            i95.m r1 = i95.n0.c(r1)
            if (r8 == 0) goto La5
            if (r1 == 0) goto La5
            zy2.s6 r1 = (zy2.s6) r1
            zy2.r6 r3 = new zy2.r6
            r3.<init>()
            r4 = 0
            r3.f477550a = r4
            r5 = 1
            r3.f477551b = r5
            int r6 = r8.getObjectType()
            r3.f477552c = r6
            r3.f477553d = r4
            boolean r6 = com.tencent.mm.ui.bk.C()
            r6 = r6 ^ r5
            r3.f477554e = r6
            r3.f477555f = r4
            r3.f477556g = r4
            r3.f477558i = r8
            df2.zm r6 = df2.zm.f231978d
            ht2.y0 r1 = (ht2.y0) r1
            java.lang.String r7 = "playLikeFloatPagView"
            android.view.View r7 = r0.findViewWithTag(r7)
            if (r7 != 0) goto L90
            r1.vj(r8)
            r45.dm2 r8 = r8.getObject_extend()
            if (r8 == 0) goto L98
            r7 = 27
            com.tencent.mm.protobuf.f r8 = r8.getCustom(r7)
            r45.vl2 r8 = (r45.vl2) r8
            if (r8 == 0) goto L98
            r7 = 2
            com.tencent.mm.protobuf.f r8 = r8.getCustom(r7)
            r45.ul2 r8 = (r45.ul2) r8
            if (r8 == 0) goto L98
            java.lang.String r8 = r8.getString(r4)
            if (r8 == 0) goto L98
            int r7 = r8.length()
            if (r7 <= 0) goto L7c
            r7 = r5
            goto L7d
        L7c:
            r7 = r4
        L7d:
            if (r7 == 0) goto L80
            goto L81
        L80:
            r8 = r2
        L81:
            if (r8 == 0) goto L98
            cu2.f0 r7 = cu2.f0.f222391a
            r45.tl2 r8 = r7.c(r8)
            if (r8 != 0) goto L8c
            goto L98
        L8c:
            r1.oj(r0, r8, r2, r3)
            goto L97
        L90:
            java.lang.String r8 = "Finder.DynamicIconResService"
            java.lang.String r4 = "Animation is not finish!"
            com.tencent.mars.xlog.Log.w(r8, r4)
        L97:
            r4 = r5
        L98:
            if (r4 != 0) goto La2
            ht2.p r8 = new ht2.p
            r8.<init>(r3, r1, r6)
            r1.Zi(r0, r3, r8)
        La2:
            r6.invoke(r2)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cn.m7(df2.cn):void");
    }

    @Override // df2.l9
    public void b5() {
        n7("autoDismiss", false);
    }

    @Override // df2.l9
    public java.lang.String getTag() {
        return this.f229892p;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[dismissBubble] scene = "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = ", onViewUnMount = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r4.f229892p
            com.tencent.mars.xlog.Log.i(r1, r0)
            androidx.lifecycle.j0 r0 = r4.f229899w
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L3a
            android.view.View r6 = r4.f7(r4)
            r3 = 0
            if (r6 == 0) goto L2f
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L2f
            r3 = r1
        L2f:
            if (r3 != 0) goto L32
            goto L3a
        L32:
            java.lang.Object r6 = r0.getValue()
            r0.setValue(r6)
            goto L3d
        L3a:
            r0.setValue(r2)
        L3d:
            r4.a7(r5, r4)
            kotlinx.coroutines.r2 r5 = r4.f229900x
            if (r5 == 0) goto L47
            kotlinx.coroutines.p2.a(r5, r2, r1, r2)
        L47:
            kotlinx.coroutines.r2 r5 = r4.f229901y
            if (r5 == 0) goto L4e
            kotlinx.coroutines.p2.a(r5, r2, r1, r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cn.n7(java.lang.String, boolean):void");
    }

    public final java.lang.String o7() {
        java.util.LinkedList list;
        r45.qq1 qq1Var = this.H;
        return (qq1Var == null || (list = qq1Var.getList(0)) == null) ? "" : kz5.n0.g0(list, "#", null, null, 0, null, df2.om.f230988d, 30, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        this.G = false;
        this.H = null;
        super.onLiveDeactivate();
    }

    @Override // df2.de, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        r45.ch1 ch1Var;
        r45.up1 up1Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        super.onLiveMsg(r71Var);
        if (r71Var == null || (list = r71Var.getList(14)) == null) {
            ch1Var = null;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.ch1) obj).getInteger(1) == 20123) {
                        break;
                    }
                }
            }
            ch1Var = (r45.ch1) obj;
        }
        boolean z17 = ch1Var != null;
        java.lang.String str = this.f229892p;
        if (z17) {
            dk2.tb tbVar = dk2.ef.f233392k;
            tbVar.f(42);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPollingFriendLikeMsg] data = ");
            r45.wm2 wm2Var = this.I;
            sb6.append(wm2Var != null ? pm0.b0.g(wm2Var) : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            r45.dj6 dj6Var = new r45.dj6();
            dj6Var.set(0, this.I);
            tbVar.e(42, dj6Var, new df2.bn(this, r45.ej6.class), false);
        }
        long j17 = (r71Var == null || (up1Var = (r45.up1) r71Var.getCustom(32)) == null) ? 0L : up1Var.getLong(9);
        com.tencent.mars.xlog.Log.i(str, "[onLiveMsg] realname_like_live_flag = " + j17);
        this.D = pm0.v.A(j17, (long) 1);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.ta4 e17;
        com.tencent.mm.protobuf.g byteString;
        r45.l62 l62Var;
        r45.ic1 ic1Var;
        super.onLiveStart(hc1Var);
        r45.wm2 wm2Var = null;
        r45.vl2 vl2Var = (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.getCustom(85)) == null) ? null : (r45.vl2) ic1Var.getCustom(23);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) business(mm2.c1.class)).f328846n;
        java.lang.String str = this.f229892p;
        if (vl2Var != null && finderObject != null) {
            r45.dm2 object_extend = finderObject.getObject_extend();
            if (object_extend == null) {
                object_extend = new r45.dm2();
            }
            finderObject.setObject_extend(object_extend);
            r45.dm2 object_extend2 = finderObject.getObject_extend();
            if (object_extend2 != null) {
                object_extend2.set(27, vl2Var);
                com.tencent.mars.xlog.Log.i(str, "[onLiveStart] update dynamicResourceKeySet = " + vl2Var);
            }
        }
        if (hc1Var != null && (l62Var = (r45.l62) hc1Var.getCustom(84)) != null) {
            com.tencent.mars.xlog.Log.i(str, "[likeBtn] = " + pm0.b0.g(l62Var));
            r45.j62 j62Var = (r45.j62) l62Var.getCustom(0);
            if (j62Var != null) {
                this.f229897u.postValue(java.lang.Boolean.valueOf(j62Var.getBoolean(1)));
                this.B = j62Var.getBoolean(0);
                this.C = j62Var.getInteger(3);
                com.tencent.mars.xlog.Log.i(str, "[onLiveStart] grayout_realname_like_button = " + j62Var.getBoolean(2) + " iconType = " + this.C);
                this.D = j62Var.getBoolean(2);
            }
            r45.qq1 qq1Var = (r45.qq1) l62Var.getCustom(1);
            if (qq1Var != null) {
                java.util.LinkedList list = qq1Var.getList(0);
                if (!(!(list == null || list.isEmpty()))) {
                    qq1Var = null;
                }
                if (qq1Var != null) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    r45.ch1 ch1Var = new r45.ch1();
                    ch1Var.set(1, 1000067);
                    ch1Var.set(4, new com.tencent.mm.protobuf.g(qq1Var.toByteArray()));
                    dk2.j jVar = new dk2.j(ch1Var);
                    java.lang.Object D = jVar.D();
                    this.H = D instanceof r45.qq1 ? (r45.qq1) D : null;
                    linkedList.add(jVar);
                    com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
                    if (mgVar != null) {
                        mgVar.I1(linkedList);
                    }
                }
            }
            r45.k62 k62Var = (r45.k62) l62Var.getCustom(2);
            if (k62Var != null) {
                int integer = ((mm2.c1) business(mm2.c1.class)).I7().getInteger(2);
                boolean z17 = k62Var.getBoolean(3);
                com.tencent.mars.xlog.Log.i(str, "clientBubble set: " + pm0.b0.g(k62Var));
                if (zl2.q4.f473933a.E()) {
                    android.content.Context O6 = O6();
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
                    e4Var.f211776c = "收到点赞气泡配置了!, " + z17 + ", " + integer + '}';
                    e4Var.c();
                }
                com.tencent.mars.xlog.Log.i(str, "clientBubble set: roleType = " + integer + ", show_after_joinlive=" + z17);
                if (z17) {
                    this.f229899w.postValue((r45.i62) k62Var.getCustom(1));
                } else {
                    r45.i62 i62Var = (r45.i62) k62Var.getCustom(1);
                    if (i62Var != null) {
                        i62Var.set(2, 1);
                    }
                }
                this.E = k62Var;
            }
        }
        r45.wm2 wm2Var2 = new r45.wm2();
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        byte[] g17 = (nVar == null || (e17 = nVar.e()) == null || (byteString = e17.getByteString(30)) == null) ? null : byteString.g();
        if (g17 != null) {
            try {
                wm2Var2.parseFrom(g17);
                wm2Var = wm2Var2;
            } catch (java.lang.Exception e18) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
            }
        }
        this.I = wm2Var;
        if (wm2Var != null) {
            java.util.LinkedList list2 = wm2Var.getList(3);
            kotlin.jvm.internal.o.f(list2, "getLike_list(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next()).getUsername());
            }
            this.f229891J = new java.util.LinkedList(arrayList);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) pluginLayout;
        this.f229899w.observe(k0Var, new df2.sm(this));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = this.f229897u;
        liveMutableData.f111660d = true;
        liveMutableData.observe(k0Var, new df2.tm(this));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2 = this.f229898v;
        liveMutableData2.f111660d = true;
        liveMutableData2.observe(k0Var, new df2.um(this));
        this.F = new df2.vm(this);
    }

    @Override // df2.de, if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        n7("onViewUnmount", true);
        this.f229902z = null;
        this.F = null;
        super.onViewUnmount(pluginLayout);
    }

    public final boolean p7() {
        java.lang.Boolean bool = (java.lang.Boolean) this.f229897u.getValue();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void q7() {
        java.util.LinkedList list;
        r45.qq1 qq1Var = this.H;
        if (qq1Var != null) {
            java.util.LinkedList list2 = qq1Var != null ? qq1Var.getList(0) : null;
            if (!(list2 == null || list2.isEmpty())) {
                r45.ch1 ch1Var = new r45.ch1();
                ch1Var.set(1, 1000067);
                r45.qq1 qq1Var2 = new r45.qq1();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.qq1 qq1Var3 = this.H;
                if (qq1Var3 != null && (list = qq1Var3.getList(0)) != null) {
                    linkedList.addAll(list);
                }
                pm0.v.d0(linkedList, df2.pm.f231101d);
                java.util.Collections.reverse(linkedList);
                java.util.LinkedList linkedList2 = new java.util.LinkedList(kz5.n0.K0(linkedList, 2));
                r45.xj5 xj5Var = new r45.xj5();
                xj5Var.set(1, c01.z1.r());
                linkedList2.addLast(xj5Var);
                java.util.Collections.reverse(linkedList2);
                qq1Var2.set(0, linkedList2);
                ch1Var.set(4, new com.tencent.mm.protobuf.g(qq1Var2.toByteArray()));
                dk2.j jVar = new dk2.j(ch1Var);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList3.add(jVar);
                com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
                if (mgVar != null) {
                    mgVar.I1(linkedList3);
                    return;
                }
                return;
            }
        }
        r45.tj1 tj1Var = new r45.tj1();
        tj1Var.set(0, c01.z1.r());
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        r45.ch1 ch1Var2 = new r45.ch1();
        ch1Var2.set(1, 20123);
        ch1Var2.set(4, new com.tencent.mm.protobuf.g(tj1Var.toByteArray()));
        linkedList4.add(new dk2.lc(ch1Var2));
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar2 = (com.tencent.mm.plugin.finder.live.plugin.mg) R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        if (mgVar2 != null) {
            mgVar2.I1(linkedList4);
        }
    }

    public final void r7(boolean z17, r45.wg7 source, boolean z18) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f229892p, "[likeOrCancel] like:" + z17 + ", source:" + source + ", needCancelToast:" + z18);
        kotlinx.coroutines.r2 r2Var = this.f229900x;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        pm0.v.X(new df2.rm(this, z17, source, z18));
    }

    public final void s7(int i17, java.lang.Integer num) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327231g2;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        if (num != null) {
            gVar.o("send_reason", num.intValue());
        }
        gVar.h("friend_wx_username", o7());
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void t7(int i17, int i18, java.lang.Integer num) {
        com.tencent.mars.xlog.Log.i(this.f229892p, "[reportRealTime] feedActionType = " + i17 + ", feedActionSubType = " + i18 + ", value = " + num);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = k0Var instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) k0Var : null;
        r45.qt2 reportObj = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null;
        r45.jn0 jn0Var = new r45.jn0();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) business(mm2.c1.class)).f328846n;
        jn0Var.set(0, java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : 0L));
        jn0Var.set(1, ((mm2.c1) business(mm2.c1.class)).f328852o);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", i17);
        jSONObject.put("feedActionSubType", i18);
        if (num != null) {
            jSONObject.put("value", num.intValue());
        }
        jn0Var.set(3, jSONObject.toString());
        ((c61.p2) ybVar).Lj(reportObj, 18054, jn0Var, ((mm2.e1) business(mm2.e1.class)).f328993w);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:3:0x000a, B:5:0x000e, B:7:0x0015, B:8:0x001b, B:10:0x002c, B:13:0x003a, B:15:0x003e), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u7(r45.wg7 r10, java.lang.Integer r11) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f229892p
            java.lang.String r1 = "[showGuideDialog] context = "
            java.lang.String r2 = "source"
            kotlin.jvm.internal.o.g(r10, r2)
            r2 = 0
            com.tencent.mm.plugin.finder.live.widget.zm r3 = r9.f229902z     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L39
            com.tencent.mm.ui.MMActivity r3 = r9.N6()     // Catch: java.lang.Exception -> L4e
            r4 = 0
            if (r3 == 0) goto L1a
            androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()     // Catch: java.lang.Exception -> L4e
            goto L1b
        L1a:
            r3 = r4
        L1b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4e
            r5.<init>(r1)     // Catch: java.lang.Exception -> L4e
            r5.append(r3)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L4e
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L35
            com.tencent.mm.plugin.finder.live.widget.zm r1 = new com.tencent.mm.plugin.finder.live.widget.zm     // Catch: java.lang.Exception -> L4e
            r1.<init>(r3)     // Catch: java.lang.Exception -> L4e
            r9.f229902z = r1     // Catch: java.lang.Exception -> L4e
            jz5.f0 r4 = jz5.f0.f302826a     // Catch: java.lang.Exception -> L4e
        L35:
            if (r4 != 0) goto L39
            r1 = r2
            goto L3a
        L39:
            r1 = 1
        L3a:
            com.tencent.mm.plugin.finder.live.widget.zm r3 = r9.f229902z     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L4c
            r3.N = r10     // Catch: java.lang.Exception -> L4e
            r3.Q = r11     // Catch: java.lang.Exception -> L4e
            r3.P = r2     // Catch: java.lang.Exception -> L4e
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            com.tencent.mm.plugin.finder.live.widget.e0.W(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L4e
        L4c:
            r2 = r1
            goto L64
        L4e:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "[showGuideDialog] e = "
            r11.<init>(r1)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.mars.xlog.Log.i(r0, r10)
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cn.u7(r45.wg7, java.lang.Integer):boolean");
    }
}
