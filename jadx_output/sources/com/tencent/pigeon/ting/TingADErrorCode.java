package com.tencent.pigeon.ting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/tencent/pigeon/ting/TingADErrorCode;", "", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "NONE", "OPEN_FAIL", "FULL_WATCHED", "ABORT", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TingADErrorCode {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.pigeon.ting.TingADErrorCode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingADErrorCode.Companion INSTANCE;
    private final int raw;
    public static final com.tencent.pigeon.ting.TingADErrorCode NONE = new com.tencent.pigeon.ting.TingADErrorCode("NONE", 0, 0);
    public static final com.tencent.pigeon.ting.TingADErrorCode OPEN_FAIL = new com.tencent.pigeon.ting.TingADErrorCode("OPEN_FAIL", 1, 1);
    public static final com.tencent.pigeon.ting.TingADErrorCode FULL_WATCHED = new com.tencent.pigeon.ting.TingADErrorCode("FULL_WATCHED", 2, 2);
    public static final com.tencent.pigeon.ting.TingADErrorCode ABORT = new com.tencent.pigeon.ting.TingADErrorCode("ABORT", 3, 3);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingADErrorCode$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/ting/TingADErrorCode;", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingADErrorCode ofRaw(int raw) {
            for (com.tencent.pigeon.ting.TingADErrorCode tingADErrorCode : com.tencent.pigeon.ting.TingADErrorCode.values()) {
                if (tingADErrorCode.getRaw() == raw) {
                    return tingADErrorCode;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ com.tencent.pigeon.ting.TingADErrorCode[] $values() {
        return new com.tencent.pigeon.ting.TingADErrorCode[]{NONE, OPEN_FAIL, FULL_WATCHED, ABORT};
    }

    static {
        com.tencent.pigeon.ting.TingADErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.pigeon.ting.TingADErrorCode.Companion(null);
    }

    private TingADErrorCode(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.pigeon.ting.TingADErrorCode valueOf(java.lang.String str) {
        return (com.tencent.pigeon.ting.TingADErrorCode) java.lang.Enum.valueOf(com.tencent.pigeon.ting.TingADErrorCode.class, str);
    }

    public static com.tencent.pigeon.ting.TingADErrorCode[] values() {
        return (com.tencent.pigeon.ting.TingADErrorCode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
