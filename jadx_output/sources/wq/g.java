package wq;

/* loaded from: classes14.dex */
public final class g implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.jni.emojihelper.WxamDecoderJni f448484a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f448485b;

    public g(byte[] bytes, java.lang.String cacheKeyString, boolean z17) {
        kotlin.jvm.internal.o.g(bytes, "bytes");
        kotlin.jvm.internal.o.g(cacheKeyString, "cacheKeyString");
        fp.d0.n("voipComm");
        fp.d0.n("voipChannel");
        fp.d0.n("voipCodec");
        fp.d0.n("emojihelper");
        com.tencent.mm.jni.emojihelper.WxamDecoderJni wxamDecoderJni = new com.tencent.mm.jni.emojihelper.WxamDecoderJni();
        this.f448484a = wxamDecoderJni;
        if (kotlin.jvm.internal.o.b(cacheKeyString, "")) {
            wxamDecoderJni.a(bytes, bytes.length);
        } else {
            wxamDecoderJni.b(bytes, bytes.length, cacheKeyString, z17);
        }
        int e17 = e();
        int b17 = b();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(b17));
        arrayList.add(java.lang.Integer.valueOf(e17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMWXAMDecoder", "<init>", "([BLjava/lang/String;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/MMWXAMDecoder", "<init>", "([BLjava/lang/String;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        this.f448485b = createBitmap;
    }

    @Override // wq.d
    public int a() {
        com.tencent.mm.jni.emojihelper.WxamDecoderJni wxamDecoderJni = this.f448484a;
        if (wxamDecoderJni != null) {
            return wxamDecoderJni.f();
        }
        return 0;
    }

    @Override // wq.d
    public int b() {
        com.tencent.mm.jni.emojihelper.WxamDecoderJni wxamDecoderJni = this.f448484a;
        if (wxamDecoderJni != null) {
            return wxamDecoderJni.g();
        }
        return 0;
    }

    @Override // wq.d
    public void c() {
        com.tencent.mm.jni.emojihelper.WxamDecoderJni wxamDecoderJni = this.f448484a;
        if (wxamDecoderJni != null) {
            wxamDecoderJni.c();
        }
        java.lang.Integer valueOf = wxamDecoderJni != null ? java.lang.Integer.valueOf(wxamDecoderJni.d(this.f448485b)) : null;
        if (valueOf != null) {
            valueOf.intValue();
        }
    }

    @Override // wq.d
    public int d() {
        com.tencent.mm.jni.emojihelper.WxamDecoderJni wxamDecoderJni = this.f448484a;
        if (wxamDecoderJni != null) {
            return wxamDecoderJni.e();
        }
        return 0;
    }

    @Override // wq.d
    public void destroy() {
        com.tencent.mm.jni.emojihelper.WxamDecoderJni wxamDecoderJni = this.f448484a;
        if (wxamDecoderJni != null) {
            wxamDecoderJni.i();
        }
    }

    @Override // wq.d
    public int e() {
        com.tencent.mm.jni.emojihelper.WxamDecoderJni wxamDecoderJni = this.f448484a;
        if (wxamDecoderJni != null) {
            return wxamDecoderJni.h();
        }
        return 0;
    }

    @Override // wq.d
    public android.graphics.Bitmap getFrame() {
        return this.f448485b;
    }

    @Override // wq.d
    public void seekTo(long j17) {
    }
}
