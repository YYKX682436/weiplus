package o12;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o12.d0 f342129d;

    public a0(o12.d0 d0Var) {
        this.f342129d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.graphics.Rect rect;
        android.graphics.Rect rect2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o12.d0 d0Var = this.f342129d;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText = d0Var.f342137a;
        if (emojiEditorEditableText == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        int i17 = 0;
        if (!(java.lang.String.valueOf(emojiEditorEditableText.getText()).length() > 0)) {
            yz5.l lVar = d0Var.f342144h;
            if (lVar != null) {
                lVar.invoke(null);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        o12.u uVar = d0Var.f342143g;
        int i18 = (uVar == null || (rect2 = uVar.f342186d) == null) ? 0 : rect2.left;
        if (uVar != null && (rect = uVar.f342186d) != null) {
            i17 = rect.top;
        }
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText2 = d0Var.f342137a;
        if (emojiEditorEditableText2 == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(emojiEditorEditableText2.getText());
        o12.y yVar = d0Var.f342142f;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText3 = d0Var.f342137a;
        if (emojiEditorEditableText3 == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        int width = emojiEditorEditableText3.getWidth() + i18;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText4 = d0Var.f342137a;
        if (emojiEditorEditableText4 == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        o12.u uVar2 = new o12.u(valueOf, yVar, d0Var.f342140d, new android.graphics.Rect(i18, i17, width, emojiEditorEditableText4.getHeight() + i17), -1.0f, new android.graphics.Rect(), 1.0f, 0.0f, false);
        o12.u uVar3 = d0Var.f342143g;
        if (uVar3 != null) {
            uVar2.f342190h = uVar3.f342190h;
            uVar2.f342189g = uVar3.f342189g;
            uVar2.f342191i = uVar3.f342191i;
        }
        yz5.l lVar2 = d0Var.f342144h;
        if (lVar2 != null) {
            lVar2.invoke(uVar2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
