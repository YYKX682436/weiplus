package e33;

/* loaded from: classes10.dex */
public class c6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.g6 f247193d;

    public c6(e33.g6 g6Var) {
        this.f247193d = g6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        e33.z5 z5Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$SearchAlbumAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if ((tag instanceof t23.f2) && (z5Var = this.f247193d.f247239f) != null) {
            ((e33.s5) z5Var).a((t23.f2) tag);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$SearchAlbumAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
