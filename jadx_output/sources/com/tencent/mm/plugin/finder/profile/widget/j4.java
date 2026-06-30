package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class j4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124589a;

    public j4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124589a = s4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.m70 m70Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("FinderMoreLiveNoticeListWidget", "CgiFinderLiveReceiveConcertTicket errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c + ", errType: " + fVar.f70615a);
        if (fVar.f70616b == 0 && fVar.f70615a == 0 && (m70Var = (r45.m70) ((r45.o62) fVar.f70618d).getCustom(1)) != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.widget.i4(this.f124589a, m70Var));
        }
        return jz5.f0.f302826a;
    }
}
