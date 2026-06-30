package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class x implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.mall.MallFunction f148511d;

    public x(com.tencent.mm.plugin.mall.ui.y yVar, com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction) {
        this.f148511d = mallFunction;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "onFunctionItemClick: onCancel");
        bt4.c.b(this.f148511d.f179819d);
    }
}
