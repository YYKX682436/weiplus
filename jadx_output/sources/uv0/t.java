package uv0;

/* loaded from: classes5.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431350d;

    public t(uv0.u uVar) {
        this.f431350d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv0.u uVar = this.f431350d;
        vv0.k kVar = uVar.f431351J;
        vv0.k kVar2 = vv0.k.f440383f;
        if (kotlin.jvm.internal.o.b(kVar, vv0.k.f440383f)) {
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar = uVar.N;
            if (adjustSeekBar != null) {
                adjustSeekBar.setVisibility(8);
            }
            android.widget.TextView textView = uVar.P;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar2 = uVar.N;
            if (adjustSeekBar2 != null) {
                adjustSeekBar2.setVisibility(0);
            }
            android.widget.TextView textView2 = uVar.P;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.view.ViewGroup viewGroup = uVar.M;
            if (viewGroup != null) {
                viewGroup.setEnabled(true);
            }
            android.view.ViewGroup viewGroup2 = uVar.M;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(1.0f);
            }
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar3 = uVar.N;
            if (adjustSeekBar3 != null) {
                adjustSeekBar3.setProgress(uVar.K);
            }
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar4 = uVar.N;
            if (adjustSeekBar4 != null) {
                adjustSeekBar4.setEnabled(true);
            }
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar5 = uVar.N;
        if (adjustSeekBar5 != null) {
            uv0.u.O(uVar, adjustSeekBar5.getProgress());
        }
    }
}
