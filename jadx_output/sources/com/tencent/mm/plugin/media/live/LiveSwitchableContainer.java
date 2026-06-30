package com.tencent.mm.plugin.media.live;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/media/live/LiveSwitchableContainer;", "Landroid/widget/RelativeLayout;", "Lrf3/g;", "Landroid/graphics/PointF;", "getTranslationValues", "getTranslationScale", "d", "Lrf3/g;", "getDelegate", "()Lrf3/g;", "setDelegate", "(Lrf3/g;)V", "delegate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LiveSwitchableContainer extends android.widget.RelativeLayout implements rf3.g {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public rf3.g delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveSwitchableContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // rf3.g
    public jz5.l a(float f17, float f18) {
        jz5.l a17;
        rf3.g gVar = this.delegate;
        return (gVar == null || (a17 = gVar.a(f17, f18)) == null) ? new jz5.l(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f)) : a17;
    }

    @Override // rf3.g
    public void b() {
        rf3.g gVar = this.delegate;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // rf3.g
    public void c(float f17) {
        rf3.g gVar = this.delegate;
        if (gVar != null) {
            gVar.c(f17);
        }
    }

    public final rf3.g getDelegate() {
        return this.delegate;
    }

    @Override // rf3.g
    public android.graphics.PointF getTranslationScale() {
        rf3.g gVar = this.delegate;
        if (gVar != null) {
            return gVar.getTranslationScale();
        }
        return null;
    }

    @Override // rf3.g
    public android.graphics.PointF getTranslationValues() {
        rf3.g gVar = this.delegate;
        if (gVar != null) {
            return gVar.getTranslationValues();
        }
        return null;
    }

    public final void setDelegate(rf3.g gVar) {
        this.delegate = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSwitchableContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
