package kh;

/* loaded from: classes10.dex */
public final class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final kh.f4 f307801d = new kh.f4();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.reflect.Field field;
        kh.k4 k4Var = kh.k4.f307844a;
        java.util.Iterator it = ((java.util.Map) kh.k4.f307850g.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) ((java.util.Map.Entry) it.next()).getValue();
            android.content.Context context = (android.content.Context) ((java.lang.ref.WeakReference) lVar.f302833d).get();
            android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) ((java.lang.ref.WeakReference) lVar.f302834e).get();
            if ((context instanceof android.app.Activity) && viewTreeObserver != null && ((android.app.Activity) context).isFinishing()) {
                kh.k4 k4Var2 = kh.k4.f307844a;
                for (java.util.Map.Entry entry : ((java.util.HashMap) kh.k4.f307849f.getValue()).entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.Object obj = ((java.lang.reflect.Field) entry.getValue()).get(viewTreeObserver);
                    java.lang.Object obj2 = (obj == null || (obj instanceof java.util.List) || (field = kh.k4.f307848e) == null) ? null : field.get(obj);
                    if (obj != null) {
                        kh.e4 e4Var = new kh.e4(context, viewTreeObserver, str);
                        if ((obj instanceof java.util.List) && (!((java.util.Collection) obj).isEmpty())) {
                            e4Var.invoke(obj);
                        }
                        if ((obj2 instanceof java.util.List) && (!((java.util.Collection) obj2).isEmpty())) {
                            e4Var.invoke(obj2);
                        }
                    }
                }
            }
        }
    }
}
