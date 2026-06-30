package vi1;

/* loaded from: classes7.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.y1 f437484d;

    public w1(vi1.y1 y1Var) {
        this.f437484d = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.y1 y1Var = this.f437484d;
        java.lang.String str = y1Var.f437507y;
        android.content.Context context = y1Var.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        y1Var.f437508z = new vi1.l0(str, context, y1Var.A);
        y1Var.f437310q.setAdapter(y1Var.f437508z);
        if (y1Var.A.size() == 0) {
            android.view.View view = y1Var.f437313t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y1Var.f437310q.setVisibility(8);
            y1Var.f437311r.setVisibility(8);
            return;
        }
        if (y1Var.A.size() == 1) {
            android.view.View view2 = y1Var.f437313t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y1Var.f437310q.setVisibility(0);
            androidx.recyclerview.widget.f2 adapter = y1Var.f437310q.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            y1Var.f437311r.setVisibility(0);
            y1Var.f437311r.setText(y1Var.getContext().getString(com.tencent.mm.R.string.a3s));
            if (vi1.l1.f437399a.a().r8()) {
                return;
            }
            y1Var.f437311r.setVisibility(8);
            return;
        }
        android.view.View view3 = y1Var.f437313t;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        y1Var.f437310q.setVisibility(0);
        y1Var.f437311r.setVisibility(0);
        androidx.recyclerview.widget.f2 adapter2 = y1Var.f437310q.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        y1Var.f437311r.setText(y1Var.getContext().getString(com.tencent.mm.R.string.a3r));
        if (vi1.l1.f437399a.a().r8()) {
            return;
        }
        y1Var.f437311r.setVisibility(8);
    }
}
