package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175079d;

    public s0(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175079d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long c17 = c01.id.c();
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175079d;
        if (c17 - jVar.f175003u < 300) {
            try {
                com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = jVar.f174991i;
                if (webSearchWebView != null && webSearchWebView.getView() != null) {
                    jVar.f174991i.getView().scrollTo(jVar.f174991i.getView().getScrollX(), 0);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        jVar.f175003u = c17;
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
