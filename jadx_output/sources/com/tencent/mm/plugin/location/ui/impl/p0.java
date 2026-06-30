package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class p0 extends com.tencent.mm.plugin.location.ui.impl.q2 implements za3.a1 {
    public final va3.t0 A1;
    public final i11.c B1;
    public final com.tencent.mm.sdk.event.IListener C1;
    public final java.util.HashMap D1;
    public android.widget.Button S;
    public com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView T;
    public com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker U;
    public android.view.View V;
    public com.tencent.mm.plugin.location.ui.TipSayingWidget W;
    public za3.i1 X;
    public final va3.v0 Y;
    public za3.b1 Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f144863l1;

    /* renamed from: p0, reason: collision with root package name */
    public za3.u0 f144864p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.ShareHeader f144865p1;

    /* renamed from: x0, reason: collision with root package name */
    public za3.g0 f144866x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f144867x1;

    /* renamed from: y0, reason: collision with root package name */
    public final i11.e f144868y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f144869y1;

    /* renamed from: z1, reason: collision with root package name */
    public final va3.u0 f144870z1;

    public p0(android.app.Activity activity) {
        super(activity);
        this.f144869y1 = 0L;
        this.f144870z1 = new com.tencent.mm.plugin.location.ui.impl.i0(this);
        this.A1 = new com.tencent.mm.plugin.location.ui.impl.j0(this);
        this.B1 = new com.tencent.mm.plugin.location.ui.impl.k0(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.C1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.location.ui.impl.RealTimeLocationUI$5
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent voipEvent2 = voipEvent;
                if (!gm0.j1.a()) {
                    return false;
                }
                if (voipEvent2.f54945g.f8415b == 3) {
                    com.tencent.mm.plugin.location.ui.impl.p0 p0Var = com.tencent.mm.plugin.location.ui.impl.p0.this;
                    p0Var.X.e(false);
                    va3.v0 v0Var = p0Var.Y;
                    v0Var.h();
                    v0Var.b(2);
                    p0Var.f144864p0.c();
                    p0Var.f144728d.finish();
                }
                return true;
            }
        };
        this.D1 = new java.util.HashMap();
        this.Y = va3.j0.Ri();
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f144868y0 = i11.h.e();
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void A() {
        za3.i1 i1Var = this.X;
        if (i1Var != null) {
            i1Var.f470956n = false;
            i1Var.d(false);
            this.T.setSelected(false);
        }
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void D() {
    }

    public int J() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f144867x1)) {
            if (this.f144867x1.equals("fromBanner")) {
                return 0;
            }
            if (this.f144867x1.equals("fromPluginLocation")) {
                return 1;
            }
            if (this.f144867x1.equals("fromPluginTalk")) {
                return 2;
            }
            if (this.f144867x1.equals("fromTrackButton")) {
                return 3;
            }
            if (this.f144867x1.equals("fromMessage")) {
                return 4;
            }
        }
        return 1;
    }

    public void K() {
        p();
        this.X.e(false);
        va3.v0 v0Var = this.Y;
        v0Var.h();
        v0Var.b(3);
        this.f144864p0.c();
        v0Var.f434368z = this.f144733i.f144804f.getZoom();
        this.f144728d.finish();
    }

    @Override // ab3.e
    public boolean a(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        j();
        this.f144728d.finish();
        return true;
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.a, ab3.e
    public void d() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "11", 0, 0, 0);
        this.Z.a();
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, ab3.e
    public void e(android.os.Bundle bundle) {
        super.e(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.RealTimeLocationUI", "onCreate");
        this.f144869y1 = java.lang.System.currentTimeMillis();
        this.C1.alive();
        android.app.Activity activity = this.f144728d;
        if (com.tencent.mm.ui.b4.c(activity)) {
            com.tencent.mm.ui.a4.g(this.f144865p1, true);
            com.tencent.mm.ui.a4.d(m(com.tencent.mm.R.id.ujf), false, true);
            com.tencent.mm.ui.a4.d(m(com.tencent.mm.R.id.oi8), false, true);
            new n3.m3(activity.getWindow(), activity.getWindow().getDecorView()).b(true);
        }
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, ab3.e
    public void f() {
        super.f();
        va3.u0 u0Var = this.f144870z1;
        va3.v0 v0Var = this.Y;
        java.util.HashSet hashSet = v0Var.f434353h;
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((va3.u0) weakReference.get()).equals(u0Var)) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.C1.dead();
        v0Var.f434367y = null;
        za3.u0 u0Var2 = this.f144864p0;
        if (u0Var2 != null) {
            u0Var2.f471024d = null;
            ((dh4.f0) u0Var2.f471039v).r(u0Var2);
            com.tencent.mm.plugin.location.ui.VolumeMeter volumeMeter = u0Var2.f471026f;
            volumeMeter.f144680n.removeCallbacks(volumeMeter);
            volumeMeter.f144680n.post(volumeMeter.B);
        }
        za3.i1 i1Var = this.X;
        if (i1Var != null) {
            synchronized (za3.i1.f470942x) {
                java.util.List list = i1Var.f470944b;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                }
                i1Var.f470954l.clean();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RealTimeLocationUI", "onDestory");
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, ab3.e
    public boolean g(int i17, android.view.KeyEvent keyEvent) {
        return true;
    }

    @Override // ab3.e
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealTimeLocationUI", "pause");
        db5.m9.a(false, new android.content.Intent().putExtra("classname", com.tencent.mm.plugin.location.ui.impl.p0.class.getName()));
        i11.e eVar = this.f144744w;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f144875J);
        }
        android.os.PowerManager.WakeLock wakeLock = this.f144863l1;
        yj0.a.c(wakeLock, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock.release();
        yj0.a.f(wakeLock, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        va3.v0 v0Var = this.Y;
        if (!v0Var.f434360r) {
            ((i11.h) v0Var.f434351f).m(v0Var.K);
            v0Var.f434352g.c(v0Var.L);
            v0Var.f434361s = true;
            v0Var.A = true;
        }
        ab3.h hVar = this.f144733i.f144804f;
        v0Var.f434363u = v0Var.f434356n;
        v0Var.f434356n = 0;
        if (v0Var.d()) {
            v0Var.D = (hVar.getMapCenterX() * 1.0d) / 1000000.0d;
            v0Var.E = (hVar.getMapCenterY() * 1.0d) / 1000000.0d;
            v0Var.F = hVar.getZoom();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "17", 0, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f144869y1));
        this.f144869y1 = java.lang.System.currentTimeMillis();
        i11.e eVar2 = this.f144868y0;
        if (eVar2 != null) {
            ((i11.h) eVar2).m(this.B1);
        }
        za3.i1 i1Var = this.X;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // ab3.e
    public void i() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RealTimeLocationUI", "resume");
        db5.m9.a(true, new android.content.Intent().putExtra("classname", com.tencent.mm.plugin.location.ui.impl.p0.class.getName()));
        i11.e eVar = this.f144744w;
        if (eVar != null) {
            ((i11.h) eVar).j(this.f144875J, true);
        }
        android.os.PowerManager.WakeLock wakeLock = this.f144863l1;
        yj0.a.c(wakeLock, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        int J2 = J();
        va3.v0 v0Var = this.Y;
        if (v0Var.f434361s) {
            v0Var.B = java.lang.System.currentTimeMillis();
            ((i11.h) v0Var.f434351f).j(v0Var.K, true);
            v0Var.f434352g.a(v0Var.L);
        }
        if (v0Var.d()) {
            v0Var.f(J2, 0, true, false, false);
        }
        v0Var.f434361s = false;
        v0Var.g();
        ab3.h hVar = this.f144733i.f144804f;
        v0Var.f434356n = v0Var.f434363u;
        if (v0Var.D == -1000.0d || v0Var.E == -1000.0d || v0Var.F == -1) {
            z17 = false;
        } else {
            hVar.getIController().setCenter(v0Var.D, v0Var.E);
            hVar.getIController().setZoom(v0Var.F);
            z17 = true;
        }
        if (z17) {
            this.T.setSelected(false);
            za3.i1 i1Var = this.X;
            i1Var.f470956n = false;
            i1Var.f470948f = true;
        }
        ab3.h hVar2 = this.f144733i.f144804f;
        if (v0Var.f434368z != -1) {
            hVar2.getIController().setZoom(v0Var.f434368z);
        }
        i11.e eVar2 = this.f144868y0;
        if (eVar2 != null) {
            ((i11.h) eVar2).j(this.B1, true);
        }
        za3.i1 i1Var2 = this.X;
        if (i1Var2 != null) {
            i1Var2.c();
        }
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, com.tencent.mm.plugin.location.ui.impl.a
    public void j() {
        super.j();
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, com.tencent.mm.plugin.location.ui.impl.a
    public void k() {
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.a
    public int o() {
        return com.tencent.mm.R.layout.ccd;
    }

    @Override // d85.j0
    public void onBusinessPermissionDenied(java.lang.String str) {
        if (str.equals(d85.g0.LOCAION.f227192d)) {
            this.X.e(false);
            va3.v0 v0Var = this.Y;
            v0Var.h();
            v0Var.b(0);
            this.f144864p0.c();
            this.f144728d.finish();
        }
    }

    @Override // d85.j0
    public void onBusinessPermissionGranted(java.lang.String str) {
        this.f144728d.recreate();
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void y() {
        super.y();
        android.app.Activity activity = this.f144728d;
        this.f144863l1 = ((android.os.PowerManager) activity.getSystemService("power")).newWakeLock(26, "Track Lock");
        za3.l1 l1Var = this.B;
        if (l1Var != null) {
            l1Var.f470987m.setVisibility(4);
        }
        android.view.View m17 = m(com.tencent.mm.R.id.gy8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "initHeaderBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m17, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "initHeaderBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.U = (com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker) m(com.tencent.mm.R.id.cov);
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.f144741t.getViewManager().getTencentMap();
        if (tencentMap != null) {
            this.f144741t.enableIndoorLevelPick(false);
            tencentMap.setIndoorEnabled(false);
            if (n().getIntExtra("map_indoor_support", 0) == 1) {
                tencentMap.setIndoorEnabled(true);
                this.U.g1(tencentMap, null);
            }
        }
        com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView locationCrossHairView = (com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView) m(com.tencent.mm.R.id.f485687in2);
        this.T = locationCrossHairView;
        locationCrossHairView.setSelected(true);
        this.T.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.l0(this));
        this.V = m(com.tencent.mm.R.id.gy7);
        com.tencent.mm.plugin.location.ui.ShareHeader shareHeader = (com.tencent.mm.plugin.location.ui.ShareHeader) m(com.tencent.mm.R.id.msv);
        this.f144865p1 = shareHeader;
        shareHeader.setVisibility(0);
        this.f144865p1.setPadding(0, com.tencent.mm.ui.bl.h(activity), 0, 0);
        za3.g0 g0Var = new za3.g0(this.f144728d, this.f144865p1.getHeaderBar(), this.V, this.f144740s, this.f144733i.f144804f);
        this.f144866x0 = g0Var;
        g0Var.f470919h = new com.tencent.mm.plugin.location.ui.impl.m0(this);
        va3.t0 t0Var = this.A1;
        va3.v0 v0Var = this.Y;
        v0Var.f434367y = t0Var;
        if (this.X == null) {
            this.X = new za3.i1(activity, this.f144733i.f144804f, true);
        }
        this.X.getClass();
        this.X.f470949g = false;
        this.Z = new za3.b1(activity, this);
        this.W = (com.tencent.mm.plugin.location.ui.TipSayingWidget) m(com.tencent.mm.R.id.m_6);
        android.widget.Button button = (android.widget.Button) m(com.tencent.mm.R.id.mtf);
        this.S = button;
        button.setVisibility(0);
        za3.u0 u0Var = new za3.u0(activity, this.S, this.W);
        this.f144864p0 = u0Var;
        u0Var.f471040w = this.f144866x0;
        this.f144865p1.setOnLeftClickListener(new com.tencent.mm.plugin.location.ui.impl.n0(this));
        this.f144865p1.setOnRightClickListener(new com.tencent.mm.plugin.location.ui.impl.o0(this));
        v0Var.B = java.lang.System.currentTimeMillis();
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        v0Var.f434351f = e17;
        e17.j(v0Var.K, true);
        if (v0Var.f434352g == null) {
            v0Var.f434352g = va3.j0.Bi();
        }
        v0Var.f434352g.a(v0Var.L);
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f144731g;
        if (locationInfo != null) {
            v0Var.f434359q = locationInfo;
        }
        if (v0Var.f434362t) {
            com.tencent.mars.xlog.Log.i("MicorMsg.TrackRefreshManager", "start location " + v0Var.f434359q.f144586e + " " + v0Var.f434359q.f144587f);
        } else {
            v0Var.f434356n = 1;
            r45.mw6 mw6Var = new r45.mw6();
            v0Var.f434358p = mw6Var;
            mw6Var.f380873e = new r45.wa5();
            r45.wa5 wa5Var = v0Var.f434358p.f380873e;
            wa5Var.f389011d = -1000.0d;
            wa5Var.f389012e = -1000.0d;
            com.tencent.mars.xlog.Log.i("MicorMsg.TrackRefreshManager", "start location imp " + v0Var.f434359q.f144586e + " " + v0Var.f434359q.f144587f);
            gm0.j1.d().a(uc1.o.CTRL_INDEX, v0Var);
            gm0.j1.d().a(490, v0Var);
            gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.sensor.q.CTRL_INDEX, v0Var);
            v0Var.f434365w = false;
            v0Var.f434362t = true;
        }
        va3.u0 u0Var2 = this.f144870z1;
        java.util.HashSet hashSet = v0Var.f434353h;
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.add(new java.lang.ref.WeakReference(u0Var2));
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((va3.u0) weakReference.get()).equals(u0Var2)) {
                break;
            }
        }
        this.f144867x1 = activity.getIntent().getStringExtra("fromWhereShare");
        if (v0Var.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RealTimeLocationUI", "has join");
            this.X.e(true);
            this.f144864p0.d();
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new com.tencent.mm.plugin.location.ui.impl.g0(this))) {
            return;
        }
        java.lang.String str = this.f144740s;
        int J2 = J();
        com.tencent.mars.xlog.Log.i("MicorMsg.TrackRefreshManager", "track join %s", str);
        v0Var.f434364v = str;
        java.lang.String r17 = c01.z1.r();
        if (!str.contains("@chatroom")) {
            str = r17.compareTo(str) > 0 ? str.concat(r17) : r17.concat(str);
        }
        ya3.b bVar = new ya3.b(str);
        ((r45.v24) bVar.f460592e.f70710a.f70684a).f387826e = J2;
        gm0.j1.d().g(bVar);
    }
}
