package ee4;

/* loaded from: classes4.dex */
public final class c implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.e f251691d;

    public c(ee4.e eVar) {
        this.f251691d = eVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 menu) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc$showAddPicDialog$1");
        kotlin.jvm.internal.o.g(menu, "menu");
        boolean z17 = x51.o1.f452042a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
        ee4.e eVar = this.f251691d;
        com.tencent.mm.ui.MMActivity c17 = eVar.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
        menu.f(0, c17.getString(com.tencent.mm.R.string.f490407u4));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
        com.tencent.mm.ui.MMActivity c18 = eVar.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
        menu.f(1, c18.getString(com.tencent.mm.R.string.f490415uc));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc$showAddPicDialog$1");
    }
}
