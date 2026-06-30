package com.tencent.mm.pluginsdk.ui.seekbar;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u001a\"B\u001b\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00060"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/seekbar/FinderHeroSeekBarView;", "Landroid/widget/LinearLayout;", "", "resId", "Ljz5/f0;", "setHeroProgressDrawable", "", "drag", "setEnableDrag", "", "timeMs", "setTotalTimeMs", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getCurrentTimeTxt", "()Landroid/widget/TextView;", "currentTimeTxt", "e", "getTotalTimeText", "totalTimeText", "Landroid/widget/SeekBar;", "f", "getHeroSeekBar", "()Landroid/widget/SeekBar;", "heroSeekBar", "Lz35/u;", "q", "Lz35/u;", "getHeroSeekBarChangeListener", "()Lz35/u;", "setHeroSeekBarChangeListener", "(Lz35/u;)V", "heroSeekBarChangeListener", "Lz35/v;", "r", "Lz35/v;", "getVideoPlayDurationProvider", "()Lz35/v;", "setVideoPlayDurationProvider", "(Lz35/v;)V", "videoPlayDurationProvider", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-playvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderHeroSeekBarView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g currentTimeTxt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g totalTimeText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g heroSeekBar;

    /* renamed from: g, reason: collision with root package name */
    public long f191128g;

    /* renamed from: h, reason: collision with root package name */
    public int f191129h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f191130i;

    /* renamed from: m, reason: collision with root package name */
    public int f191131m;

    /* renamed from: n, reason: collision with root package name */
    public long f191132n;

    /* renamed from: o, reason: collision with root package name */
    public long f191133o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f191134p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public z35.u heroSeekBarChangeListener;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public z35.v videoPlayDurationProvider;

    /* renamed from: s, reason: collision with root package name */
    public wu5.c f191137s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f191138t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f191139u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHeroSeekBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.currentTimeTxt = jz5.h.b(new z35.w(this));
        this.totalTimeText = jz5.h.b(new z35.z(this));
        this.heroSeekBar = jz5.h.b(new z35.x(this));
        this.f191129h = -1;
        this.f191138t = kotlinx.coroutines.z0.b();
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489173eh4, (android.view.ViewGroup) this, true);
        setOnClickListener(z35.r.f470039d);
        getHeroSeekBar().setMax(2500);
        getHeroSeekBar().setOnSeekBarChangeListener(new z35.t(this, context));
    }

    public static final void e(com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView, long j17) {
        if (finderHeroSeekBarView.f191128g == 0 || finderHeroSeekBarView.f191134p) {
            return;
        }
        long j18 = finderHeroSeekBarView.f191133o;
        if (j17 > j18 || java.lang.Math.abs(j17 - j18) >= 5000) {
            if (j17 == finderHeroSeekBarView.f191133o) {
                j17 += java.lang.System.currentTimeMillis() - finderHeroSeekBarView.f191132n;
            }
            finderHeroSeekBarView.f191132n = java.lang.System.currentTimeMillis();
            finderHeroSeekBarView.f191133o = j17;
            int i17 = (int) ((j17 * 2500) / finderHeroSeekBarView.f191128g);
            if (finderHeroSeekBarView.getVisibility() != 0) {
                return;
            }
            finderHeroSeekBarView.h(i17);
            if (finderHeroSeekBarView.f191134p) {
                return;
            }
            finderHeroSeekBarView.g(i17, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getCurrentTimeTxt() {
        java.lang.Object value = ((jz5.n) this.currentTimeTxt).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.SeekBar getHeroSeekBar() {
        java.lang.Object value = ((jz5.n) this.heroSeekBar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.SeekBar) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getTotalTimeText() {
        java.lang.Object value = ((jz5.n) this.totalTimeText).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHeroProgressDrawable(int i17) {
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(i17);
        android.graphics.Rect bounds = getHeroSeekBar().getProgressDrawable().getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        getHeroSeekBar().setProgressDrawable(drawable);
        getHeroSeekBar().getProgressDrawable().setBounds(bounds);
    }

    public final java.lang.String f(long j17, boolean z17) {
        java.text.SimpleDateFormat simpleDateFormat;
        if (z17) {
            j17 = a06.d.c((j17 * 1.0d) / 1000) * 1000;
            simpleDateFormat = new java.text.SimpleDateFormat("mm:ss", java.util.Locale.getDefault());
        } else {
            simpleDateFormat = new java.text.SimpleDateFormat("mm:ss.SSS", java.util.Locale.getDefault());
        }
        java.lang.String format = simpleDateFormat.format(new java.util.Date(j17));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public final void g(int i17, boolean z17) {
        this.f191131m = i17;
        if (java.lang.Math.abs(i17 - getHeroSeekBar().getProgress()) > 10) {
            this.f191130i = true;
        }
        getHeroSeekBar().setProgress(i17, !this.f191130i && z17);
        this.f191130i = false;
    }

    public final z35.u getHeroSeekBarChangeListener() {
        return this.heroSeekBarChangeListener;
    }

    public final z35.v getVideoPlayDurationProvider() {
        return this.videoPlayDurationProvider;
    }

    public final void h(int i17) {
        getCurrentTimeTxt().setText(f((this.f191128g * i17) / 2500, true));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setEnableDrag(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HeroSeekBarView", "setEnableDrag " + z17);
        getHeroSeekBar().setEnabled(z17);
    }

    public final void setHeroSeekBarChangeListener(z35.u uVar) {
        this.heroSeekBarChangeListener = uVar;
    }

    public final void setTotalTimeMs(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HeroSeekBarView", "setTotalTimeMs " + j17);
        this.f191128g = j17;
        getTotalTimeText().setText(f(j17, true));
        getHeroSeekBar().getMax();
    }

    public final void setVideoPlayDurationProvider(z35.v vVar) {
        this.videoPlayDurationProvider = vVar;
    }
}
