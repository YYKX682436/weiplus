package t22;

/* loaded from: classes10.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t22.l f415087a;

    public f(t22.l lVar) {
        this.f415087a = lVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        t22.l lVar = this.f415087a;
        lVar.getClass();
        u85.i iVar = u85.i.f425707a;
        java.lang.String url = lVar.f415094b;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.sticker.loader.StickerLoadInfo stickerLoadInfo = new com.tencent.mm.sticker.loader.StickerLoadInfo(1);
        stickerLoadInfo.f193694i = url;
        iVar.d(stickerLoadInfo);
    }
}
