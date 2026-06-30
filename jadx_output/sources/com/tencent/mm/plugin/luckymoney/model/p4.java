package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class p4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.r4 f145544d;

    public p4(com.tencent.mm.plugin.luckymoney.model.r4 r4Var) {
        this.f145544d = r4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f145544d.e();
    }
}
