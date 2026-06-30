package oy3;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final oy3.g f350019d = new oy3.g();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINOF_WATCH_READ_PRIVACY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
