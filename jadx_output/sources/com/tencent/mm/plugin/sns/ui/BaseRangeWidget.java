package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class BaseRangeWidget extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f166249d;

    public BaseRangeWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166249d = false;
    }

    public abstract void a(com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView);

    public abstract boolean b(int i17, int i18, android.content.Intent intent, com.tencent.mm.plugin.sns.ui.AtContactWidget atContactWidget);

    public abstract int getLabelRange();

    public abstract bw5.nk0 getSnsVisibilityData();

    public abstract void setRangeTipClickListener(android.view.View.OnClickListener onClickListener);

    public abstract void setSnsRangeChangeComplexCallback(com.tencent.mm.plugin.sns.ui.y0 y0Var);

    public BaseRangeWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166249d = false;
    }
}
