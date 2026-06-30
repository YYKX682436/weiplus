package com.tencent.mm.plugin.sns.model;

/* loaded from: classes.dex */
public final /* synthetic */ class l4$$a implements com.tencent.mm.ui.widget.dialog.w1 {
    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$handleSnsDBDamage$0", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "[negativeClick]:click cancel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$handleSnsDBDamage$0", "com.tencent.mm.plugin.sns.model.SnsCore");
    }
}
