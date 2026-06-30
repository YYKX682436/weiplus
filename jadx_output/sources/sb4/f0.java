package sb4;

/* loaded from: classes4.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f405497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb4.g0 f405498e;

    public f0(sb4.g0 g0Var, java.util.List list) {
        this.f405498e = g0Var;
        this.f405497d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1$1");
        sb4.g0 g0Var = this.f405498e;
        com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI = g0Var.f405500d;
        snsWsFoldDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showList", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        snsWsFoldDetailUI.f167625e.setVisibility(8);
        snsWsFoldDetailUI.f167624d.setVisibility(0);
        android.widget.ListView listView = snsWsFoldDetailUI.f167624d;
        com.tencent.mm.plugin.sns.ui.uv uvVar = snsWsFoldDetailUI.B;
        uvVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        kotlin.jvm.internal.o.g(listView, "listView");
        listView.postDelayed(new com.tencent.mm.plugin.sns.ui.tv(uvVar, listView), 15L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showList", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        sb4.h0 h0Var = g0Var.f405501e;
        h0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        java.util.ArrayList arrayList = (java.util.ArrayList) h0Var.f405514e;
        arrayList.clear();
        arrayList.addAll(this.f405497d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        h0Var.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1$1");
    }
}
