package xd4;

/* loaded from: classes4.dex */
public enum d0 {
    AVAILABLE,
    ATTACHING,
    PLAYING;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$State");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$State");
    }

    public static xd4.d0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$State");
        xd4.d0 d0Var = (xd4.d0) java.lang.Enum.valueOf(xd4.d0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$State");
        return d0Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static xd4.d0[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$State");
        xd4.d0[] d0VarArr = (xd4.d0[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$State");
        return d0VarArr;
    }
}
