package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes4.dex */
public class a0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.b0 f141511d;

    public a0(com.tencent.mm.plugin.game.ui.message.b0 b0Var) {
        this.f141511d = b0Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        p33.b0 b0Var = (p33.b0) oVar.f70711b.f70700a;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", "cgi 返回错误");
            return 0;
        }
        p33.a0 a0Var = b0Var.f351521d;
        if (a0Var != null && (str2 = a0Var.f351519e) != null && !"".equals(str2)) {
            db5.t7.g(this.f141511d.f141525e.f141493f2, b0Var.f351521d.f351519e);
        }
        return 0;
    }
}
