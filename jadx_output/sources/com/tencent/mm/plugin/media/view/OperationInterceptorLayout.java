package com.tencent.mm.plugin.media.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/media/view/OperationInterceptorLayout;", "Landroid/widget/FrameLayout;", "Lmf3/n;", "d", "Lmf3/n;", "getLayer", "()Lmf3/n;", "setLayer", "(Lmf3/n;)V", "layer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class OperationInterceptorLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public mf3.n layer;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148571e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f148572f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OperationInterceptorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final mf3.n getLayer() {
        return this.layer;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        mf3.n nVar = this.layer;
        if ((nVar != null && nVar.n(motionEvent)) && motionEvent.getAction() == 0) {
            mg3.p.a(motionEvent);
            this.f148572f = true;
            return false;
        }
        if (this.f148572f && motionEvent.getAction() == 1) {
            mg3.p.a(motionEvent);
            this.f148572f = false;
            return false;
        }
        if (this.f148572f) {
            mg3.p.a(motionEvent);
            return false;
        }
        com.tencent.mars.xlog.Log.w(this.f148571e, "shouldDispatchToLayer interrupt");
        return true;
    }

    public final void setLayer(mf3.n nVar) {
        this.layer = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationInterceptorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148571e = "MediaGallery.OperationInterceptorLayout";
    }
}
