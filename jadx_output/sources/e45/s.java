package e45;

/* loaded from: classes.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.t f249426d;

    public s(e45.t tVar) {
        this.f249426d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorPreviewActionBarUIC$onCreateAfter$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f249426d.getActivity().finish();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorPreviewActionBarUIC$onCreateAfter$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
