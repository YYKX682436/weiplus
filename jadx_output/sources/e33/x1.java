package e33;

/* loaded from: classes10.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f247535d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f247536e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f247537f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f247538g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f247539h;

    /* renamed from: i, reason: collision with root package name */
    public int f247540i;

    public x1(e33.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.o2 o2Var;
        java.util.List list;
        java.util.Iterator it;
        int i17;
        java.lang.String str;
        int i18;
        android.net.Uri uri = t23.o2.f415216e;
        t23.o2 o2Var2 = t23.n2.f415209a;
        e33.w1 w1Var = new e33.w1(this);
        java.util.List list2 = this.f247538g;
        int i19 = this.f247540i;
        o2Var2.f415219c = false;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(list2);
        java.lang.String str2 = "MicroMsg.SmartGalleryQueryUtil";
        java.util.List list3 = list2;
        if (L0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "query fav media id list now.");
            com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "query fav media id, type: %d.", java.lang.Integer.valueOf(i19));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (i19 == 1) {
                arrayList2.add(2);
            } else if (i19 == 2) {
                arrayList2.add(4);
            } else if (i19 != 3) {
                arrayList2.add(2);
            } else {
                arrayList2.add(21);
            }
            ((y30.s) ((z30.z) i95.n0.c(z30.z.class))).getClass();
            java.util.List I7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(null, null, arrayList2);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(I7)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "fav list contains img or video.");
                arrayList.addAll(I7);
            }
            boolean L02 = com.tencent.mm.sdk.platformtools.t8.L0(arrayList);
            list3 = arrayList;
            if (L02) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "fav list do not contain img or video.");
                w1Var.u5(linkedList, -1L, true);
                return;
            }
        }
        int size = list3.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "fav count: %d.", java.lang.Integer.valueOf(size));
        int min = java.lang.Math.min(size, 100);
        boolean z17 = true;
        int i27 = min + 0;
        int i28 = 0;
        java.util.List list4 = list3;
        while (!o2Var2.f415219c) {
            com.tencent.mars.xlog.Log.i(str2, "get fav, count: %d.", java.lang.Integer.valueOf(min));
            java.util.List subList = list4.subList(i28, i27);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (com.tencent.mm.sdk.platformtools.t8.L0(subList)) {
                com.tencent.mars.xlog.Log.i(str2, "getFavMediaItemByIds, ids is invalid.");
                o2Var = o2Var2;
                list = list4;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int i29 = 0;
                java.util.List list5 = list4;
                while (true) {
                    o2Var = o2Var2;
                    list = list5;
                    int min2 = java.lang.Math.min(i29 + 20, subList.size());
                    z30.w wVar = (z30.w) i95.n0.c(z30.w.class);
                    java.util.List subList2 = subList.subList(i29, min2);
                    ((y30.u) wVar).getClass();
                    java.util.ArrayList wa6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().wa(subList2, null, null, null, false);
                    if (wa6 != null && wa6.size() > 0) {
                        arrayList4.addAll(wa6);
                    }
                    if (min2 >= subList.size()) {
                        break;
                    }
                    i29 = min2;
                    o2Var2 = o2Var;
                    list5 = list;
                }
                java.util.Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    dm.n3 n3Var = (dm.n3) it6.next();
                    if (n3Var.field_favProto.f370964f.size() != 0) {
                        int size2 = n3Var.field_favProto.f370964f.size() - 1;
                        while (size2 >= 0) {
                            r45.gp0 gp0Var = (r45.gp0) n3Var.field_favProto.f370964f.get(size2);
                            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                            if (com.tencent.mm.vfs.w6.j(o72.x1.x(gp0Var))) {
                                it = it6;
                                if (i19 == 1) {
                                    i17 = i19;
                                    str = str2;
                                    if (gp0Var.I == 2) {
                                        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, -1L, o72.x1.x(gp0Var), "", "image/fav");
                                        b17.f138435m = n3Var.field_updateTime;
                                        arrayList3.add(b17);
                                    }
                                } else if (i19 == 2) {
                                    i17 = i19;
                                    str = str2;
                                    int i37 = gp0Var.I;
                                    if (i37 == 4 || i37 == 15) {
                                        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b18 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, -1L, o72.x1.x(gp0Var), "", "video/fav");
                                        b18.f138435m = n3Var.field_updateTime;
                                        arrayList3.add(b18);
                                    }
                                } else if (i19 == 3) {
                                    int i38 = gp0Var.I;
                                    i17 = i19;
                                    if (i38 != 2) {
                                        i18 = (i38 == 4 || i38 == 15) ? 2 : 2;
                                        str = str2;
                                    }
                                    if (i38 == i18) {
                                        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b19 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, -1L, o72.x1.x(gp0Var), "", "image/fav");
                                        str = str2;
                                        b19.f138435m = n3Var.field_updateTime;
                                        arrayList3.add(b19);
                                    } else {
                                        str = str2;
                                        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b27 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, -1L, o72.x1.x(gp0Var), "", "video/fav");
                                        b27.f138435m = n3Var.field_updateTime;
                                        arrayList3.add(b27);
                                    }
                                }
                                size2--;
                                it6 = it;
                                i19 = i17;
                                str2 = str;
                            } else {
                                it = it6;
                            }
                            i17 = i19;
                            str = str2;
                            size2--;
                            it6 = it;
                            i19 = i17;
                            str2 = str;
                        }
                    }
                }
            }
            int i39 = i19;
            java.lang.String str3 = str2;
            linkedList.addAll(arrayList3);
            w1Var.u5(linkedList, -1L, z17);
            if (z17) {
                z17 = false;
            }
            int size3 = size - linkedList.size();
            if (size3 > 0) {
                int min3 = java.lang.Math.min(size3, 100);
                min = min3;
                i28 = i27;
                i27 += min3;
            }
            if (i27 >= size) {
                return;
            }
            o2Var2 = o2Var;
            list4 = list;
            i19 = i39;
            str2 = str3;
        }
    }
}
