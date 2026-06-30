package dc2;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout f228704d;

    public k(com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        this.f228704d = finderLiveFixRatioPhoneEditPluginLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout.f105304x;
        com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout = this.f228704d;
        finderLiveFixRatioPhoneEditPluginLayout.getEditPhotoWrapper().b();
        finderLiveFixRatioPhoneEditPluginLayout.getEditPhotoWrapper().c(new dc2.j(finderLiveFixRatioPhoneEditPluginLayout));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
