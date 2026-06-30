package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes9.dex */
public class DialNumberButton extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f142519d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142520e;

    public DialNumberButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488707a45, this);
        this.f142519d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cye);
        this.f142520e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cyf);
        if (fp.h.c(16)) {
            this.f142519d.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
            this.f142520e.setTypeface(android.graphics.Typeface.create("sans-serif-normal", 0));
        }
        setClipChildren(false);
        setClipToPadding(false);
    }

    public java.lang.String getNumberText() {
        return this.f142519d.getText().toString();
    }

    public java.lang.String getOtherText() {
        return this.f142520e.getText().toString();
    }

    public void setInTalkUIMode(boolean z17) {
        if (z17) {
            if ("#".equals(this.f142519d.getText()) || "*".equals(this.f142519d.getText())) {
                this.f142519d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478883jt));
            } else {
                this.f142519d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478885jv));
            }
            this.f142520e.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478883jt));
            setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.f481354r7));
            return;
        }
        if ("#".equals(this.f142519d.getText()) || "*".equals(this.f142519d.getText())) {
            this.f142519d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478883jt));
        } else {
            this.f142519d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478884ju));
        }
        this.f142520e.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478883jt));
        setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.f481355r8));
    }
}
