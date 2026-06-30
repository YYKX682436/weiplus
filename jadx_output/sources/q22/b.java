package q22;

/* loaded from: classes10.dex */
public final class b extends es0.c {

    /* renamed from: b, reason: collision with root package name */
    public static final q22.b f359805b = new q22.b();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f359806c = true;

    @Override // es0.c
    public int c(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key), i17);
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCapture", "getDynamicConfig, key: %s, value: %s", key, d17);
        if (d17 == null) {
            d17 = "";
        }
        return com.tencent.mm.sdk.platformtools.t8.P(d17, i17);
    }

    @Override // es0.c
    public java.lang.Object d() {
        return new q22.a(0, false, 0, 0, false, 31, null);
    }

    @Override // es0.c
    public void e() {
        ((q22.a) b()).f359801b = false;
        if (z65.c.a()) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ((q22.a) b()).f359801b = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_EMOJI_SPRING_FESTIVAL_CROP_TYPE_INT, 1) == 0;
            } else {
                q22.a aVar = (q22.a) b();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_SPRING_FESTIVAL_CROP_TYPE_INT;
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCapture", "getInt %s %s", u3Var, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCapture", "getConfigStorage, %s %s", u3Var, 1);
                java.lang.Object m17 = gm0.j1.u().c().m(u3Var, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCapture", "getInt %s %s and get val %s", u3Var, 1, m17);
                aVar.f359801b = (m17 == null ? 1 : com.tencent.mm.sdk.platformtools.t8.P(m17.toString(), 1)) == 0;
            }
        }
        if (((q22.a) b()).f359801b) {
            ((q22.a) b()).f359800a = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
        } else {
            ((q22.a) b()).f359800a = 1080;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCameraElementConfig", "config resolution:" + ((q22.a) b()).f359800a + ", useCpuCrop:" + ((q22.a) b()).f359801b);
    }
}
