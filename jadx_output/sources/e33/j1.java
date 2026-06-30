package e33;

/* loaded from: classes4.dex */
public class j1 implements android.view.View.OnClickListener {
    public j1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
