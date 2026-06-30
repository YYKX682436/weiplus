package wd4;

/* loaded from: classes12.dex */
public final class i1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f444930e;

    public i1(wd4.l1 l1Var, int[] iArr) {
        this.f444929d = l1Var;
        this.f444930e = iArr;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$1$1");
        wd4.l1 l1Var = this.f444929d;
        android.app.Activity c17 = l1Var.c();
        kotlin.jvm.internal.o.d(g4Var);
        wd4.l1.a(l1Var, c17, this.f444930e, g4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$1$1");
    }
}
