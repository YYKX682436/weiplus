package io.flutter.embedding.android;

/* loaded from: classes11.dex */
public class FlutterActivityLaunchConfigs {
    static final java.lang.String DART_ENTRYPOINT_META_DATA_KEY = "io.flutter.Entrypoint";
    static final java.lang.String DART_ENTRYPOINT_URI_META_DATA_KEY = "io.flutter.EntrypointUri";
    static final java.lang.String DEFAULT_BACKGROUND_MODE = io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
    static final java.lang.String DEFAULT_DART_ENTRYPOINT = "main";
    static final java.lang.String DEFAULT_INITIAL_ROUTE = "/";
    static final java.lang.String EXTRA_BACKGROUND_MODE = "background_mode";
    static final java.lang.String EXTRA_CACHED_ENGINE_GROUP_ID = "cached_engine_group_id";
    static final java.lang.String EXTRA_CACHED_ENGINE_ID = "cached_engine_id";
    static final java.lang.String EXTRA_DART_ENTRYPOINT = "dart_entrypoint";
    static final java.lang.String EXTRA_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
    static final java.lang.String EXTRA_DESTROY_ENGINE_WITH_ACTIVITY = "destroy_engine_with_activity";
    static final java.lang.String EXTRA_ENABLE_STATE_RESTORATION = "enable_state_restoration";
    static final java.lang.String EXTRA_ENABLE_SWITCH_SURFACE = "enable_switch_surface";
    static final java.lang.String EXTRA_INITIAL_ROUTE = "route";
    static final java.lang.String HANDLE_DEEPLINKING_META_DATA_KEY = "flutter_deeplinking_enabled";
    static final java.lang.String INITIAL_ROUTE_META_DATA_KEY = "io.flutter.InitialRoute";
    static final java.lang.String NORMAL_THEME_META_DATA_KEY = "io.flutter.embedding.android.NormalTheme";

    /* loaded from: classes11.dex */
    public enum BackgroundMode {
        opaque,
        transparent
    }

    private FlutterActivityLaunchConfigs() {
    }

    public static boolean deepLinkEnabled(android.os.Bundle bundle) {
        if (bundle == null || !bundle.containsKey(HANDLE_DEEPLINKING_META_DATA_KEY)) {
            return true;
        }
        return bundle.getBoolean(HANDLE_DEEPLINKING_META_DATA_KEY);
    }
}
