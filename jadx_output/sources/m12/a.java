package m12;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Rect f322815a;

    /* renamed from: b, reason: collision with root package name */
    public int f322816b;

    /* renamed from: c, reason: collision with root package name */
    public int f322817c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f322818d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322819e;

    public a(java.lang.String inputPath, java.lang.String outputPath) {
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        this.f322815a = new android.graphics.Rect();
    }

    public boolean a() {
        if (this.f322816b <= 0 || this.f322817c <= 0) {
            com.tencent.mars.xlog.Log.e("MicoMsg.EmojiGenerator", "emoji size invalid");
            return false;
        }
        if (this.f322815a.width() <= 0 || this.f322815a.height() <= 0) {
            com.tencent.mars.xlog.Log.e("MicoMsg.EmojiGenerator", "crop size invalid");
            return false;
        }
        android.graphics.Rect rect = this.f322815a;
        if (rect.left + rect.width() > this.f322816b) {
            com.tencent.mars.xlog.Log.e("MicoMsg.EmojiGenerator", "crop width large than output size");
            return false;
        }
        android.graphics.Rect rect2 = this.f322815a;
        if (rect2.top + rect2.height() <= this.f322817c) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicoMsg.EmojiGenerator", "crop height large than output size");
        return false;
    }

    public final void b(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.String k17 = gm0.j1.b().k();
        kotlin.jvm.internal.o.f(k17, "getUserName(...)");
        byte[] bytes = k17.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        com.tencent.mm.vfs.w6.a(filePath, bytes);
    }

    public abstract java.lang.Object c(kotlin.coroutines.Continuation continuation);
}
