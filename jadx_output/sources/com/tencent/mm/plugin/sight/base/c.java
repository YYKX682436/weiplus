package com.tencent.mm.plugin.sight.base;

/* loaded from: classes10.dex */
public abstract class c {
    public static boolean a(boolean z17, boolean z18) {
        int intValue;
        boolean z19 = true;
        try {
            if (gm0.j1.i().f273218k && gm0.j1.b().m() && (intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_CAPTURE_USE_FFMPEG_INT_SYNC, -1)).intValue()) > 0) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(intValue);
                objArr[1] = java.lang.Boolean.valueOf(intValue == 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg localConfig: %d, isIsUseFFmpeg: %b", objArr);
                return intValue == 2;
            }
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e17, "load isIsUseFFmpeg local config fail", new java.lang.Object[0]);
        }
        boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_is_use_ffmpeg_muxer_for_capture, 0) == 1;
        if (z27 || !z18) {
            z19 = z27;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "xSwitch: %b, enableHevc: %b, H265 must use ffmpeg_muxer", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z18));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg xSwitch: %b, useSoftEncode:%s, enableHevc:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        return z19;
    }

    public static java.lang.String b() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null || context.getCacheDir() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WechatSight.PacketMuxerController", "path is empty, MMApplicationContext.getContext() == null");
            return "";
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir().getAbsolutePath() + "/mux";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "path is not exists, mkdir path: %s", str);
        }
        return str;
    }

    public static boolean c(boolean z17, boolean z18) {
        int intValue;
        boolean z19 = true;
        try {
            if (gm0.j1.i().f273218k && gm0.j1.b().m() && (intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_INT_SYNC, -1)).intValue()) > 0) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(intValue);
                objArr[1] = java.lang.Boolean.valueOf(intValue == 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg localConfig: %d, isIsUseFFmpeg: %b", objArr);
                return intValue == 2;
            }
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e17, "load isIsUseFFmpeg local config fail", new java.lang.Object[0]);
        }
        boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_is_use_ffmpeg_muxer, 0) == 1;
        if (z27 || !z18) {
            z19 = z27;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "xSwitch: %b, enableHevc: %b, H265 must use ffmpeg_muxer", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z18));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg xSwitch: %b, useSoftEncode:%s, enableHevc:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        return z19;
    }

    public static boolean d() {
        int intValue;
        try {
            if (gm0.j1.i().f273218k && gm0.j1.b().m() && (intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_INT_SYNC, -1)).intValue()) > 0) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(intValue);
                objArr[1] = java.lang.Boolean.valueOf(intValue == 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg localConfig: %d, isIsUseFFmpeg: %b", objArr);
                return intValue == 2;
            }
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e17, "load isIsUseFFmpeg local config fail", new java.lang.Object[0]);
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sight_video_jni_remuxing_is_use_ffmpeg_muxer, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg xSwitch: %b", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static void e(long j17, long j18) {
        try {
            jx3.f.INSTANCE.idkeyStat(1280L, j17, j18, false);
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e17, "reportIDKey muxer called error", new java.lang.Object[0]);
        }
    }

    public static void f(int i17, long j17) {
        e(0L, 1L);
        if (i17 < 0) {
            e(2L, 1L);
        } else {
            e(1L, 1L);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        e(3L, elapsedRealtime);
        com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight reportMuxingResult retVal: %d", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case -10006:
                e(40L, 1L);
                e(42L, 1L);
                e(43L, elapsedRealtime);
                return;
            case -10005:
                e(35L, 1L);
                e(37L, 1L);
                e(38L, elapsedRealtime);
                return;
            case -10004:
                e(30L, 1L);
                e(32L, 1L);
                e(33L, elapsedRealtime);
                return;
            case -10003:
                e(25L, 1L);
                e(27L, 1L);
                e(28L, elapsedRealtime);
                return;
            case -10002:
                e(20L, 1L);
                e(22L, 1L);
                e(23L, elapsedRealtime);
                return;
            case -10001:
                e(15L, 1L);
                e(17L, 1L);
                e(18L, elapsedRealtime);
                return;
            default:
                switch (i17) {
                    case 10001:
                        e(15L, 1L);
                        e(16L, 1L);
                        e(18L, elapsedRealtime);
                        return;
                    case 10002:
                        e(20L, 1L);
                        e(21L, 1L);
                        e(23L, elapsedRealtime);
                        return;
                    case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                        e(25L, 1L);
                        e(26L, 1L);
                        e(28L, elapsedRealtime);
                        return;
                    case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID /* 10004 */:
                        e(30L, 1L);
                        e(31L, 1L);
                        e(33L, elapsedRealtime);
                        return;
                    case 10005:
                        e(35L, 1L);
                        e(36L, 1L);
                        e(38L, elapsedRealtime);
                        return;
                    case 10006:
                        e(40L, 1L);
                        e(41L, 1L);
                        e(43L, elapsedRealtime);
                        return;
                    default:
                        return;
                }
        }
    }

    public static boolean g() {
        try {
            if (gm0.j1.i().f273218k && gm0.j1.b().m()) {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_CODEC_PTS_INT_SYNC, -1)).intValue();
                if (intValue > 0) {
                    return intValue == 1;
                }
            }
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e17, "load useCodecPts local config fail", new java.lang.Object[0]);
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ffmpeg_muxer_use_codec_pts, 1) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight useCodecPts: %b", java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
