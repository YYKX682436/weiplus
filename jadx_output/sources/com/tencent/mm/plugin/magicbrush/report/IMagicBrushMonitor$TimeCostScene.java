package com.tencent.mm.plugin.magicbrush.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$TimeCostScene", "", "Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$TimeCostScene;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "SETUP", "START", "DESTROY", "MAIN", "PLUGIN", "BIND_SERVICE", "LOAD_SO", "PRELOAD_SERVICE", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class IMagicBrushMonitor$TimeCostScene {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene[] $VALUES;
    private final int value;
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene SETUP = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene("SETUP", 0, 1);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene START = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene("START", 1, 2);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene DESTROY = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene("DESTROY", 2, 3);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene MAIN = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene("MAIN", 3, 4);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene PLUGIN = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene("PLUGIN", 4, 5);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene BIND_SERVICE = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene("BIND_SERVICE", 5, 8192);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene LOAD_SO = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene("LOAD_SO", 6, 8193);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene PRELOAD_SERVICE = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene("PRELOAD_SERVICE", 7, 8194);

    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene[] $values() {
        return new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene[]{SETUP, START, DESTROY, MAIN, PLUGIN, BIND_SERVICE, LOAD_SO, PRELOAD_SERVICE};
    }

    static {
        com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private IMagicBrushMonitor$TimeCostScene(java.lang.String str, int i17, int i18) {
        this.value = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene) java.lang.Enum.valueOf(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene.class, str);
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene[] values() {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
