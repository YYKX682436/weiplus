package com.tencent.mm.plugin.kidswatch.ui.login;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent;", "Landroid/widget/RelativeLayout;", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "Ljz5/f0;", "setTitle", "", "resId", "setCloseIconResId", "Lkotlin/Function0;", "d", "Lyz5/a;", "getCloseBtnCallBack", "()Lyz5/a;", "setCloseBtnCallBack", "(Lyz5/a;)V", "closeBtnCallBack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class KidsWatchHeadComponent extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a closeBtnCallBack;

    /* renamed from: e, reason: collision with root package name */
    public final w83.b f143110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KidsWatchHeadComponent(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bmu, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i18 = com.tencent.mm.R.id.byt;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.byt);
        if (weImageView != null) {
            i18 = com.tencent.mm.R.id.gzr;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.gzr);
            if (weImageView2 != null) {
                i18 = com.tencent.mm.R.id.obf;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.obf);
                if (textView != null) {
                    this.f143110e = new w83.b((android.widget.LinearLayout) inflate, weImageView, weImageView2, textView);
                    setNestedScrollingEnabled(true);
                    textView.setVisibility(4);
                    weImageView2.setVisibility(4);
                    weImageView.setBackground(getContext().getDrawable(com.tencent.mm.R.raw.icons_outlined_close));
                    weImageView.setOnClickListener(new y83.c(this));
                    weImageView2.setOnClickListener(new y83.d(this));
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final yz5.a getCloseBtnCallBack() {
        return this.closeBtnCallBack;
    }

    public final void setCloseBtnCallBack(yz5.a aVar) {
        this.closeBtnCallBack = aVar;
    }

    public final void setCloseIconResId(int i17) {
        this.f143110e.f443959b.setBackground(getContext().getDrawable(i17));
    }

    public final void setTitle(java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        w83.b bVar = this.f143110e;
        bVar.f443961d.setText(title);
        bVar.f443961d.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KidsWatchHeadComponent(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
