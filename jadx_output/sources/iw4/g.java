package iw4;

/* loaded from: classes15.dex */
public final class g implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f295255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI f295256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f295257c;

    public g(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI, android.content.Context context) {
        this.f295255a = h0Var;
        this.f295256b = sosSimilarUI;
        this.f295257c = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.pluginsdk.ui.chat.v9 v9Var;
        kotlin.jvm.internal.h0 h0Var = this.f295255a;
        com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI = this.f295256b;
        if (z17) {
            com.tencent.mm.feature.emoji.api.a6 a6Var = (com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d;
            ((com.tencent.mm.feature.emoji.u0) a6Var).getClass();
            y75.d dVar = y75.a.f459786a;
            if (dVar != null && (v9Var = dVar.f320568d) != null) {
                v9Var.b((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
            }
            tg3.a1 a17 = tg3.t1.a();
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = sosSimilarUI.f182050d.f295245e;
            ((dk5.s5) a17).Ui(str, similarEmojiQueryModel != null ? similarEmojiQueryModel.f193154i : null);
            android.content.Context context = this.f295257c;
            db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.f490553yc), 1).show();
        }
        sosSimilarUI.V6((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d, z17);
    }
}
