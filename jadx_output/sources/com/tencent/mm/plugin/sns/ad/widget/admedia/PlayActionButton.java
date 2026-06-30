package com.tencent.mm.plugin.sns.ad.widget.admedia;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/admedia/PlayActionButton;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "d", "Landroid/view/View;", "getActionImg", "()Landroid/view/View;", "actionImg", "", "value", "g", "I", "getState", "()I", "setState", "(I)V", "state", "", "getShowLoading", "()Z", "setShowLoading", "(Z)V", "showLoading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "i84/a", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class PlayActionButton extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.view.View actionImg;

    /* renamed from: e, reason: collision with root package name */
    public i84.a f163293e;

    /* renamed from: f, reason: collision with root package name */
    public int f163294f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayActionButton(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.actionImg = new android.view.View(getContext());
        this.f163294f = -1;
    }

    public final android.view.View getActionImg() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionImg", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionImg", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        return this.actionImg;
    }

    public final boolean getShowLoading() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        i84.a aVar = this.f163293e;
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
            z17 = aVar.f289650g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        } else {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        return z17;
    }

    public final int getState() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        int i17 = this.state;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        return i17;
    }

    public final void setShowLoading(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        i84.a aVar = this.f163293e;
        if (aVar != null) {
            aVar.setLoading(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
    }

    public final void setState(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        this.state = i17;
        android.view.View view = this.actionImg;
        if (i17 == 1) {
            android.graphics.drawable.Drawable drawable = getContext().getDrawable(com.tencent.mm.R.drawable.bux);
            if (drawable == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
                return;
            } else {
                drawable.setTint(this.f163294f);
                view.setBackground(drawable);
            }
        } else {
            android.graphics.drawable.Drawable drawable2 = getContext().getDrawable(com.tencent.mm.R.drawable.buy);
            if (drawable2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
                return;
            } else {
                drawable2.setTint(this.f163294f);
                view.setBackground(drawable2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.actionImg = new android.view.View(getContext());
        this.f163294f = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.actionImg = new android.view.View(getContext());
        this.f163294f = -1;
    }
}
