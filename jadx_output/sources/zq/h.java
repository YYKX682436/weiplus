package zq;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final zq.h f474972a = new zq.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f474973b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final fp0.o f474974c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f474975d;

    static {
        fp0.o oVar = new fp0.o(new gp0.g(new zq.f(), new gp0.h(5, 5), 2, "EmojiLoader"));
        f474974c = oVar;
        oVar.g(new zq.g());
    }

    public final er.f a(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        er.f fVar = (er.f) f474973b.get(emojiInfo.getMd5() + "_cover");
        return fVar == null ? new er.b(emojiInfo) : fVar;
    }

    public final void b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader", "cancel: " + view);
        dr.s sVar = (dr.s) view.getTag(com.tencent.mm.R.id.dbt);
        if (sVar != null) {
            sVar.a();
        }
    }

    public final dr.g c(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, dr.r rVar) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        dr.g gVar = new dr.g(emojiInfo, rVar);
        dr.s.g(gVar, false, 1, null);
        return gVar;
    }

    public final dr.i d(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, android.widget.ImageView view, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(view, "view");
        dr.i iVar = new dr.i(emojiInfo, view, drawable);
        dr.s.g(iVar, false, 1, null);
        return iVar;
    }

    public final dr.j e(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, dr.q qVar) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        return f(emojiInfo, true, qVar);
    }

    public final dr.j f(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17, dr.q qVar) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader", "load emoji file " + emojiInfo.getMd5());
        dr.j jVar = new dr.j(emojiInfo, qVar);
        jVar.f(z17);
        return jVar;
    }
}
