package com.tencent.pigeon.biz_base;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/tencent/pigeon/biz_base/MagicBrandServiceCreateScene;", "", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "NONE", "CREATE_BY_RECEIVE_AD_BRAND_SERVICE_MSG_OUT_OF_BOX", "CREATE_BY_RECEIVE_BRAND_SERVICE_MSG_OUT_OF_BOX", "CREATE_BY_HAS_AD_BRAND_SERVICE_MSG_FIRST_PAGE", "CREATE_BY_HAS_AD_BRAND_SERVICE_MSG_NEXT_PAGE", "CREATE_BY_HAS_BRAND_SERVICE_MSG_FIRST_PAGE", "CREATE_BY_HAS_BRAND_SERVICE_MSG_NEXT_PAGE", "CREATE_BY_BRAND_SERVICE_BOX_CLICK", "CREATE_BY_BRAND_SERVICE_PRE_LAYOUT", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MagicBrandServiceCreateScene {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene.Companion INSTANCE;
    private final int raw;
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene NONE = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("NONE", 0, 0);
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene CREATE_BY_RECEIVE_AD_BRAND_SERVICE_MSG_OUT_OF_BOX = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("CREATE_BY_RECEIVE_AD_BRAND_SERVICE_MSG_OUT_OF_BOX", 1, 1);
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene CREATE_BY_RECEIVE_BRAND_SERVICE_MSG_OUT_OF_BOX = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("CREATE_BY_RECEIVE_BRAND_SERVICE_MSG_OUT_OF_BOX", 2, 2);
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene CREATE_BY_HAS_AD_BRAND_SERVICE_MSG_FIRST_PAGE = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("CREATE_BY_HAS_AD_BRAND_SERVICE_MSG_FIRST_PAGE", 3, 3);
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene CREATE_BY_HAS_AD_BRAND_SERVICE_MSG_NEXT_PAGE = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("CREATE_BY_HAS_AD_BRAND_SERVICE_MSG_NEXT_PAGE", 4, 4);
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene CREATE_BY_HAS_BRAND_SERVICE_MSG_FIRST_PAGE = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("CREATE_BY_HAS_BRAND_SERVICE_MSG_FIRST_PAGE", 5, 5);
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene CREATE_BY_HAS_BRAND_SERVICE_MSG_NEXT_PAGE = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("CREATE_BY_HAS_BRAND_SERVICE_MSG_NEXT_PAGE", 6, 6);
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene CREATE_BY_BRAND_SERVICE_BOX_CLICK = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("CREATE_BY_BRAND_SERVICE_BOX_CLICK", 7, 7);
    public static final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene CREATE_BY_BRAND_SERVICE_PRE_LAYOUT = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene("CREATE_BY_BRAND_SERVICE_PRE_LAYOUT", 8, 8);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/MagicBrandServiceCreateScene$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/biz_base/MagicBrandServiceCreateScene;", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene ofRaw(int raw) {
            for (com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene magicBrandServiceCreateScene : com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene.values()) {
                if (magicBrandServiceCreateScene.getRaw() == raw) {
                    return magicBrandServiceCreateScene;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene[] $values() {
        return new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene[]{NONE, CREATE_BY_RECEIVE_AD_BRAND_SERVICE_MSG_OUT_OF_BOX, CREATE_BY_RECEIVE_BRAND_SERVICE_MSG_OUT_OF_BOX, CREATE_BY_HAS_AD_BRAND_SERVICE_MSG_FIRST_PAGE, CREATE_BY_HAS_AD_BRAND_SERVICE_MSG_NEXT_PAGE, CREATE_BY_HAS_BRAND_SERVICE_MSG_FIRST_PAGE, CREATE_BY_HAS_BRAND_SERVICE_MSG_NEXT_PAGE, CREATE_BY_BRAND_SERVICE_BOX_CLICK, CREATE_BY_BRAND_SERVICE_PRE_LAYOUT};
    }

    static {
        com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene.Companion(null);
    }

    private MagicBrandServiceCreateScene(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene valueOf(java.lang.String str) {
        return (com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene) java.lang.Enum.valueOf(com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene.class, str);
    }

    public static com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene[] values() {
        return (com.tencent.pigeon.biz_base.MagicBrandServiceCreateScene[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
