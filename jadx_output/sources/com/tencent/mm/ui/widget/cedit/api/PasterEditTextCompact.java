package com.tencent.mm.ui.widget.cedit.api;

/* loaded from: classes15.dex */
public class PasterEditTextCompact extends com.tencent.mm.ui.widget.cedit.edit.CustomEditText {
    public int A2;
    public boolean B2;
    public java.lang.String C2;
    public final java.util.List D2;
    public final java.util.LinkedList E2;
    public final java.util.LinkedList F2;

    /* renamed from: v2, reason: collision with root package name */
    public boolean f211566v2;

    /* renamed from: w2, reason: collision with root package name */
    public int f211567w2;

    /* renamed from: x2, reason: collision with root package name */
    public int f211568x2;

    /* renamed from: y2, reason: collision with root package name */
    public java.lang.CharSequence f211569y2;

    /* renamed from: z2, reason: collision with root package name */
    public java.lang.CharSequence f211570z2;

    public PasterEditTextCompact(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211566v2 = false;
        this.f211567w2 = 0;
        this.f211568x2 = 0;
        this.f211569y2 = "";
        this.f211570z2 = "";
        this.A2 = 0;
        this.B2 = false;
        this.C2 = "";
        this.D2 = new java.util.ArrayList();
        this.E2 = new java.util.LinkedList();
        this.F2 = new java.util.LinkedList();
        fl5.p pVar = new fl5.p(this);
        if (this.f211578J == null) {
            this.f211578J = new java.util.ArrayList();
        }
        this.f211578J.add(pVar);
    }

    public void addTextChangedListener(android.text.TextWatcher textWatcher) {
        this.E2.add(textWatcher);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public boolean c0(int i17) {
        if (i17 != 16908322) {
            return i17 == 16908321 ? super.c0(i17) : super.c0(i17);
        }
        this.f211566v2 = true;
        return super.c0(i17);
    }

    public java.lang.CharSequence getPasterContent() {
        return this.f211570z2;
    }

    public int getPasterLen() {
        return this.A2;
    }

    public boolean getSimilarPasteChange() {
        return this.B2;
    }

    public java.lang.String getSimilarPasteSeqStr() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < 3; i17++) {
            java.util.List list = this.D2;
            if (i17 >= list.size()) {
                break;
            }
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(list.get(i17));
        }
        return sb6.toString();
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PasterEditTextCompact", "onKeyDown keyCode:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PasterEditTextCompact", "onKeyMultiple keyCode:%s repeatCount:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.view.View
    public boolean onKeyPreIme(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PasterEditTextCompact", "onKeyMultiple keyCode:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyPreIme(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.view.View
    public boolean onKeyShortcut(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PasterEditTextCompact", "onKeyShortcut keyCode:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyShortcut(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PasterEditTextCompact", "onKeyUp keyCode:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyUp(i17, keyEvent);
    }

    public void q() {
        this.B2 = false;
        this.D2.clear();
        this.C2 = "";
    }

    public void removeTextChangedListener(android.text.TextWatcher textWatcher) {
        this.E2.remove(textWatcher);
    }

    public PasterEditTextCompact(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211566v2 = false;
        this.f211567w2 = 0;
        this.f211568x2 = 0;
        this.f211569y2 = "";
        this.f211570z2 = "";
        this.A2 = 0;
        this.B2 = false;
        this.C2 = "";
        this.D2 = new java.util.ArrayList();
        this.E2 = new java.util.LinkedList();
        this.F2 = new java.util.LinkedList();
        fl5.p pVar = new fl5.p(this);
        if (this.f211578J == null) {
            this.f211578J = new java.util.ArrayList();
        }
        this.f211578J.add(pVar);
    }
}
