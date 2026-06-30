package com.tencent.mm.plugin.lite.keyboard;

/* loaded from: classes7.dex */
public final class LiteAppNumberKeyboardView extends com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView {

    /* renamed from: w, reason: collision with root package name */
    public int f143847w;

    /* renamed from: x, reason: collision with root package name */
    public final android.util.SparseIntArray f143848x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f143849y;

    public LiteAppNumberKeyboardView(android.content.Context context) {
        super(context);
        this.f143847w = 0;
        this.f143848x = new aa3.l0(this);
        d();
    }

    public static boolean c(com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView liteAppNumberKeyboardView) {
        if (liteAppNumberKeyboardView.f143849y == null) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(r0.getTextBeforeCursor(1, 0))) {
            liteAppNumberKeyboardView.f143849y.deleteSurroundingText(1, 0);
        } else {
            liteAppNumberKeyboardView.f143849y.sendKeyEvent(new android.view.KeyEvent(0, 67));
            liteAppNumberKeyboardView.f143849y.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
        return true;
    }

    public final void d() {
        aa3.m0 m0Var = new aa3.m0(this);
        int i17 = 0;
        while (true) {
            android.util.SparseIntArray sparseIntArray = this.f143848x;
            if (i17 >= sparseIntArray.size()) {
                findViewById(com.tencent.mm.R.id.tenpay_keyboard_x).setOnClickListener(m0Var);
                ((com.tencent.mm.plugin.appbrand.widget.input.RepeatKeyTouchImageButton) findViewById(com.tencent.mm.R.id.tenpay_keyboard_d)).setRepeatKeyTouchListener(new aa3.n0(this));
                return;
            } else {
                findViewById(sparseIntArray.valueAt(i17)).setOnClickListener(m0Var);
                i17++;
            }
        }
    }

    public void e(nl1.b bVar) {
        if (bVar == null) {
            this.f143849y = null;
        } else {
            this.f143849y = bVar.a();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setInputEditText(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView
    public void setXMode(int i17) {
        super.setXMode(i17);
        this.f143847w = i17;
    }

    public LiteAppNumberKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f143847w = 0;
        this.f143848x = new aa3.l0(this);
        d();
    }
}
