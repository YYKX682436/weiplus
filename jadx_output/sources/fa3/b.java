package fa3;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: J, reason: collision with root package name */
    public static fa3.b f260714J;
    public static final java.lang.Object K = new java.lang.Object();
    public java.util.Map A;
    public com.tencent.mm.plugin.lite.api.g B;
    public android.view.View E;
    public android.view.TextureView F;
    public android.util.Size H;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f260715a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f260716b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f260717c;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.api.MMSightRecordView f260724j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f260725k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f260726l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f260727m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f260728n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f260729o;

    /* renamed from: p, reason: collision with root package name */
    public float f260730p;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260718d = "back";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260719e = "auto";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260720f = ya.b.MEDIUM;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f260721g = "normal";

    /* renamed from: h, reason: collision with root package name */
    public int f260722h = 1080;

    /* renamed from: i, reason: collision with root package name */
    public int f260723i = 1920;

    /* renamed from: q, reason: collision with root package name */
    public boolean f260731q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f260732r = -1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f260733s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f260734t = false;

    /* renamed from: u, reason: collision with root package name */
    public long f260735u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f260736v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f260737w = true;

    /* renamed from: x, reason: collision with root package name */
    public long f260738x = 30;

    /* renamed from: y, reason: collision with root package name */
    public wu5.c f260739y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f260740z = false;
    public final java.util.Set C = new java.util.HashSet();
    public boolean D = true;
    public boolean G = false;
    public boolean I = false;

    public static void a(fa3.b bVar, java.lang.String str, com.tencent.mm.plugin.lite.api.g gVar) {
        bVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashMap.put("error", "stopRecord file not exist");
            gVar.a(hashMap);
            return;
        }
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        bVar.c(ai3.d.p(str), bVar.f260728n);
        bVar.f260727m = str;
        hashMap.put("tempThumbPath", bVar.f260728n);
        hashMap.put("tempVideoPath", bVar.f260727m);
        hashMap.put("timeout", java.lang.Boolean.valueOf(bVar.I));
        if (bVar.I) {
            gVar.e(hashMap);
        } else {
            gVar.a(hashMap);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "tempThumbPath:%s", bVar.f260728n);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "tempVideoPath:%s", bVar.f260727m);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "timeout:%s", java.lang.Boolean.valueOf(bVar.I));
        java.util.HashSet hashSet = (java.util.HashSet) bVar.C;
        hashSet.add(bVar.f260727m);
        hashSet.add(bVar.f260728n);
    }

    public static fa3.b e() {
        fa3.b bVar;
        synchronized (K) {
            if (f260714J == null) {
                f260714J = new fa3.b();
                ((be0.e) ((com.tencent.mm.feature.sight.api.n) i95.n0.c(com.tencent.mm.feature.sight.api.n.class))).wi();
            }
            bVar = f260714J;
        }
        return bVar;
    }

    public void b(boolean z17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCameraManager destroy");
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = this.f260724j;
        if (mMSightRecordView != null) {
            mMSightRecordView.setInitErrorCallback(null);
            this.f260724j.setInitDoneCallback(null);
            kt3.n nVar = (kt3.n) this.f260724j.f148832d;
            kt3.l lVar = nVar.f312007d;
            if (lVar != null) {
                lVar.release();
            }
            nVar.f312016p = null;
            this.f260724j = null;
            if (this.F != null) {
                this.f260716b.removeView(this.E);
                this.F = null;
                this.E = null;
            }
            this.f260732r = -1;
            this.f260730p = 0.0f;
            this.f260731q = false;
            this.f260733s = false;
            this.f260734t = false;
            this.f260737w = true;
            this.f260738x = 30L;
            this.f260739y = null;
            this.f260740z = false;
            this.A = null;
            this.B = null;
            this.D = true;
        }
        this.f260716b = null;
        this.f260715a = null;
        if (!z17 || (str = this.f260725k) == null || str.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "delete temp saved files in :%s", this.f260725k);
        java.util.HashSet hashSet = (java.util.HashSet) this.C;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2 != null && !str2.isEmpty()) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2));
                if (r6Var.m()) {
                    r6Var.l();
                }
            }
        }
        hashSet.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r2 > 100) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.graphics.Bitmap r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.LiteAppCameraManager"
            r1 = 0
            if (r8 == 0) goto L8e
            boolean r2 = r8.isRecycled()
            if (r2 != 0) goto L8e
            r8.getWidth()     // Catch: java.lang.Exception -> L80
            r8.getHeight()     // Catch: java.lang.Exception -> L80
            java.lang.String r2 = "normal"
            java.lang.String r3 = r7.f260721g     // Catch: java.lang.Exception -> L80
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L80
            r3 = 1
            if (r2 == 0) goto L1f
            r2 = 44
            goto L57
        L1f:
            java.lang.String r2 = "low"
            java.lang.String r4 = r7.f260721g     // Catch: java.lang.Exception -> L80
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L2c
            r2 = 25
            goto L57
        L2c:
            java.lang.String r2 = "original"
            java.lang.String r4 = r7.f260721g     // Catch: java.lang.Exception -> L80
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L80
            r4 = 100
            if (r2 == 0) goto L3a
        L38:
            r2 = r4
            goto L57
        L3a:
            java.lang.String r2 = r7.f260721g     // Catch: java.lang.Exception -> L4a
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Exception -> L4a
            r5 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r5
            int r2 = (int) r2
            if (r2 >= 0) goto L47
            r2 = r1
        L47:
            if (r2 <= r4) goto L57
            goto L38
        L4a:
            java.lang.String r2 = "mQuality %s is illegal"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L80
            java.lang.String r5 = r7.f260721g     // Catch: java.lang.Exception -> L80
            r4[r1] = r5     // Catch: java.lang.Exception -> L80
            com.tencent.mars.xlog.Log.e(r0, r2, r4)     // Catch: java.lang.Exception -> L80
            r2 = 90
        L57:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L80
            com.tencent.mm.sdk.platformtools.x.D0(r8, r2, r4, r9, r3)     // Catch: java.lang.Exception -> L80
            java.lang.String r8 = "bitmap filelenth %s"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L80
            long r5 = com.tencent.mm.vfs.w6.k(r9)     // Catch: java.lang.Exception -> L80
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L80
            r4[r1] = r9     // Catch: java.lang.Exception -> L80
            com.tencent.mars.xlog.Log.i(r0, r8, r4)     // Catch: java.lang.Exception -> L80
            java.lang.String r8 = "mQuality:%s, quality:%d"
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L80
            java.lang.String r4 = r7.f260721g     // Catch: java.lang.Exception -> L80
            r9[r1] = r4     // Catch: java.lang.Exception -> L80
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L80
            r9[r3] = r2     // Catch: java.lang.Exception -> L80
            com.tencent.mars.xlog.Log.i(r0, r8, r9)     // Catch: java.lang.Exception -> L80
            return r3
        L80:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "error for saveBitmapToImage %s"
            com.tencent.mars.xlog.Log.e(r0, r9, r8)
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fa3.b.c(android.graphics.Bitmap, java.lang.String):boolean");
    }

    public void d(final android.content.Context context, java.lang.String str, android.view.ViewGroup viewGroup, io.flutter.view.TextureRegistry textureRegistry, java.util.Map map, final com.tencent.mm.plugin.lite.api.g gVar) {
        int width;
        int height;
        ((be0.e) ((com.tencent.mm.feature.sight.api.n) i95.n0.c(com.tencent.mm.feature.sight.api.n.class))).wi();
        this.f260716b = viewGroup;
        this.f260715a = context;
        this.f260717c = str;
        f(map);
        android.content.Context context2 = this.f260715a;
        if (context2 instanceof android.app.Activity) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.app.Activity) this.f260715a).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            width = displayMetrics.widthPixels;
            height = displayMetrics.heightPixels;
        } else {
            android.view.Display defaultDisplay = ((android.view.WindowManager) context2.getSystemService("window")).getDefaultDisplay();
            width = defaultDisplay.getWidth();
            height = defaultDisplay.getHeight();
        }
        this.H = new android.util.Size(width, height);
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.CAMERA", 16, "", "", new j35.b0() { // from class: fa3.b$$b
            @Override // j35.b0
            public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                fa3.b bVar = fa3.b.this;
                bVar.getClass();
                int i18 = iArr[0];
                if (i18 == 0) {
                    if (i18 == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "get camera permission granted");
                    }
                } else {
                    final android.content.Context context3 = context;
                    db5.e1.C(context3, context3.getString(com.tencent.mm.R.string.mbo), context3.getString(com.tencent.mm.R.string.mbm), context3.getString(com.tencent.mm.R.string.mbp), context3.getString(com.tencent.mm.R.string.mbl), false, new android.content.DialogInterface.OnClickListener() { // from class: fa3.b$$c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                            dialogInterface.dismiss();
                            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                            j35.u.g(context3);
                        }
                    }, new fa3.b$$d());
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("error", "camera permission denied");
                    gVar.f(hashMap);
                    bVar.D = false;
                }
            }
        })) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "do not have camera permission");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "initalizeCamera");
        i();
        if (this.f260724j == null) {
            android.graphics.SurfaceTexture surfaceTexture = textureRegistry.createSurfaceTexture().surfaceTexture();
            this.f260724j = new com.tencent.mm.plugin.mmsight.api.MMSightRecordView(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.view.Surface(surfaceTexture), this.f260722h, this.f260723i);
            android.view.View inflate = android.view.LayoutInflater.from(this.f260715a).inflate(com.tencent.mm.R.layout.f489215dv0, (android.view.ViewGroup) null);
            this.E = inflate;
            android.view.TextureView textureView = (android.view.TextureView) inflate.findViewById(com.tencent.mm.R.id.o5m);
            this.F = textureView;
            textureView.setSurfaceTexture(surfaceTexture);
            this.f260716b.addView(this.E);
        }
        if (!this.G) {
            this.f260716b.setOnTouchListener(new fa3.e(this));
        }
        this.f260729o = false;
        l();
        ((kt3.n) this.f260724j.f148832d).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppRecordViewImpl", "set34PreviewVideoSize");
        this.f260724j.setDisplayRatio((this.f260722h * 1.0f) / this.f260723i);
        this.f260724j.setPreviewMode(1);
        this.f260724j.d(600000, 4800000, 30, 64000, 44100);
        this.f260724j.setVideoFilePath(this.f260727m);
        this.f260724j.setClipPictureSize(true);
        this.f260724j.setClipVideoSize(true);
        this.f260724j.setDisplayScreenSize(this.H);
        this.f260724j.setUseBackCamera("back".equals(this.f260718d));
        this.f260724j.setInitErrorCallback(new fa3.f(this, gVar));
        this.f260724j.setInitDoneCallback(new fa3.g(this, gVar));
        this.f260724j.f();
        this.f260724j.f148832d.getClass();
        this.f260732r = 1;
    }

    public void f(java.util.Map map) {
        if (map.containsKey("width")) {
            this.f260722h = ik1.w.c((int) java.lang.Math.round(java.lang.Double.parseDouble(map.get("width").toString())));
        }
        if (map.containsKey("height")) {
            this.f260723i = ik1.w.c((int) java.lang.Math.round(java.lang.Double.parseDouble(map.get("height").toString())));
        }
        if (map.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION)) {
            this.f260720f = map.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION).toString();
        }
        if (map.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION)) {
            this.f260718d = map.get(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION).toString();
        }
        if (map.containsKey("flash")) {
            this.f260719e = map.get("flash").toString();
        }
        if (map.containsKey("forbidGesture")) {
            java.lang.Object obj = map.get("forbidGesture");
            if (obj instanceof java.lang.Boolean) {
                this.G = ((java.lang.Boolean) obj).booleanValue();
            }
        }
    }

    public void g(java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera stopRecord");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (this.f260724j == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "recordView is null");
            hashMap.put("error", "recordView is null");
            gVar.a(hashMap);
            return;
        }
        if (this.f260732r == 2) {
            if (this.f260734t) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "recordView is IsStopping");
                hashMap.put("error", "is IsStopping");
                gVar.a(hashMap);
                return;
            } else {
                if (map.containsKey("compressed")) {
                    this.f260731q = ((java.lang.Boolean) map.get("compressed")).booleanValue();
                }
                this.f260734t = true;
                this.f260724j.h(new fa3.m(this, hashMap, gVar));
                return;
            }
        }
        if (!this.I) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppCameraManager", "stopRecord is not recording");
            hashMap.put("error", "is not recording, can not stop");
            gVar.a(hashMap);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppCameraManager", "has timeout just return path");
            hashMap.put("tempThumbPath", this.f260728n);
            hashMap.put("tempVideoPath", this.f260727m);
            hashMap.put("timeout", java.lang.Boolean.TRUE);
            gVar.a(hashMap);
            this.I = false;
        }
    }

    public final void h() {
        java.lang.String str;
        if (this.f260724j == null || (str = this.f260719e) == null) {
            return;
        }
        if (str.equals("auto")) {
            this.f260724j.setFlashMode(3);
            return;
        }
        if (this.f260719e.equals("torch")) {
            this.f260724j.setFlashMode(1);
            return;
        }
        if (!this.f260719e.equals("on")) {
            this.f260724j.setFlashMode(2);
        } else if (this.f260732r == 2 || !this.f260719e.equals("on")) {
            this.f260724j.setFlashMode(1);
        } else {
            this.f260724j.setFlashMode(2);
        }
    }

    public final void i() {
        java.lang.String str = this.f260725k;
        if (str == null || str.isEmpty()) {
            java.lang.String str2 = com.tencent.mm.plugin.lite.logic.y2.f(this.f260717c, null, null) + "LiteAppCamera";
            this.f260725k = str2;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
        }
        java.lang.String str4 = "MicroMsg_" + java.lang.System.currentTimeMillis();
        this.f260727m = this.f260725k + "/" + str4 + ".mp4";
        this.f260728n = this.f260725k + "/" + str4 + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        if (com.tencent.mm.vfs.w6.j(this.f260727m)) {
            return;
        }
        com.tencent.mm.vfs.w6.e(this.f260727m);
    }

    public void j(final java.util.Map map, final com.tencent.mm.plugin.lite.api.g gVar) {
        final android.content.Context context = this.f260715a;
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.RECORD_AUDIO", 80, "", "", new j35.b0() { // from class: fa3.b$$a
            @Override // j35.b0
            public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                fa3.b bVar = fa3.b.this;
                bVar.getClass();
                int i18 = iArr[0];
                com.tencent.mm.plugin.lite.api.g gVar2 = gVar;
                if (i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "get microphone permission granted");
                    bVar.f260740z = true;
                    bVar.A = map;
                    bVar.B = gVar2;
                    return;
                }
                final android.content.Context context2 = context;
                db5.e1.C(context2, context2.getString(com.tencent.mm.R.string.mbq), context2.getString(com.tencent.mm.R.string.mbn), context2.getString(com.tencent.mm.R.string.mbp), context2.getString(com.tencent.mm.R.string.mbl), false, new android.content.DialogInterface.OnClickListener() { // from class: fa3.b$$e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        dialogInterface.dismiss();
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        j35.u.g(context2);
                    }
                }, new fa3.b$$f());
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("error", "microPhone permission denied");
                gVar2.e(hashMap);
                bVar.D = false;
            }
        })) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera startRecord");
            java.util.HashMap hashMap = new java.util.HashMap();
            if (this.f260724j == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "recordView is null");
                hashMap.put("error", "recordView is null");
                gVar.e(hashMap);
                return;
            }
            if (this.f260732r == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "camera is already recording, can not takePhoto twice");
                hashMap.put("error", "camera is already recording");
                gVar.e(hashMap);
                return;
            }
            if (!this.f260729o) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "take photo err, isn't init done");
                hashMap.put("error", "camera has not initDone");
                gVar.e(hashMap);
                return;
            }
            if (map.containsKey("selfieMirror")) {
                this.f260737w = ((java.lang.Boolean) map.get("selfieMirror")).booleanValue();
            }
            if (map.containsKey("timeout")) {
                this.f260738x = java.lang.Long.parseLong(map.get("timeout").toString());
            }
            this.f260724j.g(this.f260737w, false);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f260736v = android.os.SystemClock.elapsedRealtime();
            this.f260732r = 2;
            ku5.u0 u0Var = ku5.t0.f312615d;
            fa3.k kVar = new fa3.k(this, map, gVar);
            long j17 = this.f260738x * 1000;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            this.f260739y = t0Var.z(kVar, j17, false);
            hashMap.put("tempThumbPath", this.f260728n);
            hashMap.put("tempVideoPath", this.f260727m);
            gVar.e(hashMap);
            this.I = false;
        }
    }

    public void k(java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        wu5.c cVar = this.f260739y;
        if (cVar != null) {
            cVar.cancel(false);
        }
        long j17 = this.f260736v;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 1500) {
            g(map, gVar);
            return;
        }
        long j18 = 1500 - elapsedRealtime;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "stopRecord in %d ms later", java.lang.Long.valueOf(j18));
        com.tencent.mm.sdk.platformtools.u3.i(new fa3.l(this, map, gVar), j18);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f260720f
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r1 = 720(0x2d0, float:1.009E-42)
            if (r0 != 0) goto L4b
            java.lang.String r0 = r5.f260720f
            int r2 = r0.hashCode()
            r3 = -1078030475(0xffffffffbfbe8f75, float:-1.488753)
            r4 = 1
            if (r2 == r3) goto L35
            r3 = 107348(0x1a354, float:1.50427E-40)
            if (r2 == r3) goto L2b
            r3 = 3202466(0x30dda2, float:4.48761E-39)
            if (r2 == r3) goto L21
            goto L3f
        L21:
            java.lang.String r2 = "high"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3f
            r0 = 0
            goto L40
        L2b:
            java.lang.String r2 = "low"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3f
            r0 = r4
            goto L40
        L35:
            java.lang.String r2 = "medium"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3f
            r0 = 2
            goto L40
        L3f:
            r0 = -1
        L40:
            if (r0 == 0) goto L48
            if (r0 == r4) goto L45
            goto L4b
        L45:
            r0 = 480(0x1e0, float:6.73E-43)
            goto L4a
        L48:
            r0 = 1080(0x438, float:1.513E-42)
        L4a:
            r1 = r0
        L4b:
            com.tencent.mm.plugin.mmsight.api.MMSightRecordView r0 = r5.f260724j
            r0.setPreviewSizeLimit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa3.b.l():void");
    }
}
