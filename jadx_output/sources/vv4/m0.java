package vv4;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440479d;

    public m0(com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI) {
        this.f440479d = webSearchImageLoadingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$onError$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f440479d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$onError$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
