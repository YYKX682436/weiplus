package e74;

/* loaded from: classes4.dex */
public class a implements e74.j {
    public a(e74.i iVar) {
    }

    @Override // e74.j
    public void a(int i17, java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$1");
        if (i17 == 0) {
            try {
                com.tencent.mm.plugin.sns.ad.widget.living.i0.d(str, list);
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$1");
    }
}
