package lf4;

/* loaded from: classes4.dex */
public class b0 extends lf4.l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final lf4.h f318355e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f318356f;

    /* renamed from: g, reason: collision with root package name */
    public final int f318357g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f318358h;

    /* renamed from: i, reason: collision with root package name */
    public final int f318359i;

    /* renamed from: m, reason: collision with root package name */
    public final int f318360m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f318361n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f318362o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f318363p;

    /* renamed from: q, reason: collision with root package name */
    public int f318364q;

    /* renamed from: r, reason: collision with root package name */
    public int f318365r;

    /* renamed from: s, reason: collision with root package name */
    public int f318366s;

    /* renamed from: t, reason: collision with root package name */
    public int f318367t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f318368u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f318369v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f318370w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f318371x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.r f318372y;

    public /* synthetic */ b0(java.util.List list, java.lang.String str, lf4.h hVar, java.util.Map map, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(list, str, hVar, (i18 & 8) != 0 ? new java.util.HashMap() : map, (i18 & 16) != 0 ? 0 : i17);
    }

    @Override // lf4.l
    public void b(int i17) {
        java.util.List userList = this.f318361n;
        kotlin.jvm.internal.o.f(userList, "userList");
        lf4.m mVar = (lf4.m) kz5.n0.a0(userList, i17);
        if (mVar != null) {
            p(mVar);
        }
        kotlin.jvm.internal.o.f(userList, "userList");
        lf4.m mVar2 = (lf4.m) kz5.n0.a0(userList, this.f318359i + i17);
        kotlin.jvm.internal.o.f(userList, "userList");
        pm0.v.L("MultiUserGalleryPresenter_checkLoadMore", true, new lf4.n(mVar2, (lf4.m) kz5.n0.a0(userList, i17 + this.f318360m), this));
    }

    @Override // lf4.l
    public void c(int i17, int i18) {
    }

    @Override // lf4.l
    public void d() {
        gm0.j1.n().f273288b.q(bd1.f.CTRL_INDEX, this);
        gf4.l.f271354d.j(this.f318372y);
    }

    @Override // lf4.l
    public void e(int i17) {
        this.f318367t = i17;
    }

    @Override // lf4.l
    public void f() {
        java.util.List list = this.f318361n;
        int size = list.size() <= 3 ? list.size() : 3;
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = list.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            p((lf4.m) obj);
        }
        if (list.size() > 0) {
            this.f318362o.add(list.get(0));
            n();
        }
    }

    @Override // lf4.l
    public void g(int i17) {
        this.f318366s = i17;
        if (i17 != 1 || this.f318371x) {
            return;
        }
        ef4.w.f252468t.l().post(new lf4.w(this));
    }

    @Override // lf4.l
    public void h(int i17, int i18, boolean z17) {
        if (i17 == 3) {
            if (!z17) {
                ef4.w.f252468t.l().post(new lf4.t(this));
            } else if (i18 == 0) {
                ef4.w.f252468t.l().post(new lf4.y(this));
            } else {
                if (i18 != 1) {
                    return;
                }
                ef4.w.f252468t.l().post(new lf4.t(this));
            }
        }
    }

    @Override // lf4.l
    public void i(int i17, int i18) {
        this.f318364q = i17;
        this.f318365r = i18;
        if (this.f318366s == 1) {
            ef4.w.f252468t.l().post(new lf4.w(this));
        }
    }

    public final void n() {
        if (this.f318363p) {
            return;
        }
        java.util.List list = this.f318362o;
        if (list.size() <= 0) {
            return;
        }
        lf4.m mVar = (lf4.m) list.get(0);
        java.util.List list2 = this.f318361n;
        int indexOf = list2.indexOf(mVar);
        if (!(indexOf >= 0 && indexOf < list2.size()) || mVar.f318439b == 2) {
            list.remove(0);
            n();
            return;
        }
        mVar.f318439b = 2;
        com.tencent.mars.xlog.Log.i(this.f318358h, "LogStory: loadRemoteForUser " + mVar);
        this.f318363p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(lf4.m r8, java.util.ArrayList r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f318361n
            int r1 = r0.indexOf(r8)
            boolean r2 = r9.isEmpty()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1e
            int r2 = r7.f318364q
            int r5 = r2 + (-1)
            int r2 = r2 + r4
            if (r1 > r2) goto L19
            if (r5 > r1) goto L19
            r2 = r4
            goto L1a
        L19:
            r2 = r3
        L1a:
            if (r2 != 0) goto L1e
            r2 = r4
            goto L1f
        L1e:
            r2 = r3
        L1f:
            boolean r5 = r9.isEmpty()
            r5 = r5 ^ r4
            if (r5 != 0) goto L2c
            int r5 = r7.f318366s
            if (r5 != 0) goto L2b
            goto L2c
        L2b:
            r4 = r3
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "notifyUser: selection "
            r5.<init>(r6)
            java.lang.String r6 = "userList"
            kotlin.jvm.internal.o.f(r0, r6)
            java.lang.Object r0 = kz5.n0.a0(r0, r1)
            r5.append(r0)
            r0 = 32
            r5.append(r0)
            r5.append(r1)
            r5.append(r0)
            int r6 = r7.f318364q
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            int r6 = r9.size()
            r5.append(r6)
            r5.append(r0)
            int r6 = r7.f318366s
            r5.append(r6)
            java.lang.String r6 = ", result "
            r5.append(r6)
            r5.append(r2)
            r5.append(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r7.f318358h
            com.tencent.mars.xlog.Log.i(r6, r5)
            java.util.ArrayList r5 = r8.f318440c
            r8.f318440c = r9
            if (r2 == 0) goto La3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "remove user from gallery "
            r9.<init>(r2)
            r9.append(r1)
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.mars.xlog.Log.i(r6, r8)
            lf4.o r8 = new lf4.o
            r8.<init>(r7, r1)
            pm0.v.X(r8)
            return
        La3:
            if (r4 != 0) goto La6
            return
        La6:
            int r8 = r7.f318366s
            if (r8 == 0) goto Lc7
            int r8 = r7.f318364q
            if (r1 == r8) goto Laf
            goto Lc7
        Laf:
            java.lang.String r8 = "oldItems"
            kotlin.jvm.internal.o.g(r5, r8)
            lf4.j r8 = new lf4.j
            r8.<init>(r5, r9)
            androidx.recyclerview.widget.c0 r8 = androidx.recyclerview.widget.h0.a(r8, r3)
            lf4.r r0 = new lf4.r
            r0.<init>(r7, r1, r9, r8)
            pm0.v.X(r0)
            goto Lcf
        Lc7:
            lf4.p r8 = new lf4.p
            r8.<init>(r7, r1, r9)
            pm0.v.X(r8)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf4.b0.o(lf4.m, java.util.ArrayList):void");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        java.util.List list = this.f318362o;
        if (list.size() <= 0) {
            return;
        }
        lf4.m mVar = (lf4.m) list.get(0);
        java.util.List list2 = this.f318361n;
        int indexOf = list2.indexOf(mVar);
        if (!(indexOf >= 0 && indexOf < list2.size())) {
            list.remove(0);
            this.f318363p = false;
            n();
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f318358h, "LogStory: " + i17 + ' ' + i18 + ' ' + str + ", " + indexOf + ' ' + mVar);
    }

    public final void p(lf4.m mVar) {
        if (this.f318361n.indexOf(mVar) < 0) {
            return;
        }
        int i17 = mVar.f318439b;
        java.lang.String str = this.f318358h;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i(str, "LogStory: preloadForUser already preload");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: preloadForUser ");
        sb6.append(mVar);
        sb6.append(' ');
        boolean z17 = this.f318368u;
        sb6.append(z17);
        sb6.append(' ');
        sb6.append(this.f318357g);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        lf4.k kVar = lf4.l.f318436d;
        boolean z18 = this.f318370w;
        java.lang.String str2 = "LogStory: preload add sync item and local item, ";
        boolean z19 = this.f318369v;
        java.lang.String username = mVar.f318438a;
        if (z18) {
            mVar.f318439b = 1;
            int e17 = c01.id.e();
            ef4.n.f252460a.a();
            ef4.v vVar = ef4.w.f252468t;
            int max = java.lang.Math.max(e17 - 86400, (int) (vVar.g().y0(username).field_readTime / 1000));
            mVar.f318441d = max;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (nf4.j jVar : z19 ? vVar.i().W0(username, com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), username), max) : vVar.i().P0(username, com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), username), max, true)) {
                r45.lf6 y07 = jVar.y0();
                r45.oe6 oe6Var = y07.f379432h;
                if (oe6Var != null && oe6Var.f382205e.size() != 0) {
                    arrayList2.add(new if4.f(jVar, jVar.y0(), if4.g.f291250d));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDb story username " + username + ' ' + arrayList2.size() + " content " + ((r45.xe6) y07.f379432h.f382205e.get(0)).f390025h + " and " + ((r45.xe6) y07.f379432h.f382205e.get(0)).f390023f + " id:" + jVar.field_storyID + " storyUsername: " + jVar.field_userName + " tryCount:" + jVar.v0().f391018e + " flag:" + jVar.field_localFlag);
                    str2 = str2;
                }
            }
            java.lang.String str3 = str2;
            if (!arrayList2.isEmpty()) {
                com.tencent.mars.xlog.Log.i(str, str3 + arrayList2.size());
                arrayList.addAll(arrayList2);
            }
        } else if (z17) {
            mVar.f318439b = 2;
            ef4.v vVar2 = ef4.w.f252468t;
            boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(username, vVar2.e());
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f318356f.get(username);
            kotlin.jvm.internal.o.g(username, "username");
            pm0.c cVar = new pm0.c("getGalleryItemsFromDbByStoryId");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            nf4.l i18 = vVar2.i();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.String str4 = "select *,rowid from MMStoryInfo " + i18.y0(username, D0);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str4);
            java.lang.String str5 = nf4.l.f336859n;
            if (!D0) {
                str5 = " AND " + nf4.l.f336860o + str5;
            }
            sb7.append(str5);
            android.database.Cursor f17 = i18.f336872h.f(sb7.toString(), null, 2);
            while (f17.moveToNext()) {
                nf4.j jVar2 = new nf4.j();
                jVar2.convertFrom(f17);
                arrayList5.add(jVar2);
            }
            f17.close();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (arrayList3 != null ? arrayList3.contains(java.lang.Long.valueOf(((nf4.j) next).field_storyID)) : true) {
                    arrayList6.add(next);
                }
            }
            java.util.Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                nf4.j jVar3 = (nf4.j) it6.next();
                r45.lf6 y08 = jVar3.y0();
                r45.oe6 oe6Var2 = y08.f379432h;
                if (oe6Var2 != null && oe6Var2.f382205e.size() != 0) {
                    arrayList4.add(new if4.f(jVar3, jVar3.y0(), if4.g.f291251e));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDbByStoryId story:" + jVar3 + ", content:" + ((r45.xe6) y08.f379432h.f382205e.get(0)).f390025h + " and " + ((r45.xe6) y08.f379432h.f382205e.get(0)).f390023f + ", id:" + jVar3.field_storyID + ", storyUsername:" + jVar3.field_userName);
                }
            }
            cVar.a();
            if (!arrayList4.isEmpty()) {
                com.tencent.mars.xlog.Log.i(str, "LogStory: preload add sync item and local item, " + arrayList4.size());
                arrayList.addAll(arrayList4);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(ef4.w.f252468t.e(), username)) {
            mVar.f318439b = 1;
            java.util.ArrayList a17 = kVar.a(username, z19);
            if (a17.size() > 0) {
                com.tencent.mars.xlog.Log.i(str, "LogStory: preload add sync item and local item, " + a17.size());
                arrayList.addAll(a17);
            }
        } else {
            mVar.f318439b = 1;
            if4.f c17 = kVar.c(username, z19);
            if (c17 == null) {
                o(mVar, arrayList);
                return;
            }
            java.util.ArrayList a18 = kVar.a(username, z19);
            if (a18.size() > 0) {
                com.tencent.mars.xlog.Log.i(str, "LogStory: preload add sync item and local item, " + a18.size());
                if (((if4.f) a18.get(0)).f291246d != c17.f291246d) {
                    arrayList.add(c17);
                }
                arrayList.addAll(a18);
            } else {
                com.tencent.mars.xlog.Log.i(str, "LogStory: preload add sync item");
                arrayList.add(c17);
            }
        }
        o(mVar, arrayList);
    }

    public b0(java.util.List users, java.lang.String str, lf4.h groupCallback, java.util.Map storyFilterList, int i17) {
        kotlin.jvm.internal.o.g(users, "users");
        kotlin.jvm.internal.o.g(groupCallback, "groupCallback");
        kotlin.jvm.internal.o.g(storyFilterList, "storyFilterList");
        this.f318355e = groupCallback;
        this.f318356f = storyFilterList;
        this.f318357g = i17;
        this.f318358h = "MicroMsg.MultiUserGalleryPresenter";
        this.f318359i = 3;
        this.f318360m = 1;
        this.f318361n = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f318362o = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f318364q = -1;
        this.f318365r = -1;
        this.f318368u = pm0.v.z(i17, 4);
        this.f318369v = pm0.v.z(i17, 1);
        this.f318370w = pm0.v.z(i17, 2);
        this.f318372y = new lf4.a0(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiUserGalleryPresenter", "TimeDiff: local: " + java.lang.System.currentTimeMillis() + ", server: " + c01.id.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chatRoom is ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiUserGalleryPresenter", sb6.toString());
        java.util.Iterator it = users.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i(this.f318358h, "LogStory: " + str2);
            this.f318361n.add(new lf4.m(str2, 0, new java.util.ArrayList(), 0, 8, null));
        }
        ((sf4.a1) this.f318355e).i(this.f318361n.size());
        gm0.j1.n().f273288b.a(bd1.f.CTRL_INDEX, this);
        gf4.l.f271354d.a(this.f318372y);
        this.f318371x = bf4.f.f19715b.f();
    }
}
