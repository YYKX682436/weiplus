package com.tencent.mm.plugin.magicbrush.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$PerformanceScene", "", "Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$PerformanceScene;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Start", "Ready", "FirstFrameFromStart", "FirstFrameFromReady", "PreloadDone", "FlutterFirstFrameFromCreate", "FrameSetCache", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class IMagicBrushMonitor$PerformanceScene {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene[] $VALUES;
    private final int value;
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene Start = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene("Start", 0, 1);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene Ready = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene("Ready", 1, 2);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene FirstFrameFromStart = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene("FirstFrameFromStart", 2, 3);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene FirstFrameFromReady = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene("FirstFrameFromReady", 3, 4);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene PreloadDone = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene("PreloadDone", 4, 5);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene FlutterFirstFrameFromCreate = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene("FlutterFirstFrameFromCreate", 5, 6);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene FrameSetCache = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene("FrameSetCache", 6, 7);

    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene[] $values() {
        return new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene[]{Start, Ready, FirstFrameFromStart, FirstFrameFromReady, PreloadDone, FlutterFirstFrameFromCreate, FrameSetCache};
    }

    static {
        com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private IMagicBrushMonitor$PerformanceScene(java.lang.String str, int i17, int i18) {
        this.value = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene) java.lang.Enum.valueOf(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.class, str);
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene[] values() {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
