package io.flutter.embedding.engine;

/* loaded from: classes15.dex */
public class FlutterOverlaySurface {

    /* renamed from: id, reason: collision with root package name */
    private final int f293205id;
    private final android.view.Surface surface;

    public FlutterOverlaySurface(int i17, android.view.Surface surface) {
        this.f293205id = i17;
        this.surface = surface;
    }

    public int getId() {
        return this.f293205id;
    }

    public android.view.Surface getSurface() {
        return this.surface;
    }
}
