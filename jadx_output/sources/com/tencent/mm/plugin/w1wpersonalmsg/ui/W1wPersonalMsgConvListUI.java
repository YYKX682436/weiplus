package com.tencent.mm.plugin.w1wpersonalmsg.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvListUI;", "Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgBaseConvListUI;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class W1wPersonalMsgConvListUI extends com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI {
    @Override // com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI
    public java.lang.String U6() {
        java.lang.String string = getString(com.tencent.mm.R.string.pcm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI
    public com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment V6() {
        return new com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgConvFragment();
    }
}
