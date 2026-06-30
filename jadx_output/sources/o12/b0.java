package o12;

/* loaded from: classes10.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o12.d0 f342131d;

    public b0(o12.d0 d0Var) {
        this.f342131d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o12.d0 d0Var = this.f342131d;
        yz5.l lVar = d0Var.f342144h;
        if (lVar != null) {
            lVar.invoke(d0Var.f342143g);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
