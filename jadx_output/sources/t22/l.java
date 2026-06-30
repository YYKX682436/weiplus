package t22;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f415093a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f415094b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.feature.emoji.api.m5 f415095c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f415096d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f415097e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.u3 f415098f;

    /* renamed from: g, reason: collision with root package name */
    public final t22.j f415099g;

    public l(android.content.Context context, java.lang.String url, com.tencent.mm.feature.emoji.api.m5 onResult) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(onResult, "onResult");
        this.f415093a = context;
        this.f415094b = url;
        this.f415095c = onResult;
        this.f415096d = "MicroMsg.CheckStickerDownload";
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490380td);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f415098f = com.tencent.mm.ui.widget.dialog.u3.f(context, string, true, 0, new t22.k(this));
        t22.j jVar = new t22.j(this);
        this.f415099g = jVar;
        u85.i iVar = u85.i.f425707a;
        iVar.e(jVar);
        com.tencent.mm.sticker.loader.StickerLoadInfo stickerLoadInfo = new com.tencent.mm.sticker.loader.StickerLoadInfo(1);
        stickerLoadInfo.f193694i = url;
        iVar.d(stickerLoadInfo);
    }

    public final void a(boolean z17) {
        this.f415098f.dismiss();
        u85.i.f425707a.f(this.f415099g);
        this.f415095c.a(z17);
    }
}
