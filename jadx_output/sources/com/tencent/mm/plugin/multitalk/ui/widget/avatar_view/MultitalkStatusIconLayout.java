package com.tencent.mm.plugin.multitalk.ui.widget.avatar_view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultitalkStatusIconLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "d", "Ljz5/g;", "getIconBg", "()Landroid/view/View;", "iconBg", "Landroid/widget/ImageView;", "e", "getIcon", "()Landroid/widget/ImageView;", "icon", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MultitalkStatusIconLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g iconBg;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g icon;

    public /* synthetic */ MultitalkStatusIconLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    private final android.widget.ImageView getIcon() {
        return (android.widget.ImageView) ((jz5.n) this.icon).getValue();
    }

    private final android.view.View getIconBg() {
        return (android.view.View) ((jz5.n) this.iconBg).getValue();
    }

    public final void a(com.tencent.mm.plugin.multitalk.ui.t memberInfo) {
        kotlin.jvm.internal.o.g(memberInfo, "memberInfo");
        setVisibility(0);
        if (!memberInfo.f150301f) {
            setVisibility(8);
        } else {
            getIcon().setVisibility(8);
            getIconBg().setBackgroundResource(com.tencent.mm.R.raw.multitalk_network_mark);
        }
    }

    public final void b(com.tencent.mm.plugin.multitalk.ui.t memberInfo) {
        kotlin.jvm.internal.o.g(memberInfo, "memberInfo");
        setVisibility(0);
        if (memberInfo.a()) {
            getIconBg().setBackground(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.drawable.aqf, getContext().getResources().getColor(com.tencent.mm.R.color.f478496g)));
            getIcon().setVisibility(0);
            getIcon().setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_board, getContext().getResources().getColor(com.tencent.mm.R.color.f478553an)));
        } else if (memberInfo.f150302g) {
            getIconBg().setBackground(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.drawable.aqf, getContext().getResources().getColor(com.tencent.mm.R.color.f478553an)));
            getIcon().setVisibility(0);
            getIcon().setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_filled_mike_off, -65536));
        } else if (!memberInfo.f150300e) {
            setVisibility(8);
        } else {
            getIcon().setVisibility(8);
            getIconBg().setBackgroundResource(com.tencent.mm.R.drawable.cbq);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultitalkStatusIconLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489308c30, (android.view.ViewGroup) this, true);
        this.iconBg = jz5.h.b(new tj3.k0(this));
        this.icon = jz5.h.b(new tj3.j0(this));
    }
}
