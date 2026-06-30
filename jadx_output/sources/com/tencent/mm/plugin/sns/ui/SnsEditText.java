package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class SnsEditText extends com.tencent.mm.ui.widget.MMEditText {
    public int G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f167150J;
    public float K;
    public final int L;

    public SnsEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 0;
        this.H = false;
        this.I = 0;
        this.f167150J = false;
        this.L = 10;
        addTextChangedListener(new com.tencent.mm.plugin.sns.ui.ci(this));
    }

    @Override // com.tencent.mm.ui.widget.edittext.PasterEditText, fl5.i
    public int getPasterLen() {
        return this.G;
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, fl5.i
    public fl5.i getRealEditText() {
        return this;
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, com.tencent.mm.ui.widget.edittext.PasterEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if (i17 == 16908322) {
            this.H = true;
        }
        return super.onTextContextMenuItem(i17);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            if (java.lang.Math.abs(this.K - motionEvent.getY()) > this.L) {
                this.f167150J = true;
            }
        } else if (motionEvent.getAction() != 1) {
            this.f167150J = false;
        } else if (this.f167150J) {
            this.f167150J = false;
            return true;
        }
        this.K = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, fl5.i
    public void setPasterLen(int i17) {
        this.G = i17;
    }
}
