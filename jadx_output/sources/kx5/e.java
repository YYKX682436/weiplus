package kx5;

/* loaded from: classes15.dex */
public class e implements io.flutter.embedding.engine.renderer.FlutterUiDisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.FlutterView f313290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kx5.n f313291b;

    public e(kx5.n nVar, io.flutter.embedding.android.FlutterView flutterView) {
        this.f313291b = nVar;
        this.f313290a = flutterView;
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiDisplayed() {
        final io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = this.f313290a.getAttachedRenderer();
        if (attachedRenderer != null) {
            attachedRenderer.removeIsDisplayingFlutterUiListener(this);
            attachedRenderer.onNextFrameDisplayed(new java.lang.Runnable() { // from class: kx5.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.engine.renderer.FlutterRenderer.this.requestDrawLastFrame();
                }
            });
            this.f313291b.f313319i.postDelayed(new java.lang.Runnable() { // from class: kx5.e$$b
                @Override // java.lang.Runnable
                public final void run() {
                    final io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer = io.flutter.embedding.engine.renderer.FlutterRenderer.this;
                    flutterRenderer.onNextFrameDisplayed(new java.lang.Runnable() { // from class: kx5.e$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            io.flutter.embedding.engine.renderer.FlutterRenderer.this.requestDrawLastFrame();
                        }
                    });
                    flutterRenderer.requestDrawLastFrame();
                }
            }, 100L);
            attachedRenderer.requestDrawLastFrame();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiNoLongerDisplayed() {
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = this.f313290a.getAttachedRenderer();
        if (attachedRenderer != null) {
            attachedRenderer.removeIsDisplayingFlutterUiListener(this);
        }
    }
}
