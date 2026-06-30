package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveEmptyView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ImproveEmptyView extends android.widget.RelativeLayout {
    public ImproveEmptyView(android.content.Context context) {
        super(context);
        boolean a07 = c01.e2.a0();
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489182dp3, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.rb8);
        if (a07) {
            java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.f493253md2);
            kotlin.jvm.internal.o.d(r17);
            if (r26.n0.B(r17, "@", false)) {
                android.text.SpannableString spannableString = new android.text.SpannableString(r17);
                android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_camera, i65.a.d(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_3));
                int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479673ca);
                e17.setBounds(0, 0, (e17.getIntrinsicWidth() * h17) / e17.getIntrinsicHeight(), h17);
                android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(e17, 2);
                int L = r26.n0.L(r17, "@", 0, false, 6, null);
                spannableString.setSpan(imageSpan, L, L + 1, 33);
                textView.setText(spannableString);
                return;
            }
            return;
        }
        textView.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f493254md3));
    }

    public ImproveEmptyView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean a07 = c01.e2.a0();
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489182dp3, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.rb8);
        if (a07) {
            java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.f493253md2);
            kotlin.jvm.internal.o.d(r17);
            if (r26.n0.B(r17, "@", false)) {
                android.text.SpannableString spannableString = new android.text.SpannableString(r17);
                android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_camera, i65.a.d(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_3));
                int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479673ca);
                e17.setBounds(0, 0, (e17.getIntrinsicWidth() * h17) / e17.getIntrinsicHeight(), h17);
                android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(e17, 2);
                int L = r26.n0.L(r17, "@", 0, false, 6, null);
                spannableString.setSpan(imageSpan, L, L + 1, 33);
                textView.setText(spannableString);
                return;
            }
            return;
        }
        textView.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f493254md3));
    }

    public ImproveEmptyView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        boolean a07 = c01.e2.a0();
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489182dp3, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.rb8);
        if (a07) {
            java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.f493253md2);
            kotlin.jvm.internal.o.d(r17);
            if (r26.n0.B(r17, "@", false)) {
                android.text.SpannableString spannableString = new android.text.SpannableString(r17);
                android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_camera, i65.a.d(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_3));
                int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479673ca);
                e17.setBounds(0, 0, (e17.getIntrinsicWidth() * h17) / e17.getIntrinsicHeight(), h17);
                android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(e17, 2);
                int L = r26.n0.L(r17, "@", 0, false, 6, null);
                spannableString.setSpan(imageSpan, L, L + 1, 33);
                textView.setText(spannableString);
                return;
            }
            return;
        }
        textView.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f493254md3));
    }
}
