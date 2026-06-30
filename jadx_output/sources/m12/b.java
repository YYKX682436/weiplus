package m12;

/* loaded from: classes10.dex */
public final class b extends m12.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f322820f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f322821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String inputPath, java.lang.String outputPath) {
        super(inputPath, outputPath);
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        this.f322820f = inputPath;
        this.f322821g = outputPath;
    }

    @Override // m12.a
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        java.lang.String str = this.f322821g;
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.h(str);
        }
        com.tencent.mm.vfs.w6.c(this.f322820f, str);
        if (this.f322819e) {
            try {
                b(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GifEmojiGenerator", "doAddUserData error: " + e17);
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
