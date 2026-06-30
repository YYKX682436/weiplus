package com.tencent.mm.plugin.magicbrush.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$SampleRate", "", "Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$SampleRate;", "", "value", "F", "getValue", "()F", "<init>", "(Ljava/lang/String;IF)V", "OneTenth", "OnePercent", "OneThousandth", "OneTenThousandth", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class IMagicBrushMonitor$SampleRate {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate[] $VALUES;
    private final float value;
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate OneTenth = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate("OneTenth", 0, 0.1f);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate OnePercent = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate("OnePercent", 1, 0.01f);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate OneThousandth = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate("OneThousandth", 2, 0.001f);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate OneTenThousandth = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate("OneTenThousandth", 3, 1.0E-4f);

    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate[] $values() {
        return new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate[]{OneTenth, OnePercent, OneThousandth, OneTenThousandth};
    }

    static {
        com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private IMagicBrushMonitor$SampleRate(java.lang.String str, int i17, float f17) {
        this.value = f17;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate) java.lang.Enum.valueOf(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.class, str);
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate[] values() {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate[]) $VALUES.clone();
    }

    public final float getValue() {
        return this.value;
    }
}
