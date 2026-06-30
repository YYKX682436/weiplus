package q50;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI f360140d;

    public d(com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI forwardMsgPreviewUI) {
        this.f360140d = forwardMsgPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ui/ForwardMsgPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j75.f stateCenter = this.f360140d.getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(new wg5.d());
        }
        yj0.a.h(this, "com/tencent/mm/feature/forward/ui/ForwardMsgPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
