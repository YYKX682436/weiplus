package mv2;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final mv2.q f331618a = new mv2.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f331619b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static long f331620c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f331621d;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new mv2.o());
        arrayList.add(new mv2.p());
        f331621d = arrayList;
    }

    public static final void b(mv2.q qVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.util.ArrayList arrayList) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        qVar.getClass();
        for (r45.mb4 mb4Var : finderItem.getMediaList()) {
            arrayList.add(mb4Var.getString(0));
            arrayList.add(mb4Var.getString(1));
            arrayList.add(mb4Var.getString(16));
            arrayList.add(mb4Var.getString(25));
            r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
            if (h70Var != null && (linkedList2 = h70Var.f375897d) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r45.ho6) it.next()).f376333d);
                }
            }
        }
        java.util.Iterator<T> it6 = finderItem.getClipListExt().iterator();
        while (it6.hasNext()) {
            for (r45.mb4 mb4Var2 : ((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()).getMediaList()) {
                arrayList.add(mb4Var2.getString(0));
                arrayList.add(mb4Var2.getString(1));
                arrayList.add(mb4Var2.getString(16));
                arrayList.add(mb4Var2.getString(25));
                r45.h70 h70Var2 = (r45.h70) mb4Var2.getCustom(21);
                if (h70Var2 != null && (linkedList = h70Var2.f375897d) != null) {
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(((r45.ho6) it7.next()).f376333d);
                    }
                }
            }
        }
    }

    public static final void c(mv2.q qVar, java.lang.String str, java.util.ArrayList arrayList) {
        qVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            byte[] c17 = ot5.e.c(str);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.o.f(obtain, "obtain(...)");
            obtain.unmarshall(c17, 0, c17.length);
            obtain.setDataPosition(0);
            android.content.Intent intent = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(obtain);
            intent.setExtrasClassLoader(com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable.CREATOR.getClass().getClassLoader());
            arrayList.add(intent.getStringExtra("VIDEO_COVER_URL"));
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("postMediaList");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            arrayList.addAll(stringArrayListExtra);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostFileManager", java.lang.String.valueOf(e17));
        }
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2, r45.c07 c07Var) {
        if (d(str2) && c07Var == null) {
            return str2;
        }
        android.graphics.Point k17 = k(str, 2);
        int i17 = k17.x;
        int i18 = k17.y;
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
        android.graphics.Bitmap S = J2 != null ? com.tencent.mm.sdk.platformtools.x.S(com.tencent.mm.sdk.platformtools.x.w0(J2, com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree()), i18, i17, true, true) : null;
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "_genImageThumbFile, file %s rotate %d. originThumbWidth:%s, originThumbHeight:%s", str, java.lang.Integer.valueOf(com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree()), java.lang.Integer.valueOf(k17.x), java.lang.Integer.valueOf(k17.y));
        if (S != null) {
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "_genImageThumbFile, file %s cropThumbWidth:%s, cropThumbHeight:%s", str, java.lang.Integer.valueOf(S.getWidth()), java.lang.Integer.valueOf(S.getHeight()));
            if (c07Var != null) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "thumbRect:[" + c07Var.getInteger(0) + ", " + c07Var.getInteger(1) + ", " + c07Var.getInteger(2) + ", " + c07Var.getInteger(3) + "], bitmap:[" + S.getWidth() + ", " + S.getHeight() + ']');
                int width = S.getWidth();
                float f17 = (float) width;
                int integer = (int) ((((float) (c07Var.getInteger(1) - c07Var.getInteger(3))) / ((float) (c07Var.getInteger(2) - c07Var.getInteger(0)))) * f17);
                android.graphics.Bitmap.Config config = S.getConfig();
                kotlin.jvm.internal.o.d(config);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(integer));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/upload/FinderPostFileManager", "_genImageThumbFile", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/ViewRect;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/upload/FinderPostFileManager", "_genImageThumbFile", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/ViewRect;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                float integer2 = f17 / (c07Var.getInteger(2) - c07Var.getInteger(0));
                float integer3 = integer / (c07Var.getInteger(1) - c07Var.getInteger(3));
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "widthRatio:" + integer2 + ", heightRatio:" + integer3);
                int integer4 = (int) (((float) c07Var.getInteger(0)) * integer2);
                int integer5 = (int) (((float) c07Var.getInteger(3)) * integer3);
                android.graphics.Rect rect = new android.graphics.Rect(integer4, integer5, width + integer4, integer + integer5);
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genImageThumbFile crop by rect, newThumbRect:" + rect);
                canvas.drawBitmap(S, new android.graphics.Rect(rect.left, rect.top, rect.right, rect.bottom), new android.graphics.Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new android.graphics.Paint());
                com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 70, android.graphics.Bitmap.CompressFormat.JPEG, str2, false);
            } else {
                com.tencent.mm.sdk.platformtools.x.D0(S, 70, android.graphics.Bitmap.CompressFormat.JPEG, str2, false);
            }
        }
        return str2;
    }

    public final boolean d(java.lang.String thumbFile) {
        kotlin.jvm.internal.o.g(thumbFile, "thumbFile");
        if (!com.tencent.mm.vfs.w6.j(thumbFile)) {
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(thumbFile, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    public final java.lang.String e(java.lang.String originFilePath, r45.c07 c07Var) {
        kotlin.jvm.internal.o.g(originFilePath, "originFilePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102146o);
        sb6.append("image_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(originFilePath.getBytes()));
        sb6.append('_');
        sb6.append(com.tencent.mm.vfs.w6.l(originFilePath));
        sb6.append("_thumb");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genImageThumbFileTmp " + originFilePath + ", " + sb7 + ", " + c07Var);
        a(originFilePath, sb7, c07Var);
        return sb7;
    }

    public final java.lang.String f(java.lang.String videoPath, int i17, int i18, android.graphics.Rect rect, java.lang.String dstPath) {
        android.graphics.Bitmap D;
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(dstPath, "dstPath");
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.K0(dstPath) ? l(videoPath, java.lang.String.valueOf(java.lang.System.currentTimeMillis())) : dstPath;
        java.lang.String i19 = com.tencent.mm.vfs.w6.i(videoPath, false);
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile savepath:" + l17 + ", input:" + i19);
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        android.graphics.Bitmap p17 = ai3.d.p(videoPath);
        if (p17 != null) {
            android.graphics.Bitmap.Config config = p17.getConfig();
            kotlin.jvm.internal.o.d(config);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/upload/FinderPostFileManager", "genVideoThumbFile", "(Ljava/lang/String;IILandroid/graphics/Rect;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/upload/FinderPostFileManager", "genVideoThumbFile", "(Ljava/lang/String;IILandroid/graphics/Rect;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            if (rect != null) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile crop by rect");
                canvas.drawBitmap(p17, new android.graphics.Rect(rect.left, rect.bottom, rect.right, rect.top), new android.graphics.Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new android.graphics.Paint());
            } else {
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile no rect");
                canvas.drawBitmap(p17, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new android.graphics.Paint());
            }
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile cropThumb.width:" + createBitmap.getWidth() + " cropThumb.height:" + createBitmap.getHeight());
            com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, l17, false);
        } else {
            if (d(l17)) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile file exist");
                return l17;
            }
            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
            if (com.tencent.mm.plugin.sight.base.e.d(i19, true) != null) {
                android.graphics.Point k17 = f331618a.k(i19, 4);
                int mp4RotateVFS = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getMp4RotateVFS(i19);
                int i27 = k17.x;
                int i28 = k17.y;
                if (com.tencent.mm.sdk.platformtools.t8.K0(i19)) {
                    D = null;
                } else {
                    D = com.tencent.mm.sdk.platformtools.x.D(i19, 1, -1);
                    if (D == null) {
                        com.tencent.mars.xlog.Log.e("LogPost.FinderPostFileManager", "create remux thumb bmp error, target path %s", i19);
                    } else {
                        D = com.tencent.mm.sdk.platformtools.x.S(D, i28, i27, true, true);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("genVideoThumbFile file:");
                sb6.append(i19);
                sb6.append(" rotate:");
                sb6.append(mp4RotateVFS);
                sb6.append(" thumbSize.x:");
                sb6.append(k17.x);
                sb6.append(" thumbSize.y:");
                sb6.append(k17.y);
                sb6.append(" thumb.width:");
                sb6.append(D != null ? java.lang.Integer.valueOf(D.getWidth()) : null);
                sb6.append(" thumb.height:");
                sb6.append(D != null ? java.lang.Integer.valueOf(D.getHeight()) : null);
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", sb6.toString());
                if (D != null) {
                    com.tencent.mm.sdk.platformtools.x.D0(D, 70, android.graphics.Bitmap.CompressFormat.JPEG, l17, false);
                }
            }
        }
        if (!com.tencent.mm.vfs.w6.j(l17)) {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostFileManager", "genVideoThumbFile failed.");
        }
        return l17;
    }

    public final java.lang.String g(java.lang.String input, int i17, int i18, android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(input, "input");
        return h(input, com.tencent.mm.plugin.finder.assist.e9.f102132a.i(input), i17, i18, rect);
    }

    public final java.lang.String h(java.lang.String input, java.lang.String dstPath, int i17, int i18, android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(input, "input");
        kotlin.jvm.internal.o.g(dstPath, "dstPath");
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFileForPost input:" + input + ", targetWidth:" + i17 + ", targetHeight:" + i18 + ", thumbRect:" + rect + ", dstPath:" + dstPath);
        return f(input, i17, i18, rect, dstPath);
    }

    public final java.lang.String i(java.lang.String input) {
        kotlin.jvm.internal.o.g(input, "input");
        android.graphics.Point k17 = k(input, 4);
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFileTmp input:" + input + ", targetWidth:" + k17.x + ", targetHeight:" + k17.y);
        return f(input, k17.x, k17.y, null, "");
    }

    public final java.lang.String j(java.lang.String input, r45.c07 thumbRect) {
        kotlin.jvm.internal.o.g(input, "input");
        kotlin.jvm.internal.o.g(thumbRect, "thumbRect");
        int i17 = com.tencent.mm.plugin.finder.storage.t70.f127590a.L2().f71204t;
        int integer = (int) (((thumbRect.getInteger(1) - thumbRect.getInteger(3)) / (thumbRect.getInteger(2) - thumbRect.getInteger(0))) * i17);
        android.graphics.Rect rect = new android.graphics.Rect(thumbRect.getInteger(0), thumbRect.getInteger(1), thumbRect.getInteger(2), thumbRect.getInteger(3));
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFileTmp input:" + input + ", targetWidth:" + i17 + ", targetHeight:" + integer + ", thumbRect:" + rect);
        return f(input, i17, integer, rect, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r5 != 7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Point k(java.lang.String r4, int r5) {
        /*
            r3 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 != 0) goto La1
            r0 = 2
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 == r0) goto L50
            r0 = 4
            if (r5 == r0) goto L18
            r0 = 6
            if (r5 == r0) goto L18
            r0 = 7
            if (r5 == r0) goto L50
            goto La1
        L18:
            com.tencent.mm.plugin.sight.base.b r4 = hc2.l.e(r4)
            if (r4 == 0) goto La1
            int r5 = r4.f162384c
            int r0 = r4.f162385d
            int r5 = java.lang.Math.min(r5, r0)
            int r0 = java.lang.Math.min(r5, r1)
            int r1 = r4.f162384c
            if (r5 != r1) goto L3f
            android.graphics.Point r5 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r4.f162384c
            float r2 = (float) r2
            float r1 = r1 / r2
            int r4 = r4.f162385d
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = (int) r1
            r5.<init>(r0, r4)
            goto L4f
        L3f:
            android.graphics.Point r5 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r4.f162385d
            float r2 = (float) r2
            float r1 = r1 / r2
            int r4 = r4.f162384c
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = (int) r1
            r5.<init>(r4, r0)
        L4f:
            return r5
        L50:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r0 = 1
            r5.inJustDecodeBounds = r0
            com.tencent.mm.sdk.platformtools.x.J(r4, r5)
            com.tencent.mm.compatible.util.Exif r4 = com.tencent.mm.compatible.util.Exif.fromFile(r4)
            int r4 = r4.getOrientationInDegree()
            int r4 = r4 % 180
            if (r4 == 0) goto L6f
            int r4 = r5.outHeight
            int r0 = r5.outWidth
            r5.outHeight = r0
            r5.outWidth = r4
        L6f:
            int r4 = r5.outWidth
            int r0 = r5.outHeight
            int r4 = java.lang.Math.min(r4, r0)
            int r0 = java.lang.Math.min(r4, r1)
            int r1 = r5.outWidth
            if (r4 != r1) goto L90
            android.graphics.Point r4 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r5.outWidth
            float r2 = (float) r2
            float r1 = r1 / r2
            int r5 = r5.outHeight
            float r5 = (float) r5
            float r1 = r1 * r5
            int r5 = (int) r1
            r4.<init>(r0, r5)
            goto La0
        L90:
            android.graphics.Point r4 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r5.outHeight
            float r2 = (float) r2
            float r1 = r1 / r2
            int r5 = r5.outWidth
            float r5 = (float) r5
            float r1 = r1 * r5
            int r5 = (int) r1
            r4.<init>(r5, r0)
        La0:
            return r4
        La1:
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r1, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.q.k(java.lang.String, int):android.graphics.Point");
    }

    public final java.lang.String l(java.lang.String originFilePath, java.lang.String suffix) {
        kotlin.jvm.internal.o.g(originFilePath, "originFilePath");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102146o);
        sb6.append("video_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(originFilePath.getBytes()));
        sb6.append('_');
        sb6.append(suffix);
        sb6.append("_thumb");
        return sb6.toString();
    }

    public final void m(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        synchronized (f331619b) {
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "FinderFileTrack markPostFileToDelete ".concat(path));
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            java.util.Set stringSet = L.getStringSet("MARK_DEL_FILES", new java.util.HashSet());
            kotlin.jvm.internal.o.d(stringSet);
            stringSet.add(path);
            L.putStringSet("MARK_DEL_FILES", stringSet);
        }
    }

    public final void n(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "moveFileToPost draft");
        com.tencent.mm.vfs.w6.u(com.tencent.mm.plugin.finder.assist.e9.f102147p);
        if (draftItem.field_objectType == 2) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem t07 = draftItem.t0();
        java.util.LinkedList<r45.mb4> mediaExtList = t07.getMediaExtList();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = t07.getFeedObject().getObjectDesc();
        p(mediaExtList, objectDesc != null ? objectDesc.getVideo_tmpl_info() : null);
        t07.setMediaList(t07.getMediaList());
        if (t07.isLongVideo()) {
            t07.setMediaList(t07.getMediaList());
        }
        cu2.o.f222430a.b(draftItem);
    }

    public final void o(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "moveFileToPost");
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        com.tencent.mm.vfs.w6.u(com.tencent.mm.plugin.finder.assist.e9.f102147p);
        if (finderObj.isMvFeed()) {
            return;
        }
        java.util.LinkedList<r45.mb4> mediaExtList = finderObj.getMediaExtList();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObj.getFeedObject().getObjectDesc();
        p(mediaExtList, objectDesc != null ? objectDesc.getVideo_tmpl_info() : null);
        finderObj.setMediaList(finderObj.getMediaList());
        if (finderObj.isLongVideo()) {
            finderObj.setMediaList(finderObj.getMediaList());
        }
        cu2.u.f222441a.l(finderObj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    public final void p(java.util.List list, r45.q23 q23Var) {
        java.util.Iterator it;
        boolean z17;
        int i17;
        boolean z18;
        java.lang.String str;
        boolean z19;
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        int i18;
        ?? r27;
        ?? r37;
        java.util.LinkedList<java.lang.String> linkedList;
        android.net.Uri d17;
        java.util.LinkedList<r45.ho6> linkedList2;
        java.lang.Object obj;
        int i19 = 48;
        java.lang.String str4 = " to ";
        ?? r102 = 0;
        if (list.size() == 1 && ((r45.h70) ((r45.mb4) list.get(0)).getCustom(21)) != null) {
            r45.h70 h70Var = (r45.h70) ((r45.mb4) list.get(0)).getCustom(21);
            if (h70Var == null || (linkedList2 = h70Var.f375897d) == null) {
                r27 = 0;
            } else {
                for (r45.ho6 ho6Var : linkedList2) {
                    boolean j18 = com.tencent.mm.vfs.w6.j(ho6Var.f376333d);
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] path:" + ho6Var.f376333d + " fileExist:" + j18 + " originMediaUrl:" + ((r45.mb4) list.get(r102)).getString(i19));
                    if (j18) {
                        java.lang.String path = ho6Var.f376333d;
                        kotlin.jvm.internal.o.f(path, "path");
                        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
                        if (!r26.i0.y(path, com.tencent.mm.plugin.finder.assist.e9.f102147p, r102)) {
                            java.lang.String e17 = e9Var.e(com.tencent.mm.sdk.platformtools.w2.a(ho6Var.f376333d) + ho6Var.hashCode());
                            java.lang.String str5 = ho6Var.f376333d;
                            android.net.Uri c17 = com.tencent.mm.sdk.platformtools.v6.c(com.tencent.mm.sdk.platformtools.x2.f193071a, str5, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                            if (c17 == null) {
                                c17 = com.tencent.mm.sdk.platformtools.v6.d(com.tencent.mm.sdk.platformtools.x2.f193071a, str5);
                            }
                            if (c17 != null) {
                                str5 = c17.toString();
                            }
                            com.tencent.mm.vfs.w6.c(str5, e17);
                            boolean j19 = com.tencent.mm.vfs.w6.j(e17);
                            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy track path from " + ho6Var.f376333d + " to " + e17 + " real:" + com.tencent.mm.vfs.w6.i(e17, r102) + " result:" + j19);
                            if (j19) {
                                if (ho6Var.f376345s == 1) {
                                    bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                                    java.lang.String str6 = ho6Var.f376333d;
                                    ((b92.u2) vVar).getClass();
                                    dw3.c0.f244182a.A(str6);
                                }
                                java.util.LinkedList trackLabelInfoList = h70Var.f375908r;
                                kotlin.jvm.internal.o.f(trackLabelInfoList, "trackLabelInfoList");
                                java.util.Iterator it6 = trackLabelInfoList.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj = it6.next();
                                        if (kotlin.jvm.internal.o.b(((r45.j70) obj).f377620d, ho6Var.f376333d)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                r45.j70 j70Var = (r45.j70) obj;
                                if (j70Var != null) {
                                    j70Var.f377620d = e17;
                                }
                                ho6Var.f376333d = e17;
                                ((r45.mb4) list.get(0)).set(48, str5);
                            }
                        }
                    }
                    i19 = 48;
                    r102 = 0;
                }
                r27 = r102;
            }
            java.lang.String string = ((r45.mb4) list.get(r27)).getString(1);
            if (!com.tencent.mm.vfs.w6.j(string) || string == null) {
                r37 = r27;
            } else {
                com.tencent.mm.plugin.finder.assist.e9 e9Var2 = com.tencent.mm.plugin.finder.assist.e9.f102132a;
                if (!r26.i0.y(string, com.tencent.mm.plugin.finder.assist.e9.f102147p, r27)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                    sb6.append(com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()));
                    sb6.append(string.hashCode());
                    java.lang.String e18 = e9Var2.e(sb6.toString());
                    android.net.Uri d18 = com.tencent.mm.sdk.platformtools.v6.d(com.tencent.mm.sdk.platformtools.x2.f193071a, string);
                    java.lang.String uri = d18 != null ? d18.toString() : string;
                    kotlin.jvm.internal.o.f(uri, "let(...)");
                    com.tencent.mm.vfs.w6.c(uri, e18);
                    boolean j27 = com.tencent.mm.vfs.w6.j(e18);
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy thumb from " + string + " to " + e18 + " real:" + com.tencent.mm.vfs.w6.i(e18, false) + " result:" + j27);
                    if (j27) {
                        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                        dw3.c0.f244182a.A(string);
                        r37 = 0;
                        ((r45.mb4) list.get(0)).set(1, e18);
                    }
                }
                r37 = 0;
            }
            java.lang.String string2 = ((r45.mb4) list.get(r37)).getString(25);
            if (com.tencent.mm.vfs.w6.j(string2) && string2 != null) {
                com.tencent.mm.plugin.finder.assist.e9 e9Var3 = com.tencent.mm.plugin.finder.assist.e9.f102132a;
                if (!r26.i0.y(string2, com.tencent.mm.plugin.finder.assist.e9.f102147p, r37)) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    char[] cArr2 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                    sb7.append(com.tencent.mm.sdk.platformtools.w2.b(string2.getBytes()));
                    sb7.append(string2.hashCode());
                    java.lang.String e19 = e9Var3.e(sb7.toString());
                    com.tencent.mm.vfs.w6.c((android.os.Build.VERSION.SDK_INT < 30 || (d17 = com.tencent.mm.sdk.platformtools.v6.d(com.tencent.mm.sdk.platformtools.x2.f193071a, string2)) == null) ? string2 : d17.toString(), e19);
                    boolean j28 = com.tencent.mm.vfs.w6.j(e19);
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy fullThumbPath from " + string2 + " to " + e19 + " real:" + com.tencent.mm.vfs.w6.i(e19, false) + " result:" + j28);
                    if (j28) {
                        ((r45.mb4) list.get(0)).set(25, e19);
                    }
                }
            }
            r45.iy5 iy5Var = q23Var != null ? q23Var.f383592n : null;
            if (iy5Var == null || (linkedList = iy5Var.f377412d) == null || linkedList.size() <= 0) {
                return;
            }
            com.tencent.mm.plugin.finder.assist.e9 e9Var4 = com.tencent.mm.plugin.finder.assist.e9.f102132a;
            java.lang.String str7 = com.tencent.mm.plugin.finder.assist.e9.f102147p + "templateScy/";
            com.tencent.mm.vfs.w6.u(str7);
            java.lang.Object first = linkedList.getFirst();
            kotlin.jvm.internal.o.f(first, "getFirst(...)");
            java.util.List f07 = r26.n0.f0((java.lang.CharSequence) first, new java.lang.String[]{"/"}, false, 0, 6, null);
            if (f07.size() > 2) {
                java.lang.String str8 = str7 + ((java.lang.String) f07.get(f07.size() - 2));
                com.tencent.mm.vfs.w6.u(str8);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                for (java.lang.String str9 : linkedList) {
                    kotlin.jvm.internal.o.d(str9);
                    java.lang.String str10 = str8 + '/' + ((java.lang.String) kz5.n0.i0(r26.n0.f0(str9, new java.lang.String[]{"/"}, false, 0, 6, null)));
                    if (com.tencent.mm.vfs.w6.j(str10)) {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy template frame, dest exist");
                    } else {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy template frame from " + str9 + " to:" + str10 + " result:" + com.tencent.mm.vfs.w6.d(str9, str10, false));
                    }
                    linkedList3.add(str10);
                }
                linkedList.clear();
                linkedList.addAll(linkedList3);
                return;
            }
            return;
        }
        long a17 = (int) (c01.id.a() / 1000);
        java.util.Iterator it7 = list.iterator();
        int i27 = 0;
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.mb4 mb4Var = (r45.mb4) next;
            boolean j29 = com.tencent.mm.vfs.w6.j(mb4Var.getString(0));
            boolean j37 = com.tencent.mm.vfs.w6.j(mb4Var.getString(1));
            boolean j38 = com.tencent.mm.vfs.w6.j(mb4Var.getString(16));
            boolean j39 = com.tencent.mm.vfs.w6.j(mb4Var.getString(25));
            java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(0));
            mv2.q qVar = f331618a;
            java.lang.String string3 = mb4Var.getString(0);
            boolean y17 = string3 != null ? r26.i0.y(string3, com.tencent.mm.plugin.finder.assist.e9.f102147p, false) : false;
            java.lang.String string4 = mb4Var.getString(1);
            if (string4 != null) {
                it = it7;
                z17 = r26.i0.y(string4, com.tencent.mm.plugin.finder.assist.e9.f102147p, false);
            } else {
                it = it7;
                z17 = false;
            }
            java.lang.String string5 = mb4Var.getString(16);
            if (string5 != null) {
                i17 = i28;
                z18 = r26.i0.y(string5, com.tencent.mm.plugin.finder.assist.e9.f102147p, false);
            } else {
                i17 = i28;
                z18 = false;
            }
            java.lang.String string6 = mb4Var.getString(25);
            if (string6 != null) {
                str = str4;
                z19 = r26.i0.y(string6, com.tencent.mm.plugin.finder.assist.e9.f102147p, false);
            } else {
                str = str4;
                z19 = false;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[moveFileToPostForNormal] mediaId: ");
            sb8.append(a18);
            sb8.append(", fileExist:");
            sb8.append(j29);
            sb8.append(", thumbExist:");
            sb8.append(j37);
            sb8.append(", before url: ");
            sb8.append(mb4Var.getString(0));
            sb8.append(", ");
            boolean z27 = z19;
            sb8.append(mb4Var.getString(1));
            sb8.append(", ");
            sb8.append(mb4Var.getString(16));
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", sb8.toString());
            if (j29 || j37) {
                int integer = mb4Var.getInteger(2);
                boolean z28 = z18;
                if (integer != 2) {
                    if (integer == 4) {
                        if (j29 && j37 && !z17) {
                            java.lang.String string7 = mb4Var.getString(0);
                            if (string7 == null) {
                                string7 = "";
                            }
                            java.lang.String string8 = mb4Var.getString(1);
                            if (string8 == null) {
                                string8 = "";
                            }
                            java.lang.String i29 = com.tencent.mm.plugin.finder.assist.e9.f102132a.i(string7);
                            j17 = a17;
                            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "copyVideoThumbFileToPost, videoFilePath:" + string7 + ", thumbOriginPath:" + string8 + ", thumbPostPath:" + i29);
                            if (qVar.d(string8)) {
                                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost exist, copy");
                                com.tencent.mm.vfs.w6.c(string8, i29);
                            } else {
                                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost not exist, generate");
                                android.graphics.Point k17 = qVar.k(string7, 4);
                                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFileTmp videoFilePath:" + string7 + ", targetWidth:" + k17.x + ", targetHeight:" + k17.y);
                                qVar.f(string7, k17.x, k17.y, null, i29);
                            }
                            boolean j47 = com.tencent.mm.vfs.w6.j(i29);
                            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForNormal] Video thumb to " + i29 + " result:" + j47);
                            if (j47) {
                                mb4Var.set(1, i29);
                            }
                        } else {
                            j17 = a17;
                        }
                        if (j29 && !y17) {
                            java.lang.String h17 = com.tencent.mm.plugin.finder.assist.e9.f102132a.h(new mn2.g4(mb4Var, com.tencent.mm.plugin.finder.storage.y90.R, "xV99", 0, 0, null, false, null, 248, null), java.lang.String.valueOf(j17));
                            long d19 = com.tencent.mm.vfs.w6.d(mb4Var.getString(0), h17, false);
                            boolean j48 = com.tencent.mm.vfs.w6.j(h17);
                            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForNormal] Video from " + mb4Var.getString(0) + " targetPath" + h17 + " result:" + j48);
                            if (j48) {
                                mb4Var.set(48, mb4Var.getString(0));
                                mb4Var.set(0, h17);
                                java.lang.String string9 = mb4Var.getString(0);
                                mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b((string9 != null ? string9 : "").getBytes()));
                                mb4Var.set(46, hc2.l.k(mb4Var.getString(1)));
                            } else {
                                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "copy Video failed, copyRet:" + d19);
                            }
                        }
                        if (!j38 || z28) {
                            str3 = ", ";
                            str4 = str;
                            i18 = 16;
                        } else {
                            str3 = ", ";
                            i18 = 16;
                            java.lang.String f17 = com.tencent.mm.plugin.finder.assist.e9.f102132a.f(new mn2.r3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), java.lang.String.valueOf(j17));
                            com.tencent.mm.vfs.w6.c(mb4Var.getString(16), f17);
                            mb4Var.set(16, f17);
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[moveFileToPostForNormal] Cover from ");
                            sb9.append(mb4Var.getString(16));
                            str4 = str;
                            sb9.append(str4);
                            sb9.append(f17);
                            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", sb9.toString());
                        }
                        if (j39 && !z27) {
                            java.lang.String f18 = com.tencent.mm.plugin.finder.assist.e9.f102132a.f(new mn2.r3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), java.lang.String.valueOf(j17));
                            com.tencent.mm.vfs.w6.c(mb4Var.getString(25), f18);
                            mb4Var.set(25, f18);
                            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForNormal] fullThumb from " + mb4Var.getString(i18) + str4 + f18);
                        }
                        str2 = str3;
                        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "moveFileToPostForNormal, after mediaId: " + mb4Var.getString(9) + ", url: " + mb4Var.getString(0) + str2 + mb4Var.getString(1) + str2 + mb4Var.getString(16));
                    } else if (integer != 7) {
                        j17 = a17;
                        str2 = ", ";
                        str4 = str;
                        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "moveFileToPostForNormal, after mediaId: " + mb4Var.getString(9) + ", url: " + mb4Var.getString(0) + str2 + mb4Var.getString(1) + str2 + mb4Var.getString(16));
                    }
                }
                j17 = a17;
                str2 = ", ";
                java.lang.String str11 = str;
                if (j29 && j37 && !z17) {
                    java.lang.String string10 = mb4Var.getString(0);
                    if (string10 == null) {
                        string10 = "";
                    }
                    java.lang.String string11 = mb4Var.getString(1);
                    java.lang.String str12 = string11 == null ? "" : string11;
                    com.tencent.mm.plugin.finder.assist.e9 e9Var5 = com.tencent.mm.plugin.finder.assist.e9.f102132a;
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(com.tencent.mm.plugin.finder.assist.e9.f102147p);
                    sb10.append("image_");
                    sb10.append(com.tencent.mm.sdk.platformtools.w2.b(string10.getBytes()));
                    sb10.append('_');
                    str = str11;
                    sb10.append(com.tencent.mm.vfs.w6.l(string10));
                    sb10.append("_thumb");
                    java.lang.String sb11 = sb10.toString();
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost, imagePath:" + string10 + ", thumbOriginPath:" + str12 + ", thumbPostPath:" + sb11);
                    if (qVar.d(str12)) {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost exist, copy");
                        com.tencent.mm.vfs.w6.c(str12, sb11);
                    } else {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost not exist, generate");
                        qVar.a(string10, sb11, null);
                    }
                    boolean j49 = com.tencent.mm.vfs.w6.j(sb11);
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForNormal] copy thumb to " + sb11 + " result:" + j49);
                    if (j49) {
                        mb4Var.set(1, sb11);
                    }
                } else {
                    str = str11;
                }
                if (j29 && !y17) {
                    java.lang.String d27 = com.tencent.mm.plugin.finder.assist.e9.f102132a.d(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, null, 12, null), java.lang.String.valueOf(j17));
                    long d28 = com.tencent.mm.vfs.w6.d(mb4Var.getString(0), d27, false);
                    boolean j57 = com.tencent.mm.vfs.w6.j(d27);
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder("[moveFileToPostForNormal] Image from ");
                    sb12.append(mb4Var.getString(0));
                    str4 = str;
                    sb12.append(str4);
                    sb12.append(d27);
                    sb12.append(" result:");
                    sb12.append(j57);
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", sb12.toString());
                    if (j57) {
                        mb4Var.set(48, mb4Var.getString(0));
                        mb4Var.set(0, d27);
                        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(0)));
                        mb4Var.set(46, hc2.l.k(mb4Var.getString(1)));
                    } else {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "copy Image failed, copyRet:" + d28);
                    }
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "moveFileToPostForNormal, after mediaId: " + mb4Var.getString(9) + ", url: " + mb4Var.getString(0) + str2 + mb4Var.getString(1) + str2 + mb4Var.getString(16));
                }
                str4 = str;
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "moveFileToPostForNormal, after mediaId: " + mb4Var.getString(9) + ", url: " + mb4Var.getString(0) + str2 + mb4Var.getString(1) + str2 + mb4Var.getString(16));
            } else {
                j17 = a17;
                str4 = str;
            }
            it7 = it;
            i27 = i17;
            a17 = j17;
        }
    }
}
