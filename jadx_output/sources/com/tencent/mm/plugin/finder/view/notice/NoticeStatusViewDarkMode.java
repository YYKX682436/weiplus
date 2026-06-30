package com.tencent.mm.plugin.finder.view.notice;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/NoticeStatusViewDarkMode;", "Lcom/tencent/mm/plugin/finder/view/notice/NoticeStatusView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getBgRes", "", "getGreyTextColorRes", "getNormalTextColorRes", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NoticeStatusViewDarkMode extends com.tencent.mm.plugin.finder.view.notice.NoticeStatusView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeStatusViewDarkMode(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public int getBgRes() {
        return com.tencent.mm.R.drawable.a6h;
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public int getGreyTextColorRes() {
        return com.tencent.mm.R.color.BW_100_Alpha_0_3;
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public int getNormalTextColorRes() {
        return com.tencent.mm.R.color.UN_BW_0_Alpha_0_9;
    }
}
