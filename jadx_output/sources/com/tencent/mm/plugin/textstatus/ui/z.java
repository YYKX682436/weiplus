package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class z implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.LongTextView f174464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174465e;

    public z(com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView, java.lang.String str) {
        this.f174464d = longTextView;
        this.f174465e = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        java.lang.CharSequence text;
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f174464d;
        longTextView.removeOnLayoutChangeListener(this);
        android.widget.TextView tvInvisible = longTextView.getTvInvisible();
        if (tvInvisible != null) {
            tvInvisible.setVisibility(4);
            tvInvisible.setText(this.f174465e);
            int measuredHeight = longTextView.getMeasuredHeight();
            int measuredHeight2 = tvInvisible.getMeasuredHeight();
            float b17 = ym5.x.b(tvInvisible.getContext(), (float) java.lang.Math.ceil(java.lang.Math.min(measuredHeight, measuredHeight2)));
            longTextView.setFullTextHeight(measuredHeight2);
            bk4.c2 textviewSuffixWrapper = longTextView.getTextviewSuffixWrapper();
            androidx.transition.Transition transition = textviewSuffixWrapper != null ? textviewSuffixWrapper.f21426q : null;
            if (transition != null) {
                ((androidx.transition.TransitionSet) transition).Z((b17 * 1000) / 5000);
            }
            com.tencent.mars.xlog.Log.i("LongTextView", "tvInvisible: tvHeight:" + measuredHeight2 + " rootViewHeight:" + measuredHeight + " rootView.paddingTop:" + tvInvisible.getRootView().getPaddingTop() + " duration:" + longTextView.getAnimationDuration() + " speed:5000");
            tvInvisible.setText("");
            tvInvisible.setVisibility(8);
            android.widget.TextView tvLongText = longTextView.getTvLongText();
            if (tvLongText != null) {
                tvLongText.getHeight();
            }
            android.widget.TextView tvLongText2 = longTextView.getTvLongText();
            if (tvLongText2 != null) {
                tvLongText2.getPaddingTop();
            }
            android.widget.TextView tvLongText3 = longTextView.getTvLongText();
            if (tvLongText3 != null) {
                tvLongText3.getPaddingBottom();
            }
            android.widget.TextView tvLongText4 = longTextView.getTvLongText();
            java.util.Objects.toString(tvLongText4 != null ? pm0.v.r(tvLongText4) : null);
            android.widget.TextView tvLongText5 = longTextView.getTvLongText();
            if (tvLongText5 != null && (text = tvLongText5.getText()) != null) {
                text.length();
            }
            android.widget.TextView tvLongText6 = longTextView.getTvLongText();
            if (tvLongText6 != null) {
                tvLongText6.getVisibility();
            }
            longTextView.getFullTextHeightChangeListener();
        }
        android.view.ViewGroup rootView = longTextView.getRootView();
        if (rootView != null) {
            rootView.post(new com.tencent.mm.plugin.textstatus.ui.y(longTextView));
        }
    }
}
