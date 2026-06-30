package fl1;

/* loaded from: classes4.dex */
public final class a extends android.widget.FrameLayout {
    public a(android.content.Context context, android.view.View view) {
        super(context);
        addView(view);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if ((getParent() instanceof android.view.View) && ((android.view.View) getParent()).getMeasuredHeight() > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.View) getParent()).getMeasuredHeight() - i65.a.b(getContext(), com.tencent.mm.sdk.platformtools.d2.j(getContext()) ? ib1.t.CTRL_INDEX : 24), Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
    }
}
