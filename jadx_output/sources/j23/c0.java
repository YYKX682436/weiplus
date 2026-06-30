package j23;

/* loaded from: classes12.dex */
public class c0 extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 16;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351075c = 2;
        eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        int i18 = yVar.f351184b;
        if (i18 == 131075) {
            eVar.f351080h = 4;
        } else if (i18 == 131072) {
            eVar.f351080h = 3;
        } else if (i18 == 262144) {
            eVar.f351080h = 10;
        } else if (i18 == 131076) {
            eVar.f351080h = 5;
            eVar.f351082j = yVar.f351187e;
        } else if (i18 == 2097171) {
            eVar.f351080h = 34;
            eVar.f351082j = yVar.f351187e;
        } else if (i18 == 2097173) {
            eVar.f351080h = 38;
            eVar.f351082j = yVar.f351187e;
        } else if (i18 == 393216) {
            eVar.f351080h = 19;
            x50.i iVar2 = (x50.i) i95.n0.c(x50.i.class);
            java.lang.String str = yVar.f351187e;
            ((w50.k) iVar2).getClass();
            com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo wi6 = ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).wi(str);
            java.lang.String str2 = wi6 != null ? wi6.f76355w : "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                eVar.f351082j = str2;
            }
        } else if (i18 == 589824) {
            eVar.f351080h = 31;
            eVar.f351082j = yVar.f351187e;
        } else if (i18 == 131090) {
            eVar.f351080h = 33;
            eVar.f351082j = yVar.f351187e;
        } else if (i18 == 131089) {
            eVar.f351080h = 33;
            eVar.f351082j = yVar.f351187e;
        } else if (i18 == 655360) {
            eVar.f351080h = 36;
            eVar.f351082j = yVar.f351187e;
        } else {
            if (i18 != 786432) {
                return null;
            }
            eVar.f351080h = 39;
            eVar.f351082j = yVar.f351187e;
        }
        return eVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        com.tencent.mm.plugin.fts.ui.a aVar;
        int i18 = (i17 - iVar.f414565a) - 1;
        u13.g gVar = null;
        if (i18 < iVar.f414570f.size() && i18 >= 0) {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            int i19 = yVar.f351184b;
            int i27 = this.f414560f;
            t13.j jVar = this.f414558d;
            android.content.Context context = this.f414559e;
            if (i19 == 131075) {
                aVar = (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(48, context, jVar, i27);
            } else if (i19 == 131072) {
                aVar = (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(32, context, jVar, i27);
            } else if (i19 == 262144) {
                aVar = (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(64, context, jVar, i27);
            } else if (i19 == 131076) {
                aVar = (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(96, context, jVar, i27);
            } else if (i19 == 2097171) {
                aVar = (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(97, context, jVar, i27);
            } else if (i19 == 2097173) {
                aVar = (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(98, context, jVar, i27);
            } else if (i19 == 393216) {
                aVar = (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(144, context, jVar, i27);
            } else if (i19 == 589824) {
                aVar = (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(133, context, jVar, i27);
                yVar.f351204v = true;
            } else {
                aVar = (i19 == 131089 || i19 == 131090) ? (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(51, context, jVar, i27) : i19 == 655360 ? (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(272, context, jVar, i27) : i19 == 786432 ? (com.tencent.mm.plugin.fts.ui.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(129, context, jVar, i27) : null;
            }
            if (aVar != null) {
                gVar = aVar.p(yVar.f351184b, i17, yVar, iVar);
            }
        }
        if (gVar != null) {
            gVar.f423767j = i18 + 1;
            if (i18 == iVar.f414570f.size() - 1) {
                gVar.f423761d = false;
            }
        }
        return gVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(131072);
        arrayList.add(131075);
        arrayList.add(262144);
        arrayList.add(131076);
        arrayList.add(2097171);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
            arrayList.add(2097173);
        }
        arrayList.add(393216);
        arrayList.add(131090);
        arrayList.add(131089);
        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            arrayList.add(589824);
        }
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f442955d) {
            arrayList.add(655360);
        }
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f442956e) {
            arrayList.add(786432);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
        }
        uVar.f351145g = iArr;
        uVar.f351147i = 3;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        uVar.f351153o = 0;
        uVar.f351148j = hashSet;
        if (this.f138007i.startsWith("@@")) {
            uVar.f351141c = this.f138007i.substring(2);
            return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar);
        }
        uVar.f351141c = this.f138007i;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(1, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        boolean z17;
        java.util.Iterator it = vVar.f351160e.iterator();
        while (it.hasNext()) {
            hashSet.add(((p13.y) it.next()).f351187e);
        }
        if (k(vVar.f351160e)) {
            if (vVar.f351159d.f351130b.getBytes(java.nio.charset.StandardCharsets.UTF_8).length >= 4) {
                java.util.Iterator it6 = vVar.f351160e.iterator();
                z17 = false;
                while (it6.hasNext()) {
                    if (java.lang.String.valueOf(39).equals(((p13.y) it6.next()).f351187e)) {
                        z17 = true;
                    }
                }
            } else {
                z17 = false;
            }
            java.util.List list = this.f138009n;
            if (z17) {
                t13.i iVar = new t13.i();
                iVar.f414569e = -6;
                iVar.f414571g = vVar.f351159d;
                java.util.List list2 = vVar.f351160e;
                iVar.f414570f = list2;
                if (list2.size() > 1) {
                    iVar.f414568d = true;
                    iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 1));
                }
                list.add(iVar);
            } else {
                t13.i iVar2 = new t13.i();
                iVar2.f414569e = -8;
                java.util.List list3 = vVar.f351160e;
                if (k(list3) && list3.size() > 3) {
                    list3 = list3.subList(0, 3);
                }
                iVar2.f414570f = list3;
                iVar2.f414568d = false;
                iVar2.f414571g = vVar.f351159d;
                list.add(iVar2);
            }
        }
        java.util.List<p13.y> list4 = vVar.f351160e;
        java.util.HashMap hashMap = o13.n.f342241a;
        hashMap.clear();
        for (p13.y yVar : list4) {
            java.lang.Object obj = yVar.f351197o;
            if (obj instanceof java.lang.String) {
                hashMap.put(yVar.f351187e, (java.lang.String) obj);
            } else {
                hashMap.put(yVar.f351187e, "");
            }
        }
    }
}
