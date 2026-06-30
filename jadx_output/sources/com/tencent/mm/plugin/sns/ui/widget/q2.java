package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class q2 implements com.tencent.mm.plugin.sns.model.i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.q2 f171251d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f171252e;

    static {
        com.tencent.mm.plugin.sns.ui.widget.q2 q2Var = new com.tencent.mm.plugin.sns.ui.widget.q2();
        f171251d = q2Var;
        f171252e = new java.util.HashMap();
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        Cj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadEndListenerImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        ((java.util.concurrent.CopyOnWriteArraySet) Cj.f164447j).add(q2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadEndListenerImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.model.l4.hj().f164262k = q2Var;
    }

    public static final boolean a(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentHasNormalContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        boolean m17 = e86Var != null ? f171251d.m(e86Var) : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentHasNormalContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return m17;
    }

    public static final boolean b(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentIsEmoticonComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        boolean z17 = false;
        if ((e86Var != null ? f171251d.n(e86Var) : false) && yb4.a.f460697a.b()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentIsEmoticonComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return z17;
    }

    public static final boolean c(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentIsEmoticonCommentWithoutCheckConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        boolean n17 = e86Var != null ? f171251d.n(e86Var) : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentIsEmoticonCommentWithoutCheckConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return n17;
    }

    public static final boolean d(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentIsImageComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        boolean z17 = false;
        if (e86Var != null ? f171251d.o(e86Var) : false) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canBrowseCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            boolean z18 = yb4.a.f460700d || yb4.a.f460701e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canBrowseCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            if (z18) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentIsImageComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return z17;
    }

    public static final boolean e(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentIsImageCommentWithoutCheckConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        boolean o17 = e86Var != null ? f171251d.o(e86Var) : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentIsImageCommentWithoutCheckConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return o17;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(android.content.Context r24, com.tencent.mm.plugin.sns.storage.SnsInfo r25, r45.e86 r26, android.text.SpannableStringBuilder r27, boolean r28, int r29, com.tencent.mm.plugin.sns.ui.widget.m r30) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.q2.l(android.content.Context, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.e86, android.text.SpannableStringBuilder, boolean, int, com.tencent.mm.plugin.sns.ui.widget.m):void");
    }

    public static final r45.e86 r(com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsCommentToSnsCommentInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        r45.e86 t17 = v1Var != null ? f171251d.t(v1Var) : new r45.e86();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsCommentToSnsCommentInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return t17;
    }

    public final int f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dp2px", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dp2px", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return b17;
    }

    public final android.graphics.Bitmap g(android.graphics.Bitmap bitmap, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i17 == i18) {
            if (height > width) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(java.lang.Integer.valueOf((height - width) / 2));
                arrayList.add(0);
                arrayList.add(bitmap);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "getCropThumbBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "getCropThumbBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                return createBitmap;
            }
            if (height >= width) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                return bitmap;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(height));
            arrayList2.add(java.lang.Integer.valueOf(height));
            arrayList2.add(0);
            arrayList2.add(java.lang.Integer.valueOf((width - height) / 2));
            arrayList2.add(bitmap);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "getCropThumbBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
            yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "getCropThumbBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap2, "createBitmap(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return createBitmap2;
        }
        if (i17 > i18) {
            if (width <= height) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                return bitmap;
            }
            int i19 = (int) ((height * 4.0d) / 3);
            if (width <= i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                return bitmap;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(height));
            arrayList3.add(java.lang.Integer.valueOf(i19));
            arrayList3.add(0);
            arrayList3.add(java.lang.Integer.valueOf((width - i19) / 2));
            arrayList3.add(bitmap);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "getCropThumbBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap3 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue(), ((java.lang.Integer) arrayList3.get(2)).intValue(), ((java.lang.Integer) arrayList3.get(3)).intValue(), ((java.lang.Integer) arrayList3.get(4)).intValue());
            yj0.a.e(obj3, createBitmap3, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "getCropThumbBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap3, "createBitmap(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return createBitmap3;
        }
        if (height <= width) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return bitmap;
        }
        int i27 = (int) ((width * 4.0d) / 3);
        if (height <= i27) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return bitmap;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(java.lang.Integer.valueOf(i27));
        arrayList4.add(java.lang.Integer.valueOf(width));
        arrayList4.add(java.lang.Integer.valueOf((height - i27) / 2));
        arrayList4.add(0);
        arrayList4.add(bitmap);
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "getCropThumbBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap4 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue(), ((java.lang.Integer) arrayList4.get(2)).intValue(), ((java.lang.Integer) arrayList4.get(3)).intValue(), ((java.lang.Integer) arrayList4.get(4)).intValue());
        yj0.a.e(obj4, createBitmap4, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "getCropThumbBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap4, "createBitmap(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return createBitmap4;
    }

    public final android.graphics.drawable.Drawable h(android.content.Context context, int i17, android.util.Size size) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        android.content.res.Resources resources = context.getResources();
        int i18 = com.tencent.mm.plugin.sns.ui.widget.n1.f171229g;
        int width = size.getWidth();
        int height = size.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView$Companion");
        com.tencent.mm.plugin.sns.ui.widget.n1 n1Var = new com.tencent.mm.plugin.sns.ui.widget.n1(context, i17, width, height);
        n1Var.measure(width, height);
        n1Var.layout(0, 0, width, height);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.c(n1Var)) {
            throw new java.lang.IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        int width2 = n1Var.getWidth();
        int height2 = n1Var.getHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height2));
        arrayList.add(java.lang.Integer.valueOf(width2));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/core/view/ViewKt", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/core/view/ViewKt", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.translate(-n1Var.getScrollX(), -n1Var.getScrollY());
        n1Var.draw(canvas);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbBitmap", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView$Companion");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, createBitmap);
        bitmapDrawable.setBounds(0, 0, size.getWidth(), size.getHeight());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return bitmapDrawable;
    }

    public final android.graphics.drawable.Drawable i(android.content.Context context, android.graphics.Bitmap bitmap, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoundedBitmapDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        f3.i iVar = new f3.i(context.getResources(), bitmap);
        iVar.f259249d.setAntiAlias(true);
        iVar.c(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoundedBitmapDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return iVar;
    }

    public final int j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsPageScene", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        if (i17 == 1) {
            int h17 = ta4.z0.f416869f.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPageScene", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return h17;
        }
        if (i17 == 2) {
            int h18 = ta4.z0.f416870g.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPageScene", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return h18;
        }
        if (i17 != 5) {
            int h19 = ta4.z0.f416868e.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPageScene", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return h19;
        }
        int h27 = ta4.z0.f416871h.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPageScene", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return h27;
    }

    public final java.lang.String k(r45.e86 e86Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        kotlin.jvm.internal.o.g(e86Var, "<this>");
        if (n(e86Var)) {
            str = e86Var.f373132m + '-' + e86Var.f373131i + "-emoji-" + ((r45.l86) e86Var.f373140u.getFirst()).f379230d;
        } else if (o(e86Var)) {
            str = e86Var.f373132m + '-' + e86Var.f373131i + "-image-" + ((r45.d86) e86Var.A.getFirst()).f372239t;
        } else {
            str = e86Var.f373132m + '-' + e86Var.f373131i + "-normal";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return str;
    }

    public final boolean m(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNormalContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        kotlin.jvm.internal.o.g(e86Var, "<this>");
        java.lang.String str = e86Var.f373130h;
        boolean z17 = !(str == null || str.length() == 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNormalContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if ((!r5.isEmpty()) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(r45.e86 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "isEmoticonComment"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.o.g(r5, r2)
            int r2 = r5.f373144y
            r3 = 1
            if (r2 != r3) goto L21
            java.util.LinkedList r5 = r5.f373140u
            java.lang.String r2 = "SnsEmojiInfo"
            kotlin.jvm.internal.o.f(r5, r2)
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            if (r5 == 0) goto L21
            goto L22
        L21:
            r3 = 0
        L22:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.q2.n(r45.e86):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if ((!r5.isEmpty()) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(r45.e86 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "isImageComment"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.o.g(r5, r2)
            int r2 = r5.f373144y
            r3 = 2
            if (r2 != r3) goto L22
            java.util.LinkedList r5 = r5.A
            java.lang.String r2 = "SnsCommentImageInfo"
            kotlin.jvm.internal.o.f(r5, r2)
            boolean r5 = r5.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L22
            goto L23
        L22:
            r2 = 0
        L23:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.q2.o(r45.e86):boolean");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        java.util.HashSet hashSet = (java.util.HashSet) kotlin.jvm.internal.m0.c(f171252e).remove(str);
        if (hashSet == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentMediaLoadManager", "onThumbFinish id:" + str);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.ui.widget.k2 k2Var = (com.tencent.mm.plugin.sns.ui.widget.k2) it.next();
            com.tencent.mm.autogen.events.SnsCommentUpdateEvent snsCommentUpdateEvent = new com.tencent.mm.autogen.events.SnsCommentUpdateEvent();
            k2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            am.nv nvVar = snsCommentUpdateEvent.f54805g;
            nvVar.f7463a = k2Var.f171182a;
            com.tencent.mm.plugin.sns.ui.widget.q2 q2Var = f171251d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            nvVar.f7464b = q2Var.k(k2Var.f171183b);
            snsCommentUpdateEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
    }

    public final void p(boolean z17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.e86 commentInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtPicEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(commentInfo, "commentInfo");
        ta4.t tVar = new ta4.t();
        tVar.d(i17);
        tVar.b(commentInfo);
        tVar.c(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentImageCountsBySnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        java.util.LinkedList<r45.e86> linkedList = com.tencent.mm.plugin.sns.model.s5.f(snsInfo).CommentUserList;
        int i18 = 0;
        if (linkedList != null) {
            java.util.Iterator<r45.e86> it = linkedList.iterator();
            while (it.hasNext()) {
                if (it.next().f373145z > 0) {
                    i18++;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentImageCountsBySnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTotalCommentImageCount", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        tVar.f416833d = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTotalCommentImageCount", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtPicEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        java.lang.String str = z17 ? "view_exp" : "view_clk";
        java.util.Map t17 = kz5.c1.t(tVar.e());
        t17.put("view_id", "cmt_pic");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            tVar.a();
            ((cy1.a) rVar).Ej(str, t17, 36244);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtPicEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtPicEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
    }

    public final void q(android.text.SpannableStringBuilder spannableStringBuilder, r45.e86 e86Var, android.graphics.drawable.Drawable drawable, yz5.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        spannableStringBuilder.append(" ");
        yd4.d dVar = new yd4.d(drawable, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        dVar.f461084f = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        spannableStringBuilder.setSpan(dVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        com.tencent.mm.plugin.sns.ui.widget.p2 p2Var = new com.tencent.mm.plugin.sns.ui.widget.p2(pVar);
        p2Var.setTag(e86Var);
        p2Var.setNeedDealOverflowOffset(false);
        spannableStringBuilder.setSpan(p2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
    }

    public final r45.jj4 s(r45.d86 d86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toMedia", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        kotlin.jvm.internal.o.g(d86Var, "<this>");
        r45.jj4 jj4Var = new r45.jj4();
        java.lang.String str = d86Var.f372239t;
        if ((str == null || str.length() == 0) && !android.text.TextUtils.isEmpty(d86Var.f372226d)) {
            java.lang.String Url = d86Var.f372226d;
            kotlin.jvm.internal.o.f(Url, "Url");
            if (!r26.n0.B(Url, "http", false)) {
                jj4Var.f377855d = "sns_cmt_local_" + d86Var.f372226d;
                jj4Var.f377858g = d86Var.f372226d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toMedia", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                return jj4Var;
            }
        }
        java.lang.String MediaId = d86Var.f372239t;
        kotlin.jvm.internal.o.f(MediaId, "MediaId");
        if (r26.n0.B(MediaId, "sns_cmt_local_", false)) {
            jj4Var.f377855d = d86Var.f372239t;
            jj4Var.f377858g = d86Var.f372226d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toMedia", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
            return jj4Var;
        }
        jj4Var.f377855d = d86Var.f372239t;
        jj4Var.f377874w = d86Var.f372240u;
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f379520d = d86Var.f372228f;
        lj4Var.f379521e = d86Var.f372229g;
        lj4Var.f379522f = d86Var.f372231i;
        jj4Var.f377865p = lj4Var;
        jj4Var.f377858g = d86Var.f372226d;
        jj4Var.G = d86Var.f372227e;
        jj4Var.I = d86Var.f372235p;
        java.lang.String EncIdx = d86Var.f372236q;
        kotlin.jvm.internal.o.f(EncIdx, "EncIdx");
        jj4Var.H = java.lang.Integer.parseInt(EncIdx);
        jj4Var.f377860i = d86Var.f372233n;
        jj4Var.f377854J = d86Var.f372234o;
        jj4Var.L = d86Var.f372237r;
        java.lang.String ThumbEncIdx = d86Var.f372238s;
        kotlin.jvm.internal.o.f(ThumbEncIdx, "ThumbEncIdx");
        jj4Var.K = java.lang.Integer.parseInt(ThumbEncIdx);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toMedia", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return jj4Var;
    }

    public final r45.e86 t(com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toSnsCommentInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        kotlin.jvm.internal.o.g(v1Var, "<this>");
        r45.k76 k76Var = new r45.k76();
        k76Var.parseFrom(v1Var.field_curActionBuf);
        r45.e86 e86Var = new r45.e86();
        e86Var.f373132m = k76Var.f378467p;
        e86Var.f373137r = k76Var.f378470s;
        e86Var.A = k76Var.B;
        e86Var.f373145z = k76Var.A;
        e86Var.f373140u = k76Var.f378474w;
        e86Var.f373141v = k76Var.f378475x;
        e86Var.f373144y = k76Var.f378477z;
        e86Var.f373133n = k76Var.f378466o;
        e86Var.f373136q = k76Var.f378469r;
        e86Var.f373131i = k76Var.f378464m;
        e86Var.f373139t = k76Var.f378472u;
        e86Var.f373130h = k76Var.f378465n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toSnsCommentInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        return e86Var;
    }
}
