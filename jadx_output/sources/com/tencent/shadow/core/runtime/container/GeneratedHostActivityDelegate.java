package com.tencent.shadow.core.runtime.container;

/* loaded from: classes14.dex */
public interface GeneratedHostActivityDelegate {
    boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent);

    boolean dispatchKeyEvent(android.view.KeyEvent keyEvent);

    boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent);

    boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent);

    boolean dispatchTouchEvent(android.view.MotionEvent motionEvent);

    boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent);

    void finish();

    android.content.ComponentName getCallingActivity();

    java.lang.ClassLoader getClassLoader();

    android.view.LayoutInflater getLayoutInflater();

    android.content.res.Resources getResources();

    boolean isChangingConfigurations();

    void onActionModeFinished(android.view.ActionMode actionMode);

    void onActionModeStarted(android.view.ActionMode actionMode);

    void onActivityReenter(int i17, android.content.Intent intent);

    void onActivityResult(int i17, int i18, android.content.Intent intent);

    void onApplyThemeResource(android.content.res.Resources.Theme theme, int i17, boolean z17);

    void onAttachFragment(android.app.Fragment fragment);

    void onAttachedToWindow();

    void onBackPressed();

    void onChildTitleChanged(android.app.Activity activity, java.lang.CharSequence charSequence);

    void onConfigurationChanged(android.content.res.Configuration configuration);

    void onContentChanged();

    boolean onContextItemSelected(android.view.MenuItem menuItem);

    void onContextMenuClosed(android.view.Menu menu);

    void onCreate(android.os.Bundle bundle);

    void onCreate(android.os.Bundle bundle, java.lang.Object obj);

    void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo);

    java.lang.CharSequence onCreateDescription();

    android.app.Dialog onCreateDialog(int i17);

    android.app.Dialog onCreateDialog(int i17, android.os.Bundle bundle);

    void onCreateNavigateUpTaskStack(java.lang.Object obj);

    boolean onCreateOptionsMenu(android.view.Menu menu);

    boolean onCreatePanelMenu(int i17, android.view.Menu menu);

    android.view.View onCreatePanelView(int i17);

    boolean onCreateThumbnail(android.graphics.Bitmap bitmap, android.graphics.Canvas canvas);

    android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet);

    android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet);

    void onDestroy();

    void onDetachedFromWindow();

    void onEnterAnimationComplete();

    boolean onGenericMotionEvent(android.view.MotionEvent motionEvent);

    void onGetDirectActions(java.lang.Object obj, java.lang.Object obj2);

    boolean onKeyDown(int i17, android.view.KeyEvent keyEvent);

    boolean onKeyLongPress(int i17, android.view.KeyEvent keyEvent);

    boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent);

    boolean onKeyShortcut(int i17, android.view.KeyEvent keyEvent);

    boolean onKeyUp(int i17, android.view.KeyEvent keyEvent);

    void onLocalVoiceInteractionStarted();

    void onLocalVoiceInteractionStopped();

    void onLowMemory();

    boolean onMenuOpened(int i17, android.view.Menu menu);

    void onMultiWindowModeChanged(boolean z17);

    void onMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration);

    boolean onNavigateUp();

    boolean onNavigateUpFromChild(android.app.Activity activity);

    void onNewIntent(android.content.Intent intent);

    boolean onOptionsItemSelected(android.view.MenuItem menuItem);

    void onOptionsMenuClosed(android.view.Menu menu);

    void onPanelClosed(int i17, android.view.Menu menu);

    void onPause();

    void onPerformDirectAction(java.lang.String str, android.os.Bundle bundle, java.lang.Object obj, java.lang.Object obj2);

    void onPictureInPictureModeChanged(boolean z17);

    void onPictureInPictureModeChanged(boolean z17, android.content.res.Configuration configuration);

    boolean onPictureInPictureRequested();

    void onPictureInPictureUiStateChanged(java.lang.Object obj);

    void onPointerCaptureChanged(boolean z17);

    void onPostCreate(android.os.Bundle bundle);

    void onPostCreate(android.os.Bundle bundle, java.lang.Object obj);

    void onPostResume();

    void onPrepareDialog(int i17, android.app.Dialog dialog);

    void onPrepareDialog(int i17, android.app.Dialog dialog, android.os.Bundle bundle);

    void onPrepareNavigateUpTaskStack(java.lang.Object obj);

    boolean onPrepareOptionsMenu(android.view.Menu menu);

    boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu);

    void onProvideAssistContent(java.lang.Object obj);

    void onProvideAssistData(android.os.Bundle bundle);

    void onProvideKeyboardShortcuts(java.lang.Object obj, android.view.Menu menu, int i17);

    android.net.Uri onProvideReferrer();

    void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr);

    void onRestart();

    void onRestoreInstanceState(android.os.Bundle bundle);

    void onRestoreInstanceState(android.os.Bundle bundle, java.lang.Object obj);

    void onResume();

    void onSaveInstanceState(android.os.Bundle bundle);

    void onSaveInstanceState(android.os.Bundle bundle, java.lang.Object obj);

    boolean onSearchRequested();

    boolean onSearchRequested(java.lang.Object obj);

    void onStart();

    void onStateNotSaved();

    void onStop();

    void onTitleChanged(java.lang.CharSequence charSequence, int i17);

    void onTopResumedActivityChanged(boolean z17);

    boolean onTouchEvent(android.view.MotionEvent motionEvent);

    boolean onTrackballEvent(android.view.MotionEvent motionEvent);

    void onTrimMemory(int i17);

    void onUserInteraction();

    void onUserLeaveHint();

    void onVisibleBehindCanceled();

    void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z17);

    android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback);

    android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17);

    void recreate();
}
