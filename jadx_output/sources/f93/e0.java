package f93;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260324d;

    public e0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260324d = contactEditLabel;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getAction() == 0) {
            com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260324d;
            contactEditLabel.hideVKB();
            contactEditLabel.B = (int) event.getRawX();
            contactEditLabel.C = (int) event.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
