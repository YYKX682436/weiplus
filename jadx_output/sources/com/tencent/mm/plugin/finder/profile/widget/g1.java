package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class g1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124549b;

    public g1(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str) {
        this.f124548a = s1Var;
        this.f124549b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.m70 m70Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.HeaderLiveWidget", "CgiFinderLiveReceiveConcertTicket errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c + ", errType: " + fVar.f70615a);
        if (fVar.f70616b == 0 && fVar.f70615a == 0 && (m70Var = (r45.m70) ((r45.o62) fVar.f70618d).getCustom(1)) != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.widget.f1(this.f124548a, m70Var, this.f124549b));
        }
        return jz5.f0.f302826a;
    }
}
