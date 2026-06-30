package com.tencent.mm.view;

/* loaded from: classes.dex */
public class CheckBoxLicenseView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.CompoundButton.OnCheckedChangeListener f213297d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f213298e;

    public CheckBoxLicenseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void setCheckStateChangeListener(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f213297d = onCheckedChangeListener;
        ((android.widget.CheckBox) findViewById(com.tencent.mm.R.id.o2l)).setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setLicenseClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o2o);
        this.f213298e = onClickListener;
        textView.setOnClickListener(onClickListener);
    }

    public void setTermText(java.lang.CharSequence charSequence) {
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o2o)).setText(charSequence);
    }

    public void setTermTip(java.lang.CharSequence charSequence) {
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o2n)).setText(charSequence);
    }

    public CheckBoxLicenseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488667zw, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.o2k);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.o2l);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o2o);
        findViewById.setOnClickListener(new ym5.v(this, checkBox));
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f213297d;
        if (onCheckedChangeListener != null) {
            checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        android.view.View.OnClickListener onClickListener = this.f213298e;
        if (onClickListener != null) {
            textView.setOnClickListener(onClickListener);
        }
    }
}
