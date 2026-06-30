package oy3;

/* loaded from: classes5.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350010d;

    public a0(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350010d = rtosWatchLoginUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$switchStatusView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.E;
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350010d;
        rtosWatchLoginUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "jump to scan UI");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(rtosWatchLoginUI, "com.tencent.mm.plugin.scanner.ui.BaseScanUI");
        intent.putExtra("key_enable_multi_code", true);
        intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
        intent.putExtra("key_check_camera_using", true);
        intent.putExtra("key_scan_report_enter_scene", 19);
        intent.addFlags(67108864);
        androidx.appcompat.app.AppCompatActivity context = rtosWatchLoginUI.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI", "jumpToScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI", "jumpToScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        rtosWatchLoginUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$switchStatusView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
