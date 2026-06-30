package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class KeyboardLinearLayout extends com.tencent.mm.ui.base.OnLayoutChangedLinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f196821e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f196822f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f196823g;

    /* renamed from: h, reason: collision with root package name */
    public int f196824h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.e8 f196825i;

    public KeyboardLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196821e = "MicroMsg.KeyboardLinearLayout";
        this.f196822f = false;
        this.f196824h = 0;
        this.f196823g = false;
        this.f196821e += getId();
    }

    public void c(int i17) {
        if (this.f196822f) {
            int i18 = this.f196824h;
            if (i18 < i17) {
                i18 = i17;
            }
            this.f196824h = i18;
        } else {
            this.f196822f = true;
            this.f196824h = i17;
            com.tencent.mars.xlog.Log.i(this.f196821e, "init height:%d", java.lang.Integer.valueOf(i17));
            com.tencent.mm.ui.e8 e8Var = this.f196825i;
            if (e8Var != null) {
                e8Var.a(-1);
            }
        }
        if (this.f196822f && !this.f196823g && this.f196824h - i17 > 100) {
            this.f196823g = true;
            e(-3);
            com.tencent.mars.xlog.Log.w(this.f196821e, "show keyboard!! mHeight: " + this.f196824h + " b: " + i17);
        }
        if (this.f196822f && this.f196823g && this.f196824h - i17 <= 100) {
            this.f196823g = false;
            e(-2);
            com.tencent.mars.xlog.Log.w(this.f196821e, "hide keyboard!! mHeight: " + this.f196824h + " b: " + i17);
        }
    }

    public void e(int i17) {
        com.tencent.mm.ui.e8 e8Var = this.f196825i;
        if (e8Var != null) {
            e8Var.a(i17);
        }
    }

    @Override // com.tencent.mm.ui.base.OnLayoutChangedLinearLayout, com.tencent.mm.ui.widget.DrawnCallBackLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        c(i27);
    }

    public void setOnkbdStateCopyListener(com.tencent.mm.ui.d8 d8Var) {
    }

    public void setOnkbdStateListener(com.tencent.mm.ui.e8 e8Var) {
        this.f196825i = e8Var;
    }

    public KeyboardLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196821e = "MicroMsg.KeyboardLinearLayout";
        this.f196822f = false;
    }
}
