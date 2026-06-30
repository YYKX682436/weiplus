package z35;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView f470041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f470042e;

    public s(com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView, android.content.Context context) {
        this.f470041d = finderHeroSeekBarView;
        this.f470042e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView currentTimeTxt;
        android.widget.TextView totalTimeText;
        android.widget.SeekBar heroSeekBar;
        android.widget.SeekBar heroSeekBar2;
        com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView = this.f470041d;
        finderHeroSeekBarView.setHeroProgressDrawable(com.tencent.mm.R.drawable.d1h);
        currentTimeTxt = finderHeroSeekBarView.getCurrentTimeTxt();
        currentTimeTxt.setVisibility(4);
        totalTimeText = finderHeroSeekBarView.getTotalTimeText();
        totalTimeText.setVisibility(4);
        heroSeekBar = finderHeroSeekBarView.getHeroSeekBar();
        android.content.Context context = this.f470042e;
        heroSeekBar.setProgressDrawable(i65.a.i(context, com.tencent.mm.R.drawable.d1h));
        heroSeekBar2 = finderHeroSeekBarView.getHeroSeekBar();
        heroSeekBar2.setThumb(i65.a.i(context, com.tencent.mm.R.drawable.d1k));
        finderHeroSeekBarView.g(finderHeroSeekBarView.f191131m, false);
        finderHeroSeekBarView.f191130i = true;
    }
}
