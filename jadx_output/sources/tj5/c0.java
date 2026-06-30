package tj5;

/* loaded from: classes8.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.WebSearchView f419837d;

    public c0(com.tencent.mm.ui.search.WebSearchView webSearchView) {
        this.f419837d = webSearchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/WebSearchView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tj5.y yVar = this.f419837d.f209856h;
        if (yVar != null) {
            kotlin.jvm.internal.o.d(view);
            yVar.onClickBackBtn(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/WebSearchView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
