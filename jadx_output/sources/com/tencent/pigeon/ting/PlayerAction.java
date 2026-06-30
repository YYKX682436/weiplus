package com.tencent.pigeon.ting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/ting/PlayerAction;", "", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "PRE", "NEXT", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlayerAction {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.pigeon.ting.PlayerAction[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.PlayerAction.Companion INSTANCE;
    private final int raw;
    public static final com.tencent.pigeon.ting.PlayerAction PRE = new com.tencent.pigeon.ting.PlayerAction("PRE", 0, 0);
    public static final com.tencent.pigeon.ting.PlayerAction NEXT = new com.tencent.pigeon.ting.PlayerAction("NEXT", 1, 1);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/PlayerAction$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/ting/PlayerAction;", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.PlayerAction ofRaw(int raw) {
            for (com.tencent.pigeon.ting.PlayerAction playerAction : com.tencent.pigeon.ting.PlayerAction.values()) {
                if (playerAction.getRaw() == raw) {
                    return playerAction;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ com.tencent.pigeon.ting.PlayerAction[] $values() {
        return new com.tencent.pigeon.ting.PlayerAction[]{PRE, NEXT};
    }

    static {
        com.tencent.pigeon.ting.PlayerAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.pigeon.ting.PlayerAction.Companion(null);
    }

    private PlayerAction(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.pigeon.ting.PlayerAction valueOf(java.lang.String str) {
        return (com.tencent.pigeon.ting.PlayerAction) java.lang.Enum.valueOf(com.tencent.pigeon.ting.PlayerAction.class, str);
    }

    public static com.tencent.pigeon.ting.PlayerAction[] values() {
        return (com.tencent.pigeon.ting.PlayerAction[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
