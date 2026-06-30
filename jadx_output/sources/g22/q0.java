package g22;

/* loaded from: classes11.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f267856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView f267858f;

    public q0(android.widget.TextView textView, java.lang.String str, com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView) {
        this.f267856d = textView;
        this.f267857e = str;
        this.f267858f = emojiStoreV3TabView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f267856d;
        java.lang.String str = this.f267857e;
        textView.setText(str);
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView = this.f267858f;
        textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(emojiStoreV3TabView.getContext(), java.lang.Integer.parseInt(str)));
        emojiStoreV3TabView.getUnread();
        la5.b.f317600a.d(emojiStoreV3TabView, emojiStoreV3TabView.getText(), emojiStoreV3TabView.getUnread(), 0);
    }
}
