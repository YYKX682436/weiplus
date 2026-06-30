package k14;

/* loaded from: classes11.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.r0 f303369d;

    public p0(k14.r0 r0Var) {
        this.f303369d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.vp vpVar = (com.tencent.mm.plugin.setting.ui.setting.vp) this.f303369d.f303371e.f303413l;
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = vpVar.f161678b;
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "[onSuccess] size:%s cost:%sms", java.lang.Integer.valueOf(unfamiliarContactDetailUI.f160779t.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - vpVar.f161677a));
        android.widget.TextView textView = unfamiliarContactDetailUI.f160770h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2o));
        sb6.append("(");
        java.util.ArrayList arrayList = unfamiliarContactDetailUI.f160779t;
        sb6.append(arrayList.size());
        sb6.append(")");
        textView.setText(sb6.toString());
        if (arrayList.size() != 0) {
            android.view.View findViewById = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.o_j);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.i3k);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.setting.ui.setting.xp xpVar = unfamiliarContactDetailUI.f160776q;
            if (xpVar != null) {
                xpVar.notifyDataSetChanged();
                return;
            }
            return;
        }
        android.view.View findViewById3 = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.o_j);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.lbl);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById5 = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.i3k);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        unfamiliarContactDetailUI.f160775p.setText(unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.gg_));
    }
}
