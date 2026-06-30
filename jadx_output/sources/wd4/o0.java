package wd4;

/* loaded from: classes4.dex */
public final class o0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f444988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444989f;

    public o0(wd4.l1 l1Var, java.util.ArrayList arrayList, android.view.View view) {
        this.f444987d = l1Var;
        this.f444988e = arrayList;
        this.f444989f = view;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$addImageScanQRCode$1");
        g4Var.clear();
        wd4.l1 l1Var = this.f444987d;
        kd0.p2 e17 = l1Var.e();
        java.util.ArrayList arrayList = this.f444988e;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) e17).e(arrayList, wd4.r0.b(l1Var, this.f444989f, arrayList), l1Var.d(), g4Var, 6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$addImageScanQRCode$1");
    }
}
