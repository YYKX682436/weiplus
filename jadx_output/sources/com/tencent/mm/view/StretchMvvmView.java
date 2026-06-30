package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%R.\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/tencent/mm/view/StretchMvvmView;", "Lq31/p;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/mm/mvvm/MvvmView;", "Lym5/e6;", "value", "f", "Lym5/e6;", "getLayoutConfig", "()Lym5/e6;", "setLayoutConfig", "(Lym5/e6;)V", "layoutConfig", "", "", "g", "Ljava/util/List;", "getMStretchIds", "()Ljava/util/List;", "setMStretchIds", "(Ljava/util/List;)V", "mStretchIds", "Ljz5/l;", "", "h", "Ljz5/l;", "getMForceStretch", "()Ljz5/l;", "setMForceStretch", "(Ljz5/l;)V", "mForceStretch", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class StretchMvvmView<T extends q31.p> extends com.tencent.mm.mvvm.MvvmView<T> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ym5.e6 layoutConfig;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.util.List mStretchIds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public jz5.l mForceStretch;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StretchMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.d(context);
    }

    public final ym5.e6 getLayoutConfig() {
        return this.layoutConfig;
    }

    public final jz5.l getMForceStretch() {
        return this.mForceStretch;
    }

    public final java.util.List<java.lang.Integer> getMStretchIds() {
        return this.mStretchIds;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public final void setLayoutConfig(ym5.e6 e6Var) {
        ym5.e6 e6Var2 = this.layoutConfig;
        this.layoutConfig = e6Var;
        kotlin.jvm.internal.o.b(e6Var2, e6Var);
    }

    public final void setMForceStretch(jz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.mForceStretch = lVar;
    }

    public final void setMStretchIds(java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.mStretchIds = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StretchMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.layoutConfig = new ym5.e6(0.0d, 0.0d, 0, 7, null);
        this.mStretchIds = kz5.p0.f313996d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.mForceStretch = new jz5.l(bool, bool);
    }
}
