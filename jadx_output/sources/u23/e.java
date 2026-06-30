package u23;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f424045b;

    /* renamed from: j, reason: collision with root package name */
    public boolean f424053j;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f424044a = "MicroMsg.MediaLoaderCore[" + hashCode() + ']';

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f424046c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f424047d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f424048e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f424049f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final u23.h0 f424050g = new u23.h0();

    /* renamed from: h, reason: collision with root package name */
    public final u23.h0 f424051h = new u23.h0();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f424052i = new java.util.LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(u23.e r15, u23.n r16, u23.e0 r17, u23.k r18, long r19) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u23.e.a(u23.e, u23.n, u23.e0, u23.k, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0500, code lost:
    
        if (r8 == 500) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0507 A[Catch: all -> 0x0555, TryCatch #8 {all -> 0x0555, blocks: (B:207:0x048b, B:152:0x04c9, B:155:0x04cf, B:158:0x04d5, B:163:0x0507, B:165:0x0549), top: B:206:0x048b }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0549 A[Catch: all -> 0x0555, TRY_LEAVE, TryCatch #8 {all -> 0x0555, blocks: (B:207:0x048b, B:152:0x04c9, B:155:0x04cf, B:158:0x04d5, B:163:0x0507, B:165:0x0549), top: B:206:0x048b }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05a9 A[EDGE_INSN: B:170:0x05a9->B:171:0x05a9 BREAK  A[LOOP:0: B:42:0x0198->B:106:0x0583], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x048b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0 A[Catch: all -> 0x05a0, TryCatch #0 {all -> 0x05a0, blocks: (B:46:0x01a0, B:48:0x01bb, B:54:0x01d3, B:59:0x01e0, B:62:0x01fe, B:70:0x022d, B:78:0x026b, B:82:0x027e, B:257:0x0279), top: B:45:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d8 A[Catch: all -> 0x02fb, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x02fb, blocks: (B:248:0x0289, B:250:0x0291, B:86:0x02a2, B:89:0x02ab, B:91:0x02b6, B:93:0x02c1, B:94:0x02c7, B:96:0x02d8), top: B:247:0x0289 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(u23.e r51, u23.n r52, u23.s r53) {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u23.e.b(u23.e, u23.n, u23.s):void");
    }

    public final void c(u23.n nVar, java.util.List list, java.util.List list2) {
        com.tencent.mars.xlog.Log.i(this.f424044a, "checkMediaListExist:mediaList size=" + list.size() + ", deletedSet size=" + list2.size());
        java.lang.System.currentTimeMillis();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (nVar.f424101e) {
                return;
            }
            if (!u23.f0.f424074a.a(galleryItem$MediaItem)) {
                list2.add(galleryItem$MediaItem);
                long j17 = galleryItem$MediaItem.f138434i;
                ((java.util.HashSet) this.f424046c).add(java.lang.Long.valueOf(j17));
                this.f424047d.remove(java.lang.Long.valueOf(j17));
            }
        }
    }

    public final void d(java.util.List list, java.util.List list2, u23.e0 e0Var) {
        if (list2.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (galleryItem$MediaItem.getType() == 1) {
                arrayList.add(java.lang.Long.valueOf(galleryItem$MediaItem.f138434i));
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        java.util.Map map = this.f424047d;
        if (isEmpty) {
            list.addAll(list2);
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next();
                map.put(java.lang.Long.valueOf(galleryItem$MediaItem2.f138434i), galleryItem$MediaItem2);
            }
            list2.clear();
            return;
        }
        java.lang.String str = "checkToBatchGetIsLivePhotoTag >> start resultSize: " + list.size() + " mediaSize: " + list2.size() + "  imgSize: " + arrayList.size() + " livePhotoOnly: " + e0Var.f424072m;
        java.lang.String str2 = this.f424044a;
        com.tencent.mars.xlog.Log.i(str2, str);
        java.util.HashMap Bi = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Bi(arrayList);
        java.util.ListIterator listIterator = list2.listIterator();
        while (listIterator.hasNext()) {
            listIterator.nextIndex();
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem3 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) listIterator.next();
            if (galleryItem$MediaItem3.getType() == 1) {
                if (Bi.containsKey(java.lang.Long.valueOf(galleryItem$MediaItem3.f138434i)) && kotlin.jvm.internal.o.b(Bi.get(java.lang.Long.valueOf(galleryItem$MediaItem3.f138434i)), java.lang.Boolean.TRUE)) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.a(6, galleryItem$MediaItem3.f138434i);
                    a17.f138443u = galleryItem$MediaItem3.f138443u;
                    a17.f138435m = galleryItem$MediaItem3.f138435m;
                    a17.f138430e = ((hs.x) ((qk.s7) i95.n0.c(qk.s7.class))).wi(qk.k9.f364207d, java.lang.String.valueOf(galleryItem$MediaItem3.f138434i));
                    a17.f138433h = galleryItem$MediaItem3.f138430e;
                    a17.f138438p = galleryItem$MediaItem3.f138438p;
                    if (a17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) {
                        ((com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) a17).I = e0Var.f424071l ? 1 : 0;
                    }
                    listIterator.set(a17);
                } else if (e0Var.f424072m) {
                    listIterator.remove();
                }
            }
        }
        list.addAll(list2);
        java.util.Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem4 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it7.next();
            map.put(java.lang.Long.valueOf(galleryItem$MediaItem4.f138434i), galleryItem$MediaItem4);
        }
        list2.clear();
        com.tencent.mars.xlog.Log.i(str2, "checkToBatchGetIsLivePhotoTag >> finish " + list.size());
    }

    public final void e(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i(this.f424044a, str + " cost=" + (android.os.SystemClock.uptimeMillis() - j17) + "ms");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (r10 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0290 A[LOOP:3: B:107:0x028a->B:109:0x0290, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[EDGE_INSN: B:13:0x0082->B:14:0x0082 BREAK  A[LOOP:0: B:2:0x0059->B:147:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[LOOP:0: B:2:0x0059->B:147:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(u23.e0 r38, u23.k r39, java.util.List r40, u23.n r41) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u23.e.f(u23.e0, u23.k, java.util.List, u23.n):java.util.List");
    }
}
