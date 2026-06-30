package com.tencent.mm.plugin.sns.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/sns/ui/widget/c1", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SnsAlbumThumbStateIconView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170838d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f170839e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f170840f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsAlbumThumbStateIconView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f170838d = "MicroMsg.SnsAlbumThumbStateIconView";
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ctx, (android.view.ViewGroup) this, true);
    }

    public final void a(com.tencent.mm.plugin.sns.ui.widget.c1 state) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showIconFG2", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
        kotlin.jvm.internal.o.g(state, "state");
        c(state, getContext().getResources().getColor(com.tencent.mm.R.color.FG_2), false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showIconFG2", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
    }

    public final void b(com.tencent.mm.plugin.sns.ui.widget.c1 state) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showIconWhite", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
        kotlin.jvm.internal.o.g(state, "state");
        c(state, getContext().getResources().getColor(com.tencent.mm.R.color.aaz), false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showIconWhite", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
    }

    public final void c(com.tencent.mm.plugin.sns.ui.widget.c1 c1Var, int i17, boolean z17) {
        android.graphics.drawable.Drawable e17;
        android.widget.FrameLayout frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
        if (this.f170839e == null) {
            this.f170839e = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.h7l);
        }
        if (this.f170840f == null) {
            android.widget.FrameLayout frameLayout2 = this.f170839e;
            this.f170840f = frameLayout2 != null ? (android.widget.ImageView) frameLayout2.findViewById(com.tencent.mm.R.id.h7k) : null;
        }
        com.tencent.mars.xlog.Log.i(this.f170838d, "showIconWithState state: " + c1Var);
        int ordinal = c1Var.ordinal();
        if (ordinal == 0) {
            e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_group_detail, i17);
        } else if (ordinal == 1) {
            e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_lock, i17);
        } else {
            if (ordinal != 2) {
                jz5.j jVar = new jz5.j();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
                throw jVar;
            }
            e17 = i65.a.i(getContext(), com.tencent.mm.R.drawable.bl8);
        }
        if (e17 != null) {
            if (z17 && (frameLayout = this.f170839e) != null) {
                frameLayout.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.b2t));
            }
            android.widget.ImageView imageView = this.f170840f;
            if (imageView != null) {
                imageView.setImageDrawable(e17);
            }
            android.widget.ImageView imageView2 = this.f170840f;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnsAlbumThumbStateIconView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
