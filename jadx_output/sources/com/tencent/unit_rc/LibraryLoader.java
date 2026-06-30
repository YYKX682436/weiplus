package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/tencent/unit_rc/LibraryLoader;", "", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Ljz5/f0;", "loadLibrary", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public interface LibraryLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.unit_rc.LibraryLoader.Companion INSTANCE = com.tencent.unit_rc.LibraryLoader.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/tencent/unit_rc/LibraryLoader$Companion;", "", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Ljz5/f0;", "load", "Lcom/tencent/unit_rc/DefaultLibraryLoader;", "defaultLoader$delegate", "Ljz5/g;", "getDefaultLoader", "()Lcom/tencent/unit_rc/DefaultLibraryLoader;", "defaultLoader", "Lcom/tencent/unit_rc/LibraryLoader;", com.tencent.shadow.core.common.HostConstants.LOADER_APPID, "Lcom/tencent/unit_rc/LibraryLoader;", "getLoader", "()Lcom/tencent/unit_rc/LibraryLoader;", "setLoader", "(Lcom/tencent/unit_rc/LibraryLoader;)V", "getLoader$annotations", "()V", "<init>", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.unit_rc.LibraryLoader.Companion $$INSTANCE = new com.tencent.unit_rc.LibraryLoader.Companion();

        /* renamed from: defaultLoader$delegate, reason: from kotlin metadata */
        private static final jz5.g defaultLoader = jz5.h.b(com.tencent.unit_rc.LibraryLoader$Companion$defaultLoader$2.INSTANCE);
        private static com.tencent.unit_rc.LibraryLoader loader;

        private Companion() {
        }

        private final com.tencent.unit_rc.DefaultLibraryLoader getDefaultLoader() {
            return (com.tencent.unit_rc.DefaultLibraryLoader) defaultLoader.getValue();
        }

        public static /* synthetic */ void getLoader$annotations() {
        }

        public final com.tencent.unit_rc.LibraryLoader getLoader() {
            return loader;
        }

        public final void load(java.lang.String name) {
            kotlin.jvm.internal.o.g(name, "name");
            com.tencent.unit_rc.LibraryLoader libraryLoader = loader;
            if (libraryLoader == null) {
                libraryLoader = getDefaultLoader();
            }
            libraryLoader.loadLibrary(name);
        }

        public final void setLoader(com.tencent.unit_rc.LibraryLoader libraryLoader) {
            loader = libraryLoader;
        }
    }

    static com.tencent.unit_rc.LibraryLoader getLoader() {
        return INSTANCE.getLoader();
    }

    static void load(java.lang.String str) {
        INSTANCE.load(str);
    }

    static void setLoader(com.tencent.unit_rc.LibraryLoader libraryLoader) {
        INSTANCE.setLoader(libraryLoader);
    }

    void loadLibrary(java.lang.String str);
}
