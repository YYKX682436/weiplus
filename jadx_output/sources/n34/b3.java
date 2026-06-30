package n34;

/* loaded from: classes4.dex */
public interface b3 {
    void a(boolean z17);

    void reset();

    void startPlay();

    default void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.SeekBarHelperCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.SeekBarHelperCallback");
    }
}
