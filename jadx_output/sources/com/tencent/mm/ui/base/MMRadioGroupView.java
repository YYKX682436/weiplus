package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class MMRadioGroupView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f197546d;

    /* renamed from: e, reason: collision with root package name */
    public int f197547e;

    /* renamed from: f, reason: collision with root package name */
    public db5.u5 f197548f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMRadioImageButton f197549g;

    public MMRadioGroupView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197546d = -1;
        this.f197547e = -1;
        this.f197548f = new db5.q5(this);
        super.setOnHierarchyChangeListener(new db5.s5(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedButton(com.tencent.mm.ui.base.MMRadioImageButton mMRadioImageButton) {
        this.f197549g = mMRadioImageButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i17) {
        this.f197546d = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedId(int i17) {
        this.f197547e = i17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.View findViewById;
        if (view instanceof com.tencent.mm.ui.base.MMRadioImageButton) {
            com.tencent.mm.ui.base.MMRadioImageButton mMRadioImageButton = (com.tencent.mm.ui.base.MMRadioImageButton) view;
            if (mMRadioImageButton.isChecked()) {
                int i18 = this.f197546d;
                if (i18 != -1 && (findViewById = findViewById(i18)) != null && (findViewById instanceof com.tencent.mm.ui.base.MMRadioImageButton)) {
                    ((com.tencent.mm.ui.base.MMRadioImageButton) findViewById).setChecked(false);
                }
                setCheckedId(mMRadioImageButton.getId());
                setCheckedButton(mMRadioImageButton);
            }
        }
        super.addView(view, i17, layoutParams);
    }

    public com.tencent.mm.ui.base.MMRadioImageButton getCheckedRadioButton() {
        return this.f197549g;
    }

    public int getCheckedRadioButtonId() {
        return this.f197546d;
    }

    public int getClickedRadioButtonId() {
        return this.f197547e;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        int i17 = this.f197546d;
        if (i17 != -1) {
            android.view.View findViewById = findViewById(i17);
            if (findViewById != null && (findViewById instanceof com.tencent.mm.ui.base.MMRadioImageButton)) {
                ((com.tencent.mm.ui.base.MMRadioImageButton) findViewById).setChecked(true);
            }
            setCheckedId(this.f197546d);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
    }

    public void setOnMMRadioGroupCheckedChangeListener(db5.r5 r5Var) {
    }

    public void setOnSizeChangeObserver(db5.t5 t5Var) {
    }
}
