package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f158726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f158727e;

    public g1(com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic, int i17, android.view.View.OnClickListener onClickListener) {
        this.f158726d = i17;
        this.f158727e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ScanCodeSheetItemLogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String z17 = com.tencent.mm.sdk.platformtools.t8.z1("%d,%d", java.lang.Integer.valueOf(this.f158726d), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeSheetItemLogic", "18684 report:" + z17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(18684, z17);
        this.f158727e.onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ScanCodeSheetItemLogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
