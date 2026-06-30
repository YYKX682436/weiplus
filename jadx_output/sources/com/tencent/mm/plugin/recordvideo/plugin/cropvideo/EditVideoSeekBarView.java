package com.tencent.mm.plugin.recordvideo.plugin.cropvideo;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102B!\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\b1\u00104J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010,\u001a\n (*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+¨\u00065"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditVideoSeekBarView;", "Landroid/widget/LinearLayout;", "", "h", "Ljz5/f0;", "setSeekBarHeight", "", "color", "setTextColor", "Lcom/tencent/mm/plugin/mmsight/segment/h;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setThumbBarSeekListener", "Landroid/view/View$OnClickListener;", "onClickListener", "setFinishButtonClickListener", "setCancelButtonClickListener", "Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar;", "d", "Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar;", "getRecyclerThumbSeekBar", "()Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar;", "setRecyclerThumbSeekBar", "(Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar;)V", "recyclerThumbSeekBar", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "getFinishButton", "()Landroid/widget/Button;", "setFinishButton", "(Landroid/widget/Button;)V", "finishButton", "", "<set-?>", "g", "Z", "getHasInit", "()Z", "hasInit", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "Ljz5/g;", "getCropTimeTv", "()Landroid/widget/TextView;", "cropTimeTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EditVideoSeekBarView extends android.widget.LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f155731m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.Button f155733e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.Button finishButton;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean hasInit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cropTimeTv;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f155737i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditVideoSeekBarView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.cropTimeTv = jz5.h.b(new au3.p(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.d3q, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.p0o);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.recyclerThumbSeekBar = (com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar) findViewById;
        this.f155733e = (android.widget.Button) findViewById(com.tencent.mm.R.id.d6s);
        this.finishButton = (android.widget.Button) findViewById(com.tencent.mm.R.id.d6w);
    }

    private final android.widget.TextView getCropTimeTv() {
        return (android.widget.TextView) this.cropTimeTv.getValue();
    }

    public final void a(java.lang.String path, int i17, int i18, yz5.p pVar) {
        kotlin.jvm.internal.o.g(path, "path");
        if (this.hasInit) {
            return;
        }
        this.hasInit = true;
        this.f155737i = pVar;
        this.recyclerThumbSeekBar.f(path);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
        videoTransPara.f71195h = i17 / 1000;
        videoTransPara.f71196i = i18;
        this.recyclerThumbSeekBar.setVideoTransPara(videoTransPara);
        this.recyclerThumbSeekBar.setOnPreparedListener(new au3.o(this));
    }

    public final void b() {
        this.hasInit = false;
        this.recyclerThumbSeekBar.g();
        android.view.ViewParent parent = this.recyclerThumbSeekBar.getParent();
        if (parent instanceof android.widget.LinearLayout) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) parent;
            int indexOfChild = linearLayout.indexOfChild(this.recyclerThumbSeekBar);
            android.view.ViewGroup.LayoutParams layoutParams = this.recyclerThumbSeekBar.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            linearLayout.removeView(this.recyclerThumbSeekBar);
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = new com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar(getContext());
            this.recyclerThumbSeekBar = recyclerThumbSeekBar;
            linearLayout.addView(recyclerThumbSeekBar, indexOfChild, (android.widget.LinearLayout.LayoutParams) layoutParams);
        }
    }

    public final void c(float f17, float f18) {
        if (this.f155737i == null) {
            return;
        }
        getCropTimeTv().setVisibility(0);
        yz5.p pVar = this.f155737i;
        kotlin.jvm.internal.o.d(pVar);
        int intValue = (((java.lang.Number) pVar.invoke(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18))).intValue() + 500) / 1000;
        android.widget.TextView cropTimeTv = getCropTimeTv();
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%01d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue / 60), java.lang.Integer.valueOf(intValue % 60)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        cropTimeTv.setText(format);
        int width = getCropTimeTv().getWidth();
        if (width == 0) {
            width = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479714d7);
        }
        getCropTimeTv().setTranslationX(this.recyclerThumbSeekBar.getRightSliderPosition() - (width / 2));
    }

    public final android.widget.Button getFinishButton() {
        return this.finishButton;
    }

    public final boolean getHasInit() {
        return this.hasInit;
    }

    public final com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar getRecyclerThumbSeekBar() {
        return this.recyclerThumbSeekBar;
    }

    public final void setCancelButtonClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        android.widget.Button button = this.f155733e;
        kotlin.jvm.internal.o.d(button);
        button.setOnClickListener(onClickListener);
    }

    public final void setFinishButton(android.widget.Button button) {
        this.finishButton = button;
    }

    public final void setFinishButtonClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        android.widget.Button button = this.finishButton;
        kotlin.jvm.internal.o.d(button);
        button.setOnClickListener(onClickListener);
    }

    public final void setRecyclerThumbSeekBar(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar) {
        kotlin.jvm.internal.o.g(recyclerThumbSeekBar, "<set-?>");
        this.recyclerThumbSeekBar = recyclerThumbSeekBar;
    }

    public final void setSeekBarHeight(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = this.recyclerThumbSeekBar.getLayoutParams();
        layoutParams.height = i17;
        this.recyclerThumbSeekBar.setLayoutParams(layoutParams);
    }

    public final void setTextColor(java.lang.String str) {
        if (str != null) {
            android.widget.Button button = this.finishButton;
            kotlin.jvm.internal.o.d(button);
            button.setTextColor(android.graphics.Color.parseColor(str));
        }
    }

    public final void setThumbBarSeekListener(com.tencent.mm.plugin.mmsight.segment.h listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.recyclerThumbSeekBar.setThumbBarSeekListener(new au3.q(listener, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditVideoSeekBarView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.cropTimeTv = jz5.h.b(new au3.p(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.d3q, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.p0o);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.recyclerThumbSeekBar = (com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar) findViewById;
        this.f155733e = (android.widget.Button) findViewById(com.tencent.mm.R.id.d6s);
        this.finishButton = (android.widget.Button) findViewById(com.tencent.mm.R.id.d6w);
    }
}
