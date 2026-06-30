package v70;

@j95.b
/* loaded from: classes12.dex */
public final class b0 extends jm0.o implements xs.f1 {

    /* renamed from: m, reason: collision with root package name */
    public static final v70.a0 f433600m = new v70.a0(null);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f433601n = jz5.h.b(v70.z.f433635d);

    public static jz5.l Zi(v70.b0 b0Var, oi3.f fVar, boolean z17, int i17, java.lang.Object obj) {
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        b0Var.getClass();
        java.lang.String k17 = fVar.k();
        if (!r26.i0.A(k17, "/", false, 2, null)) {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            k17 = tg3.u0.Q8((tg3.u0) c17, fVar, fVar.k(), false, z18, 4, null);
        }
        return new jz5.l(k17, k17.concat("hd"));
    }

    public o70.f aj(int i17, int i18) {
        int i19;
        float f17;
        float g17 = i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (i17 >= 160 || i18 >= 160) {
            float f18 = 160.0f / (i18 > i17 ? i18 : i17);
            i19 = (int) ((((int) (i17 * f18)) > 0 ? r6 : 120) * g17);
            f17 = (((int) (i18 * f18)) > 0 ? r7 : 75) * g17;
        } else {
            if (i17 <= 0) {
                i17 = 120;
            }
            i19 = (int) (i17 * g17 * 1.25f);
            if (i18 <= 0) {
                i18 = 75;
            }
            f17 = i18 * g17 * 1.25f;
        }
        int i27 = (int) f17;
        float f19 = 60 * g17;
        if (i19 < f19) {
            i19 = (int) f19;
        }
        if (i27 < f19) {
            i27 = (int) f19;
        }
        return new o70.f(i19, i27);
    }

    public void bj(com.tencent.mm.storage.f9 msgInfo, java.lang.String source) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(source, "source");
        oi3.f fVar = new oi3.f();
        c01.gb.a(fVar, msgInfo);
        v70.a0 a0Var = f433600m;
        java.lang.String a17 = a0Var.a(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgLoaderFeatureService", "onMsgImgHdThumbGenerated imageKey:" + a17 + " source:" + source);
        java.util.List k17 = kz5.c0.k(y70.f.class, y70.h.class, y70.l.class, y70.m.class, y70.p.class);
        jz5.l Zi = Zi(this, fVar, false, 2, null);
        java.lang.String str = (java.lang.String) Zi.f302833d;
        java.lang.String str2 = (java.lang.String) Zi.f302834e;
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String Q8 = tg3.u0.Q8((tg3.u0) c17, fVar, fVar.k(), false, true, 4, null);
        java.lang.String concat = Q8.concat("hd");
        g75.z zVar = new g75.z();
        zVar.l("Common_ImageKey", a17);
        zVar.l("Common_StartTimestamp", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        zVar.l("Common_ForceRefresh", java.lang.Boolean.TRUE);
        zVar.l("Common_ImageViewRefMap", a0Var.b());
        zVar.l("key_thumb_path", str);
        zVar.l("key_hd_thumb_path", str2);
        zVar.l("key_write_thumb_path", Q8);
        zVar.l("key_write_hd_thumb_path", concat);
        zVar.l("key_msg_info", fVar);
        ((v70.b0) i95.n0.c(v70.b0.class)).getClass();
        java.lang.String bizName = "MsgImgLoader@" + (java.lang.System.currentTimeMillis() % 4);
        kotlin.jvm.internal.o.g(bizName, "bizName");
        g75.r rVar = new g75.r(kz5.n0.X0(k17), zVar, bizName, null, true, 8, null);
        rVar.d();
        new java.lang.ref.WeakReference(rVar);
    }
}
