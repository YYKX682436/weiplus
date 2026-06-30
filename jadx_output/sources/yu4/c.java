package yu4;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f465867d;

    public c(android.view.View view) {
        this.f465867d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchDialog$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f465867d;
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = (com.tencent.mm.ui.search.FTSEditTextView) view2.findViewById(com.tencent.mm.R.id.gfl);
        if (fTSEditTextView != null) {
            fTSEditTextView.m();
        }
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView2 = (com.tencent.mm.ui.search.FTSEditTextView) view2.findViewById(com.tencent.mm.R.id.gfl);
        if (fTSEditTextView2 != null) {
            fTSEditTextView2.s();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchDialog$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
