package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f150068a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f150069b;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.b3 f150073f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.e0 f150074g;

    /* renamed from: i, reason: collision with root package name */
    public int f150076i;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f150070c = "";

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.model.h3 f150071d = new com.tencent.mm.plugin.multitalk.model.h3("", 0, 0, null, 14, null);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f150072e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f150075h = true;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f150077j = "";

    public void a(java.lang.String userName, int[] pBuffer, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(pBuffer, "pBuffer");
        this.f150075h = true;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(f(userName));
        if (!(valueOf.booleanValue() && i17 > 0 && i18 > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            java.util.ArrayList<com.tencent.mm.plugin.multitalk.model.b0> arrayList = this.f150068a;
            if (arrayList != null) {
                for (com.tencent.mm.plugin.multitalk.model.b0 b0Var : arrayList) {
                    com.tencent.mm.plugin.multitalk.model.a0 d17 = b0Var.d(i27);
                    if (d17 != null) {
                        this.f150076i = i27;
                        com.tencent.mm.plugin.multitalk.model.h3 h3Var = this.f150071d;
                        d(h3Var, pBuffer, i17, i18);
                        h3Var.f149995c = i19;
                        h3Var.f149994b = i27;
                        android.graphics.Bitmap bitmap = h3Var.f149996d;
                        if (bitmap != null) {
                            d75.b.g(new com.tencent.mm.plugin.multitalk.model.j3(b0Var, d17, userName, bitmap, i19));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0283 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r25, byte[] r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.p3.b(java.lang.String, byte[], int, int, int, int):void");
    }

    public void c(java.lang.String userName, int[] pBuffer, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.multitalk.model.h3 h3Var;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(pBuffer, "pBuffer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f150068a;
        if (arrayList2 != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.multitalk.model.b0 b0Var = (com.tencent.mm.plugin.multitalk.model.b0) it.next();
                if (this.f150069b == 1 && kotlin.jvm.internal.o.b(userName, this.f150070c)) {
                    com.tencent.mm.plugin.multitalk.model.a0 a17 = com.tencent.mm.plugin.multitalk.model.b0.a(b0Var, 0, 1, null);
                    if (a17 != null) {
                        arrayList.add(a17);
                    }
                } else {
                    com.tencent.mm.plugin.multitalk.model.a0 b17 = b0Var.b(userName);
                    if (b17 != null) {
                        arrayList.add(b17);
                    }
                }
            }
        }
        java.util.ArrayList<com.tencent.mm.plugin.multitalk.model.a0> arrayList3 = arrayList.isEmpty() ^ true ? arrayList : null;
        if (arrayList3 != null) {
            for (com.tencent.mm.plugin.multitalk.model.a0 a0Var : arrayList3) {
                if (this.f150069b == 1 && kotlin.jvm.internal.o.b(a0Var.getF150344m(), this.f150070c)) {
                    h3Var = this.f150071d;
                } else {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f150072e;
                    if (concurrentHashMap.get(a0Var.getF150344m()) == null) {
                        com.tencent.mm.plugin.multitalk.model.h3 h3Var2 = new com.tencent.mm.plugin.multitalk.model.h3(a0Var.getF150344m(), 0, 0, null, 14, null);
                        concurrentHashMap.put(a0Var.getF150344m(), h3Var2);
                        h3Var = h3Var2;
                    } else {
                        h3Var = (com.tencent.mm.plugin.multitalk.model.h3) concurrentHashMap.get(a0Var.getF150344m());
                    }
                }
                if (h3Var != null) {
                    d(h3Var, pBuffer, i17, i18);
                    h3Var.f149995c = i19;
                    h3Var.f149994b = i27;
                    android.graphics.Bitmap bitmap = h3Var.f149996d;
                    if (bitmap != null) {
                        d75.b.g(new com.tencent.mm.plugin.multitalk.model.o3(arrayList3, userName, bitmap, i27, i19));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r1.getHeight() != r23) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(com.tencent.mm.plugin.multitalk.model.h3 r20, int[] r21, int r22, int r23) {
        /*
            r19 = this;
            r0 = r20
            r8 = r22
            r9 = r23
            java.lang.String r10 = "error happened in set pixel while w is "
            monitor-enter(r19)
            android.graphics.Bitmap r1 = r0.f149996d     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L21
            kotlin.jvm.internal.o.d(r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Lcb
            if (r1 != r8) goto L21
            android.graphics.Bitmap r1 = r0.f149996d     // Catch: java.lang.Throwable -> Lcb
            kotlin.jvm.internal.o.d(r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> Lcb
            if (r1 == r9) goto L8b
        L21:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lcb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: java.lang.Throwable -> Lcb
            r2.add(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.ThreadLocal r1 = zj0.c.f473285a     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> Lcb
            r2.add(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)     // Catch: java.lang.Throwable -> Lcb
            r2.add(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r1 = new java.lang.Object     // Catch: java.lang.Throwable -> Lcb
            r1.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.util.Collections.reverse(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object[] r12 = r2.toArray()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = "com/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer"
            java.lang.String r14 = "refreshBitmap"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer$BitmapHolder;[III)V"
            java.lang.String r16 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r17 = "createBitmap"
            java.lang.String r18 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r11 = r1
            yj0.a.d(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lcb
            r4 = 1
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lcb
            r5 = 2
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lcb
            android.graphics.Bitmap$Config r2 = (android.graphics.Bitmap.Config) r2     // Catch: java.lang.Throwable -> Lcb
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r3, r4, r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = "com/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer"
            java.lang.String r14 = "refreshBitmap"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer$BitmapHolder;[III)V"
            java.lang.String r16 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r17 = "createBitmap"
            java.lang.String r18 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r11 = r1
            r12 = r2
            yj0.a.e(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lcb
            r0.f149996d = r2     // Catch: java.lang.Throwable -> Lcb
        L8b:
            android.graphics.Bitmap r11 = r0.f149996d     // Catch: java.lang.Throwable -> Lcb
            if (r11 == 0) goto Lc9
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r11
            r1 = r21
            r3 = r22
            r6 = r22
            r7 = r23
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lcb
            goto Lc9
        L9f:
            java.lang.String r0 = "VideoDisplayDataMuxer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r1.<init>(r10)     // Catch: java.lang.Throwable -> Lcb
            r1.append(r8)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " and h is "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            r1.append(r9)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " and bitmap bound is "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            int r2 = r11.getWidth()     // Catch: java.lang.Throwable -> Lcb
            int r3 = r11.getHeight()     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2 * r3
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcb
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lcb
        Lc9:
            monitor-exit(r19)
            return
        Lcb:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.p3.d(com.tencent.mm.plugin.multitalk.model.h3, int[], int, int):void");
    }

    public final void e(com.tencent.mm.plugin.multitalk.model.b0 targetContainer) {
        kotlin.jvm.internal.o.g(targetContainer, "targetContainer");
        java.util.ArrayList arrayList = this.f150068a;
        boolean z17 = false;
        if (arrayList != null && arrayList.contains(targetContainer)) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        if (this.f150068a == null) {
            this.f150068a = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = this.f150068a;
        if (arrayList2 != null) {
            arrayList2.add(targetContainer);
        }
    }

    public final boolean f(java.lang.String str) {
        return this.f150069b == 2 && kotlin.jvm.internal.o.b(str, this.f150070c);
    }

    public final void g(int i17, java.lang.String largeHostName) {
        kotlin.jvm.internal.o.g(largeHostName, "largeHostName");
        com.tencent.mm.sdk.platformtools.Log.c("VideoDisplayDataMuxer", "setLargeTargetState " + i17, new java.lang.Object[0]);
        this.f150069b = i17;
        this.f150070c = largeHostName;
    }

    public final void h(com.tencent.mm.plugin.multitalk.model.b0 targetContainer) {
        kotlin.jvm.internal.o.g(targetContainer, "targetContainer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f150068a;
        if (arrayList2 != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.multitalk.model.b0 b0Var = (com.tencent.mm.plugin.multitalk.model.b0) it.next();
                if (!kotlin.jvm.internal.o.b(b0Var, targetContainer)) {
                    arrayList.add(b0Var);
                }
            }
        }
        this.f150068a = arrayList;
    }
}
