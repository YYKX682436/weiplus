package com.tencent.mm.ui.chatting.component;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/ui/chatting/component/TranslateControllerView;", "Landroid/widget/LinearLayout;", "", "lan", "Ljz5/f0;", "setLanguageText", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getTargetLanTv", "()Landroid/widget/TextView;", "targetLanTv", "", "value", "g", "I", "setTargetLanTvOriginWidth", "(I)V", "targetLanTvOriginWidth", "Landroid/animation/ValueAnimator;", "h", "getAnim", "()Landroid/animation/ValueAnimator;", "anim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TranslateControllerView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g targetLanTv;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f198572e;

    /* renamed from: f, reason: collision with root package name */
    public int f198573f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int targetLanTvOriginWidth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g anim;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TranslateControllerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void a(com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView, int i17) {
        translateControllerView.getClass();
        com.tencent.mars.xlog.Log.i(translateControllerView.f198572e, "updateTextViewWidth() called with: w = " + i17);
        translateControllerView.f198573f = i17;
        android.widget.TextView targetLanTv = translateControllerView.getTargetLanTv();
        if (targetLanTv == null) {
            return;
        }
        targetLanTv.setWidth(i17);
    }

    private final android.animation.ValueAnimator getAnim() {
        return (android.animation.ValueAnimator) ((jz5.n) this.anim).getValue();
    }

    private final android.widget.TextView getTargetLanTv() {
        java.lang.Object value = ((jz5.n) this.targetLanTv).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    private final void setTargetLanTvOriginWidth(int i17) {
        this.targetLanTvOriginWidth = i17;
    }

    public final void b(int i17, int i18) {
        getAnim().cancel();
        getAnim().setIntValues(i17, i18);
        getAnim().start();
    }

    public final void setLanguageText(java.lang.String lan) {
        android.text.TextPaint paint;
        kotlin.jvm.internal.o.g(lan, "lan");
        android.widget.TextView targetLanTv = getTargetLanTv();
        if (targetLanTv != null) {
            targetLanTv.setText(lan);
        }
        android.widget.TextView targetLanTv2 = getTargetLanTv();
        setTargetLanTvOriginWidth((targetLanTv2 == null || (paint = targetLanTv2.getPaint()) == null) ? 0 : (int) paint.measureText(lan));
        b(this.f198573f, this.targetLanTvOriginWidth);
        com.tencent.mars.xlog.Log.i(this.f198572e, "setLanguageText: setTarget" + this.targetLanTvOriginWidth);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateControllerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.targetLanTv = jz5.h.b(new com.tencent.mm.ui.chatting.component.in(this));
        this.f198572e = "TranslateControllerView";
        this.anim = jz5.h.b(new com.tencent.mm.ui.chatting.component.fn(this));
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488445ti, (android.view.ViewGroup) this, true);
    }
}
