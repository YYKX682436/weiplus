package en4;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC f255341d;

    public g(com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC topStorySearchUIC) {
        this.f255341d = topStorySearchUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/uic/TopStorySearchUIC$handleSearchButtonVisibility$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC topStorySearchUIC = this.f255341d;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = (com.tencent.mm.plugin.topstory.ui.home.j) ((jz5.n) topStorySearchUIC.f175122d).getValue();
        vm4.b bVar = new vm4.b(((com.tencent.mm.plugin.topstory.ui.home.j) ((jz5.n) topStorySearchUIC.f175122d).getValue()).h());
        j75.f stateCenter = jVar.f174986d.getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(bVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/uic/TopStorySearchUIC$handleSearchButtonVisibility$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
