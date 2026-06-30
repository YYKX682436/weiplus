package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes9.dex */
public class f0 implements r01.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198778d;

    public f0(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198778d = aVar;
    }

    @Override // r01.v
    public void a(r01.u uVar) {
        java.lang.String str;
        if (uVar == null || uVar.f368252a != r01.t.UPDATE || (str = uVar.f368253b) == null || !str.equals(this.f198778d.f198580d.x())) {
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(uVar.f368253b, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "Get contact from db return null.(username : %s)", uVar.f368253b);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.biz.e0(this, uVar, n17));
        }
    }
}
