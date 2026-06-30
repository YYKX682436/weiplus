package dq0;

/* loaded from: classes7.dex */
public final class m implements io.flutter.view.TextureRegistry.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cf3.d f242321a;

    public m(cf3.d dVar) {
        this.f242321a = dVar;
    }

    @Override // io.flutter.view.TextureRegistry.OnFrameAvailableListener
    public final void onFrameAvailable(boolean z17) {
        cf3.d dVar = this.f242321a;
        dVar.getClass();
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException("onFrameAvailable should be called on main thread");
        }
        android.graphics.Rect rect = dVar.f40928m;
        if (!kotlin.jvm.internal.o.b(rect, dVar.f40927l) && !dVar.f40921f) {
            dVar.f40916a.f(dVar.f40925j, dVar, rect.left, rect.top, rect.width(), rect.height());
            dVar.f40927l = rect;
        }
        if (dVar.f40920e || dVar.f40921f) {
            return;
        }
        dVar.f40920e = true;
        dVar.f40916a.c(dVar.f40925j, true);
    }
}
