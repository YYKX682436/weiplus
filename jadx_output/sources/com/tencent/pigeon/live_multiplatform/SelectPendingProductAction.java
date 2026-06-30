package com.tencent.pigeon.live_multiplatform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductAction;", "", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "NONE", "SELECT", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SelectPendingProductAction {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.pigeon.live_multiplatform.SelectPendingProductAction[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_multiplatform.SelectPendingProductAction.Companion INSTANCE;
    public static final com.tencent.pigeon.live_multiplatform.SelectPendingProductAction NONE = new com.tencent.pigeon.live_multiplatform.SelectPendingProductAction("NONE", 0, 0);
    public static final com.tencent.pigeon.live_multiplatform.SelectPendingProductAction SELECT = new com.tencent.pigeon.live_multiplatform.SelectPendingProductAction("SELECT", 1, 1);
    private final int raw;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductAction$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductAction;", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_multiplatform.SelectPendingProductAction ofRaw(int raw) {
            for (com.tencent.pigeon.live_multiplatform.SelectPendingProductAction selectPendingProductAction : com.tencent.pigeon.live_multiplatform.SelectPendingProductAction.values()) {
                if (selectPendingProductAction.getRaw() == raw) {
                    return selectPendingProductAction;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ com.tencent.pigeon.live_multiplatform.SelectPendingProductAction[] $values() {
        return new com.tencent.pigeon.live_multiplatform.SelectPendingProductAction[]{NONE, SELECT};
    }

    static {
        com.tencent.pigeon.live_multiplatform.SelectPendingProductAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.pigeon.live_multiplatform.SelectPendingProductAction.Companion(null);
    }

    private SelectPendingProductAction(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.pigeon.live_multiplatform.SelectPendingProductAction valueOf(java.lang.String str) {
        return (com.tencent.pigeon.live_multiplatform.SelectPendingProductAction) java.lang.Enum.valueOf(com.tencent.pigeon.live_multiplatform.SelectPendingProductAction.class, str);
    }

    public static com.tencent.pigeon.live_multiplatform.SelectPendingProductAction[] values() {
        return (com.tencent.pigeon.live_multiplatform.SelectPendingProductAction[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
