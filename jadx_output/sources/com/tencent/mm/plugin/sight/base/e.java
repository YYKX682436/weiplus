package com.tencent.mm.plugin.sight.base;

/* loaded from: classes10.dex */
public abstract class e {
    public static java.lang.String a(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.concat(".soundmp4");
    }

    public static java.lang.String b() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        android.util.StringBuilderPrinter stringBuilderPrinter = new android.util.StringBuilderPrinter(sb6);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        stringBuilderPrinter.println("#accinfo.revision=" + com.tencent.mm.sdk.platformtools.z.f193109e);
        stringBuilderPrinter.println("#accinfo.build=" + com.tencent.mm.sdk.platformtools.z.f193107c + ":" + com.tencent.mm.sdk.platformtools.z.f193106b + ":" + com.tencent.mm.sdk.platformtools.a0.f192439b);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#accinfo.env=");
        sb7.append(z65.c.f470455a ? "f" : "b");
        sb7.append(":");
        sb7.append(java.lang.Thread.currentThread().getName());
        sb7.append(":");
        sb7.append(z65.c.f470456b);
        stringBuilderPrinter.println(sb7.toString());
        stringBuilderPrinter.println("#aacinfo.device_brand=" + o45.wf.f343024b);
        stringBuilderPrinter.println("#aacinfo.device_model=" + o45.wf.f343025c);
        stringBuilderPrinter.println("#aacinfo.os_type=" + wo.q.f447784e);
        stringBuilderPrinter.println("#aacinfo.os_name=" + o45.wf.f343027e);
        stringBuilderPrinter.println("#aacinfo.os_version=" + wo.q.f447785f);
        stringBuilderPrinter.println("#aacinfo.device_name=" + o45.wf.f343026d);
        try {
            java.lang.String absolutePath = android.os.Environment.getDataDirectory().getAbsolutePath();
            android.os.StatFs statFs = new android.os.StatFs(absolutePath);
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            str = java.lang.String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", java.lang.Integer.valueOf(((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryClass()), absolutePath, java.lang.Integer.valueOf(statFs.getBlockSize()), java.lang.Integer.valueOf(statFs.getBlockCount()), java.lang.Integer.valueOf(statFs.getAvailableBlocks()), lp0.b.e0(), java.lang.Integer.valueOf(statFs2.getBlockSize()), java.lang.Integer.valueOf(statFs2.getBlockCount()), java.lang.Integer.valueOf(statFs2.getAvailableBlocks()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightUtil", "check data size failed :%s", e17.getMessage());
            str = "";
        }
        stringBuilderPrinter.println("#accinfo.data=" + str);
        java.util.Date date = new java.util.Date();
        stringBuilderPrinter.println("#accinfo.crashTime=" + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", java.util.Locale.getDefault()).format(date));
        stringBuilderPrinter.println(com.tencent.mm.app.MMCrashReportContents.f53234a);
        return sb6.toString();
    }

    public static com.tencent.mm.plugin.sight.base.b c(java.lang.String str) {
        return d(str, true);
    }

    public static com.tencent.mm.plugin.sight.base.b d(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        com.tencent.mm.plugin.sight.base.b bVar = new com.tencent.mm.plugin.sight.base.b();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(com.tencent.mm.vfs.w6.i(str, false), z17));
            bVar.f162382a = (int) jSONObject.getDouble("videoDuration");
            bVar.f162384c = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            bVar.f162385d = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            bVar.f162386e = (int) jSONObject.getDouble("videoFPS");
            bVar.f162383b = jSONObject.getInt("videoBitrate");
            bVar.f162388g = jSONObject.getInt("audioBitrate");
            bVar.f162387f = jSONObject.getInt("audioChannel");
            bVar.f162390i = jSONObject.getInt("useABA");
            bVar.f162391j = jSONObject.getInt("useMinMaxQP");
            bVar.f162392k = jSONObject.getInt("bitrateAdaptiveUp");
            bVar.f162389h = jSONObject.getInt("aacSampleRate");
            bVar.f162393l = jSONObject.optInt("pixelFormat", -1);
            bVar.f162394m = jSONObject.getInt("hasH264") == 1;
            bVar.f162395n = jSONObject.optInt(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, -1);
            bVar.f162396o = jSONObject.optString("format_name", "");
            bVar.f162397p = jSONObject.optString("format_long_name", "");
            bVar.f162399r = jSONObject.optString("audioType", "");
            bVar.f162398q = jSONObject.optString("videoType", "");
            bVar.f162401t = jSONObject.optString("codec_tag_name", "");
            bVar.f162400s = jSONObject.optString("audio_codec_tag_name", "");
            bVar.f162404w = jSONObject.optInt("hasAudioTrack", 0) == 1;
            bVar.f162405x = jSONObject.optInt("hasVideoTrack", 0) == 1;
            bVar.f162403v = jSONObject.optString("codec_name", "");
            bVar.f162402u = jSONObject.optString("audio_codec_name", "");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightUtil", "get media info error %s", e17.toString());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SightUtil", "get media %s", bVar);
        return bVar;
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("extInfo: \n" + f(str, new com.tencent.mm.pointers.PInt(), new com.tencent.mm.pointers.PInt(), new com.tencent.mm.pointers.PInt(), new com.tencent.mm.pointers.PInt(), new com.tencent.mm.pointers.PInt()));
        stringBuffer.append("size: " + com.tencent.mm.sdk.platformtools.t8.f0(com.tencent.mm.vfs.w6.k(str)) + ":" + str + "\n");
        java.lang.String mp4RecordInfo = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RecordInfo(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mp4RecordInfo)) {
            stringBuffer.append(mp4RecordInfo);
        }
        stringBuffer.append("isH265:");
        stringBuffer.append(t21.u2.b(str));
        return stringBuffer.toString();
    }

    public static java.lang.String f(java.lang.String str, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2, com.tencent.mm.pointers.PInt pInt3, com.tencent.mm.pointers.PInt pInt4, com.tencent.mm.pointers.PInt pInt5) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            java.lang.String simpleMp4InfoVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SightUtil", "get simple mp4 info %s", simpleMp4InfoVFS);
            org.json.JSONObject jSONObject = new org.json.JSONObject(simpleMp4InfoVFS);
            if (pInt != null) {
                pInt.value = (int) jSONObject.getDouble("videoDuration");
            }
            if (pInt2 != null) {
                pInt2.value = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            }
            if (pInt3 != null) {
                pInt3.value = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            }
            if (pInt4 != null) {
                pInt4.value = (int) jSONObject.getDouble("videoFPS");
            }
            if (pInt5 != null) {
                pInt5.value = jSONObject.getInt("videoBitrate");
            }
            if (pInt5 != null && pInt != null && pInt2 != null && pInt3 != null && pInt4 != null) {
                stringBuffer.append("videoBitrate: ");
                stringBuffer.append(pInt5.value);
                stringBuffer.append("\n");
                stringBuffer.append("videoWidth,videoHeight: ");
                stringBuffer.append(pInt2.value);
                stringBuffer.append("*");
                stringBuffer.append(pInt3.value);
                stringBuffer.append(" ");
                stringBuffer.append(java.lang.String.format("%.4f", java.lang.Double.valueOf((pInt2.value * 1.0d) / pInt3.value)));
                stringBuffer.append("\n");
                stringBuffer.append("videoDuration: ");
                stringBuffer.append(pInt.value);
                stringBuffer.append("\n");
                stringBuffer.append("videoFPS: ");
                stringBuffer.append(pInt4.value);
                stringBuffer.append("\n");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightUtil", e17, "get media info error", new java.lang.Object[0]);
        }
        return stringBuffer.toString();
    }

    public static org.json.JSONObject g(java.lang.String str) {
        try {
            return new org.json.JSONObject(com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoMetaData(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightUtil", e17, "getVideoMetaData error:%s", e17.getMessage());
            return null;
        }
    }
}
