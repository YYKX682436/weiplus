package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.mall.MallFunction f148506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.y f148508f;

    public w(com.tencent.mm.plugin.mall.ui.y yVar, com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction, int i17) {
        this.f148508f = yVar;
        this.f148506d = mallFunction;
        this.f148507e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "onFunctionItemClick: onClick");
        com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = this.f148506d;
        bt4.c.b(mallFunction.f179819d);
        this.f148508f.f148514a.Y6(mallFunction, this.f148507e);
    }
}
