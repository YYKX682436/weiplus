package xu4;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final xu4.b f457281d = new xu4.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        byte[] decode = android.util.Base64.decode(it, 0);
        int length = decode.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(decode);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/emojisearch/EmojiSearchJSApi$sendEmoticonStream$imageStringArray$2", "invoke", "(Ljava/lang/String;)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/websearch/emojisearch/EmojiSearchJSApi$sendEmoticonStream$imageStringArray$2", "invoke", "(Ljava/lang/String;)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(decodeByteArray.getRowBytes() * decodeByteArray.getHeight());
        decodeByteArray.copyPixelsToBuffer(allocate);
        return allocate.array();
    }
}
