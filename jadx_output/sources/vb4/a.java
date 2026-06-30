package vb4;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f434793a = new java.util.LinkedHashMap();

    public static final boolean a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
        java.util.Map map = f434793a;
        if (str == null) {
            str = "";
        }
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.LinkedHashMap) map).get(str);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
        return booleanValue;
    }

    public static final void b(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
            return;
        }
        f434793a.put(str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
    }
}
