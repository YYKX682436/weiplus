package px2;

/* loaded from: classes2.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout f358899d;

    public k0(com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout) {
        this.f358899d = finderVideoLandscapePreviewLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        px2.v0 callback = this.f358899d.getCallback();
        if (callback != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.at) callback).f133803b.U6(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
