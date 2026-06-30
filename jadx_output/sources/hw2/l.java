package hw2;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f285541d;

    public l(hw2.t tVar) {
        this.f285541d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$setupSettingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f285541d.f285566n.setShow(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$setupSettingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
