package yp0;

/* loaded from: classes7.dex */
public final class b {
    public final java.util.HashMap a(wp0.c context, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView K0 = context.K0();
        int width = K0.getWidth() > 0 ? K0.getWidth() : 1;
        int height = K0.getHeight() > 0 ? K0.getHeight() : 1;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("brand", android.os.Build.BRAND);
        hashMap.put("model", wo.w0.m());
        hashMap.put("abi", android.os.Build.CPU_ABI);
        hashMap.put("system", android.os.Build.VERSION.RELEASE);
        hashMap.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(width)));
        hashMap.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(height)));
        hashMap.put("pixelRatio", java.lang.Float.valueOf(ik1.w.f()));
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(width)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(height)));
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        hashMap.put("version", com.tencent.mm.sdk.platformtools.a0.a(null, com.tencent.mm.sdk.platformtools.z.f193112h));
        ((com.tencent.mm.plugin.magicbrush.d6) ((com.tencent.mm.plugin.magicbrush.e4) i95.n0.c(com.tencent.mm.plugin.magicbrush.e4.class))).getClass();
        hashMap.put("benchmarkLevel", java.lang.Integer.valueOf(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ClientBenchmarkLevel", -1)));
        hashMap.put("deviceOrientation", 2 == com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().orientation ? "landscape" : "portrait");
        hashMap.put("fontSizeSetting", 0);
        jz5.l H0 = context.H0();
        hashMap.put("offsetTop", java.lang.Integer.valueOf(ik1.w.e(((java.lang.Number) H0.f302833d).intValue())));
        hashMap.put("offsetBottom", java.lang.Integer.valueOf(ik1.w.e(((java.lang.Number) H0.f302834e).intValue())));
        return hashMap;
    }
}
