package km1;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309003d;

    public i(km1.s sVar) {
        this.f309003d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f309003d.f309042v;
            if (magicBrushView != null) {
                magicBrushView.b();
            }
        } catch (java.lang.Exception unused) {
        }
        this.f309003d.f309042v = null;
        this.f309003d.f309041u = null;
    }
}
