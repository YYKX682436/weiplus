package o12;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer f342180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o12.u f342181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText f342182f;

    public t(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer emojiEditorTextDecorationsContainer, o12.u uVar, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText) {
        this.f342180d = emojiEditorTextDecorationsContainer;
        this.f342181e = uVar;
        this.f342182f = emojiEditorEditableText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer emojiEditorTextDecorationsContainer = this.f342180d;
        if (emojiEditorTextDecorationsContainer.isEnabled()) {
            yz5.l onUpdateText = emojiEditorTextDecorationsContainer.getOnUpdateText();
            if (onUpdateText != null) {
                onUpdateText.invoke(this.f342181e);
            }
            emojiEditorTextDecorationsContainer.removeView(this.f342182f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
