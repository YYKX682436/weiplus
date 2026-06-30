package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0011B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsBaseImgBottomBar;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "clickCallback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "setCircleToSearchTagClickCallback", "setDetailBtnClickCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/sns/ui/ue", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class SnsBaseImgBottomBar extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.ue f166825d = new com.tencent.mm.plugin.sns.ui.ue(null);

    public SnsBaseImgBottomBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCircleToSearchTagVisible", "com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCircleToSearchTagVisible", "com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar");
        return false;
    }

    public abstract void b(r45.jj4 jj4Var, long j17, int i17);

    public void setCircleToSearchTagClickCallback(android.view.View.OnClickListener clickCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCircleToSearchTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar");
        kotlin.jvm.internal.o.g(clickCallback, "clickCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCircleToSearchTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar");
    }

    public void setDetailBtnClickCallback(android.view.View.OnClickListener clickCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDetailBtnClickCallback", "com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar");
        kotlin.jvm.internal.o.g(clickCallback, "clickCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDetailBtnClickCallback", "com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar");
    }

    public abstract void setLivePhotoTagClickCallback(android.view.View.OnClickListener onClickListener);

    public SnsBaseImgBottomBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
