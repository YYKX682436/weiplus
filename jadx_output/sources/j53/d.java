package j53;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f297808a = new java.util.HashMap();

    public d(j53.a aVar) {
    }

    public static java.lang.String a(com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem c17 = c(captureDataManager$CaptureVideoNormalModel.f155661e);
        if (c17 == null) {
            return null;
        }
        java.lang.String b17 = b(captureDataManager$CaptureVideoNormalModel.f155662f, captureDataManager$CaptureVideoNormalModel.f155661e);
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b18 = com.tencent.mm.plugin.webview.model.l4.f183002b.b(b17);
        if (b18 != null) {
            c17.f182737f = b18.f182738g;
        }
        c17.f182750v.putInt("mark_edit_flag", d(captureDataManager$CaptureVideoNormalModel.a()));
        return com.tencent.mm.plugin.webview.model.o5.i(c17.f182736e, b17, c17.f182754w, c17.f182745q, c17.f182744p, c17.f182743o);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2));
            java.lang.String name = r6Var.getName();
            java.lang.String substring = (android.text.TextUtils.isEmpty(name) || !name.contains(".")) ? null : name.substring(0, name.lastIndexOf("."));
            if (android.text.TextUtils.isEmpty(substring)) {
                str = r6Var.r() + "microMsg_" + java.lang.System.currentTimeMillis() + ".jpeg";
            } else {
                str = r6Var.r() + "/" + substring + ".jpeg";
            }
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "file is exist for path:%s!", str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "create new thumb path:%s!", str);
            android.graphics.Bitmap createVideoThumbnail = android.media.ThumbnailUtils.createVideoThumbnail(str2, 1);
            if (createVideoThumbnail == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.ActionAfterVideoEdited", "createVideoThumbnail bitmap fail for path:%s!", str);
                return "";
            }
            try {
                com.tencent.mm.sdk.platformtools.x.D0(android.media.ThumbnailUtils.extractThumbnail(createVideoThumbnail, uc1.w1.CTRL_INDEX, 400, 2), 30, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.ActionAfterVideoEdited", "saveBitmapToImage exist IOException:" + e17.getMessage());
            }
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e18 = com.tencent.mm.plugin.webview.model.m4.e(str, str);
        e18.f182748t = true;
        e18.f182742n = 1;
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(e18);
        return e18.f182736e;
    }

    public static com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem c(java.lang.String str) {
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.ActionAfterVideoEdited", "video after edited is error");
            return null;
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b17 = com.tencent.mm.plugin.webview.model.m4.b(str);
        b17.f182754w = d17.a();
        int i17 = d17.f162395n;
        if (i17 == 90 || i17 == 270) {
            b17.f182744p = d17.f162385d;
            b17.f182745q = d17.f162384c;
        } else {
            b17.f182744p = d17.f162384c;
            b17.f182745q = d17.f162385d;
        }
        b17.f182743o = (int) com.tencent.mm.vfs.w6.k(str);
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
        return b17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo) {
        boolean z17 = false;
        if (recordMediaReportInfo == null) {
            return 0;
        }
        boolean z18 = ((java.lang.Integer) recordMediaReportInfo.b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue() != 0 ? 1 : 0;
        boolean z19 = ((java.lang.Integer) recordMediaReportInfo.b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue() != 0;
        boolean z27 = ((java.lang.Integer) recordMediaReportInfo.b("KEY_SELECT_MUSIC_INT", 0)).intValue() != 0;
        long intValue = ((java.lang.Integer) recordMediaReportInfo.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0)).intValue();
        long intValue2 = ((java.lang.Integer) recordMediaReportInfo.b("KEY_VIDEO_CROP_DURATION_MS_INT", 0)).intValue();
        if (intValue != 0 && intValue2 != 0 && intValue != intValue2) {
            z17 = true;
        }
        int i17 = z19 ? z18 | 2 : z18;
        if (z27) {
            i17 |= 4;
        }
        if (z17) {
            i17 |= 8;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "hasEmoji:%b, hasText:%b, hasMusic:%b, hasCut:%b, editFlag:%d", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static void e(com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        int i17 = bundle.getInt("key_video_from", 0);
        com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo a17 = captureDataManager$CaptureVideoNormalModel.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("videoid", com.tencent.mm.vfs.w6.p(captureDataManager$CaptureVideoNormalModel.f155661e));
        hashMap.put("costtime", a17.b("KEY_REMUX_VIDEO_COST_MS_INT", 0));
        hashMap.put("origtime", java.lang.Integer.valueOf(bundle.getInt("key_raw_video_duration", 0)));
        hashMap.put("cliptime", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.V1(captureDataManager$CaptureVideoNormalModel.f155663g.longValue())));
        int i18 = bundle.getInt("key_raw_video_size", 0);
        hashMap.put("origsize", java.lang.Integer.valueOf(i18));
        hashMap.put("remuxsize", java.lang.Integer.valueOf((int) com.tencent.mm.vfs.w6.k(captureDataManager$CaptureVideoNormalModel.f155661e)));
        int intValue = ((java.lang.Integer) a17.b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue();
        hashMap.put("hasexpre", java.lang.Integer.valueOf(intValue));
        int intValue2 = ((java.lang.Integer) a17.b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue();
        hashMap.put("hasword", a17.b("KEY_ADD_TEXT_COUNT_INT", 0));
        hashMap.put("hasmusic", 1);
        if (((java.lang.String) a17.b("KEY_MUSIC_ID_STRING", "")).isEmpty()) {
            hashMap.put("hasmusic", 0);
        }
        j53.c cVar = new j53.c();
        cVar.f297807d = i18;
        cVar.f297804a = intValue2;
        cVar.f297805b = intValue;
        if (!((java.lang.String) a17.b("KEY_MUSIC_ID_STRING", "")).isEmpty()) {
            cVar.f297806c = 1;
        }
        j53.b.f297803a.f297808a.put(captureDataManager$CaptureVideoNormalModel.f155661e, cVar);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            stringBuffer.append((java.lang.String) entry.getKey());
            stringBuffer.append(":");
            stringBuffer.append(entry.getValue());
            stringBuffer.append(", ");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        java.lang.Boolean bool = captureDataManager$CaptureVideoNormalModel.f155660d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "remuxResult:%b, statistic:[%s]", bool, stringBuffer2);
        int i19 = bundle.getInt("game_haowan_source_scene_id", 0);
        if (bool.booleanValue()) {
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8763, 2, 48, i19, lj0.a.a(i17, hashMap));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.ActionAfterVideoEdited", "video remux error");
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8763, 2, 56, i19, lj0.a.a(i17, hashMap));
        }
    }

    public static void f(java.lang.String str, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        if (str.equals(captureDataManager$CaptureVideoNormalModel.f155662f)) {
            return;
        }
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str));
        if (com.tencent.mm.vfs.w6.d(captureDataManager$CaptureVideoNormalModel.f155662f, str, false) > 0) {
            captureDataManager$CaptureVideoNormalModel.f155662f = str;
        }
    }

    public static void g(java.lang.String str, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        if (str.equals(captureDataManager$CaptureVideoNormalModel.f155661e)) {
            return;
        }
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str));
        if (com.tencent.mm.vfs.w6.d(captureDataManager$CaptureVideoNormalModel.f155661e, str, false) > 0) {
            captureDataManager$CaptureVideoNormalModel.f155661e = str;
        }
    }
}
