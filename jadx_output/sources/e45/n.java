package e45;

/* loaded from: classes3.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.r f249413d;

    public n(e45.r rVar) {
        this.f249413d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f249413d.R6(false, false);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
