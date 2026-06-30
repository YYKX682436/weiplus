package zl2;

/* loaded from: classes.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f473900d;

    public n2(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f473900d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$handleLiveErrPage$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "eligibilityJumpInfo click cancel");
        this.f473900d.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$handleLiveErrPage$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
