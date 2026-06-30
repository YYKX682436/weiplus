package m22;

/* loaded from: classes12.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m22.o f323058d;

    public n(m22.o oVar) {
        this.f323058d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m22.o oVar = this.f323058d;
        m22.p pVar = (m22.p) oVar.f323046d;
        if (pVar != null) {
            oVar.f323059e.a(pVar, oVar.getAdapterPosition());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
