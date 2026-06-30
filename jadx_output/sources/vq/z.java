package vq;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439237d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://game.weixin.qq.com/cgi-bin/h5/static/act_dnfm/index.html?noticeid=90248502&wechat_pkgid=act_dnfm_index&actid=138433&nav_color=F2D8AB&darkmode_nav_color=F2D8AB&hide_share_option=1#wechat_redirect");
        intent.putExtra("from_shortcut", true);
        intent.putExtra("disable_minimize", true);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439237d;
        j45.l.n(emojiDebugUI, "webview", ".ui.tools.WebViewUI", intent, 1001);
        emojiDebugUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        return jz5.f0.f302826a;
    }
}
