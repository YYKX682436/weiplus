package wd4;

/* loaded from: classes12.dex */
public final class j1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f444938e;

    public j1(wd4.l1 l1Var, int[] iArr) {
        this.f444937d = l1Var;
        this.f444938e = iArr;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$2$1");
        wd4.l1 l1Var = this.f444937d;
        android.app.Activity c17 = l1Var.c();
        kotlin.jvm.internal.o.d(g4Var);
        wd4.l1.a(l1Var, c17, this.f444938e, g4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$2$1");
    }
}
