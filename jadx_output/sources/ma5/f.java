package ma5;

/* loaded from: classes11.dex */
public class f extends n.m {

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f325242e;

    public f(android.view.Window.Callback callback, android.app.Activity activity) {
        super(callback);
        this.f325242e = activity;
    }

    @Override // n.m, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return this.f325242e.onWindowStartingActionMode(callback);
    }
}
