package io.flutter.embedding.android;

/* loaded from: classes14.dex */
public class WindowInfoRepositoryCallbackAdapterWrapper {
    final androidx.window.java.layout.WindowInfoTrackerCallbackAdapter adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(androidx.window.java.layout.WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.adapter = windowInfoTrackerCallbackAdapter;
    }

    public void addWindowLayoutInfoListener(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a aVar) {
        this.adapter.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void removeWindowLayoutInfoListener(m3.a aVar) {
        this.adapter.removeWindowLayoutInfoListener(aVar);
    }
}
