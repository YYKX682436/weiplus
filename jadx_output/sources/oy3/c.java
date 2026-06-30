package oy3;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final oy3.c f350013d = new oy3.c();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.model.l3.ij().J0(new ny3.a());
        ny3.a aVar = new ny3.a();
        aVar.field_orderIndex = 3;
        aVar.field_quickMsg = "稍后回复";
        com.tencent.mm.plugin.exdevice.model.l3.ij().J0(aVar);
        ny3.a aVar2 = new ny3.a();
        aVar2.field_quickMsg = "稍后";
        com.tencent.mm.plugin.exdevice.model.l3.ij().J0(aVar2);
        ny3.a aVar3 = new ny3.a();
        aVar3.field_orderIndex = 1;
        aVar3.field_quickMsg = "稍后回复1";
        com.tencent.mm.plugin.exdevice.model.l3.ij().J0(aVar3);
        ny3.a aVar4 = new ny3.a();
        aVar4.field_orderIndex = 2;
        aVar4.field_quickMsg = "稍后回复2";
        com.tencent.mm.plugin.exdevice.model.l3.ij().J0(aVar4);
        java.util.ArrayList z07 = com.tencent.mm.plugin.exdevice.model.l3.ij().z0();
        if (!z07.isEmpty()) {
            java.util.Iterator it = z07.iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", ((ny3.a) it.next()).toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
