package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class b2 extends com.tencent.mm.plugin.finder.convert.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed currentItem) {
        super(holder, currentItem);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(currentItem, "currentItem");
    }

    @Override // com.tencent.mm.plugin.finder.convert.d, com.tencent.mm.plugin.finder.convert.r0
    public void a() {
    }

    @Override // com.tencent.mm.plugin.finder.convert.d, com.tencent.mm.plugin.finder.convert.s0
    public void b() {
        android.text.SpannableString flowCardDescSpan;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) this.f103103d.p(com.tencent.mm.R.id.ufp);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103104e;
        if (baseFinderFeed.getFeedObject().isLive()) {
            flowCardDescSpan = baseFinderFeed.getFeedObject().getFlowCardDescSpan();
            if (flowCardDescSpan == null) {
                flowCardDescSpan = new android.text.SpannableString(baseFinderFeed.getFeedObject().getDescription());
            }
        } else {
            flowCardDescSpan = baseFinderFeed.getFeedObject().getFlowCardDescSpan();
            if (flowCardDescSpan == null) {
                flowCardDescSpan = new android.text.SpannableString("");
            }
        }
        if (!(flowCardDescSpan.length() == 0)) {
            if (neatTextView != null) {
                neatTextView.setVisibility(0);
            }
            if (neatTextView != null) {
                neatTextView.b(flowCardDescSpan);
                return;
            }
            return;
        }
        if (!((java.lang.Boolean) ((jz5.n) this.f103105f).getValue()).booleanValue() || baseFinderFeed.getFeedObject().isLive()) {
            if (neatTextView == null) {
                return;
            }
            neatTextView.setVisibility(4);
        } else {
            if (neatTextView == null) {
                return;
            }
            neatTextView.setVisibility(8);
        }
    }
}
