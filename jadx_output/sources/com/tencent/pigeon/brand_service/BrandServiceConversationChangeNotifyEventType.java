package com.tencent.pigeon.brand_service;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/tencent/pigeon/brand_service/BrandServiceConversationChangeNotifyEventType;", "", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "EVENT_TYPE_UNKNOWN", "EVENT_TYPE_CREATE", "EVENT_TYPE_INERT", "EVENT_TYPE_UPDATE", "EVENT_TYPE_REPLACE", "EVENT_TYPE_DELETE", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandServiceConversationChangeNotifyEventType {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType.Companion INSTANCE;
    private final int raw;
    public static final com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType EVENT_TYPE_UNKNOWN = new com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType("EVENT_TYPE_UNKNOWN", 0, 0);
    public static final com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType EVENT_TYPE_CREATE = new com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType("EVENT_TYPE_CREATE", 1, 1);
    public static final com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType EVENT_TYPE_INERT = new com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType("EVENT_TYPE_INERT", 2, 2);
    public static final com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType EVENT_TYPE_UPDATE = new com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType("EVENT_TYPE_UPDATE", 3, 3);
    public static final com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType EVENT_TYPE_REPLACE = new com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType("EVENT_TYPE_REPLACE", 4, 4);
    public static final com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType EVENT_TYPE_DELETE = new com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType("EVENT_TYPE_DELETE", 5, 5);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/brand_service/BrandServiceConversationChangeNotifyEventType$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/brand_service/BrandServiceConversationChangeNotifyEventType;", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType ofRaw(int raw) {
            for (com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType brandServiceConversationChangeNotifyEventType : com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType.values()) {
                if (brandServiceConversationChangeNotifyEventType.getRaw() == raw) {
                    return brandServiceConversationChangeNotifyEventType;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType[] $values() {
        return new com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType[]{EVENT_TYPE_UNKNOWN, EVENT_TYPE_CREATE, EVENT_TYPE_INERT, EVENT_TYPE_UPDATE, EVENT_TYPE_REPLACE, EVENT_TYPE_DELETE};
    }

    static {
        com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType.Companion(null);
    }

    private BrandServiceConversationChangeNotifyEventType(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType valueOf(java.lang.String str) {
        return (com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType) java.lang.Enum.valueOf(com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType.class, str);
    }

    public static com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType[] values() {
        return (com.tencent.pigeon.brand_service.BrandServiceConversationChangeNotifyEventType[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
