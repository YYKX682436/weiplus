package yk3;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk3.h f462801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pk3.h hVar) {
        super(0);
        this.f462801d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pk3.h hVar = this.f462801d;
        android.view.View rootView = hVar != null ? hVar.getRootView() : null;
        if (rootView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(rootView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel$hideUIComponent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rootView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(rootView, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel$hideUIComponent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
