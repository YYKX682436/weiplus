package uq5;

/* loaded from: classes10.dex */
public final class v implements com.tencent.mm.xeffect.effect.IStickerDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f430262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f430263b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430264c;

    public v(java.lang.String path) {
        kotlin.jvm.internal.o.h(path, "path");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(path);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/xeffect/effect/StickerDecoder", "<init>", "(Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/xeffect/effect/StickerDecoder", "<init>", "(Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.c(decodeFile, "BitmapFactory.decodeFile(path)");
        this.f430262a = decodeFile;
        this.f430263b = decodeFile.getWidth();
        this.f430264c = decodeFile.getHeight();
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public void destroy() {
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public long duration() {
        return 1073741824L;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public android.graphics.Bitmap getFrame() {
        return this.f430262a;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public void seekTo(long j17) {
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public android.util.Size size() {
        return new android.util.Size(this.f430263b, this.f430264c);
    }

    public v(byte[] bytes) {
        kotlin.jvm.internal.o.h(bytes, "bytes");
        int length = bytes.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(bytes);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/xeffect/effect/StickerDecoder", "<init>", "([B)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/xeffect/effect/StickerDecoder", "<init>", "([B)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.c(decodeByteArray, "BitmapFactory.decodeByte…ray(bytes, 0, bytes.size)");
        this.f430262a = decodeByteArray;
        this.f430263b = decodeByteArray.getWidth();
        this.f430264c = decodeByteArray.getHeight();
    }
}
