package lr;

/* loaded from: classes4.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.j0 f320515d;

    public f0(lr.j0 j0Var) {
        this.f320515d = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j45.l.j(this.f320515d.f320535g.getContext(), "emoji", ".ui.EmojiMineUI", new android.content.Intent(), null);
        yj0.a.h(this, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
