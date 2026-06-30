package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.model.e f189277a = new com.tencent.mm.pluginsdk.model.e();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f189278b = jz5.h.b(com.tencent.mm.pluginsdk.model.c.f189244d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f189279c = jz5.h.b(com.tencent.mm.pluginsdk.model.d.f189269d);

    public final int a() {
        return (gm0.j1.h() && gm0.j1.a()) ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) f189278b).getValue()).intValue();
    }

    public final java.lang.String b() {
        int i17;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393261h) {
            i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
        } else if (r75.d.f393258e == -100) {
            i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
            r75.d.f393258e = i17;
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.tencent.mars.xlog.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f393258e);
            i17 = r75.d.f393258e;
        }
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE : "5g" : "4g" : "3g" : "2g" : "wifi" : com.eclipsesource.mmv8.Platform.UNKNOWN;
    }

    public final r45.dn c() {
        com.tencent.mm.protobuf.f fVar;
        byte[] j17;
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        if (R.f("k_TimelinePersonalCenterSettingInfo") && (j17 = R.j("k_TimelinePersonalCenterSettingInfo")) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.dn.class.newInstance();
                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                    fVar = (com.tencent.mm.protobuf.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
                return (r45.dn) fVar;
            }
        }
        fVar = null;
        return (r45.dn) fVar;
    }

    public final r45.jm6 d() {
        com.tencent.mm.protobuf.f fVar;
        byte[] j17;
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        if (R.f("k_TimelineSettingInfo") && (j17 = R.j("k_TimelineSettingInfo")) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.jm6.class.newInstance();
                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                    fVar = (com.tencent.mm.protobuf.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
                return (r45.jm6) fVar;
            }
        }
        fVar = null;
        return (r45.jm6) fVar;
    }

    public final boolean e() {
        xm1.h hVar = (xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi();
        boolean l17 = hVar.l();
        boolean j17 = hVar.j();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommUtil", "isHeadsetOn isHeadsetPlugged:" + l17 + " isBluetoothOn:" + j17);
        return l17 || j17;
    }

    public final void f(boolean z17) {
        try {
            com.tencent.mm.sdk.platformtools.o4.R("brandService").putBoolean("k_CreationCenterNotifySwitch", z17);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizCommUtil", "setCreationCenterNotifySwitch ex %s", e17.getMessage());
        }
    }

    public final void g(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommUtil", "setNotifyUnreadCount count:" + i17 + " uin:" + a());
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("k_TimelineNotifyUnreadCount_");
        sb6.append(a());
        R.putInt(sb6.toString(), i17);
    }
}
