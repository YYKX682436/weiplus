package com.tencent.mm.plugin.record.ui;

/* loaded from: classes4.dex */
public class l0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.m0 f155436d;

    public l0(com.tencent.mm.plugin.record.ui.m0 m0Var) {
        this.f155436d = m0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgDetailUI", "revoke history alert: click i know");
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.this.finish();
    }
}
