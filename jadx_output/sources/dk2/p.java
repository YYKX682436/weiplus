package dk2;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: n, reason: collision with root package name */
    public static final dk2.n f233871n = new dk2.n(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f233872a;

    /* renamed from: b, reason: collision with root package name */
    public final int f233873b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f233874c;

    /* renamed from: d, reason: collision with root package name */
    public int f233875d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f233876e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f233877f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f233878g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f233879h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f233880i;

    /* renamed from: j, reason: collision with root package name */
    public int f233881j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f233882k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f233883l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f233884m;

    public p() {
        ae2.in inVar = ae2.in.f3688a;
        this.f233872a = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Q0).getValue()).r()).intValue();
        this.f233873b = 50;
        this.f233874c = kz5.p0.f313996d;
        this.f233875d = -1;
        this.f233876e = new java.util.ArrayList();
        this.f233877f = new java.util.ArrayList();
        this.f233878g = new java.util.ArrayList();
        this.f233879h = "";
        r45.xg7 xg7Var = r45.xg7.emFinderLiveGetMusicTabListType_FinderMusic;
        jz5.l lVar = new jz5.l(xg7Var, 0);
        r45.xg7 xg7Var2 = r45.xg7.emFinderLiveGetMusicTabListType_Recommend;
        jz5.l lVar2 = new jz5.l(xg7Var2, 0);
        r45.xg7 xg7Var3 = r45.xg7.emFinderLiveGetMusicTabListType_Like;
        this.f233882k = kz5.c1.l(lVar, lVar2, new jz5.l(xg7Var3, 0));
        this.f233883l = kz5.c1.l(new jz5.l(xg7Var, null), new jz5.l(xg7Var2, null), new jz5.l(xg7Var3, null));
        this.f233884m = kz5.c1.k(new jz5.l(xg7Var, new java.util.ArrayList()), new jz5.l(xg7Var2, new java.util.ArrayList()), new jz5.l(xg7Var3, new java.util.ArrayList()));
    }

    public final void a(dk2.vg item, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        java.util.ArrayList arrayList = this.f233877f;
        r45.d22 d22Var = item.f234254a;
        if (z17) {
            arrayList.add(0, item);
            java.util.List list = this.f233876e;
            r45.rm1 rm1Var = new r45.rm1();
            rm1Var.set(0, java.lang.Integer.valueOf(d22Var.getInteger(0)));
            rm1Var.set(1, d22Var.getString(9));
            rm1Var.set(2, java.lang.Integer.valueOf(d22Var.getInteger(10)));
            list.add(0, rm1Var);
        } else {
            arrayList.add(item);
            java.util.List list2 = this.f233876e;
            r45.rm1 rm1Var2 = new r45.rm1();
            rm1Var2.set(0, java.lang.Integer.valueOf(d22Var.getInteger(0)));
            rm1Var2.set(1, d22Var.getString(9));
            rm1Var2.set(2, java.lang.Integer.valueOf(d22Var.getInteger(10)));
            list2.add(rm1Var2);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "addMusicItem " + item + ", songId size:" + this.f233876e.size() + ", musicList id size:" + arrayList.size() + ", curPlayPos:" + this.f233875d);
    }

    public final jz5.l b(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        int i17 = 0;
        for (java.lang.Object obj : this.f233877f) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            dk2.vg vgVar = (dk2.vg) obj;
            if ((id6.length() > 0) && kotlin.jvm.internal.o.b(dk2.q.e(vgVar.f234254a), id6)) {
                return new jz5.l(vgVar, java.lang.Integer.valueOf(i17));
            }
            i17 = i18;
        }
        return new jz5.l(null, -1);
    }

    public final jz5.l c(dk2.vg musicItem, int i17) {
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        k(musicItem, i17);
        java.util.ArrayList arrayList = this.f233877f;
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicData", "musicList is empty!");
            return new jz5.l(null, -1);
        }
        int i18 = i17 + 1;
        int i19 = i18 < arrayList.size() ? i18 : 0;
        java.lang.Object obj = arrayList.get(i19);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dk2.vg vgVar = (dk2.vg) obj;
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "songId size:" + this.f233876e.size() + ", musicList id size:" + arrayList.size() + ", findNextMusicItem pos:" + i17 + ", nextPos:" + i19 + ", curPlayPos:" + this.f233875d + ",nextMusicItem:" + vgVar);
        return new jz5.l(vgVar, java.lang.Integer.valueOf(i19));
    }

    public final dk2.vg d() {
        int i17 = this.f233875d;
        if (i17 < 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.f233877f;
        if (i17 < arrayList.size()) {
            return (dk2.vg) arrayList.get(this.f233875d);
        }
        return null;
    }

    public final java.lang.String e() {
        int i17 = this.f233875d;
        if (i17 < 0 || i17 >= this.f233876e.size()) {
            return "0";
        }
        r45.rm1 rm1Var = (r45.rm1) this.f233876e.get(this.f233875d);
        kotlin.jvm.internal.o.g(rm1Var, "<this>");
        boolean z17 = true;
        java.lang.String string = rm1Var.getString(1);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            string = java.lang.String.valueOf(rm1Var.getInteger(0));
        }
        return string == null ? "" : string;
    }

    public final r45.xl1 f() {
        r45.xl1 xl1Var = new r45.xl1();
        xl1Var.set(1, new java.util.LinkedList(this.f233876e));
        return xl1Var;
    }

    public final java.util.LinkedList g(boolean z17) {
        int i17;
        int size = this.f233876e.size();
        int size2 = this.f233877f.size();
        int i18 = size - size2;
        if (i18 <= 0) {
            return new java.util.LinkedList();
        }
        if (!z17 && (i17 = this.f233873b) <= i18) {
            i18 = i17;
        }
        return new java.util.LinkedList(this.f233876e.subList(size2, i18 + size2));
    }

    public final boolean h(r45.d22 d22Var) {
        java.lang.Object obj;
        java.util.Iterator it = this.f233876e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (dk2.q.c(d22Var, (r45.rm1) obj)) {
                break;
            }
        }
        return obj != null;
    }

    public final void i(dk2.vg item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        if (item.f234255b == 1) {
            item.f234255b = 2;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "pauseMusicItem " + item + " songId size:" + this.f233876e.size() + ", musicList id size:" + this.f233877f.size() + ", pos:" + i17 + ", curPlayPos:" + this.f233875d);
    }

    public final void j(dk2.vg item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        try {
            dk2.vg d17 = d();
            java.util.ArrayList arrayList = this.f233877f;
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            dk2.vg vgVar = (dk2.vg) obj;
            if (dk2.q.d(vgVar.f234254a, item.f234254a)) {
                if (d17 != null) {
                    d17.f234255b = 0;
                }
                vgVar.f234255b = 1;
                this.f233875d = i17;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "playMusicItem item:" + item + " songId size:" + this.f233876e.size() + ", musicList id size:" + arrayList.size() + ", pos:" + i17 + " oriMusicItem:" + d17 + " newMusicItem:" + vgVar + ", curPlayPos:" + this.f233875d);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveAnchorMusicData playMusicItem");
        }
    }

    public final void k(dk2.vg vgVar, int i17) {
        if (vgVar != null) {
            vgVar.f234255b = 0;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "resetMusicItem " + vgVar + " songId size:" + this.f233876e.size() + ", musicList id size:" + this.f233877f.size() + ", pos:" + i17 + ", curPlayPos:" + this.f233875d);
    }

    public final void l(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("savePrepareSongIdList size:");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", curPlayPos:");
        sb6.append(this.f233875d);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", sb6.toString());
        if (list == null) {
            return;
        }
        this.f233874c = list;
    }

    public final void m(r45.gm1 resp) {
        java.util.ArrayList arrayList;
        boolean z17;
        dk2.vg vgVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        try {
            java.util.LinkedList<r45.d22> list = resp.getList(1);
            if (list != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (r45.d22 d22Var : list) {
                    kotlin.jvm.internal.o.d(d22Var);
                    arrayList.add(new dk2.vg(d22Var, 0, 0, 0, false, 0L, 56, null));
                }
            } else {
                arrayList = null;
            }
            r45.d22 d22Var2 = (arrayList == null || (vgVar = (dk2.vg) kz5.n0.Z(arrayList)) == null) ? null : vgVar.f234254a;
            java.lang.String e17 = e();
            java.util.ArrayList arrayList2 = this.f233877f;
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (dk2.q.d(((dk2.vg) it.next()).f234254a, d22Var2)) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (!z17 && arrayList != null) {
                arrayList2.addAll(arrayList);
                java.util.ArrayList<dk2.vg> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList2) {
                    if (dk2.q.f(((dk2.vg) obj).f234254a)) {
                        arrayList3.add(obj);
                    }
                }
                for (dk2.vg vgVar2 : arrayList3) {
                    qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
                    java.lang.String string = vgVar2.f234254a.getString(9);
                    if (string == null) {
                        string = "";
                    }
                    ((ef0.l4) i9Var).wi(string, true, false, new dk2.o(vgVar2));
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("updateMusicInfo respMusicInfo.first songId:");
            sb6.append(d22Var2);
            sb6.append(", cur songId:");
            sb6.append(e17);
            sb6.append(", songIdExist:");
            sb6.append(z17);
            sb6.append(", curPlayPos:");
            sb6.append(this.f233875d);
            sb6.append(", size:");
            java.util.List list2 = this.f233876e;
            sb6.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", sb6.toString());
            f233871n.a(arrayList2, "updateMusicInfo", false);
        } catch (java.lang.Exception e18) {
            pm0.z.b(xy2.b.f458155b, "updateMusicInfo", false, null, null, false, false, null, 124, null);
            hc2.c.a(e18, "FinderLiveAnchorMusicData updateMusicInfo");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r20, r45.u82 r21) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.p.n(java.lang.String, r45.u82):void");
    }
}
