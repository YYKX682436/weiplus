package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class a0 implements db5.s7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116167a;

    public a0(int i17) {
        this.f116167a = i17;
    }

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
        weImageView.setImageResource(this.f116167a);
    }
}
