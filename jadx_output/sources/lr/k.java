package lr;

/* loaded from: classes.dex */
public final class k implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f320549a;

    public k(android.content.Context context) {
        this.f320549a = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_emoji_panel_type", 1);
            j45.l.j(this.f320549a, "emoji", ".ui.EmojiCustomUI", intent, null);
        }
    }
}
