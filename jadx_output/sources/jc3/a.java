package jc3;

/* loaded from: classes.dex */
public class a implements jc3.l {
    @Override // jc3.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/magicbrush/api/CommonViewOperationDelegateImpl", "onRequestHide", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/magicbrush/api/CommonViewOperationDelegateImpl", "onRequestHide", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("CommonViewOperationDelegateImpl", "onRequestHide");
    }

    @Override // jc3.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/magicbrush/api/CommonViewOperationDelegateImpl", "onRequestShow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/magicbrush/api/CommonViewOperationDelegateImpl", "onRequestShow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("CommonViewOperationDelegateImpl", "onRequestShow");
    }
}
