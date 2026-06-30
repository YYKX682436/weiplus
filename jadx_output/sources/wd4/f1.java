package wd4;

/* loaded from: classes12.dex */
public final class f1 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444901e;

    public f1(yz5.a aVar, wd4.l1 l1Var) {
        this.f444900d = aVar;
        this.f444901e = l1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnSheetDismissListener$1");
        this.f444900d.invoke();
        wd4.l1 l1Var = this.f444901e;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) l1Var.e()).n();
        r45.pk5 f17 = l1Var.f();
        if (f17 != null) {
            f17.f383132d = 1;
            f17.f383140o = (int) (android.os.SystemClock.elapsedRealtime() - f17.f383143r);
        }
        l35.a.f315443a.a(l1Var.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnSheetDismissListener$1");
    }
}
