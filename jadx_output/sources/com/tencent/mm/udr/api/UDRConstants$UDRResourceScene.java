package com.tencent.mm.udr.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/tencent/mm/udr/api/UDRConstants$UDRResourceScene", "", "Lcom/tencent/mm/udr/api/UDRConstants$UDRResourceScene;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "ea5/j", "Check", "BatchCheck", "PeriodCheck", "Download", "Clean", "Update", "SpecifiedCheck", "BugFixCDN", "UserClean", "UnKnown", "udr-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class UDRConstants$UDRResourceScene {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.udr.api.UDRConstants$UDRResourceScene[] $VALUES;
    public static final ea5.j Companion;
    private static final java.util.Map<java.lang.Integer, com.tencent.mm.udr.api.UDRConstants$UDRResourceScene> map;
    private final int value;
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene Check = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("Check", 0, 1);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene BatchCheck = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("BatchCheck", 1, 2);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene PeriodCheck = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("PeriodCheck", 2, 3);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene Download = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("Download", 3, 4);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene Clean = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("Clean", 4, 5);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene Update = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("Update", 5, 6);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene SpecifiedCheck = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("SpecifiedCheck", 6, 7);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene BugFixCDN = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("BugFixCDN", 7, 8);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene UserClean = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("UserClean", 8, 9);
    public static final com.tencent.mm.udr.api.UDRConstants$UDRResourceScene UnKnown = new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene("UnKnown", 9, 99);

    private static final /* synthetic */ com.tencent.mm.udr.api.UDRConstants$UDRResourceScene[] $values() {
        return new com.tencent.mm.udr.api.UDRConstants$UDRResourceScene[]{Check, BatchCheck, PeriodCheck, Download, Clean, Update, SpecifiedCheck, BugFixCDN, UserClean, UnKnown};
    }

    static {
        com.tencent.mm.udr.api.UDRConstants$UDRResourceScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        Companion = new ea5.j(null);
        rz5.a entries = getEntries();
        int d17 = kz5.b1.d(kz5.d0.q(entries, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : entries) {
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.udr.api.UDRConstants$UDRResourceScene) obj).value), obj);
        }
        map = linkedHashMap;
    }

    private UDRConstants$UDRResourceScene(java.lang.String str, int i17, int i18) {
        this.value = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.udr.api.UDRConstants$UDRResourceScene valueOf(java.lang.String str) {
        return (com.tencent.mm.udr.api.UDRConstants$UDRResourceScene) java.lang.Enum.valueOf(com.tencent.mm.udr.api.UDRConstants$UDRResourceScene.class, str);
    }

    public static com.tencent.mm.udr.api.UDRConstants$UDRResourceScene[] values() {
        return (com.tencent.mm.udr.api.UDRConstants$UDRResourceScene[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
