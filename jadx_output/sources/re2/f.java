package re2;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final re2.f f394406a = new re2.f();

    public static final android.graphics.Bitmap a(re2.f fVar, java.util.List list) {
        int i17;
        int i18;
        java.lang.Integer valueOf;
        fVar.getClass();
        int size = list.size();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveAvatarMergeRenderer", "compose", "(Ljava/util/List;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        int i19 = 0;
        int i27 = 1;
        int i28 = 2;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveAvatarMergeRenderer", "compose", "(Ljava/util/List;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        java.lang.String str = "createBitmap(...)";
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        int i29 = -1;
        try {
            i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478489a);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("Finder.CoLiveAvatarMergeRenderer", "compose: getColor(BG_0) failed, fallback to #FFFFFF: " + th6.getMessage());
            i17 = -1;
        }
        canvas.drawColor(i17);
        float f17 = (size == 2 ? 255 : 225) / 2.0f;
        float f18 = 7.5f + f17;
        float f19 = (270.0f - 30) - f17;
        e06.k kVar = new e06.k(1, size);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (((e06.j) it).hasNext()) {
            double radians = java.lang.Math.toRadians((size == i28 ? 135.0f : 90.0f) + ((((kz5.x0) it).b() + i29) * (360.0f / size)));
            arrayList2.add(new jz5.l(java.lang.Float.valueOf((((float) java.lang.Math.cos(radians)) * f19) + 270.0f), java.lang.Float.valueOf(270.0f - (((float) java.lang.Math.sin(radians)) * f19))));
            it = it;
            str = str;
            i29 = -1;
            i28 = 2;
        }
        java.lang.String str2 = str;
        if (1 <= size) {
            int i37 = 1;
            while (true) {
                int i38 = i37 - 1;
                jz5.l lVar = (jz5.l) arrayList2.get(i38);
                float floatValue = ((java.lang.Number) lVar.f302833d).floatValue();
                float floatValue2 = ((java.lang.Number) lVar.f302834e).floatValue();
                android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(config2);
                arrayList3.add(java.lang.Integer.valueOf(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH));
                arrayList3.add(java.lang.Integer.valueOf(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveAvatarMergeRenderer", "compose", "(Ljava/util/List;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(i19)).intValue(), ((java.lang.Integer) arrayList3.get(i27)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveAvatarMergeRenderer", "compose", "(Ljava/util/List;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                java.lang.String str3 = str2;
                kotlin.jvm.internal.o.f(createBitmap2, str3);
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap2);
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) list.get(i38);
                float min = (2 * f17) / java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setScale(min, min);
                matrix.postTranslate(floatValue - ((bitmap.getWidth() * min) / 2.0f), floatValue2 - ((bitmap.getHeight() * min) / 2.0f));
                android.graphics.Paint paint = new android.graphics.Paint(1);
                paint.setFilterBitmap(true);
                android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
                android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                canvas2.drawCircle(floatValue, floatValue2, f17, paint);
                if (size == 2) {
                    i18 = 1;
                    valueOf = i37 == 1 ? null : 1;
                } else {
                    i18 = 1;
                    valueOf = java.lang.Integer.valueOf((i37 % size) + 1);
                }
                if (valueOf != null) {
                    jz5.l lVar2 = (jz5.l) arrayList2.get(valueOf.intValue() - i18);
                    float floatValue3 = ((java.lang.Number) lVar2.f302833d).floatValue();
                    float floatValue4 = ((java.lang.Number) lVar2.f302834e).floatValue();
                    android.graphics.Paint paint2 = new android.graphics.Paint(i18);
                    paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
                    canvas2.drawCircle(floatValue3, floatValue4, f18, paint2);
                }
                canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
                createBitmap2.recycle();
                if (i37 == size) {
                    break;
                }
                i37++;
                i27 = i18;
                str2 = str3;
                i19 = 0;
            }
        }
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(re2.f r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof re2.c
            if (r0 == 0) goto L16
            r0 = r8
            re2.c r0 = (re2.c) r0
            int r1 = r0.f394371h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f394371h = r1
            goto L1b
        L16:
            re2.c r0 = new re2.c
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r6 = r0.f394369f
            pz5.a r8 = pz5.a.f359186d
            int r1 = r0.f394371h
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r0.f394368e
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r6)
            goto Lb4
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = com.tencent.mm.plugin.finder.assist.e9.f102141j
            r6.append(r1)
            java.lang.String r1 = "colive_avatar_"
            r6.append(r1)
            java.nio.charset.Charset r1 = r26.c.f368865a
            byte[] r1 = r7.getBytes(r1)
            java.lang.String r3 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            java.lang.String r1 = kk.k.g(r1)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = com.tencent.mm.vfs.w6.r(r6)
            r3 = 0
            if (r1 == 0) goto L6f
            int r4 = r1.length()
            if (r4 != 0) goto L6d
            goto L6f
        L6d:
            r4 = r3
            goto L70
        L6f:
            r4 = r2
        L70:
            if (r4 != 0) goto L78
            com.tencent.mm.vfs.w6.u(r1)
            com.tencent.mm.vfs.w6.t(r1)
        L78:
            boolean r1 = com.tencent.mm.vfs.w6.j(r6)
            if (r1 == 0) goto L7f
            goto Lc5
        L7f:
            r0.f394367d = r7
            r0.f394368e = r6
            r0.f394371h = r2
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r1.<init>(r0, r2)
            r1.k()
            n11.a r0 = n11.a.b()
            o11.f r2 = new o11.f
            r2.<init>()
            r2.f342082f = r6
            r2.f342078b = r3
            o11.g r2 = r2.a()
            re2.d r3 = new re2.d
            r3.<init>(r1)
            r0.d(r7, r2, r3)
            java.lang.Object r7 = r1.j()
            if (r7 != r8) goto Lb1
            goto Lc6
        Lb1:
            r5 = r7
            r7 = r6
            r6 = r5
        Lb4:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lc4
            boolean r6 = com.tencent.mm.vfs.w6.j(r7)
            if (r6 == 0) goto Lc4
            r8 = r7
            goto Lc6
        Lc4:
            r6 = 0
        Lc5:
            r8 = r6
        Lc6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: re2.f.b(re2.f, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
