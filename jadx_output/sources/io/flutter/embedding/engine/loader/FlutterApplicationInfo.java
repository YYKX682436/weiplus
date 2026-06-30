package io.flutter.embedding.engine.loader;

/* loaded from: classes13.dex */
public final class FlutterApplicationInfo {
    private static final java.lang.String DEFAULT_AOT_SHARED_LIBRARY_NAME = "libapp.so";
    private static final java.lang.String DEFAULT_FLUTTER_ASSETS_DIR = "flutter_assets";
    private static final java.lang.String DEFAULT_ISOLATE_SNAPSHOT_DATA = "isolate_snapshot_data";
    private static final java.lang.String DEFAULT_VM_SNAPSHOT_DATA = "vm_snapshot_data";
    public final java.lang.String aotSharedLibraryName;
    final boolean automaticallyRegisterPlugins;
    public final java.lang.String domainNetworkPolicy;
    public final java.lang.String flutterAssetsDir;
    public final java.lang.String isolateSnapshotData;
    public final java.lang.String nativeLibraryDir;
    public final java.lang.String vmSnapshotData;

    public FlutterApplicationInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17) {
        this.aotSharedLibraryName = str == null ? DEFAULT_AOT_SHARED_LIBRARY_NAME : str;
        this.vmSnapshotData = str2 == null ? DEFAULT_VM_SNAPSHOT_DATA : str2;
        this.isolateSnapshotData = str3 == null ? DEFAULT_ISOLATE_SNAPSHOT_DATA : str3;
        this.flutterAssetsDir = str4 == null ? DEFAULT_FLUTTER_ASSETS_DIR : str4;
        this.nativeLibraryDir = str6;
        this.domainNetworkPolicy = str5 == null ? "" : str5;
        this.automaticallyRegisterPlugins = z17;
    }
}
