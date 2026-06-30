package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f198819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.x f198820b;

    public w(com.tencent.mm.ui.chatting.component.biz.x xVar, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f198820b = xVar;
        this.f198819a = u3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "request usebizmuteflag from server errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        if (i17 == 0 || i18 == 0) {
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.ui.chatting.component.biz.u(this), "process_biz_mute_contact");
            return null;
        }
        c01.z1.S(false);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.biz.v(this));
        return null;
    }
}
