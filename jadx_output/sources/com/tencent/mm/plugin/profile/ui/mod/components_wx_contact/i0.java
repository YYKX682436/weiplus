package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class i0 extends kr3.t {

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f154071r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f154072s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f154073t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f154074u;

    /* renamed from: v, reason: collision with root package name */
    public final int f154075v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f154076w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f154077x;

    /* renamed from: y, reason: collision with root package name */
    public long f154078y;

    /* renamed from: z, reason: collision with root package name */
    public long f154079z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ModProfile.ModImageDescriptionUI", activity, 0, 4, null);
        this.f154071r = new java.util.ArrayList();
        this.f154072s = new java.util.ArrayList();
        this.f154073t = jz5.h.b(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.o(this));
        this.f154075v = 9;
        this.f154076w = jz5.h.b(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n(this));
        this.f154077x = jz5.h.b(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.l(this, activity));
    }

    public static final java.lang.Object l7(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, com.tencent.mm.ui.widget.dialog.f4 f4Var, java.util.List list, int i17, kotlin.coroutines.Continuation continuation) {
        i0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModImageDescriptionUI", "handleImagePathList addSource:" + i17 + ' ' + kz5.n0.g0(list, null, null, null, 0, null, null, 63, null));
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.z(list, i0Var, i17, new java.util.ArrayList(), f4Var, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    @Override // kr3.t
    public void O6() {
        java.util.List list = this.f154072s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((mr3.l) it.next()).f330879h;
            if (str != null) {
                arrayList.add(str);
            }
        }
        java.lang.String username = getUsername();
        if (username == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(gc0.p2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        gc0.p2.T6((gc0.p2) a17, new gc0.b0(username, null), arrayList, null, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.b0(username, this), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0299 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // kr3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R6(kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0.R6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kr3.t
    public void T6(yz5.l onResult) {
        kotlin.jvm.internal.o.g(onResult, "onResult");
        if (((com.tencent.mm.view.recyclerview.WxRecyclerView) this.f311480h) == null) {
            onResult.invoke(0);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("contact_add_image_desc_from_recommend");
        if (stringExtra == null) {
            onResult.invoke(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModImageDescriptionUI", "recommend image: ".concat(stringExtra));
        if (!r26.n0.N(stringExtra)) {
            java.util.List list = this.f154072s;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kk.k.e(((mr3.l) it.next()).f330879h));
            }
            java.lang.String Ai = ((br3.f) ((fc0.e) i95.n0.c(fc0.e.class))).Ai(getUsername(), stringExtra);
            if (Ai == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModImageDescriptionUI", "compress failed, got null path");
                onResult.invoke(0);
                return;
            }
            java.lang.String e17 = kk.k.e(Ai);
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModImageDescriptionUI", "successfully got current images: " + ((java.util.ArrayList) list).size() + ", md5: " + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null) + ", recommend md5: " + e17);
            if (arrayList.contains(e17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModImageDescriptionUI", "recommend image exist, skip save images");
                onResult.invoke(0);
            } else {
                if (((java.util.ArrayList) list).size() >= this.f154075v) {
                    onResult.invoke(-1);
                    return;
                }
                mr3.l a17 = mr3.l.f330874n.a(getUsername(), Ai, 4);
                if (a17 == null) {
                    onResult.invoke(0);
                } else {
                    ym5.a1.f(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.x(this, a17, onResult));
                }
            }
        }
    }

    @Override // kr3.t
    public java.lang.String V6() {
        return "ModImageDescriptionUIC";
    }

    @Override // kr3.t
    public lr3.a Y6() {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.a0(this);
    }

    @Override // kr3.t
    public boolean Z6() {
        java.util.List list = this.f154072s;
        int size = ((java.util.ArrayList) list).size();
        java.util.List list2 = this.f154071r;
        if (size != ((java.util.ArrayList) list2).size()) {
            return true;
        }
        int size2 = ((java.util.ArrayList) list).size();
        for (int i17 = 0; i17 < size2; i17++) {
            if (!kotlin.jvm.internal.o.b(((java.util.ArrayList) list).get(i17), ((java.util.ArrayList) list2).get(i17))) {
                return true;
            }
        }
        return false;
    }

    @Override // kr3.t
    public android.view.View b7(java.lang.String username, com.tencent.mm.contact.o contact) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        java.util.Iterator it;
        int i17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(contact, "contact");
        int f17 = i65.a.f(getActivity(), com.tencent.mm.R.dimen.f479672c9);
        boolean z17 = false;
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7j)).setPadding(f17, 0, f17, 0);
        int f18 = i65.a.f(getActivity(), com.tencent.mm.R.dimen.f479646bl);
        android.widget.TextView textView = this.f311478f;
        if (textView != null) {
            textView.setText(getActivity().getString(com.tencent.mm.R.string.o_o));
        }
        android.widget.TextView textView2 = this.f311478f;
        if (textView2 != null) {
            textView2.setTextSize(0, i65.a.p(getActivity(), com.tencent.mm.R.dimen.f479628b3));
        }
        android.widget.TextView textView3 = this.f311478f;
        if (textView3 != null) {
            textView3.setPadding(f18, 0, f18, 0);
        }
        if (X6()) {
            int f19 = i65.a.f(getActivity(), com.tencent.mm.R.dimen.f479646bl);
            ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7j)).setPadding(f19, 0, f19, i65.a.f(getActivity(), com.tencent.mm.R.dimen.anl));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = new com.tencent.mm.view.recyclerview.WxRecyclerView(getActivity());
        wxRecyclerView2.setAdapter((xm3.t0) ((jz5.n) this.f154077x).getValue());
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = new com.google.android.flexbox.FlexboxLayoutManager(getActivity(), 0, 1);
        flexboxLayoutManager.D(0);
        wxRecyclerView2.setLayoutManager(flexboxLayoutManager);
        com.tencent.mm.contact.o U6 = U6();
        if (U6 != null) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ModProfile.ModImageDescriptionUI", getActivity(), 0, 4, null);
            com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.t tVar = new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.t(h0Var, h0Var2, this);
            com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w wVar = new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w(h0Var2, h0Var, this, wxRecyclerView2);
            java.lang.String str2 = "MicroMsg.ProfileUtilsKt";
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "contact: " + U6);
            yq3.v vVar = (yq3.v) U6;
            java.lang.String h17 = vVar.h();
            if (h17 != null) {
                e06.k kVar = new e06.k(0, 2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                kz5.x0 it6 = kVar.iterator();
                while (((e06.j) it6).f246214f) {
                    int b17 = it6.b();
                    i21.q h18 = i21.q.h();
                    java.lang.String c17 = h18 != null ? h18.c(h17, b17) : null;
                    if (c17 != null) {
                        arrayList.add(c17);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    java.lang.Object next = it7.next();
                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a((java.lang.String) next);
                    java.lang.String str3 = a17.f213279f;
                    if (str3 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, z17, z17);
                        if (!str3.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                    if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                        arrayList2.add(next);
                    }
                    z17 = false;
                }
                f06.v[] vVarArr = yq3.v.f464529z;
                r45.o80 o80Var = (r45.o80) vVar.f464553x.a(vVar, vVarArr[5]);
                java.util.List list = o80Var != null ? o80Var.f382018d : null;
                if (list == null) {
                    list = kz5.p0.f313996d;
                }
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
                if (vVar.k()) {
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(list.size());
                    java.util.Iterator it8 = list.iterator();
                    boolean z18 = false;
                    int i18 = 0;
                    while (it8.hasNext()) {
                        java.lang.Object next2 = it8.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.c5 c5Var = (r45.c5) next2;
                        if (c5Var != null) {
                            i21.q h19 = i21.q.h();
                            java.lang.String d17 = h19 != null ? h19.d(h17, c5Var.f371292d) : null;
                            if (d17 != null) {
                                com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(d17);
                                java.lang.String str4 = a18.f213279f;
                                if (str4 != null) {
                                    it = it8;
                                    i17 = i19;
                                    java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
                                    if (str4.equals(l18)) {
                                        wxRecyclerView = wxRecyclerView2;
                                        str = str2;
                                    } else {
                                        wxRecyclerView = wxRecyclerView2;
                                        str = str2;
                                        a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                                    }
                                } else {
                                    wxRecyclerView = wxRecyclerView2;
                                    it = it8;
                                    str = str2;
                                    i17 = i19;
                                }
                                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                                if (!m18.a() ? false : m18.f213266a.F(m18.f213267b)) {
                                    i21.q h27 = i21.q.h();
                                    java.lang.String e17 = h27 != null ? h27.e(h17, c5Var.f371292d) : null;
                                    mr3.l lVar = e17 == null ? null : new mr3.l(e17, h17, c5Var.f371292d, c5Var.f371293e, null, 0, 0, 112, null);
                                    if (lVar != null) {
                                        copyOnWriteArrayList.add(lVar);
                                    }
                                    atomicInteger.decrementAndGet();
                                    str2 = str;
                                    com.tencent.mars.xlog.Log.i(str2, "use local cache: " + i18 + ", " + d17 + ", downloading: " + atomicInteger.get());
                                } else {
                                    if (!z18) {
                                        tVar.invoke();
                                        z18 = true;
                                    }
                                    v65.i.b(lifecycleScope, null, new i21.e(h17, c5Var, i18, new com.tencent.mm.plugin.profile.c2(d17, atomicInteger, h17, c5Var, copyOnWriteArrayList, wVar), null), 1, null);
                                    str2 = str;
                                }
                                i18 = i17;
                                it8 = it;
                                wxRecyclerView2 = wxRecyclerView;
                            }
                        }
                        wxRecyclerView = wxRecyclerView2;
                        it = it8;
                        i17 = i19;
                        i18 = i17;
                        it8 = it;
                        wxRecyclerView2 = wxRecyclerView;
                    }
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = wxRecyclerView2;
                    if (atomicInteger.get() > 0) {
                        return wxRecyclerView3;
                    }
                    com.tencent.mars.xlog.Log.i(str2, "onSuccess with local cache, " + copyOnWriteArrayList);
                    wVar.invoke(copyOnWriteArrayList);
                    return wxRecyclerView3;
                }
                java.util.ArrayList a19 = com.tencent.mm.contact.b.a((java.lang.String) vVar.f464552w.a(vVar, vVarArr[4]));
                java.util.Collection collection = arrayList2;
                if (a19 != null) {
                    collection = kz5.n0.V(a19);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it9 = collection.iterator();
                while (it9.hasNext()) {
                    mr3.l a27 = mr3.l.f330874n.a(h17, (java.lang.String) it9.next(), 0);
                    if (a27 != null) {
                        arrayList3.add(a27);
                    }
                }
                copyOnWriteArrayList.addAll(arrayList3);
                wVar.invoke(copyOnWriteArrayList);
            }
        }
        return wxRecyclerView2;
    }

    @Override // kr3.t
    public void d7() {
        super.d7();
        if (((java.util.ArrayList) this.f154072s).size() < this.f154075v || X6()) {
            android.widget.TextView textView = this.f311478f;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            android.widget.TextView textView2 = this.f311478f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList.r(((xm3.t0) ((jz5.n) this.f154077x).getValue()).I, null, 1, null);
    }

    @Override // kr3.t
    public void e7() {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.List list = ((kr3.q1) pf5.z.f353948a.a(activity).a(kr3.q1.class)).f311456m ? this.f154072s : this.f154071r;
        i21.q h17 = i21.q.h();
        java.lang.String f17 = h17 != null ? h17.f(getUsername()) : null;
        if (f17 != null) {
            i21.q h18 = i21.q.h();
            java.lang.String a17 = h18 != null ? h18.a(getUsername()) : null;
            if (a17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModImageDescriptionUI", "saved images desc file: " + kz5.n0.g0(list, null, null, null, 0, null, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.p.f154111d, 31, null) + ", prefix: " + f17 + ", remarkDir: " + a17);
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(a17));
                if (r6Var.m() && r6Var.y() && (s17 = com.tencent.mm.vfs.w6.s(a17, true)) != null) {
                    for (com.tencent.mm.vfs.x1 x1Var : s17) {
                        if (x1Var != null) {
                            java.lang.String name = x1Var.f213232b;
                            kotlin.jvm.internal.o.f(name, "name");
                            boolean z17 = false;
                            if (r26.i0.y(name, f17, false)) {
                                if (!list.isEmpty()) {
                                    java.util.Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (kotlin.jvm.internal.o.b(((mr3.l) it.next()).f330875d, name)) {
                                                z17 = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                if (!z17) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModImageDescriptionUI", "delete useless file: ".concat(name));
                                    x1Var.a();
                                }
                            }
                        }
                    }
                }
            }
        }
        super.e7();
    }

    @Override // kr3.t
    public void f7(com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct struct) {
        int i17;
        kotlin.jvm.internal.o.g(struct, "struct");
        java.util.List list = this.f154072s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            mr3.l lVar = (mr3.l) it.next();
            java.lang.Integer valueOf = (lVar.f330880i != 0 || (i17 = lVar.f330881m) == 0) ? null : java.lang.Integer.valueOf(i17);
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        struct.f59981t = struct.b("descPicSource", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null), true);
        struct.f59982u = this.f154078y;
        struct.f59983v = this.f154079z;
    }

    @Override // kr3.t
    public java.lang.Long g7() {
        return java.lang.Long.valueOf(X6() ? 0L : -6L);
    }

    @Override // kr3.t
    public int i7() {
        return 42;
    }

    @Override // kr3.t
    public int k7() {
        return com.tencent.mm.R.string.f490967nb4;
    }

    public final mr3.n m7() {
        return (mr3.n) ((jz5.n) this.f154073t).getValue();
    }

    public final vg3.c n7(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((mr3.l) next).f330880i != 1) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (((mr3.l) obj).f330880i != 1) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.String str = ((mr3.l) it6.next()).f330877f;
            if (str != null) {
                arrayList3.add(str);
            }
        }
        java.util.Set X0 = kz5.n0.X0(arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            java.lang.String str2 = ((mr3.l) it7.next()).f330877f;
            if (str2 != null) {
                arrayList4.add(str2);
            }
        }
        java.util.Set X02 = kz5.n0.X0(arrayList4);
        java.util.Set g17 = kz5.q1.g(X0, X02);
        java.util.Set g18 = kz5.q1.g(X02, X0);
        return ((g17.isEmpty() ^ true) && g18.isEmpty()) ? vg3.c.H : ((g18.isEmpty() ^ true) && g17.isEmpty()) ? vg3.c.G : ((g17.isEmpty() ^ true) && (g18.isEmpty() ^ true)) ? vg3.c.H : vg3.c.H;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModImageDescriptionUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String username = getUsername();
        if (username == null) {
            return;
        }
        if (i17 == 100) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(activity, intent, a17);
            if (b17 == null) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity2);
            e4Var.d(com.tencent.mm.R.string.f490955nb1);
            e4Var.f211780g = 2;
            e4Var.f211779f = false;
            kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.e0(username, b17, this, e4Var.c(), null), 3, null);
            return;
        }
        if (i17 == 200) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ModProfile.ModImageDescriptionUI", "data shouldnot be null");
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(activity3);
            e4Var2.d(com.tencent.mm.R.string.f490955nb1);
            e4Var2.f211780g = 2;
            e4Var2.f211779f = false;
            kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.f0(intent, this, e4Var2.c(), null), 3, null);
            return;
        }
        if (i17 != 400) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ModProfile.ModImageDescriptionUI", "data shouldnot be null");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("remark_image_path");
        if (stringArrayListExtra != null) {
            java.util.List list = this.f154072s;
            int size = ((java.util.ArrayList) list).size();
            ((java.util.ArrayList) list).removeIf(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g0(stringArrayListExtra));
            this.f154079z += size - ((java.util.ArrayList) list).size();
            d7();
        }
    }

    @Override // kr3.t, com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        if (X6()) {
            return false;
        }
        return Z6();
    }
}
