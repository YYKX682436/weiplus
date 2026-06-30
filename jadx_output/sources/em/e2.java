package em;

/* loaded from: classes9.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254279a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView f254280b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.CheckBox f254281c;

    public e2(android.view.View view) {
        this.f254279a = view;
    }

    public com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView a() {
        if (this.f254280b == null) {
            this.f254280b = (com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView) this.f254279a.findViewById(com.tencent.mm.R.id.f487109va5);
        }
        return this.f254280b;
    }
}
