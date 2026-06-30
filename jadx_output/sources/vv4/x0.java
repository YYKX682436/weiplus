package vv4;

/* loaded from: classes3.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI f440519d;

    public x0(com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
        this.f440519d = webSearchSnsImageLoadingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f440519d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
