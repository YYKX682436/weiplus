package com.tencent.mm.plugin.profile.ui.tab;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/ContactWidgetActionLiveBar;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ContactWidgetActionLiveBar extends android.widget.LinearLayout {
    public ContactWidgetActionLiveBar(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a0d, (android.view.ViewGroup) this, true);
        setBackgroundColor(android.graphics.Color.parseColor(!com.tencent.mm.ui.bk.C() ? "#08000000" : "#0DFFFFFF"));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.am7);
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        fq1.e.h(fq1.e.f265507a, this, i65.a.b(context, 15), false, false, 12, null);
        com.tencent.mm.ui.tools.d8.a(this);
    }

    public ContactWidgetActionLiveBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ContactWidgetActionLiveBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
