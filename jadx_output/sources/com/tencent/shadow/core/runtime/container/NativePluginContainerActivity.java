package com.tencent.shadow.core.runtime.container;

/* loaded from: classes14.dex */
public class NativePluginContainerActivity extends com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity implements com.tencent.shadow.core.runtime.container.HostActivity, com.tencent.shadow.core.runtime.container.HostNativeActivityDelegator {
    private static final com.tencent.shadow.core.common.Logger logger = com.tencent.shadow.core.common.LoggerFactory.getLogger("WVA.NativePluginContainerActivity");
    private byte _hellAccFlag_;
    com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostActivityDelegate;
    private boolean isBeforeOnCreate = true;
    private android.content.res.Resources.Theme mHostTheme;

    /* JADX WARN: Multi-variable type inference failed */
    public NativePluginContainerActivity() {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate;
        com.tencent.shadow.core.runtime.container.DelegateProvider delegateProvider = com.tencent.shadow.core.runtime.container.DelegateProviderHolder.getDelegateProvider(getDelegateProviderKey());
        if (delegateProvider != 0) {
            hostNativeActivityDelegate = (com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate) delegateProvider.getHostActivityDelegate(getClass());
            hostNativeActivityDelegate.setDelegator(this);
        } else {
            logger.error("NativePluginContainerActivity: DelegateProviderHolder没有初始化");
            hostNativeActivityDelegate = null;
        }
        super.hostActivityDelegate = hostNativeActivityDelegate;
        this.hostActivityDelegate = hostNativeActivityDelegate;
    }

