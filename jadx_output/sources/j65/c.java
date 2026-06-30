package j65;

/* loaded from: classes5.dex */
public abstract class c {
    public static float a(int i17) {
        switch (i17) {
            case 0:
                return 0.8f;
            case 1:
            default:
                return 1.0f;
            case 2:
                return 1.1f;
            case 3:
                return 1.12f;
            case 4:
                return 1.125f;
            case 5:
                return 1.4f;
            case 6:
                return 1.55f;
            case 7:
                return 1.65f;
        }
    }

    public static float b(android.content.Context context) {
        if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).contains("current_text_size_scale_key")) {
            return com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getFloat("current_text_size_scale_key", 1.0f);
        }
        if (context == null) {
            return 1.0f;
        }
        float f17 = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getFloat("current_text_size_scale_key", 1.0f);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putFloat("current_text_size_scale_key", f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FontUtil", "CURRENT_TEXT_SIZE_KEY put result:%s, currentFont:%s", java.lang.Boolean.TRUE, java.lang.Float.valueOf(f17));
        return f17;
    }

    public static float c(android.content.Context context) {
        if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).contains("before_care_mode_text_size_scale_key")) {
            return com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getFloat("before_care_mode_text_size_scale_key", 1.0f);
        }
        if (context == null) {
            return 1.0f;
        }
        float f17 = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getFloat("before_care_mode_text_size_scale_key", 1.0f);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putFloat("before_care_mode_text_size_scale_key", f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FontUtil", "TEXT_SIZE_BEFOR_CARE_MODE_KEY put result:%s, currentFont:%s", java.lang.Boolean.TRUE, java.lang.Float.valueOf(f17));
        return f17;
    }

    public static int d(android.content.Context context) {
        if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).contains("current_text_size_index_key")) {
            return com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getInt("current_text_size_index_key", 1);
        }
        if (context == null) {
            return 1;
        }
        int i17 = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getInt("current_text_size_index_key", 1);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("current_text_size_index_key", i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FontUtil", "CURRENT_TEXT_INDEX_KEY put result:%s, currentFont:%s", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static int e(android.content.Context context) {
        if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).contains("before_care_mode_text_size_index_key")) {
            return com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getInt("before_care_mode_text_size_index_key", 1);
        }
        if (context == null) {
            return 1;
        }
        int i17 = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getInt("before_care_mode_text_size_index_key", 1);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("before_care_mode_text_size_index_key", i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FontUtil", "TEXT_INDEX_BEFOR_CARE_MODE_KEY put result:%s, currentFont:%s", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static int f(float f17) {
        if (f17 < i65.a.y(com.tencent.mm.sdk.platformtools.x2.f193071a) || f17 > i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            f17 = i65.a.y(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (i65.a.C(f17, i65.a.y(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            return 0;
        }
        if (i65.a.C(f17, i65.a.w(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            return 2;
        }
        if (i65.a.C(f17, i65.a.z(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            return 3;
        }
        if (i65.a.C(f17, i65.a.s(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            return 4;
        }
        if (i65.a.C(f17, i65.a.t(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            return 5;
        }
        if (i65.a.C(f17, i65.a.u(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            return 6;
        }
        return i65.a.C(f17, i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a)) ? 7 : 1;
    }

    public static int g(int i17) {
        switch (i17) {
            case 0:
                return com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.CTRL_INDEX;
            case 1:
            default:
                return 400;
            case 2:
            case 3:
                return com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            case 4:
            case 5:
            case 6:
            case 7:
                return 340;
        }
    }

    public static void h(int i17) {
        float a17 = a(i17);
        i65.a.F(com.tencent.mm.sdk.platformtools.x2.f193071a, a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FontUtil", "setFontSize currentIndex:%s, currentFont:%s ", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(a17));
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putFloat("current_text_size_scale_key", a17);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("current_text_size_index_key", i17);
        j65.f.k(g(i17));
    }

    public static void i() {
        int i17;
        float f17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().fontScale;
        if (f17 < 1.0f) {
            i17 = 0;
        } else {
            if (f17 != 1.0f) {
                if (f17 <= 1.0f || f17 > 1.1d) {
                    double d17 = f17;
                    if (d17 > 1.1d && d17 <= 1.2d) {
                        i17 = 3;
                    } else if (d17 > 1.2d && d17 <= 1.3d) {
                        i17 = 4;
                    } else if (d17 > 1.3d && d17 <= 1.4d) {
                        i17 = 5;
                    } else if (d17 > 1.4d && d17 <= 1.5d) {
                        i17 = 6;
                    } else if (d17 > 1.5d) {
                        i17 = 7;
                    }
                } else {
                    i17 = 2;
                }
            }
            i17 = 1;
        }
        float a17 = a(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FontUtil", "updateFont systemfont:%s, currentIndex:%s, currentFont:%s ", java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(a17));
        i65.a.F(com.tencent.mm.sdk.platformtools.x2.f193071a, a17);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putFloat("current_text_size_scale_key", a17);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("current_text_size_index_key", i17);
        j65.f.k(g(i17));
    }
}
