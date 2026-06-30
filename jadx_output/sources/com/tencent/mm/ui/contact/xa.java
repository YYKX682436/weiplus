package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public final class xa implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207251a;

    public xa(java.lang.String str) {
        this.f207251a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "[CgiInviteCoManagerForAccount] end, errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
        return ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.contact.wa(fVar, this.f207251a));
    }
}
