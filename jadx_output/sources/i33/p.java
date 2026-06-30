package i33;

/* loaded from: classes.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.u f288233d;

    public p(i33.u uVar) {
        this.f288233d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumFilePreviewUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumFilePreviewUIC$onCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/uic/AlbumFilePreviewUIC$onCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_file_preview_send_as_file", false);
        intent.putExtra("album_file_preview_send", false);
        i33.u uVar = this.f288233d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = uVar.P6();
        if (P6 != null) {
            P6.setResult(-1, intent);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = uVar.P6();
        if (P62 != null) {
            P62.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumFilePreviewUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
