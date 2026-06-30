package fa3;

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f260707a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f260708b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f260709c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f260710d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.lite.api.g f260711e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f260712f;

    /* renamed from: g, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry f260713g;

    public a(java.lang.String str, long j17, long j18, android.content.Context context, android.view.ViewGroup viewGroup, io.flutter.view.TextureRegistry textureRegistry, java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f260712f = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper create appId:%s, appUuid:%d, pageId:%d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        this.f260707a = str;
        this.f260708b = context;
        this.f260709c = viewGroup;
        this.f260710d = map;
        this.f260711e = gVar;
        this.f260713g = textureRegistry;
        fa3.b.e().d(context, str, viewGroup, textureRegistry, this.f260710d, gVar);
        this.f260712f = false;
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper destroyCamera, isDestroyed:%b", java.lang.Boolean.valueOf(this.f260712f));
        fa3.b.e().b(z17);
        this.f260712f = true;
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper initCamera, isDestroyed:%b", java.lang.Boolean.valueOf(this.f260712f));
        if (this.f260712f && fa3.b.e().D) {
            fa3.b.e().d(this.f260708b, this.f260707a, this.f260709c, this.f260713g, this.f260710d, this.f260711e);
            this.f260712f = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.util.Map r7, com.tencent.mm.plugin.lite.api.g r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.LiteAppCameraHelper"
            java.lang.String r1 = "LiteAppCameraHelper setZoom"
            com.tencent.mars.xlog.Log.i(r0, r1)
            fa3.b r0 = fa3.b.e()
            r0.getClass()
            java.lang.String r1 = "zoom"
            boolean r2 = r7.containsKey(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L49
            java.lang.Object r7 = r7.get(r1)
            boolean r2 = r7 instanceof java.lang.Integer
            if (r2 == 0) goto L28
            java.lang.Integer r7 = (java.lang.Integer) r7
            float r7 = r7.floatValue()
            goto L4a
        L28:
            boolean r2 = r7 instanceof java.lang.Double
            if (r2 == 0) goto L33
            java.lang.Double r7 = (java.lang.Double) r7
            float r7 = r7.floatValue()
            goto L4a
        L33:
            boolean r2 = r7 instanceof java.lang.Float
            if (r2 == 0) goto L3e
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            goto L4a
        L3e:
            boolean r2 = r7 instanceof java.lang.String
            if (r2 == 0) goto L49
            java.lang.String r7 = (java.lang.String) r7
            float r7 = java.lang.Float.parseFloat(r7)
            goto L4a
        L49:
            r7 = r3
        L4a:
            java.lang.Float r2 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r4 = "MicroMsg.LiteAppCameraManager"
            java.lang.String r5 = "LiteAppCamera setZoom: %f"
            com.tencent.mars.xlog.Log.i(r4, r5, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.tencent.mm.plugin.mmsight.api.MMSightRecordView r4 = r0.f260724j
            if (r4 == 0) goto L9e
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L71
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r2.put(r1, r7)
            r8.c(r2)
            goto La9
        L71:
            r3 = 1092616192(0x41200000, float:10.0)
            float r7 = r7 * r3
            int r7 = java.lang.Math.round(r7)
            float r7 = (float) r7
            float r7 = r7 / r3
            float r3 = r0.f260730p
            int r4 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r4 <= 0) goto L81
            r7 = r3
        L81:
            com.tencent.mm.plugin.mmsight.api.MMSightRecordView r3 = r0.f260724j
            boolean r3 = r3.e(r7)
            if (r3 != 0) goto L93
            r3 = 0
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L93
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r7 = r7 - r3
            goto L81
        L93:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r2.put(r1, r7)
            r8.c(r2)
            goto La9
        L9e:
            java.lang.String r7 = "error"
            java.lang.String r0 = "view is null"
            r2.put(r7, r0)
            r8.c(r2)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa3.a.c(java.util.Map, com.tencent.mm.plugin.lite.api.g):void");
    }

    public void d(java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper takePhoto");
        fa3.b e17 = fa3.b.e();
        e17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera takePhoto");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (e17.f260724j == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "recordView is null");
            hashMap.put("error", "recordView is null");
            gVar.d(hashMap);
            return;
        }
        if (e17.f260732r == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "camera is recording, can not takePhoto");
            hashMap.put("error", "camera is recording");
            gVar.d(hashMap);
            return;
        }
        if (!e17.f260733s) {
            long j17 = e17.f260735u;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 >= 100) {
                if (!e17.f260729o) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "take photo err, isn't init done");
                    hashMap.put("error", "camera has not initDone");
                    gVar.d(hashMap);
                    return;
                }
                e17.f260735u = android.os.SystemClock.elapsedRealtime();
                e17.f260733s = true;
                e17.f260732r = 3;
                if (map.containsKey("quality")) {
                    java.lang.Object obj = map.get("quality");
                    if (obj instanceof java.lang.String) {
                        e17.f260721g = (java.lang.String) obj;
                    } else if (obj instanceof java.lang.Integer) {
                        e17.f260721g = java.lang.Integer.toString(((java.lang.Integer) obj).intValue());
                    } else if (obj instanceof java.lang.Float) {
                        e17.f260721g = java.lang.Float.toString(((java.lang.Float) obj).floatValue());
                    } else if (obj instanceof java.lang.Double) {
                        e17.f260721g = java.lang.Double.toString(((java.lang.Double) obj).doubleValue());
                    }
                }
                if (map.containsKey("selfieMirror")) {
                    e17.f260737w = ((java.lang.Boolean) map.get("selfieMirror")).booleanValue();
                }
                java.lang.String str = e17.f260725k;
                if (str == null || str.isEmpty()) {
                    java.lang.String str2 = com.tencent.mm.plugin.lite.logic.y2.f(e17.f260717c, null, null) + "LiteAppCamera";
                    e17.f260725k = str2;
                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
                    java.lang.String str3 = a17.f213279f;
                    if (str3 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                        if (!str3.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                    com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
                    if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                        com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                        if (m18.a()) {
                            m18.f213266a.r(m18.f213267b);
                        }
                    }
                }
                java.lang.String str4 = e17.f260725k + "/" + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg");
                e17.f260726l = str4;
                ((java.util.HashSet) e17.C).add(str4);
                e17.f260724j.j(new fa3.j(e17, hashMap, gVar), "on".equals(e17.f260719e), false);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "not the right time to take photo");
        hashMap.put("error", "is taking photo now");
        gVar.d(hashMap);
    }

    public void e(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper updateCamera, isDestroyed:%b", java.lang.Boolean.valueOf(this.f260712f));
        if (fa3.b.e().D) {
            if (map.get("width").toString().equals(this.f260710d.get("width").toString()) && map.get("height").toString().equals(this.f260710d.get("height").toString())) {
                fa3.b e17 = fa3.b.e();
                if (e17.f260724j != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", tb1.t0.NAME);
                    if (!e17.f260718d.equals(map.get(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION).toString())) {
                        e17.f260724j.i();
                    }
                    e17.f(map);
                    e17.l();
                    e17.h();
                    if (e17.G) {
                        e17.f260716b.setOnTouchListener(new fa3.i(e17));
                    } else {
                        e17.f260716b.setOnTouchListener(new fa3.h(e17));
                    }
                }
            } else {
                fa3.b.e().b(false);
                fa3.b.e().d(this.f260708b, this.f260707a, this.f260709c, this.f260713g, map, this.f260711e);
                this.f260712f = false;
            }
            this.f260710d = map;
        }
    }
}
