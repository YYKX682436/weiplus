package n34;

/* loaded from: classes4.dex */
public final class n3 {
    public n3(kotlin.jvm.internal.i iVar) {
    }

    public final int a(android.content.Context context, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
            return 0;
        }
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479688cn);
        int h18 = z17 ? i65.a.h(context, com.tencent.mm.R.dimen.f479714d7) : 0;
        int h19 = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
        int b17 = i65.a.b(context, 14) + i65.a.h(context, com.tencent.mm.R.dimen.f479646bl) + i65.a.h(context, com.tencent.mm.R.dimen.f479688cn) + i65.a.h(context, com.tencent.mm.R.dimen.f479704cz);
        if (z17 && z18) {
            int i17 = h17 + h18 + h19 + b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
            return i17;
        }
        if (z17 || !z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
            return b17;
        }
        int i18 = h17 + b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
        return i18;
    }
}
