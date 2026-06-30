package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t9 implements db5.s7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.t9 f119878a = new com.tencent.mm.plugin.finder.live.widget.t9();

    @Override // db5.s7
    public final void a(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.widget.TextView textView;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487357oe3)) != null) {
            textView.setTextSize(1, 14.0f);
        }
        if (view == null || (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f487356oe2)) == null) {
            return;
        }
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_error);
    }
}
