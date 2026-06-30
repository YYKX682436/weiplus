package p05;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.k2 f350567a = new p05.k2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f350568b = (lp0.b.h() + "voip") + "/Models";

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.xlabeffect.IWaveVideoModelResMgr f350569c = new com.tencent.mm.plugin.xlabeffect.IWaveVideoModelResMgr();

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f350570d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f350571e;

    /* renamed from: f, reason: collision with root package name */
    public static int f350572f;

    static {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        f350570d = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f350571e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.plugin.xlabeffect.WaveVideoModelResMgr$checkResUpdateCacheFileEventListener$1
            {
                this.__eventId = 905296653;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = checkResUpdateCacheFileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.r2 r2Var = event.f54053g;
                int i17 = r2Var.f7759a;
                boolean z17 = r2Var.f7763e;
                if (i17 != 188 || !z17) {
                    return false;
                }
                int i18 = r2Var.f7760b;
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(r2Var.f7761c);
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                    p05.k2.f350567a.d(r2Var.f7761c, i18);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WaveVideoModelResMgr", "file not exits :%s", r2Var.f7761c);
                }
                return true;
            }
        };
    }

    public final java.lang.String a(int i17) {
        java.lang.String str = f350568b;
        if (i17 == 1) {
            return str + "/roi_facetext.xnet";
        }
        if (i17 == 2) {
            return str + "/roi_saliencymap.xnet";
        }
        if (i17 == 3) {
            return str + "/finder_sr.xnet";
        }
        if (i17 == 6) {
            return str + "/RaisrFilterbankCoefficients.bin";
        }
        if (i17 == 7) {
            return str + "/roi_c2c_face.xnet";
        }
        if (i17 != 8) {
            return null;
        }
        return str + "/RaisrLiteFilterbankCoefficients.bin";
    }

    public final java.lang.String b(int i17) {
        java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(188, i17);
        java.lang.Integer valueOf = Ni != null ? java.lang.Integer.valueOf(Ni.length()) : null;
        if (valueOf == null || !new e06.k(7, 256).m(valueOf.intValue())) {
            return "md5invalid";
        }
        java.lang.String substring = Ni.substring(valueOf.intValue() - 7);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WaveVideoModelResMgr", "prepareConfig subtype=" + i17 + " exptSwitch=" + i18);
        com.tencent.mm.plugin.xlabeffect.IWaveVideoModelResMgr iWaveVideoModelResMgr = f350569c;
        if (i17 == 1) {
            iWaveVideoModelResMgr.setExptSwitch(1, i18);
        } else {
            if (i17 != 2) {
                return;
            }
            iWaveVideoModelResMgr.setExptSwitch(2, i18);
        }
    }

    public final boolean d(java.lang.String str, int i17) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f350568b);
        if (!r6Var.m()) {
            try {
                r6Var.J();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WaveVideoModelResMgr", e17, "create modelPathDir failed:%s", r6Var);
                return false;
            }
        }
        java.lang.String a17 = a(i17);
        if (a17 != null && str != null) {
            r3 = com.tencent.mm.vfs.w6.d(str, a17, false) > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WaveVideoModelResMgr", "saveModelToModelRoot: from " + str + " to " + a17 + " results: " + r3);
        }
        return r3;
    }
}
