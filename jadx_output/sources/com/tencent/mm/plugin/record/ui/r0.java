package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class r0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.s0 f155473d;

    public r0(com.tencent.mm.plugin.record.ui.s0 s0Var) {
        this.f155473d = s0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.i7(this.f155473d.f155479d.f155486e);
        dialogInterface.dismiss();
    }
}
