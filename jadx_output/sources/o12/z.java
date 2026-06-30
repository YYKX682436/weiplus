package o12;

/* loaded from: classes10.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o12.d0 f342195d;

    public z(o12.d0 d0Var) {
        this.f342195d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o12.d0 d0Var = this.f342195d;
        java.util.List list = d0Var.f342141e;
        d0Var.f342142f = (o12.y) list.get((list.indexOf(d0Var.f342142f) + 1) % d0Var.f342141e.size());
        android.widget.ImageView imageView = d0Var.f342139c;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("switcherButton");
            throw null;
        }
        imageView.setImageResource(d0Var.f342142f.b());
        o12.y yVar = d0Var.f342142f;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText = d0Var.f342137a;
        if (emojiEditorEditableText == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        yVar.a(emojiEditorEditableText, d0Var.f342140d);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
