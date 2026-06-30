package com.tencent.mm.plugin.voip.model;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.model.s1 f176798a = new com.tencent.mm.plugin.voip.model.s1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f176799b = (lp0.b.h() + "voip") + "/Models";

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f176800c = kz5.c1.k(new jz5.l(3, "cldnn_ns_16k.bin"), new jz5.l(4, "cldnn_ns_48k.bin"), new jz5.l(7, "rnnhowlsup_16k.bin"), new jz5.l(8, "cldnnhowlsup_16k.bin"), new jz5.l(9, "cldnnhowlsup_48k.bin"), new jz5.l(10, "channels_ns_16k.bin"), new jz5.l(11, "channels_ns_48k.bin"), new jz5.l(12, "tfunet_aec_16k.xnet"), new jz5.l(13, "cfn_ns_16k.xnet"), new jz5.l(14, "mcfusion_aec_16k.xnet"), new jz5.l(15, "mcfusion_aec_32k.xnet"), new jz5.l(16, "mcfusion_aec_16k_asr.xnet"));

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.plugin.voip.model.VoipModelResMgr$checkResUpdateCacheFileEventListener$1
            {
                this.__eventId = 905296653;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = checkResUpdateCacheFileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.r2 r2Var = event.f54053g;
                if (r2Var.f7759a != 112 || !r2Var.f7763e) {
                    return false;
                }
                int i17 = r2Var.f7760b;
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(r2Var.f7761c);
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    com.tencent.mm.plugin.voip.model.s1 s1Var = com.tencent.mm.plugin.voip.model.s1.f176798a;
                    s1Var.a();
                    java.util.Map map = com.tencent.mm.plugin.voip.model.s1.f176800c;
                    java.lang.String str2 = (java.lang.String) map.get(java.lang.Integer.valueOf(i17));
                    if (str2 != null) {
                        java.lang.String str3 = com.tencent.mm.plugin.voip.model.s1.f176799b + '/' + str2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoipModelResMgr", "Copying file: " + r2Var.f7761c + " to " + str3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoipModelResMgr", "Copy result: " + (com.tencent.mm.vfs.w6.d(r2Var.f7761c, str3, false) > 0));
                    }
                    s1Var.a();
                    java.util.Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(112, intValue);
                        java.lang.String str4 = (java.lang.String) map.get(java.lang.Integer.valueOf(intValue));
                        if (str4 != null) {
                            java.lang.String str5 = com.tencent.mm.plugin.voip.model.s1.f176799b + '/' + str4;
                            com.tencent.mars.xlog.Log.i("MicroMsg.VoipModelResMgr", "Copying model: " + Bi + " to " + str5);
                            long d17 = com.tencent.mm.vfs.w6.d(Bi, str5, false);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Copy result: ");
                            sb6.append(d17);
                            com.tencent.mars.xlog.Log.i("MicroMsg.VoipModelResMgr", sb6.toString());
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoipModelResMgr", "file not exits: " + r2Var.f7761c);
                }
                return true;
            }
        };
    }

    public final void a() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipModelResMgr", "Directory creation result: " + com.tencent.mm.vfs.w6.u(f176799b));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipModelResMgr", e17, "Failed to create model directory", new java.lang.Object[0]);
        }
    }

    public final void b(java.lang.StringBuilder stringBuilder) {
        kotlin.jvm.internal.o.g(stringBuilder, "stringBuilder");
        stringBuilder.append(f176799b);
    }

    public final void c(java.lang.StringBuilder stringBuilder, int i17, int i18) {
        kotlin.jvm.internal.o.g(stringBuilder, "stringBuilder");
        java.lang.String str = (java.lang.String) f176800c.get(java.lang.Integer.valueOf(i18));
        if (str == null) {
            stringBuilder.append(((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(i17, i18));
            return;
        }
        com.tencent.mm.plugin.voip.model.t1 t1Var = com.tencent.mm.plugin.voip.model.u1.f176806d;
        try {
            t1Var.a();
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(com.tencent.mm.plugin.voip.model.u1.f176807e + '/' + t1Var.b(t1Var.c(str)));
            if (p17 == null) {
                p17 = "";
            }
            if (p17.length() >= 7) {
                p17 = p17.substring(p17.length() - 7);
                kotlin.jvm.internal.o.f(p17, "substring(...)");
            }
            stringBuilder.append(p17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("VoipModelUdrMgr", "Failed to get MD5 for ".concat(str), e17);
            stringBuilder.append("");
        }
    }
}
