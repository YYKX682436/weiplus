package io.flutter.plugin.editing;

/* loaded from: classes15.dex */
public class ScribePlugin implements io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler {
    private static final java.lang.String TAG = "ScribePlugin";
    private final android.view.inputmethod.InputMethodManager mInputMethodManager;
    private final io.flutter.embedding.engine.systemchannels.ScribeChannel mScribeChannel;
    private android.view.View mView;

    public ScribePlugin(android.view.View view, android.view.inputmethod.InputMethodManager inputMethodManager, io.flutter.embedding.engine.systemchannels.ScribeChannel scribeChannel) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.mView = view;
        this.mInputMethodManager = inputMethodManager;
        this.mScribeChannel = scribeChannel;
        scribeChannel.setScribeMethodHandler(this);
    }

    public void destroy() {
        this.mScribeChannel.setScribeMethodHandler(null);
        setView(null);
    }

    @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
    public boolean isFeatureAvailable() {
        return android.os.Build.VERSION.SDK_INT >= 34 && isStylusHandwritingAvailable();
    }

    @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
    public boolean isStylusHandwritingAvailable() {
        return this.mInputMethodManager.isStylusHandwritingAvailable();
    }

    public void setView(android.view.View view) {
        if (view == this.mView) {
            return;
        }
        io.flutter.Log.i(TAG, "setView from " + this.mView + " to: " + view);
        this.mView = view;
    }

    @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
    public void startStylusHandwriting() {
        this.mInputMethodManager.startStylusHandwriting(this.mView);
    }
}
