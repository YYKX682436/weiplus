package j33;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final j33.s f297456a = new j33.s();

    /* renamed from: b, reason: collision with root package name */
    public static j33.r f297457b = j33.r.f297452d;

    public final java.lang.String a(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem mediaItem) {
        kotlin.jvm.internal.o.g(mediaItem, "mediaItem");
        if (!(mediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem)) {
            java.lang.String mOriginalPath = mediaItem.f138430e;
            kotlin.jvm.internal.o.f(mOriginalPath, "mOriginalPath");
            return mOriginalPath;
        }
        return mediaItem.f138430e + '_' + ((com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) mediaItem).A;
    }

    public final long b(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem mediaItem) {
        kotlin.jvm.internal.o.g(mediaItem, "mediaItem");
        return mediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem ? ((com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) mediaItem).A == 1 ? com.tencent.mm.vfs.w6.k(mediaItem.f138430e) + com.tencent.mm.vfs.w6.k(mediaItem.f138433h) : com.tencent.mm.vfs.w6.k(mediaItem.f138433h) : com.tencent.mm.vfs.w6.k(mediaItem.f138430e);
    }

    public final com.tencent.mm.plugin.sight.base.b c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new com.tencent.mm.plugin.sight.base.b();
        }
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 == null) {
            d17 = new com.tencent.mm.plugin.sight.base.b();
        }
        if (d17.f162385d <= 0 || d17.f162384c <= 0) {
            try {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                d17.f162384c = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(18), 0);
                d17.f162385d = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(19), 0);
                d17.f162383b = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(20), 0);
                d17.f162382a = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(9), 0);
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused) {
            }
        }
        int mp4RotateVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaUtil", "width %d, height %d, rotate %d", java.lang.Integer.valueOf(d17.f162384c), java.lang.Integer.valueOf(d17.f162385d), java.lang.Integer.valueOf(mp4RotateVFS));
        if (mp4RotateVFS == 90 || mp4RotateVFS == 270) {
            int i17 = d17.f162385d;
            d17.f162385d = d17.f162384c;
            d17.f162384c = i17;
        }
        return d17;
    }

    public final jz5.l d(java.lang.String str) {
        int i17;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        gp.d dVar = new gp.d();
        try {
            dVar.setDataSource(str);
            java.lang.String extractMetadata = dVar.extractMetadata(23);
            dVar.release();
            if (!android.text.TextUtils.isEmpty(extractMetadata)) {
                kotlin.jvm.internal.o.d(extractMetadata);
                char[] charArray = extractMetadata.toCharArray();
                kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (char c17 : charArray) {
                    if (c17 != '+' && c17 != '-' && c17 != '.') {
                        i17 = android.text.TextUtils.isDigitsOnly(c17 + "") ? 0 : i17 + 1;
                    }
                    sb6.append(c17);
                }
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                int O = r26.n0.O(sb7, '+', 0, false, 6, null);
                if (-1 == O) {
                    O = r26.n0.O(sb7, '-', 0, false, 6, null);
                }
                java.lang.String substring = sb7.substring(0, O);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                double parseDouble = java.lang.Double.parseDouble(substring);
                java.lang.String substring2 = sb7.substring(O);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                return new jz5.l(java.lang.Double.valueOf(parseDouble), java.lang.Double.valueOf(java.lang.Double.parseDouble(substring2)));
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public final boolean e(java.lang.String dirPath, java.util.List targetNameList, java.util.Map cacheResult) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(dirPath, "dirPath");
        kotlin.jvm.internal.o.g(targetNameList, "targetNameList");
        kotlin.jvm.internal.o.g(cacheResult, "cacheResult");
        java.util.Set set = (java.util.Set) cacheResult.get(dirPath);
        java.lang.Object obj2 = null;
        if (set != null) {
            java.util.Iterator it = targetNameList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (set.contains((java.lang.String) obj)) {
                    break;
                }
            }
            java.lang.String str = (java.lang.String) obj;
            if (str != null && !kotlin.jvm.internal.o.b(str, "")) {
                return !com.tencent.mm.sdk.platformtools.t8.K0(str);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(targetNameList, 10));
        java.util.Iterator it6 = targetNameList.iterator();
        while (it6.hasNext()) {
            arrayList.add(new r26.t((java.lang.String) it6.next()));
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            java.lang.Object next = it7.next();
            if (((r26.t) next).a(dirPath)) {
                obj2 = next;
                break;
            }
        }
        r26.t tVar = (r26.t) obj2;
        java.lang.String valueOf = java.lang.String.valueOf(tVar);
        if (tVar != null) {
            if (!cacheResult.containsKey(dirPath)) {
                cacheResult.put(dirPath, new java.util.LinkedHashSet());
            }
            java.util.Set set2 = (java.util.Set) cacheResult.get(dirPath);
            if (set2 != null) {
                set2.add(valueOf);
            }
        }
        return !com.tencent.mm.sdk.platformtools.t8.K0(java.lang.String.valueOf(tVar));
    }

    public final boolean f(java.lang.String tempPath, java.io.FileDescriptor fileDescriptor) {
        kotlin.jvm.internal.o.g(tempPath, "tempPath");
        kotlin.jvm.internal.o.g(fileDescriptor, "fileDescriptor");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileDescriptor);
        com.tencent.mm.vfs.y6 y6Var = new com.tencent.mm.vfs.y6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(tempPath)));
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        fileInputStream.close();
                        y6Var.close();
                        return true;
                    }
                    y6Var.write(bArr, 0, read);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaUtil", "saveFdToPath exception:" + e17.getMessage());
                fileInputStream.close();
                y6Var.close();
                return false;
            }
        } catch (java.lang.Throwable th6) {
            fileInputStream.close();
            y6Var.close();
            throw th6;
        }
    }
}
