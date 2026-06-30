package oc5;

/* loaded from: classes12.dex */
public final class g0 {

    /* renamed from: s, reason: collision with root package name */
    public static final oc5.s f344416s = new oc5.s(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f344417a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f344418b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f344419c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f344420d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f344421e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f344422f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f344423g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f344424h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Long f344425i;

    /* renamed from: j, reason: collision with root package name */
    public long f344426j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f344427k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f344428l;

    /* renamed from: m, reason: collision with root package name */
    public long f344429m;

    /* renamed from: n, reason: collision with root package name */
    public ry3.l f344430n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f344431o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeResultEventListener$1 f344432p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeFailEventListener$1 f344433q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mNotifyDealQBarStrResultListener$1 f344434r;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeResultEventListener$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeFailEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mNotifyDealQBarStrResultListener$1] */
    public g0(android.app.Activity context, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f344418b = true;
        this.f344420d = new java.util.HashMap();
        this.f344421e = new java.util.HashMap();
        this.f344422f = new java.util.HashMap();
        this.f344423g = new java.util.HashMap();
        this.f344424h = new java.util.HashMap();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r17 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeResultEventListener$1
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent event = recogQBarOfImageFileResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                oc5.s.a(oc5.g0.f344416s, new oc5.z(oc5.g0.this, event));
                return false;
            }
        };
        this.f344432p = r17;
        ?? r27 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeFailEventListener$1
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent event = recogQBarOfImageFileFailedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                oc5.s.a(oc5.g0.f344416s, new oc5.y(oc5.g0.this, event));
                return false;
            }
        };
        this.f344433q = r27;
        ?? r37 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mNotifyDealQBarStrResultListener$1
            {
                this.__eventId = 1280295539;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
                com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent event = notifyDealQBarStrResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                oc5.g0 g0Var = oc5.g0.this;
                g0Var.getClass();
                java.lang.String str2 = event.f54539g.f7166a;
                if (str2 == null) {
                    str2 = "";
                }
                java.util.ArrayList<oc5.o> arrayList = (java.util.ArrayList) g0Var.f344424h.get(str2);
                if (arrayList != null) {
                    for (oc5.o oVar : arrayList) {
                        if (oVar != null) {
                            oVar.a(event);
                        }
                    }
                }
                g0Var.f344423g.remove(str2);
                return false;
            }
        };
        this.f344434r = r37;
        this.f344417a = context;
        this.f344418b = z17;
        this.f344419c = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanCodeManager", "scanCode enableScan: %b, talker: %s", java.lang.Boolean.valueOf(z17), str);
        if (z17) {
            r17.alive();
            r27.alive();
            r37.alive();
        }
    }

    public final boolean a(oc5.t tVar) {
        if (tVar != null && tVar.f344481i) {
            return false;
        }
        return tVar != null && tVar.f344477e == 1;
    }

    public final void b(oc5.l0 codeResult, com.tencent.mm.plugin.scanner.ImageQBarDataBean codePointInfo, oc5.o oVar) {
        kotlin.jvm.internal.o.g(codeResult, "codeResult");
        kotlin.jvm.internal.o.g(codePointInfo, "codePointInfo");
        java.lang.String str = codePointInfo.f158619d;
        if (str == null) {
            str = "";
        }
        java.util.HashMap hashMap = this.f344424h;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new java.util.ArrayList());
        }
        java.lang.Object obj = hashMap.get(str);
        kotlin.jvm.internal.o.d(obj);
        if (!((java.util.ArrayList) obj).contains(oVar)) {
            java.lang.Object obj2 = hashMap.get(str);
            kotlin.jvm.internal.o.d(obj2);
            ((java.util.ArrayList) obj2).add(oVar);
        }
        this.f344423g.put(str, codeResult);
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        android.app.Activity activity = this.f344417a;
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = activity;
        r3Var.f7780a = codePointInfo.f158619d;
        r3Var.f7782c = codePointInfo.f158620e;
        r3Var.f7783d = codePointInfo.f158621f;
        r3Var.f7788i = 37;
        int i17 = codeResult.f344456f;
        if (i17 != -1) {
            r3Var.f7788i = i17;
        }
        r3Var.f7786g = 4;
        int i18 = codeResult.f344457g;
        if (i18 != -1) {
            r3Var.f7786g = i18;
        }
        r3Var.f7785f = codeResult.f344458h;
        r3Var.f7784e = codeResult.f344459i;
        r3Var.f7790k = codeResult.f344461k;
        r3Var.f7789j = codeResult.f344462l;
        r3Var.f7791l = codeResult.f344460j;
        r3Var.f7792m = codeResult.f344463m;
        r45.db0 db0Var = new r45.db0();
        r45.bx5 bx5Var = new r45.bx5();
        java.lang.String str2 = this.f344419c;
        bx5Var.f371133e = com.tencent.mm.storage.z3.p4(str2) ? 4 : (com.tencent.mm.storage.z3.m4(str2) || c01.e2.R(str2)) ? 2 : c01.e2.G(str2) ? 3 : 1;
        db0Var.f372281d = bx5Var;
        java.lang.String str3 = codeResult.f344464n;
        db0Var.f372282e = str3 != null ? str3 : "";
        r3Var.f7795p = db0Var;
        r3Var.f7798s = codePointInfo.f158626n;
        r3Var.f7797r = codePointInfo.f158625m;
        r3Var.f7796q = codePointInfo.f158630r;
        r3Var.f7794o = codeResult.f344454d;
        dealQBarStrEvent.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(oc5.t r11, oc5.n r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc5.g0.c(oc5.t, oc5.n):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.graphics.Bitmap d(oc5.t tVar, db5.f0 f0Var, android.graphics.Bitmap bitmap, android.graphics.Point point) {
        android.graphics.Rect rect;
        android.graphics.Bitmap bitmap2 = null;
        android.graphics.Point point2 = bitmap != null ? new android.graphics.Point(bitmap.getWidth(), bitmap.getHeight()) : null;
        if (bitmap == null || point2 == null || point2.x != point.x || point2.y != point.y) {
            try {
                android.view.Window window = this.f344417a.getWindow();
                android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(window != null ? window.getDecorView() : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanCodeManager", "getScreenCropBitmap try to screenShot, result: " + b07);
                tVar.f344480h = true;
                return b07;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImageScanCodeManager", th6, "getScreenCropBitmap exception", new java.lang.Object[0]);
                return null;
            }
        }
        boolean z17 = f0Var instanceof android.view.View;
        android.graphics.PointF c17 = e04.i3.c(z17 ? (android.view.View) f0Var : null, 0.0f, 0.0f);
        android.graphics.PointF c18 = e04.i3.c(z17 ? (android.view.View) f0Var : null, (z17 ? (android.view.View) f0Var : null) != null ? r8.getMeasuredWidth() : 0.0f, (z17 ? (android.view.View) f0Var : null) != null ? r11.getMeasuredHeight() : 0.0f);
        if (c17 == null || c18 == null) {
            rect = new android.graphics.Rect(0, 0, point.x, point.y);
        } else {
            int max = java.lang.Integer.max((int) (c17.x * point.x), 0);
            int max2 = java.lang.Integer.max((int) (c17.y * point.y), 0);
            rect = new android.graphics.Rect(max, max2, java.lang.Integer.min(java.lang.Integer.max((int) (c18.x * point.x), max), point.x), java.lang.Integer.min(java.lang.Integer.max((int) (c18.y * point.y), max2), point.y));
        }
        rect.toString();
        if (rect.width() == 0 || rect.height() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageScanCodeManager", "getScreenCropBitmap cropRect invalid, use sourceBitmap");
            return bitmap;
        }
        try {
            bitmap2 = com.tencent.mm.sdk.platformtools.x.Z(bitmap, rect, false);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImageScanCodeManager", th7, "getBitmapFromRect exception", new java.lang.Object[0]);
        }
        if (bitmap2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageScanCodeManager", "getScreenCropBitmap cropBitmap null, use sourceBitmap");
            return bitmap;
        }
        bitmap2.toString();
        tVar.f344480h = true;
        return bitmap2;
    }

    public final void e(oc5.t tVar) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (tVar.f344480h && tVar.f344482j && (bitmap = tVar.f344476d) != null) {
            kotlin.jvm.internal.o.d(bitmap);
            if (bitmap.isRecycled() || (bitmap2 = tVar.f344476d) == null) {
                return;
            }
            bitmap2.recycle();
        }
    }

    public final void f() {
        if (this.f344418b) {
            dead();
            dead();
            dead();
        }
        oc5.s.a(f344416s, new oc5.d0(this));
        java.util.Set<java.lang.String> keySet = this.f344423g.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str : keySet) {
            com.tencent.mm.autogen.events.CancelDealQBarStrEvent cancelDealQBarStrEvent = new com.tencent.mm.autogen.events.CancelDealQBarStrEvent();
            android.app.Activity activity = this.f344417a;
            am.p1 p1Var = cancelDealQBarStrEvent.f54025g;
            p1Var.f7594b = activity;
            p1Var.f7593a = str;
            cancelDealQBarStrEvent.e();
        }
        this.f344424h.clear();
    }

    public final void g(long j17, java.lang.String str) {
        if (this.f344431o) {
            return;
        }
        this.f344431o = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportCodeMenuItemExpose id: ");
        sb6.append(j17);
        sb6.append(", source: ");
        sb6.append(str);
        sb6.append(", codeItemDelayShowCost: ");
        sb6.append(this.f344429m);
        sb6.append(", initCost: ");
        ry3.l lVar = this.f344430n;
        sb6.append(lVar != null ? java.lang.Long.valueOf(lVar.f401522a) : null);
        sb6.append(", decodeCost: ");
        ry3.l lVar2 = this.f344430n;
        sb6.append(lVar2 != null ? java.lang.Long.valueOf(lVar2.f401523b) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanCodeManager", sb6.toString());
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Long.valueOf(j17);
        oc5.p[] pVarArr = oc5.p.f344470d;
        objArr[1] = 1;
        objArr[2] = java.lang.Long.valueOf(this.f344429m);
        ry3.l lVar3 = this.f344430n;
        objArr[3] = java.lang.Long.valueOf(lVar3 != null ? lVar3.f401522a : -2L);
        ry3.l lVar4 = this.f344430n;
        objArr[4] = java.lang.Long.valueOf(lVar4 != null ? lVar4.f401523b : -1L);
        g0Var.d(37109, objArr);
    }

    public final void h(android.view.View view, long j17, java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, boolean z17, int i17, boolean z18, oc5.n nVar) {
        if (this.f344418b) {
            if (str2 == null || str2.length() == 0) {
                return;
            }
            oc5.s.a(f344416s, new oc5.e0(this, view, j17, str, str2, bitmap, z17, i17, z18, nVar));
        }
    }
}
