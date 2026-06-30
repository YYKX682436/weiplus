package y12;

/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f458859a = 0;

    static {
        o11.f fVar = new o11.f();
        fVar.f342077a = true;
        fVar.f342085i = 1;
        fVar.f342095s = false;
        fVar.a();
    }

    public static o11.g a(java.lang.String str, java.lang.String str2, int i17, java.lang.Object... objArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
            return null;
        }
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342082f = str2;
        fVar.f342087k = i17;
        fVar.f342086j = i17;
        fVar.f342102z = objArr;
        return fVar.a();
    }

    public static o11.g b(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.String o17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.o(n22.m.g(), str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
            return null;
        }
        o11.f fVar = new o11.f();
        fVar.f342077a = true;
        fVar.f342078b = true;
        fVar.f342082f = o17;
        fVar.f342102z = objArr;
        return fVar.a();
    }

    public static o11.g c(java.lang.String str, java.lang.String str2, boolean z17, java.lang.Object... objArr) {
        java.lang.String d17 = gm0.j1.u().d();
        java.lang.String o17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.o(n22.m.g(), str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
            return null;
        }
        o11.f fVar = new o11.f();
        fVar.f342077a = true;
        fVar.f342078b = true;
        fVar.f342082f = o17;
        fVar.f342083g = d17;
        fVar.f342102z = objArr;
        return fVar.a();
    }
}
