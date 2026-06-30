package com.tencent.mm.plugin.music.ui.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u0002B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MusicMainSeekBar;", "Landroid/widget/FrameLayout;", "Lwl3/h;", "onSeekBarChange", "Ljz5/f0;", "setOnSeekBarChange", "", "currentPos", "setProgress", "totalDuration", "setMaxProgress", "", "d", "Z", "isSeeking", "()Z", "setSeeking", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "wl3/g", "music-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMainSeekBar extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final wl3.g f150822h = new wl3.g(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isSeeking;

    /* renamed from: e, reason: collision with root package name */
    public wl3.h f150824e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f150825f;

    /* renamed from: g, reason: collision with root package name */
    public ii0.a f150826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMainSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f150825f = "04:00";
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c4i, (android.view.ViewGroup) this, false);
        addView(inflate);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        int i18 = com.tencent.mm.R.id.mha;
        android.widget.SeekBar seekBar = (android.widget.SeekBar) x4.b.a(inflate, com.tencent.mm.R.id.mha);
        if (seekBar != null) {
            i18 = com.tencent.mm.R.id.o7k;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o7k);
            if (textView != null) {
                i18 = com.tencent.mm.R.id.o7l;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o7l);
                if (textView2 != null) {
                    this.f150826g = new ii0.a(linearLayout, linearLayout, seekBar, textView, textView2);
                    android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.drawable.aqz);
                    kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                    h0Var.f310123d = getResources().getDrawable(com.tencent.mm.R.drawable.f481995ar0);
                    ii0.a aVar = this.f150826g;
                    if (aVar != null) {
                        aVar.f291609b.setOnTouchListener(new wl3.i(this));
                        ii0.a aVar2 = this.f150826g;
                        if (aVar2 != null) {
                            aVar2.f291610c.setOnSeekBarChangeListener(new wl3.j(this, h0Var, drawable));
                            ii0.a aVar3 = this.f150826g;
                            if (aVar3 == null) {
                                kotlin.jvm.internal.o.o("seekBarBinding");
                                throw null;
                            }
                            aVar3.f291610c.setOnTouchListener(wl3.k.f447071d);
                            return;
                        }
                        kotlin.jvm.internal.o.o("seekBarBinding");
                        throw null;
                    }
                    kotlin.jvm.internal.o.o("seekBarBinding");
                    throw null;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final void a(int i17) {
        ii0.a aVar = this.f150826g;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("seekBarBinding");
            throw null;
        }
        android.widget.TextView textView = aVar.f291612e;
        if (textView != null) {
            textView.setText(f150822h.a(i17));
        }
        ii0.a aVar2 = this.f150826g;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("seekBarBinding");
            throw null;
        }
        android.widget.TextView textView2 = aVar2.f291611d;
        if (textView2 == null) {
            return;
        }
        textView2.setText(java.lang.String.valueOf(this.f150825f));
    }

    public final void setMaxProgress(int i17) {
        this.f150825f = f150822h.a(i17);
        ii0.a aVar = this.f150826g;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("seekBarBinding");
            throw null;
        }
        aVar.f291610c.setMax(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMainSeekBar", "maxDuration:" + this.f150825f + ", " + i17);
    }

    public final void setOnSeekBarChange(wl3.h onSeekBarChange) {
        kotlin.jvm.internal.o.g(onSeekBarChange, "onSeekBarChange");
        this.f150824e = onSeekBarChange;
    }

    public final void setProgress(int i17) {
        if (this.isSeeking) {
            return;
        }
        a(i17);
        ii0.a aVar = this.f150826g;
        if (aVar != null) {
            aVar.f291610c.setProgress(i17);
        } else {
            kotlin.jvm.internal.o.o("seekBarBinding");
            throw null;
        }
    }

    public final void setSeeking(boolean z17) {
        this.isSeeking = z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMainSeekBar(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
