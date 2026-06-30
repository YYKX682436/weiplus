package com.tencent.mm.ui.matrix.recyclerview;

/* loaded from: classes.dex */
public class JsonItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f209114d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f209115e;

    public JsonItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public java.lang.CharSequence getRightText() {
        return this.f209114d.getText();
    }

    public void setIconClickListener(android.view.View.OnClickListener onClickListener) {
        this.f209115e.setOnClickListener(onClickListener);
    }

    public void setRightColor(int i17) {
        this.f209114d.setTextColor(i17);
    }

    public void setTextSize(float f17) {
    }

    public JsonItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bmn, (android.view.ViewGroup) this, true);
        this.f209114d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.opg);
        this.f209115e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hlr);
    }
}
