package vv4;

/* loaded from: classes12.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440490e;

    public p0(com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI, java.lang.String str) {
        this.f440489d = webSearchImageLoadingUI;
        this.f440490e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$startImageSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440489d;
        ((com.tencent.mm.plugin.gif.MMAnimateView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.im6)).setVisibility(0);
        ((android.widget.TextView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.iml)).setVisibility(0);
        ((android.widget.TextView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dhn)).setVisibility(8);
        ((android.widget.Button) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dhe)).setVisibility(8);
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI2 = this.f440489d;
        java.lang.String str = webSearchImageLoadingUI2.f181656f;
        long j17 = webSearchImageLoadingUI2.f181655e;
        int i17 = webSearchImageLoadingUI2.f181659i;
        java.lang.String imagePath = this.f440490e;
        kotlin.jvm.internal.o.f(imagePath, "$imagePath");
        webSearchImageLoadingUI2.V6(str, j17, i17, imagePath);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$startImageSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
