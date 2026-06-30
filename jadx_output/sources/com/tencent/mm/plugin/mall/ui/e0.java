package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n53 f148366d;

    public e0(com.tencent.mm.plugin.mall.ui.f0 f0Var, r45.n53 n53Var) {
        this.f148366d = n53Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "onFunctionItemClick: onCancel");
        bt4.c.b(this.f148366d.f381082d.f381996d + "");
    }
}