    private boolean isIllegalIntent(android.os.Bundle bundle) {
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null && bundle == null) {
            return true;
        }
        if (bundle == null) {
            bundle = extras;
        }
        try {
            java.lang.String string = bundle.getString(com.tencent.shadow.core.runtime.container.DelegateProvider.LOADER_VERSION_KEY);
            long j17 = bundle.getLong(com.tencent.shadow.core.runtime.container.DelegateProvider.PROCESS_ID_KEY);
            if ("1.6.0".equals(string)) {
                return j17 != com.tencent.shadow.core.runtime.container.DelegateProviderHolder.sCustomPid;
            }
            return true;
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superAddContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super._superAddContentView(view, layoutParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superApplyOverrideConfiguration(android.content.res.Configuration configuration) {
        super._superApplyOverrideConfiguration(configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superAttachBaseContext(android.content.Context context) {
        super._superAttachBaseContext(context);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superBindIsolatedService(android.content.Intent intent, int i17, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return super._superBindIsolatedService(intent, i17, str, executor, serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superBindService(android.content.Intent intent, int i17, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return super._superBindService(intent, i17, executor, serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superBindServiceAsUser(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, android.os.UserHandle userHandle) {
        return super._superBindServiceAsUser(intent, serviceConnection, i17, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superCheckCallingOrSelfPermission(java.lang.String str) {
        return super._superCheckCallingOrSelfPermission(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superCheckCallingOrSelfUriPermission(android.net.Uri uri, int i17) {
        return super._superCheckCallingOrSelfUriPermission(uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int[] _superCheckCallingOrSelfUriPermissions(java.util.List list, int i17) {
        return super._superCheckCallingOrSelfUriPermissions(list, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superCheckCallingPermission(java.lang.String str) {
        return super._superCheckCallingPermission(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superCheckCallingUriPermission(android.net.Uri uri, int i17) {
        return super._superCheckCallingUriPermission(uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int[] _superCheckCallingUriPermissions(java.util.List list, int i17) {
        return super._superCheckCallingUriPermissions(list, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superCheckPermission(java.lang.String str, int i17, int i18) {
        return super._superCheckPermission(str, i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superCheckSelfPermission(java.lang.String str) {
        return super._superCheckSelfPermission(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superCheckUriPermission(android.net.Uri uri, int i17, int i18, int i19) {
        return super._superCheckUriPermission(uri, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int[] _superCheckUriPermissions(java.util.List list, int i17, int i18, int i19) {
        return super._superCheckUriPermissions(list, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superClearOverrideActivityTransition(int i17) {
        super._superClearOverrideActivityTransition(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superClearWallpaper() {
        super._superClearWallpaper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superCloseContextMenu() {
        super._superCloseContextMenu();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superCloseOptionsMenu() {
        super._superCloseOptionsMenu();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateAttributionContext(java.lang.String str) {
        return super._superCreateAttributionContext(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateConfigurationContext(android.content.res.Configuration configuration) {
        return super._superCreateConfigurationContext(configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateContext(android.content.ContextParams contextParams) {
        return super._superCreateContext(contextParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateContextForSplit(java.lang.String str) {
        return super._superCreateContextForSplit(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateDeviceContext(int i17) {
        return super._superCreateDeviceContext(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateDeviceProtectedStorageContext() {
        return super._superCreateDeviceProtectedStorageContext();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateDisplayContext(android.view.Display display) {
        return super._superCreateDisplayContext(display);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreatePackageContext(java.lang.String str, int i17) {
        return super._superCreatePackageContext(str, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.PendingIntent _superCreatePendingResult(int i17, android.content.Intent intent, int i18) {
        return super._superCreatePendingResult(i17, intent, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateWindowContext(int i17, android.os.Bundle bundle) {
        return super._superCreateWindowContext(i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String[] _superDatabaseList() {
        return super._superDatabaseList();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDeleteDatabase(java.lang.String str) {
        return super._superDeleteDatabase(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDeleteFile(java.lang.String str) {
        return super._superDeleteFile(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDeleteSharedPreferences(java.lang.String str) {
        return super._superDeleteSharedPreferences(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superDismissDialog(int i17) {
        super._superDismissDialog(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superDismissKeyboardShortcutsHelper() {
        super._superDismissKeyboardShortcutsHelper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return super._superDispatchGenericMotionEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super._superDispatchKeyEvent(keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return super._superDispatchKeyShortcutEvent(keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return super._superDispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super._superDispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superDispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return super._superDispatchTrackballEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superDump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super._superDump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superEnforceCallingOrSelfPermission(java.lang.String str, java.lang.String str2) {
        super._superEnforceCallingOrSelfPermission(str, str2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superEnforceCallingOrSelfUriPermission(android.net.Uri uri, int i17, java.lang.String str) {
        super._superEnforceCallingOrSelfUriPermission(uri, i17, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superEnforceCallingPermission(java.lang.String str, java.lang.String str2) {
        super._superEnforceCallingPermission(str, str2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superEnforceCallingUriPermission(android.net.Uri uri, int i17, java.lang.String str) {
        super._superEnforceCallingUriPermission(uri, i17, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superEnforcePermission(java.lang.String str, int i17, int i18, java.lang.String str2) {
        super._superEnforcePermission(str, i17, i18, str2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superEnforceUriPermission(android.net.Uri uri, int i17, int i18, int i19, java.lang.String str) {
        super._superEnforceUriPermission(uri, i17, i18, i19, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superEnterPictureInPictureMode() {
        super._superEnterPictureInPictureMode();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String[] _superFileList() {
        return super._superFileList();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.View _superFindViewById(int i17) {
        return super._superFindViewById(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superFinish() {
        super._superFinish();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superFinishActivity(int i17) {
        super._superFinishActivity(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superFinishActivityFromChild(android.app.Activity activity, int i17) {
        super._superFinishActivityFromChild(activity, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superFinishAffinity() {
        super._superFinishAffinity();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superFinishAfterTransition() {
        super._superFinishAfterTransition();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superFinishAndRemoveTask() {
        super._superFinishAndRemoveTask();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superFinishFromChild(android.app.Activity activity) {
        super._superFinishFromChild(activity);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.ActionBar _superGetActionBar() {
        return super._superGetActionBar();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.Application _superGetApplication() {
        return super._superGetApplication();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superGetApplicationContext() {
        return super._superGetApplicationContext();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.pm.ApplicationInfo _superGetApplicationInfo() {
        return super._superGetApplicationInfo();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.res.AssetManager _superGetAssets() {
        return super._superGetAssets();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.AttributionSource _superGetAttributionSource() {
        return super._superGetAttributionSource();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetAttributionTag() {
        return super._superGetAttributionTag();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superGetBaseContext() {
        return super._superGetBaseContext();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetCacheDir() {
        return super._superGetCacheDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.ComponentName _superGetCallingActivity() {
        return super._superGetCallingActivity();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetCallingPackage() {
        return super._superGetCallingPackage();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetChangingConfigurations() {
        return super._superGetChangingConfigurations();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.ClassLoader _superGetClassLoader() {
        return super._superGetClassLoader();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetCodeCacheDir() {
        return super._superGetCodeCacheDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.ComponentName _superGetComponentName() {
        return super._superGetComponentName();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.ContentResolver _superGetContentResolver() {
        return super._superGetContentResolver();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.transition.Scene _superGetContentScene() {
        return super._superGetContentScene();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.transition.TransitionManager _superGetContentTransitionManager() {
        return super._superGetContentTransitionManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.View _superGetCurrentFocus() {
        return super._superGetCurrentFocus();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetDataDir() {
        return super._superGetDataDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetDatabasePath(java.lang.String str) {
        return super._superGetDatabasePath(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetDeviceId() {
        return super._superGetDeviceId();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetDir(java.lang.String str, int i17) {
        return super._superGetDir(str, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.Display _superGetDisplay() {
        return super._superGetDisplay();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetExternalCacheDir() {
        return super._superGetExternalCacheDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File[] _superGetExternalCacheDirs() {
        return super._superGetExternalCacheDirs();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetExternalFilesDir(java.lang.String str) {
        return super._superGetExternalFilesDir(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File[] _superGetExternalFilesDirs(java.lang.String str) {
        return super._superGetExternalFilesDirs(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File[] _superGetExternalMediaDirs() {
        return super._superGetExternalMediaDirs();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetFileStreamPath(java.lang.String str) {
        return super._superGetFileStreamPath(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetFilesDir() {
        return super._superGetFilesDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.FragmentManager _superGetFragmentManager() {
        return super._superGetFragmentManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Intent _superGetIntent() {
        return super._superGetIntent();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.Object _superGetLastNonConfigurationInstance() {
        return super._superGetLastNonConfigurationInstance();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetLaunchedFromPackage() {
        return super._superGetLaunchedFromPackage();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetLaunchedFromUid() {
        return super._superGetLaunchedFromUid();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.LayoutInflater _superGetLayoutInflater() {
        return super._superGetLayoutInflater();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.LoaderManager _superGetLoaderManager() {
        return super._superGetLoaderManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetLocalClassName() {
        return super._superGetLocalClassName();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.util.concurrent.Executor _superGetMainExecutor() {
        return super._superGetMainExecutor();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.os.Looper _superGetMainLooper() {
        return super._superGetMainLooper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetMaxNumPictureInPictureActions() {
        return super._superGetMaxNumPictureInPictureActions();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.media.session.MediaController _superGetMediaController() {
        return super._superGetMediaController();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.MenuInflater _superGetMenuInflater() {
        return super._superGetMenuInflater();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetNoBackupFilesDir() {
        return super._superGetNoBackupFilesDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File _superGetObbDir() {
        return super._superGetObbDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.File[] _superGetObbDirs() {
        return super._superGetObbDirs();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher _superGetOnBackInvokedDispatcher() {
        return super._superGetOnBackInvokedDispatcher();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetOpPackageName() {
        return super._superGetOpPackageName();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetPackageCodePath() {
        return super._superGetPackageCodePath();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.pm.PackageManager _superGetPackageManager() {
        return super._superGetPackageManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetPackageName() {
        return super._superGetPackageName();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetPackageResourcePath() {
        return super._superGetPackageResourcePath();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.ContextParams _superGetParams() {
        return super._superGetParams();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.Activity _superGetParent() {
        return super._superGetParent();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Intent _superGetParentActivityIntent() {
        return super._superGetParentActivityIntent();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.SharedPreferences _superGetPreferences(int i17) {
        return super._superGetPreferences(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.net.Uri _superGetReferrer() {
        return super._superGetReferrer();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetRequestedOrientation() {
        return super._superGetRequestedOrientation();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.res.Resources _superGetResources() {
        return super._superGetResources();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.SearchEvent _superGetSearchEvent() {
        return super._superGetSearchEvent();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.SharedPreferences _superGetSharedPreferences(java.lang.String str, int i17) {
        return super._superGetSharedPreferences(str, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.window.SplashScreen _superGetSplashScreen() {
        return super._superGetSplashScreen();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.Object _superGetSystemService(java.lang.String str) {
        return super._superGetSystemService(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.String _superGetSystemServiceName(java.lang.Class cls) {
        return super._superGetSystemServiceName(cls);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetTaskId() {
        return super._superGetTaskId();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.res.Resources.Theme _superGetTheme() {
        return super._superGetTheme();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.CharSequence _superGetTitle() {
        return super._superGetTitle();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetTitleColor() {
        return super._superGetTitleColor();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.VoiceInteractor _superGetVoiceInteractor() {
        return super._superGetVoiceInteractor();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetVolumeControlStream() {
        return super._superGetVolumeControlStream();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable _superGetWallpaper() {
        return super._superGetWallpaper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetWallpaperDesiredMinimumHeight() {
        return super._superGetWallpaperDesiredMinimumHeight();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superGetWallpaperDesiredMinimumWidth() {
        return super._superGetWallpaperDesiredMinimumWidth();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.Window _superGetWindow() {
        return super._superGetWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.WindowManager _superGetWindowManager() {
        return super._superGetWindowManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superGrantUriPermission(java.lang.String str, android.net.Uri uri, int i17) {
        super._superGrantUriPermission(str, uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superHasWindowFocus() {
        return super._superHasWindowFocus();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superInvalidateOptionsMenu() {
        super._superInvalidateOptionsMenu();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsActivityTransitionRunning() {
        return super._superIsActivityTransitionRunning();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsChangingConfigurations() {
        return super._superIsChangingConfigurations();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsChild() {
        return super._superIsChild();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsDestroyed() {
        return super._superIsDestroyed();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsDeviceProtectedStorage() {
        return super._superIsDeviceProtectedStorage();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsFinishing() {
        return super._superIsFinishing();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsImmersive() {
        return super._superIsImmersive();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsInMultiWindowMode() {
        return super._superIsInMultiWindowMode();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsInPictureInPictureMode() {
        return super._superIsInPictureInPictureMode();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsLaunchedFromBubble() {
        return super._superIsLaunchedFromBubble();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsLocalVoiceInteractionSupported() {
        return super._superIsLocalVoiceInteractionSupported();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsRestricted() {
        return super._superIsRestricted();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsTaskRoot() {
        return super._superIsTaskRoot();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsUiContext() {
        return super._superIsUiContext();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsVoiceInteraction() {
        return super._superIsVoiceInteraction();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superIsVoiceInteractionRoot() {
        return super._superIsVoiceInteractionRoot();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.database.Cursor _superManagedQuery(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return super._superManagedQuery(uri, strArr, str, strArr2, str2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superMoveDatabaseFrom(android.content.Context context, java.lang.String str) {
        return super._superMoveDatabaseFrom(context, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superMoveSharedPreferencesFrom(android.content.Context context, java.lang.String str) {
        return super._superMoveSharedPreferencesFrom(context, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superMoveTaskToBack(boolean z17) {
        return super._superMoveTaskToBack(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superNavigateUpTo(android.content.Intent intent) {
        return super._superNavigateUpTo(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superNavigateUpToFromChild(android.app.Activity activity, android.content.Intent intent) {
        return super._superNavigateUpToFromChild(activity, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnActionModeFinished(android.view.ActionMode actionMode) {
        super._superOnActionModeFinished(actionMode);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnActionModeStarted(android.view.ActionMode actionMode) {
        super._superOnActionModeStarted(actionMode);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnActivityReenter(int i17, android.content.Intent intent) {
        super._superOnActivityReenter(i17, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnActivityResult(int i17, int i18, android.content.Intent intent) {
        super._superOnActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnApplyThemeResource(android.content.res.Resources.Theme theme, int i17, boolean z17) {
        super._superOnApplyThemeResource(theme, i17, z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnAttachFragment(android.app.Fragment fragment) {
        super._superOnAttachFragment(fragment);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnAttachedToWindow() {
        super._superOnAttachedToWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnBackPressed() {
        super._superOnBackPressed();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnChildTitleChanged(android.app.Activity activity, java.lang.CharSequence charSequence) {
        super._superOnChildTitleChanged(activity, charSequence);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnConfigurationChanged(android.content.res.Configuration configuration) {
        super._superOnConfigurationChanged(configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnContentChanged() {
        super._superOnContentChanged();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnContextItemSelected(android.view.MenuItem menuItem) {
        return super._superOnContextItemSelected(menuItem);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnContextMenuClosed(android.view.Menu menu) {
        super._superOnContextMenuClosed(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super._superOnCreate(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super._superOnCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.CharSequence _superOnCreateDescription() {
        return super._superOnCreateDescription();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.Dialog _superOnCreateDialog(int i17) {
        return super._superOnCreateDialog(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnCreateNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder) {
        super._superOnCreateNavigateUpTaskStack(taskStackBuilder);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnCreateOptionsMenu(android.view.Menu menu) {
        return super._superOnCreateOptionsMenu(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnCreatePanelMenu(int i17, android.view.Menu menu) {
        return super._superOnCreatePanelMenu(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.View _superOnCreatePanelView(int i17) {
        return super._superOnCreatePanelView(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnCreateThumbnail(android.graphics.Bitmap bitmap, android.graphics.Canvas canvas) {
        return super._superOnCreateThumbnail(bitmap, canvas);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.View _superOnCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return super._superOnCreateView(view, str, context, attributeSet);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnDestroy() {
        super._superOnDestroy();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnDetachedFromWindow() {
        super._superOnDetachedFromWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnEnterAnimationComplete() {
        super._superOnEnterAnimationComplete();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return super._superOnGenericMotionEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnGetDirectActions(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        super._superOnGetDirectActions(cancellationSignal, consumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super._superOnKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnKeyLongPress(int i17, android.view.KeyEvent keyEvent) {
        return super._superOnKeyLongPress(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        return super._superOnKeyMultiple(i17, i18, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnKeyShortcut(int i17, android.view.KeyEvent keyEvent) {
        return super._superOnKeyShortcut(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnKeyUp(int i17, android.view.KeyEvent keyEvent) {
        return super._superOnKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnLocalVoiceInteractionStarted() {
        super._superOnLocalVoiceInteractionStarted();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnLocalVoiceInteractionStopped() {
        super._superOnLocalVoiceInteractionStopped();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnLowMemory() {
        super._superOnLowMemory();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnMenuOpened(int i17, android.view.Menu menu) {
        return super._superOnMenuOpened(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnMultiWindowModeChanged(boolean z17) {
        super._superOnMultiWindowModeChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnNavigateUp() {
        return super._superOnNavigateUp();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnNavigateUpFromChild(android.app.Activity activity) {
        return super._superOnNavigateUpFromChild(activity);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnNewIntent(android.content.Intent intent) {
        super._superOnNewIntent(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnOptionsItemSelected(android.view.MenuItem menuItem) {
        return super._superOnOptionsItemSelected(menuItem);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnOptionsMenuClosed(android.view.Menu menu) {
        super._superOnOptionsMenuClosed(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPanelClosed(int i17, android.view.Menu menu) {
        super._superOnPanelClosed(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPause() {
        super._superOnPause();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPerformDirectAction(java.lang.String str, android.os.Bundle bundle, android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        super._superOnPerformDirectAction(str, bundle, cancellationSignal, consumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPictureInPictureModeChanged(boolean z17) {
        super._superOnPictureInPictureModeChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnPictureInPictureRequested() {
        return super._superOnPictureInPictureRequested();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState) {
        super._superOnPictureInPictureUiStateChanged(pictureInPictureUiState);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPointerCaptureChanged(boolean z17) {
        super._superOnPointerCaptureChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPostCreate(android.os.Bundle bundle) {
        super._superOnPostCreate(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPostResume() {
        super._superOnPostResume();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPrepareDialog(int i17, android.app.Dialog dialog) {
        super._superOnPrepareDialog(i17, dialog);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPrepareNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder) {
        super._superOnPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnPrepareOptionsMenu(android.view.Menu menu) {
        return super._superOnPrepareOptionsMenu(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        return super._superOnPreparePanel(i17, view, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnProvideAssistContent(android.app.assist.AssistContent assistContent) {
        super._superOnProvideAssistContent(assistContent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnProvideAssistData(android.os.Bundle bundle) {
        super._superOnProvideAssistData(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i17) {
        super._superOnProvideKeyboardShortcuts(list, menu, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.net.Uri _superOnProvideReferrer() {
        return super._superOnProvideReferrer();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super._superOnRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnRestart() {
        super._superOnRestart();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnRestoreInstanceState(android.os.Bundle bundle) {
        super._superOnRestoreInstanceState(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnResume() {
        super._superOnResume();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnSaveInstanceState(android.os.Bundle bundle) {
        super._superOnSaveInstanceState(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnSearchRequested() {
        return super._superOnSearchRequested();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnStart() {
        super._superOnStart();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnStateNotSaved() {
        super._superOnStateNotSaved();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnStop() {
        super._superOnStop();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnTitleChanged(java.lang.CharSequence charSequence, int i17) {
        super._superOnTitleChanged(charSequence, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnTopResumedActivityChanged(boolean z17) {
        super._superOnTopResumedActivityChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnTouchEvent(android.view.MotionEvent motionEvent) {
        return super._superOnTouchEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnTrackballEvent(android.view.MotionEvent motionEvent) {
        return super._superOnTrackballEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnTrimMemory(int i17) {
        super._superOnTrimMemory(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnUserInteraction() {
        super._superOnUserInteraction();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnUserLeaveHint() {
        super._superOnUserLeaveHint();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnVisibleBehindCanceled() {
        super._superOnVisibleBehindCanceled();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        super._superOnWindowAttributesChanged(layoutParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnWindowFocusChanged(boolean z17) {
        super._superOnWindowFocusChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.ActionMode _superOnWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return super._superOnWindowStartingActionMode(callback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOpenContextMenu(android.view.View view) {
        super._superOpenContextMenu(view);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.FileInputStream _superOpenFileInput(java.lang.String str) {
        return super._superOpenFileInput(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.io.FileOutputStream _superOpenFileOutput(java.lang.String str, int i17) {
        return super._superOpenFileOutput(str, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOpenOptionsMenu() {
        super._superOpenOptionsMenu();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.database.sqlite.SQLiteDatabase _superOpenOrCreateDatabase(java.lang.String str, int i17, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory) {
        return super._superOpenOrCreateDatabase(str, i17, cursorFactory);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOverrideActivityTransition(int i17, int i18, int i19) {
        super._superOverrideActivityTransition(i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOverridePendingTransition(int i17, int i18) {
        super._superOverridePendingTransition(i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable _superPeekWallpaper() {
        return super._superPeekWallpaper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superPostponeEnterTransition() {
        super._superPostponeEnterTransition();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRecreate() {
        super._superRecreate();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRegisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        super._superRegisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRegisterComponentCallbacks(android.content.ComponentCallbacks componentCallbacks) {
        super._superRegisterComponentCallbacks(componentCallbacks);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRegisterDeviceIdChangeListener(java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer) {
        super._superRegisterDeviceIdChangeListener(executor, intConsumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRegisterForContextMenu(android.view.View view) {
        super._superRegisterForContextMenu(view);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return super._superRegisterReceiver(broadcastReceiver, intentFilter);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRegisterScreenCaptureCallback(java.util.concurrent.Executor executor, android.app.Activity.ScreenCaptureCallback screenCaptureCallback) {
        super._superRegisterScreenCaptureCallback(executor, screenCaptureCallback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superReleaseInstance() {
        return super._superReleaseInstance();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRemoveDialog(int i17) {
        super._superRemoveDialog(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRemoveStickyBroadcast(android.content.Intent intent) {
        super._superRemoveStickyBroadcast(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRemoveStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle) {
        super._superRemoveStickyBroadcastAsUser(intent, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superReportFullyDrawn() {
        super._superReportFullyDrawn();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.DragAndDropPermissions _superRequestDragAndDropPermissions(android.view.DragEvent dragEvent) {
        return super._superRequestDragAndDropPermissions(dragEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRequestFullscreenMode(int i17, android.os.OutcomeReceiver outcomeReceiver) {
        super._superRequestFullscreenMode(i17, outcomeReceiver);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRequestPermissions(java.lang.String[] strArr, int i17) {
        super._superRequestPermissions(strArr, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRequestShowKeyboardShortcuts() {
        super._superRequestShowKeyboardShortcuts();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superRequestVisibleBehind(boolean z17) {
        return super._superRequestVisibleBehind(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superRequestWindowFeature(int i17) {
        return super._superRequestWindowFeature(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.View _superRequireViewById(int i17) {
        return super._superRequireViewById(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRevokeSelfPermissionOnKill(java.lang.String str) {
        super._superRevokeSelfPermissionOnKill(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRevokeSelfPermissionsOnKill(java.util.Collection collection) {
        super._superRevokeSelfPermissionsOnKill(collection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRevokeUriPermission(android.net.Uri uri, int i17) {
        super._superRevokeUriPermission(uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRunOnUiThread(java.lang.Runnable runnable) {
        super._superRunOnUiThread(runnable);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendBroadcast(android.content.Intent intent) {
        super._superSendBroadcast(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle) {
        super._superSendBroadcastAsUser(intent, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendBroadcastWithMultiplePermissions(android.content.Intent intent, java.lang.String[] strArr) {
        super._superSendBroadcastWithMultiplePermissions(intent, strArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendOrderedBroadcast(android.content.Intent intent, int i17, java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, java.lang.String str3, android.os.Bundle bundle, android.os.Bundle bundle2) {
        super._superSendOrderedBroadcast(intent, i17, str, str2, broadcastReceiver, handler, str3, bundle, bundle2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, java.lang.String str, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle) {
        super._superSendOrderedBroadcastAsUser(intent, userHandle, str, broadcastReceiver, handler, i17, str2, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendStickyBroadcast(android.content.Intent intent) {
        super._superSendStickyBroadcast(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle) {
        super._superSendStickyBroadcastAsUser(intent, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendStickyOrderedBroadcast(android.content.Intent intent, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str, android.os.Bundle bundle) {
        super._superSendStickyOrderedBroadcast(intent, broadcastReceiver, handler, i17, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendStickyOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str, android.os.Bundle bundle) {
        super._superSendStickyOrderedBroadcastAsUser(intent, userHandle, broadcastReceiver, handler, i17, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetActionBar(android.widget.Toolbar toolbar) {
        super._superSetActionBar(toolbar);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetContentTransitionManager(android.transition.TransitionManager transitionManager) {
        super._superSetContentTransitionManager(transitionManager);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetContentView(int i17) {
        super._superSetContentView(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetDefaultKeyMode(int i17) {
        super._superSetDefaultKeyMode(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetEnterSharedElementCallback(android.app.SharedElementCallback sharedElementCallback) {
        super._superSetEnterSharedElementCallback(sharedElementCallback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetExitSharedElementCallback(android.app.SharedElementCallback sharedElementCallback) {
        super._superSetExitSharedElementCallback(sharedElementCallback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetFeatureDrawable(int i17, android.graphics.drawable.Drawable drawable) {
        super._superSetFeatureDrawable(i17, drawable);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetFeatureDrawableAlpha(int i17, int i18) {
        super._superSetFeatureDrawableAlpha(i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetFeatureDrawableResource(int i17, int i18) {
        super._superSetFeatureDrawableResource(i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetFeatureDrawableUri(int i17, android.net.Uri uri) {
        super._superSetFeatureDrawableUri(i17, uri);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetFinishOnTouchOutside(boolean z17) {
        super._superSetFinishOnTouchOutside(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetImmersive(boolean z17) {
        super._superSetImmersive(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetInheritShowWhenLocked(boolean z17) {
        super._superSetInheritShowWhenLocked(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetIntent(android.content.Intent intent) {
        super._superSetIntent(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetLocusContext(android.content.LocusId locusId, android.os.Bundle bundle) {
        super._superSetLocusContext(locusId, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetMediaController(android.media.session.MediaController mediaController) {
        super._superSetMediaController(mediaController);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetPictureInPictureParams(android.app.PictureInPictureParams pictureInPictureParams) {
        super._superSetPictureInPictureParams(pictureInPictureParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetProgress(int i17) {
        super._superSetProgress(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetProgressBarIndeterminate(boolean z17) {
        super._superSetProgressBarIndeterminate(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetProgressBarIndeterminateVisibility(boolean z17) {
        super._superSetProgressBarIndeterminateVisibility(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetProgressBarVisibility(boolean z17) {
        super._superSetProgressBarVisibility(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetRecentsScreenshotEnabled(boolean z17) {
        super._superSetRecentsScreenshotEnabled(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetRequestedOrientation(int i17) {
        super._superSetRequestedOrientation(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetResult(int i17) {
        super._superSetResult(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetSecondaryProgress(int i17) {
        super._superSetSecondaryProgress(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetShouldDockBigOverlays(boolean z17) {
        super._superSetShouldDockBigOverlays(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetShowWhenLocked(boolean z17) {
        super._superSetShowWhenLocked(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetTaskDescription(android.app.ActivityManager.TaskDescription taskDescription) {
        super._superSetTaskDescription(taskDescription);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetTheme(int i17) {
        super._superSetTheme(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetTitle(int i17) {
        super._superSetTitle(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetTitleColor(int i17) {
        super._superSetTitleColor(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superSetTranslucent(boolean z17) {
        return super._superSetTranslucent(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetTurnScreenOn(boolean z17) {
        super._superSetTurnScreenOn(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetVisible(boolean z17) {
        super._superSetVisible(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetVolumeControlStream(int i17) {
        super._superSetVolumeControlStream(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetVrModeEnabled(boolean z17, android.content.ComponentName componentName) {
        super._superSetVrModeEnabled(z17, componentName);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetWallpaper(android.graphics.Bitmap bitmap) {
        super._superSetWallpaper(bitmap);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superShouldDockBigOverlays() {
        return super._superShouldDockBigOverlays();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superShouldShowRequestPermissionRationale(java.lang.String str) {
        return super._superShouldShowRequestPermissionRationale(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superShouldUpRecreateTask(android.content.Intent intent) {
        return super._superShouldUpRecreateTask(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superShowAssist(android.os.Bundle bundle) {
        return super._superShowAssist(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superShowDialog(int i17) {
        super._superShowDialog(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superShowLockTaskEscapeMessage() {
        super._superShowLockTaskEscapeMessage();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.ActionMode _superStartActionMode(android.view.ActionMode.Callback callback) {
        return super._superStartActionMode(callback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivities(android.content.Intent[] intentArr) {
        super._superStartActivities(intentArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivity(android.content.Intent intent) {
        super._superStartActivity(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivityForResult(android.content.Intent intent, int i17) {
        super._superStartActivityForResult(intent, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivityFromChild(android.app.Activity activity, android.content.Intent intent, int i17) {
        super._superStartActivityFromChild(activity, intent, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17) {
        super._superStartActivityFromFragment(fragment, intent, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superStartActivityIfNeeded(android.content.Intent intent, int i17) {
        return super._superStartActivityIfNeeded(intent, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.ComponentName _superStartForegroundService(android.content.Intent intent) {
        return super._superStartForegroundService(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superStartInstrumentation(android.content.ComponentName componentName, java.lang.String str, android.os.Bundle bundle) {
        return super._superStartInstrumentation(componentName, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartIntentSender(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18, int i19) {
        super._superStartIntentSender(intentSender, intent, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27) {
        super._superStartIntentSenderForResult(intentSender, i17, intent, i18, i19, i27);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartIntentSenderFromChild(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27) {
        super._superStartIntentSenderFromChild(activity, intentSender, i17, intent, i18, i19, i27);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartLocalVoiceInteraction(android.os.Bundle bundle) {
        super._superStartLocalVoiceInteraction(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartLockTask() {
        super._superStartLockTask();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartManagingCursor(android.database.Cursor cursor) {
        super._superStartManagingCursor(cursor);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superStartNextMatchingActivity(android.content.Intent intent) {
        return super._superStartNextMatchingActivity(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartPostponedEnterTransition() {
        super._superStartPostponedEnterTransition();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartSearch(java.lang.String str, boolean z17, android.os.Bundle bundle, boolean z18) {
        super._superStartSearch(str, z17, bundle, z18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.ComponentName _superStartService(android.content.Intent intent) {
        return super._superStartService(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStopLocalVoiceInteraction() {
        super._superStopLocalVoiceInteraction();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStopLockTask() {
        super._superStopLockTask();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStopManagingCursor(android.database.Cursor cursor) {
        super._superStopManagingCursor(cursor);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superStopService(android.content.Intent intent) {
        return super._superStopService(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superTakeKeyEvents(boolean z17) {
        super._superTakeKeyEvents(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superTriggerSearch(java.lang.String str, android.os.Bundle bundle) {
        super._superTriggerSearch(str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superUnbindService(android.content.ServiceConnection serviceConnection) {
        super._superUnbindService(serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superUnregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        super._superUnregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superUnregisterComponentCallbacks(android.content.ComponentCallbacks componentCallbacks) {
        super._superUnregisterComponentCallbacks(componentCallbacks);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superUnregisterDeviceIdChangeListener(java.util.function.IntConsumer intConsumer) {
        super._superUnregisterDeviceIdChangeListener(intConsumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superUnregisterForContextMenu(android.view.View view) {
        super._superUnregisterForContextMenu(view);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superUnregisterReceiver(android.content.BroadcastReceiver broadcastReceiver) {
        super._superUnregisterReceiver(broadcastReceiver);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superUnregisterScreenCaptureCallback(android.app.Activity.ScreenCaptureCallback screenCaptureCallback) {
        super._superUnregisterScreenCaptureCallback(screenCaptureCallback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superUpdateServiceGroup(android.content.ServiceConnection serviceConnection, int i17, int i18) {
        super._superUpdateServiceGroup(serviceConnection, i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.ComponentName getCallingActivity() {
        return super.getCallingActivity();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.content.ContextWrapper, android.content.Context, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ java.lang.ClassLoader getClassLoader() {
        return super.getClassLoader();
    }

    public java.lang.String getDelegateProviderKey() {
        return com.tencent.shadow.core.runtime.container.DelegateProviderHolder.DEFAULT_KEY;
    }

    @Override // com.tencent.shadow.core.runtime.container.HostActivityDelegator
    public com.tencent.shadow.core.runtime.container.HostActivity getHostActivity() {
        return this;
    }

    @Override // com.tencent.shadow.core.runtime.container.HostActivity
    public android.app.Activity getImplementActivity() {
        return this;
    }

    @Override // com.tencent.shadow.core.runtime.container.HostActivity
    public android.widget.EditText getImplementEditText(android.content.Context context) {
        return null;
    }

    @Override // com.tencent.shadow.core.runtime.container.HostActivity
    public android.view.SurfaceView getImplementSurfaceView(android.content.Context context) {
        return null;
    }

    @Override // com.tencent.shadow.core.runtime.container.HostActivity
    public android.view.Window getImplementWindow() {
        return getWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.LayoutInflater getLayoutInflater() {
        return super.getLayoutInflater();
    }

    @Override // android.content.ContextWrapper, android.content.Context, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.pm.PackageManager getPackageManager() {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        return hostNativeActivityDelegate != null ? hostNativeActivityDelegate.getPackageManager() : super.getPackageManager();
    }

    public final java.lang.Object getPluginActivity() {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            return hostNativeActivityDelegate.getPluginActivity();
        }
        return null;
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.res.Resources getResources() {
        return super.getResources();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.res.Resources.Theme getTheme() {
        if (!this.isBeforeOnCreate) {
            return super.getTheme();
        }
        if (this.mHostTheme == null) {
            this.mHostTheme = super.getResources().newTheme();
        }
        return this.mHostTheme;
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean isChangingConfigurations() {
        return super.isChangingConfigurations();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onActionModeFinished(android.view.ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onActionModeStarted(android.view.ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onActivityReenter(int i17, android.content.Intent intent) {
        super.onActivityReenter(i17, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.NativeActivity, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onContentChanged() {
        super.onContentChanged();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onContextMenuClosed(android.view.Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.View.OnCreateContextMenuListener
    public /* bridge */ /* synthetic */ void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ java.lang.CharSequence onCreateDescription() {
        return super.onCreateDescription();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder) {
        super.onCreateNavigateUpTaskStack(taskStackBuilder);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        return super.onCreatePanelMenu(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.View onCreatePanelView(int i17) {
        return super.onCreatePanelView(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onCreateThumbnail(android.graphics.Bitmap bitmap, android.graphics.Canvas canvas) {
        return super.onCreateThumbnail(bitmap, canvas);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onGetDirectActions(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        super.onGetDirectActions(cancellationSignal, consumer);
    }

    @Override // android.app.NativeActivity, android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.onGlobalLayout();
        } else {
            super.onGlobalLayout();
        }
    }

    @Override // android.app.NativeActivity, android.view.InputQueue.Callback
    public void onInputQueueCreated(android.view.InputQueue inputQueue) {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.onInputQueueCreated(inputQueue);
        } else {
            super.onInputQueueCreated(inputQueue);
        }
    }

    @Override // android.app.NativeActivity, android.view.InputQueue.Callback
    public void onInputQueueDestroyed(android.view.InputQueue inputQueue) {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.onInputQueueDestroyed(inputQueue);
        } else {
            super.onInputQueueDestroyed(inputQueue);
        }
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyLongPress(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyLongPress(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        return super.onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onKeyShortcut(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyShortcut(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onLocalVoiceInteractionStarted() {
        super.onLocalVoiceInteractionStarted();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onLocalVoiceInteractionStopped() {
        super.onLocalVoiceInteractionStopped();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.NativeActivity, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onLowMemory() {
        super.onLowMemory();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean onMenuOpened(int i17, android.view.Menu menu) {
        return super.onMenuOpened(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onNavigateUp() {
        return super.onNavigateUp();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onNavigateUpFromChild(android.app.Activity activity) {
        return super.onNavigateUpFromChild(activity);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onOptionsMenuClosed(android.view.Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onPanelClosed(int i17, android.view.Menu menu) {
        super.onPanelClosed(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onPerformDirectAction(java.lang.String str, android.os.Bundle bundle, android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        super.onPerformDirectAction(str, bundle, cancellationSignal, consumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onPictureInPictureModeChanged(boolean z17) {
        super.onPictureInPictureModeChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onPictureInPictureRequested() {
        return super.onPictureInPictureRequested();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onPointerCaptureChanged(boolean z17) {
        super.onPointerCaptureChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onPostCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onPostCreate(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder) {
        super.onPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onPrepareOptionsMenu(android.view.Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        return super.onPreparePanel(i17, view, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onProvideAssistContent(android.app.assist.AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onProvideAssistData(android.os.Bundle bundle) {
        super.onProvideAssistData(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i17) {
        super.onProvideKeyboardShortcuts(list, menu, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ android.net.Uri onProvideReferrer() {
        return super.onProvideReferrer();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRestoreInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onSaveInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onStateNotSaved() {
        super.onStateNotSaved();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onTopResumedActivityChanged(boolean z17) {
        super.onTopResumedActivityChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onTrackballEvent(android.view.MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.content.ComponentCallbacks2
    public /* bridge */ /* synthetic */ void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onUserInteraction() {
        super.onUserInteraction();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.NativeActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void recreate() {
        super.recreate();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void setTheme(int i17) {
        if (this.isBeforeOnCreate) {
            return;
        }
        super.setTheme(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.HostNativeActivityDelegator
    public void superOnGlobalLayout() {
        super.onGlobalLayout();
    }

    @Override // com.tencent.shadow.core.runtime.container.HostNativeActivityDelegator
    public void superOnInputQueueCreated(android.view.InputQueue inputQueue) {
        super.onInputQueueCreated(inputQueue);
    }

    @Override // com.tencent.shadow.core.runtime.container.HostNativeActivityDelegator
    public void superOnInputQueueDestroyed(android.view.InputQueue inputQueue) {
        super.onInputQueueDestroyed(inputQueue);
    }

    @Override // com.tencent.shadow.core.runtime.container.HostNativeActivityDelegator
    public void superSurfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        super.surfaceChanged(surfaceHolder, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.HostNativeActivityDelegator
    public void superSurfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
    }

    @Override // com.tencent.shadow.core.runtime.container.HostNativeActivityDelegator
    public void superSurfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
    }

    @Override // com.tencent.shadow.core.runtime.container.HostNativeActivityDelegator
    public void superSurfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceRedrawNeeded(surfaceHolder);
    }

    @Override // android.app.NativeActivity, android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.surfaceChanged(surfaceHolder, i17, i18, i19);
        } else {
            super.surfaceChanged(surfaceHolder, i17, i18, i19);
        }
    }

    @Override // android.app.NativeActivity, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.surfaceCreated(surfaceHolder);
        } else {
            super.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.app.NativeActivity, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.surfaceDestroyed(surfaceHolder);
        } else {
            super.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.app.NativeActivity, android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.surfaceRedrawNeeded(surfaceHolder);
        } else {
            super.surfaceRedrawNeeded(surfaceHolder);
        }
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superBindIsolatedService(android.content.Intent intent, android.content.Context.BindServiceFlags bindServiceFlags, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return super._superBindIsolatedService(intent, bindServiceFlags, str, executor, serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superBindService(android.content.Intent intent, android.content.Context.BindServiceFlags bindServiceFlags, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return super._superBindService(intent, bindServiceFlags, executor, serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superBindServiceAsUser(android.content.Intent intent, android.content.ServiceConnection serviceConnection, android.content.Context.BindServiceFlags bindServiceFlags, android.os.UserHandle userHandle) {
        return super._superBindServiceAsUser(intent, serviceConnection, bindServiceFlags, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ int _superCheckUriPermission(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        return super._superCheckUriPermission(uri, str, str2, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Context _superCreateWindowContext(android.view.Display display, int i17, android.os.Bundle bundle) {
        return super._superCreateWindowContext(display, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superEnforceUriPermission(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3) {
        super._superEnforceUriPermission(uri, str, str2, i17, i18, i19, str3);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superEnterPictureInPictureMode(android.app.PictureInPictureParams pictureInPictureParams) {
        return super._superEnterPictureInPictureMode(pictureInPictureParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnCreate(android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.onPreSuperOnCreate();
        }
        super._superOnCreate(bundle);
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate2 = this.hostActivityDelegate;
        if (hostNativeActivityDelegate2 != null) {
            hostNativeActivityDelegate2.onPostSuperOnCreate();
        }
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.app.Dialog _superOnCreateDialog(int i17, android.os.Bundle bundle) {
        return super._superOnCreateDialog(i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.View _superOnCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return super._superOnCreateView(str, context, attributeSet);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super._superOnMultiWindowModeChanged(z17, configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPictureInPictureModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super._superOnPictureInPictureModeChanged(z17, configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPostCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super._superOnPostCreate(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnPrepareDialog(int i17, android.app.Dialog dialog, android.os.Bundle bundle) {
        super._superOnPrepareDialog(i17, dialog, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnRestoreInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super._superOnRestoreInstanceState(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOnSaveInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super._superOnSaveInstanceState(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superOnSearchRequested(android.view.SearchEvent searchEvent) {
        return super._superOnSearchRequested(searchEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.ActionMode _superOnWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17) {
        return super._superOnWindowStartingActionMode(callback, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.database.sqlite.SQLiteDatabase _superOpenOrCreateDatabase(java.lang.String str, int i17, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, android.database.DatabaseErrorHandler databaseErrorHandler) {
        return super._superOpenOrCreateDatabase(str, i17, cursorFactory, databaseErrorHandler);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOverrideActivityTransition(int i17, int i18, int i19, int i27) {
        super._superOverrideActivityTransition(i17, i18, i19, i27);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superOverridePendingTransition(int i17, int i18, int i19) {
        super._superOverridePendingTransition(i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i17) {
        return super._superRegisterReceiver(broadcastReceiver, intentFilter, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superRevokeUriPermission(java.lang.String str, android.net.Uri uri, int i17) {
        super._superRevokeUriPermission(str, uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendBroadcast(android.content.Intent intent, java.lang.String str) {
        super._superSendBroadcast(intent, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, java.lang.String str) {
        super._superSendBroadcastAsUser(intent, userHandle, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str) {
        super._superSendOrderedBroadcast(intent, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendStickyBroadcast(android.content.Intent intent, android.os.Bundle bundle) {
        super._superSendStickyBroadcast(intent, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetContentView(android.view.View view) {
        super._superSetContentView(view);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetResult(int i17, android.content.Intent intent) {
        super._superSetResult(i17, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetTheme(android.content.res.Resources.Theme theme) {
        super._superSetTheme(theme);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetTitle(java.lang.CharSequence charSequence) {
        super._superSetTitle(charSequence);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetWallpaper(java.io.InputStream inputStream) {
        super._superSetWallpaper(inputStream);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superShowDialog(int i17, android.os.Bundle bundle) {
        return super._superShowDialog(i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.ActionMode _superStartActionMode(android.view.ActionMode.Callback callback, int i17) {
        return super._superStartActionMode(callback, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivities(android.content.Intent[] intentArr, android.os.Bundle bundle) {
        super._superStartActivities(intentArr, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivity(android.content.Intent intent, android.os.Bundle bundle) {
        super._superStartActivity(intent, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super._superStartActivityForResult(intent, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivityFromChild(android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super._superStartActivityFromChild(activity, intent, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super._superStartActivityFromFragment(fragment, intent, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superStartActivityIfNeeded(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        return super._superStartActivityIfNeeded(intent, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartIntentSender(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18, int i19, android.os.Bundle bundle) {
        super._superStartIntentSender(intentSender, intent, i17, i18, i19, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        super._superStartIntentSenderForResult(intentSender, i17, intent, i18, i19, i27, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superStartIntentSenderFromChild(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        super._superStartIntentSenderFromChild(activity, intentSender, i17, intent, i18, i19, i27, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superStartNextMatchingActivity(android.content.Intent intent, android.os.Bundle bundle) {
        return super._superStartNextMatchingActivity(intent, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.NativeActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        this.isBeforeOnCreate = false;
        this.mHostTheme = null;
        if (isIllegalIntent(bundle)) {
            super.hostActivityDelegate = null;
            this.hostActivityDelegate = null;
            logger.error("illegalIntent savedInstanceState==" + bundle + " getIntent().getExtras()==" + getIntent().getExtras());
        }
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.onCreate(bundle);
            return;
        }
        super.onCreate(null);
        logger.error("onCreate: hostActivityDelegate==null finish activity");
        finish();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/shadow/core/runtime/container/NativePluginContainerActivity", "onCreate", "(Landroid/os/Bundle;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/shadow/core/runtime/container/NativePluginContainerActivity", "onCreate", "(Landroid/os/Bundle;)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super.onMultiWindowModeChanged(z17, configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onPictureInPictureModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super.onPictureInPictureModeChanged(z17, configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.NativeActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.HostNativeActivityDelegate hostNativeActivityDelegate = this.hostActivityDelegate;
        if (hostNativeActivityDelegate != null) {
            hostNativeActivityDelegate.onSaveInstanceState(bundle);
        } else {
            super.onSaveInstanceState(bundle);
        }
        bundle.putString(com.tencent.shadow.core.runtime.container.DelegateProvider.LOADER_VERSION_KEY, "1.6.0");
        bundle.putLong(com.tencent.shadow.core.runtime.container.DelegateProvider.PROCESS_ID_KEY, com.tencent.shadow.core.runtime.container.DelegateProviderHolder.sCustomPid);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17) {
        return super.onWindowStartingActionMode(callback, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superBindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17) {
        return super._superBindService(intent, serviceConnection, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler) {
        return super._superRegisterReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle) {
        super._superSendBroadcast(intent, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle) {
        super._superSendOrderedBroadcast(intent, str, broadcastReceiver, handler, i17, str2, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSetContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super._superSetContentView(view, layoutParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ boolean _superBindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, android.content.Context.BindServiceFlags bindServiceFlags) {
        return super._superBindService(intent, serviceConnection, bindServiceFlags);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        return super._superRegisterReceiver(broadcastReceiver, intentFilter, str, handler, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle) {
        super._superSendOrderedBroadcast(intent, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle2) {
        super._superSendOrderedBroadcast(intent, str, bundle, broadcastReceiver, handler, i17, str2, bundle2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedNativePluginContainerActivity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public /* bridge */ /* synthetic */ void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str3, android.os.Bundle bundle) {
        super._superSendOrderedBroadcast(intent, str, str2, broadcastReceiver, handler, i17, str3, bundle);
    }
}
