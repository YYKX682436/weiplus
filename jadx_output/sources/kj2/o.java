package kj2;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f308422a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f308423b;

    /* renamed from: c, reason: collision with root package name */
    public final pj2.b f308424c;

    /* renamed from: d, reason: collision with root package name */
    public final pj2.a f308425d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f308426e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f308427f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f308428g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f308429h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f308430i;

    /* renamed from: j, reason: collision with root package name */
    public r45.x71 f308431j;

    public o(android.view.View root, gk2.e liveData, pj2.b server, androidx.recyclerview.widget.p2 p2Var, pj2.a pluginCallback) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(server, "server");
        kotlin.jvm.internal.o.g(pluginCallback, "pluginCallback");
        this.f308422a = root;
        this.f308423b = liveData;
        this.f308424c = server;
        this.f308425d = pluginCallback;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.n_k);
        this.f308426e = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.jjj);
        this.f308427f = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveVisitorLinkConvertFactory finderLiveVisitorLinkConvertFactory = new com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveVisitorLinkConvertFactory(liveData, new kj2.b(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f308429h = arrayList;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(finderLiveVisitorLinkConvertFactory, arrayList, false);
        this.f308430i = wxRecyclerAdapter;
        if (p2Var != null) {
            recyclerView.N(p2Var);
        }
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(wxRecyclerAdapter);
    }

    public static final void a(kj2.o oVar, java.util.ArrayList arrayList, r45.x71 x71Var) {
        java.util.ArrayList arrayList2;
        r45.il4 il4Var;
        java.lang.String str;
        java.lang.String str2;
        vi2.g gVar;
        com.tencent.mm.protobuf.g byteString;
        java.lang.String str3;
        oVar.f308431j = x71Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List list = ((mm2.o4) oVar.f308423b.a(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (true ^ kotlin.jvm.internal.o.b(((km2.q) obj).f309189t, java.lang.Boolean.TRUE)) {
                    arrayList2.add(obj);
                }
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            java.lang.String str4 = qVar.f309172c;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put(str4, qVar);
        }
        java.util.List<km2.q> list2 = ((mm2.o4) oVar.f308423b.a(mm2.o4.class)).f329318o;
        kotlin.jvm.internal.o.f(list2, "<get-linkMicUserList>(...)");
        synchronized (list2) {
            for (km2.q qVar2 : list2) {
                java.lang.String str5 = qVar2.f309172c;
                if (str5 == null) {
                    str5 = "";
                }
                hashMap.put(str5, qVar2);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList, new kj2.a());
        java.util.ArrayList<r45.xn1> arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = F0.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) next).getCustom(0);
            if (finderContact == null || (str3 = finderContact.getUsername()) == null) {
                str3 = "";
            }
            if (hashMap.get(str3) == null) {
                arrayList3.add(next);
            }
        }
        if (arrayList3.size() > 300) {
            java.util.List subList = arrayList3.subList(0, 300);
            kotlin.jvm.internal.o.e(subList, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderLiveContact>");
            arrayList3 = (java.util.ArrayList) subList;
        }
        if (x71Var == null || (byteString = x71Var.getByteString(20)) == null) {
            il4Var = null;
        } else {
            r45.t04 t04Var = new r45.t04();
            t04Var.parseFrom(byteString.f192156a);
            il4Var = (r45.il4) t04Var.getCustom(0);
        }
        oVar.f308425d.c(true, arrayList3.size(), il4Var);
        oVar.e(arrayList3.size() > 0 ? 0 : 8);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        for (r45.xn1 xn1Var : arrayList3) {
            java.util.Map map = ((mm2.y2) oVar.f308423b.a(mm2.y2.class)).A;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            if (finderContact2 == null || (str = finderContact2.getUsername()) == null) {
                str = "";
            }
            dk2.b8 b8Var = (dk2.b8) map.get(str);
            long j17 = b8Var != null ? b8Var.f233242a : 0L;
            boolean z17 = j17 > 0 && c01.id.c() > j17;
            if (j17 <= 0 || z17) {
                java.util.Map map2 = ((mm2.y2) oVar.f308423b.a(mm2.y2.class)).A;
                com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                if (finderContact3 == null || (str2 = finderContact3.getUsername()) == null) {
                    str2 = "";
                }
                map2.remove(str2);
                gVar = vi2.g.f437546d;
            } else {
                gVar = vi2.g.f437548f;
            }
            arrayList4.add(new vi2.h(gVar, xn1Var));
        }
        androidx.recyclerview.widget.h0.a(new kj2.n(oVar, arrayList4), true).a(new kj2.m(oVar, arrayList4));
        android.widget.TextView textView = oVar.f308426e;
        if (textView == null) {
            return;
        }
        textView.setText(oVar.f308422a.getContext().getResources().getString(com.tencent.mm.R.string.lz9, java.lang.Integer.valueOf(oVar.f308429h.size())));
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("FinderLiveInviteVisitorMicWidget", "hide");
        this.f308427f.clear();
        this.f308429h.clear();
        this.f308430i.notifyDataSetChanged();
        e(8);
    }

    public final void c() {
        pm0.v.X(new kj2.e(this));
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("FinderLiveInviteVisitorMicWidget", "reload");
        pm0.v.X(new kj2.f(this));
    }

    public final void e(int i17) {
        android.view.View view = this.f308422a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/voiceroom/widget/FinderLiveInviteVisitorMicWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/voiceroom/widget/FinderLiveInviteVisitorMicWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show isActive: ");
        kotlinx.coroutines.r2 r2Var = this.f308428g;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveInviteVisitorMicWidget", sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = this.f308428g;
        boolean z17 = false;
        if (r2Var2 != null && r2Var2.a()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        kotlinx.coroutines.y0 a17 = this.f308424c.a();
        this.f308428g = a17 != null ? kotlinx.coroutines.l.d(a17, null, null, new kj2.l(this, null), 3, null) : null;
    }
}
