package mz1;

/* loaded from: classes16.dex */
public interface c {
    void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle);

    void onActivityDestroyed(android.app.Activity activity);

    void onActivityPaused(android.app.Activity activity);

    void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle);

    void onActivityPostDestroyed(android.app.Activity activity);

    void onActivityPostPaused(android.app.Activity activity);

    void onActivityPostResumed(android.app.Activity activity);

    void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle);

    void onActivityPostStarted(android.app.Activity activity);

    void onActivityPostStopped(android.app.Activity activity);

    void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle);

    void onActivityPreDestroyed(android.app.Activity activity);

    void onActivityPrePaused(android.app.Activity activity);

    void onActivityPreResumed(android.app.Activity activity);

    void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle);

    void onActivityPreStarted(android.app.Activity activity);

    void onActivityPreStopped(android.app.Activity activity);

    void onActivityResumed(android.app.Activity activity);

    void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle);

    void onActivityStarted(android.app.Activity activity);

    void onActivityStopped(android.app.Activity activity);
}
