package sh5;

/* loaded from: classes3.dex */
public final class a implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f408031d;

    public a(java.lang.ref.WeakReference videoViewRef) {
        kotlin.jvm.internal.o.g(videoViewRef, "videoViewRef");
        this.f408031d = videoViewRef;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = (com.tencent.mm.pluginsdk.ui.tools.f4) this.f408031d.get();
        if (f4Var != null) {
            f4Var.setMute(true);
        }
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = (com.tencent.mm.pluginsdk.ui.tools.f4) this.f408031d.get();
        if (f4Var != null) {
            f4Var.setMute(false);
        }
    }

    @Override // f25.f
    public void onStop() {
    }
}
