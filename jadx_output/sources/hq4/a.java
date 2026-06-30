package hq4;

/* loaded from: classes14.dex */
public interface a {
    void dealContentView(android.view.View view);

    void finish();

    int getForceOrientation();

    int getLayoutId();

    void importUIComponents(java.util.HashSet hashSet);

    void onActivityResult(int i17, int i18, android.content.Intent intent);

    boolean onBackPressed();

    void onConfigurationChanged(android.content.res.Configuration configuration);

    void onCreate(android.os.Bundle bundle);

    void onDestroy();

    boolean onKeyDown(int i17, android.view.KeyEvent keyEvent);

    void onNewIntent(android.content.Intent intent);

    void onPause();

    void onPostResume();

    void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr);

    void onResume();

    void onStart();

    void onStop();

    void onSwipeBackFinish();

    void onTrimMemory(int i17);

    boolean onUserLeaveHint();

    android.view.View provideCustomActivityContentView();
}
