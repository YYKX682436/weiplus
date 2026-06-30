package ya4;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f460608a = new java.util.HashMap();

    public static void a(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        if (c01.e2.a0()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        } else {
            f460608a.put(java.lang.Integer.valueOf(i17), new ya4.a(i18, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        }
    }
}
