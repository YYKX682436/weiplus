package sf4;

/* loaded from: classes4.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView f407576d;

    public s(com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView galleryVerticalControlView) {
        this.f407576d = galleryVerticalControlView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a onMenu = this.f407576d.getOnMenu();
        if (onMenu != null) {
            onMenu.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
