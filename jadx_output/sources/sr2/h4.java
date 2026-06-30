package sr2;

/* loaded from: classes.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411580d;

    public h4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411580d = postMainUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$initKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.appcompat.app.AppCompatActivity activity = this.f411580d.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
