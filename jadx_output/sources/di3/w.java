package di3;

/* loaded from: classes10.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f232767a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f232768b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f232769c;

    /* renamed from: d, reason: collision with root package name */
    public static di3.f0 f232770d;

    /* renamed from: e, reason: collision with root package name */
    public static int f232771e;

    /* renamed from: f, reason: collision with root package name */
    public static double f232772f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.hardware.Camera.Parameters r13, boolean r14, com.tencent.mm.modelcontrol.VideoTransPara r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.w.a(android.hardware.Camera$Parameters, boolean, com.tencent.mm.modelcontrol.VideoTransPara):void");
    }

    public static boolean b(android.graphics.Point point) {
        if (f232768b) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
            java.lang.Object[] objArr = new java.lang.Object[1];
            di3.f0 f0Var = f232770d;
            objArr[0] = f0Var == null ? "" : java.lang.Integer.valueOf(f0Var.f232702c);
            db5.t7.makeText(context, resources.getString(com.tencent.mm.R.string.f492295fz2, objArr), 1).show();
            return false;
        }
        wo.g1 g1Var = wo.v1.f447829i;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy, deviceInfo recorderType: %s, recorderOption: %s, isUseRecorderOption: %s", java.lang.Integer.valueOf(g1Var.f447687a), java.lang.Integer.valueOf(g1Var.f447694h), java.lang.Boolean.valueOf(f232769c));
        if (f232769c) {
            return false;
        }
        if (g1Var.f447687a != -1) {
            return true;
        }
        di3.f0 f0Var2 = f232770d;
        if (f0Var2 != null && 1 == f0Var2.f232700a) {
            return true;
        }
        if (point == null) {
            return false;
        }
        int i17 = point.x;
        boolean z17 = ai3.d.f5107a;
        if (i17 % 16 == 0) {
            if (point.y % 16 == 0) {
                return true;
            }
        }
        if (f232770d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy not happy %s", point.toString());
            f232770d.f232700a = 1;
        }
        return false;
    }

    public static void c(di3.s sVar) {
        if (sVar.f232757a == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderConfig", "checkMore start %s", sVar.toString());
            sVar.f232757a = sVar.f232760d;
            android.graphics.Point point = sVar.f232761e;
            sVar.f232758b = point;
            sVar.f232759c = sVar.f232762f;
            int min = java.lang.Math.min(point.y, point.x);
            di3.f0 f0Var = f232770d;
            if (min >= f0Var.f232701b.f71191d + 16) {
                f0Var.c();
                di3.f0 f0Var2 = f232770d;
                f0Var2.f232705f = false;
                f0Var2.f232704e = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderConfig", "checkMore out %s", sVar.toString());
            }
        }
    }

    public static void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderConfig", "initSimple");
        di3.f0 f0Var = new di3.f0();
        f232770d = f0Var;
        f0Var.f232704e = false;
        f0Var.f232705f = false;
        if (fp.h.c(19)) {
            f232770d.f232700a = 2;
        } else {
            f232770d.f232700a = 1;
        }
    }

    public static void e(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, di3.v vVar) {
        int r17;
        int r18;
        int i17;
        f232768b = false;
        f232769c = false;
        f232771e = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        f232772f = ai3.d.o(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String m07 = com.tencent.mm.storage.la.m0();
        boolean z17 = vVar == di3.v.MMSightCameraNotLoginConfig && !gm0.j1.b().n();
        int P = z17 ? 19 : (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() == null || com.tencent.mm.sdk.platformtools.x2.n()) ? com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SightMediaCodecMinApiLevel"), 19) : com.tencent.mm.sdk.platformtools.t8.P(com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getDynamicConfig("SightMediaCodecMinApiLevel"), 19);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderConfig", "MXM_DynaCfg_AV_Item_Key_SightMediaCodecMinApiLevel: %s", java.lang.Integer.valueOf(P));
        if (!z17) {
            if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() == null || com.tencent.mm.sdk.platformtools.x2.n()) {
                gm0.j1.i();
                wo.v1.a(gm0.j1.u().j().n0(77825));
            } else {
                wo.v1.a(com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getDeviceInfoConfig());
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(f232771e);
        java.lang.Double valueOf2 = java.lang.Double.valueOf(f232772f);
        wo.g1 g1Var = wo.v1.f447829i;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderConfig", "init large memory class: %sMB, totalMemory: %sGB  fingerprint: %s mmSightRecorderInfo: %s", valueOf, valueOf2, m07, g1Var);
        if (z17) {
            r18 = 1;
            r17 = -1;
        } else if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() == null || com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.i();
            r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, -1);
            gm0.j1.i();
            r18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_FOCUS_INT_SYNC, 1);
            gm0.j1.i();
            gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_CAPTURE_TYPE_INT_SYNC, 1);
            gm0.j1.i();
            gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_CAMERA_API_INT_SYNC, 2);
        } else {
            r17 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, -1);
            r18 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_FOCUS_INT_SYNC, 1);
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_CAPTURE_TYPE_INT_SYNC, 1);
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_CAMERA_API_INT_SYNC, 2);
        }
        di3.f0 a17 = di3.f0.a(r17, videoTransPara);
        f232770d = a17;
        if (a17 != null) {
            a17.f232707h = r18 == 1;
            f232768b = true;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
            java.lang.Object[] objArr = new java.lang.Object[1];
            di3.f0 f0Var = f232770d;
            objArr[0] = f0Var == null ? "" : java.lang.Integer.valueOf(f0Var.f232702c);
            db5.t7.makeText(context, resources.getString(com.tencent.mm.R.string.f492295fz2, objArr), 1).show();
            return;
        }
        if (vVar.ordinal() != 1) {
            i17 = g1Var.f447694h;
        } else {
            int i18 = wo.v1.f447830j.f447694h;
            i17 = 12;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderConfig", "recorderOption: %s", java.lang.Integer.valueOf(i17));
        if (i17 != -1) {
            f232770d = di3.f0.a(i17, videoTransPara);
        }
        di3.f0 f0Var2 = f232770d;
        if (f0Var2 != null) {
            if (r18 == 1) {
                f0Var2.f232707h = true;
            } else {
                f0Var2.f232707h = false;
            }
            f232769c = true;
            return;
        }
        di3.f0 a18 = di3.f0.a(1, videoTransPara);
        f232770d = a18;
        if (r18 == 1) {
            a18.f232707h = true;
        } else {
            a18.f232707h = false;
        }
        a18.getClass();
        f232770d.getClass();
        int i19 = g1Var.f447687a;
        if (i19 != -1) {
            f232770d.f232700a = i19;
        } else {
            if (fp.h.c(P)) {
                f232770d.f232700a = 2;
            } else {
                f232770d.f232700a = 1;
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_flash_record_use_soft, false)) {
                f232770d.f232700a = 1;
            }
        }
        int i27 = g1Var.f447690d;
        if (i27 != -1) {
            f232767a = i27 == 1;
        }
        int i28 = g1Var.f447688b;
        if (i28 != -1) {
            f232770d.f232704e = i28 == 1;
        } else {
            f232770d.f232704e = false;
        }
    }
}
