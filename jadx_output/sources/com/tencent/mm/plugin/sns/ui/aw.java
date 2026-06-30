package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class aw implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI f167793d;

    public aw(com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f167793d = snsWsFoldDetailUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$7");
        g4Var.f(1, this.f167793d.getString(com.tencent.mm.R.string.f490507x1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$7");
    }
}
