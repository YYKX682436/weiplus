package ko3;

/* loaded from: classes13.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f309935d;

    public b0(android.view.View.OnClickListener onClickListener) {
        this.f309935d = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Class cls;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map map = ko3.d0.f309938a;
        synchronized (map) {
            if (((java.util.WeakHashMap) map).containsKey(view)) {
                java.util.Map map2 = ko3.d0.f309939b;
                synchronized (map2) {
                    try {
                        if (((java.util.WeakHashMap) map2).containsKey(view)) {
                            ((java.util.WeakHashMap) map2).remove(view);
                        } else {
                            cls = (java.lang.Class) ((java.util.WeakHashMap) map).get(view);
                            if (cls != null) {
                                ((com.tencent.mm.sdk.event.IEvent) cls.newInstance()).e();
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CBCH", th6, "failure to instantiate event class: ".concat(cls.getName()), new java.lang.Object[0]);
                    } finally {
                    }
                }
            }
        }
        android.view.View.OnClickListener onClickListener = this.f309935d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
