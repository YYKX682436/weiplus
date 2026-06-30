package gc4;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final gc4.k f270459a = new gc4.k();

    public final void a(android.content.Context context, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsVisibilitySettingPage", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
        kotlin.jvm.internal.o.g(context, "context");
        boolean m17 = pc4.d.f353410a.m();
        com.tencent.mm.plugin.sns.storage.SnsInfo i19 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        if (i19 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVisibilityEntranceManager", "enterSnsVisibilitySettingPage >> snsInfo == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsVisibilitySettingPage", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
            return;
        }
        com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(i19);
        boolean h17 = ca4.f1.f39897a.h(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVisibilityEntranceManager", "showSnsGroupDialog >> useFlutterDialog = " + m17 + " mLocalId = " + i17 + " snsId: " + ca4.z0.t0(i19.field_snsId) + " useComplexVisibility = " + h17);
        if ((m17 || h17) && f17.VisibilityType != 0) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new oi0.b(i19, cj0.a.f41853a.l(i19), 4, "", java.lang.Long.valueOf(i19.field_snsId), context, null, null), 3, null);
        } else {
            int i27 = com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "jumpToSnsLabelUI snsLocalId:%d scene:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 <= 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_from_sns_feed_id", i17);
                intent.setClass(context, com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/NewSnsLabelUI", "jumpToSnsLabelUI", "(Landroid/content/Context;II)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/NewSnsLabelUI", "jumpToSnsLabelUI", "(Landroid/content/Context;II)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().D = i18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsVisibilitySettingPage", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
    }

    public final void b(android.content.Context uiContext, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSnsGroupDialog", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
        kotlin.jvm.internal.o.g(uiContext, "uiContext");
        boolean n17 = pc4.d.f353410a.n();
        com.tencent.mm.plugin.sns.storage.SnsInfo i110 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        if (i110 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVisibilityEntranceManager", "showSnsGroupDialog >> snsInfo == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSnsGroupDialog", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
            return;
        }
        com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(i110);
        boolean h17 = ca4.f1.f39897a.h(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVisibilityEntranceManager", "showSnsGroupDialog >> useFlutterDialog = " + n17 + " mLocalId = " + i17 + " snsId: " + ca4.z0.t0(i110.field_snsId) + " useComplexVisibility = " + h17);
        if ((n17 || h17) && f17.VisibilityType != 0) {
            cj0.a aVar = cj0.a.f41853a;
            bw5.nk0 l17 = aVar.l(i110);
            aVar.l("MicroMsg.SnsVisibilityEntranceManager", l17);
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new n.n(i110, l17, i110.field_snsId, 2, uiContext, null, null), 3, null);
        } else {
            com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog = new com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog(uiContext, i17, i18, i19);
            snsGroupDialog.show();
            snsGroupDialog.f281406o = gc4.j.f270458d;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSnsGroupDialog", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
    }
}
