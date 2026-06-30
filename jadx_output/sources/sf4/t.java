package sf4;

/* loaded from: classes4.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView f407579d;

    public t(com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView galleryVerticalControlView) {
        this.f407579d = galleryVerticalControlView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a onAllFav = this.f407579d.getOnAllFav();
        if (onAllFav != null) {
            onAllFav.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
