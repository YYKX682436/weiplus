package com.tencent.shadow.core.runtime.container;

/* loaded from: classes14.dex */
abstract class GeneratedNativePluginContainerActivity extends android.app.NativeActivity implements com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator {
    com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate hostActivityDelegate;

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superAddContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addContentView(view, layoutParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superApplyOverrideConfiguration(android.content.res.Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superAttachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superBindIsolatedService(android.content.Intent intent, int i17, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return super.bindIsolatedService(intent, i17, str, executor, serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superBindService(android.content.Intent intent, android.content.Context.BindServiceFlags bindServiceFlags, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return super.bindService(intent, bindServiceFlags, executor, serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superBindServiceAsUser(android.content.Intent intent, android.content.ServiceConnection serviceConnection, android.content.Context.BindServiceFlags bindServiceFlags, android.os.UserHandle userHandle) {
        return super.bindServiceAsUser(intent, serviceConnection, bindServiceFlags, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superCheckCallingOrSelfPermission(java.lang.String str) {
        return super.checkCallingOrSelfPermission(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superCheckCallingOrSelfUriPermission(android.net.Uri uri, int i17) {
        return super.checkCallingOrSelfUriPermission(uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int[] _superCheckCallingOrSelfUriPermissions(java.util.List<android.net.Uri> list, int i17) {
        return super.checkCallingOrSelfUriPermissions(list, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superCheckCallingPermission(java.lang.String str) {
        return super.checkCallingPermission(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superCheckCallingUriPermission(android.net.Uri uri, int i17) {
        return super.checkCallingUriPermission(uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int[] _superCheckCallingUriPermissions(java.util.List<android.net.Uri> list, int i17) {
        return super.checkCallingUriPermissions(list, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superCheckPermission(java.lang.String str, int i17, int i18) {
        return super.checkPermission(str, i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superCheckSelfPermission(java.lang.String str) {
        return super.checkSelfPermission(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superCheckUriPermission(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        return super.checkUriPermission(uri, str, str2, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int[] _superCheckUriPermissions(java.util.List<android.net.Uri> list, int i17, int i18, int i19) {
        return super.checkUriPermissions(list, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superClearOverrideActivityTransition(int i17) {
        super.clearOverrideActivityTransition(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superClearWallpaper() {
        super.clearWallpaper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superCloseContextMenu() {
        super.closeContextMenu();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superCloseOptionsMenu() {
        super.closeOptionsMenu();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateAttributionContext(java.lang.String str) {
        return super.createAttributionContext(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateConfigurationContext(android.content.res.Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateContext(android.content.ContextParams contextParams) {
        return super.createContext(contextParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateContextForSplit(java.lang.String str) {
        return super.createContextForSplit(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateDeviceContext(int i17) {
        return super.createDeviceContext(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateDeviceProtectedStorageContext() {
        return super.createDeviceProtectedStorageContext();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateDisplayContext(android.view.Display display) {
        return super.createDisplayContext(display);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreatePackageContext(java.lang.String str, int i17) {
        return super.createPackageContext(str, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.PendingIntent _superCreatePendingResult(int i17, android.content.Intent intent, int i18) {
        return super.createPendingResult(i17, intent, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateWindowContext(int i17, android.os.Bundle bundle) {
        return super.createWindowContext(i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String[] _superDatabaseList() {
        return super.databaseList();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDeleteDatabase(java.lang.String str) {
        return super.deleteDatabase(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDeleteFile(java.lang.String str) {
        return super.deleteFile(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDeleteSharedPreferences(java.lang.String str) {
        return super.deleteSharedPreferences(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superDismissDialog(int i17) {
        super.dismissDialog(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superDismissKeyboardShortcutsHelper() {
        super.dismissKeyboardShortcutsHelper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superDispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superDump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superEnforceCallingOrSelfPermission(java.lang.String str, java.lang.String str2) {
        super.enforceCallingOrSelfPermission(str, str2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superEnforceCallingOrSelfUriPermission(android.net.Uri uri, int i17, java.lang.String str) {
        super.enforceCallingOrSelfUriPermission(uri, i17, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superEnforceCallingPermission(java.lang.String str, java.lang.String str2) {
        super.enforceCallingPermission(str, str2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superEnforceCallingUriPermission(android.net.Uri uri, int i17, java.lang.String str) {
        super.enforceCallingUriPermission(uri, i17, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superEnforcePermission(java.lang.String str, int i17, int i18, java.lang.String str2) {
        super.enforcePermission(str, i17, i18, str2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superEnforceUriPermission(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3) {
        super.enforceUriPermission(uri, str, str2, i17, i18, i19, str3);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superEnterPictureInPictureMode(android.app.PictureInPictureParams pictureInPictureParams) {
        return super.enterPictureInPictureMode(pictureInPictureParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String[] _superFileList() {
        return super.fileList();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public <T extends android.view.View> T _superFindViewById(int i17) {
        return (T) super.findViewById(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superFinish() {
        super.finish();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superFinishActivity(int i17) {
        super.finishActivity(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superFinishActivityFromChild(android.app.Activity activity, int i17) {
        super.finishActivityFromChild(activity, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superFinishAffinity() {
        super.finishAffinity();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superFinishAfterTransition() {
        super.finishAfterTransition();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superFinishAndRemoveTask() {
        super.finishAndRemoveTask();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superFinishFromChild(android.app.Activity activity) {
        super.finishFromChild(activity);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.ActionBar _superGetActionBar() {
        return super.getActionBar();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.Application _superGetApplication() {
        return super.getApplication();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superGetApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.pm.ApplicationInfo _superGetApplicationInfo() {
        return super.getApplicationInfo();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.res.AssetManager _superGetAssets() {
        return super.getAssets();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.AttributionSource _superGetAttributionSource() {
        return super.getAttributionSource();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetAttributionTag() {
        return super.getAttributionTag();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superGetBaseContext() {
        return super.getBaseContext();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetCacheDir() {
        return super.getCacheDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.ComponentName _superGetCallingActivity() {
        return super.getCallingActivity();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetCallingPackage() {
        return super.getCallingPackage();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.ClassLoader _superGetClassLoader() {
        return super.getClassLoader();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetCodeCacheDir() {
        return super.getCodeCacheDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.ComponentName _superGetComponentName() {
        return super.getComponentName();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.ContentResolver _superGetContentResolver() {
        return super.getContentResolver();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.transition.Scene _superGetContentScene() {
        return super.getContentScene();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.transition.TransitionManager _superGetContentTransitionManager() {
        return super.getContentTransitionManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.View _superGetCurrentFocus() {
        return super.getCurrentFocus();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetDataDir() {
        return super.getDataDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetDatabasePath(java.lang.String str) {
        return super.getDatabasePath(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetDeviceId() {
        return super.getDeviceId();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetDir(java.lang.String str, int i17) {
        return super.getDir(str, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.Display _superGetDisplay() {
        return super.getDisplay();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetExternalCacheDir() {
        return super.getExternalCacheDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File[] _superGetExternalCacheDirs() {
        return super.getExternalCacheDirs();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetExternalFilesDir(java.lang.String str) {
        return super.getExternalFilesDir(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File[] _superGetExternalFilesDirs(java.lang.String str) {
        return super.getExternalFilesDirs(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File[] _superGetExternalMediaDirs() {
        return super.getExternalMediaDirs();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetFileStreamPath(java.lang.String str) {
        return super.getFileStreamPath(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetFilesDir() {
        return super.getFilesDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.FragmentManager _superGetFragmentManager() {
        return super.getFragmentManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Intent _superGetIntent() {
        return super.getIntent();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.Object _superGetLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetLaunchedFromPackage() {
        return super.getLaunchedFromPackage();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetLaunchedFromUid() {
        return super.getLaunchedFromUid();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.LayoutInflater _superGetLayoutInflater() {
        return super.getLayoutInflater();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.LoaderManager _superGetLoaderManager() {
        return super.getLoaderManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetLocalClassName() {
        return super.getLocalClassName();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.util.concurrent.Executor _superGetMainExecutor() {
        return super.getMainExecutor();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.os.Looper _superGetMainLooper() {
        return super.getMainLooper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetMaxNumPictureInPictureActions() {
        return super.getMaxNumPictureInPictureActions();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.media.session.MediaController _superGetMediaController() {
        return super.getMediaController();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.MenuInflater _superGetMenuInflater() {
        return super.getMenuInflater();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetNoBackupFilesDir() {
        return super.getNoBackupFilesDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File _superGetObbDir() {
        return super.getObbDir();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.File[] _superGetObbDirs() {
        return super.getObbDirs();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.window.OnBackInvokedDispatcher _superGetOnBackInvokedDispatcher() {
        return super.getOnBackInvokedDispatcher();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetOpPackageName() {
        return super.getOpPackageName();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetPackageCodePath() {
        return super.getPackageCodePath();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.pm.PackageManager _superGetPackageManager() {
        return super.getPackageManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetPackageName() {
        return super.getPackageName();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetPackageResourcePath() {
        return super.getPackageResourcePath();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.ContextParams _superGetParams() {
        return super.getParams();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.Activity _superGetParent() {
        return super.getParent();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Intent _superGetParentActivityIntent() {
        return super.getParentActivityIntent();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.SharedPreferences _superGetPreferences(int i17) {
        return super.getPreferences(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.net.Uri _superGetReferrer() {
        return super.getReferrer();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetRequestedOrientation() {
        return super.getRequestedOrientation();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.res.Resources _superGetResources() {
        return super.getResources();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.SearchEvent _superGetSearchEvent() {
        return super.getSearchEvent();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.SharedPreferences _superGetSharedPreferences(java.lang.String str, int i17) {
        return super.getSharedPreferences(str, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.window.SplashScreen _superGetSplashScreen() {
        return super.getSplashScreen();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.Object _superGetSystemService(java.lang.String str) {
        return super.getSystemService(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.String _superGetSystemServiceName(java.lang.Class<?> cls) {
        return super.getSystemServiceName(cls);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetTaskId() {
        return super.getTaskId();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.res.Resources.Theme _superGetTheme() {
        return super.getTheme();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.CharSequence _superGetTitle() {
        return super.getTitle();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetTitleColor() {
        return super.getTitleColor();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.VoiceInteractor _superGetVoiceInteractor() {
        return super.getVoiceInteractor();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetVolumeControlStream() {
        return super.getVolumeControlStream();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.graphics.drawable.Drawable _superGetWallpaper() {
        return super.getWallpaper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetWallpaperDesiredMinimumHeight() {
        return super.getWallpaperDesiredMinimumHeight();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superGetWallpaperDesiredMinimumWidth() {
        return super.getWallpaperDesiredMinimumWidth();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.Window _superGetWindow() {
        return super.getWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.WindowManager _superGetWindowManager() {
        return super.getWindowManager();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superGrantUriPermission(java.lang.String str, android.net.Uri uri, int i17) {
        super.grantUriPermission(str, uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superHasWindowFocus() {
        return super.hasWindowFocus();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superInvalidateOptionsMenu() {
        super.invalidateOptionsMenu();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsActivityTransitionRunning() {
        return super.isActivityTransitionRunning();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsChangingConfigurations() {
        return super.isChangingConfigurations();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsChild() {
        return super.isChild();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsDestroyed() {
        return super.isDestroyed();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsDeviceProtectedStorage() {
        return super.isDeviceProtectedStorage();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsFinishing() {
        return super.isFinishing();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsImmersive() {
        return super.isImmersive();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsInMultiWindowMode() {
        return super.isInMultiWindowMode();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsInPictureInPictureMode() {
        return super.isInPictureInPictureMode();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsLaunchedFromBubble() {
        return super.isLaunchedFromBubble();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsLocalVoiceInteractionSupported() {
        return super.isLocalVoiceInteractionSupported();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsRestricted() {
        return super.isRestricted();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsTaskRoot() {
        return super.isTaskRoot();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsUiContext() {
        return super.isUiContext();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsVoiceInteraction() {
        return super.isVoiceInteraction();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superIsVoiceInteractionRoot() {
        return super.isVoiceInteractionRoot();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.database.Cursor _superManagedQuery(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return super.managedQuery(uri, strArr, str, strArr2, str2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superMoveDatabaseFrom(android.content.Context context, java.lang.String str) {
        return super.moveDatabaseFrom(context, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superMoveSharedPreferencesFrom(android.content.Context context, java.lang.String str) {
        return super.moveSharedPreferencesFrom(context, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superMoveTaskToBack(boolean z17) {
        return super.moveTaskToBack(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superNavigateUpTo(android.content.Intent intent) {
        return super.navigateUpTo(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superNavigateUpToFromChild(android.app.Activity activity, android.content.Intent intent) {
        return super.navigateUpToFromChild(activity, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnActionModeFinished(android.view.ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnActionModeStarted(android.view.ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnActivityReenter(int i17, android.content.Intent intent) {
        super.onActivityReenter(i17, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnApplyThemeResource(android.content.res.Resources.Theme theme, int i17, boolean z17) {
        super.onApplyThemeResource(theme, i17, z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnChildTitleChanged(android.app.Activity activity, java.lang.CharSequence charSequence) {
        super.onChildTitleChanged(activity, charSequence);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnContentChanged() {
        super.onContentChanged();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnContextItemSelected(android.view.MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnContextMenuClosed(android.view.Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.CharSequence _superOnCreateDescription() {
        return super.onCreateDescription();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.Dialog _superOnCreateDialog(int i17) {
        return super.onCreateDialog(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnCreateNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder) {
        super.onCreateNavigateUpTaskStack(taskStackBuilder);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnCreatePanelMenu(int i17, android.view.Menu menu) {
        return super.onCreatePanelMenu(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.View _superOnCreatePanelView(int i17) {
        return super.onCreatePanelView(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnCreateThumbnail(android.graphics.Bitmap bitmap, android.graphics.Canvas canvas) {
        return super.onCreateThumbnail(bitmap, canvas);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.View _superOnCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnGetDirectActions(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer<java.util.List<android.app.DirectAction>> consumer) {
        super.onGetDirectActions(cancellationSignal, consumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnKeyLongPress(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyLongPress(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        return super.onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnKeyShortcut(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyShortcut(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnKeyUp(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnLocalVoiceInteractionStarted() {
        super.onLocalVoiceInteractionStarted();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnLocalVoiceInteractionStopped() {
        super.onLocalVoiceInteractionStopped();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnLowMemory() {
        super.onLowMemory();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnMenuOpened(int i17, android.view.Menu menu) {
        return super.onMenuOpened(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnNavigateUp() {
        return super.onNavigateUp();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnNavigateUpFromChild(android.app.Activity activity) {
        return super.onNavigateUpFromChild(activity);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnOptionsItemSelected(android.view.MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnOptionsMenuClosed(android.view.Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPanelClosed(int i17, android.view.Menu menu) {
        super.onPanelClosed(i17, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPause() {
        super.onPause();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPerformDirectAction(java.lang.String str, android.os.Bundle bundle, android.os.CancellationSignal cancellationSignal, java.util.function.Consumer<android.os.Bundle> consumer) {
        super.onPerformDirectAction(str, bundle, cancellationSignal, consumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPictureInPictureModeChanged(boolean z17) {
        super.onPictureInPictureModeChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnPictureInPictureRequested() {
        return super.onPictureInPictureRequested();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPointerCaptureChanged(boolean z17) {
        super.onPointerCaptureChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPostCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onPostCreate(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPostResume() {
        super.onPostResume();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPrepareDialog(int i17, android.app.Dialog dialog) {
        super.onPrepareDialog(i17, dialog);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPrepareNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder) {
        super.onPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnPrepareOptionsMenu(android.view.Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        return super.onPreparePanel(i17, view, menu);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnProvideAssistContent(android.app.assist.AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnProvideAssistData(android.os.Bundle bundle) {
        super.onProvideAssistData(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i17) {
        super.onProvideKeyboardShortcuts(list, menu, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.net.Uri _superOnProvideReferrer() {
        return super.onProvideReferrer();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnRestart() {
        super.onRestart();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnRestoreInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnResume() {
        super.onResume();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnSaveInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnStart() {
        super.onStart();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnStateNotSaved() {
        super.onStateNotSaved();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnStop() {
        super.onStop();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnTitleChanged(java.lang.CharSequence charSequence, int i17) {
        super.onTitleChanged(charSequence, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnTopResumedActivityChanged(boolean z17) {
        super.onTopResumedActivityChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnTrackballEvent(android.view.MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnTrimMemory(int i17) {
        super.onTrimMemory(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnUserInteraction() {
        super.onUserInteraction();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnUserLeaveHint() {
        super.onUserLeaveHint();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.ActionMode _superOnWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17) {
        return super.onWindowStartingActionMode(callback, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOpenContextMenu(android.view.View view) {
        super.openContextMenu(view);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.FileInputStream _superOpenFileInput(java.lang.String str) {
        return super.openFileInput(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.io.FileOutputStream _superOpenFileOutput(java.lang.String str, int i17) {
        return super.openFileOutput(str, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOpenOptionsMenu() {
        super.openOptionsMenu();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.database.sqlite.SQLiteDatabase _superOpenOrCreateDatabase(java.lang.String str, int i17, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, android.database.DatabaseErrorHandler databaseErrorHandler) {
        return super.openOrCreateDatabase(str, i17, cursorFactory, databaseErrorHandler);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOverrideActivityTransition(int i17, int i18, int i19) {
        super.overrideActivityTransition(i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOverridePendingTransition(int i17, int i18) {
        super.overridePendingTransition(i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.graphics.drawable.Drawable _superPeekWallpaper() {
        return super.peekWallpaper();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superPostponeEnterTransition() {
        super.postponeEnterTransition();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRecreate() {
        super.recreate();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRegisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        super.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRegisterComponentCallbacks(android.content.ComponentCallbacks componentCallbacks) {
        super.registerComponentCallbacks(componentCallbacks);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRegisterDeviceIdChangeListener(java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer) {
        super.registerDeviceIdChangeListener(executor, intConsumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRegisterForContextMenu(android.view.View view) {
        super.registerForContextMenu(view);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return super.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRegisterScreenCaptureCallback(java.util.concurrent.Executor executor, android.app.Activity.ScreenCaptureCallback screenCaptureCallback) {
        super.registerScreenCaptureCallback(executor, screenCaptureCallback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superReleaseInstance() {
        return super.releaseInstance();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRemoveDialog(int i17) {
        super.removeDialog(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRemoveStickyBroadcast(android.content.Intent intent) {
        super.removeStickyBroadcast(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRemoveStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle) {
        super.removeStickyBroadcastAsUser(intent, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superReportFullyDrawn() {
        super.reportFullyDrawn();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.DragAndDropPermissions _superRequestDragAndDropPermissions(android.view.DragEvent dragEvent) {
        return super.requestDragAndDropPermissions(dragEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRequestFullscreenMode(int i17, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> outcomeReceiver) {
        super.requestFullscreenMode(i17, outcomeReceiver);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRequestPermissions(java.lang.String[] strArr, int i17) {
        super.requestPermissions(strArr, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRequestShowKeyboardShortcuts() {
        super.requestShowKeyboardShortcuts();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superRequestVisibleBehind(boolean z17) {
        return super.requestVisibleBehind(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superRequestWindowFeature(int i17) {
        return super.requestWindowFeature(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public <T extends android.view.View> T _superRequireViewById(int i17) {
        return (T) super.requireViewById(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRevokeSelfPermissionOnKill(java.lang.String str) {
        super.revokeSelfPermissionOnKill(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRevokeSelfPermissionsOnKill(java.util.Collection<java.lang.String> collection) {
        super.revokeSelfPermissionsOnKill(collection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRevokeUriPermission(java.lang.String str, android.net.Uri uri, int i17) {
        super.revokeUriPermission(str, uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRunOnUiThread(java.lang.Runnable runnable) {
        super.runOnUiThread(runnable);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendBroadcast(android.content.Intent intent) {
        super.sendBroadcast(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, java.lang.String str) {
        super.sendBroadcastAsUser(intent, userHandle, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendBroadcastWithMultiplePermissions(android.content.Intent intent, java.lang.String[] strArr) {
        super.sendBroadcastWithMultiplePermissions(intent, strArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str3, android.os.Bundle bundle) {
        super.sendOrderedBroadcast(intent, str, str2, broadcastReceiver, handler, i17, str3, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, java.lang.String str, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle) {
        super.sendOrderedBroadcastAsUser(intent, userHandle, str, broadcastReceiver, handler, i17, str2, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendStickyBroadcast(android.content.Intent intent) {
        super.sendStickyBroadcast(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle) {
        super.sendStickyBroadcastAsUser(intent, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendStickyOrderedBroadcast(android.content.Intent intent, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str, android.os.Bundle bundle) {
        super.sendStickyOrderedBroadcast(intent, broadcastReceiver, handler, i17, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendStickyOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str, android.os.Bundle bundle) {
        super.sendStickyOrderedBroadcastAsUser(intent, userHandle, broadcastReceiver, handler, i17, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetActionBar(android.widget.Toolbar toolbar) {
        super.setActionBar(toolbar);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetContentTransitionManager(android.transition.TransitionManager transitionManager) {
        super.setContentTransitionManager(transitionManager);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetContentView(android.view.View view) {
        super.setContentView(view);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetDefaultKeyMode(int i17) {
        super.setDefaultKeyMode(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetEnterSharedElementCallback(android.app.SharedElementCallback sharedElementCallback) {
        super.setEnterSharedElementCallback(sharedElementCallback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetExitSharedElementCallback(android.app.SharedElementCallback sharedElementCallback) {
        super.setExitSharedElementCallback(sharedElementCallback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetFeatureDrawable(int i17, android.graphics.drawable.Drawable drawable) {
        super.setFeatureDrawable(i17, drawable);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetFeatureDrawableAlpha(int i17, int i18) {
        super.setFeatureDrawableAlpha(i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetFeatureDrawableResource(int i17, int i18) {
        super.setFeatureDrawableResource(i17, i18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetFeatureDrawableUri(int i17, android.net.Uri uri) {
        super.setFeatureDrawableUri(i17, uri);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetFinishOnTouchOutside(boolean z17) {
        super.setFinishOnTouchOutside(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetImmersive(boolean z17) {
        super.setImmersive(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetInheritShowWhenLocked(boolean z17) {
        super.setInheritShowWhenLocked(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetIntent(android.content.Intent intent) {
        super.setIntent(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetLocusContext(android.content.LocusId locusId, android.os.Bundle bundle) {
        super.setLocusContext(locusId, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetMediaController(android.media.session.MediaController mediaController) {
        super.setMediaController(mediaController);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetPictureInPictureParams(android.app.PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetProgress(int i17) {
        super.setProgress(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetProgressBarIndeterminate(boolean z17) {
        super.setProgressBarIndeterminate(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetProgressBarIndeterminateVisibility(boolean z17) {
        super.setProgressBarIndeterminateVisibility(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetProgressBarVisibility(boolean z17) {
        super.setProgressBarVisibility(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetRecentsScreenshotEnabled(boolean z17) {
        super.setRecentsScreenshotEnabled(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetRequestedOrientation(int i17) {
        super.setRequestedOrientation(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetResult(int i17) {
        super.setResult(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetSecondaryProgress(int i17) {
        super.setSecondaryProgress(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetShouldDockBigOverlays(boolean z17) {
        super.setShouldDockBigOverlays(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetShowWhenLocked(boolean z17) {
        super.setShowWhenLocked(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetTaskDescription(android.app.ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetTheme(int i17) {
        super.setTheme(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetTitleColor(int i17) {
        super.setTitleColor(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superSetTranslucent(boolean z17) {
        return super.setTranslucent(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetTurnScreenOn(boolean z17) {
        super.setTurnScreenOn(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetVisible(boolean z17) {
        super.setVisible(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetVolumeControlStream(int i17) {
        super.setVolumeControlStream(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetVrModeEnabled(boolean z17, android.content.ComponentName componentName) {
        super.setVrModeEnabled(z17, componentName);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetWallpaper(android.graphics.Bitmap bitmap) {
        super.setWallpaper(bitmap);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superShouldDockBigOverlays() {
        return super.shouldDockBigOverlays();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superShouldShowRequestPermissionRationale(java.lang.String str) {
        return super.shouldShowRequestPermissionRationale(str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superShouldUpRecreateTask(android.content.Intent intent) {
        return super.shouldUpRecreateTask(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superShowAssist(android.os.Bundle bundle) {
        return super.showAssist(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superShowDialog(int i17) {
        super.showDialog(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superShowLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.ActionMode _superStartActionMode(android.view.ActionMode.Callback callback, int i17) {
        return super.startActionMode(callback, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivities(android.content.Intent[] intentArr) {
        super.startActivities(intentArr);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivity(android.content.Intent intent) {
        super.startActivity(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivityFromChild(android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityFromChild(activity, intent, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17) {
        super.startActivityFromFragment(fragment, intent, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superStartActivityIfNeeded(android.content.Intent intent, int i17) {
        return super.startActivityIfNeeded(intent, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.ComponentName _superStartForegroundService(android.content.Intent intent) {
        return super.startForegroundService(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superStartInstrumentation(android.content.ComponentName componentName, java.lang.String str, android.os.Bundle bundle) {
        return super.startInstrumentation(componentName, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartIntentSender(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18, int i19, android.os.Bundle bundle) {
        super.startIntentSender(intentSender, intent, i17, i18, i19, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i17, intent, i18, i19, i27, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartIntentSenderFromChild(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        super.startIntentSenderFromChild(activity, intentSender, i17, intent, i18, i19, i27, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartLocalVoiceInteraction(android.os.Bundle bundle) {
        super.startLocalVoiceInteraction(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartLockTask() {
        super.startLockTask();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartManagingCursor(android.database.Cursor cursor) {
        super.startManagingCursor(cursor);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superStartNextMatchingActivity(android.content.Intent intent) {
        return super.startNextMatchingActivity(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartSearch(java.lang.String str, boolean z17, android.os.Bundle bundle, boolean z18) {
        super.startSearch(str, z17, bundle, z18);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.ComponentName _superStartService(android.content.Intent intent) {
        return super.startService(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStopLocalVoiceInteraction() {
        super.stopLocalVoiceInteraction();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStopLockTask() {
        super.stopLockTask();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStopManagingCursor(android.database.Cursor cursor) {
        super.stopManagingCursor(cursor);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superStopService(android.content.Intent intent) {
        return super.stopService(intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superTakeKeyEvents(boolean z17) {
        super.takeKeyEvents(z17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superTriggerSearch(java.lang.String str, android.os.Bundle bundle) {
        super.triggerSearch(str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superUnbindService(android.content.ServiceConnection serviceConnection) {
        super.unbindService(serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superUnregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        super.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superUnregisterComponentCallbacks(android.content.ComponentCallbacks componentCallbacks) {
        super.unregisterComponentCallbacks(componentCallbacks);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superUnregisterDeviceIdChangeListener(java.util.function.IntConsumer intConsumer) {
        super.unregisterDeviceIdChangeListener(intConsumer);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superUnregisterForContextMenu(android.view.View view) {
        super.unregisterForContextMenu(view);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superUnregisterReceiver(android.content.BroadcastReceiver broadcastReceiver) {
        super.unregisterReceiver(broadcastReceiver);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superUnregisterScreenCaptureCallback(android.app.Activity.ScreenCaptureCallback screenCaptureCallback) {
        super.unregisterScreenCaptureCallback(screenCaptureCallback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superUpdateServiceGroup(android.content.ServiceConnection serviceConnection, int i17, int i18) {
        super.updateServiceGroup(serviceConnection, i17, i18);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void attachBaseContext(android.content.Context context) {
        _superAttachBaseContext(context);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.dispatchGenericMotionEvent(motionEvent) : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.dispatchKeyEvent(keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.dispatchKeyShortcutEvent(keyEvent) : super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.dispatchPopulateAccessibilityEvent(accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.dispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.dispatchTrackballEvent(motionEvent) : super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void finish() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.finish();
        } else {
            super.finish();
        }
    }

    @Override // android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.ComponentName getCallingActivity() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.getCallingActivity() : super.getCallingActivity();
    }

    @Override // android.content.ContextWrapper, android.content.Context, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public java.lang.ClassLoader getClassLoader() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.getClassLoader() : super.getClassLoader();
    }

    @Override // android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.LayoutInflater getLayoutInflater() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.getLayoutInflater() : super.getLayoutInflater();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.res.Resources getResources() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.getResources() : super.getResources();
    }

    @Override // android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean isChangingConfigurations() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.isChangingConfigurations() : super.isChangingConfigurations();
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onActionModeFinished(actionMode);
        } else {
            super.onActionModeFinished(actionMode);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onActionModeStarted(actionMode);
        } else {
            super.onActionModeStarted(actionMode);
        }
    }

    @Override // android.app.Activity
    public void onActivityReenter(int i17, android.content.Intent intent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onActivityReenter(i17, intent);
        } else {
            super.onActivityReenter(i17, intent);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onActivityResult(i17, i18, intent);
        } else {
            super.onActivityResult(i17, i18, intent);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper
    public void onApplyThemeResource(android.content.res.Resources.Theme theme, int i17, boolean z17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onApplyThemeResource(theme, i17, z17);
        } else {
            super.onApplyThemeResource(theme, i17, z17);
        }
    }

    @Override // android.app.Activity
    public void onAttachFragment(android.app.Fragment fragment) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onAttachFragment(fragment);
        } else {
            super.onAttachFragment(fragment);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onAttachedToWindow() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onChildTitleChanged(android.app.Activity activity, java.lang.CharSequence charSequence) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onChildTitleChanged(activity, charSequence);
        } else {
            super.onChildTitleChanged(activity, charSequence);
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onConfigurationChanged(configuration);
        } else {
            super.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onContentChanged() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onContentChanged();
        } else {
            super.onContentChanged();
        }
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onContextItemSelected(menuItem) : super.onContextItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onContextMenuClosed(android.view.Menu menu) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onContextMenuClosed(menu);
        } else {
            super.onContextMenuClosed(menu);
        }
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onCreate(bundle, persistableBundle);
        } else {
            super.onCreate(bundle, persistableBundle);
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    @Override // android.app.Activity
    public java.lang.CharSequence onCreateDescription() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onCreateDescription() : super.onCreateDescription();
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            return generatedHostActivityDelegate.onCreateDialog(i17);
        }
        return super.onCreateDialog(i17);
    }

    @Override // android.app.Activity
    public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onCreateNavigateUpTaskStack(taskStackBuilder);
        } else {
            super.onCreateNavigateUpTaskStack(taskStackBuilder);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onCreateOptionsMenu(menu) : super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onCreatePanelMenu(i17, menu) : super.onCreatePanelMenu(i17, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.View onCreatePanelView(int i17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onCreatePanelView(i17) : super.onCreatePanelView(i17);
    }

    @Override // android.app.Activity
    public boolean onCreateThumbnail(android.graphics.Bitmap bitmap, android.graphics.Canvas canvas) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onCreateThumbnail(bitmap, canvas) : super.onCreateThumbnail(bitmap, canvas);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            return generatedHostActivityDelegate.onCreateView(str, context, attributeSet);
        }
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onDestroy();
        } else {
            super.onDestroy();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onDetachedFromWindow() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onDetachedFromWindow();
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.app.Activity
    public void onEnterAnimationComplete() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onEnterAnimationComplete();
        } else {
            super.onEnterAnimationComplete();
        }
    }

    @Override // android.app.Activity
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onGenericMotionEvent(motionEvent) : super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onGetDirectActions(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer<java.util.List<android.app.DirectAction>> consumer) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onGetDirectActions(cancellationSignal, consumer);
        } else {
            super.onGetDirectActions(cancellationSignal, consumer);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onKeyDown(i17, keyEvent) : super.onKeyDown(i17, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onKeyLongPress(i17, keyEvent) : super.onKeyLongPress(i17, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onKeyMultiple(i17, i18, keyEvent) : super.onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onKeyShortcut(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onKeyShortcut(i17, keyEvent) : super.onKeyShortcut(i17, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onKeyUp(i17, keyEvent) : super.onKeyUp(i17, keyEvent);
    }

    @Override // android.app.Activity
    public void onLocalVoiceInteractionStarted() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onLocalVoiceInteractionStarted();
        } else {
            super.onLocalVoiceInteractionStarted();
        }
    }

    @Override // android.app.Activity
    public void onLocalVoiceInteractionStopped() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onLocalVoiceInteractionStopped();
        } else {
            super.onLocalVoiceInteractionStopped();
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onLowMemory();
        } else {
            super.onLowMemory();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean onMenuOpened(int i17, android.view.Menu menu) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onMenuOpened(i17, menu) : super.onMenuOpened(i17, menu);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onMultiWindowModeChanged(z17);
        } else {
            super.onMultiWindowModeChanged(z17);
        }
    }

    @Override // android.app.Activity
    public boolean onNavigateUp() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onNavigateUp() : super.onNavigateUp();
    }

    @Override // android.app.Activity
    public boolean onNavigateUpFromChild(android.app.Activity activity) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onNavigateUpFromChild(activity) : super.onNavigateUpFromChild(activity);
    }

    @Override // android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onNewIntent(intent);
        } else {
            super.onNewIntent(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onOptionsItemSelected(menuItem) : super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onOptionsMenuClosed(android.view.Menu menu) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onOptionsMenuClosed(menu);
        } else {
            super.onOptionsMenuClosed(menu);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onPanelClosed(int i17, android.view.Menu menu) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPanelClosed(i17, menu);
        } else {
            super.onPanelClosed(i17, menu);
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onPause() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPause();
        } else {
            super.onPause();
        }
    }

    @Override // android.app.Activity
    public void onPerformDirectAction(java.lang.String str, android.os.Bundle bundle, android.os.CancellationSignal cancellationSignal, java.util.function.Consumer<android.os.Bundle> consumer) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPerformDirectAction(str, bundle, cancellationSignal, consumer);
        } else {
            super.onPerformDirectAction(str, bundle, cancellationSignal, consumer);
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPictureInPictureModeChanged(z17);
        } else {
            super.onPictureInPictureModeChanged(z17);
        }
    }

    @Override // android.app.Activity
    public boolean onPictureInPictureRequested() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onPictureInPictureRequested() : super.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        } else {
            super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        }
    }

    @Override // android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onPointerCaptureChanged(boolean z17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPointerCaptureChanged(z17);
        } else {
            super.onPointerCaptureChanged(z17);
        }
    }

    @Override // android.app.Activity
    public void onPostCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPostCreate(bundle, persistableBundle);
        } else {
            super.onPostCreate(bundle, persistableBundle);
        }
    }

    @Override // android.app.Activity
    public void onPostResume() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPostResume();
        } else {
            super.onPostResume();
        }
    }

    @Override // android.app.Activity
    public void onPrepareDialog(int i17, android.app.Dialog dialog) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPrepareDialog(i17, dialog);
        } else {
            super.onPrepareDialog(i17, dialog);
        }
    }

    @Override // android.app.Activity
    public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPrepareNavigateUpTaskStack(taskStackBuilder);
        } else {
            super.onPrepareNavigateUpTaskStack(taskStackBuilder);
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onPrepareOptionsMenu(menu) : super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onPreparePanel(i17, view, menu) : super.onPreparePanel(i17, view, menu);
    }

    @Override // android.app.Activity
    public void onProvideAssistContent(android.app.assist.AssistContent assistContent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onProvideAssistContent(assistContent);
        } else {
            super.onProvideAssistContent(assistContent);
        }
    }

    @Override // android.app.Activity
    public void onProvideAssistData(android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onProvideAssistData(bundle);
        } else {
            super.onProvideAssistData(bundle);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onProvideKeyboardShortcuts(list, menu, i17);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i17);
        }
    }

    @Override // android.app.Activity
    public android.net.Uri onProvideReferrer() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onProvideReferrer() : super.onProvideReferrer();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onRequestPermissionsResult(i17, strArr, iArr);
        } else {
            super.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onRestart();
        } else {
            super.onRestart();
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onRestoreInstanceState(bundle, persistableBundle);
        } else {
            super.onRestoreInstanceState(bundle, persistableBundle);
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onResume() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onResume();
        } else {
            super.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onSaveInstanceState(bundle, persistableBundle);
        } else {
            super.onSaveInstanceState(bundle, persistableBundle);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean onSearchRequested() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            return generatedHostActivityDelegate.onSearchRequested();
        }
        return super.onSearchRequested();
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onStart() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onStart();
        } else {
            super.onStart();
        }
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onStateNotSaved();
        } else {
            super.onStateNotSaved();
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onStop() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onStop();
        } else {
            super.onStop();
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(java.lang.CharSequence charSequence, int i17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onTitleChanged(charSequence, i17);
        } else {
            super.onTitleChanged(charSequence, i17);
        }
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onTopResumedActivityChanged(z17);
        } else {
            super.onTopResumedActivityChanged(z17);
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public boolean onTrackballEvent(android.view.MotionEvent motionEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        return generatedHostActivityDelegate != null ? generatedHostActivityDelegate.onTrackballEvent(motionEvent) : super.onTrackballEvent(motionEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onTrimMemory(i17);
        } else {
            super.onTrimMemory(i17);
        }
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onUserInteraction();
        } else {
            super.onUserInteraction();
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onUserLeaveHint();
        } else {
            super.onUserLeaveHint();
        }
    }

    @Override // android.app.Activity
    public void onVisibleBehindCanceled() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onVisibleBehindCanceled();
        } else {
            super.onVisibleBehindCanceled();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onWindowAttributesChanged(layoutParams);
        } else {
            super.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onWindowFocusChanged(z17);
        } else {
            super.onWindowFocusChanged(z17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            return generatedHostActivityDelegate.onWindowStartingActionMode(callback, i17);
        }
        return super.onWindowStartingActionMode(callback, i17);
    }

    @Override // android.app.Activity, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void recreate() {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.recreate();
        } else {
            super.recreate();
        }
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superBindIsolatedService(android.content.Intent intent, android.content.Context.BindServiceFlags bindServiceFlags, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return super.bindIsolatedService(intent, bindServiceFlags, str, executor, serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superBindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17) {
        return super.bindService(intent, serviceConnection, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superBindServiceAsUser(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, android.os.UserHandle userHandle) {
        return super.bindServiceAsUser(intent, serviceConnection, i17, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public int _superCheckUriPermission(android.net.Uri uri, int i17, int i18, int i19) {
        return super.checkUriPermission(uri, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Context _superCreateWindowContext(android.view.Display display, int i17, android.os.Bundle bundle) {
        return super.createWindowContext(display, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superEnforceUriPermission(android.net.Uri uri, int i17, int i18, int i19, java.lang.String str) {
        super.enforceUriPermission(uri, i17, i18, i19, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superEnterPictureInPictureMode() {
        super.enterPictureInPictureMode();
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.app.Dialog _superOnCreateDialog(int i17, android.os.Bundle bundle) {
        return super.onCreateDialog(i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.View _superOnCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super.onMultiWindowModeChanged(z17, configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPictureInPictureModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super.onPictureInPictureModeChanged(z17, configuration);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnPrepareDialog(int i17, android.app.Dialog dialog, android.os.Bundle bundle) {
        super.onPrepareDialog(i17, dialog, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOnSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superOnSearchRequested(android.view.SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.ActionMode _superOnWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.database.sqlite.SQLiteDatabase _superOpenOrCreateDatabase(java.lang.String str, int i17, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory) {
        return super.openOrCreateDatabase(str, i17, cursorFactory);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOverrideActivityTransition(int i17, int i18, int i19, int i27) {
        super.overrideActivityTransition(i17, i18, i19, i27);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superOverridePendingTransition(int i17, int i18, int i19) {
        super.overridePendingTransition(i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superRevokeUriPermission(android.net.Uri uri, int i17) {
        super.revokeUriPermission(uri, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendBroadcast(android.content.Intent intent, java.lang.String str) {
        super.sendBroadcast(intent, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle) {
        super.sendBroadcastAsUser(intent, userHandle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendOrderedBroadcast(android.content.Intent intent, int i17, java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, java.lang.String str3, android.os.Bundle bundle, android.os.Bundle bundle2) {
        super.sendOrderedBroadcast(intent, i17, str, str2, broadcastReceiver, handler, str3, bundle, bundle2);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendStickyBroadcast(android.content.Intent intent, android.os.Bundle bundle) {
        super.sendStickyBroadcast(intent, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetContentView(int i17) {
        super.setContentView(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetResult(int i17, android.content.Intent intent) {
        super.setResult(i17, intent);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetTheme(android.content.res.Resources.Theme theme) {
        super.setTheme(theme);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetTitle(int i17) {
        super.setTitle(i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetWallpaper(java.io.InputStream inputStream) {
        super.setWallpaper(inputStream);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superShowDialog(int i17, android.os.Bundle bundle) {
        return super.showDialog(i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.ActionMode _superStartActionMode(android.view.ActionMode.Callback callback) {
        return super.startActionMode(callback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivities(android.content.Intent[] intentArr, android.os.Bundle bundle) {
        super.startActivities(intentArr, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivity(android.content.Intent intent, android.os.Bundle bundle) {
        super.startActivity(intent, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivityFromChild(android.app.Activity activity, android.content.Intent intent, int i17) {
        super.startActivityFromChild(activity, intent, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityFromFragment(fragment, intent, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superStartActivityIfNeeded(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        return super.startActivityIfNeeded(intent, i17, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartIntentSender(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18, int i19) {
        super.startIntentSender(intentSender, intent, i17, i18, i19);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27) {
        super.startIntentSenderForResult(intentSender, i17, intent, i18, i19, i27);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superStartIntentSenderFromChild(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27) {
        super.startIntentSenderFromChild(activity, intentSender, i17, intent, i18, i19, i27);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superStartNextMatchingActivity(android.content.Intent intent, android.os.Bundle bundle) {
        return super.startNextMatchingActivity(intent, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superBindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, android.content.Context.BindServiceFlags bindServiceFlags) {
        return super.bindService(intent, serviceConnection, bindServiceFlags);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler) {
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle) {
        super.sendBroadcast(intent, str, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str) {
        super.sendOrderedBroadcast(intent, str);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSetContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean _superBindService(android.content.Intent intent, int i17, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return super.bindService(intent, i17, executor, serviceConnection);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i17) {
        return super.registerReceiver(broadcastReceiver, intentFilter, i17);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle2) {
        super.sendOrderedBroadcast(intent, str, bundle, broadcastReceiver, handler, i17, str2, bundle2);
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onCreate(bundle);
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17, android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            return generatedHostActivityDelegate.onCreateDialog(i17, bundle);
        }
        return super.onCreateDialog(i17, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            return generatedHostActivityDelegate.onCreateView(view, str, context, attributeSet);
        }
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onMultiWindowModeChanged(z17, configuration);
        } else {
            super.onMultiWindowModeChanged(z17, configuration);
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z17, android.content.res.Configuration configuration) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPictureInPictureModeChanged(z17, configuration);
        } else {
            super.onPictureInPictureModeChanged(z17, configuration);
        }
    }

    @Override // android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPostCreate(bundle);
        } else {
            super.onPostCreate(bundle);
        }
    }

    @Override // android.app.Activity
    public void onPrepareDialog(int i17, android.app.Dialog dialog, android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onPrepareDialog(i17, dialog, bundle);
        } else {
            super.onPrepareDialog(i17, dialog, bundle);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onRestoreInstanceState(bundle);
        } else {
            super.onRestoreInstanceState(bundle);
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            generatedHostActivityDelegate.onSaveInstanceState(bundle);
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            return generatedHostActivityDelegate.onSearchRequested(searchEvent);
        }
        return super.onSearchRequested(searchEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback, com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegate generatedHostActivityDelegate = this.hostActivityDelegate;
        if (generatedHostActivityDelegate != null) {
            return generatedHostActivityDelegate.onWindowStartingActionMode(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle) {
        super.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i17, str2, bundle);
    }

    @Override // com.tencent.shadow.core.runtime.container.GeneratedHostActivityDelegator
    public void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle) {
        super.sendOrderedBroadcast(intent, str, bundle);
    }
}
