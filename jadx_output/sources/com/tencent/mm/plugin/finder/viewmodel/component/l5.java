package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes3.dex */
public final class l5 implements db5.s7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.l5 f135022a = new com.tencent.mm.plugin.finder.viewmodel.component.l5();

    @Override // db5.s7
    public final void a(android.view.View view) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487357oe3)) != null) {
            textView.setTextSize(1, 14.0f);
        }
        if (view == null || (imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f487356oe2)) == null) {
            return;
        }
        imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_done);
    }
}
