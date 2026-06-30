package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class o3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.i f145495d;

    public o3(com.tencent.mm.plugin.luckymoney.model.i iVar) {
        this.f145495d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.f145495d.j();
    }
}
