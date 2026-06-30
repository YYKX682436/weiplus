package io.flutter.embedding.engine.plugins.activity;

/* loaded from: classes11.dex */
public interface ActivityControlSurface {
    void attachToActivity(io.flutter.embedding.android.ExclusiveAppComponent<android.app.Activity> exclusiveAppComponent, androidx.lifecycle.o oVar);

    void detachFromActivity();

    void detachFromActivityForConfigChanges();

    boolean onActivityResult(int i17, int i18, android.content.Intent intent);

    void onNewIntent(android.content.Intent intent);

    boolean onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr);

    void onRestoreInstanceState(android.os.Bundle bundle);

    void onSaveInstanceState(android.os.Bundle bundle);

    void onUserLeaveHint();
}
