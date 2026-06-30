package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class s4 implements zy2.ic {
    public static final com.tencent.mm.plugin.finder.profile.widget.i3 I = new com.tencent.mm.plugin.finder.profile.widget.i3(null);
    public yz5.a A;
    public java.lang.String B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public boolean F;
    public yz5.p G;
    public java.lang.Integer H;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f124747a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f124748b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f124749c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f124750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f124751e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f124752f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f124753g;

    /* renamed from: h, reason: collision with root package name */
    public final kk.l f124754h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f124755i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f124756j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f124757k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f124758l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f124759m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f124760n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.widget.e4 f124761o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f124762p;

    /* renamed from: q, reason: collision with root package name */
    public db2.b1 f124763q;

    /* renamed from: r, reason: collision with root package name */
    public r45.j32 f124764r;

    /* renamed from: s, reason: collision with root package name */
    public r45.c32 f124765s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f124766t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f124767u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f124768v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.widget.l3 f124769w;

    /* renamed from: x, reason: collision with root package name */
    public zy2.hc f124770x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f124771y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f124772z;

    public s4(java.lang.String anchorFinderUsername, android.content.Context context, boolean z17, r45.qt2 contextObj, int i17, boolean z18, boolean z19, kk.l userExtInfoCache, java.lang.String commentScene, java.lang.String fromQrcode) {
        kotlin.jvm.internal.o.g(anchorFinderUsername, "anchorFinderUsername");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(userExtInfoCache, "userExtInfoCache");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(fromQrcode, "fromQrcode");
        this.f124747a = anchorFinderUsername;
        this.f124748b = context;
        this.f124749c = z17;
        this.f124750d = contextObj;
        this.f124751e = i17;
        this.f124752f = z18;
        this.f124753g = z19;
        this.f124754h = userExtInfoCache;
        this.f124755i = commentScene;
        this.f124756j = fromQrcode;
        this.f124760n = new java.util.ArrayList();
        this.f124769w = new com.tencent.mm.plugin.finder.profile.widget.l3(this);
        this.f124772z = "";
        this.B = "";
        this.D = "";
        this.E = "";
    }

    public static final void b(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        java.lang.String string;
        boolean z17;
        boolean z18 = !s4Var.f124752f;
        boolean z19 = s4Var.f124749c;
        if (!z19) {
            java.util.Iterator it = ((java.util.ArrayList) s4Var.f124760n).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = (com.tencent.mm.plugin.finder.profile.widget.m3) it.next();
                java.lang.String string2 = m3Var.f124624a.getString(8);
                if (string2 == null || string2.length() == 0) {
                    r45.q65 q65Var = (r45.q65) m3Var.f124624a.getCustom(10);
                    if (!(q65Var != null && q65Var.getBoolean(0))) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (!z17) {
                z18 = false;
            }
        }
        if (z19 && !s4Var.f124771y) {
            z18 = false;
        }
        if (!z18) {
            android.widget.TextView textView = s4Var.f124758l;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = s4Var.f124758l;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = s4Var.f124758l;
        if (textView3 != null) {
            if (s4Var.f124771y) {
                string = s4Var.f124772z;
            } else {
                r45.j32 j32Var = s4Var.f124764r;
                boolean z27 = j32Var != null && j32Var.getInteger(2) == j32Var.getInteger(3);
                android.content.Context context = s4Var.f124748b;
                if (z27) {
                    string = context.getString(com.tencent.mm.R.string.eyl);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else {
                    string = context.getString(com.tencent.mm.R.string.eyk);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
            }
            textView3.setText(string);
        }
    }

    public static void d(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, boolean z17, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        db2.b1 b1Var = s4Var.f124763q;
        if (b1Var != null) {
            b1Var.j();
        }
        android.content.Context context = s4Var.f124748b;
        int i27 = ((context instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaUI) || (context instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI)) ? 1 : 0;
        com.tencent.mars.xlog.Log.i("FinderMoreLiveNoticeListWidget", "#loadData fromHead=" + z17 + ", noticeType=" + i27 + ", lastNoticeStartTime=" + i19 + ", anchorFinderUsername=" + str3);
        db2.b1 b1Var2 = new db2.b1(null, null, str3, i19, null, null, null, null, z17 ? 1 : 0, java.lang.Integer.valueOf(i27), null, com.tencent.mm.plugin.appbrand.jsapi.pay.m1.CTRL_INDEX, null);
        pq5.g l17 = b1Var2.l();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) context);
        l17.K(new com.tencent.mm.plugin.finder.profile.widget.k4(z17, s4Var, str3, i27));
        s4Var.f124763q = b1Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.tencent.mm.plugin.finder.profile.widget.m3 r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 1844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.widget.s4.c(com.tencent.mm.plugin.finder.profile.widget.m3, int, int):void");
    }

    public final void e() {
        for (com.tencent.mm.plugin.finder.profile.widget.m3 m3Var : this.f124760n) {
            java.lang.String string = m3Var.f124624a.getString(4);
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                r45.h32 bj6 = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).bj(this.f124747a, string);
                if (bj6 != null) {
                    m3Var.f124624a.set(1, java.lang.Integer.valueOf(bj6.getInteger(1)));
                }
            }
        }
        com.tencent.mm.plugin.finder.profile.widget.e4 e4Var = this.f124761o;
        if (e4Var != null) {
            e4Var.f124531g = this.f124766t;
        }
        if (e4Var != null) {
            e4Var.notifyDataSetChanged();
        }
    }

    public final void f(java.lang.String noticeId) {
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        java.util.Iterator it = ((java.util.ArrayList) this.f124760n).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.profile.widget.m3) it.next()).f124624a.getString(4), noticeId)) {
                it.remove();
                break;
            }
        }
        e();
    }

    public void g(r45.j32 j32Var, java.lang.String str, boolean z17, java.lang.String refPageType, int i17, int i18, r45.c32 c32Var) {
        r45.h32 h32Var;
        boolean z18;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(refPageType, "refPageType");
        if (((java.lang.Number) ae2.in.f3688a.W().r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("FinderMoreLiveNoticeListWidget", "multi notice disable, return.");
            return;
        }
        this.B = str == null ? "" : str;
        this.D = refPageType;
        this.C = i18;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f124757k;
        boolean z19 = z2Var != null && z2Var.h();
        java.util.List list3 = this.f124760n;
        if (z19) {
            com.tencent.mars.xlog.Log.i("FinderMoreLiveNoticeListWidget", "dialog is showing, special something.");
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (j32Var != null && (list2 = j32Var.getList(0)) != null) {
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        r45.h32 h32Var2 = (r45.h32) it.next();
                        java.util.Iterator it6 = ((java.util.ArrayList) list3).iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it6.next();
                                if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.profile.widget.m3) obj).f124624a.getString(4), h32Var2.getString(4))) {
                                    break;
                                }
                            }
                        }
                        com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = (com.tencent.mm.plugin.finder.profile.widget.m3) obj;
                        if (m3Var != null) {
                            h32Var2.set(1, java.lang.Integer.valueOf(m3Var.f124624a.getInteger(1)));
                        }
                        kotlin.jvm.internal.o.d(h32Var2);
                        arrayList.add(new com.tencent.mm.plugin.finder.profile.widget.m3(this, h32Var2));
                    }
                }
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list3;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                e();
                return;
            }
            return;
        }
        this.f124764r = j32Var;
        this.f124765s = c32Var;
        db2.b1 b1Var = this.f124763q;
        if (b1Var != null) {
            b1Var.j();
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) list3;
        arrayList3.clear();
        if (j32Var == null || (list = j32Var.getList(0)) == null) {
            h32Var = null;
        } else {
            java.util.Iterator it7 = list.iterator();
            h32Var = null;
            while (it7.hasNext()) {
                r45.h32 h32Var3 = (r45.h32) it7.next();
                if (h32Var3.getBoolean(15)) {
                    h32Var = h32Var3;
                } else {
                    arrayList3.add(new com.tencent.mm.plugin.finder.profile.widget.m3(this, h32Var3));
                }
            }
        }
        if (arrayList3.size() > 1) {
            kz5.g0.t(arrayList3, new com.tencent.mm.plugin.finder.profile.widget.m4());
        }
        if (h32Var != null) {
            arrayList3.add(0, new com.tencent.mm.plugin.finder.profile.widget.m3(this, h32Var));
        }
        android.content.Context context = this.f124748b;
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 0);
        this.f124757k = z2Var2;
        z2Var2.u(ym5.x.a(context, 600.0f));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.b6s, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        if (j32Var != null) {
            j32Var.getInteger(2);
        }
        this.f124759m = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.lq8);
        this.f124762p = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) inflate.findViewById(com.tencent.mm.R.id.f486583lr1);
        this.f124761o = new com.tencent.mm.plugin.finder.profile.widget.e4(this, this.f124747a, this.f124749c, this.f124748b, this.f124752f, false, 16, null);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f124759m;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f124759m;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f124761o);
        }
        if (!this.f124753g) {
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = this.f124762p;
            if (wxRefreshLayout2 != null) {
                wxRefreshLayout2.F(new com.tencent.mm.plugin.finder.profile.widget.DemoHeader(context, null));
            }
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout3 = this.f124762p;
            if (wxRefreshLayout3 != null) {
                wxRefreshLayout3.D(new com.tencent.mm.plugin.finder.profile.widget.DemoFooter(context, null));
            }
        }
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout4 = this.f124762p;
        if (wxRefreshLayout4 != null) {
            wxRefreshLayout4.setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.widget.n4(this));
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var3 = this.f124757k;
        if (z2Var3 != null) {
            z2Var3.l(new com.tencent.mm.plugin.finder.profile.widget.o4(this));
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var4 = this.f124757k;
        if (z2Var4 != null) {
            z2Var4.k(inflate, 0, 0);
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var5 = this.f124757k;
        if (z2Var5 != null) {
            z2Var5.C();
        }
        if (arrayList3.isEmpty() && (wxRefreshLayout = this.f124762p) != null) {
            wxRefreshLayout.c();
        }
        com.tencent.mars.xlog.Log.i("FinderMoreLiveNoticeListWidget", "scroll to " + i17);
        if (i17 <= 0 || i17 >= arrayList3.size() || (recyclerView = this.f124759m) == null) {
            z18 = false;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList4.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(recyclerView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget", "showList", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeListInfo;Ljava/lang/String;ZLjava/lang/String;IILcom/tencent/mm/protocal/protobuf/FinderLiveNextLiveNotificationInfo;)V", "Undefined", "scrollToPosition", "(I)V");
            z18 = false;
            recyclerView.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget", "showList", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeListInfo;Ljava/lang/String;ZLjava/lang/String;IILcom/tencent/mm/protocal/protobuf/FinderLiveNextLiveNotificationInfo;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        android.widget.TextView textView = this.f124758l;
        if ((textView == null || textView.getVisibility() != 0) ? z18 : true) {
            cl0.g gVar = new cl0.g();
            gVar.s("source_type", java.lang.Integer.valueOf(this.f124751e == 102 ? 2 : 1));
            gVar.o("notice_type", 2);
            i95.m c17 = i95.n0.c(c50.c1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1.l9((c50.c1) c17, ml2.i5.f327570e, this.f124747a, 0L, 0, this.f124755i, null, null, null, null, "", gVar.toString(), "", "", 0L, 0, null, 57824, null);
        }
    }

    public /* synthetic */ s4(java.lang.String str, android.content.Context context, boolean z17, r45.qt2 qt2Var, int i17, boolean z18, boolean z19, kk.l lVar, java.lang.String str2, java.lang.String str3, int i18, kotlin.jvm.internal.i iVar) {
        this(str, context, z17, qt2Var, (i18 & 16) != 0 ? 101 : i17, z18, z19, lVar, str2, (i18 & 512) != 0 ? "" : str3);
    }
}
