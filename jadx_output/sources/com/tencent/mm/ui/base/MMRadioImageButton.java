package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class MMRadioImageButton extends android.widget.ImageButton implements android.widget.Checkable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f197550d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f197551e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f197552f;

    /* renamed from: g, reason: collision with root package name */
    public db5.u5 f197553g;

    /* renamed from: h, reason: collision with root package name */
    public db5.u5 f197554h;

    public MMRadioImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f197552f;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return false;
    }

    public void setCheckable(boolean z17) {
        this.f197551e = z17;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z17) {
        android.view.View findViewById;
        android.view.View findViewById2;
        if (this.f197552f != z17) {
            this.f197552f = z17;
            setSelected(z17);
            refreshDrawableState();
            if (this.f197550d) {
                return;
            }
            this.f197550d = true;
            db5.u5 u5Var = this.f197553g;
            if (u5Var != null) {
                com.tencent.mm.ui.base.MMRadioGroupView mMRadioGroupView = ((db5.q5) u5Var).f228478a;
                int i17 = mMRadioGroupView.f197546d;
                if (i17 != -1 && (findViewById2 = mMRadioGroupView.findViewById(i17)) != null && (findViewById2 instanceof com.tencent.mm.ui.base.MMRadioImageButton)) {
                    ((com.tencent.mm.ui.base.MMRadioImageButton) findViewById2).setChecked(false);
                }
                int id6 = getId();
                mMRadioGroupView.setCheckedButton(this);
                mMRadioGroupView.setCheckedId(id6);
            }
            db5.u5 u5Var2 = this.f197554h;
            if (u5Var2 != null) {
                com.tencent.mm.ui.base.MMRadioGroupView mMRadioGroupView2 = ((db5.q5) u5Var2).f228478a;
                int i18 = mMRadioGroupView2.f197546d;
                if (i18 != -1 && (findViewById = mMRadioGroupView2.findViewById(i18)) != null && (findViewById instanceof com.tencent.mm.ui.base.MMRadioImageButton)) {
                    ((com.tencent.mm.ui.base.MMRadioImageButton) findViewById).setChecked(false);
                }
                int id7 = getId();
                mMRadioGroupView2.setCheckedButton(this);
                mMRadioGroupView2.setCheckedId(id7);
            }
            this.f197550d = false;
        }
    }

    public void setOnMMRadioButtonCheckedChangeListener(db5.u5 u5Var) {
        this.f197553g = u5Var;
    }

    public void setOnOtherMMRadioButtonCheckedChangeListener(db5.u5 u5Var) {
        this.f197554h = u5Var;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (this.f197551e) {
            if (isChecked()) {
                return;
            }
            setChecked(!this.f197552f);
            return;
        }
        db5.u5 u5Var = this.f197553g;
        if (u5Var != null) {
            ((db5.q5) u5Var).f228478a.setClickedId(getId());
        }
        db5.u5 u5Var2 = this.f197554h;
        if (u5Var2 != null) {
            ((db5.q5) u5Var2).f228478a.setClickedId(getId());
        }
    }

    public MMRadioImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197551e = true;
    }
}
