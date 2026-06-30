package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public abstract class LiteAppCenter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DispatchCmdLv2Platform_city = 4;
    private static final int DispatchCmdLv2Platform_getScreenCapturedStatus = 10;
    private static final int DispatchCmdLv2Platform_internationalCity = 9;
    private static final int DispatchCmdLv2Platform_internationalCountry = 7;
    private static final int DispatchCmdLv2Platform_internationalProvince = 8;
    private static final int DispatchCmdLv2Platform_province = 3;
    private static final int DispatchCmdLv2Platform_region = 5;
    private static final int DispatchCmdLv2Platform_setKeepScreenOn = 2;
    private static final int DispatchCmdLv2Platform_setScreenshotEnabled = 12;
    private static final int DispatchCmdLv2Platform_setTitleBackgroundColor = 11;
    private static final int DispatchCmdLv2Platform_showRegionPicker = 13;
    private static final int DispatchCmdLv2Platform_startSpeechRecognition = 15;
    private static final int DispatchCmdLv2Platform_stopSpeechRecognition = 16;
    private static final int DispatchCmdLv2Platform_subDistrict = 6;
    private static final int DispatchCmdLv2Platform_vibrateLong = 0;
    private static final int DispatchCmdLv2Platform_vibrateShort = 1;
    private static final int DispatchCmdLv2Platform_whiteScreenWhenClosed = 14;
    public static final java.lang.String FRAMEWORK_TYPE_BASE = "base";
    public static final java.lang.String FRAMEWORK_TYPE_NONE = "none";
    public static final java.lang.String FRAMEWORK_TYPE_VUE = "Vue";
    public static final java.lang.String FRAMEWORK_TYPE_VUE3 = "Vue3";
    public static final java.lang.String LITE_APP_BASE_LIB = "wxalitebaselibrary";
    private static final java.lang.String TAG = "WxaLiteApp.LiteAppCenter";
    private static android.os.Handler handler = null;
    public static boolean isInitialized = false;
    private static final java.lang.String kJsApiGetNetworkInfo = "GetNetworkInfo";
    public static final int kLiteAppKeepAliveGroupFloat = 2;
    public static final int kLiteAppKeepAliveGroupGlobal = 0;
    public static final int kLiteAppKeepAliveGroupStar = 1;
    public static com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback mCallback;
    public static android.util.DisplayMetrics mDisplayMetrics;
    private static android.content.BroadcastReceiver mVolumeBroadcastReceiver;
    private byte _hellAccFlag_;
    private static final boolean[] sInitLib = {false};
    private static java.util.concurrent.atomic.AtomicLong mAppUuid = new java.util.concurrent.atomic.AtomicLong(1);
    private static java.util.concurrent.atomic.AtomicLong mDataUuid = new java.util.concurrent.atomic.AtomicLong(1);
    private static java.util.HashMap<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo> pageInfos = new java.util.HashMap<>();
    private static long pageId = -1;
    private static java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>> sCommApi = new java.util.concurrent.ConcurrentHashMap();
    private static java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>>> sAppLevelApi = new java.util.concurrent.ConcurrentHashMap();
    private static java.util.Map<java.lang.String, jd.b> sWxaLiteAppJsApiMap = new java.util.concurrent.ConcurrentHashMap();
    private static java.util.Map<java.lang.String, java.lang.Class<? extends com.tencent.mm.plugin.lite.s>> sCommClassStoreMap = new java.util.concurrent.ConcurrentHashMap();
    private static java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.s> sCommStoreMap = new java.util.concurrent.ConcurrentHashMap();
    public static java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback> mUICallback = new java.util.concurrent.ConcurrentHashMap();
    public static volatile int cachedNavigationBarHeight = -1;
    private static java.util.Map<java.lang.Long, com.tencent.liteapp.gen.LiteAppReporter> mReporters = new java.util.concurrent.ConcurrentHashMap();
    protected static java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData> mOpenExtraData = new java.util.concurrent.ConcurrentHashMap();
    private static java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> mJsApiContext = new java.util.concurrent.ConcurrentHashMap();
    public static float fontScale = 1.0f;
    public static boolean fontScaleFollowSystem = false;
    private static com.tencent.mm.plugin.lite.e mDebugCallback = null;
    protected static java.util.Map<java.lang.Integer, java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo>> keepAliveInfos = new java.util.concurrent.ConcurrentHashMap();
    private static java.lang.String mAppRootPath = "";
    private static int mLastVolume = -1;
    private static final java.util.concurrent.atomic.AtomicInteger jsapiLocalId = new java.util.concurrent.atomic.AtomicInteger(0);
    public static final java.util.Map<java.lang.Integer, jd.b> executingJsapiMap = new java.util.concurrent.ConcurrentHashMap();
    public static final java.util.Map<java.lang.Integer, bd.d> executingDynamicModuleMap = new java.util.concurrent.ConcurrentHashMap();
    private static java.lang.String lastPath = "";

    /* loaded from: classes15.dex */
    public static class HostInfo {
        public java.util.Map<java.lang.String, java.lang.String> otherExtends;
        public java.lang.String system = "";
        public java.lang.String systemVersion = "";
        public java.lang.String appVersion = "";
        public java.lang.String appRevision = "";
        public java.lang.String appBranch = "";
        public java.lang.String appBuildJob = "";
        public java.lang.String appBuildTime = "";
        public java.lang.String appFlavor = "";
    }

    /* loaded from: classes14.dex */
    public interface IFragmentCallback {
        void closeWindow(android.content.Intent intent);

        default void halfScreenScrollToBottom() {
        }

        default void halfScreenScrollToResume() {
        }

        default void halfScreenScrollToTop() {
        }

        void hideKeyboard();

        void setPageOrientation(int i17);
    }

    /* loaded from: classes15.dex */
    public interface ILiteAppUICallback {
        void closeWindow(android.content.Intent intent);

        void enterFullScreen();

        void exitFullScreen();

        long getAppUuid();

        android.content.Context getCurrentContext();

        long getDataUuid();

        android.os.Bundle getExtraData();

        com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17);

        /* renamed from: getWxaLiteAppActivity */
        android.app.Activity getF45975q();

        boolean hasCutOut();

        void hideKeyboard();

        boolean isDarkMode();

        void keyboardEnable(boolean z17);

        void navigateBack(boolean z17);

        default void onBodySizeChange(java.lang.String str, long j17, long j18, float f17, float f18) {
        }

        void onCheckBaseLibSumFail(java.lang.String str, java.util.List<java.lang.String> list);

        default void onCheckLiteAppVersionError(int i17) {
        }

        void onCheckSumFail(java.lang.String str, java.util.List<java.lang.String> list);

        void onCreateLitePageViewFinish(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo);

        default void onLayoutComplete(java.lang.String str, long j17, long j18, float f17, float f18) {
        }

        void onShowPageTimeStamp(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo pageShowInfo);

        void openApp();

        void openWebView(java.util.Map map);

        default void releaseKeepAlive() {
        }

        default void removeBackgroundImage() {
        }

        default void rightGestureEvent(java.lang.String str, boolean z17) {
        }

        default void setCanOverScroll(boolean z17) {
        }

        default void setDragToClose(boolean z17) {
        }

        void setFlags(int i17);

        default void setForbidRightGestureEnable(boolean z17) {
        }

        void setIsPopGestureEnabled(boolean z17);

        void setKeepScreenOn(boolean z17);

        void setPageOrientation(int i17);

        void setScreenshotEnabled(boolean z17);

        default void setStatusBarHidden(boolean z17) {
        }

        default void setTitleBackgroundColor(long j17, int i17, boolean z17) {
        }

        void showPage(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo);

        void vibrateLong(long j17);

        void vibrateShort(long j17, int i17);
    }

    /* loaded from: classes15.dex */
    public interface IWxaLiteAppCallback {
        default void addTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        default java.lang.String callNativeRecorder(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            return "";
        }

        default void callNativeSpeechRecognition(long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
            nativeCallback.onCallback("{}");
        }

        default java.lang.String checkGlobalPkg(java.lang.String str, java.lang.String str2) {
            return "";
        }

        default java.lang.String checkLiteAppAndGetPath(java.lang.String str, boolean z17, boolean z18) {
            return "";
        }

        default void clearScheduleWakeUp(java.lang.String str) {
        }

        void dataReporting(java.lang.String str, java.lang.String str2, java.lang.String str3);

        java.lang.String[] getAppInfo(java.lang.String str);

        default long getAppMemory() {
            return 0L;
        }

        default java.lang.String getBatteryInfo() {
            return "{}";
        }

        java.lang.String getClientVersion();

        default android.content.Context getContext(long j17) {
            return null;
        }

        default float getCpu() {
            return 0.0f;
        }

        default java.lang.String getDynamicLibraryPath(java.lang.String str) {
            return "";
        }

        java.lang.String getFilePathByLocalId(java.lang.String str);

        com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo getHostInfo();

        default void getImageInfo(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
            nativeCallback.onCallback("{}");
        }

        default int getKeepAliveInfoCountLimit(int i17) {
            return 1;
        }

        default int getKeepAliveTimeSecondsLimit(int i17, int i18) {
            return i17;
        }

        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo getLiteAppBaselibInfo(java.lang.String str);

        default java.lang.String getLiteAppEngineModelConfig() {
            return "{}";
        }

        default com.tencent.liteapp.storage.WxaLiteAppInfo getLiteAppInfo(java.lang.String str, java.lang.String str2) {
            return null;
        }

        default java.lang.String getLiteAppModelConfig(java.lang.String str) {
            return "{}";
        }

        java.lang.String getLiteAppRoot();

        default com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppViewportMetrics getLiteAppViewportMetrics(android.content.Context context) {
            return null;
        }

        default com.tencent.liteapp.report.WxaLiteAppStartReport getLiteAppWidgetStartReporter(java.lang.String str) {
            return null;
        }

        default java.lang.String getMulitExpt(java.lang.String str, java.lang.String str2) {
            return str2;
        }

        default java.lang.String getNetworkInfo() {
            return "{}";
        }

        java.lang.String getOfflineResource(java.lang.String str, java.lang.String str2, java.lang.String str3);

        default java.lang.String getOpenOption(java.lang.String str) {
            return "{}";
        }

        default java.util.List<java.lang.String> getPermissionBlackList(java.lang.String str) {
            return null;
        }

        java.lang.String getRecentForward(java.lang.String str);

        java.lang.String getRecentForwardTitle(java.lang.String str);

        java.lang.String getRegionInfo(java.lang.String str, java.lang.String str2);

        default java.lang.String getScheduleWakeUpInfo(java.lang.String str) {
            return "{}";
        }

        com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17);

        default java.lang.String getTaskState(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            return "{}";
        }

        default java.lang.String getTaskSwitch() {
            return "{}";
        }

        java.lang.String getUin();

        java.lang.String getUserAgent();

        default java.lang.String getUserAlbums(java.lang.String str, java.lang.String str2) {
            return "{}";
        }

        default void getVideoInfo(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
            nativeCallback.onCallback("{}");
        }

        default java.lang.String getVolume() {
            return "{}";
        }

        default java.lang.String getWebviewLocalIdByPath(java.lang.String str, java.lang.String str2) {
            return "";
        }

        boolean isDarkMode();

        default void liteAppWidgetCreateStore(java.lang.String str, int i17, boolean z17, int i18) {
        }

        default void liteAppWidgetCreateStoreWithPkgPath(java.lang.String str, int i17, java.lang.String str2) {
        }

        default int liteAppWidgetDispatchStore(java.lang.String str, java.lang.String str2, java.util.Map map) {
            return 0;
        }

        default void liteAppWidgetPublishEventToTopPage(int i17, int i18, java.lang.String str, java.util.Map map) {
        }

        default void liteAppWidgetPublishGlobalEvent(int i17, int i18, java.lang.String str, java.util.Map map) {
        }

        default void liteAppWidgetPublishGlobalEventToAll(java.lang.String str, java.util.Map map) {
        }

        default void liteAppWidgetPublishGlobalEventToAllByAppId(java.lang.String str, java.lang.String str2, java.util.Map map) {
        }

        default void liteAppWidgetPublishGlobalEventToTopPage(int i17, java.lang.String str, java.util.Map map) {
        }

        default void liteAppWidgetReleaseStore(java.lang.String str) {
        }

        default boolean liteAppWidgetStoreIsAlive(java.lang.String str) {
            return false;
        }

        default void liteAppWidgetSubscribeStore(java.lang.String str, java.util.List list) {
        }

        default void liteAppWidgetUnsubscribeStore(java.lang.String str, java.util.List list) {
        }

        default void loadLibrary(java.lang.String str) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/LiteAppCenter$IWxaLiteAppCallback", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/plugin/lite/LiteAppCenter$IWxaLiteAppCallback", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }

        default void onCheckBaseLibSumFail(java.lang.String str, java.util.List<java.lang.String> list) {
        }

        default void onCheckSumFail(java.lang.String str, java.util.List<java.lang.String> list) {
        }

        default void onClearCurrentHandOff(java.lang.String str) {
        }

        default void onInitJsRuntime(java.lang.String str, long j17, long j18, long j19, long j27) {
        }

        default void onLiteAppWidgetPrepared() {
        }

        default void onOpenCurrentPageOnPC(java.lang.String str) {
        }

        default void onPreReleaseLiteApp(java.lang.String str, long j17, java.lang.String str2, boolean z17) {
        }

        default void onPreloadLitePageViewFailed(java.lang.String str, java.lang.String str2) {
        }

        default void onPreloadLitePageViewFinish(long j17, java.lang.String str, long j18) {
        }

        default void onSetCurrentHandOff(java.lang.String str) {
        }

        default void onSetUICallback(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback) {
        }

        default void onShowStatusChange(java.lang.String str, java.lang.String str2, long j17, long j18, boolean z17) {
        }

        void onStoreSendResult(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj);

        void onStoreSetData(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map);

        default void onUnsetUICallback(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback) {
        }

        default void onUpdateCurrentHandOff(java.lang.String str) {
        }

        void openPage(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

        default void prepareTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        void reloadDebug(java.lang.String str, java.lang.String str2);

        default void removeForwardUser(java.lang.String str) {
        }

        default void removeTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        void reportIdKey(long j17, long j18, long j19);

        void reportKv(int i17, java.lang.String str);

        default void setOpenOption(java.lang.String str, java.lang.String str2) {
        }

        default void setScheduleWakeUp(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        }

        default void showRegionPicker() {
        }

        default void updateTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        default void checkLiteAppAndGetPath(java.lang.String str, boolean z17, boolean z18, yz5.l lVar) {
        }

        default boolean getMulitExpt(java.lang.String str, boolean z17) {
            return z17;
        }
    }

    /* loaded from: classes15.dex */
    public static class JsApi {
        public java.lang.String appId;
        public long appPtr;
        public long appUuid;
        public long callbackId;
        public boolean isFromView;
        public java.lang.String method;
        public long pageId;
        public java.lang.String param;

        public JsApi(long j17, java.lang.String str, long j18, long j19, java.lang.String str2, java.lang.String str3, long j27, boolean z17) {
            this.appUuid = j17;
            this.appId = str;
            this.appPtr = j18;
            this.pageId = j19;
            this.method = str2;
            this.param = str3;
            this.callbackId = j27;
            this.isFromView = z17;
        }

        public java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appUuid:");
            stringBuffer.append(this.appUuid);
            stringBuffer.append("appid:");
            stringBuffer.append(this.appId);
            stringBuffer.append(" appPtr:");
            stringBuffer.append(this.appPtr);
            stringBuffer.append(" pageId:");
            stringBuffer.append(this.pageId);
            stringBuffer.append(" method:");
            stringBuffer.append(this.method);
            stringBuffer.append(" param:");
            stringBuffer.append(this.param);
            stringBuffer.append(" callback:");
            stringBuffer.append(this.callbackId);
            stringBuffer.append(" isFromView:");
            stringBuffer.append(this.isFromView);
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes15.dex */
    public static class KeepAliveInfo {
        public long appUuid;
        public int engineId;
        public java.lang.String key;
        public java.lang.Runnable releaseRunnable;
        public java.lang.Runnable runnable;
        public java.lang.String sessionId;
    }

    /* loaded from: classes15.dex */
    public static class LVUICallback {
        public java.lang.String appId;
        public com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback callback;
        private int height;
        private int width;
        public com.tencent.mm.plugin.lite.s store = null;
        public boolean isPreload = false;
        private boolean autoWidth = false;
        private boolean autoHeight = false;

        public LVUICallback(java.lang.String str, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback) {
            this.appId = str;
            this.callback = iLiteAppUICallback;
        }

        public com.tencent.mm.plugin.lite.s getStore() {
            return this.store;
        }

        public com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17) {
            com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback = this.callback;
            if (iLiteAppUICallback != null) {
                return iLiteAppUICallback.getSystemInfo(i17);
            }
            com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo systemInfo = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.getSystemInfo(i17);
            systemInfo.appId = this.appId;
            systemInfo.isHalfScreen = false;
            return systemInfo;
        }

        public void onBodySizeChange(java.lang.String str, long j17, long j18, float f17, float f18) {
            com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback = this.callback;
            if (iLiteAppUICallback != null) {
                iLiteAppUICallback.onBodySizeChange(str, j17, j18, f17, f18);
            }
        }

        public void onLayoutComplete(java.lang.String str, long j17, long j18, float f17, float f18) {
            com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback = this.callback;
            if (iLiteAppUICallback != null) {
                iLiteAppUICallback.onLayoutComplete(str, j17, j18, f17, f18);
            }
        }

        public void onPreloadLitePageViewFinish(long j17, java.lang.String str, long j18) {
            if (this.callback != null) {
                return;
            }
            kd.c.c(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "onPreloadLitePageViewFinish appUuid=%d realAppUuid=%d autoHeight:%d size=%d %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.autoHeight ? 1 : 0), java.lang.Integer.valueOf(this.width), java.lang.Integer.valueOf(this.height));
            boolean z17 = this.autoWidth;
            if (z17 || this.autoHeight) {
                com.tencent.mm.plugin.lite.LiteAppCenter.setAutoSize(j18, z17, this.autoHeight, false);
            }
            if (this.width > 0 || this.height > 0) {
                android.content.Context context = zc.c.f471339b;
                if (context == null) {
                    kotlin.jvm.internal.o.o("appContext");
                    throw null;
                }
                android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                float f17 = displayMetrics.density;
                float f18 = 48 * f17;
                android.content.Context context2 = zc.c.f471339b;
                if (context2 == null) {
                    kotlin.jvm.internal.o.o("appContext");
                    throw null;
                }
                android.graphics.Point b17 = es.u.b(context2);
                com.tencent.mm.plugin.lite.LiteAppCenter.setDisplayParams(j18, this.width / f17, this.height / f17, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, f18 / f17, 0.0f, 0.0f);
            }
        }

        public void setAutoSize(boolean z17, boolean z18) {
            this.autoWidth = z17;
            this.autoHeight = z18;
        }

        public void setSize(int i17, int i18) {
            this.width = i17;
            this.height = i18;
        }

        public void setStore(com.tencent.mm.plugin.lite.s sVar) {
            com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback;
            this.store = sVar;
            if (sVar == null || (iLiteAppUICallback = this.callback) == null) {
                return;
            }
            sVar.f144166c = iLiteAppUICallback.getAppUuid();
            com.tencent.mm.plugin.lite.s sVar2 = this.store;
            android.content.Context currentContext = this.callback.getCurrentContext();
            sVar2.getClass();
            sVar2.f144169f = new java.lang.ref.WeakReference(currentContext);
        }
    }

    /* loaded from: classes15.dex */
    public static class LiteAppHandOffInfo {

        /* renamed from: id, reason: collision with root package name */
        public java.lang.String f143404id = "";
        public java.lang.String title = "";
        public java.lang.String icon = "";
        public java.lang.String appId = "";
        public java.lang.String page = "";
        public java.lang.String query = "";
        public java.lang.String type = "";
        public java.lang.String url = "";
        public java.lang.String extraData = "";
    }

    /* loaded from: classes15.dex */
    public static class LiteAppViewportMetrics {
        public int width = 0;
        public int height = 0;
        public int deviceWidth = 0;
        public int deviceHeight = 0;
        public int statusBarHeight = 0;
        public int actionBarHeight = 0;
        public int navigationBarHeight = 0;
        public int densityDpi = 0;
        public float density = 0.0f;
        public boolean inMultiWindowMode = false;
        public int multiWindowWidth = 0;
        public int multiWindowHeight = 0;

        public java.lang.String toString() {
            return "LiteAppViewportMetrics {width=" + this.width + ", height=" + this.height + ", deviceWidth=" + this.deviceWidth + ", deviceHeight=" + this.deviceHeight + ", statusBarHeight=" + this.statusBarHeight + ", actionBarHeight=" + this.actionBarHeight + ", navigationBarHeight=" + this.navigationBarHeight + ", densityDpi=" + this.densityDpi + ", density=" + this.density + ", inMultiWindowMode=" + this.inMultiWindowMode + ", multiWindowWidth=" + this.multiWindowWidth + ", multiWindowHeight=" + this.multiWindowHeight + '}';
        }
    }

    /* loaded from: classes15.dex */
    public static class MethodInfo {
        public static final int METHOD_ASYNC = 1;
        public static final int METHOD_SYNC = 0;
        public static final int PARAM_BOOL = 1;
        public static final int PARAM_BUFFER = 5;
        public static final int PARAM_CALLBACK = 6;
        public static final int PARAM_CHAR = 2;
        public static final int PARAM_JSON = 4;
        public static final int PARAM_NUMBER = 0;
        public static final int PARAM_STRING = 3;
        public boolean isReturnBuffer = false;
        public int methodType = 0;
        public java.lang.String methodName = "";
        public java.util.List<java.lang.Integer> paramTypes = new java.util.ArrayList();
        public java.util.Map<java.lang.String, java.lang.Integer> returnTypes = new java.util.HashMap();
    }

    /* loaded from: classes15.dex */
    public static class ModuleInfo {
        public java.lang.String moduleName = "";
        public java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.LiteAppCenter.MethodInfo> methods = new java.util.HashMap();
    }

    /* loaded from: classes15.dex */
    public static class NativeCallback {
        private final long callbackId;

        public NativeCallback(long j17) {
            this.callbackId = j17;
        }

        public void onCallback(java.lang.Object obj) {
            com.tencent.mm.plugin.lite.LiteAppCenter.nativeCallback(this.callbackId, obj);
        }
    }

    /* loaded from: classes15.dex */
    public static class OpenExtraData {
        public java.lang.String query;
        public java.lang.String referrerInfo;
        public com.tencent.mm.plugin.lite.s store;
    }

    /* loaded from: classes15.dex */
    public static class PageConfig {
        public static final int VIEWPORT_DEFAULT = 0;
        public static final int VIEWPORT_EXTEND_TO_SCREEN = 3;
        public static final int VIEWPORT_EXTEND_TO_STATUSBAR = 1;
        public static final int VIEWPORT_FULLSCREEN = 7;
        public static final int VIEWPORT_HIDE_STATUSBAR = 5;
        public int backgroundColor = 0;
        public int darkBackgroundColor = 0;
        public int titleBackgroundColor = 0;
        public int darkTitleBackgroundColor = 0;
        public int pageOrientation = 0;
        public int viewport = 0;
        public org.json.JSONObject backgroundImage = null;
        public java.lang.String globalPkgAppId = "";
        public java.lang.String globalPkgMinVersion = "";

        public int getBackgroundColor(boolean z17) {
            return z17 ? this.darkBackgroundColor : this.backgroundColor;
        }

        public android.widget.ImageView.ScaleType getBackgroundImageMode() {
            java.lang.String optString = this.backgroundImage.optString("mode", "");
            optString.getClass();
            char c17 = 65535;
            switch (optString.hashCode()) {
                case 3143043:
                    if (optString.equals("fill")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case 94852023:
                    if (optString.equals("cover")) {
                        c17 = 1;
                        break;
                    }
                    break;
                case 951526612:
                    if (optString.equals("contain")) {
                        c17 = 2;
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                    return android.widget.ImageView.ScaleType.FIT_XY;
                case 1:
                    return android.widget.ImageView.ScaleType.CENTER_CROP;
                case 2:
                    return android.widget.ImageView.ScaleType.CENTER_INSIDE;
                default:
                    return android.widget.ImageView.ScaleType.FIT_XY;
            }
        }

        public java.lang.String getBackgroundImagePath(boolean z17) {
            org.json.JSONObject jSONObject;
            java.lang.String str;
            if (z17) {
                jSONObject = this.backgroundImage;
                str = "darkUrl";
            } else {
                jSONObject = this.backgroundImage;
                str = "url";
            }
            return jSONObject.optString(str, "");
        }

        public int getTitleBackgroundColor(boolean z17) {
            return z17 ? this.darkTitleBackgroundColor : this.titleBackgroundColor;
        }

        public boolean isFullScreenViewport() {
            return (this.viewport & 2) != 0;
        }
    }

    /* loaded from: classes15.dex */
    public static class PageShowInfo {
        public int codeCacheResult;
        public boolean codeCacheSwitch;
        public long compilePageCost;
        public long evalBaseLibCost;
        public long evalPageCost;
        public java.lang.String extraInfo;
        public boolean hitSnapshotSwitch;
        public int snapshotRuntimeType;
        public long timestamp;

        public PageShowInfo(long j17, boolean z17, int i17, long j18, long j19, long j27, boolean z18, int i18, java.lang.String str) {
            this.timestamp = j17;
            this.codeCacheSwitch = z17;
            this.codeCacheResult = i17;
            this.compilePageCost = j18;
            this.evalPageCost = j19;
            this.evalBaseLibCost = j27;
            this.hitSnapshotSwitch = z18;
            this.snapshotRuntimeType = i18;
            this.extraInfo = str;
        }
    }

    /* loaded from: classes15.dex */
    public static class PlatformInfo {
        public java.lang.String userAgent = "";
        public java.lang.String rootPath = "";
        public java.lang.String uin = "";
        public java.lang.String clientVersion = "";
        public java.lang.String engineModelConfig = "";
    }

    /* loaded from: classes.dex */
    public interface RunnableTask {
        void run(boolean z17);
    }

    /* loaded from: classes15.dex */
    public static class SystemInfo {
        public java.lang.String networkType = "";
        public java.lang.String brand = "";
        public java.lang.String model = "";
        public java.lang.String appId = "";
        public java.lang.String language = "";
        public java.lang.String platform = "";
        public java.lang.String system = "";
        public java.lang.String version = "";
        public float fontScale = 1.0f;
        public float pixelRatio = 0.0f;
        public float navigationBarHeight = 0.0f;
        public float statusBarHeight = 0.0f;
        public float titleBarHeight = 0.0f;
        public boolean darkMode = false;
        public boolean isHalfScreen = false;

        public java.lang.String toJsonString() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("networkType", this.networkType);
                jSONObject.put("brand", this.brand);
                jSONObject.put("model", this.model);
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.language);
                jSONObject.put("platform", this.platform);
                jSONObject.put("system", this.system);
                jSONObject.put("fontScale", this.fontScale);
                jSONObject.put("version", this.version);
                jSONObject.put("pixelRatio", this.pixelRatio);
                jSONObject.put("navigationBarHeight", this.navigationBarHeight);
                jSONObject.put("statusBarHeight", this.statusBarHeight);
                jSONObject.put("titleBarHeight", this.titleBarHeight);
                jSONObject.put("darkMode", this.darkMode);
                jSONObject.put("isHalfScreen", this.isHalfScreen);
            } catch (org.json.JSONException e17) {
                kd.c.b(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "toJasonString JSONException" + e17.toString(), new java.lang.Object[0]);
            }
            return jSONObject.toString();
        }
    }

    public static native void DynamicModuleCallback(java.lang.String str, long j17, long j18, long j19, java.lang.String str2, boolean z17, boolean z18, boolean z19);

    public static native void DynamicModuleParamCallback(java.lang.String str, long j17, long j18, long j19, java.lang.String str2, boolean z17, boolean z18);

    private static native java.lang.String _getPageConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public static void addGlobalStore(java.lang.String str, java.lang.Class<? extends com.tencent.mm.plugin.lite.s> cls) {
        sCommClassStoreMap.put(str, cls);
    }

    public static void addJsApi(java.lang.String str, java.lang.Class<? extends jd.b> cls) {
        if (!sCommApi.containsKey(str)) {
            sCommApi.put(str, cls);
            return;
        }
        throw new java.lang.RuntimeException(str + " has been exists");
    }

    private static void addKeepAliveInfo(com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo keepAliveInfo, int i17) {
        java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo> concurrentLinkedQueue = keepAliveInfos.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
            keepAliveInfos.put(java.lang.Integer.valueOf(i17), concurrentLinkedQueue);
        }
        if (concurrentLinkedQueue.size() >= getKeepAliveInfoCountLimit(i17)) {
            com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo poll = concurrentLinkedQueue.poll();
            getHandler().removeCallbacks(poll.runnable);
            poll.releaseRunnable.run();
        }
        concurrentLinkedQueue.add(keepAliveInfo);
    }

    private static void addTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.addTask(str, j17, str2, str3, str4);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    public static int cacheNavigationBarHeight(android.content.Context context, int i17, long j17) {
        if (context == null) {
            kd.c.e(TAG, "cacheNavigationBarHeight: context is null", new java.lang.Object[0]);
            return -1;
        }
        try {
            int b17 = md.n.b(context, i17);
            if (b17 >= 0) {
                if (b17 != i17 || cachedNavigationBarHeight != i17) {
                    setSystemBarHeight(j17, -1.0f, b17 / context.getResources().getDisplayMetrics().density, true);
                }
                cachedNavigationBarHeight = b17;
                kd.c.c(TAG, "Navigation bar height cached in LiteAppCenter: %d", java.lang.Integer.valueOf(b17));
                return b17;
            }
        } catch (java.lang.Exception e17) {
            kd.c.e(TAG, "cacheNavigationBarHeight error: %s", e17.getMessage());
        }
        return -1;
    }

    private static java.lang.String callDynamicModule(long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j19, boolean z17) {
        java.lang.String str5;
        java.lang.reflect.Method method;
        bd.g gVar;
        boolean z18;
        java.util.List list;
        java.util.List list2;
        boolean z19;
        boolean z27;
        java.lang.reflect.Method method2;
        java.util.List list3;
        java.util.List list4;
        java.lang.Object[] objArr;
        bd.d dVar;
        bd.i iVar;
        java.util.List list5;
        bd.d dVar2;
        java.util.List list6;
        bd.i iVar2;
        int i17;
        bd.i iVar3 = bd.i.f19215e;
        iVar3.getClass();
        try {
            java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) iVar3.f19218c).get(str);
            method = null;
            gVar = map != null ? (bd.g) map.get(str2) : null;
            if (gVar == null) {
                gVar = (bd.g) ((java.util.concurrent.ConcurrentHashMap) iVar3.f19217b).get(str2);
            }
        } catch (java.lang.Exception e17) {
            e = e17;
            str5 = "WxaLiteApp.WxaLiteAppModuleMgr";
        }
        if (gVar == null) {
            kd.c.b("WxaLiteApp.WxaLiteAppModuleMgr", "DynamicModule " + str2 + " isn't registered!", new java.lang.Object[0]);
            return "\"module isn't registered!\"";
        }
        java.util.Map map2 = gVar.f19208a;
        java.util.Iterator it = ((java.util.HashMap) map2).keySet().iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                list = null;
                list2 = null;
                z19 = false;
                z27 = false;
                break;
            }
            java.lang.String str6 = (java.lang.String) it.next();
            if (str6.equals(str3)) {
                bd.f fVar = (bd.f) ((java.util.HashMap) map2).get(str6);
                java.lang.reflect.Method method3 = fVar.f19203a;
                list2 = fVar.f19205c;
                z19 = true;
                z27 = true;
                list = fVar.f19206d;
                method = method3;
                break;
            }
        }
        if (!z19) {
            java.util.Map map3 = gVar.f19209b;
            for (java.lang.String str7 : ((java.util.HashMap) map3).keySet()) {
                java.lang.reflect.Method method4 = method;
                if (str7.equals(str3)) {
                    bd.f fVar2 = (bd.f) ((java.util.HashMap) map3).get(str7);
                    method2 = fVar2.f19203a;
                    list3 = fVar2.f19205c;
                    z27 = false;
                    list4 = fVar2.f19206d;
                    break;
                }
                method = method4;
            }
        }
        z18 = z19;
        method2 = method;
        list3 = list2;
        list4 = list;
        if (!z18) {
            kd.c.b("WxaLiteApp.WxaLiteAppModuleMgr", "DynamicModule " + str2 + " hasn't method " + str3, new java.lang.Object[0]);
            return "\"method isn't found!\"";
        }
        bd.d dVar3 = (bd.d) gVar.f19210c.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        int andIncrement = iVar3.f19216a.getAndIncrement();
        bd.d dVar4 = dVar3;
        java.util.List list7 = list4;
        java.util.List list8 = list3;
        java.lang.reflect.Method method5 = method2;
        str5 = "WxaLiteApp.WxaLiteAppModuleMgr";
        try {
            dVar4.setCallback(new bd.e(j17, str, j18, j19, andIncrement, z17));
            if (j19 > 0) {
                ((java.util.concurrent.ConcurrentHashMap) iVar3.f19219d).put(java.lang.Integer.valueOf(andIncrement), dVar4);
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray(str4);
            objArr = new java.lang.Object[jSONArray.length()];
            int i18 = 0;
            while (i18 < jSONArray.length()) {
                if (list8.contains(java.lang.Integer.valueOf(i18))) {
                    list5 = list8;
                    dVar2 = dVar4;
                    objArr[i18] = java.nio.ByteBuffer.wrap(getBuffer(str, j17, jSONArray.optJSONObject(i18).getInt("__id"), z17));
                    iVar2 = iVar3;
                    list6 = list7;
                    i17 = i18;
                } else {
                    list5 = list8;
                    dVar2 = dVar4;
                    java.util.List list9 = list7;
                    if (list9.contains(java.lang.Integer.valueOf(i18))) {
                        list6 = list9;
                        iVar2 = iVar3;
                        i17 = i18;
                        objArr[i17] = new bd.b(j17, str, j18, jSONArray.optLong(i18), z17);
                    } else {
                        list6 = list9;
                        iVar2 = iVar3;
                        i17 = i18;
                        objArr[i17] = jSONArray.get(i17);
                    }
                }
                i18 = i17 + 1;
                dVar4 = dVar2;
                list8 = list5;
                iVar3 = iVar2;
                list7 = list6;
            }
            dVar = dVar4;
            iVar = iVar3;
        } catch (java.lang.Exception e18) {
            e = e18;
            kd.c.b(str5, "callDynamicModule " + e.toString(), new java.lang.Object[0]);
            return "\"error\"";
        }
        if (!z27) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new bd.h(iVar, method5, dVar, objArr));
            return "\"error\"";
        }
        java.lang.Object invoke = method5.invoke(dVar, objArr);
        java.lang.Class<?> returnType = method5.getReturnType();
        if (invoke == null) {
            return "null";
        }
        if (returnType.getName().toLowerCase().contains("map")) {
            return new org.json.JSONObject((java.util.Map) invoke).toString();
        }
        if (returnType.getName().toLowerCase().contains("list")) {
            return new org.json.JSONArray((java.util.Collection) invoke).toString();
        }
        if (!returnType.getName().toLowerCase().contains("string")) {
            if (!returnType.getName().toLowerCase().contains("byte")) {
                return invoke instanceof bd.a ? bd.j.a((bd.a) invoke, str, j17, z17) : invoke.toString();
            }
            return "{\"__id\":" + setBuffer(str, j17, ((java.nio.ByteBuffer) invoke).array(), z17) + "}";
        }
        java.lang.String str8 = (java.lang.String) invoke;
        if (isJson(str8)) {
            return str8;
        }
        return "\"" + escapeString(str8) + "\"";
    }

    private static java.lang.String callNativeRecorder(long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.callNativeRecorder(j17, str, str3, str4);
        }
        kd.c.b(TAG, "callNativeRecorder mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean canIUse(java.lang.String r6, java.lang.String r7) {
        /*
            bd.i r0 = bd.i.f19215e
            java.util.Map r1 = r0.f19217b
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            boolean r1 = r1.containsKey(r7)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L10
        Le:
            r0 = r3
            goto L28
        L10:
            java.util.Map r0 = r0.f19218c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L27
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L27
            goto Le
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L2b
            return r3
        L2b:
            java.lang.String r0 = "jsapi"
            boolean r1 = r7.equals(r0)
            if (r1 == 0) goto L34
            return r3
        L34:
            java.lang.String r1 = "."
            boolean r4 = r7.contains(r1)
            if (r4 == 0) goto L81
            int r1 = r7.indexOf(r1)
            java.lang.String r4 = r7.substring(r2, r1)
            int r1 = r1 + r3
            int r5 = r7.length()
            java.lang.String r7 = r7.substring(r1, r5)
            int r1 = r7.length()
            if (r1 <= 0) goto L81
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L81
            java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>> r0 = com.tencent.mm.plugin.lite.LiteAppCenter.sCommApi
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto L80
            java.util.Map<java.lang.String, jd.b> r0 = com.tencent.mm.plugin.lite.LiteAppCenter.sWxaLiteAppJsApiMap
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L6a
            goto L80
        L6a:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>>> r0 = com.tencent.mm.plugin.lite.LiteAppCenter.sAppLevelApi
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L81
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>>> r0 = com.tencent.mm.plugin.lite.LiteAppCenter.sAppLevelApi
            java.lang.Object r6 = r0.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L81
        L80:
            return r3
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.LiteAppCenter.canIUse(java.lang.String, java.lang.String):boolean");
    }

    public static java.lang.String checkAndGetLiteAppPath(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.checkLiteAppAndGetPath(str, z17, z18) : "";
    }

    public static native int checkBaseLib(java.lang.String str);

    public static java.lang.String checkGlobalPkg(com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig pageConfig) {
        return (mCallback == null || pageConfig == null || pageConfig.globalPkgAppId.isEmpty()) ? "" : mCallback.checkGlobalPkg(pageConfig.globalPkgAppId, pageConfig.globalPkgMinVersion);
    }

    public static native int checkLiteAppPkg(java.lang.String str);

    public static native boolean checkPageExists(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public static native boolean checkSessionId(java.lang.String str);

    private static void clearScheduleWakeUp(java.lang.String str) {
        kd.c.c(TAG, "clearScheduleWakeUp appId: %s", str);
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.clearScheduleWakeUp(str);
        }
    }

    public static void closeWindow(long j17, android.content.Intent intent) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.closeWindow(intent);
        }
    }

    public static native void createStore(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17);

    public static void createStoreForLiteAppWidget(java.lang.String str, int i17, boolean z17, int i18) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetCreateStore(str, i17, z17, i18);
        }
    }

    public static void createStoreWithPkgPathForLiteAppWidget(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetCreateStoreWithPkgPath(str, i17, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dataReporting(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.dataReporting(str, str2, str3);
        }
    }

    public static native boolean deleteAuthInfo(java.lang.String str);

    public static native boolean deleteBaselibInfo(java.lang.String str);

    public static native boolean deleteConfigInfo(java.lang.String str);

    public static native boolean deleteLiteAppInfo(java.lang.String str);

    public static native boolean deleteSamplingConfigInfo(java.lang.String str);

    public static native void destroyPage(long j17, java.lang.String str, long j18);

    private static void dispatchCmdNoRet(long j17, java.lang.String str, long j18, final long j19, int i17, final java.lang.String str2) {
        final com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (i17 == 0) {
            if (uICallback != null) {
                uICallback.vibrateLong(400L);
                return;
            }
            return;
        }
        if (i17 == 1) {
            if (uICallback != null) {
                int i18 = 192;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    if (jSONObject.has("type")) {
                        java.lang.String string = jSONObject.getString("type");
                        if ("heavy".equals(string)) {
                            i18 = 255;
                        } else if ("light".equals(string)) {
                            i18 = 128;
                        }
                    }
                } catch (org.json.JSONException unused) {
                }
                uICallback.vibrateShort(15L, i18);
                return;
            }
            return;
        }
        try {
            if (i17 != 2) {
                switch (i17) {
                    case 11:
                        getHandler().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.6
                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback.this != null) {
                                    try {
                                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                                        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback.this.setTitleBackgroundColor(j19, jSONObject2.getInt("color"), jSONObject2.getBoolean("darkMode"));
                                    } catch (org.json.JSONException unused2) {
                                    }
                                }
                            }
                        });
                        return;
                    case 12:
                        if (uICallback != null) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                            if (jSONObject2.has("enabled")) {
                                uICallback.setScreenshotEnabled(jSONObject2.getBoolean("enabled"));
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 13:
                        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
                        if (iWxaLiteAppCallback != null) {
                            iWxaLiteAppCallback.showRegionPicker();
                            return;
                        }
                        return;
                    case 14:
                        releaseKeepAlive(str, j17);
                        return;
                    default:
                        return;
                }
            } else {
                if (uICallback == null) {
                    return;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(str2);
                if (!jSONObject3.has("on")) {
                } else {
                    uICallback.setKeepScreenOn(jSONObject3.getBoolean("on"));
                }
            }
        } catch (org.json.JSONException unused2) {
        }
    }

    private static java.lang.String dispatchCmdWithRet(java.lang.String str, long j17, long j18, int i17, java.lang.String str2) {
        switch (i17) {
            case 3:
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
                return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getRegionInfo("province", str2) : "";
            case 4:
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback2 = mCallback;
                return iWxaLiteAppCallback2 != null ? iWxaLiteAppCallback2.getRegionInfo("city", str2) : "";
            case 5:
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback3 = mCallback;
                return iWxaLiteAppCallback3 != null ? iWxaLiteAppCallback3.getRegionInfo("region", str2) : "";
            case 6:
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback4 = mCallback;
                return iWxaLiteAppCallback4 != null ? iWxaLiteAppCallback4.getRegionInfo("subDistrict", str2) : "";
            case 7:
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback5 = mCallback;
                return iWxaLiteAppCallback5 != null ? iWxaLiteAppCallback5.getRegionInfo("internationalCountry", str2) : "";
            case 8:
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback6 = mCallback;
                return iWxaLiteAppCallback6 != null ? iWxaLiteAppCallback6.getRegionInfo("internationalProvince", str2) : "";
            case 9:
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback7 = mCallback;
                return iWxaLiteAppCallback7 != null ? iWxaLiteAppCallback7.getRegionInfo("internationalCity", str2) : "";
            default:
                return "";
        }
    }

    private static void dispatchPlatformCmdWithCallback(long j17, java.lang.String str, long j18, int i17, java.lang.String str2, boolean z17, long j19) {
        com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback = new com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback(j19);
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback == null) {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
            nativeCallback.onCallback("{}");
        } else if (i17 == 15) {
            iWxaLiteAppCallback.callNativeSpeechRecognition(j17, str, j18, "startSpeechRecognition", str2, z17, nativeCallback);
        } else {
            if (i17 != 16) {
                return;
            }
            iWxaLiteAppCallback.callNativeSpeechRecognition(j17, str, j18, "stopSpeechRecognition", str2, z17, nativeCallback);
        }
    }

    public static int dispatchStore(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return dispatchStore(str, str2, com.tencent.mm.plugin.lite.s.b(obj, "{}"));
    }

    private static native int dispatchStore(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static int dispatchStoreForLiteAppWidget(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.liteAppWidgetDispatchStore(str, str2, map);
        }
        return 0;
    }

    public static java.lang.String escapeString(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        int i17 = 0;
        while (i17 < sb6.length()) {
            char charAt = sb6.charAt(i17);
            if (charAt == '\t') {
                sb6.replace(i17, i17 + 1, "\\t");
            } else if (charAt == '\n') {
                sb6.replace(i17, i17 + 1, "\\n");
            } else if (charAt == '\r') {
                sb6.replace(i17, i17 + 1, "\\r");
            } else if (charAt == '\"') {
                sb6.replace(i17, i17 + 1, "\\\"");
            } else if (charAt != '\\') {
                i17++;
            } else {
                sb6.replace(i17, i17 + 1, "\\\\");
            }
            i17 += 2;
        }
        return sb6.toString();
    }

    public static long genAppUuid() {
        long andIncrement;
        do {
            andIncrement = mAppUuid.getAndIncrement() & 65535;
        } while (andIncrement == 0);
        return andIncrement;
    }

    public static long genDataUuid() {
        return mDataUuid.incrementAndGet();
    }

    public static java.lang.String genLiteAppSessionId() {
        return java.util.UUID.randomUUID().toString();
    }

    public static native java.lang.String generateLiteAppLocalId(long j17, java.lang.String str, java.lang.String str2);

    public static native void getAllBaselibInfo(java.util.List<com.tencent.liteapp.storage.WxaLiteAppBaselibInfo> list);

    public static native void getAllConfigInfo(java.util.List<com.tencent.liteapp.storage.WxaLiteAppConfigInfo> list);

    private static com.tencent.mm.plugin.lite.LiteAppCenter.ModuleInfo[] getAllDynamicModule(java.lang.String str) {
        java.util.Iterator it;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        bd.g gVar;
        com.tencent.mm.plugin.lite.LiteAppCenter.ModuleInfo moduleInfo;
        bd.i iVar;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.CharSequence charSequence;
        java.lang.String str5;
        java.lang.CharSequence charSequence2;
        int i17;
        java.lang.String str6;
        bd.i iVar2 = bd.i.f19215e;
        iVar2.getClass();
        int i18 = 0;
        if (str == null || str.isEmpty()) {
            kd.c.b("WxaLiteApp.WxaLiteAppModuleMgr", "invalid appId", new java.lang.Object[0]);
            return null;
        }
        java.util.List a17 = iVar2.a(str);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.util.ArrayList) a17).iterator();
        while (it6.hasNext()) {
            bd.g gVar2 = (bd.g) it6.next();
            com.tencent.mm.plugin.lite.LiteAppCenter.ModuleInfo moduleInfo2 = new com.tencent.mm.plugin.lite.LiteAppCenter.ModuleInfo();
            moduleInfo2.moduleName = gVar2.f19211d;
            java.util.Iterator it7 = ((java.util.HashMap) gVar2.f19208a).entrySet().iterator();
            while (true) {
                java.lang.String str7 = "bool";
                it = it6;
                str2 = "short";
                arrayList = arrayList2;
                gVar = gVar2;
                moduleInfo = moduleInfo2;
                iVar = iVar2;
                str3 = "string";
                if (!it7.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it7.next();
                java.util.Iterator it8 = it7;
                java.lang.CharSequence charSequence3 = "callback";
                ((bd.f) entry.getValue()).f19205c = new java.util.ArrayList();
                com.tencent.mm.plugin.lite.LiteAppCenter.MethodInfo methodInfo = new com.tencent.mm.plugin.lite.LiteAppCenter.MethodInfo();
                methodInfo.methodType = 0;
                methodInfo.methodName = (java.lang.String) entry.getKey();
                java.lang.CharSequence charSequence4 = "byte";
                if (((bd.f) entry.getValue()).f19203a.getReturnType().getName().toLowerCase().contains("buffer")) {
                    methodInfo.isReturnBuffer = true;
                }
                java.lang.Class<?>[] parameterTypes = ((bd.f) entry.getValue()).f19203a.getParameterTypes();
                int length = parameterTypes.length;
                int i19 = 0;
                int i27 = 0;
                while (i19 < length) {
                    java.lang.Class<?>[] clsArr = parameterTypes;
                    java.lang.String lowerCase = parameterTypes[i19].getName().toLowerCase();
                    if (lowerCase.contains("string")) {
                        i17 = length;
                        methodInfo.paramTypes.add(4);
                    } else {
                        i17 = length;
                        if (lowerCase.contains("list")) {
                            methodInfo.paramTypes.add(4);
                        } else if (lowerCase.contains("map")) {
                            methodInfo.paramTypes.add(4);
                        } else if (lowerCase.contains("json")) {
                            methodInfo.paramTypes.add(4);
                        } else if (lowerCase.contains("short")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("int")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("long")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("float")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("double")) {
                            methodInfo.paramTypes.add(0);
                        } else {
                            if (lowerCase.contains(str7)) {
                                str6 = str7;
                                methodInfo.paramTypes.add(1);
                            } else {
                                str6 = str7;
                                if (lowerCase.contains("char")) {
                                    methodInfo.paramTypes.add(2);
                                } else {
                                    java.lang.CharSequence charSequence5 = charSequence4;
                                    if (lowerCase.contains(charSequence5)) {
                                        charSequence4 = charSequence5;
                                        methodInfo.paramTypes.add(5);
                                        ((java.util.ArrayList) ((bd.f) entry.getValue()).f19205c).add(java.lang.Integer.valueOf(i27));
                                    } else {
                                        charSequence4 = charSequence5;
                                        java.lang.CharSequence charSequence6 = charSequence3;
                                        if (lowerCase.contains(charSequence6)) {
                                            charSequence3 = charSequence6;
                                            methodInfo.paramTypes.add(6);
                                            ((java.util.ArrayList) ((bd.f) entry.getValue()).f19206d).add(java.lang.Integer.valueOf(i27));
                                        } else {
                                            charSequence3 = charSequence6;
                                        }
                                    }
                                }
                            }
                            i27++;
                            i19++;
                            length = i17;
                            parameterTypes = clsArr;
                            str7 = str6;
                        }
                    }
                    str6 = str7;
                    i27++;
                    i19++;
                    length = i17;
                    parameterTypes = clsArr;
                    str7 = str6;
                }
                methodInfo.returnTypes = iVar.b((bd.f) entry.getValue());
                moduleInfo.methods.put((java.lang.String) entry.getKey(), methodInfo);
                iVar2 = iVar;
                moduleInfo2 = moduleInfo;
                it6 = it;
                arrayList2 = arrayList;
                gVar2 = gVar;
                it7 = it8;
            }
            java.lang.CharSequence charSequence7 = "bool";
            java.lang.CharSequence charSequence8 = "callback";
            java.lang.CharSequence charSequence9 = "byte";
            com.tencent.mm.plugin.lite.LiteAppCenter.ModuleInfo moduleInfo3 = moduleInfo;
            bd.i iVar3 = iVar;
            java.util.Iterator it9 = ((java.util.HashMap) gVar.f19209b).entrySet().iterator();
            while (it9.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it9.next();
                java.util.Iterator it10 = it9;
                ((bd.f) entry2.getValue()).f19205c = new java.util.ArrayList();
                com.tencent.mm.plugin.lite.LiteAppCenter.MethodInfo methodInfo2 = new com.tencent.mm.plugin.lite.LiteAppCenter.MethodInfo();
                methodInfo2.methodType = 1;
                methodInfo2.methodName = (java.lang.String) entry2.getKey();
                if (((bd.f) entry2.getValue()).f19204b.booleanValue()) {
                    methodInfo2.isReturnBuffer = true;
                }
                java.lang.Class<?>[] parameterTypes2 = ((bd.f) entry2.getValue()).f19203a.getParameterTypes();
                com.tencent.mm.plugin.lite.LiteAppCenter.ModuleInfo moduleInfo4 = moduleInfo3;
                int length2 = parameterTypes2.length;
                bd.i iVar4 = iVar3;
                int i28 = 0;
                int i29 = 0;
                while (i28 < length2) {
                    int i37 = length2;
                    java.lang.String lowerCase2 = parameterTypes2[i28].getName().toLowerCase();
                    if (lowerCase2.contains(str3)) {
                        str4 = str3;
                        methodInfo2.paramTypes.add(4);
                    } else {
                        str4 = str3;
                        if (lowerCase2.contains("list")) {
                            methodInfo2.paramTypes.add(4);
                        } else if (lowerCase2.contains("map")) {
                            methodInfo2.paramTypes.add(4);
                        } else if (lowerCase2.contains("json")) {
                            methodInfo2.paramTypes.add(4);
                        } else if (lowerCase2.contains(str2)) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("int")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("long")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("float")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("double")) {
                            methodInfo2.paramTypes.add(0);
                        } else {
                            charSequence = charSequence7;
                            if (lowerCase2.contains(charSequence)) {
                                str5 = str2;
                                methodInfo2.paramTypes.add(1);
                            } else {
                                str5 = str2;
                                if (lowerCase2.contains("char")) {
                                    methodInfo2.paramTypes.add(2);
                                } else {
                                    java.lang.CharSequence charSequence10 = charSequence9;
                                    if (lowerCase2.contains(charSequence10)) {
                                        charSequence9 = charSequence10;
                                        methodInfo2.paramTypes.add(5);
                                        ((java.util.ArrayList) ((bd.f) entry2.getValue()).f19205c).add(java.lang.Integer.valueOf(i29));
                                        charSequence2 = charSequence8;
                                    } else {
                                        charSequence9 = charSequence10;
                                        java.lang.CharSequence charSequence11 = charSequence8;
                                        if (lowerCase2.contains(charSequence11)) {
                                            charSequence2 = charSequence11;
                                            methodInfo2.paramTypes.add(6);
                                            ((java.util.ArrayList) ((bd.f) entry2.getValue()).f19206d).add(java.lang.Integer.valueOf(i29));
                                            i29++;
                                            i28++;
                                            charSequence7 = charSequence;
                                            str3 = str4;
                                            length2 = i37;
                                            str2 = str5;
                                            charSequence8 = charSequence2;
                                        } else {
                                            charSequence2 = charSequence11;
                                        }
                                    }
                                    i29++;
                                    i28++;
                                    charSequence7 = charSequence;
                                    str3 = str4;
                                    length2 = i37;
                                    str2 = str5;
                                    charSequence8 = charSequence2;
                                }
                            }
                            charSequence2 = charSequence8;
                            i29++;
                            i28++;
                            charSequence7 = charSequence;
                            str3 = str4;
                            length2 = i37;
                            str2 = str5;
                            charSequence8 = charSequence2;
                        }
                    }
                    str5 = str2;
                    charSequence = charSequence7;
                    charSequence2 = charSequence8;
                    i29++;
                    i28++;
                    charSequence7 = charSequence;
                    str3 = str4;
                    length2 = i37;
                    str2 = str5;
                    charSequence8 = charSequence2;
                }
                iVar3 = iVar4;
                methodInfo2.returnTypes = iVar3.b((bd.f) entry2.getValue());
                moduleInfo4.methods.put((java.lang.String) entry2.getKey(), methodInfo2);
                moduleInfo3 = moduleInfo4;
                it9 = it10;
                str3 = str3;
                str2 = str2;
                charSequence8 = charSequence8;
            }
            arrayList.add(moduleInfo3);
            arrayList2 = arrayList;
            iVar2 = iVar3;
            it6 = it;
            i18 = 0;
        }
        return (com.tencent.mm.plugin.lite.LiteAppCenter.ModuleInfo[]) arrayList2.toArray(new com.tencent.mm.plugin.lite.LiteAppCenter.ModuleInfo[i18]);
    }

    public static java.util.List<com.tencent.liteapp.storage.WxaLiteAppInfo> getAllLiteAppInfo() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            getAllLiteAppInfo(arrayList);
        } catch (java.lang.Exception e17) {
            kd.c.b(TAG, e17.toString(), new java.lang.Object[0]);
        }
        return arrayList;
    }

    public static native void getAllLiteAppInfo(java.util.List<com.tencent.liteapp.storage.WxaLiteAppInfo> list);

    private static boolean getAppInfo(java.lang.String str, java.lang.String[] strArr) {
        java.lang.String[] appInfo;
        if (strArr == null || strArr.length != 2) {
            kd.c.b(TAG, "info invalid", new java.lang.Object[0]);
            return false;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback == null || (appInfo = iWxaLiteAppCallback.getAppInfo(str)) == null || appInfo.length != strArr.length) {
            return false;
        }
        strArr[0] = appInfo[0];
        strArr[1] = appInfo[1];
        return true;
    }

    private static long getAppMemory() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getAppMemory();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return 0L;
    }

    private static java.lang.String getAppRootPath() {
        if (!mAppRootPath.isEmpty()) {
            return mAppRootPath;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            java.lang.String liteAppRoot = iWxaLiteAppCallback.getLiteAppRoot();
            mAppRootPath = liteAppRoot;
            return liteAppRoot;
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = zc.c.f471339b;
        if (context == null) {
            kotlin.jvm.internal.o.o("appContext");
            throw null;
        }
        sb6.append(context.getFilesDir());
        sb6.append("/liteapp");
        return sb6.toString();
    }

    public static native boolean getAuthInfo(java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppAuthInfo wxaLiteAppAuthInfo);

    public static native java.lang.String getAuthUrl(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17);

    public static native java.lang.String getBaseLibBuildTypeByPath(java.lang.String str);

    public static native java.lang.String getBaseLibBuildTypeByString(java.lang.String str);

    public static native java.lang.String getBaseLibMajorVersion();

    public static native java.lang.String getBaseLibMajorVersionByPath(java.lang.String str);

    public static native java.lang.String getBaseLibVersionByPath(java.lang.String str);

    public static native java.lang.String getBaseLibVersionByString(java.lang.String str);

    public static native int getBaseLibVersionNumber(java.lang.String str);

    public static native boolean getBaselibInfo(java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo);

    private static java.lang.String getBatteryInfo() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getBatteryInfo();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    public static native byte[] getBuffer(java.lang.String str, long j17, int i17, boolean z17);

    public static native java.lang.String getCacheKeyByUrl(java.lang.String str, long j17, long j18, java.lang.String str2);

    public static native int getCheckVersionResult(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private static java.lang.String getClientVersion() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getClientVersion();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    public static native boolean getConfigInfo(java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppConfigInfo wxaLiteAppConfigInfo);

    private static float getCpu() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getCpu();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return 0.0f;
    }

    public static android.content.Context getCurrentContext(long j17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getContext(j17);
        }
        return null;
    }

    private static java.lang.String getDynamicLibraryPath(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getDynamicLibraryPath(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    private static java.lang.String getDynamicModuleType(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator it = ((java.util.ArrayList) bd.i.f19215e.a(str)).iterator();
        while (it.hasNext()) {
            bd.g gVar = (bd.g) it.next();
            if (gVar.f19211d.equals(str2)) {
                if (((java.util.HashMap) gVar.f19208a).containsKey(str3)) {
                    return "sync";
                }
                if (((java.util.HashMap) gVar.f19209b).containsKey(str3)) {
                    return "async";
                }
            }
        }
        return "";
    }

    private static java.lang.String getFilePathByLocalId(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getFilePathByLocalId(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    private static com.tencent.mm.plugin.lite.s getGlobalStore(java.lang.String str) {
        java.lang.Class<? extends com.tencent.mm.plugin.lite.s> cls;
        if (sCommStoreMap.containsKey(str)) {
            return sCommStoreMap.get(str);
        }
        if (!sCommClassStoreMap.containsKey(str) || (cls = sCommClassStoreMap.get(str)) == null) {
            return null;
        }
        try {
            com.tencent.mm.plugin.lite.s newInstance = cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (newInstance == null) {
                return null;
            }
            newInstance.f144168e = str;
            sCommStoreMap.put(str, newInstance);
            return newInstance;
        } catch (java.lang.Exception e17) {
            kd.c.b(TAG, "getGlobalStore fail :%s", e17.toString());
            return null;
        }
    }

    public static android.os.Handler getHandler() {
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        return handler;
    }

    private static void getImageInfo(java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback = new com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback(j17);
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.getImageInfo(str, str2, nativeCallback);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
            nativeCallback.onCallback("{}");
        }
    }

    public static native java.util.HashSet<java.lang.String> getInProcessAppIds();

    public static android.content.Context getJsApiContextForAppId(java.lang.String str) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (!mJsApiContext.containsKey(str) || (weakReference = mJsApiContext.get(str)) == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo getKeepAliveInfo(java.lang.String str, int i17) {
        java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo> concurrentLinkedQueue = keepAliveInfos.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedQueue == null) {
            return null;
        }
        java.util.Iterator<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo next = it.next();
            if (next.key.equals(str)) {
                return next;
            }
        }
        return null;
    }

    private static int getKeepAliveInfoCountLimit(int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getKeepAliveInfoCountLimit(i17);
        }
        return 1;
    }

    private static int getKeepAliveTimeSecondsLimit(int i17, int i18) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getKeepAliveTimeSecondsLimit(i17, i18) : i17;
    }

    public static java.lang.String getLastPath() {
        return lastPath;
    }

    public static native boolean getLatestBaselibInfo(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo);

    private static java.lang.String getLiteAppEngineModelConfig() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getLiteAppEngineModelConfig();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    private static com.tencent.liteapp.storage.WxaLiteAppInfo getLiteAppInfo(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getLiteAppInfo(str, str2);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return null;
    }

    public static native boolean getLiteAppInfo(java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo);

    public static native java.lang.String getLiteAppMinBaseLibMajorVersion(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static native java.lang.String getLiteAppMinLiteAppBaseLib(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private static java.lang.String getLiteAppModelConfig(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getLiteAppModelConfig(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    public static com.tencent.liteapp.gen.LiteAppReporter getLiteAppReporter(long j17) {
        return mReporters.get(java.lang.Long.valueOf(j17));
    }

    public static native java.lang.String getLiteAppVersion(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static native java.lang.String getLiteAppVersionType(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private static boolean getMulitExpt(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getMulitExpt(str, z17);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return z17;
    }

    private static void getNetworkInfo(final java.lang.String str, final long j17, final long j18, final long j19, final boolean z17) {
        if (mCallback != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.4
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.String str2;
                    java.lang.String networkInfo = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.getNetworkInfo();
                    if (networkInfo != null) {
                        str2 = "[null, " + networkInfo + "]";
                    } else {
                        str2 = "[null, {}]";
                    }
                    com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(str, j17, j18, com.tencent.mm.plugin.lite.LiteAppCenter.kJsApiGetNetworkInfo, j19, str2, false, z17);
                }
            });
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
            jsApiCallback(str, j17, j18, kJsApiGetNetworkInfo, j19, "[new Error(\"callback is null\"), undefined]", false, z17);
        }
    }

    private static java.lang.String getOfflineResource(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getOfflineResource(str, str2, str3);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    public static com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData getOpenExtraData(long j17) {
        if (j17 <= 0 || !mOpenExtraData.containsKey(java.lang.Long.valueOf(j17))) {
            return null;
        }
        return mOpenExtraData.get(java.lang.Long.valueOf(j17));
    }

    private static java.lang.String getOpenOption(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getOpenOption(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    public static native java.lang.String getPathByLiteAppLocalId(long j17, java.lang.String str, java.lang.String str2);

    private static java.lang.String getRecentForward(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getRecentForward(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    private static java.lang.String getRecentForwardTitle(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getRecentForwardTitle(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    public static native java.lang.String[] getResourcePath(java.lang.String str, long j17, long j18, int[] iArr);

    public static native boolean getSamplingConfigInfo(java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo wxaLiteAppSamplingConfigInfo);

    private static java.lang.String getScheduleWakeUpInfo(java.lang.String str) {
        kd.c.c(TAG, "getScheduleWakeUpInfo appId: %s", str);
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getScheduleWakeUpInfo(str) : "{}";
    }

    public static native int getSdkMaxBaseLibVersionNumber();

    public static native int getSdkMaxVersionNumber();

    public static native java.lang.String getSdkMinBaseLibVersion();

    public static native int getSdkMinBaseLibVersionNumber();

    public static native java.lang.String getSdkVersion();

    public static native int getSdkVersionNumber();

    private static java.lang.String getSystemInfo(long j17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback = mUICallback.get(java.lang.Long.valueOf(j17));
        if (lVUICallback != null) {
            return lVUICallback.getSystemInfo(-1).toJsonString();
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getSystemInfo(-1).toJsonString();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    private static java.lang.String getTaskState(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getTaskState(str, j17, str2, str3, str4);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    private static java.lang.String getTaskSwitch() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getTaskSwitch();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    public static com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback getUICallback(long j17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback = mUICallback.get(java.lang.Long.valueOf(j17));
        if (lVUICallback != null) {
            return lVUICallback.callback;
        }
        kd.c.b(TAG, "getUICallback null, appUuid: %d", java.lang.Long.valueOf(j17));
        return null;
    }

    private static java.lang.String getUin() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getUin();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    private static java.lang.String getUserAgent() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getUserAgent();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    private static java.lang.String getUserAlbums(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getUserAlbums(str, str2);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    private static void getVideoInfo(java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback = new com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback(j17);
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.getVideoInfo(str, str2, nativeCallback);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
            nativeCallback.onCallback("{}");
        }
    }

    public static com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppViewportMetrics getViewportMetrics(android.content.Context context) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getLiteAppViewportMetrics(context);
        }
        return null;
    }

    private static java.lang.String getVolume() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getVolume();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    private static java.lang.String getWebviewLocalIdByPath(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getWebviewLocalIdByPath(str, str2);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    private static boolean hasCutOut(long j17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            return uICallback.hasCutOut();
        }
        return false;
    }

    public static boolean hasKeepAlive(java.lang.String str, boolean z17) {
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo>>> it = keepAliveInfos.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo> it6 = it.next().getValue().iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo next = it6.next();
                if (next != null && next.key.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void hideKeyboard(long j17) {
        final com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            getHandler().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.5
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback.this.hideKeyboard();
                }
            });
        }
    }

    public static boolean initLib() {
        boolean[] zArr = sInitLib;
        synchronized (zArr) {
            if (!zArr[0]) {
                try {
                    loadLibrary("liteapphelper");
                    loadLibrary("mmv8");
                    loadLibrary("flutter");
                    loadLibrary("wechatlv");
                    loadLibrary("owl");
                    initWechatLv();
                    setPlatformInfo();
                    zArr[0] = true;
                } catch (java.lang.UnsatisfiedLinkError e17) {
                    kd.c.b(TAG, "initLib fail. %s", e17.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public static native void initWechatLv();

    private static native void innerShowView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, long j17, boolean z17, java.lang.String str8, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.Object obj, int i18, java.lang.String str9, java.lang.String str10);

    public static native boolean insertOrReplaceAuthInfo(com.tencent.liteapp.storage.WxaLiteAppAuthInfo wxaLiteAppAuthInfo);

    public static native boolean insertOrReplaceBaselibInfo(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo);

    public static native boolean insertOrReplaceConfigInfo(com.tencent.liteapp.storage.WxaLiteAppConfigInfo wxaLiteAppConfigInfo);

    public static native boolean insertOrReplaceLiteAppInfo(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo);

    public static native boolean insertOrReplaceSamplingConfigInfo(com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo wxaLiteAppSamplingConfigInfo);

    private static void invokeJsApi(final com.tencent.mm.plugin.lite.LiteAppCenter.JsApi jsApi) {
        kd.c.c(TAG, "invokeJsApi:%s", jsApi.toString());
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.mm.plugin.lite.LiteAppCenter.JsApi jsApi2 = com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this;
                    java.lang.String str = jsApi2.appId;
                    if (str == null) {
                        kd.c.b(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "invalid api", new java.lang.Object[0]);
                        return;
                    }
                    if (jsApi2.method != null && jsApi2.param != null) {
                        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
                        jd.b bVar = null;
                        java.util.List<java.lang.String> permissionBlackList = iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getPermissionBlackList(str) : null;
                        if (permissionBlackList != null && permissionBlackList.contains(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.method)) {
                            com.tencent.mm.plugin.lite.LiteAppCenter.JsApi jsApi3 = com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this;
                            long j17 = jsApi3.callbackId;
                            if (j17 > 0) {
                                com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(jsApi3.appId, jsApi3.appUuid, jsApi3.pageId, jsApi3.method, j17, "{\"result\": false, \"errMsg\": \"permission api\", \"data\": {}}", false, jsApi3.isFromView);
                                return;
                            }
                            return;
                        }
                        java.lang.Class cls = com.tencent.mm.plugin.lite.LiteAppCenter.sAppLevelApi.containsKey(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.appId) ? (java.lang.Class) ((java.util.Map) com.tencent.mm.plugin.lite.LiteAppCenter.sAppLevelApi.get(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.appId)).get(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.method) : null;
                        if (cls == null) {
                            cls = (java.lang.Class) com.tencent.mm.plugin.lite.LiteAppCenter.sCommApi.get(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.method);
                        }
                        if (cls != null) {
                            bVar = (jd.b) cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                        } else if (com.tencent.mm.plugin.lite.LiteAppCenter.sWxaLiteAppJsApiMap.containsKey(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.method)) {
                            bVar = (jd.b) com.tencent.mm.plugin.lite.LiteAppCenter.sWxaLiteAppJsApiMap.get(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.method);
                        }
                        if (bVar == null) {
                            kd.c.b(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "not found api ", new java.lang.Object[0]);
                            com.tencent.mm.plugin.lite.LiteAppCenter.JsApi jsApi4 = com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this;
                            long j18 = jsApi4.callbackId;
                            if (j18 > 0) {
                                com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(jsApi4.appId, jsApi4.appUuid, jsApi4.pageId, jsApi4.method, j18, "{\"result\": false, \"errMsg\":\"not found\" ,\"data\": {}}", false, jsApi4.isFromView);
                                return;
                            }
                            return;
                        }
                        int andIncrement = com.tencent.mm.plugin.lite.LiteAppCenter.jsapiLocalId.getAndIncrement();
                        com.tencent.mm.plugin.lite.LiteAppCenter.JsApi jsApi5 = com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this;
                        java.lang.String str2 = jsApi5.method;
                        bVar.f299023d = str2;
                        jd.c cVar = new jd.c(jsApi5.appUuid, jsApi5.appId, jsApi5.pageId, str2, jsApi5.callbackId, andIncrement, jsApi5.isFromView);
                        cVar.f299031h = (com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo) com.tencent.mm.plugin.lite.LiteAppCenter.pageInfos.get(java.lang.Long.valueOf(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.pageId));
                        ((com.tencent.mm.plugin.lite.api.p) bVar).f143442e = cVar;
                        if (com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.callbackId > 0) {
                            com.tencent.mm.plugin.lite.LiteAppCenter.executingJsapiMap.put(java.lang.Integer.valueOf(andIncrement), bVar);
                        }
                        bVar.b(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.appId, new org.json.JSONObject(com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.param), com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this.isFromView);
                        return;
                    }
                    kd.c.b(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "invalid api ", new java.lang.Object[0]);
                    com.tencent.mm.plugin.lite.LiteAppCenter.JsApi jsApi6 = com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this;
                    long j19 = jsApi6.callbackId;
                    if (j19 > 0) {
                        com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(jsApi6.appId, jsApi6.appUuid, jsApi6.pageId, jsApi6.method, j19, "{\"result\": false, \"errMsg\": \"invalid api\", \"data\": {}}", false, jsApi6.isFromView);
                    }
                } catch (java.lang.Exception e17) {
                    kd.c.b(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "invokeJsApi :%s", e17.toString());
                    com.tencent.mm.plugin.lite.LiteAppCenter.JsApi jsApi7 = com.tencent.mm.plugin.lite.LiteAppCenter.JsApi.this;
                    long j27 = jsApi7.callbackId;
                    if (j27 > 0) {
                        com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(jsApi7.appId, jsApi7.appUuid, jsApi7.pageId, jsApi7.method, j27, "{\"result\": false, \"errMsg\":\"exception\", \"data\": {}}", false, jsApi7.isFromView);
                    }
                }
            }
        });
    }

    public static boolean isCurrentDarkMode() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.isDarkMode() : es.u.e();
    }

    public static boolean isJson(java.lang.String str) {
        if (str != null && str.length() != 0) {
            try {
                new org.json.JSONObject(str);
                return true;
            } catch (org.json.JSONException unused) {
            }
        }
        return false;
    }

    public static native void jsApiCallback(java.lang.String str, long j17, long j18, java.lang.String str2, long j19, java.lang.String str3, boolean z17, boolean z18);

    public static boolean keepAlive(final java.lang.String str, int i17, long j17, java.lang.String str2, int i18, java.lang.Runnable runnable, final int i19) {
        com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo keepAliveInfo = getKeepAliveInfo(str, i19);
        kd.c.c(TAG, "keepAlive seconds=%d %s", java.lang.Integer.valueOf(i18), str);
        if (i18 == 0) {
            if (keepAliveInfo != null) {
                getHandler().removeCallbacks(keepAliveInfo.runnable);
                keepAliveInfo.releaseRunnable.run();
                kd.c.c(TAG, "Removing key:%s keepAliveInfo from group:%d", str, java.lang.Integer.valueOf(i19));
                removeKeepAliveInfo(str, i19);
            }
            return false;
        }
        kd.c.c(TAG, "keepAlive start %s, timeout:%d appUuid:%d engineId:%d sessionId:%s", str, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str2);
        if (keepAliveInfo != null) {
            if (keepAliveInfo.engineId == i17) {
                kd.c.b(TAG, "ignore keepAlive", new java.lang.Object[0]);
                return true;
            }
            kd.c.b(TAG, "release keepAlive because leak %s", str);
            getHandler().removeCallbacks(keepAliveInfo.runnable);
            keepAliveInfo.releaseRunnable.run();
            removeKeepAliveInfo(str, i19);
        }
        final com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo keepAliveInfo2 = new com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo();
        keepAliveInfo2.key = str;
        keepAliveInfo2.engineId = i17;
        keepAliveInfo2.appUuid = j17;
        keepAliveInfo2.sessionId = str2;
        keepAliveInfo2.releaseRunnable = runnable;
        keepAliveInfo2.runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo keepAliveInfo3 = com.tencent.mm.plugin.lite.LiteAppCenter.getKeepAliveInfo(str, i19);
                com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo keepAliveInfo4 = keepAliveInfo2;
                if (keepAliveInfo4 != keepAliveInfo3) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(keepAliveInfo3 == null ? 0 : 1);
                    kd.c.b(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "ignore release keepAlive %d", objArr);
                } else {
                    kd.c.c(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "release keepAlive because timeout %s", keepAliveInfo4.key);
                    keepAliveInfo2.releaseRunnable.run();
                    com.tencent.mm.plugin.lite.LiteAppCenter.removeKeepAliveInfo(str, i19);
                }
            }
        };
        addKeepAliveInfo(keepAliveInfo2, i19);
        getHandler().postDelayed(keepAliveInfo2.runnable, getKeepAliveTimeSecondsLimit(i18, i19) * 1000);
        return true;
    }

    public static com.tencent.liteapp.report.WxaLiteAppStartReport liteAppWidgetGetStartReport(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getLiteAppWidgetStartReporter(str);
        }
        return null;
    }

    private static boolean loadBaseLibByMajorVersion(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo liteAppBaselibInfo;
        java.lang.String liteAppMinBaseLibMajorVersion = getLiteAppMinBaseLibMajorVersion(str, str2, str3);
        if ((liteAppMinBaseLibMajorVersion.isEmpty() || liteAppMinBaseLibMajorVersion.equals(getBaseLibMajorVersion())) && !lastPath.isEmpty()) {
            return true;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback == null || (liteAppBaselibInfo = iWxaLiteAppCallback.getLiteAppBaselibInfo(liteAppMinBaseLibMajorVersion)) == null) {
            return false;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo hostInfo = new com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo();
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback2 = mCallback;
        if (iWxaLiteAppCallback2 != null) {
            hostInfo = iWxaLiteAppCallback2.getHostInfo();
        }
        java.lang.String str4 = liteAppBaselibInfo.path;
        lastPath = str4;
        return setPath(str4, hostInfo, FRAMEWORK_TYPE_BASE) == 0;
    }

    private static void loadLibrary(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.loadLibrary(str);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/LiteAppCenter", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/lite/LiteAppCenter", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native void nativeCallback(long j17, java.lang.Object obj);

    public static void navigateBack(long j17, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback == null) {
            kd.c.b(TAG, "navigateBack failed appUuid=" + j17, new java.lang.Object[0]);
        } else {
            kd.c.c(TAG, "navigateBack appUuid=" + j17, new java.lang.Object[0]);
            uICallback.navigateBack(z17);
        }
    }

    public static native void notifyLiteAppPkgUpdate(java.lang.String str, java.lang.String str2);

    public static native void onBackground(java.lang.String str, long j17);

    private static void onBodySizeChange(long j17, java.lang.String str, long j18, float f17, float f18) {
        kd.c.c(TAG, "onBodySizeChange appId: %s size=%f %f", str, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback = mUICallback.get(java.lang.Long.valueOf(j17));
        if (lVUICallback != null) {
            lVUICallback.onBodySizeChange(str, j17, j18, f17, f18);
        }
    }

    private static void onCheckBaseLibSumFail(long j17, java.lang.String str, java.util.List<java.lang.String> list) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.onCheckBaseLibSumFail(str, list);
            return;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onCheckBaseLibSumFail(str, list);
        }
    }

    private static void onCheckLiteAppVersionError(long j17, int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.onCheckLiteAppVersionError(i17);
        }
    }

    private static void onCheckSumFail(long j17, java.lang.String str, java.util.List<java.lang.String> list) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.onCheckSumFail(str, list);
            return;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onCheckSumFail(str, list);
        }
    }

    private static void onClearCurrentHandOff(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onClearCurrentHandOff(str);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    private static void onCreateLitePageViewFinish(final long j17, long j18, final com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo, final long j19) {
        kd.c.c(TAG, "onCreateLitePageViewFinish appUuid: " + j17 + ", preloadAppUuid: " + j19, new java.lang.Object[0]);
        getHandler().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.7
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback;
                com.tencent.mm.plugin.lite.LiteAppCenter.pageInfos.put(java.lang.Long.valueOf(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo.this.pageId), com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo.this);
                long unused = com.tencent.mm.plugin.lite.LiteAppCenter.pageId = com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo.this.pageId;
                long j27 = j19;
                if (j27 != 0 && j27 != j17 && (lVUICallback = com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.get(java.lang.Long.valueOf(j27))) != null && lVUICallback.isPreload) {
                    com.tencent.mm.plugin.lite.LiteAppCenter.unsetUICallback(j19, lVUICallback);
                }
                com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback2 = com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.get(java.lang.Long.valueOf(j17));
                if (lVUICallback2 != null) {
                    lVUICallback2.callback.onCreateLitePageViewFinish(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo.this);
                    if (!com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo.this.isPreload || lVUICallback2.getStore() == null) {
                        return;
                    }
                    com.tencent.mm.plugin.lite.s store = lVUICallback2.getStore();
                    java.util.HashMap hashMap = store.f144165b;
                    int size = hashMap.size();
                    java.lang.String[] strArr = new java.lang.String[size];
                    java.lang.String[] strArr2 = new java.lang.String[size];
                    int i17 = 0;
                    for (java.util.Map.Entry entry : hashMap.entrySet()) {
                        strArr[i17] = (java.lang.String) entry.getKey();
                        strArr2[i17] = (java.lang.String) entry.getValue();
                        i17++;
                    }
                    com.tencent.mm.plugin.lite.LiteAppCenter.storeSetData(store.f144166c, store.f144168e, strArr, strArr2);
                }
            }
        });
    }

    private static void onDebugEventTriggered(java.lang.String str) {
        com.tencent.mm.plugin.lite.e eVar = mDebugCallback;
        if (eVar != null) {
            qa3.o oVar = (qa3.o) eVar;
            if (str != null) {
                oVar.d(str);
            } else {
                oVar.getClass();
            }
        }
    }

    public static native void onForeground(java.lang.String str, long j17);

    private static void onInitJsRuntime(java.lang.String str, long j17, long j18, long j19, long j27) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onInitJsRuntime(str, j17, j18, j19, j27);
        }
    }

    private static void onLayoutComplete(java.lang.String str, long j17, long j18, float f17, float f18) {
        kd.c.c(TAG, "onLayoutComplete appId: %s size=%f %f", str, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback = mUICallback.get(java.lang.Long.valueOf(j17));
        if (lVUICallback != null) {
            lVUICallback.onLayoutComplete(str, j17, j18, f17, f18);
        }
    }

    public static native void onNativeRecorderFrameData(long j17, byte[] bArr, boolean z17);

    private static void onOpenCurrentPageOnPC(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onOpenCurrentPageOnPC(str);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    private static void onPreReleaseLiteApp(java.lang.String str, long j17, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onPreReleaseLiteApp(str, j17, str2, z17);
        }
    }

    private static void onPreloadLitePageViewFailed(final java.lang.String str, final java.lang.String str2) {
        kd.c.b(TAG, "onPreloadLitePageViewFailed appId: " + str + ", page: " + str2, new java.lang.Object[0]);
        getHandler().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.9
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
                if (iWxaLiteAppCallback != null) {
                    iWxaLiteAppCallback.onPreloadLitePageViewFailed(str, str2);
                }
            }
        });
    }

    private static void onPreloadLitePageViewFinish(final long j17, final java.lang.String str, final long j18) {
        kd.c.c(TAG, "onPreloadLitePageViewFinish appUuid: " + j17 + ", realAppUuid: " + j18, new java.lang.Object[0]);
        getHandler().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.8
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
                if (iWxaLiteAppCallback != null) {
                    iWxaLiteAppCallback.onPreloadLitePageViewFinish(j17, str, j18);
                }
                long j19 = j17;
                if (j19 == 0) {
                    return;
                }
                if (j18 != j19) {
                    if (com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.containsKey(java.lang.Long.valueOf(j19))) {
                        if (com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.get(java.lang.Long.valueOf(j17)).isPreload) {
                            kd.c.c(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "remove appUuid: " + j17, new java.lang.Object[0]);
                            com.tencent.mm.plugin.lite.LiteAppCenter.setUICallback(j18, com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.get(java.lang.Long.valueOf(j17)));
                            com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.remove(java.lang.Long.valueOf(j17));
                        }
                    } else if (com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.containsKey(java.lang.Long.valueOf(j18)) && com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.get(java.lang.Long.valueOf(j18)).isPreload) {
                        kd.c.c(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "remove realAppUuid: " + j18, new java.lang.Object[0]);
                        com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.remove(java.lang.Long.valueOf(j18));
                    }
                    j19 = j18;
                }
                com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback = com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.get(java.lang.Long.valueOf(j19));
                if (lVUICallback != null) {
                    lVUICallback.onPreloadLitePageViewFinish(j17, str, j18);
                }
            }
        });
    }

    public static native void onRecvDebugMsg(java.lang.String str);

    private static void onReleaseLiteApp(java.lang.String str, long j17, int i17) {
    }

    private static void onSetCurrentHandOff(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onSetCurrentHandOff(str);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    private static void onShowPageTimeStamp(long j17, long j18, long j19, com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo pageShowInfo) {
        kd.c.c(TAG, "onShowPageTimeStamp appUuid:%s, codeCacheSwitch:%s, codeCacheResult:%s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(pageShowInfo.codeCacheSwitch), java.lang.Integer.valueOf(pageShowInfo.codeCacheResult));
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.onShowPageTimeStamp(j19, pageShowInfo);
        }
    }

    private static void onShowStatusChange(java.lang.String str, java.lang.String str2, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onShowStatusChange(str, str2, j17, j18, z17);
        }
    }

    private static boolean onStoreDispatch(java.lang.String str, long j17, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        com.tencent.mm.plugin.lite.s store;
        if (str4 == null || str4.length() <= 0) {
            store = mUICallback.containsKey(java.lang.Long.valueOf(j18)) ? mUICallback.get(java.lang.Long.valueOf(j18)).getStore() : null;
        } else {
            store = getGlobalStore(str4);
            if (store != null) {
                store.f144166c = j18;
            }
        }
        com.tencent.mm.plugin.lite.s sVar = store;
        if (sVar == null || sVar.f144167d == null) {
            return false;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.q(sVar, j17, i17, str2, str3));
        return true;
    }

    private static void onStoreSendResult(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onStoreSendResult(str, i17, str2, com.tencent.mm.plugin.lite.s.a(str3));
        }
    }

    private static void onStoreSetData(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (mCallback != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            int length = strArr.length;
            if (length < strArr2.length) {
                length = strArr2.length;
            }
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(strArr[i17], com.tencent.mm.plugin.lite.s.a(strArr2[i17]));
            }
            mCallback.onStoreSetData(str, hashMap);
        }
    }

    private static java.lang.String onStoreSyncCall(java.lang.String str, long j17, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.lite.s store;
        java.lang.String str5;
        if (str4 == null || str4.length() <= 0) {
            store = mUICallback.containsKey(java.lang.Long.valueOf(j18)) ? mUICallback.get(java.lang.Long.valueOf(j18)).getStore() : null;
        } else {
            store = getGlobalStore(str4);
            if (store != null) {
                store.f144166c = j18;
            }
        }
        return (store == null || (str5 = (java.lang.String) store.f144165b.get(str3)) == null) ? "" : str5;
    }

    public static native void onSystemInfoChange(java.lang.String str);

    private static void onUpdateCurrentHandOff(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onUpdateCurrentHandOff(str);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    private static void openPage(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.openPage(str, str2, str3, str4);
        }
    }

    public static native void postJsThreadTask(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.RunnableTask runnableTask);

    public static native void preloadView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, long j17);

    private static native void preloadViewBaseLib(int i17, java.lang.String str);

    public static native int prepareCppEngineId();

    private static void prepareTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.prepareTask(str, j17, str2, str3, str4);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    public static native void publishEventToNode(long j17, long j18, int i17, java.lang.String str, java.lang.String str2);

    public static void publishEventToNode(long j17, long j18, int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        publishEventToNode(j17, j18, i17, str, jSONObject == null ? "{}" : jSONObject.toString());
    }

    public static native void publishEventToTopPage(long j17, int i17, java.lang.String str, java.lang.String str2);

    public static void publishEventToTopPage(long j17, int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        publishEventToTopPage(j17, i17, str, jSONObject == null ? "{}" : jSONObject.toString());
    }

    public static void publishEventToTopPageForLiteAppWidget(int i17, int i18, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetPublishEventToTopPage(i17, i18, str, map);
        }
    }

    public static native void publishGlobalEvent(long j17, long j18, java.lang.String str, java.lang.String str2);

    public static void publishGlobalEvent(long j17, long j18, java.lang.String str, org.json.JSONObject jSONObject) {
        publishGlobalEvent(j17, j18, str, jSONObject == null ? "{}" : jSONObject.toString());
    }

    public static void publishGlobalEventForLiteAppWidget(int i17, int i18, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetPublishGlobalEvent(i17, i18, str, map);
        }
    }

    public static native void publishGlobalEventToAll(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static void publishGlobalEventToAllByAppIdForLiteAppWidget(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetPublishGlobalEventToAllByAppId(str, str2, map);
        }
    }

    public static void publishGlobalEventToAllForLiteAppWidget(java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetPublishGlobalEventToAll(str, map);
        }
    }

    public static native void publishGlobalEventToTopPage(long j17, java.lang.String str, java.lang.String str2);

    public static void publishGlobalEventToTopPage(long j17, java.lang.String str, org.json.JSONObject jSONObject) {
        publishGlobalEventToTopPage(j17, str, jSONObject == null ? "{}" : jSONObject.toString());
    }

    public static void publishGlobalEventToTopPageForLiteAppWidget(int i17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetPublishGlobalEventToTopPage(i17, str, map);
        }
    }

    public static native com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo queryPreloadAppInfo(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig readPageConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String _getPageConfig = _getPageConfig(str, str2, str3, str4);
        com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig pageConfig = new com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig();
        if (_getPageConfig != null && !_getPageConfig.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(_getPageConfig);
                pageConfig.backgroundColor = jSONObject.optInt("bgColor");
                pageConfig.darkBackgroundColor = jSONObject.optInt("darkBgColor");
                pageConfig.titleBackgroundColor = jSONObject.optInt("titleBgColor");
                pageConfig.darkTitleBackgroundColor = jSONObject.optInt("darkTitleBgColor");
                pageConfig.pageOrientation = jSONObject.optInt("pageOrientation");
                pageConfig.viewport = jSONObject.optInt("viewport", 0);
                pageConfig.backgroundImage = jSONObject.optJSONObject("bgImage");
                pageConfig.globalPkgAppId = jSONObject.optString("globalPkgAppId");
                pageConfig.globalPkgMinVersion = jSONObject.optString("globalPkgMinVersion");
            } catch (org.json.JSONException unused) {
            }
        }
        return pageConfig;
    }

    public static void registerAudioBroadCaseReceiver(final android.content.Context context) {
        if (mVolumeBroadcastReceiver != null) {
            return;
        }
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.10
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
                    int streamVolume = ((android.media.AudioManager) context.getSystemService("audio")).getStreamVolume(3);
                    if (java.lang.Math.abs(com.tencent.mm.plugin.lite.LiteAppCenter.mLastVolume - streamVolume) >= 1) {
                        com.tencent.mm.plugin.lite.LiteAppCenter.updateVolume(streamVolume / r4.getStreamMaxVolume(3));
                    }
                    int unused = com.tencent.mm.plugin.lite.LiteAppCenter.mLastVolume = streamVolume;
                }
            }
        };
        mVolumeBroadcastReceiver = broadcastReceiver;
        try {
            context.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        } catch (java.lang.Exception e17) {
            kd.c.b(TAG, e17.toString(), new java.lang.Object[0]);
        }
    }

    public static void registerModule(java.lang.String str, java.lang.Class<? extends bd.d> cls) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) bd.i.f19215e.f19217b;
        if (concurrentHashMap.containsKey(str)) {
            kd.c.c("WxaLiteApp.WxaLiteAppModuleMgr", "module: %s has been registered", str);
        } else {
            concurrentHashMap.put(str, new bd.g(str, cls));
        }
    }

    public static void releaseKeepAlive(java.lang.String str, long j17) {
        kd.c.c(TAG, "releaseKeepAlive appId:%s, appUuid:%d", str, java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.releaseKeepAlive();
        } else {
            releaseKeepAlive(str);
        }
    }

    private static void releasePage(long j17, long j18) {
        pageInfos.remove(java.lang.Long.valueOf(j18));
    }

    public static native void releasePreloadView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17);

    public static native void releaseStore(java.lang.String str);

    public static void releaseStoreForLiteAppWidget(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetReleaseStore(str);
        }
    }

    private static void reloadDebug(long j17, java.lang.String str, int i17, java.lang.String str2) {
        kd.c.c(TAG, "[liteDebug] reloadDebug, appId=" + str + ";appUuid=" + j17 + ";pageCount=" + i17 + "; qrcodeDebugQueryString=" + str2, new java.lang.Object[0]);
        for (int i18 = 0; i18 < i17; i18++) {
            navigateBack(j17, true);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.reloadDebug(str, str2);
        }
    }

    private static void removeForwardUser(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.removeForwardUser(str);
        }
    }

    public static void removeGlobalStore(java.lang.String str) {
        sCommClassStoreMap.remove(str);
        sCommStoreMap.remove(str);
    }

    public static void removeJsApiContextForAppId(java.lang.String str) {
        mJsApiContext.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removeKeepAliveInfo(java.lang.String str, int i17) {
        java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo> concurrentLinkedQueue = keepAliveInfos.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedQueue == null) {
            return;
        }
        java.util.Iterator<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo> it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo next = it.next();
            if (next.key.equals(str)) {
                concurrentLinkedQueue.remove(next);
                break;
            }
        }
        if (concurrentLinkedQueue.isEmpty()) {
            keepAliveInfos.remove(java.lang.Integer.valueOf(i17));
        }
    }

    private static void removeTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.removeTask(str, j17, str2, str3, str4);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    public static native void reopen(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String[] strArr, java.lang.String[] strArr2);

    private static void reportIdKey(long j17, long j18, long j19) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.reportIdKey(j17, j18, j19);
        }
    }

    private static void reportKv(int i17, java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.reportKv(i17, str);
        }
    }

    public static native void setAuthInfo(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, boolean z17);

    public static native void setAutoSize(long j17, boolean z17, boolean z18, boolean z19);

    public static native int setBuffer(java.lang.String str, long j17, byte[] bArr, boolean z17);

    public static native void setCookie(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17);

    private static native void setDarkMode(boolean z17);

    public static void setDebugCallback(com.tencent.mm.plugin.lite.e eVar) {
        mDebugCallback = eVar;
    }

    public static native void setDeveloperFlag(boolean z17);

    public static native void setDisplayParams(long j17, float f17, float f18, float f19, float f27, int i17, float f28, float f29, float f37, float f38);

    private static void setDragToClose(long j17, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.setDragToClose(z17);
        }
    }

    private static void setFlags(long j17, long j18, int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.setFlags(i17);
        }
    }

    private static native void setFontScale(float f17);

    private static void setForbidRightGestureEnable(long j17, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.setForbidRightGestureEnable(z17);
        }
    }

    public static native void setForceUseSyncCall(boolean z17);

    public static native void setIsHalfScreen(long j17, boolean z17);

    public static void setJsApiContextForAppId(android.content.Context context, java.lang.String str) {
        mJsApiContext.put(str, new java.lang.ref.WeakReference<>(context));
    }

    public static native void setLocale(java.lang.String str, java.lang.String str2);

    public static void setOpenExtraData(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData) {
        if (openExtraData == null) {
            kd.c.c(TAG, "romove mOpenExtraData uuid:%d", java.lang.Long.valueOf(j17));
            mOpenExtraData.remove(java.lang.Long.valueOf(j17));
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = openExtraData.query;
        com.tencent.mm.plugin.lite.s sVar = openExtraData.store;
        objArr[2] = sVar != null ? sVar.f144168e : "";
        objArr[3] = java.lang.Long.valueOf(sVar != null ? sVar.f144166c : -1L);
        kd.c.c(TAG, "setOpenExtraData uuid:%d query:%s store_appid:%s store_appuuid:%d", objArr);
        mOpenExtraData.put(java.lang.Long.valueOf(j17), openExtraData);
    }

    private static void setOpenOption(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.setOpenOption(str, str2);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    private static void setPageInfo(long j17, long j18, com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        pageInfos.put(java.lang.Long.valueOf(j18), pageInfo);
    }

    private static void setPageOrientation(long j17, long j18, int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.setPageOrientation(i17);
        }
    }

    public static native int setPath(java.lang.String str, com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo hostInfo, java.lang.String str2);

    public static void setPath(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = lastPath;
        if (str3 != null && str != null && str3.equals(str)) {
            kd.c.c(TAG, "baselib path has set, ignore! path: %s", str);
            return;
        }
        lastPath = str;
        com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo hostInfo = new com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo();
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            hostInfo = iWxaLiteAppCallback.getHostInfo();
        }
        setPath(str, hostInfo, str2);
    }

    public static void setPlatformInfo() {
        com.tencent.mm.plugin.lite.LiteAppCenter.PlatformInfo platformInfo = new com.tencent.mm.plugin.lite.LiteAppCenter.PlatformInfo();
        platformInfo.userAgent = getUserAgent();
        platformInfo.rootPath = getAppRootPath();
        platformInfo.clientVersion = getClientVersion();
        setPlatformInfo(platformInfo);
    }

    public static native void setPlatformInfo(com.tencent.mm.plugin.lite.LiteAppCenter.PlatformInfo platformInfo);

    public static native void setPlatformUIAlreadyRelease(long j17);

    public static void setReporter(long j17, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        if (liteAppReporter != null) {
            mReporters.put(java.lang.Long.valueOf(j17), liteAppReporter);
        }
    }

    public static native void setSafeAreaInsets(long j17, float f17, float f18, float f19, float f27, boolean z17);

    private static void setScheduleWakeUp(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        kd.c.c(TAG, "setScheduleWakeUp appId: %s, interval: %d, repeat: %d, actionName: %s, actionPayload: %s, forceDispatch: %s, aliveDuration: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str3, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.setScheduleWakeUp(str, i17, i18, str2, str3, z17, i19);
        }
    }

    private static void setStatusBarHidden(long j17, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback != null) {
            uICallback.setStatusBarHidden(z17);
        }
    }

    public static native void setSystemBarHeight(long j17, float f17, float f18, boolean z17);

    public static native void setTestServiceConfig(java.lang.String str);

    public static native void setTestServiceEnable(boolean z17);

    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData setUICallback(long r8, com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback r10) {
        /*
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$LVUICallback> r0 = com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.put(r1, r10)
            com.tencent.mm.plugin.lite.LiteAppCenter$ILiteAppUICallback r0 = r10.callback
            if (r0 == 0) goto La8
            long r0 = r0.getDataUuid()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r3 = com.tencent.mm.plugin.lite.LiteAppCenter.mOpenExtraData
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            boolean r3 = r3.containsKey(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r4 = com.tencent.mm.plugin.lite.LiteAppCenter.mOpenExtraData
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r3 = "WxaLiteApp.LiteAppCenter"
            java.lang.String r4 = "setUICallback dataUuid:%d containsKey:%b mOpenExtraData.size:%d"
            kd.c.c(r3, r4, r2)
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r2 = com.tencent.mm.plugin.lite.LiteAppCenter.mOpenExtraData
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L42:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r4 = r4.getValue()
            com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData r4 = (com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData) r4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Key: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = ", Value_query: "
            r6.append(r5)
            java.lang.String r4 = r4.query
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            kd.c.c(r3, r4, r5)
            goto L42
        L79:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto La8
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r2 = com.tencent.mm.plugin.lite.LiteAppCenter.mOpenExtraData
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto La8
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r2 = com.tencent.mm.plugin.lite.LiteAppCenter.mOpenExtraData
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData r2 = (com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData) r2
            com.tencent.mm.plugin.lite.s r3 = r2.store
            if (r3 == 0) goto L9e
            r10.setStore(r3)
        L9e:
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r3 = com.tencent.mm.plugin.lite.LiteAppCenter.mOpenExtraData
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.remove(r0)
            goto La9
        La8:
            r2 = 0
        La9:
            com.tencent.mm.plugin.lite.s r0 = r10.getStore()
            if (r0 == 0) goto Lb5
            com.tencent.mm.plugin.lite.s r0 = r10.getStore()
            r0.f144166c = r8
        Lb5:
            com.tencent.mm.plugin.lite.LiteAppCenter$IWxaLiteAppCallback r0 = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback
            if (r0 == 0) goto Lbc
            r0.onSetUICallback(r8, r10)
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.LiteAppCenter.setUICallback(long, com.tencent.mm.plugin.lite.LiteAppCenter$LVUICallback):com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData");
    }

    public static native void setWcWssLibPath(java.lang.String str);

    public static void setWxaLiteAppCallback(com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback) {
        mCallback = iWxaLiteAppCallback;
        kx5.n.h().f313323m = new kx5.l() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.2
            @Override // kx5.l
            public void dataReporting(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                com.tencent.mm.plugin.lite.LiteAppCenter.dataReporting(str, str2, str3);
            }
        };
    }

    private static void showPage(long j17, long j18, long j19) {
        com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo;
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = getUICallback(j17);
        if (uICallback == null || (pageInfo = pageInfos.get(java.lang.Long.valueOf(j19))) == null) {
            return;
        }
        uICallback.showPage(pageInfo);
    }

    public static void showView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, long j17, boolean z17, java.lang.String str8, java.lang.String[] strArr, java.lang.String[] strArr2, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, int i18, java.lang.String str9, java.lang.String str10) {
        innerShowView(str, str2, str3, str4, str5, str6, str7, i17, j17, z17, str8, strArr, strArr2, liteAppReporter, i18, str9, str10);
    }

    public static native boolean storeIsAlive(java.lang.String str);

    public static boolean storeIsAliveForLiteAppWidget(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.liteAppWidgetStoreIsAlive(str);
        }
        return false;
    }

    public static native void storeSendResult(long j17, long j18, int i17, java.lang.String str, java.lang.String str2);

    public static native void storeSetData(long j17, java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2);

    public static native int subscribeStore(java.lang.String str, java.lang.String[] strArr);

    public static void subscribeStoreForLiteAppWidget(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetSubscribeStore(str, list);
        }
    }

    public static native void triggerLiteAppEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2);

    public static void unRegisterAudioBroadCaseReceiver(android.content.Context context) {
        android.content.BroadcastReceiver broadcastReceiver = mVolumeBroadcastReceiver;
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
                mVolumeBroadcastReceiver = null;
            } catch (java.lang.Exception e17) {
                kd.c.b(TAG, e17.toString(), new java.lang.Object[0]);
            }
        }
    }

    public static native int unSubscribeStore(java.lang.String str, java.lang.String[] strArr);

    public static void unsetReporter(long j17) {
        if (mReporters.containsKey(java.lang.Long.valueOf(j17))) {
            mReporters.remove(java.lang.Long.valueOf(j17));
        }
    }

    public static void unsetUICallback(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback) {
        kd.c.c(TAG, "unsetUICallback appUuid: " + j17, new java.lang.Object[0]);
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onUnsetUICallback(j17, lVUICallback);
        }
        if (mUICallback.containsKey(java.lang.Long.valueOf(j17))) {
            setPlatformUIAlreadyRelease(j17);
            mUICallback.remove(java.lang.Long.valueOf(j17));
        }
    }

    public static void unsubscribeStoreForLiteAppWidget(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.liteAppWidgetUnsubscribeStore(str, list);
        }
    }

    public static void updateDarkMode(boolean z17) {
        setDarkMode(z17);
        onSystemInfoChange("{\"darkMode\": " + java.lang.String.valueOf(z17) + "}");
    }

    public static void updateDeviceOrientation(int i17) {
        onSystemInfoChange("{\"orientation\": " + java.lang.String.valueOf(i17) + "}");
    }

    public static void updateDisplayParam(android.content.Context context, long j17) {
        android.graphics.Point b17 = es.u.b(context);
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.Float valueOf = java.lang.Float.valueOf(displayMetrics.density);
        int e17 = md.n.e(context);
        int b18 = md.n.b(context, -1);
        float floatValue = 48 * valueOf.floatValue();
        setDisplayParams(j17, i17 / valueOf.floatValue(), i18 / valueOf.floatValue(), b17.x / valueOf.floatValue(), b17.y / valueOf.floatValue(), displayMetrics.densityDpi, valueOf.floatValue(), floatValue / valueOf.floatValue(), e17 / valueOf.floatValue(), b18 / valueOf.floatValue());
        kd.c.c(TAG, "updateLvCppDisplayParams appUuid=%d w=%d h=%d screen=%d,%d densityDpi=%d density=%f statusBarHeight:%d navigationBarHeight:%d actionBarHeight:%f", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), valueOf, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(b18), java.lang.Float.valueOf(floatValue));
    }

    public static native void updateEngineConfig(java.lang.String str);

    public static void updateFontScale(float f17) {
        setFontScale(f17);
        onSystemInfoChange("{\"fontScale\": " + java.lang.String.format("%.5f", java.lang.Float.valueOf(f17)) + "}");
    }

    public static native boolean updateLiteAppInfoLastUseTime(java.lang.String str, long j17);

    public static void updateRotationLocked(int i17) {
        onSystemInfoChange("{\"rotationLocked\": " + java.lang.String.valueOf(i17 == 0) + "}");
    }

    public static native void updateSize(long j17, float f17, float f18);

    private static void updateTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.updateTask(str, j17, str2, str3, str4);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    public static void updateVolume(float f17) {
        onSystemInfoChange("{\"volume\": " + java.lang.String.format("%.4f", java.lang.Float.valueOf(f17)) + "}");
    }

    public static com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo useKeepAlive(java.lang.String str, boolean z17, int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo keepAliveInfo = getKeepAliveInfo(str, i17);
        if (keepAliveInfo == null || !keepAliveInfo.key.equals(str)) {
            return null;
        }
        if (!z17) {
            kd.c.c(TAG, "reuse keepAlive %s, appUuid:%d", str, java.lang.Long.valueOf(keepAliveInfo.appUuid));
            getHandler().removeCallbacks(keepAliveInfo.runnable);
            removeKeepAliveInfo(str, i17);
            return keepAliveInfo;
        }
        kd.c.c(TAG, "release keepAlive because ignore %s", str);
        getHandler().removeCallbacks(keepAliveInfo.runnable);
        keepAliveInfo.releaseRunnable.run();
        removeKeepAliveInfo(str, i17);
        return null;
    }

    public static boolean versionGreater(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        int min = java.lang.Math.min(split.length, split2.length);
        for (int i17 = 0; i17 < min; i17++) {
            if (!split[i17].equals(split2[i17])) {
                if (split[i17].length() > split2[i17].length()) {
                    return true;
                }
                return split[i17].length() >= split2[i17].length() && split[i17].compareTo(split2[i17]) > 0;
            }
        }
        return false;
    }

    public static boolean versionGreaterEqual(java.lang.String str, java.lang.String str2) {
        return versionGreater(str, str2) || java.util.Objects.equals(str, str2);
    }

    public static native void willPopApp(java.lang.String str, long j17, boolean z17);

    public static void addGlobalStore(java.lang.String str, com.tencent.mm.plugin.lite.s sVar) {
        sVar.f144168e = str;
        sCommStoreMap.put(str, sVar);
    }

    public static void checkAndGetLiteAppPath(java.lang.String str, boolean z17, boolean z18, yz5.l lVar) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.checkLiteAppAndGetPath(str, z17, z18, lVar);
        } else {
            lVar.invoke("");
        }
    }

    private static void closeWindow(java.lang.String str, long j17, boolean z17) {
        closeWindow(j17, new android.content.Intent());
    }

    public static void addJsApi(java.util.Map<java.lang.String, java.lang.Class> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Class> entry : map.entrySet()) {
            if (jd.b.class.isAssignableFrom(entry.getValue())) {
                addJsApi(entry.getKey(), (java.lang.Class<? extends jd.b>) entry.getValue());
            } else {
                throw new java.lang.RuntimeException("api must be subclass of WxaLiteAppJsApi");
            }
        }
    }

    private static java.lang.String getMulitExpt(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getMulitExpt(str, str2);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return str2;
    }

    public static void releaseKeepAlive(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.String str4 = str + "_" + str2 + "_" + str3;
        com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo keepAliveInfo = getKeepAliveInfo(str4, i17);
        if (keepAliveInfo == null) {
            kd.c.e(TAG, "releaseKeepAlive get keepAliveInfo is null", new java.lang.Object[0]);
            return;
        }
        getHandler().removeCallbacks(keepAliveInfo.runnable);
        keepAliveInfo.releaseRunnable.run();
        removeKeepAliveInfo(str4, i17);
    }

    public static void registerModule(java.lang.String str, java.lang.String str2, java.lang.Class<? extends bd.d> cls) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) bd.i.f19215e.f19218c;
        java.util.Map map = (java.util.Map) concurrentHashMap.get(str);
        if (map == null) {
            map = new java.util.HashMap();
            concurrentHashMap.put(str, map);
        }
        if (map.containsKey(str2)) {
            kd.c.c("WxaLiteApp.WxaLiteAppModuleMgr", "module: %s has been registered", str2);
        } else {
            map.put(str2, new bd.g(str2, cls));
        }
    }

    public static void addJsApi(java.lang.String str, java.lang.String str2, java.lang.Class<? extends jd.b> cls) {
        java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>> map = sAppLevelApi.get(str);
        if (map == null) {
            map = new java.util.concurrent.ConcurrentHashMap<>();
            sAppLevelApi.put(str, map);
        }
        if (!map.containsKey(str2)) {
            map.put(str2, cls);
            return;
        }
        throw new java.lang.RuntimeException(str + ":" + str2 + " has been exists");
    }

    public static void setPath(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2) {
        lastPath = str;
        com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo hostInfo = new com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo();
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            hostInfo = iWxaLiteAppCallback.getHostInfo();
        }
        hostInfo.otherExtends = new java.util.HashMap();
        if (map != null && map.size() > 0) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                hostInfo.otherExtends.put(entry.getKey(), entry.getValue());
            }
        }
        setPath(str, hostInfo, str2);
    }

    public static void releaseKeepAlive(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.Integer, java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo>> entry : keepAliveInfos.entrySet()) {
            java.util.Iterator<com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo> it = entry.getValue().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo next = it.next();
                if (next != null && next.key.startsWith(str)) {
                    arrayList.add(new java.util.AbstractMap.SimpleEntry(entry.getKey(), next));
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
            kd.c.c(TAG, "release keepAlive %s appId:%s", ((com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo) entry2.getValue()).key, str);
            getHandler().removeCallbacks(((com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo) entry2.getValue()).runnable);
            ((com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo) entry2.getValue()).releaseRunnable.run();
            removeKeepAliveInfo(((com.tencent.mm.plugin.lite.LiteAppCenter.KeepAliveInfo) entry2.getValue()).key, ((java.lang.Integer) entry2.getKey()).intValue());
        }
    }

    public static void addJsApi(java.lang.String str, java.util.Map<java.lang.String, java.lang.Class> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Class> entry : map.entrySet()) {
            if (jd.b.class.isAssignableFrom(entry.getValue())) {
                addJsApi(str, entry.getKey(), entry.getValue());
            } else {
                throw new java.lang.RuntimeException(str + ":api must be subclass of WxaLiteAppJsApi");
            }
        }
    }

    public static void addJsApi(java.lang.String str, jd.b bVar) {
        sWxaLiteAppJsApiMap.put(str, bVar);
    }

    public static void addJsApi(java.util.HashMap<java.lang.String, jd.b> hashMap) {
        sWxaLiteAppJsApiMap.putAll(hashMap);
    }

    /* loaded from: classes15.dex */
    public static class PageInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo>() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo createFromParcel(android.os.Parcel parcel) {
                return new com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo[] newArray(int i17) {
                return new com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo[i17];
            }
        };
        public java.lang.String appId;
        public long appPtr;
        public long appUuid;
        public java.lang.String basePath;
        public int engineId;
        public int flags;
        public boolean isPreload;
        public long pageId;
        public int pageOrientation;
        public java.lang.String pageUrl;
        public long renderId;
        public java.lang.String sessionId;
        public int success;

        public PageInfo(int i17, long j17, int i18, long j18, long j19, long j27, java.lang.String str, java.lang.String str2, int i19, int i27, java.lang.String str3, java.lang.String str4, boolean z17) {
            try {
                kd.c.c(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, "PageInfo success: %d, appUuid: %d, appPtr: %d, pageId: %d, renderId: %d, basePath: %s, pageUrl: %s, flags: %d, pageOrientation: %d, appId: %s, sessionId: %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3, str4);
                this.success = i17;
                this.appUuid = j17;
                this.engineId = i18;
                this.appPtr = j18;
                this.pageId = j19;
                this.renderId = j27;
                this.basePath = str;
                this.pageUrl = str2;
                this.flags = i19;
                this.pageOrientation = i27;
                this.appId = str3;
                this.sessionId = str4;
                this.isPreload = z17;
            } catch (java.lang.Exception e17) {
                kd.c.b(com.tencent.mm.plugin.lite.LiteAppCenter.TAG, e17.toString(), new java.lang.Object[0]);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return "PageInfo{success=" + this.success + ", uuid=" + this.appUuid + ", engineId=" + this.engineId + ", appPtr=" + this.appPtr + ", pageId=" + this.pageId + ", renderId=" + this.renderId + ", basePath='" + this.basePath + "', pageUrl='" + this.pageUrl + "', flags=" + this.flags + ", pageOrientation=" + this.pageOrientation + ", appId=" + this.appId + ", sessionId=" + this.sessionId + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.success);
            parcel.writeLong(this.appUuid);
            parcel.writeInt(this.engineId);
            parcel.writeLong(this.appPtr);
            parcel.writeLong(this.pageId);
            parcel.writeLong(this.renderId);
            parcel.writeString(this.basePath);
            parcel.writeString(this.pageUrl);
            parcel.writeInt(this.flags);
            parcel.writeInt(this.pageOrientation);
            parcel.writeString(this.appId);
            parcel.writeString(this.sessionId);
        }

        public PageInfo(android.os.Parcel parcel) {
            this.success = parcel.readInt();
            this.appUuid = parcel.readLong();
            this.engineId = parcel.readInt();
            this.appPtr = parcel.readLong();
            this.pageId = parcel.readLong();
            this.renderId = parcel.readLong();
            this.basePath = parcel.readString();
            this.pageUrl = parcel.readString();
            this.flags = parcel.readInt();
            this.pageOrientation = parcel.readInt();
            this.appId = parcel.readString();
            this.sessionId = parcel.readString();
        }
    }
}
