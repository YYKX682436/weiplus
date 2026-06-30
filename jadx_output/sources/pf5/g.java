package pf5;

/* loaded from: classes15.dex */
public interface g {
    void onActivityResult(int i17, int i18, android.content.Intent intent);

    boolean onBackPressed();

    void onBeforeFinish(android.content.Intent intent);

    void onConfigurationChanged(android.content.res.Configuration configuration);

    void onCreateAfter(android.os.Bundle bundle);

    void onCreateBefore(android.os.Bundle bundle);

    void onDestroy();

    boolean onKeyDown(int i17, android.view.KeyEvent keyEvent);

    boolean onKeyUp(int i17, android.view.KeyEvent keyEvent);

    void onNewIntent(android.content.Intent intent);

    void onPause();

    void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr);

    void onRestoreInstanceState(android.os.Bundle bundle);

    void onResume();

    void onSaveInstanceState(android.os.Bundle bundle);

    void onStart();

    void onStop();
}
