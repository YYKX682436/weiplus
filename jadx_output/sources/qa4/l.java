package qa4;

/* loaded from: classes.dex */
public final class l implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f361099d;

    public l(java.util.LinkedList linkedList) {
        this.f361099d = linkedList;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$1");
        for (jz5.l lVar : this.f361099d) {
            g4Var.f(((java.lang.Number) lVar.f302833d).intValue(), (java.lang.CharSequence) lVar.f302834e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$1");
    }
}
