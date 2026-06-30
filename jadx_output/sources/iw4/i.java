package iw4;

/* loaded from: classes15.dex */
public final class i implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI f295260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f295261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f295262c;

    public i(com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI, kotlin.jvm.internal.h0 h0Var, android.content.Context context) {
        this.f295260a = sosSimilarUI;
        this.f295261b = h0Var;
        this.f295262c = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        kotlin.jvm.internal.h0 h0Var = this.f295261b;
        com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI = this.f295260a;
        if (z17) {
            com.tencent.mm.feature.emoji.api.y5 y5Var = (com.tencent.mm.feature.emoji.api.y5) i95.n0.c(com.tencent.mm.feature.emoji.api.y5.class);
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = sosSimilarUI.f182050d.f295245e;
            ((com.tencent.mm.feature.emoji.s0) y5Var).Ai(similarEmojiQueryModel != null ? similarEmojiQueryModel.f193154i : null, (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                tg3.a1 a17 = tg3.t1.a();
                com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel2 = sosSimilarUI.f182050d.f295245e;
                ((dk5.s5) a17).Ui(str, similarEmojiQueryModel2 != null ? similarEmojiQueryModel2.f193154i : null);
            }
            android.content.Context context = this.f295262c;
            db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.f490553yc), 1).show();
        }
        sosSimilarUI.V6((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d, z17);
    }
}
