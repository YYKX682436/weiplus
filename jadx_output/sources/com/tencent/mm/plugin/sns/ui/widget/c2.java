package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class c2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171096d;

    public c2(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        this.f171096d = snsCommentEmoticonDetailUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$longClickToShowAddEmoticonSheet$1");
        g4Var.f(1, this.f171096d.getString(com.tencent.mm.R.string.oj8));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$longClickToShowAddEmoticonSheet$1");
    }
}
