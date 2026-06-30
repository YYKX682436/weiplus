package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class xj implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ck f200237c;

    public xj(com.tencent.mm.ui.chatting.component.ck ckVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        this.f200237c = ckVar;
        this.f200235a = f9Var;
        this.f200236b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.RevokeMsgComponent", "errCode:%d, retType:%d, errMsg:%s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a), fVar.f70617c);
        this.f200237c.f198580d.b();
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            this.f200235a.y3();
            java.lang.String string = this.f200237c.f198580d.s().getString(com.tencent.mm.R.string.b5l);
            java.lang.String str = "  " + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g3_);
            com.tencent.mm.storage.f9 f9Var = this.f200235a;
            com.tencent.mm.modelsimple.d1.J(string, str, f9Var, f9Var.J0());
            this.f200235a.p1("");
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f200235a.getMsgId(), this.f200235a);
            c01.v1.G(this.f200237c.f198580d.x(), this.f200236b);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.ui.chatting.component.wj wjVar = new com.tencent.mm.ui.chatting.component.wj(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(wjVar, 300000L, null);
        } else {
            db5.e1.y(this.f200237c.f198580d.g(), fVar.f70617c, "", this.f200237c.f198580d.s().getString(com.tencent.mm.R.string.b5m), new com.tencent.mm.ui.chatting.component.vj(this));
        }
        return null;
    }
}
