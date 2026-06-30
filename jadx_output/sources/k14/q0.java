package k14;

/* loaded from: classes11.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.r0 f303370d;

    public q0(k14.r0 r0Var) {
        this.f303370d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.vp vpVar = (com.tencent.mm.plugin.setting.ui.setting.vp) this.f303370d.f303371e.f303413l;
        vpVar.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.UnfamiliarContactUI", "[onError]");
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = vpVar.f161678b;
        android.view.View findViewById = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.o_j);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.lbl);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        unfamiliarContactDetailUI.f160775p.setText(unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2u));
    }
}
