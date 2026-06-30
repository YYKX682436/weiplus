package com.tencent.mm.plugin.magicbrush.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/tencent/mm/plugin/magicbrush/report/IMagicBrushClickEnumExt$RoleType", "", "Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushClickEnumExt$RoleType;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "PlatformNative", "ADClient", "BasicLibrary", "ADFrontEnd", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class IMagicBrushClickEnumExt$RoleType {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType[] $VALUES;
    private final int value;
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType PlatformNative = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType("PlatformNative", 0, 0);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType ADClient = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType("ADClient", 1, 1);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType BasicLibrary = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType("BasicLibrary", 2, 2);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType ADFrontEnd = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType("ADFrontEnd", 3, 3);

    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType[] $values() {
        return new com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType[]{PlatformNative, ADClient, BasicLibrary, ADFrontEnd};
    }

    static {
        com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private IMagicBrushClickEnumExt$RoleType(java.lang.String str, int i17, int i18) {
        this.value = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType) java.lang.Enum.valueOf(com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType.class, str);
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType[] values() {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
