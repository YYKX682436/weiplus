package w12;

/* loaded from: classes7.dex */
public final class c {
    public final java.util.HashMap a() {
        int i17 = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels;
        int i18 = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().heightPixels;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("brand", android.os.Build.BRAND);
        hashMap.put("model", wo.w0.m());
        hashMap.put("abi", android.os.Build.CPU_ABI);
        hashMap.put("system", android.os.Build.VERSION.RELEASE);
        hashMap.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(i17)));
        hashMap.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(i18)));
        hashMap.put("pixelRatio", java.lang.Float.valueOf(ik1.w.f()));
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(i17)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(i18)));
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        hashMap.put("version", com.tencent.mm.sdk.platformtools.a0.a(null, com.tencent.mm.sdk.platformtools.z.f193112h));
        ((com.tencent.mm.plugin.magicbrush.d6) ((com.tencent.mm.plugin.magicbrush.e4) i95.n0.c(com.tencent.mm.plugin.magicbrush.e4.class))).getClass();
        hashMap.put("benchmarkLevel", java.lang.Integer.valueOf(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ClientBenchmarkLevel", -1)));
        hashMap.put("deviceOrientation", 2 == com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().orientation ? "landscape" : "portrait");
        hashMap.put("fontSizeSetting", java.lang.Float.valueOf(1.0f));
        hashMap.put("offsetTop", 0);
        hashMap.put("offsetBottom", 0);
        return hashMap;
    }
}
