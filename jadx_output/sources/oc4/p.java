package oc4;

/* loaded from: classes4.dex */
public final class p implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC f344355d;

    public p(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC) {
        this.f344355d = improveUnreadUIC;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$setDebugPrintInfo$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadUIC$setDebugPrintInfo$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String str = c50.l0.f38610a;
        java.util.Set stringSet = com.tencent.mm.sdk.platformtools.o4.L().getStringSet(str, new java.util.HashSet());
        if (stringSet != null) {
            stringSet.clear();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMmkv$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC = this.f344355d;
        com.tencent.mm.sdk.platformtools.o4 o4Var = improveUnreadUIC.f169012e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMmkv$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        o4Var.putStringSet(str, stringSet);
        com.tencent.mm.sdk.platformtools.o4.L().G("SnsSpring2025_ShowPostRedDot", false);
        com.tencent.mm.sdk.platformtools.o4.L().remove(c50.l0.f38611b);
        db5.t7.h(improveUnreadUIC.getContext(), "初始化完毕");
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadUIC$setDebugPrintInfo$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$setDebugPrintInfo$1");
        return true;
    }
}
