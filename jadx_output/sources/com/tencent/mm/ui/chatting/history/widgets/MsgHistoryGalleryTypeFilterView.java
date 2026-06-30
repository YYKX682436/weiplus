package com.tencent.mm.ui.chatting.history.widgets;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTypeFilterView;", "Landroid/widget/LinearLayout;", "", "value", "d", "Z", "isExpanded", "()Z", "setExpanded", "(Z)V", "", "e", "Ljava/lang/CharSequence;", "getTypeFilterDesc", "()Ljava/lang/CharSequence;", "setTypeFilterDesc", "(Ljava/lang/CharSequence;)V", "typeFilterDesc", "", "f", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Led5/y;", "g", "Led5/y;", "getOnFilterClickListener", "()Led5/y;", "setOnFilterClickListener", "(Led5/y;)V", "onFilterClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MsgHistoryGalleryTypeFilterView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isExpanded;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public java.lang.CharSequence typeFilterDesc;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long animationDuration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ed5.y onFilterClickListener;

    /* renamed from: h, reason: collision with root package name */
    public final em.h2 f201821h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f201822i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryTypeFilterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final ed5.y getOnFilterClickListener() {
        return this.onFilterClickListener;
    }

    public final java.lang.CharSequence getTypeFilterDesc() {
        return this.typeFilterDesc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f201821h.a().animate().cancel();
        this.f201822i = false;
    }

    public final void setAnimationDuration(long j17) {
        this.animationDuration = j17;
    }

    public final void setExpanded(boolean z17) {
        if (this.isExpanded == z17) {
            return;
        }
        this.isExpanded = z17;
        em.h2 h2Var = this.f201821h;
        if (h2Var.a().isAttachedToWindow()) {
            h2Var.a().animate().rotation(this.isExpanded ? 90.0f : 270.0f).setDuration(this.animationDuration).setListener(new ed5.z(this)).start();
        }
    }

    public final void setOnFilterClickListener(ed5.y yVar) {
        this.onFilterClickListener = yVar;
    }

    public final void setTypeFilterDesc(java.lang.CharSequence value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.typeFilterDesc = value;
        em.h2 h2Var = this.f201821h;
        if (h2Var.f254382b == null) {
            h2Var.f254382b = (android.widget.TextView) h2Var.f254381a.findViewById(com.tencent.mm.R.id.vjz);
        }
        h2Var.f254382b.setText(this.typeFilterDesc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryTypeFilterView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f493860pe2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.typeFilterDesc = string;
        java.lang.Object d17 = bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryImmersiveActivityAnimationDuration());
        java.lang.Long l17 = d17 instanceof java.lang.Long ? (java.lang.Long) d17 : null;
        this.animationDuration = l17 != null ? l17.longValue() : 200L;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ekv, (android.view.ViewGroup) this, true);
        em.h2 h2Var = new em.h2(inflate);
        this.f201821h = h2Var;
        if (h2Var.f254384d == null) {
            h2Var.f254384d = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.uhy);
        }
        h2Var.f254384d.setOnClickListener(new ed5.x(this));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i65.a.h(context, com.tencent.mm.R.dimen.f479658bv));
        gradientDrawable.setColor(context.getResources().getColor(!com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.f478491c : com.tencent.mm.R.color.abz, null));
        if (h2Var.f254384d == null) {
            h2Var.f254384d = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.uhy);
        }
        h2Var.f254384d.setBackground(gradientDrawable);
    }
}
