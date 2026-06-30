package y22;

/* loaded from: classes10.dex */
public final class r implements ph3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f459110a;

    public r(com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView) {
        this.f459110a = emojiVideoPlayTextureView;
    }

    @Override // ph3.d
    public void a(int i17, int i18, int i19) {
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f459110a;
        com.tencent.mars.xlog.Log.i(emojiVideoPlayTextureView.f98622h, "video size changed size[%d, %d] degrees[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        emojiVideoPlayTextureView.f98628q = i17;
        emojiVideoPlayTextureView.f98627p = i18;
        emojiVideoPlayTextureView.f98624m.f459084d.u(i17, i18);
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = emojiVideoPlayTextureView.f98632u;
        if (a4Var != null) {
            a4Var.T4(emojiVideoPlayTextureView.f98628q, emojiVideoPlayTextureView.f98627p);
        }
    }

    @Override // ph3.d
    public void onCompletion() {
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f459110a.f98632u;
        if (a4Var != null) {
            a4Var.onCompletion();
        }
    }

    @Override // ph3.d
    public void onError(int i17, int i18) {
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f459110a.f98632u;
        if (a4Var != null) {
            a4Var.onError(i17, i18);
        }
    }

    @Override // ph3.d
    public void onPrepared() {
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f459110a;
        com.tencent.mars.xlog.Log.i(emojiVideoPlayTextureView.f98622h, "onPrepared: ");
        emojiVideoPlayTextureView.f98629r = true;
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = emojiVideoPlayTextureView.f98632u;
        if (a4Var != null) {
            a4Var.onPrepared();
        }
        emojiVideoPlayTextureView.requestLayout();
    }

    @Override // ph3.d
    public void onSeekComplete() {
        int i17 = com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView.f98621z;
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f459110a;
        emojiVideoPlayTextureView.getClass();
        if (!emojiVideoPlayTextureView.f98630s) {
            java.lang.String str = emojiVideoPlayTextureView.f98622h;
            emojiVideoPlayTextureView.f98630s = true;
            return;
        }
        java.lang.String str2 = emojiVideoPlayTextureView.f98622h;
        ph3.k kVar = emojiVideoPlayTextureView.f98626o;
        if (kVar != null) {
            kVar.m();
        }
        ph3.k kVar2 = emojiVideoPlayTextureView.f98626o;
        if (kVar2 != null) {
            kVar2.start();
        }
    }
}
