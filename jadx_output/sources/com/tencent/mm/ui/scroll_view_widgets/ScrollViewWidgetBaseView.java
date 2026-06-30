package com.tencent.mm.ui.scroll_view_widgets;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetBaseView;", "Landroid/widget/FrameLayout;", "Lrj5/l;", "d", "Lrj5/l;", "getWidgetController", "()Lrj5/l;", "setWidgetController", "(Lrj5/l;)V", "widgetController", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rj5/a", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class ScrollViewWidgetBaseView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public rj5.l widgetController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollViewWidgetBaseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public abstract android.view.View a();

    public void b(float f17) {
    }

    public void c(rj5.a scrollState) {
        kotlin.jvm.internal.o.g(scrollState, "scrollState");
    }

    public final rj5.l getWidgetController() {
        rj5.l lVar = this.widgetController;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.o.o("widgetController");
        throw null;
    }

    public final void setWidgetController(rj5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.widgetController = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollViewWidgetBaseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            addView(a());
        } else {
            addOnAttachStateChangeListener(new rj5.b(this, this));
        }
    }
}
