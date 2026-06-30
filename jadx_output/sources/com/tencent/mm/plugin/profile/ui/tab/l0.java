package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class l0 implements com.tencent.mm.plugin.profile.ui.tab.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f154387a;

    /* renamed from: b, reason: collision with root package name */
    public r45.wl f154388b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f154389c;

    /* renamed from: d, reason: collision with root package name */
    public final long f154390d;

    /* renamed from: e, reason: collision with root package name */
    public final sr3.g f154391e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f154392f;

    /* renamed from: g, reason: collision with root package name */
    public zy2.yb f154393g;

    /* renamed from: h, reason: collision with root package name */
    public zy2.ic f154394h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f154395i;

    /* renamed from: j, reason: collision with root package name */
    public r45.j32 f154396j;

    /* renamed from: k, reason: collision with root package name */
    public r45.c32 f154397k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f154398l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f154399m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f154400n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f154401o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f154402p;

    public l0(com.tencent.mm.ui.MMActivity activity, r45.wl profileInfo, android.view.View rootView, long j17, sr3.g config) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(profileInfo, "profileInfo");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(config, "config");
        this.f154387a = activity;
        this.f154388b = profileInfo;
        this.f154389c = rootView;
        this.f154390d = j17;
        this.f154391e = config;
        this.f154392f = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.d0(this));
        this.f154395i = jz5.h.b(com.tencent.mm.plugin.profile.ui.tab.e0.f154296d);
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f154400n = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        h();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init with LiveInfoV2: noticeCount=");
        r45.j32 j32Var = this.f154396j;
        int i17 = 0;
        if (j32Var != null && (list = j32Var.getList(0)) != null) {
            i17 = list.size();
        }
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", sb6.toString());
    }

    public static final void d(com.tencent.mm.plugin.profile.ui.tab.l0 l0Var, java.lang.String finderUserName, yz5.p pVar) {
        if (l0Var.f() != null) {
            r45.qt2 qt2Var = new r45.qt2();
            com.tencent.mm.plugin.profile.ui.tab.f0 f0Var = new com.tencent.mm.plugin.profile.ui.tab.f0(pVar);
            kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", "requestLiveNoticeList: username=" + finderUserName + ", lastNoticeStartTime=0");
            new db2.b1("", "", finderUserName, 0, null, null, new c61.h8(f0Var), qt2Var, 0, null, new java.util.LinkedList()).l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if ((r0 != null && r0.getBoolean(0)) != false) goto L40;
     */
    @Override // com.tencent.mm.plugin.profile.ui.tab.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r5 = this;
            r45.wl r0 = r5.f154388b
            r45.i32 r1 = r0.F
            java.lang.String r2 = "ContactBizHeaderLiveNoticeLogicV2"
            r3 = 0
            if (r1 != 0) goto Lf
            java.lang.String r0 = "LiveInfoV2 is null"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r3
        Lf:
            r45.an r0 = r0.f389245s
            r1 = 1
            if (r0 == 0) goto L1f
            com.tencent.mm.protobuf.g r0 = r0.f370126d
            if (r0 == 0) goto L1f
            byte[] r0 = r0.f192156a
            int r0 = r0.length
            if (r0 != 0) goto L1f
            r0 = r1
            goto L20
        L1f:
            r0 = r3
        L20:
            if (r0 == 0) goto L28
            java.lang.String r0 = "finder username is empty"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r3
        L28:
            r45.j32 r0 = r5.f154396j
            if (r0 == 0) goto L4e
            java.util.LinkedList r0 = r0.getList(r3)
            if (r0 == 0) goto L4e
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.h32 r0 = (r45.h32) r0
            if (r0 == 0) goto L4e
            r4 = 25
            java.lang.String r4 = r0.getString(r4)
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 != 0) goto L4e
            int r0 = r0.getInteger(r3)
            if (r0 == 0) goto L4e
            r0 = r1
            goto L4f
        L4e:
            r0 = r3
        L4f:
            r5.f154398l = r0
            r45.c32 r0 = r5.f154397k
            if (r0 == 0) goto L70
            int r4 = r0.getInteger(r3)
            if (r4 > 0) goto L6e
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.fw4 r0 = (r45.fw4) r0
            if (r0 == 0) goto L6b
            boolean r0 = r0.getBoolean(r3)
            if (r0 != r1) goto L6b
            r0 = r1
            goto L6c
        L6b:
            r0 = r3
        L6c:
            if (r0 == 0) goto L70
        L6e:
            r0 = r1
            goto L71
        L70:
            r0 = r3
        L71:
            r5.f154399m = r0
            boolean r4 = r5.f154398l
            if (r4 != 0) goto L7f
            if (r0 != 0) goto L7f
            java.lang.String r0 = "Both LiveNoticeListInfo and NextLiveNotificationInfo are invalid"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r3
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "checkLiveInfoLegal: hasValidLiveNoticeList="
            r0.<init>(r3)
            boolean r3 = r5.f154398l
            r0.append(r3)
            java.lang.String r3 = ", hasValidNextLiveNotice="
            r0.append(r3)
            boolean r3 = r5.f154399m
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.tab.l0.a():boolean");
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.a
    public void b(r45.wl wlVar) {
        com.tencent.mm.protobuf.g gVar;
        if (wlVar == null) {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update: profileInfo empty!");
            return;
        }
        this.f154388b = wlVar;
        h();
        r45.j32 j32Var = this.f154396j;
        if (j32Var != null) {
            kotlin.jvm.internal.o.d(j32Var);
            if (!j32Var.getList(0).isEmpty()) {
                r45.an anVar = wlVar.f389245s;
                if (anVar == null || (gVar = anVar.f370126d) == null) {
                    com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update: VideoFinderInfo or user_name is null!");
                    return;
                }
                java.lang.String b17 = x51.j1.b(gVar);
                r45.j32 j32Var2 = this.f154396j;
                kotlin.jvm.internal.o.d(j32Var2);
                java.util.LinkedList<r45.h32> list = j32Var2.getList(0);
                kotlin.jvm.internal.o.f(list, "getNotice_info(...)");
                for (r45.h32 h32Var : list) {
                    com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
                    kotlin.jvm.internal.o.d(b17);
                    java.lang.String string = h32Var.getString(4);
                    java.lang.String str = "";
                    if (string == null) {
                        string = "";
                    }
                    r45.h32 e17 = i1Var.e(b17, string);
                    if (e17 == null) {
                        e17 = new r45.h32();
                    }
                    e17.set(0, java.lang.Integer.valueOf(h32Var.getInteger(0)));
                    e17.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
                    e17.set(3, h32Var.getString(3));
                    e17.set(4, h32Var.getString(4));
                    com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update FinderFeedLiveNoticeCache: noticeId=" + h32Var.getString(4) + ", status=" + e17.getInteger(1));
                    java.lang.String string2 = h32Var.getString(4);
                    if (string2 != null) {
                        str = string2;
                    }
                    i1Var.a(b17, str, e17);
                }
                kotlin.jvm.internal.o.d(b17);
                j(b17);
                i();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update: liveNoticeInfo empty!");
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.a
    public void c() {
        boolean z17 = this.f154398l;
        boolean z18 = this.f154397k != null;
        if (!z17 && !z18) {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "no live info, hide UI");
            android.view.View e17 = e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView: hasLiveNoticeList=" + z17 + ", hasNextLiveNotice=" + z18);
        if (z17) {
            kotlinx.coroutines.r2 r2Var = this.f154401o;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f154401o = kotlinx.coroutines.l.d(this.f154400n, null, null, new com.tencent.mm.plugin.profile.ui.tab.h0(this, z18, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "show live notify view with nextLiveNotice only");
        android.view.View e18 = e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(e18, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(e18, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g();
    }

    public final android.view.View e() {
        java.lang.Object value = ((jz5.n) this.f154392f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final vd2.i5 f() {
        return (vd2.i5) ((jz5.n) this.f154395i).getValue();
    }

    public final void g() {
        if (f() == null) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "liveUtilsService is null!");
            return;
        }
        r45.an anVar = this.f154388b.f389245s;
        if (anVar == null || anVar.f370126d == null) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "initHeaderWidget: VideoFinderInfo or user_name is null!");
            return;
        }
        if (this.f154393g == null) {
            r45.qt2 qt2Var = new r45.qt2();
            java.lang.String b17 = x51.j1.b(this.f154388b.f389245s.f370126d);
            kotlin.jvm.internal.o.d(b17);
            j(b17);
            kotlin.jvm.internal.o.d(f());
            android.view.View e17 = e();
            com.tencent.mm.ui.MMActivity activity = this.f154387a;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", "newHeaderLiveWidget: create HeaderLiveWidget with previewOnly=false");
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = new com.tencent.mm.plugin.finder.profile.widget.s1(e17, activity, qt2Var, false, com.tencent.mm.plugin.finder.profile.uic.p2.f124101r, b17, "");
            this.f154393g = s1Var;
            s1Var.k(b17);
            zy2.yb ybVar = this.f154393g;
            kotlin.jvm.internal.o.d(ybVar);
            ((com.tencent.mm.plugin.finder.profile.widget.s1) ybVar).f124724h = new com.tencent.mm.plugin.profile.ui.tab.c0(this);
        }
        i();
    }

    public final void h() {
        java.util.LinkedList list;
        r45.i32 i32Var = this.f154388b.F;
        if (i32Var == null) {
            return;
        }
        try {
            com.tencent.mm.protobuf.g gVar = i32Var.f376697d;
            if (gVar != null && gVar.f192156a.length > 0) {
                r45.j32 j32Var = new r45.j32();
                j32Var.parseFrom(i32Var.f376697d.g());
                this.f154396j = j32Var;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parsed LiveNoticeListInfo: noticeCount=");
                r45.j32 j32Var2 = this.f154396j;
                sb6.append((j32Var2 == null || (list = j32Var2.getList(0)) == null) ? null : java.lang.Integer.valueOf(list.size()));
                com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", sb6.toString());
            }
            com.tencent.mm.protobuf.g gVar2 = i32Var.f376698e;
            if (gVar2 == null || gVar2.f192156a.length <= 0) {
                return;
            }
            r45.c32 c32Var = new r45.c32();
            c32Var.parseFrom(i32Var.f376698e.g());
            this.f154397k = c32Var;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("parsed NextLiveNotificationInfo: hasData=");
            sb7.append(this.f154397k != null);
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", sb7.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "parse LiveInfoV2 failed: " + e17.getMessage());
        }
    }

    public final void i() {
        com.tencent.mm.protobuf.g gVar;
        java.util.LinkedList list;
        r45.an anVar = this.f154388b.f389245s;
        if (anVar == null || (gVar = anVar.f370126d) == null) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "refreshHeaderWidget: VideoFinderInfo is null!");
            return;
        }
        java.lang.String b17 = x51.j1.b(gVar);
        r45.j32 j32Var = this.f154396j;
        r45.h32 h32Var = (j32Var == null || (list = j32Var.getList(0)) == null) ? null : (r45.h32) kz5.n0.Z(list);
        kotlin.jvm.internal.o.d(b17);
        j(b17);
        if (h32Var != null) {
            com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
            java.lang.String string = h32Var.getString(4);
            if (string == null) {
                string = "";
            }
            r45.h32 e17 = i1Var.e(b17, string);
            if (e17 != null) {
                h32Var.set(1, java.lang.Integer.valueOf(e17.getInteger(1)));
            }
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "refresh header: noticeId=" + h32Var.getString(4) + ", status=" + h32Var.getInteger(1));
        }
        boolean z17 = h32Var != null;
        boolean z18 = this.f154397k != null;
        if (!z17 && !z18) {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "refresh header: no data to show");
            return;
        }
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "refresh header: hasLiveNoticeList=" + z17 + ", hasNextLiveNotice=" + z18);
        zy2.yb ybVar = this.f154393g;
        if (ybVar != null) {
            sr3.g gVar2 = this.f154391e;
            ((com.tencent.mm.plugin.finder.profile.widget.s1) ybVar).f("ContactBizProfile", b17, false, gVar2.a(), gVar2.a(), null, "", "");
        }
    }

    public final void j(java.lang.String finderUserName) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        java.lang.Integer num = null;
        if (f() != null) {
            r45.j32 j32Var = this.f154396j;
            r45.c32 c32Var = this.f154397k;
            kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateUserExtInfoCache: username=");
            sb6.append(finderUserName);
            sb6.append(", noticeCount=");
            sb6.append((j32Var == null || (list3 = j32Var.getList(0)) == null) ? null : java.lang.Integer.valueOf(list3.size()));
            sb6.append(", hasNextLiveInfo=");
            sb6.append(c32Var != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", sb6.toString());
            kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(finderUserName);
            if (l2Var == null) {
                l2Var = new com.tencent.mm.plugin.finder.profile.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
            }
            l2Var.f123923l = j32Var;
            l2Var.f123916e = (j32Var == null || (list2 = j32Var.getList(0)) == null) ? null : (r45.h32) kz5.n0.Z(list2);
            l2Var.B = c32Var;
            lVar.j(finderUserName, l2Var);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update userExtInfoCache via service: username=");
        sb7.append(finderUserName);
        sb7.append(", noticeCount=");
        r45.j32 j32Var2 = this.f154396j;
        if (j32Var2 != null && (list = j32Var2.getList(0)) != null) {
            num = java.lang.Integer.valueOf(list.size());
        }
        sb7.append(num);
        sb7.append(", hasNextLiveInfo=");
        sb7.append(this.f154397k != null);
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", sb7.toString());
    }
}
