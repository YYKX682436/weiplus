package gr;

/* loaded from: classes12.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.jni.emojihelper.EmojiRgbaCacheManagerJni f274678a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f274679b = new jt0.i(200, gr.r.class);

    /* renamed from: c, reason: collision with root package name */
    public final kk.j f274680c = new jt0.i(150, gr.r.class);

    public r(kotlin.jvm.internal.i iVar) {
        fp.d0.o("voipComm");
        fp.d0.o("voipChannel");
        fp.d0.o("voipCodec");
        fp.d0.o("emojihelper");
        this.f274678a = zk0.b.f473402a;
    }

    public final boolean a(boolean z17) {
        com.tencent.mm.jni.emojihelper.EmojiRgbaCacheManagerJni emojiRgbaCacheManagerJni = this.f274678a;
        if (emojiRgbaCacheManagerJni == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiRgbaCacheManager", "clearCache, cacheManager null");
        }
        if (z17) {
            this.f274680c.clear();
        } else {
            this.f274679b.clear();
        }
        if (emojiRgbaCacheManagerJni != null) {
            return emojiRgbaCacheManagerJni.a(z17);
        }
        return false;
    }

    public final int b(boolean z17) {
        com.tencent.mm.jni.emojihelper.EmojiRgbaCacheManagerJni emojiRgbaCacheManagerJni = this.f274678a;
        if (emojiRgbaCacheManagerJni == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiRgbaCacheManager", "getEmojiRgbaCacheCurrentSize, cacheManager null");
            return -1;
        }
        if (emojiRgbaCacheManagerJni != null) {
            return emojiRgbaCacheManagerJni.b(z17);
        }
        return -1;
    }

    public final android.graphics.Bitmap c(java.lang.String str) {
        if (str != null && !kotlin.jvm.internal.o.b(str, "")) {
            return (android.graphics.Bitmap) this.f274680c.get(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiRgbaCacheManager", "getQQNewEmojiCacheBitmap failed, cacheKey error");
        return null;
    }

    public final android.graphics.Bitmap d(java.lang.String str) {
        if (str != null && !kotlin.jvm.internal.o.b(str, "")) {
            return (android.graphics.Bitmap) this.f274679b.get(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiRgbaCacheManager", "getSystemEmojiCacheBitmap failed, cacheKey error");
        return null;
    }

    public final void e(java.lang.String str, boolean z17, android.graphics.Bitmap bitmap) {
        if (bitmap == null || str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiRgbaCacheManager", "putEmojiRgbaCacheFrame failed, bitmap null");
        } else if (z17) {
            this.f274680c.put(str, bitmap);
        } else {
            this.f274679b.put(str, bitmap);
        }
    }
}
