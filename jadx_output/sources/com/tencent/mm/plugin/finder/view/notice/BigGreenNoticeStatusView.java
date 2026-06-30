package com.tencent.mm.plugin.finder.view.notice;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/BigGreenNoticeStatusView;", "Lcom/tencent/mm/plugin/finder/view/notice/NoticeStatusView;", "", "getPayText", "", "getLayoutId", "getBgRes", "getNormalTextColorRes", "getGreyTextColorRes", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class BigGreenNoticeStatusView extends com.tencent.mm.plugin.finder.view.notice.NoticeStatusView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigGreenNoticeStatusView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.ViewGroup.LayoutParams layoutParams = getTvPrice().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i65.a.b(context, 1);
        getTvPrice().setLayoutParams(marginLayoutParams);
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public void f(java.lang.String str, boolean z17, yz5.a getNoticeInfo) {
        kotlin.jvm.internal.o.g(getNoticeInfo, "getNoticeInfo");
        super.f(str, z17, getNoticeInfo);
        r45.h32 h32Var = (r45.h32) getNoticeInfo.invoke();
        boolean z18 = h32Var.getInteger(1) == 0;
        r45.q65 q65Var = (r45.q65) h32Var.getCustom(10);
        boolean z19 = q65Var != null ? q65Var.getBoolean(0) : false;
        boolean z27 = q65Var != null ? q65Var.getBoolean(2) : false;
        if (z19) {
            z18 = z27;
        }
        if (z18) {
            getBgView().setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.a96));
            getIvTicket().setIconColor(getResources().getColor(getGreyTextColorRes()));
            getTvBigText().setTextColor(getResources().getColor(getGreyTextColorRes()));
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public int getBgRes() {
        return com.tencent.mm.R.drawable.a0u;
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public int getGreyTextColorRes() {
        return com.tencent.mm.R.color.BW_0_Alpha_0_7;
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aol;
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public int getNormalTextColorRes() {
        return com.tencent.mm.R.color.f479549ab0;
    }

    @Override // com.tencent.mm.plugin.finder.view.notice.NoticeStatusView
    public java.lang.String getPayText() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eyo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
