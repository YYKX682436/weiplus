package com.tencent.mm.plugin.xlabeffect;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/xlabeffect/XLabEffectSettingView;", "Landroid/widget/FrameLayout;", "Let0/q;", "d", "Let0/q;", "getCameraView", "()Let0/q;", "setCameraView", "(Let0/q;)V", "cameraView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-xlabeffect_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class XLabEffectSettingView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public et0.q cameraView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XLabEffectSettingView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.a6b, this);
        p05.q4 q4Var = p05.q4.f350661a;
        a(com.tencent.mm.R.id.psn, com.tencent.mm.R.id.pso, com.tencent.mm.R.string.f493706lc4, p05.q4.f350662b, new p05.s4(this));
        a(com.tencent.mm.R.id.psh, com.tencent.mm.R.id.psi, com.tencent.mm.R.string.f493703lc1, p05.q4.f350663c, new p05.u4(this));
        a(com.tencent.mm.R.id.psj, com.tencent.mm.R.id.psk, com.tencent.mm.R.string.f493704lc2, p05.q4.f350664d, new p05.w4(this));
        a(com.tencent.mm.R.id.psl, com.tencent.mm.R.id.psm, com.tencent.mm.R.string.f493705lc3, p05.q4.f350665e, new p05.y4(this));
        a(com.tencent.mm.R.id.psf, com.tencent.mm.R.id.psg, com.tencent.mm.R.string.f493702lc0, p05.q4.f350666f, new p05.a5(this));
        setBackgroundColor(-1);
    }

    public final void a(int i17, int i18, int i19, int i27, yz5.l lVar) {
        android.view.View findViewById = findViewById(i17);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.SeekBar seekBar = (android.widget.SeekBar) findViewById;
        android.view.View findViewById2 = findViewById(i18);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        textView.setText(getResources().getString(i19, java.lang.Integer.valueOf(i27)));
        seekBar.setProgress(i27);
        seekBar.setOnSeekBarChangeListener(new p05.b5(textView, this, i19, lVar));
    }

    public final et0.q getCameraView() {
        return this.cameraView;
    }

    public final void setCameraView(et0.q qVar) {
        this.cameraView = qVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XLabEffectSettingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XLabEffectSettingView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
