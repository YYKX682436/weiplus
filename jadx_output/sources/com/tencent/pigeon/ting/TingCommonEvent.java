package com.tencent.pigeon.ting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/ting/TingCommonEvent;", "", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "UNKNOWN", "CATEGORY_LIKE_STATUS_CHANGE", "CATEGORY_INFO_EDITED", "CATEGORY_PUBLIC_STATUS_CHANGE", "CATEGORY_DELETED", "CATEGORY_RELOAD", "LISTEN_ITEM_ADD_TO_LATER", "LISTEN_ITEM_STAR", "OPEN_FULL_SCREEN_PLAYER", "OPEN_PLAYING_TAPE_DETAIL", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TingCommonEvent {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.pigeon.ting.TingCommonEvent[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingCommonEvent.Companion INSTANCE;
    private final int raw;
    public static final com.tencent.pigeon.ting.TingCommonEvent UNKNOWN = new com.tencent.pigeon.ting.TingCommonEvent("UNKNOWN", 0, 0);
    public static final com.tencent.pigeon.ting.TingCommonEvent CATEGORY_LIKE_STATUS_CHANGE = new com.tencent.pigeon.ting.TingCommonEvent("CATEGORY_LIKE_STATUS_CHANGE", 1, 1);
    public static final com.tencent.pigeon.ting.TingCommonEvent CATEGORY_INFO_EDITED = new com.tencent.pigeon.ting.TingCommonEvent("CATEGORY_INFO_EDITED", 2, 2);
    public static final com.tencent.pigeon.ting.TingCommonEvent CATEGORY_PUBLIC_STATUS_CHANGE = new com.tencent.pigeon.ting.TingCommonEvent("CATEGORY_PUBLIC_STATUS_CHANGE", 3, 3);
    public static final com.tencent.pigeon.ting.TingCommonEvent CATEGORY_DELETED = new com.tencent.pigeon.ting.TingCommonEvent("CATEGORY_DELETED", 4, 4);
    public static final com.tencent.pigeon.ting.TingCommonEvent CATEGORY_RELOAD = new com.tencent.pigeon.ting.TingCommonEvent("CATEGORY_RELOAD", 5, 5);
    public static final com.tencent.pigeon.ting.TingCommonEvent LISTEN_ITEM_ADD_TO_LATER = new com.tencent.pigeon.ting.TingCommonEvent("LISTEN_ITEM_ADD_TO_LATER", 6, 6);
    public static final com.tencent.pigeon.ting.TingCommonEvent LISTEN_ITEM_STAR = new com.tencent.pigeon.ting.TingCommonEvent("LISTEN_ITEM_STAR", 7, 7);
    public static final com.tencent.pigeon.ting.TingCommonEvent OPEN_FULL_SCREEN_PLAYER = new com.tencent.pigeon.ting.TingCommonEvent("OPEN_FULL_SCREEN_PLAYER", 8, 8);
    public static final com.tencent.pigeon.ting.TingCommonEvent OPEN_PLAYING_TAPE_DETAIL = new com.tencent.pigeon.ting.TingCommonEvent("OPEN_PLAYING_TAPE_DETAIL", 9, 9);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingCommonEvent$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/ting/TingCommonEvent;", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingCommonEvent ofRaw(int raw) {
            for (com.tencent.pigeon.ting.TingCommonEvent tingCommonEvent : com.tencent.pigeon.ting.TingCommonEvent.values()) {
                if (tingCommonEvent.getRaw() == raw) {
                    return tingCommonEvent;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ com.tencent.pigeon.ting.TingCommonEvent[] $values() {
        return new com.tencent.pigeon.ting.TingCommonEvent[]{UNKNOWN, CATEGORY_LIKE_STATUS_CHANGE, CATEGORY_INFO_EDITED, CATEGORY_PUBLIC_STATUS_CHANGE, CATEGORY_DELETED, CATEGORY_RELOAD, LISTEN_ITEM_ADD_TO_LATER, LISTEN_ITEM_STAR, OPEN_FULL_SCREEN_PLAYER, OPEN_PLAYING_TAPE_DETAIL};
    }

    static {
        com.tencent.pigeon.ting.TingCommonEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.pigeon.ting.TingCommonEvent.Companion(null);
    }

    private TingCommonEvent(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.pigeon.ting.TingCommonEvent valueOf(java.lang.String str) {
        return (com.tencent.pigeon.ting.TingCommonEvent) java.lang.Enum.valueOf(com.tencent.pigeon.ting.TingCommonEvent.class, str);
    }

    public static com.tencent.pigeon.ting.TingCommonEvent[] values() {
        return (com.tencent.pigeon.ting.TingCommonEvent[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
