package dy0;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar f244552d;

    public e(com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar composingBottomToolBar) {
        this.f244552d = composingBottomToolBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$initViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dy0.j jVar = this.f244552d.f69681n;
        if (jVar != null) {
            kotlin.jvm.internal.o.d(view);
            jVar.a(view, dy0.a.f244540e);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$initViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
