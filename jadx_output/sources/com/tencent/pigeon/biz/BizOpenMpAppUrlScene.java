package com.tencent.pigeon.biz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/biz/BizOpenMpAppUrlScene;", "", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "MANAGE_UN_SELECTED_COMMENT", "OPEN_USER_PROFILE", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BizOpenMpAppUrlScene {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.pigeon.biz.BizOpenMpAppUrlScene[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizOpenMpAppUrlScene.Companion INSTANCE;
    public static final com.tencent.pigeon.biz.BizOpenMpAppUrlScene MANAGE_UN_SELECTED_COMMENT = new com.tencent.pigeon.biz.BizOpenMpAppUrlScene("MANAGE_UN_SELECTED_COMMENT", 0, 0);
    public static final com.tencent.pigeon.biz.BizOpenMpAppUrlScene OPEN_USER_PROFILE = new com.tencent.pigeon.biz.BizOpenMpAppUrlScene("OPEN_USER_PROFILE", 1, 1);
    private final int raw;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizOpenMpAppUrlScene$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/biz/BizOpenMpAppUrlScene;", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizOpenMpAppUrlScene ofRaw(int raw) {
            for (com.tencent.pigeon.biz.BizOpenMpAppUrlScene bizOpenMpAppUrlScene : com.tencent.pigeon.biz.BizOpenMpAppUrlScene.values()) {
                if (bizOpenMpAppUrlScene.getRaw() == raw) {
                    return bizOpenMpAppUrlScene;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ com.tencent.pigeon.biz.BizOpenMpAppUrlScene[] $values() {
        return new com.tencent.pigeon.biz.BizOpenMpAppUrlScene[]{MANAGE_UN_SELECTED_COMMENT, OPEN_USER_PROFILE};
    }

    static {
        com.tencent.pigeon.biz.BizOpenMpAppUrlScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.pigeon.biz.BizOpenMpAppUrlScene.Companion(null);
    }

    private BizOpenMpAppUrlScene(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.pigeon.biz.BizOpenMpAppUrlScene valueOf(java.lang.String str) {
        return (com.tencent.pigeon.biz.BizOpenMpAppUrlScene) java.lang.Enum.valueOf(com.tencent.pigeon.biz.BizOpenMpAppUrlScene.class, str);
    }

    public static com.tencent.pigeon.biz.BizOpenMpAppUrlScene[] values() {
        return (com.tencent.pigeon.biz.BizOpenMpAppUrlScene[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
