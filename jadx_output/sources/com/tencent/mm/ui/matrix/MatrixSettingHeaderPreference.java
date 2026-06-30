package com.tencent.mm.ui.matrix;

/* loaded from: classes3.dex */
public class MatrixSettingHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public MatrixSettingHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jd8);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485865jd2);
        textView.setText(com.tencent.mm.sdk.platformtools.z.f193114j);
        view.setOnLongClickListener(new nh5.e0(this, imageView));
        view.setOnClickListener(new nh5.f0(this));
    }

    public MatrixSettingHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
