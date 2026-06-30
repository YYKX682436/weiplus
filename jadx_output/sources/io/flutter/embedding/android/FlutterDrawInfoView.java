package io.flutter.embedding.android;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class FlutterDrawInfoView extends android.view.View {
    private static final java.lang.String TAG = "FlutterDrawInfoView";
    private io.flutter.embedding.engine.FlutterEngine flutterEngine;
    private boolean needNotifyDraw;

    public FlutterDrawInfoView(android.content.Context context) {
        super(context);
        this.needNotifyDraw = false;
    }

    public void bindFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        this.flutterEngine = flutterEngine;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        io.flutter.Log.i(TAG, "onAttachedToWindow");
        this.needNotifyDraw = true;
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        io.flutter.Log.i(TAG, "onDetachedFromWindow");
        this.needNotifyDraw = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.needNotifyDraw) {
            io.flutter.Log.i(TAG, "onDraw");
            this.needNotifyDraw = false;
            io.flutter.embedding.engine.FlutterEngine flutterEngine = this.flutterEngine;
            if (flutterEngine != null) {
                flutterEngine.markFlutterViewDraw();
            }
        }
    }
}
