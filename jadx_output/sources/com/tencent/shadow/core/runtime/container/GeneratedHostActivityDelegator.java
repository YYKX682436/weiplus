package com.tencent.shadow.core.runtime.container;

/* loaded from: classes14.dex */
public interface GeneratedHostActivityDelegator {
    void _superAddContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    void _superApplyOverrideConfiguration(android.content.res.Configuration configuration);

    void _superAttachBaseContext(android.content.Context context);

    boolean _superBindIsolatedService(android.content.Intent intent, int i17, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection);

    boolean _superBindIsolatedService(android.content.Intent intent, android.content.Context.BindServiceFlags bindServiceFlags, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection);

    boolean _superBindService(android.content.Intent intent, int i17, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection);

    boolean _superBindService(android.content.Intent intent, android.content.Context.BindServiceFlags bindServiceFlags, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection);

    boolean _superBindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17);

    boolean _superBindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, android.content.Context.BindServiceFlags bindServiceFlags);

    boolean _superBindServiceAsUser(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, android.os.UserHandle userHandle);

    boolean _superBindServiceAsUser(android.content.Intent intent, android.content.ServiceConnection serviceConnection, android.content.Context.BindServiceFlags bindServiceFlags, android.os.UserHandle userHandle);

    int _superCheckCallingOrSelfPermission(java.lang.String str);

    int _superCheckCallingOrSelfUriPermission(android.net.Uri uri, int i17);

    int[] _superCheckCallingOrSelfUriPermissions(java.util.List<android.net.Uri> list, int i17);

    int _superCheckCallingPermission(java.lang.String str);

    int _superCheckCallingUriPermission(android.net.Uri uri, int i17);

    int[] _superCheckCallingUriPermissions(java.util.List<android.net.Uri> list, int i17);

    int _superCheckPermission(java.lang.String str, int i17, int i18);

    int _superCheckSelfPermission(java.lang.String str);

    int _superCheckUriPermission(android.net.Uri uri, int i17, int i18, int i19);

    int _superCheckUriPermission(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i17, int i18, int i19);

    int[] _superCheckUriPermissions(java.util.List<android.net.Uri> list, int i17, int i18, int i19);

    void _superClearOverrideActivityTransition(int i17);

    void _superClearWallpaper();

    void _superCloseContextMenu();

    void _superCloseOptionsMenu();

    android.content.Context _superCreateAttributionContext(java.lang.String str);

    android.content.Context _superCreateConfigurationContext(android.content.res.Configuration configuration);

    android.content.Context _superCreateContext(android.content.ContextParams contextParams);

    android.content.Context _superCreateContextForSplit(java.lang.String str);

    android.content.Context _superCreateDeviceContext(int i17);

    android.content.Context _superCreateDeviceProtectedStorageContext();

    android.content.Context _superCreateDisplayContext(android.view.Display display);

    android.content.Context _superCreatePackageContext(java.lang.String str, int i17);

    android.app.PendingIntent _superCreatePendingResult(int i17, android.content.Intent intent, int i18);

    android.content.Context _superCreateWindowContext(int i17, android.os.Bundle bundle);

    android.content.Context _superCreateWindowContext(android.view.Display display, int i17, android.os.Bundle bundle);

    java.lang.String[] _superDatabaseList();

    boolean _superDeleteDatabase(java.lang.String str);

    boolean _superDeleteFile(java.lang.String str);

    boolean _superDeleteSharedPreferences(java.lang.String str);

    void _superDismissDialog(int i17);

    void _superDismissKeyboardShortcutsHelper();

    boolean _superDispatchGenericMotionEvent(android.view.MotionEvent motionEvent);

    boolean _superDispatchKeyEvent(android.view.KeyEvent keyEvent);

    boolean _superDispatchKeyShortcutEvent(android.view.KeyEvent keyEvent);

    boolean _superDispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent);

    boolean _superDispatchTouchEvent(android.view.MotionEvent motionEvent);

    boolean _superDispatchTrackballEvent(android.view.MotionEvent motionEvent);

    void _superDump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    void _superEnforceCallingOrSelfPermission(java.lang.String str, java.lang.String str2);

    void _superEnforceCallingOrSelfUriPermission(android.net.Uri uri, int i17, java.lang.String str);

    void _superEnforceCallingPermission(java.lang.String str, java.lang.String str2);

    void _superEnforceCallingUriPermission(android.net.Uri uri, int i17, java.lang.String str);

    void _superEnforcePermission(java.lang.String str, int i17, int i18, java.lang.String str2);

    void _superEnforceUriPermission(android.net.Uri uri, int i17, int i18, int i19, java.lang.String str);

    void _superEnforceUriPermission(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3);

    void _superEnterPictureInPictureMode();

    boolean _superEnterPictureInPictureMode(android.app.PictureInPictureParams pictureInPictureParams);

    java.lang.String[] _superFileList();

    <T extends android.view.View> T _superFindViewById(int i17);

    void _superFinish();

    void _superFinishActivity(int i17);

    void _superFinishActivityFromChild(android.app.Activity activity, int i17);

    void _superFinishAffinity();

    void _superFinishAfterTransition();

    void _superFinishAndRemoveTask();

    void _superFinishFromChild(android.app.Activity activity);

    android.app.ActionBar _superGetActionBar();

    android.app.Application _superGetApplication();

    android.content.Context _superGetApplicationContext();

    android.content.pm.ApplicationInfo _superGetApplicationInfo();

    android.content.res.AssetManager _superGetAssets();

    android.content.AttributionSource _superGetAttributionSource();

    java.lang.String _superGetAttributionTag();

    android.content.Context _superGetBaseContext();

    java.io.File _superGetCacheDir();

    android.content.ComponentName _superGetCallingActivity();

    java.lang.String _superGetCallingPackage();

    int _superGetChangingConfigurations();

    java.lang.ClassLoader _superGetClassLoader();

    java.io.File _superGetCodeCacheDir();

    android.content.ComponentName _superGetComponentName();

    android.content.ContentResolver _superGetContentResolver();

    android.transition.Scene _superGetContentScene();

    android.transition.TransitionManager _superGetContentTransitionManager();

    android.view.View _superGetCurrentFocus();

    java.io.File _superGetDataDir();

    java.io.File _superGetDatabasePath(java.lang.String str);

    int _superGetDeviceId();

    java.io.File _superGetDir(java.lang.String str, int i17);

    android.view.Display _superGetDisplay();

    java.io.File _superGetExternalCacheDir();

    java.io.File[] _superGetExternalCacheDirs();

    java.io.File _superGetExternalFilesDir(java.lang.String str);

    java.io.File[] _superGetExternalFilesDirs(java.lang.String str);

    java.io.File[] _superGetExternalMediaDirs();

    java.io.File _superGetFileStreamPath(java.lang.String str);

    java.io.File _superGetFilesDir();

    android.app.FragmentManager _superGetFragmentManager();

    android.content.Intent _superGetIntent();

    java.lang.Object _superGetLastNonConfigurationInstance();

    java.lang.String _superGetLaunchedFromPackage();

    int _superGetLaunchedFromUid();

    android.view.LayoutInflater _superGetLayoutInflater();

    android.app.LoaderManager _superGetLoaderManager();

    java.lang.String _superGetLocalClassName();

    java.util.concurrent.Executor _superGetMainExecutor();

    android.os.Looper _superGetMainLooper();

    int _superGetMaxNumPictureInPictureActions();

    android.media.session.MediaController _superGetMediaController();

    android.view.MenuInflater _superGetMenuInflater();

    java.io.File _superGetNoBackupFilesDir();

    java.io.File _superGetObbDir();

    java.io.File[] _superGetObbDirs();

    android.window.OnBackInvokedDispatcher _superGetOnBackInvokedDispatcher();

    java.lang.String _superGetOpPackageName();

    java.lang.String _superGetPackageCodePath();

    android.content.pm.PackageManager _superGetPackageManager();

    java.lang.String _superGetPackageName();

    java.lang.String _superGetPackageResourcePath();

    android.content.ContextParams _superGetParams();

    android.app.Activity _superGetParent();

    android.content.Intent _superGetParentActivityIntent();

    android.content.SharedPreferences _superGetPreferences(int i17);

    android.net.Uri _superGetReferrer();

    int _superGetRequestedOrientation();

    android.content.res.Resources _superGetResources();

    android.view.SearchEvent _superGetSearchEvent();

    android.content.SharedPreferences _superGetSharedPreferences(java.lang.String str, int i17);

    android.window.SplashScreen _superGetSplashScreen();

    java.lang.Object _superGetSystemService(java.lang.String str);

    java.lang.String _superGetSystemServiceName(java.lang.Class<?> cls);

    int _superGetTaskId();

    android.content.res.Resources.Theme _superGetTheme();

    java.lang.CharSequence _superGetTitle();

    int _superGetTitleColor();

    android.app.VoiceInteractor _superGetVoiceInteractor();

    int _superGetVolumeControlStream();

    android.graphics.drawable.Drawable _superGetWallpaper();

    int _superGetWallpaperDesiredMinimumHeight();

    int _superGetWallpaperDesiredMinimumWidth();

    android.view.Window _superGetWindow();

    android.view.WindowManager _superGetWindowManager();

    void _superGrantUriPermission(java.lang.String str, android.net.Uri uri, int i17);

    boolean _superHasWindowFocus();

    void _superInvalidateOptionsMenu();

    boolean _superIsActivityTransitionRunning();

    boolean _superIsChangingConfigurations();

    boolean _superIsChild();

    boolean _superIsDestroyed();

    boolean _superIsDeviceProtectedStorage();

    boolean _superIsFinishing();

    boolean _superIsImmersive();

    boolean _superIsInMultiWindowMode();

    boolean _superIsInPictureInPictureMode();

    boolean _superIsLaunchedFromBubble();

    boolean _superIsLocalVoiceInteractionSupported();

    boolean _superIsRestricted();

    boolean _superIsTaskRoot();

    boolean _superIsUiContext();

    boolean _superIsVoiceInteraction();

    boolean _superIsVoiceInteractionRoot();

    android.database.Cursor _superManagedQuery(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2);

    boolean _superMoveDatabaseFrom(android.content.Context context, java.lang.String str);

    boolean _superMoveSharedPreferencesFrom(android.content.Context context, java.lang.String str);

    boolean _superMoveTaskToBack(boolean z17);

    boolean _superNavigateUpTo(android.content.Intent intent);

    boolean _superNavigateUpToFromChild(android.app.Activity activity, android.content.Intent intent);

    void _superOnActionModeFinished(android.view.ActionMode actionMode);

    void _superOnActionModeStarted(android.view.ActionMode actionMode);

    void _superOnActivityReenter(int i17, android.content.Intent intent);

    void _superOnActivityResult(int i17, int i18, android.content.Intent intent);

    void _superOnApplyThemeResource(android.content.res.Resources.Theme theme, int i17, boolean z17);

    void _superOnAttachFragment(android.app.Fragment fragment);

    void _superOnAttachedToWindow();

    void _superOnBackPressed();

    void _superOnChildTitleChanged(android.app.Activity activity, java.lang.CharSequence charSequence);

    void _superOnConfigurationChanged(android.content.res.Configuration configuration);

    void _superOnContentChanged();

    boolean _superOnContextItemSelected(android.view.MenuItem menuItem);

    void _superOnContextMenuClosed(android.view.Menu menu);

    void _superOnCreate(android.os.Bundle bundle);

    void _superOnCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle);

    void _superOnCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo);

    java.lang.CharSequence _superOnCreateDescription();

    android.app.Dialog _superOnCreateDialog(int i17);

    android.app.Dialog _superOnCreateDialog(int i17, android.os.Bundle bundle);

    void _superOnCreateNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder);

    boolean _superOnCreateOptionsMenu(android.view.Menu menu);

    boolean _superOnCreatePanelMenu(int i17, android.view.Menu menu);

    android.view.View _superOnCreatePanelView(int i17);

    boolean _superOnCreateThumbnail(android.graphics.Bitmap bitmap, android.graphics.Canvas canvas);

    android.view.View _superOnCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet);

    android.view.View _superOnCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet);

    void _superOnDestroy();

    void _superOnDetachedFromWindow();

    void _superOnEnterAnimationComplete();

    boolean _superOnGenericMotionEvent(android.view.MotionEvent motionEvent);

    void _superOnGetDirectActions(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer<java.util.List<android.app.DirectAction>> consumer);

    boolean _superOnKeyDown(int i17, android.view.KeyEvent keyEvent);

    boolean _superOnKeyLongPress(int i17, android.view.KeyEvent keyEvent);

    boolean _superOnKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent);

    boolean _superOnKeyShortcut(int i17, android.view.KeyEvent keyEvent);

    boolean _superOnKeyUp(int i17, android.view.KeyEvent keyEvent);

    void _superOnLocalVoiceInteractionStarted();

    void _superOnLocalVoiceInteractionStopped();

    void _superOnLowMemory();

    boolean _superOnMenuOpened(int i17, android.view.Menu menu);

    void _superOnMultiWindowModeChanged(boolean z17);

    void _superOnMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration);

    boolean _superOnNavigateUp();

    boolean _superOnNavigateUpFromChild(android.app.Activity activity);

    void _superOnNewIntent(android.content.Intent intent);

    boolean _superOnOptionsItemSelected(android.view.MenuItem menuItem);

    void _superOnOptionsMenuClosed(android.view.Menu menu);

    void _superOnPanelClosed(int i17, android.view.Menu menu);

    void _superOnPause();

    void _superOnPerformDirectAction(java.lang.String str, android.os.Bundle bundle, android.os.CancellationSignal cancellationSignal, java.util.function.Consumer<android.os.Bundle> consumer);

    void _superOnPictureInPictureModeChanged(boolean z17);

    void _superOnPictureInPictureModeChanged(boolean z17, android.content.res.Configuration configuration);

    boolean _superOnPictureInPictureRequested();

    void _superOnPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState);

    void _superOnPointerCaptureChanged(boolean z17);

    void _superOnPostCreate(android.os.Bundle bundle);

    void _superOnPostCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle);

    void _superOnPostResume();

    void _superOnPrepareDialog(int i17, android.app.Dialog dialog);

    void _superOnPrepareDialog(int i17, android.app.Dialog dialog, android.os.Bundle bundle);

    void _superOnPrepareNavigateUpTaskStack(android.app.TaskStackBuilder taskStackBuilder);

    boolean _superOnPrepareOptionsMenu(android.view.Menu menu);

    boolean _superOnPreparePanel(int i17, android.view.View view, android.view.Menu menu);

    void _superOnProvideAssistContent(android.app.assist.AssistContent assistContent);

    void _superOnProvideAssistData(android.os.Bundle bundle);

    void _superOnProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i17);

    android.net.Uri _superOnProvideReferrer();

    void _superOnRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr);

    void _superOnRestart();

    void _superOnRestoreInstanceState(android.os.Bundle bundle);

    void _superOnRestoreInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle);

    void _superOnResume();

    void _superOnSaveInstanceState(android.os.Bundle bundle);

    void _superOnSaveInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle);

    boolean _superOnSearchRequested();

    boolean _superOnSearchRequested(android.view.SearchEvent searchEvent);

    void _superOnStart();

    void _superOnStateNotSaved();

    void _superOnStop();

    void _superOnTitleChanged(java.lang.CharSequence charSequence, int i17);

    void _superOnTopResumedActivityChanged(boolean z17);

    boolean _superOnTouchEvent(android.view.MotionEvent motionEvent);

    boolean _superOnTrackballEvent(android.view.MotionEvent motionEvent);

    void _superOnTrimMemory(int i17);

    void _superOnUserInteraction();

    void _superOnUserLeaveHint();

    void _superOnVisibleBehindCanceled();

    void _superOnWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams);

    void _superOnWindowFocusChanged(boolean z17);

    android.view.ActionMode _superOnWindowStartingActionMode(android.view.ActionMode.Callback callback);

    android.view.ActionMode _superOnWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17);

    void _superOpenContextMenu(android.view.View view);

    java.io.FileInputStream _superOpenFileInput(java.lang.String str);

    java.io.FileOutputStream _superOpenFileOutput(java.lang.String str, int i17);

    void _superOpenOptionsMenu();

    android.database.sqlite.SQLiteDatabase _superOpenOrCreateDatabase(java.lang.String str, int i17, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory);

    android.database.sqlite.SQLiteDatabase _superOpenOrCreateDatabase(java.lang.String str, int i17, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, android.database.DatabaseErrorHandler databaseErrorHandler);

    void _superOverrideActivityTransition(int i17, int i18, int i19);

    void _superOverrideActivityTransition(int i17, int i18, int i19, int i27);

    void _superOverridePendingTransition(int i17, int i18);

    void _superOverridePendingTransition(int i17, int i18, int i19);

    android.graphics.drawable.Drawable _superPeekWallpaper();

    void _superPostponeEnterTransition();

    void _superRecreate();

    void _superRegisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks);

    void _superRegisterComponentCallbacks(android.content.ComponentCallbacks componentCallbacks);

    void _superRegisterDeviceIdChangeListener(java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer);

    void _superRegisterForContextMenu(android.view.View view);

    android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter);

    android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i17);

    android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler);

    android.content.Intent _superRegisterReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17);

    void _superRegisterScreenCaptureCallback(java.util.concurrent.Executor executor, android.app.Activity.ScreenCaptureCallback screenCaptureCallback);

    boolean _superReleaseInstance();

    void _superRemoveDialog(int i17);

    void _superRemoveStickyBroadcast(android.content.Intent intent);

    void _superRemoveStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle);

    void _superReportFullyDrawn();

    android.view.DragAndDropPermissions _superRequestDragAndDropPermissions(android.view.DragEvent dragEvent);

    void _superRequestFullscreenMode(int i17, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> outcomeReceiver);

    void _superRequestPermissions(java.lang.String[] strArr, int i17);

    void _superRequestShowKeyboardShortcuts();

    boolean _superRequestVisibleBehind(boolean z17);

    boolean _superRequestWindowFeature(int i17);

    <T extends android.view.View> T _superRequireViewById(int i17);

    void _superRevokeSelfPermissionOnKill(java.lang.String str);

    void _superRevokeSelfPermissionsOnKill(java.util.Collection<java.lang.String> collection);

    void _superRevokeUriPermission(android.net.Uri uri, int i17);

    void _superRevokeUriPermission(java.lang.String str, android.net.Uri uri, int i17);

    void _superRunOnUiThread(java.lang.Runnable runnable);

    void _superSendBroadcast(android.content.Intent intent);

    void _superSendBroadcast(android.content.Intent intent, java.lang.String str);

    void _superSendBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle);

    void _superSendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle);

    void _superSendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, java.lang.String str);

    void _superSendBroadcastWithMultiplePermissions(android.content.Intent intent, java.lang.String[] strArr);

    void _superSendOrderedBroadcast(android.content.Intent intent, int i17, java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, java.lang.String str3, android.os.Bundle bundle, android.os.Bundle bundle2);

    void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str);

    void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle);

    void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle);

    void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle2);

    void _superSendOrderedBroadcast(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str3, android.os.Bundle bundle);

    void _superSendOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, java.lang.String str, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle);

    void _superSendStickyBroadcast(android.content.Intent intent);

    void _superSendStickyBroadcast(android.content.Intent intent, android.os.Bundle bundle);

    void _superSendStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle);

    void _superSendStickyOrderedBroadcast(android.content.Intent intent, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str, android.os.Bundle bundle);

    void _superSendStickyOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str, android.os.Bundle bundle);

    void _superSetActionBar(android.widget.Toolbar toolbar);

    void _superSetContentTransitionManager(android.transition.TransitionManager transitionManager);

    void _superSetContentView(int i17);

    void _superSetContentView(android.view.View view);

    void _superSetContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    void _superSetDefaultKeyMode(int i17);

    void _superSetEnterSharedElementCallback(android.app.SharedElementCallback sharedElementCallback);

    void _superSetExitSharedElementCallback(android.app.SharedElementCallback sharedElementCallback);

    void _superSetFeatureDrawable(int i17, android.graphics.drawable.Drawable drawable);

    void _superSetFeatureDrawableAlpha(int i17, int i18);

    void _superSetFeatureDrawableResource(int i17, int i18);

    void _superSetFeatureDrawableUri(int i17, android.net.Uri uri);

    void _superSetFinishOnTouchOutside(boolean z17);

    void _superSetImmersive(boolean z17);

    void _superSetInheritShowWhenLocked(boolean z17);

    void _superSetIntent(android.content.Intent intent);

    void _superSetLocusContext(android.content.LocusId locusId, android.os.Bundle bundle);

    void _superSetMediaController(android.media.session.MediaController mediaController);

    void _superSetPictureInPictureParams(android.app.PictureInPictureParams pictureInPictureParams);

    void _superSetProgress(int i17);

    void _superSetProgressBarIndeterminate(boolean z17);

    void _superSetProgressBarIndeterminateVisibility(boolean z17);

    void _superSetProgressBarVisibility(boolean z17);

    void _superSetRecentsScreenshotEnabled(boolean z17);

    void _superSetRequestedOrientation(int i17);

    void _superSetResult(int i17);

    void _superSetResult(int i17, android.content.Intent intent);

    void _superSetSecondaryProgress(int i17);

    void _superSetShouldDockBigOverlays(boolean z17);

    void _superSetShowWhenLocked(boolean z17);

    void _superSetTaskDescription(android.app.ActivityManager.TaskDescription taskDescription);

    void _superSetTheme(int i17);

    void _superSetTheme(android.content.res.Resources.Theme theme);

    void _superSetTitle(int i17);

    void _superSetTitle(java.lang.CharSequence charSequence);

    void _superSetTitleColor(int i17);

    boolean _superSetTranslucent(boolean z17);

    void _superSetTurnScreenOn(boolean z17);

    void _superSetVisible(boolean z17);

    void _superSetVolumeControlStream(int i17);

    void _superSetVrModeEnabled(boolean z17, android.content.ComponentName componentName);

    void _superSetWallpaper(android.graphics.Bitmap bitmap);

    void _superSetWallpaper(java.io.InputStream inputStream);

    boolean _superShouldDockBigOverlays();

    boolean _superShouldShowRequestPermissionRationale(java.lang.String str);

    boolean _superShouldUpRecreateTask(android.content.Intent intent);

    boolean _superShowAssist(android.os.Bundle bundle);

    void _superShowDialog(int i17);

    boolean _superShowDialog(int i17, android.os.Bundle bundle);

    void _superShowLockTaskEscapeMessage();

    android.view.ActionMode _superStartActionMode(android.view.ActionMode.Callback callback);

    android.view.ActionMode _superStartActionMode(android.view.ActionMode.Callback callback, int i17);

    void _superStartActivities(android.content.Intent[] intentArr);

    void _superStartActivities(android.content.Intent[] intentArr, android.os.Bundle bundle);

    void _superStartActivity(android.content.Intent intent);

    void _superStartActivity(android.content.Intent intent, android.os.Bundle bundle);

    void _superStartActivityForResult(android.content.Intent intent, int i17);

    void _superStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle);

    void _superStartActivityFromChild(android.app.Activity activity, android.content.Intent intent, int i17);

    void _superStartActivityFromChild(android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle);

    void _superStartActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17);

    void _superStartActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle);

    boolean _superStartActivityIfNeeded(android.content.Intent intent, int i17);

    boolean _superStartActivityIfNeeded(android.content.Intent intent, int i17, android.os.Bundle bundle);

    android.content.ComponentName _superStartForegroundService(android.content.Intent intent);

    boolean _superStartInstrumentation(android.content.ComponentName componentName, java.lang.String str, android.os.Bundle bundle);

    void _superStartIntentSender(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18, int i19);

    void _superStartIntentSender(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18, int i19, android.os.Bundle bundle);

    void _superStartIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27);

    void _superStartIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle);

    void _superStartIntentSenderFromChild(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27);

    void _superStartIntentSenderFromChild(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle);

    void _superStartLocalVoiceInteraction(android.os.Bundle bundle);

    void _superStartLockTask();

    void _superStartManagingCursor(android.database.Cursor cursor);

    boolean _superStartNextMatchingActivity(android.content.Intent intent);

    boolean _superStartNextMatchingActivity(android.content.Intent intent, android.os.Bundle bundle);

    void _superStartPostponedEnterTransition();

    void _superStartSearch(java.lang.String str, boolean z17, android.os.Bundle bundle, boolean z18);

    android.content.ComponentName _superStartService(android.content.Intent intent);

    void _superStopLocalVoiceInteraction();

    void _superStopLockTask();

    void _superStopManagingCursor(android.database.Cursor cursor);

    boolean _superStopService(android.content.Intent intent);

    void _superTakeKeyEvents(boolean z17);

    void _superTriggerSearch(java.lang.String str, android.os.Bundle bundle);

    void _superUnbindService(android.content.ServiceConnection serviceConnection);

    void _superUnregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks);

    void _superUnregisterComponentCallbacks(android.content.ComponentCallbacks componentCallbacks);

    void _superUnregisterDeviceIdChangeListener(java.util.function.IntConsumer intConsumer);

    void _superUnregisterForContextMenu(android.view.View view);

    void _superUnregisterReceiver(android.content.BroadcastReceiver broadcastReceiver);

    void _superUnregisterScreenCaptureCallback(android.app.Activity.ScreenCaptureCallback screenCaptureCallback);

    void _superUpdateServiceGroup(android.content.ServiceConnection serviceConnection, int i17, int i18);

    void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    void applyOverrideConfiguration(android.content.res.Configuration configuration);

    void attachBaseContext(android.content.Context context);

    boolean bindIsolatedService(android.content.Intent intent, int i17, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection);

    boolean bindIsolatedService(android.content.Intent intent, android.content.Context.BindServiceFlags bindServiceFlags, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection);

    boolean bindService(android.content.Intent intent, int i17, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection);

    boolean bindService(android.content.Intent intent, android.content.Context.BindServiceFlags bindServiceFlags, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection);

    boolean bindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17);

    boolean bindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, android.content.Context.BindServiceFlags bindServiceFlags);

    boolean bindServiceAsUser(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, android.os.UserHandle userHandle);

    boolean bindServiceAsUser(android.content.Intent intent, android.content.ServiceConnection serviceConnection, android.content.Context.BindServiceFlags bindServiceFlags, android.os.UserHandle userHandle);

    int checkCallingOrSelfPermission(java.lang.String str);

    int checkCallingOrSelfUriPermission(android.net.Uri uri, int i17);

    int[] checkCallingOrSelfUriPermissions(java.util.List<android.net.Uri> list, int i17);

    int checkCallingPermission(java.lang.String str);

    int checkCallingUriPermission(android.net.Uri uri, int i17);

    int[] checkCallingUriPermissions(java.util.List<android.net.Uri> list, int i17);

    int checkPermission(java.lang.String str, int i17, int i18);

    int checkSelfPermission(java.lang.String str);

    int checkUriPermission(android.net.Uri uri, int i17, int i18, int i19);

    int checkUriPermission(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i17, int i18, int i19);

    int[] checkUriPermissions(java.util.List<android.net.Uri> list, int i17, int i18, int i19);

    void clearOverrideActivityTransition(int i17);

    void clearWallpaper();

    void closeContextMenu();

    void closeOptionsMenu();

    android.content.Context createAttributionContext(java.lang.String str);

    android.content.Context createConfigurationContext(android.content.res.Configuration configuration);

    android.content.Context createContext(android.content.ContextParams contextParams);

    android.content.Context createContextForSplit(java.lang.String str);

    android.content.Context createDeviceContext(int i17);

    android.content.Context createDeviceProtectedStorageContext();

    android.content.Context createDisplayContext(android.view.Display display);

    android.content.Context createPackageContext(java.lang.String str, int i17);

    android.app.PendingIntent createPendingResult(int i17, android.content.Intent intent, int i18);

    android.content.Context createWindowContext(int i17, android.os.Bundle bundle);

    android.content.Context createWindowContext(android.view.Display display, int i17, android.os.Bundle bundle);

    java.lang.String[] databaseList();

    boolean deleteDatabase(java.lang.String str);

    boolean deleteFile(java.lang.String str);

    boolean deleteSharedPreferences(java.lang.String str);

    void dismissDialog(int i17);

    void dismissKeyboardShortcutsHelper();

    boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent);

    boolean dispatchKeyEvent(android.view.KeyEvent keyEvent);

    boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent);

    boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent);

    boolean dispatchTouchEvent(android.view.MotionEvent motionEvent);

    boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent);

    void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    void enforceCallingOrSelfPermission(java.lang.String str, java.lang.String str2);

    void enforceCallingOrSelfUriPermission(android.net.Uri uri, int i17, java.lang.String str);

    void enforceCallingPermission(java.lang.String str, java.lang.String str2);

    void enforceCallingUriPermission(android.net.Uri uri, int i17, java.lang.String str);

    void enforcePermission(java.lang.String str, int i17, int i18, java.lang.String str2);

    void enforceUriPermission(android.net.Uri uri, int i17, int i18, int i19, java.lang.String str);

    void enforceUriPermission(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3);

    void enterPictureInPictureMode();

    boolean enterPictureInPictureMode(android.app.PictureInPictureParams pictureInPictureParams);

    java.lang.String[] fileList();

    <T extends android.view.View> T findViewById(int i17);

    void finish();

    void finishActivity(int i17);

    void finishActivityFromChild(android.app.Activity activity, int i17);

    void finishAffinity();

    void finishAfterTransition();

    void finishAndRemoveTask();

    void finishFromChild(android.app.Activity activity);

    android.app.ActionBar getActionBar();

    android.app.Application getApplication();

    android.content.Context getApplicationContext();

    android.content.pm.ApplicationInfo getApplicationInfo();

    android.content.res.AssetManager getAssets();

    android.content.AttributionSource getAttributionSource();

    java.lang.String getAttributionTag();

    android.content.Context getBaseContext();

    java.io.File getCacheDir();

    android.content.ComponentName getCallingActivity();

    java.lang.String getCallingPackage();

    int getChangingConfigurations();

    java.lang.ClassLoader getClassLoader();

    java.io.File getCodeCacheDir();

    android.content.ComponentName getComponentName();

    android.content.ContentResolver getContentResolver();

    android.transition.Scene getContentScene();

    android.transition.TransitionManager getContentTransitionManager();

    android.view.View getCurrentFocus();

    java.io.File getDataDir();

    java.io.File getDatabasePath(java.lang.String str);

    int getDeviceId();

    java.io.File getDir(java.lang.String str, int i17);

    android.view.Display getDisplay();

    java.io.File getExternalCacheDir();

    java.io.File[] getExternalCacheDirs();

    java.io.File getExternalFilesDir(java.lang.String str);

    java.io.File[] getExternalFilesDirs(java.lang.String str);

    java.io.File[] getExternalMediaDirs();

    java.io.File getFileStreamPath(java.lang.String str);

    java.io.File getFilesDir();

    android.app.FragmentManager getFragmentManager();

    android.content.Intent getIntent();

    java.lang.Object getLastNonConfigurationInstance();

    java.lang.String getLaunchedFromPackage();

    int getLaunchedFromUid();

    android.view.LayoutInflater getLayoutInflater();

    android.app.LoaderManager getLoaderManager();

    java.lang.String getLocalClassName();

    java.util.concurrent.Executor getMainExecutor();

    android.os.Looper getMainLooper();

    int getMaxNumPictureInPictureActions();

    android.media.session.MediaController getMediaController();

    android.view.MenuInflater getMenuInflater();

    java.io.File getNoBackupFilesDir();

    java.io.File getObbDir();

    java.io.File[] getObbDirs();

    android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher();

    java.lang.String getOpPackageName();

    java.lang.String getPackageCodePath();

    android.content.pm.PackageManager getPackageManager();

    java.lang.String getPackageName();

    java.lang.String getPackageResourcePath();

    android.content.ContextParams getParams();

    android.app.Activity getParent();

    android.content.Intent getParentActivityIntent();

    android.content.SharedPreferences getPreferences(int i17);

    android.net.Uri getReferrer();

    int getRequestedOrientation();

    android.content.res.Resources getResources();

    android.view.SearchEvent getSearchEvent();

    android.content.SharedPreferences getSharedPreferences(java.lang.String str, int i17);

    android.window.SplashScreen getSplashScreen();

    java.lang.Object getSystemService(java.lang.String str);

    java.lang.String getSystemServiceName(java.lang.Class<?> cls);

    int getTaskId();

    android.content.res.Resources.Theme getTheme();

    java.lang.CharSequence getTitle();

    int getTitleColor();

    android.app.VoiceInteractor getVoiceInteractor();

    int getVolumeControlStream();

    android.graphics.drawable.Drawable getWallpaper();

    int getWallpaperDesiredMinimumHeight();

    int getWallpaperDesiredMinimumWidth();

    android.view.Window getWindow();

    android.view.WindowManager getWindowManager();

    void grantUriPermission(java.lang.String str, android.net.Uri uri, int i17);

    boolean hasWindowFocus();

    void invalidateOptionsMenu();

    boolean isActivityTransitionRunning();

    boolean isChangingConfigurations();

    boolean isChild();

    boolean isDestroyed();

    boolean isDeviceProtectedStorage();

    boolean isFinishing();

    boolean isImmersive();

    boolean isInMultiWindowMode();

    boolean isInPictureInPictureMode();

    boolean isLaunchedFromBubble();

    boolean isLocalVoiceInteractionSupported();

    boolean isRestricted();

    boolean isTaskRoot();

    boolean isUiContext();

    boolean isVoiceInteraction();

    boolean isVoiceInteractionRoot();

    android.database.Cursor managedQuery(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2);

    boolean moveDatabaseFrom(android.content.Context context, java.lang.String str);

    boolean moveSharedPreferencesFrom(android.content.Context context, java.lang.String str);

    boolean moveTaskToBack(boolean z17);

    boolean navigateUpTo(android.content.Intent intent);

    boolean navigateUpToFromChild(android.app.Activity activity, android.content.Intent intent);

    void onActionModeFinished(android.view.ActionMode actionMode);

    void onActionModeStarted(android.view.ActionMode actionMode);

    void onAttachedToWindow();

    void onContentChanged();

    boolean onCreatePanelMenu(int i17, android.view.Menu menu);

    android.view.View onCreatePanelView(int i17);

    void onDetachedFromWindow();

    boolean onMenuOpened(int i17, android.view.Menu menu);

    void onPanelClosed(int i17, android.view.Menu menu);

    void onPointerCaptureChanged(boolean z17);

    boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu);

    void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i17);

    boolean onSearchRequested();

    boolean onSearchRequested(android.view.SearchEvent searchEvent);

    void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z17);

    android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback);

    android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17);

    void openContextMenu(android.view.View view);

    java.io.FileInputStream openFileInput(java.lang.String str);

    java.io.FileOutputStream openFileOutput(java.lang.String str, int i17);

    void openOptionsMenu();

    android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String str, int i17, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory);

    android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String str, int i17, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, android.database.DatabaseErrorHandler databaseErrorHandler);

    void overrideActivityTransition(int i17, int i18, int i19);

    void overrideActivityTransition(int i17, int i18, int i19, int i27);

    void overridePendingTransition(int i17, int i18);

    void overridePendingTransition(int i17, int i18, int i19);

    android.graphics.drawable.Drawable peekWallpaper();

    void postponeEnterTransition();

    void recreate();

    void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks);

    void registerComponentCallbacks(android.content.ComponentCallbacks componentCallbacks);

    void registerDeviceIdChangeListener(java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer);

    void registerForContextMenu(android.view.View view);

    android.content.Intent registerReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter);

    android.content.Intent registerReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i17);

    android.content.Intent registerReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler);

    android.content.Intent registerReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17);

    void registerScreenCaptureCallback(java.util.concurrent.Executor executor, android.app.Activity.ScreenCaptureCallback screenCaptureCallback);

    boolean releaseInstance();

    void removeDialog(int i17);

    void removeStickyBroadcast(android.content.Intent intent);

    void removeStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle);

    void reportFullyDrawn();

    android.view.DragAndDropPermissions requestDragAndDropPermissions(android.view.DragEvent dragEvent);

    void requestFullscreenMode(int i17, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> outcomeReceiver);

    void requestPermissions(java.lang.String[] strArr, int i17);

    void requestShowKeyboardShortcuts();

    boolean requestVisibleBehind(boolean z17);

    boolean requestWindowFeature(int i17);

    <T extends android.view.View> T requireViewById(int i17);

    void revokeSelfPermissionOnKill(java.lang.String str);

    void revokeSelfPermissionsOnKill(java.util.Collection<java.lang.String> collection);

    void revokeUriPermission(android.net.Uri uri, int i17);

    void revokeUriPermission(java.lang.String str, android.net.Uri uri, int i17);

    void runOnUiThread(java.lang.Runnable runnable);

    void sendBroadcast(android.content.Intent intent);

    void sendBroadcast(android.content.Intent intent, java.lang.String str);

    void sendBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle);

    void sendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle);

    void sendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, java.lang.String str);

    void sendBroadcastWithMultiplePermissions(android.content.Intent intent, java.lang.String[] strArr);

    void sendOrderedBroadcast(android.content.Intent intent, int i17, java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, java.lang.String str3, android.os.Bundle bundle, android.os.Bundle bundle2);

    void sendOrderedBroadcast(android.content.Intent intent, java.lang.String str);

    void sendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle);

    void sendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle);

    void sendOrderedBroadcast(android.content.Intent intent, java.lang.String str, android.os.Bundle bundle, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle2);

    void sendOrderedBroadcast(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str3, android.os.Bundle bundle);

    void sendOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, java.lang.String str, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str2, android.os.Bundle bundle);

    void sendStickyBroadcast(android.content.Intent intent);

    void sendStickyBroadcast(android.content.Intent intent, android.os.Bundle bundle);

    void sendStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle);

    void sendStickyOrderedBroadcast(android.content.Intent intent, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str, android.os.Bundle bundle);

    void sendStickyOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle userHandle, android.content.BroadcastReceiver broadcastReceiver, android.os.Handler handler, int i17, java.lang.String str, android.os.Bundle bundle);

    void setActionBar(android.widget.Toolbar toolbar);

    void setContentTransitionManager(android.transition.TransitionManager transitionManager);

    void setContentView(int i17);

    void setContentView(android.view.View view);

    void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    void setDefaultKeyMode(int i17);

    void setEnterSharedElementCallback(android.app.SharedElementCallback sharedElementCallback);

    void setExitSharedElementCallback(android.app.SharedElementCallback sharedElementCallback);

    void setFeatureDrawable(int i17, android.graphics.drawable.Drawable drawable);

    void setFeatureDrawableAlpha(int i17, int i18);

    void setFeatureDrawableResource(int i17, int i18);

    void setFeatureDrawableUri(int i17, android.net.Uri uri);

    void setFinishOnTouchOutside(boolean z17);

    void setImmersive(boolean z17);

    void setInheritShowWhenLocked(boolean z17);

    void setIntent(android.content.Intent intent);

    void setLocusContext(android.content.LocusId locusId, android.os.Bundle bundle);

    void setMediaController(android.media.session.MediaController mediaController);

    void setPictureInPictureParams(android.app.PictureInPictureParams pictureInPictureParams);

    void setProgress(int i17);

    void setProgressBarIndeterminate(boolean z17);

    void setProgressBarIndeterminateVisibility(boolean z17);

    void setProgressBarVisibility(boolean z17);

    void setRecentsScreenshotEnabled(boolean z17);

    void setRequestedOrientation(int i17);

    void setResult(int i17);

    void setResult(int i17, android.content.Intent intent);

    void setSecondaryProgress(int i17);

    void setShouldDockBigOverlays(boolean z17);

    void setShowWhenLocked(boolean z17);

    void setTaskDescription(android.app.ActivityManager.TaskDescription taskDescription);

    void setTheme(int i17);

    void setTheme(android.content.res.Resources.Theme theme);

    void setTitle(int i17);

    void setTitle(java.lang.CharSequence charSequence);

    void setTitleColor(int i17);

    boolean setTranslucent(boolean z17);

    void setTurnScreenOn(boolean z17);

    void setVisible(boolean z17);

    void setVolumeControlStream(int i17);

    void setVrModeEnabled(boolean z17, android.content.ComponentName componentName);

    void setWallpaper(android.graphics.Bitmap bitmap);

    void setWallpaper(java.io.InputStream inputStream);

    boolean shouldDockBigOverlays();

    boolean shouldShowRequestPermissionRationale(java.lang.String str);

    boolean shouldUpRecreateTask(android.content.Intent intent);

    boolean showAssist(android.os.Bundle bundle);

    void showDialog(int i17);

    boolean showDialog(int i17, android.os.Bundle bundle);

    void showLockTaskEscapeMessage();

    android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback);

    android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback, int i17);

    void startActivities(android.content.Intent[] intentArr);

    void startActivities(android.content.Intent[] intentArr, android.os.Bundle bundle);

    void startActivity(android.content.Intent intent);

    void startActivity(android.content.Intent intent, android.os.Bundle bundle);

    void startActivityForResult(android.content.Intent intent, int i17);

    void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle);

    void startActivityFromChild(android.app.Activity activity, android.content.Intent intent, int i17);

    void startActivityFromChild(android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle);

    void startActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17);

    void startActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle);

    boolean startActivityIfNeeded(android.content.Intent intent, int i17);

    boolean startActivityIfNeeded(android.content.Intent intent, int i17, android.os.Bundle bundle);

    android.content.ComponentName startForegroundService(android.content.Intent intent);

    boolean startInstrumentation(android.content.ComponentName componentName, java.lang.String str, android.os.Bundle bundle);

    void startIntentSender(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18, int i19);

    void startIntentSender(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18, int i19, android.os.Bundle bundle);

    void startIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27);

    void startIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle);

    void startIntentSenderFromChild(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27);

    void startIntentSenderFromChild(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle);

    void startLocalVoiceInteraction(android.os.Bundle bundle);

    void startLockTask();

    void startManagingCursor(android.database.Cursor cursor);

    boolean startNextMatchingActivity(android.content.Intent intent);

    boolean startNextMatchingActivity(android.content.Intent intent, android.os.Bundle bundle);

    void startPostponedEnterTransition();

    void startSearch(java.lang.String str, boolean z17, android.os.Bundle bundle, boolean z18);

    android.content.ComponentName startService(android.content.Intent intent);

    void stopLocalVoiceInteraction();

    void stopLockTask();

    void stopManagingCursor(android.database.Cursor cursor);

    boolean stopService(android.content.Intent intent);

    void takeKeyEvents(boolean z17);

    void triggerSearch(java.lang.String str, android.os.Bundle bundle);

    void unbindService(android.content.ServiceConnection serviceConnection);

    void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks);

    void unregisterComponentCallbacks(android.content.ComponentCallbacks componentCallbacks);

    void unregisterDeviceIdChangeListener(java.util.function.IntConsumer intConsumer);

    void unregisterForContextMenu(android.view.View view);

    void unregisterReceiver(android.content.BroadcastReceiver broadcastReceiver);

    void unregisterScreenCaptureCallback(android.app.Activity.ScreenCaptureCallback screenCaptureCallback);

    void updateServiceGroup(android.content.ServiceConnection serviceConnection, int i17, int i18);
}
