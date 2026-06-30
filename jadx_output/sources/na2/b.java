package na2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na2.c f335953d;

    public b(na2.c cVar) {
        this.f335953d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        na2.c cVar = this.f335953d;
        if (!cVar.getActivity().isFinishing()) {
            cVar.getActivity().finish();
        }
        androidx.appcompat.app.AppCompatActivity activity = cVar.getActivity();
        com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI finderPostPlayUI = activity instanceof com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI ? (com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI) activity : null;
        if (finderPostPlayUI != null) {
            finderPostPlayUI.f101801v = 1;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
