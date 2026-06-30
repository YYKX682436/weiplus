package z35;

/* loaded from: classes10.dex */
public final class t implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView f470043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f470044e;

    public t(com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView, android.content.Context context) {
        this.f470043d = finderHeroSeekBarView;
        this.f470044e = context;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView = this.f470043d;
        z35.u heroSeekBarChangeListener = finderHeroSeekBarView.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            lo2.c0 c0Var = (lo2.c0) heroSeekBarChangeListener;
            if (z17) {
                com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI = c0Var.f320108a;
                com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView2 = finderMemberQAVideoUI.f121405w;
                kotlin.jvm.internal.o.d(finderHeroSeekBarView2);
                int i18 = (int) (((i17 * finderHeroSeekBarView2.f191128g) / 2500) / 1000);
                lo2.u uVar = finderMemberQAVideoUI.E;
                uVar.f320170d = i18;
                if (android.os.SystemClock.uptimeMillis() - uVar.f320171e > 100) {
                    uVar.run();
                } else {
                    com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI2 = uVar.f320172f;
                    finderMemberQAVideoUI2.D.removeCallbacks(uVar);
                    finderMemberQAVideoUI2.D.postDelayed(uVar, 100L);
                }
            }
        }
        if (z17) {
            finderHeroSeekBarView.f191129h = i17;
            finderHeroSeekBarView.f191133o = finderHeroSeekBarView.f191128g * i17;
            finderHeroSeekBarView.h(i17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        android.widget.TextView currentTimeTxt;
        android.widget.TextView totalTimeText;
        android.widget.SeekBar heroSeekBar;
        android.widget.SeekBar heroSeekBar2;
        android.widget.SeekBar heroSeekBar3;
        this.f470043d.f191134p = true;
        com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView = this.f470043d;
        finderHeroSeekBarView.f191130i = true;
        wu5.c cVar = finderHeroSeekBarView.f191137s;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f470043d.setHeroProgressDrawable(com.tencent.mm.R.drawable.d1i);
        currentTimeTxt = this.f470043d.getCurrentTimeTxt();
        currentTimeTxt.setVisibility(0);
        totalTimeText = this.f470043d.getTotalTimeText();
        totalTimeText.setVisibility(0);
        heroSeekBar = this.f470043d.getHeroSeekBar();
        heroSeekBar.setPressed(true);
        heroSeekBar2 = this.f470043d.getHeroSeekBar();
        heroSeekBar2.setProgressDrawable(i65.a.i(this.f470044e, com.tencent.mm.R.drawable.d1i));
        heroSeekBar3 = this.f470043d.getHeroSeekBar();
        heroSeekBar3.setThumb(i65.a.i(this.f470044e, com.tencent.mm.R.drawable.d1l));
        z35.u heroSeekBarChangeListener = this.f470043d.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            int i17 = this.f470043d.f191129h;
            ((lo2.c0) heroSeekBarChangeListener).f320109b.pause();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        this.f470043d.f191134p = false;
        z35.u heroSeekBarChangeListener = this.f470043d.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            int i17 = this.f470043d.f191129h;
            lo2.c0 c0Var = (lo2.c0) heroSeekBarChangeListener;
            kotlin.jvm.internal.o.d(c0Var.f320108a.f121405w);
            c0Var.f320109b.a(((i17 * r2.f191128g) / 2500) / 1000.0d, true);
        }
        wu5.c cVar = this.f470043d.f191137s;
        if (cVar != null) {
            cVar.cancel(false);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView = this.f470043d;
        ku5.u0 u0Var = ku5.t0.f312615d;
        z35.s sVar = new z35.s(this.f470043d, this.f470044e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        finderHeroSeekBarView.f191137s = t0Var.z(sVar, 3000L, false);
    }
}
