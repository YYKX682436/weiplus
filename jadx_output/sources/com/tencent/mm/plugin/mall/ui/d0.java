package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class d0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n53 f148351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.f0 f148353f;

    public d0(com.tencent.mm.plugin.mall.ui.f0 f0Var, r45.n53 n53Var, int i17) {
        this.f148353f = f0Var;
        this.f148351d = n53Var;
        this.f148352e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "onFunctionItemClick: onClick");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.n53 n53Var = this.f148351d;
        sb6.append(n53Var.f381082d.f381996d);
        sb6.append("");
        bt4.c.b(sb6.toString());
        com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2.V6(this.f148353f.f148378a, n53Var, this.f148352e);
    }
}
