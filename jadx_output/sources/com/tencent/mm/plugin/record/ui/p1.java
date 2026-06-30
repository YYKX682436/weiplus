package com.tencent.mm.plugin.record.ui;

/* loaded from: classes5.dex */
public class p1 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155467b;

    public p1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI, java.lang.String str) {
        this.f155467b = recordMsgImageUI;
        this.f155466a = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "save video now video path %s out path %s", this.f155466a, str2);
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155467b;
        dp.a.makeText(recordMsgImageUI.getContext(), recordMsgImageUI.getString(com.tencent.mm.R.string.k7b, q75.c.c(str2)), 1).show();
        q75.c.f(str2, recordMsgImageUI.getContext());
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "save video now video path %s out path %s", this.f155466a, str2);
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155467b;
        dp.a.makeText(recordMsgImageUI.getContext(), recordMsgImageUI.getString(com.tencent.mm.R.string.k7a), 1).show();
    }
}
