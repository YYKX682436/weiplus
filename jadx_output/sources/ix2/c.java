package ix2;

/* loaded from: classes10.dex */
public final class c implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPickView f295352a;

    public c(com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPickView finderEmojiPickView) {
        this.f295352a = finderEmojiPickView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        java.lang.String valueOf;
        com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPickView finderEmojiPickView = this.f295352a;
        com.tencent.mm.pluginsdk.ui.k0 k0Var = finderEmojiPickView.f132039d;
        if (k0Var == null) {
            kotlin.jvm.internal.o.o("textListener");
            throw null;
        }
        k0Var.a(str);
        if (finderEmojiPickView.getPickEmojiStr().length() > 0) {
            valueOf = finderEmojiPickView.getPickEmojiStr() + ';' + str;
        } else {
            valueOf = java.lang.String.valueOf(str);
        }
        finderEmojiPickView.setPickEmojiStr(valueOf);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
