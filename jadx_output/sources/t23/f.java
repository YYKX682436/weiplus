package t23;

/* loaded from: classes10.dex */
public abstract class f implements t23.n1 {

    /* renamed from: d, reason: collision with root package name */
    public int f415141d = 100;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f415142e = {"camera", "screenshots", "download"};

    /* renamed from: f, reason: collision with root package name */
    public boolean f415143f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f415144g = false;

    public static void f(java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long g17 = g(str, currentTimeMillis, i17 == 1, true);
        long g18 = g(str2, currentTimeMillis, i17 == 1, false);
        if (g17 <= 0) {
            g17 = g18;
        }
        galleryItem$MediaItem.f138435m = g17;
        galleryItem$MediaItem.f138437o = g18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Type inference failed for: r23v3, types: [int] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long g(java.lang.String r35, long r36, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.f.g(java.lang.String, long, boolean, boolean):long");
    }

    public com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem c(android.database.Cursor cursor, int i17, java.lang.String str) {
        int i18;
        try {
            long E1 = com.tencent.mm.sdk.platformtools.t8.E1(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
            java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow(str));
            java.lang.String string3 = cursor.getString(cursor.getColumnIndexOrThrow("date_modified"));
            java.lang.String string4 = cursor.getString(cursor.getColumnIndexOrThrow("datetaken"));
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseMediaQuery", "null or nil album name, ignore this folder");
                return null;
            }
            if (!j33.d0.q()) {
                int i19 = cursor.getInt(3);
                if (i19 != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    i18 = i19;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseMediaQuery", "query album failed, " + i19 + ", " + string);
                return null;
            }
            i18 = 0;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(i17, E1, com.tencent.mm.sdk.platformtools.t8.K0(string) ? null : string, null, cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
            f(string3, string4, i17, b17);
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem(string2, i18);
            galleryItem$AlbumItem.f138420i = b17;
            galleryItem$AlbumItem.r(cursor.getString(cursor.getColumnIndexOrThrow("bucket_id")));
            galleryItem$AlbumItem.f138419h = 0;
            galleryItem$AlbumItem.f138423o = j33.d0.q();
            return galleryItem$AlbumItem;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseMediaQuery", th6, "#albumConvertFrom failed", new java.lang.Object[0]);
            return null;
        }
    }

    public boolean d(t23.m1 m1Var, java.util.LinkedList linkedList, long j17, boolean z17) {
        if (!this.f415143f) {
            if (z17) {
                this.f415141d = 200;
            } else {
                this.f415141d = 5000;
            }
        }
        if (m1Var == null || linkedList.size() % this.f415141d != 0) {
            return false;
        }
        m1Var.u5(linkedList, j17, z17);
        return true;
    }

    public final void e(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = null;
        int i17 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) it.next();
            if (!galleryItem$AlbumItem.f138423o) {
                i17 += galleryItem$AlbumItem.f138417f;
            }
            if (galleryItem$MediaItem == null) {
                galleryItem$MediaItem = galleryItem$AlbumItem.f138420i;
            }
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem("", i17);
        galleryItem$AlbumItem2.f138421m = true;
        if (galleryItem$MediaItem != null) {
            galleryItem$AlbumItem2.f138420i = galleryItem$MediaItem;
        } else {
            galleryItem$AlbumItem2.f138420i = new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem();
        }
        linkedList.add(0, galleryItem$AlbumItem2);
    }

    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem h(android.database.Cursor cursor, int i17) {
        if (cursor != null && !cursor.isAfterLast() && !cursor.isClosed()) {
            while (!cursor.isAfterLast()) {
                try {
                    if (cursor.getColumnIndexOrThrow("_id") >= 0) {
                        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
                        java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow("date_modified"));
                        java.lang.String string3 = cursor.getString(cursor.getColumnIndexOrThrow("datetaken"));
                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.a(i17, E1);
                        a17.f138430e = string;
                        f(string2, string3, i17, a17);
                        int i18 = o45.wf.f343023a;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f138430e) || !com.tencent.mm.sdk.platformtools.t8.K0(a17.f138433h)) {
                            java.lang.String string4 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
                            if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                                string4 = "";
                            }
                            a17.f138438p = string4;
                            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("latitude");
                            if (cursor.getType(columnIndexOrThrow) != 0) {
                                double d17 = cursor.getDouble(columnIndexOrThrow);
                                if (i11.b.a(d17)) {
                                    a17.f138440r = d17;
                                }
                            }
                            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("longitude");
                            if (cursor.getType(columnIndexOrThrow2) != 0) {
                                double d18 = cursor.getDouble(columnIndexOrThrow2);
                                if (i11.b.b(d18)) {
                                    a17.f138439q = d18;
                                }
                            }
                            boolean z17 = i17 == 2;
                            if (i() && z17 && (a17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem)) {
                                java.lang.String string5 = cursor.getString(cursor.getColumnIndexOrThrow("duration"));
                                ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) a17).E = java.lang.Integer.parseInt(com.tencent.mm.sdk.platformtools.t8.K0(string5) ? "-1" : string5);
                            }
                            return a17;
                        }
                        com.tencent.mars.xlog.Log.w("MicroMsg.BaseMediaQuery", "thumb file and original file both not exist");
                        cursor.moveToNext();
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseMediaQuery", th6, "", new java.lang.Object[0]);
                }
            }
            return null;
        }
        return null;
    }

    public abstract boolean i();
}
