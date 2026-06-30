package com.tencent.mm.ui.base.preference;

/* loaded from: classes5.dex */
public class AutoHintSizeEditText extends com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f197744i = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f197745d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f197746e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f197747f;

    /* renamed from: g, reason: collision with root package name */
    public int f197748g;

    /* renamed from: h, reason: collision with root package name */
    public float f197749h;

    public AutoHintSizeEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197747f = "";
        this.f197748g = Integer.MIN_VALUE;
        float textSize = getTextSize();
        this.f197745d = textSize;
        this.f197749h = textSize;
        this.f197746e = new android.graphics.Paint(getPaint());
        addTextChangedListener(new com.tencent.mm.ui.base.preference.a(this));
    }

    public final void a(android.text.Editable editable, java.lang.CharSequence charSequence, int i17) {
        float f17;
        if (editable != null && !com.tencent.mm.sdk.platformtools.t8.K0(editable.toString())) {
            if (getTextSize() != this.f197745d) {
                setTextSize(0, this.f197745d);
                return;
            }
            return;
        }
        if (charSequence == null || com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString())) {
            if (getTextSize() != this.f197745d) {
                setTextSize(0, this.f197745d);
                return;
            }
            return;
        }
        java.lang.String charSequence2 = charSequence.toString();
        if (this.f197747f.equals(charSequence2) && this.f197748g == i17) {
            if (getTextSize() != this.f197749h) {
                setTextSize(0, this.f197749h);
                return;
            }
            return;
        }
        this.f197747f = charSequence2;
        this.f197748g = i17;
        float f18 = i17;
        if (getPaint().measureText(charSequence2) > f18) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479930ja);
            int b17 = i65.a.b(getContext(), 1);
            int i18 = (int) this.f197745d;
            do {
                i18 -= b17;
                if (i18 <= dimensionPixelSize) {
                    return;
                }
                f17 = i18;
                this.f197746e.setTextSize(f17);
            } while (this.f197746e.measureText(charSequence2) >= f18);
            this.f197749h = f17;
            setTextSize(0, f17);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            a(getText(), getHint(), ((i19 - i17) - getPaddingLeft()) - getPaddingRight());
        }
    }

    public AutoHintSizeEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197747f = "";
        this.f197748g = Integer.MIN_VALUE;
        float textSize = getTextSize();
        this.f197745d = textSize;
        this.f197749h = textSize;
        this.f197746e = new android.graphics.Paint(getPaint());
        addTextChangedListener(new com.tencent.mm.ui.base.preference.a(this));
    }
}
