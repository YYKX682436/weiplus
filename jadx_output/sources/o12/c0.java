package o12;

/* loaded from: classes10.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o12.d0 f342133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f342134e;

    public c0(o12.d0 d0Var, int i17) {
        this.f342133d = d0Var;
        this.f342134e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o12.d0 d0Var = this.f342133d;
        int i17 = this.f342134e;
        d0Var.f342140d = i17;
        o12.y yVar = d0Var.f342142f;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText = d0Var.f342137a;
        if (emojiEditorEditableText == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        yVar.a(emojiEditorEditableText, i17);
        d0Var.b();
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
