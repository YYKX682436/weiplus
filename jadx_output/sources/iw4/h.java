package iw4;

/* loaded from: classes15.dex */
public final class h implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI f295258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f295259b;

    public h(com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI, kotlin.jvm.internal.h0 h0Var) {
        this.f295258a = sosSimilarUI;
        this.f295259b = h0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.feature.emoji.api.y5 y5Var = (com.tencent.mm.feature.emoji.api.y5) i95.n0.c(com.tencent.mm.feature.emoji.api.y5.class);
            com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI = this.f295258a;
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = sosSimilarUI.f182050d.f295245e;
            java.lang.String str2 = similarEmojiQueryModel != null ? similarEmojiQueryModel.f193154i : null;
            kotlin.jvm.internal.h0 h0Var = this.f295259b;
            ((com.tencent.mm.feature.emoji.s0) y5Var).Ai(str2, (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d, null);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_EMOJI_INFO_RESULT", (android.os.Parcelable) h0Var.f310123d);
            sosSimilarUI.setResult(-1, intent);
            sosSimilarUI.finish();
        }
    }
}
