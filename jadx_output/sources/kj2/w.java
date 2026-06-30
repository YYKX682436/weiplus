package kj2;

/* loaded from: classes10.dex */
public final class w implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.x f308437d;

    public w(kj2.x xVar) {
        this.f308437d = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewGroup.LayoutParams layoutParams;
        kj2.x xVar = this.f308437d;
        xVar.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = xVar.getWaveView();
        if (waveView == null || (layoutParams = waveView.getLayoutParams()) == null) {
            return true;
        }
        int width = (int) (xVar.getRoot().getWidth() / 0.7083333f);
        layoutParams.width = width;
        layoutParams.height = width;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView2 = xVar.getWaveView();
        if (waveView2 == null) {
            return true;
        }
        waveView2.setInitRadius(xVar.getRoot().getWidth() / 2.0f);
        return true;
    }
}
