package yh5;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yh5.e f462423d;

    public c(yh5.e eVar) {
        this.f462423d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yh5.e eVar = this.f462423d;
        lf3.j jVar = (lf3.j) eVar.U6(lf3.j.class);
        android.view.View findViewById = eVar.getActivity().findViewById(com.tencent.mm.R.id.tzq);
        if (jVar == null || findViewById == null) {
            com.tencent.mars.xlog.Log.w("CleanGalleryToolbarComponent", "pageAnim or previewView null, fallback finish");
            eVar.getActivity().finish();
        } else {
            jVar.E2(findViewById);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
