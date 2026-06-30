package com.tencent.pigeon.mega_video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaVideoShareScene;", "", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "UNKNOWN", "FRIEND", "MOMENT", "FAV", "TEXT_STATE", "MOMENT_COVER", "RING", "SCREEN_CAST", "LISTEN_LATER", "COMPLAINT", "BACKGROUND_SOUND", "PROMOTE", "INTERNAL_FEEDBACK", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MegaVideoShareScene {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoShareScene[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene.Companion INSTANCE;
    private final int raw;
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene UNKNOWN = new com.tencent.pigeon.mega_video.MegaVideoShareScene("UNKNOWN", 0, 0);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene FRIEND = new com.tencent.pigeon.mega_video.MegaVideoShareScene("FRIEND", 1, 1);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene MOMENT = new com.tencent.pigeon.mega_video.MegaVideoShareScene("MOMENT", 2, 2);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene FAV = new com.tencent.pigeon.mega_video.MegaVideoShareScene("FAV", 3, 3);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene TEXT_STATE = new com.tencent.pigeon.mega_video.MegaVideoShareScene("TEXT_STATE", 4, 4);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene MOMENT_COVER = new com.tencent.pigeon.mega_video.MegaVideoShareScene("MOMENT_COVER", 5, 5);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene RING = new com.tencent.pigeon.mega_video.MegaVideoShareScene("RING", 6, 6);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene SCREEN_CAST = new com.tencent.pigeon.mega_video.MegaVideoShareScene("SCREEN_CAST", 7, 7);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene LISTEN_LATER = new com.tencent.pigeon.mega_video.MegaVideoShareScene("LISTEN_LATER", 8, 8);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene COMPLAINT = new com.tencent.pigeon.mega_video.MegaVideoShareScene("COMPLAINT", 9, 9);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene BACKGROUND_SOUND = new com.tencent.pigeon.mega_video.MegaVideoShareScene("BACKGROUND_SOUND", 10, 10);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene PROMOTE = new com.tencent.pigeon.mega_video.MegaVideoShareScene("PROMOTE", 11, 11);
    public static final com.tencent.pigeon.mega_video.MegaVideoShareScene INTERNAL_FEEDBACK = new com.tencent.pigeon.mega_video.MegaVideoShareScene("INTERNAL_FEEDBACK", 12, 12);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaVideoShareScene$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/mega_video/MegaVideoShareScene;", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mega_video.MegaVideoShareScene ofRaw(int raw) {
            for (com.tencent.pigeon.mega_video.MegaVideoShareScene megaVideoShareScene : com.tencent.pigeon.mega_video.MegaVideoShareScene.values()) {
                if (megaVideoShareScene.getRaw() == raw) {
                    return megaVideoShareScene;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoShareScene[] $values() {
        return new com.tencent.pigeon.mega_video.MegaVideoShareScene[]{UNKNOWN, FRIEND, MOMENT, FAV, TEXT_STATE, MOMENT_COVER, RING, SCREEN_CAST, LISTEN_LATER, COMPLAINT, BACKGROUND_SOUND, PROMOTE, INTERNAL_FEEDBACK};
    }

    static {
        com.tencent.pigeon.mega_video.MegaVideoShareScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.pigeon.mega_video.MegaVideoShareScene.Companion(null);
    }

    private MegaVideoShareScene(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.pigeon.mega_video.MegaVideoShareScene valueOf(java.lang.String str) {
        return (com.tencent.pigeon.mega_video.MegaVideoShareScene) java.lang.Enum.valueOf(com.tencent.pigeon.mega_video.MegaVideoShareScene.class, str);
    }

    public static com.tencent.pigeon.mega_video.MegaVideoShareScene[] values() {
        return (com.tencent.pigeon.mega_video.MegaVideoShareScene[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
