package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class ProfileLabelView extends com.tencent.mm.pluginsdk.ui.ProfileItemView {
    public ProfileLabelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public void a() {
        setClickable(true);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public int getLayout() {
        return com.tencent.mm.R.layout.caz;
    }

    public ProfileLabelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
