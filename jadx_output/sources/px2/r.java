package px2;

/* loaded from: classes2.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358918d;

    public r(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        this.f358918d = finderLandscapePreviewLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358918d;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = finderLandscapePreviewLayout.f132564t;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.getLocationOnScreen(iArr);
        }
        android.widget.SeekBar seekBar = new android.widget.SeekBar(finderLandscapePreviewLayout.getContext());
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = finderLandscapePreviewLayout.f132564t;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(finderThumbPlayerProxy2 != null ? finderThumbPlayerProxy2.getWidth() : 0, (int) seekBar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj));
        layoutParams.setMargins(iArr[0], 0, 0, 0);
        seekBar.setPadding(0, 0, 0, 0);
        layoutParams.gravity = 80;
        seekBar.setLayoutParams(layoutParams);
        seekBar.setMax(2000);
        seekBar.setProgressDrawable(seekBar.getContext().getDrawable(com.tencent.mm.R.drawable.d_j));
        seekBar.setThumbOffset(0);
        seekBar.setThumb(null);
        finderLandscapePreviewLayout.addView(seekBar, seekBar.getLayoutParams());
        finderLandscapePreviewLayout.N = seekBar;
        finderLandscapePreviewLayout.g();
    }
}
