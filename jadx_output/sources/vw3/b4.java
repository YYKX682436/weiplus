package vw3;

/* loaded from: classes8.dex */
public final class b4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final vw3.b4 f440892d = new vw3.b4();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((vc.s) ((wc.o) i95.n0.c(wc.o.class))).getClass();
        com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl kindaCacheServiceImpl = new com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl();
        byte[] bytes = "0".getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        kindaCacheServiceImpl.set("TOUCH_ID_OPEN_TIPS_SHOW_TIMES_KEY", bytes, 0L);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
