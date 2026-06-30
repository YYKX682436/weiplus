package com.tencent.mm.weapp_core;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J!\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0082 J/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0082 J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0082 J\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0082 J!\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0010H\u0082 J\u0019\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0010H\u0082 J\u0011\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J$\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020!2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\"0\u0013J\u0014\u0010#\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020$0\u0013J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020!J\u0014\u0010&\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\"0\u0013J\u0016\u0010'\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020*J\u0006\u0010+\u001a\u00020\u0007J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.H$J\u0018\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.H$J\u0018\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u0005H$J\u0010\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020.H$J\u0010\u00106\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.H\u0003J\u0018\u00107\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.H\u0003J\u0018\u00108\u001a\u00020\u00072\u0006\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u0005H\u0003J\u0010\u00109\u001a\u00020\u00052\u0006\u00105\u001a\u00020.H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/tencent/mm/weapp_core/JsBridge;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JdYcpoA0m", "isolatePtr", "contextPtr", "JpOdP8mF0", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "permission", "pluginPermission", "", "JrS9uWFEU", "fsDataList", "JqjmLmwx5", "J8GVTuuXS", "J8jq2sicQ", dm.i4.COL_ID, "result", "JG3Q3Jh9U", "state", "JQFrEE9TY", "bindTo", "runtimeReady", "Lcom/tencent/mm/weapp_core/RuntimeReadyData;", "Lcom/tencent/mm/weapp_core/JsApiPermission;", "Lcom/tencent/mm/weapp_core/PluginPermission;", "onFsDataReady", "Lcom/tencent/mm/weapp_core/FsData;", "onPermissionUpdate", "onPluginPermissionUpdate", "onUserAuthResult", "Lcom/tencent/mm/weapp_core/UserAuthResult;", "onRunningStateChange", "Lcom/tencent/mm/weapp_core/RunningState;", "destroy", "showJsApiBanAlert", "apiName", "", "requestUserAuth", "requestId", "fileSizeChangeEvent", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "diffSize", "getFolderUsedSize", "dirPath", "showJsApiBanAlertJNI", "requestUserAuthJNI", "fileSizeChangeEventJNI", "getFolderUsedSizeJNI", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class JsBridge {
    private long nativePtr;

    public JsBridge() {
        long nativeInit = nativeInit();
        this.nativePtr = nativeInit;
        if (!(nativeInit != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    private final native void J8GVTuuXS(long nativePtr, java.util.List<byte[]> permission);

    private final native void J8jq2sicQ(long nativePtr, long id6, byte[] result);

    private final native void JG3Q3Jh9U(long nativePtr, byte[] state);

    private final native void JQFrEE9TY(long nativePtr);

    private final native void JdYcpoA0m(long nativePtr, long isolatePtr, long contextPtr);

    private final native void JpOdP8mF0(long nativePtr, byte[] data, byte[] permission, java.util.List<byte[]> pluginPermission);

    private final native void JqjmLmwx5(long nativePtr, byte[] permission);

    private final native void JrS9uWFEU(long nativePtr, java.util.List<byte[]> fsDataList);

    private final void fileSizeChangeEventJNI(java.lang.String filePath, long diffSize) {
        fileSizeChangeEvent(filePath, diffSize);
    }

    private final long getFolderUsedSizeJNI(java.lang.String dirPath) {
        return getFolderUsedSize(dirPath);
    }

    private final native void nativeDispose(long nativePtr);

    private final native long nativeInit();

    private final void requestUserAuthJNI(long requestId, java.lang.String apiName) {
        requestUserAuth(requestId, apiName);
    }

    private final void showJsApiBanAlertJNI(java.lang.String apiName) {
        showJsApiBanAlert(apiName);
    }

    public final void bindTo(long isolatePtr, long contextPtr) {
        JdYcpoA0m(this.nativePtr, isolatePtr, contextPtr);
    }

    public final void destroy() {
        JQFrEE9TY(this.nativePtr);
    }

    public final void dispose() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            nativeDispose(j17);
            this.nativePtr = 0L;
        }
    }

    public abstract void fileSizeChangeEvent(java.lang.String filePath, long diffSize);

    public final void finalize() {
        dispose();
    }

    public abstract long getFolderUsedSize(java.lang.String dirPath);

    public final void onFsDataReady(java.util.List<vp5.e> fsDataList) {
        kotlin.jvm.internal.o.g(fsDataList, "fsDataList");
        long j17 = this.nativePtr;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(fsDataList, 10));
        for (vp5.e eVar : fsDataList) {
            eVar.getClass();
            f56.a a17 = f56.i.a();
            a17.f(4);
            a17.v(eVar.f439102a ? (byte) -61 : (byte) -62);
            a17.p(eVar.f439103b);
            a17.p(eVar.f439104c);
            a17.k(eVar.f439105d);
            arrayList.add(a17.D());
        }
        JrS9uWFEU(j17, arrayList);
    }

    public final void onPermissionUpdate(vp5.f permission) {
        kotlin.jvm.internal.o.g(permission, "permission");
        long j17 = this.nativePtr;
        f56.a a17 = f56.i.a();
        permission.a(a17);
        JqjmLmwx5(j17, a17.D());
    }

    public final void onPluginPermissionUpdate(java.util.List<vp5.g> permission) {
        kotlin.jvm.internal.o.g(permission, "permission");
        long j17 = this.nativePtr;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(permission, 10));
        for (vp5.g gVar : permission) {
            gVar.getClass();
            f56.a a17 = f56.i.a();
            a17.f(2);
            gVar.f439109a.a(a17);
            a17.p(gVar.f439110b);
            arrayList.add(a17.D());
        }
        J8GVTuuXS(j17, arrayList);
    }

    public final void onRunningStateChange(vp5.h state) {
        kotlin.jvm.internal.o.g(state, "state");
        long j17 = this.nativePtr;
        f56.a a17 = f56.i.a();
        a17.j(state.ordinal());
        JG3Q3Jh9U(j17, a17.D());
    }

    public final void onUserAuthResult(long j17, vp5.j result) {
        kotlin.jvm.internal.o.g(result, "result");
        long j18 = this.nativePtr;
        f56.a a17 = f56.i.a();
        a17.j(result.ordinal());
        J8jq2sicQ(j18, j17, a17.D());
    }

    public abstract void requestUserAuth(long requestId, java.lang.String apiName);

    public final void runtimeReady(vp5.i data, vp5.f permission, java.util.List<vp5.g> pluginPermission) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(pluginPermission, "pluginPermission");
        long j17 = this.nativePtr;
        f56.a a17 = f56.i.a();
        a17.f(5);
        a17.p(data.f439116a);
        a17.k(data.f439117b);
        a17.k(data.f439118c);
        a17.k(data.f439119d);
        a17.v(data.f439120e ? (byte) -61 : (byte) -62);
        byte[] D = a17.D();
        f56.a a18 = f56.i.a();
        permission.a(a18);
        byte[] D2 = a18.D();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(pluginPermission, 10));
        for (vp5.g gVar : pluginPermission) {
            gVar.getClass();
            f56.a a19 = f56.i.a();
            a19.f(2);
            gVar.f439109a.a(a19);
            a19.p(gVar.f439110b);
            arrayList.add(a19.D());
        }
        JpOdP8mF0(j17, D, D2, arrayList);
    }

    public abstract void showJsApiBanAlert(java.lang.String apiName);
}
