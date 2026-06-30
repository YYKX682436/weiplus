package n62;

@j95.b
/* loaded from: classes12.dex */
public class k extends i95.w {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f335196t;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.n3 f335197d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.ba f335198e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.fb f335199f;

    /* renamed from: g, reason: collision with root package name */
    public o62.a f335200g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f335201h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.j2 f335202i = new n62.e(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f335203m = new n62.f(this, android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f335204n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f335205o = new n62.g(this, android.os.Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public final l75.q0 f335206p = new n62.h(this);

    /* renamed from: q, reason: collision with root package name */
    public final l75.z0 f335207q = new n62.i(this);

    /* renamed from: r, reason: collision with root package name */
    public boolean f335208r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f335209s = false;

    static {
        int a17 = wo.r.a();
        try {
            if (!android.os.Build.CPU_ABI.contains("armeabi")) {
                com.tencent.mars.xlog.Log.e("hakon SilkCodec", "x86 machines not supported.");
            } else if ((a17 & 1024) != 0) {
                n62.k.class.getClassLoader();
                fp.d0.n("wechatvoicesilk");
            } else if ((a17 & 512) != 0) {
                com.tencent.mars.xlog.Log.e("hakon SilkCodec", "load library failed! silk don't support armv6!!!!");
            } else {
                com.tencent.mars.xlog.Log.e("hakon SilkCodec", "load library failed! silk don't support armv5!!!!");
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("hakon SilkCodec", "load library failed!");
        }
        f335196t = false;
    }

    public static com.tencent.mm.storage.n3 Ai() {
        gm0.j1.b().c();
        if (Di().f335197d == null) {
            Di().f335197d = new com.tencent.mm.storage.n3(c01.d9.b().s());
        }
        return Di().f335197d;
    }

    public static n62.k Di() {
        return (n62.k) i95.n0.c(n62.k.class);
    }

    public static o62.a Ni() {
        gm0.j1.b().c();
        if (Di().f335200g == null) {
            Di().f335200g = new o62.a(c01.d9.b().s());
        }
        return Di().f335200g;
    }

    public static com.tencent.mm.storage.ba Ri() {
        gm0.j1.b().c();
        if (Di().f335198e == null) {
            Di().f335198e = new com.tencent.mm.storage.ba(c01.d9.b().s());
        }
        return Di().f335198e;
    }

    public static com.tencent.mm.storage.fb Ui() {
        gm0.j1.b().c();
        if (Di().f335199f == null) {
            Di().f335199f = new com.tencent.mm.storage.fb(c01.d9.b().s());
        }
        return Di().f335199f;
    }

    public com.tencent.mm.storage.z3 Bi(long j17) {
        if (!gm0.j1.a() || j17 <= 0) {
            return null;
        }
        return ((com.tencent.mm.storage.k4) c01.d9.b().q()).p(j17);
    }

    public final void Vi(boolean z17) {
        if (this.f335208r) {
            if (z17 && this.f335209s) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "fromStartApp and already try to init");
            } else if (z17 || f335196t) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "initLocalVoiceControl,fromStartApp:%s,hasTryToInit:%s,hasCallApi:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f335209s), java.lang.Boolean.valueOf(f335196t));
                this.f335208r = false;
                gm0.j1.e().k(new n62.j(this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            }
        }
    }

    public void Zi(long j17, java.lang.String str) {
        boolean z17;
        if (j17 <= 0) {
            return;
        }
        try {
            com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) c01.d9.b().u();
            int i17 = 0;
            while (true) {
                java.util.List list = g9Var.f193981g;
                if (i17 >= ((java.util.LinkedList) list).size()) {
                    z17 = false;
                    break;
                } else {
                    if (((xg3.k0) ((java.util.LinkedList) list).get(i17)).c(j17)) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (z17) {
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).Ba(pt0.f0.Li(str, j17));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreExt", "msgId is out of range, " + j17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreExt", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreExt", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mm.pluginsdk.model.app.z Di = com.tencent.mm.pluginsdk.model.app.u5.Di();
        if (Di != null) {
            Di.add(this.f335206p);
        }
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        this.f335209s = d17.getBoolean("hasTryToInitVoiceControlData", false);
        f335196t = d17.getBoolean("hasCallVoiceControlApi", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "onAccountPostReset,hasTryToInit:%s,hasCallApi:%s", java.lang.Boolean.valueOf(this.f335209s), java.lang.Boolean.valueOf(f335196t));
        Vi(true);
        v62.e.d();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(gm0.j1.u().d());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
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
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(gm0.j1.u().d() + "image/ext/pcm");
        java.lang.String str2 = a18.f213279f;
        if (str2 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m19 = b3Var.m(a18, null);
        if (!(m19.a() ? m19.f213266a.F(m19.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m27 = b3Var.m(a18, m19);
            if (m27.a()) {
                m27.f213266a.r(m27.f213267b);
            }
        }
        java.lang.String d18 = gm0.j1.u().d();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "summerpcm accPath[%s] [%s]", d18, new com.tencent.mm.sdk.platformtools.z3());
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mm.pluginsdk.model.app.z Di = com.tencent.mm.pluginsdk.model.app.u5.Di();
        if (Di != null) {
            Di.remove(this.f335206p);
        }
        com.tencent.mm.autogen.events.ExtAgentLifeEvent extAgentLifeEvent = new com.tencent.mm.autogen.events.ExtAgentLifeEvent();
        extAgentLifeEvent.f54188g.getClass();
        if (!extAgentLifeEvent.e()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreExt", "ExtAgentLifeEvent event fail in onAccountRelease");
        }
        if (com.tencent.mm.pluginsdk.model.l2.f189362f == null) {
            com.tencent.mm.pluginsdk.model.l2.f189362f = new com.tencent.mm.pluginsdk.model.l2();
        }
        com.tencent.mm.pluginsdk.model.l2 l2Var = com.tencent.mm.pluginsdk.model.l2.f189362f;
        l2Var.getClass();
        if (gm0.j1.a()) {
            com.tencent.mm.pluginsdk.model.l2.f189361e = false;
            com.tencent.mm.pluginsdk.model.app.u5.Ai().a(14, l2Var);
        }
        java.util.HashSet hashSet = v62.e.f433502a;
    }

    public void wi(java.lang.String str, java.util.LinkedList linkedList) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || linkedList == null || linkedList.size() <= 0) {
            return;
        }
        if (com.tencent.mm.pluginsdk.model.l2.f189362f == null) {
            com.tencent.mm.pluginsdk.model.l2.f189362f = new com.tencent.mm.pluginsdk.model.l2();
        }
        com.tencent.mm.pluginsdk.model.l2 l2Var = com.tencent.mm.pluginsdk.model.l2.f189362f;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.pluginsdk.model.j2 j2Var = this.f335202i;
        l2Var.getClass();
        if (!com.tencent.mm.pluginsdk.model.l2.f189361e && gm0.j1.a()) {
            ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
            com.tencent.mm.pluginsdk.model.app.f Bi = zo3.p.Bi();
            Bi.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.app.g(Bi, 14, l2Var));
            com.tencent.mm.pluginsdk.model.l2.f189361e = true;
        }
        if (!gm0.j1.a() || context == null || linkedList.size() == 0) {
            return;
        }
        l2Var.f189363d = j2Var;
        com.tencent.mm.pluginsdk.model.k3 k3Var = new com.tencent.mm.pluginsdk.model.k3(str, linkedList);
        com.tencent.mm.pluginsdk.model.app.u5.Ai().getClass();
        gm0.j1.n().f273288b.g(new com.tencent.mm.pluginsdk.model.app.v3(14, k3Var));
    }
}
