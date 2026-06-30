package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveLayoutManager;", "Lcom/tencent/mm/view/recyclerview/WxLinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveLayoutManager extends com.tencent.mm.view.recyclerview.WxLinearLayoutManager {

    /* renamed from: w, reason: collision with root package name */
    public int f169149w;

    public ImproveLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollVerticallyBy", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager");
        if (this.f169149w != 0) {
            ot5.g.c("MicroMsg.ImproveLayoutManager", "fix rv scroll distance:" + this.f169149w);
        }
        int scrollVerticallyBy = super.scrollVerticallyBy(i17 + this.f169149w, z2Var, h3Var);
        this.f169149w = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollVerticallyBy", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager");
        return scrollVerticallyBy;
    }
}
