package vv4;

/* loaded from: classes3.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI f440517d;

    public w0(com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
        this.f440517d = webSearchSnsImageLoadingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI = this.f440517d;
        ((com.tencent.mm.plugin.gif.MMAnimateView) webSearchSnsImageLoadingUI.findViewById(com.tencent.mm.R.id.im6)).setVisibility(0);
        ((android.widget.TextView) webSearchSnsImageLoadingUI.findViewById(com.tencent.mm.R.id.iml)).setVisibility(0);
        ((android.widget.TextView) webSearchSnsImageLoadingUI.findViewById(com.tencent.mm.R.id.dhn)).setVisibility(8);
        ((android.widget.Button) webSearchSnsImageLoadingUI.findViewById(com.tencent.mm.R.id.dhe)).setVisibility(8);
        webSearchSnsImageLoadingUI.U6(webSearchSnsImageLoadingUI.f181676p);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
