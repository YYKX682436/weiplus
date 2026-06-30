package yt3;

/* loaded from: classes10.dex */
public interface r2 {
    default java.lang.String name() {
        return getClass().getName();
    }

    default void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    default void onAttach() {
    }

    default boolean onBackPress() {
        return false;
    }

    default void onDetach() {
    }

    default void onPause() {
    }

    default void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
    }

    default void onResume() {
    }

    default void q() {
    }

    default void release() {
    }

    default void reset() {
    }

    default void setVisibility(int i17) {
    }

    default void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
    }

    default void v() {
    }
}
