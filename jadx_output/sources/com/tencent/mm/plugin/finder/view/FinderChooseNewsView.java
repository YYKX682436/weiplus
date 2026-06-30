package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderChooseNewsView;", "Landroid/widget/RelativeLayout;", "Landroid/widget/CheckBox;", "e", "Ljz5/g;", "getCheckBox", "()Landroid/widget/CheckBox;", "checkBox", "Landroid/widget/TextView;", "f", "getDescText", "()Landroid/widget/TextView;", "descText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderChooseNewsView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final vb2.u f130875d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g checkBox;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g descText;

    public FinderChooseNewsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        vb2.u a17 = vb2.u.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f130875d = a17;
        this.checkBox = jz5.h.b(new com.tencent.mm.plugin.finder.view.h3(this));
        this.descText = jz5.h.b(new com.tencent.mm.plugin.finder.view.i3(this));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        android.text.SpannableString spannableString = new android.text.SpannableString(getContext().getResources().getString(com.tencent.mm.R.string.f492067f43));
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_like, i65.a.d(getContext(), com.tencent.mm.R.color.FG_2));
        android.graphics.drawable.Drawable e18 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_fire, i65.a.d(getContext(), com.tencent.mm.R.color.FG_2));
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        e18.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        al5.w wVar = new al5.w(e17, 1);
        al5.w wVar2 = new al5.w(e18, 1);
        int K = r26.n0.K(spannableString, (char) 8197, 0, false, 6, null);
        int K2 = r26.n0.K(spannableString, (char) 8198, 0, false, 6, null);
        spannableString.setSpan(wVar, K, K + 1, 34);
        spannableString.setSpan(wVar2, K2, K2 + 1, 34);
        getDescText().setText(spannableString);
        android.widget.TextView title = a17.f434732d;
        kotlin.jvm.internal.o.f(title, "title");
        hc2.f1.E(title, com.tencent.mm.R.dimen.f479689co, false);
        android.widget.TextView descText = getDescText();
        kotlin.jvm.internal.o.f(descText, "<get-descText>(...)");
        hc2.f1.E(descText, com.tencent.mm.R.dimen.f479673ca, true);
    }

    private final android.widget.CheckBox getCheckBox() {
        return (android.widget.CheckBox) this.checkBox.getValue();
    }

    private final android.widget.TextView getDescText() {
        return (android.widget.TextView) this.descText.getValue();
    }

    public final boolean a() {
        return getCheckBox().isChecked();
    }

    public FinderChooseNewsView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        vb2.u a17 = vb2.u.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f130875d = a17;
        this.checkBox = jz5.h.b(new com.tencent.mm.plugin.finder.view.h3(this));
        this.descText = jz5.h.b(new com.tencent.mm.plugin.finder.view.i3(this));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        android.text.SpannableString spannableString = new android.text.SpannableString(getContext().getResources().getString(com.tencent.mm.R.string.f492067f43));
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_like, i65.a.d(getContext(), com.tencent.mm.R.color.FG_2));
        android.graphics.drawable.Drawable e18 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_fire, i65.a.d(getContext(), com.tencent.mm.R.color.FG_2));
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        e18.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        al5.w wVar = new al5.w(e17, 1);
        al5.w wVar2 = new al5.w(e18, 1);
        int K = r26.n0.K(spannableString, (char) 8197, 0, false, 6, null);
        int K2 = r26.n0.K(spannableString, (char) 8198, 0, false, 6, null);
        spannableString.setSpan(wVar, K, K + 1, 34);
        spannableString.setSpan(wVar2, K2, K2 + 1, 34);
        getDescText().setText(spannableString);
        android.widget.TextView title = a17.f434732d;
        kotlin.jvm.internal.o.f(title, "title");
        hc2.f1.E(title, com.tencent.mm.R.dimen.f479689co, false);
        android.widget.TextView descText = getDescText();
        kotlin.jvm.internal.o.f(descText, "<get-descText>(...)");
        hc2.f1.E(descText, com.tencent.mm.R.dimen.f479673ca, true);
    }
}
