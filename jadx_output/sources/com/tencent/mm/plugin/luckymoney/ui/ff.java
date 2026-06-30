package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class ff extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(boolean z17, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        rk0.c.c("MicroMsg.LuckyMoneyNewReceiveUIC", "[doTextStyle] hasEnvelope :" + z17 + ' ', new java.lang.Object[0]);
        if (z17) {
            com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
            com.tencent.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
            com.tencent.mm.ui.bk.r0(textView3 != null ? textView3.getPaint() : null, 0.8f);
            int parseColor = android.graphics.Color.parseColor("#FA755411");
            if (textView != null) {
                textView.setShadowLayer(12.0f, 0.0f, 0.0f, parseColor);
            }
            if (textView2 != null) {
                textView2.setShadowLayer(12.0f, 0.0f, 0.0f, parseColor);
            }
            if (textView3 != null) {
                textView3.setShadowLayer(12.0f, 0.0f, 0.0f, parseColor);
            }
            if (textView != null) {
                textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.al8));
            }
            if (textView2 != null) {
                textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.al8));
            }
            if (textView3 != null) {
                textView3.setTextColor(getResources().getColor(com.tencent.mm.R.color.al7));
            }
            if (textView4 != null) {
                textView4.setTextColor(getResources().getColor(com.tencent.mm.R.color.al8));
            }
            if (textView4 != null) {
                textView4.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, getResources().getDrawable(com.tencent.mm.R.drawable.d6l), (android.graphics.drawable.Drawable) null);
            }
        }
    }
}
