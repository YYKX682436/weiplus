package lf4;

/* loaded from: classes4.dex */
public class j1 extends lf4.l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f318418e;

    /* renamed from: f, reason: collision with root package name */
    public final lf4.h f318419f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f318420g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f318421h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f318422i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f318423m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f318424n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318425o;

    /* renamed from: p, reason: collision with root package name */
    public int f318426p;

    /* renamed from: q, reason: collision with root package name */
    public int f318427q;

    /* renamed from: r, reason: collision with root package name */
    public int f318428r;

    /* renamed from: s, reason: collision with root package name */
    public int f318429s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f318430t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f318431u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f318432v;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.r f318433w;

    public j1(java.lang.String username, java.util.List dates, lf4.h galleryUserCallback, java.util.Map storyFilterList, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(dates, "dates");
        kotlin.jvm.internal.o.g(galleryUserCallback, "galleryUserCallback");
        kotlin.jvm.internal.o.g(storyFilterList, "storyFilterList");
        this.f318418e = username;
        this.f318419f = galleryUserCallback;
        this.f318420g = storyFilterList;
        this.f318421h = "MicroMsg.SelfHistoryGalleryPresenter";
        this.f318422i = new java.util.ArrayList();
        this.f318423m = new java.util.ArrayList();
        this.f318424n = new java.util.LinkedList();
        this.f318426p = -1;
        this.f318427q = -1;
        this.f318428r = -1;
        this.f318429s = -1;
        this.f318430t = pm0.v.z(i17, 4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f318431u = arrayList;
        this.f318433w = new lf4.i1(this);
        arrayList.addAll(dates);
        ((sf4.a1) galleryUserCallback).i(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i(this.f318421h, "LogStory: " + str);
            this.f318422i.add(new java.util.ArrayList());
            this.f318423m.add(new lf4.i(str));
        }
        gf4.l.f271354d.a(this.f318433w);
        gm0.j1.n().f273288b.a(764, this);
        gm0.j1.n().f273288b.a(yc1.z.CTRL_INDEX, this);
        this.f318432v = bf4.f.f19715b.f();
    }

    @Override // lf4.l
    public void a(int i17, int i18) {
        this.f318426p = -1;
        this.f318427q = -1;
        gm0.j1.n().f273288b.c(764);
    }

    @Override // lf4.l
    public void b(int i17) {
        ef4.w.f252468t.l().post(new lf4.r0(this, i17));
    }

    @Override // lf4.l
    public void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f318421h, "LogStory: deleteItem " + i17);
        if (i17 < 0 || i17 >= this.f318431u.size() || i18 < 0 || i18 >= ((java.util.ArrayList) this.f318422i.get(i17)).size()) {
            return;
        }
        ef4.w.f252468t.l().post(new lf4.t0(this, i17, i18));
    }

    @Override // lf4.l
    public void d() {
        gf4.l.f271354d.j(this.f318433w);
        gm0.j1.n().f273288b.q(yc1.z.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(764, this);
    }

    @Override // lf4.l
    public void e(int i17) {
    }

    @Override // lf4.l
    public void f() {
        boolean z17;
        java.util.ArrayList arrayList = this.f318431u;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.ArrayList arrayList2 = this.f318423m;
            if (hasNext) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ((lf4.i) arrayList2.get(i17)).f318412a = 1;
                i17 = i18;
            } else {
                java.util.Iterator it6 = arrayList.iterator();
                int i19 = 0;
                while (true) {
                    boolean hasNext2 = it6.hasNext();
                    java.util.ArrayList arrayList3 = this.f318422i;
                    if (!hasNext2) {
                        if (arrayList.size() > 0) {
                            this.f318424n.add(kz5.n0.X(arrayList));
                            n();
                        }
                        int i27 = 0;
                        for (java.lang.Object obj : arrayList) {
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            java.lang.Object obj2 = arrayList.get(i27);
                            kotlin.jvm.internal.o.f(obj2, "get(...)");
                            java.lang.Object obj3 = arrayList3.get(i27);
                            kotlin.jvm.internal.o.f(obj3, "get(...)");
                            o((java.lang.String) obj2, (java.util.List) obj3);
                            i27 = i28;
                        }
                        return;
                    }
                    java.lang.Object next2 = it6.next();
                    int i29 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Object obj4 = arrayList.get(i19);
                    kotlin.jvm.internal.o.f(obj4, "get(...)");
                    java.lang.String str = (java.lang.String) obj4;
                    java.lang.Object obj5 = arrayList3.get(i19);
                    kotlin.jvm.internal.o.f(obj5, "get(...)");
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) obj5;
                    java.lang.Object obj6 = arrayList2.get(i19);
                    kotlin.jvm.internal.o.f(obj6, "get(...)");
                    lf4.i iVar = (lf4.i) obj6;
                    lf4.k kVar = lf4.l.f318436d;
                    boolean z18 = this.f318430t;
                    java.lang.String str2 = this.f318418e;
                    java.lang.String str3 = this.f318421h;
                    if (z18) {
                        java.util.ArrayList b17 = kVar.b(str2, str);
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.util.Iterator it7 = b17.iterator();
                        while (it7.hasNext()) {
                            java.lang.Object next3 = it7.next();
                            if4.f fVar = (if4.f) next3;
                            java.util.ArrayList arrayList6 = (java.util.ArrayList) this.f318420g.get(str);
                            java.util.ArrayList arrayList7 = arrayList4;
                            if (arrayList6 != null ? arrayList6.contains(java.lang.Long.valueOf(fVar.f291246d)) : true) {
                                arrayList5.add(next3);
                            }
                            arrayList4 = arrayList7;
                        }
                        java.util.ArrayList arrayList8 = arrayList4;
                        if (!arrayList5.isEmpty()) {
                            arrayList8.addAll(arrayList5);
                            iVar.f318412a = 2;
                            com.tencent.mars.xlog.Log.i(str3, "LogStory: preload Db with filter data " + arrayList5.size());
                        }
                        z17 = true;
                    } else {
                        nf4.h y07 = ef4.w.f252468t.h().y0(str);
                        int i37 = y07 != null ? y07.field_count : 0;
                        com.tencent.mars.xlog.Log.i(str3, "LogStory: preloadForDate " + str + " historyCount " + i37);
                        java.util.ArrayList b18 = kVar.b(str2, str);
                        if (b18.size() > 0) {
                            arrayList4.addAll(b18);
                            if (b18.size() == i37) {
                                iVar.f318412a = 2;
                                z17 = true;
                            } else {
                                z17 = true;
                                iVar.f318412a = 1;
                            }
                            com.tencent.mars.xlog.Log.i(str3, "LogStory: preload Db data " + b18.size());
                        } else {
                            z17 = true;
                            if (i37 != 0) {
                                iVar.f318412a = 1;
                                com.tencent.mars.xlog.Log.i(str3, "LogStory: initLoad Sync data");
                            }
                        }
                    }
                    i19 = i29;
                }
            }
        }
    }

    @Override // lf4.l
    public void g(int i17) {
    }

    @Override // lf4.l
    public void h(int i17, int i18, boolean z17) {
        if (i17 == 3) {
            if (!z17) {
                ef4.w.f252468t.l().post(new lf4.b1(this));
            } else if (i18 == 0) {
                ef4.w.f252468t.l().post(new lf4.g1(this));
            } else {
                if (i18 != 1) {
                    return;
                }
                ef4.w.f252468t.l().post(new lf4.b1(this));
            }
        }
    }

    @Override // lf4.l
    public void i(int i17, int i18) {
        this.f318428r = i17;
        this.f318429s = i18;
        ef4.w.f252468t.l().post(new lf4.x0(this, i17));
    }

    @Override // lf4.l
    public void j() {
    }

    @Override // lf4.l
    public void k() {
    }

    @Override // lf4.l
    public void l(int i17, int i18, boolean z17, nf4.j jVar) {
        java.lang.String str = this.f318421h;
        com.tencent.mars.xlog.Log.i(str, "LogStory: setFavorite " + i18);
        if (i17 < 0 || i17 >= this.f318431u.size() || i18 < 0) {
            return;
        }
        java.util.ArrayList arrayList = this.f318422i;
        if (i18 < ((java.util.ArrayList) arrayList.get(i17)).size()) {
            boolean z18 = !z17;
            java.lang.Object obj = ((java.util.ArrayList) arrayList.get(i17)).get(i18);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            if4.f fVar = (if4.f) obj;
            com.tencent.mars.xlog.Log.i(str, "LogStory: setFavorite storyinfo " + fVar + " localid " + fVar.f291247e.f291253a + " targetFavorite:" + z18);
            nf4.j J0 = ef4.w.f252468t.i().J0((int) fVar.f291243a.systemRowid);
            if (J0 != null) {
                if (z18) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1045L, 0L, 1L);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1045L, 1L, 1L);
                }
                mf4.d.f(mf4.d.f326160a, z18 ? 1L : 2L, java.lang.String.valueOf(J0.field_storyID), 2L, 0L, 0L, 16, null);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList2.add(java.lang.Long.valueOf(J0.field_storyID));
                arrayList3.add(java.lang.Integer.valueOf((int) J0.systemRowid));
                ef4.e0.f252441a.d(arrayList2, arrayList3, z18);
            }
        }
    }

    @Override // lf4.l
    public void m(int i17, int i18, boolean z17) {
        java.lang.String str = this.f318421h;
        com.tencent.mars.xlog.Log.i(str, "LogStory: setPrivacy row:" + i17 + " column:" + i18);
        if (i17 < 0 || i17 >= this.f318431u.size() || i18 < 0) {
            return;
        }
        java.util.ArrayList arrayList = this.f318422i;
        if (i18 < ((java.util.ArrayList) arrayList.get(i17)).size()) {
            boolean z18 = !z17;
            java.lang.Object obj = ((java.util.ArrayList) arrayList.get(i17)).get(i18);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            if4.f fVar = (if4.f) obj;
            com.tencent.mars.xlog.Log.i(str, "LogStory: setPrivacy storyinfo " + fVar + " targetPrivacy:" + z18);
            nf4.j J0 = ef4.w.f252468t.i().J0((int) fVar.f291243a.systemRowid);
            if (J0 != null) {
                if (z18) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1045L, 2L, 1L);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1045L, 3L, 1L);
                }
                mf4.d.f(mf4.d.f326160a, z18 ? 3L : 4L, java.lang.String.valueOf(J0.field_storyID), 2L, 0L, 0L, 16, null);
                long j17 = J0.field_storyID;
                int i19 = (int) J0.systemRowid;
                boolean z07 = J0.z0();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(i19));
                arrayList2.add(new ff4.q(j17, 4, z18 ? 1 : 0, z07));
                gm0.j1.n().f273288b.g(new ff4.e(arrayList2, arrayList3));
            }
        }
    }

    public final void n() {
        if (this.f318425o) {
            return;
        }
        java.util.LinkedList linkedList = this.f318424n;
        if (linkedList.size() <= 0) {
            return;
        }
        java.lang.Object obj = linkedList.get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        int indexOf = this.f318431u.indexOf(str);
        java.util.ArrayList arrayList = this.f318423m;
        if (indexOf >= 0 && indexOf < arrayList.size()) {
            com.tencent.mars.xlog.Log.i(this.f318421h, "LogStory: loadRemoteForDate ".concat(str));
            if (((lf4.i) arrayList.get(indexOf)).f318412a != 2) {
                gm0.j1.n().f273288b.g(new ff4.c(this.f318418e, 0L, str));
                this.f318425o = true;
            } else {
                linkedList.remove(0);
                n();
            }
        }
    }

    public final void o(java.lang.String str, java.util.List list) {
        int indexOf = this.f318431u.indexOf(str);
        if (list.isEmpty()) {
            pm0.v.X(new lf4.u0(this, indexOf));
        } else {
            pm0.v.X(new lf4.v0(this, indexOf, list));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        ff4.e eVar;
        ff4.a H;
        kotlin.jvm.internal.o.g(scene, "scene");
        java.lang.String str2 = this.f318421h;
        com.tencent.mars.xlog.Log.i(str2, "LogStory: " + i17 + ' ' + i18 + ' ' + str);
        if (scene instanceof ff4.c) {
            java.lang.String str3 = ((ff4.c) scene).f261665d;
            java.lang.String str4 = this.f318418e;
            if (com.tencent.mm.sdk.platformtools.t8.D0(str3, str4)) {
                java.lang.String str5 = (java.lang.String) this.f318424n.poll();
                java.util.ArrayList arrayList = this.f318431u;
                int indexOf = arrayList.indexOf(str5);
                java.util.ArrayList arrayList2 = this.f318423m;
                if (indexOf >= 0 && indexOf < arrayList2.size()) {
                    this.f318425o = false;
                    ((lf4.i) arrayList2.get(indexOf)).f318412a = 2;
                    com.tencent.mars.xlog.Log.i(str2, "LogStory: updateUserGalleryItemsFromDb " + indexOf);
                    java.lang.Object obj = arrayList.get(indexOf);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    java.lang.String str6 = (java.lang.String) obj;
                    java.lang.Object obj2 = this.f318422i.get(indexOf);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) obj2;
                    java.util.ArrayList b17 = lf4.l.f318436d.b(str4, str6);
                    arrayList3.clear();
                    arrayList3.addAll(b17);
                    com.tencent.mars.xlog.Log.i(str2, "LogStory: db data " + str6 + ' ' + arrayList3.size());
                    o(str6, arrayList3);
                    n();
                    return;
                }
                return;
            }
        }
        if (!(scene instanceof ff4.e) || (H = (eVar = (ff4.e) scene).H()) == null) {
            return;
        }
        boolean z17 = H instanceof ff4.p;
        java.util.List list = eVar.f261681e;
        if (z17) {
            if (i18 == 0) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ef4.e0.f252441a.a(((java.lang.Number) it.next()).intValue());
                }
            }
            pm0.v.X(new lf4.w0(i18 == 0, this));
            return;
        }
        if (H instanceof ff4.q) {
            com.tencent.mars.xlog.Log.i(str2, "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:" + i17 + ", errcode:" + i18);
            if (i18 == 0) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    int intValue = ((java.lang.Number) it6.next()).intValue();
                    ff4.q qVar = (ff4.q) H;
                    nf4.l i19 = ef4.w.f252468t.i();
                    nf4.j J0 = i19.J0(intValue);
                    if (J0 != null) {
                        if (qVar.f261710c == 1) {
                            J0.t0(4);
                        } else {
                            J0.A0(4);
                        }
                        i19.replace(J0);
                    }
                }
                ff4.q qVar2 = (ff4.q) H;
                if (qVar2.f261710c == 1 && !qVar2.f261711d) {
                    r2 = true;
                }
                pm0.v.X(new lf4.z0(this, r2));
                return;
            }
            return;
        }
        if (H instanceof ff4.o) {
            if (i18 != 0) {
                if (i18 == 324) {
                    pm0.v.X(new lf4.y0(this, ((ff4.o) H).f261709c == 1, false));
                    return;
                }
                return;
            }
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                int intValue2 = ((java.lang.Number) it7.next()).intValue();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd update story favorite: errType ");
                sb6.append(i17);
                sb6.append(", errcode ");
                sb6.append(i18);
                sb6.append(", localId ");
                sb6.append(intValue2);
                sb6.append(", favorite:");
                int i27 = ((ff4.o) H).f261709c;
                sb6.append(i27);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                nf4.l i28 = ef4.w.f252468t.i();
                nf4.j J02 = i28.J0(intValue2);
                if (J02 != null) {
                    if (i27 == 1) {
                        J02.t0(8);
                        J02.field_favoriteTime = c01.id.e();
                    } else {
                        J02.A0(8);
                        J02.field_favoriteTime = 0;
                    }
                    i28.replace(J02);
                }
            }
            pm0.v.X(new lf4.y0(this, ((ff4.o) H).f261709c == 1, true));
        }
    }
}
