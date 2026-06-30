package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC f136269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedPostProgressEvent f136270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC, com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
        super(0);
        this.f136269d = finderPostRemindUIC;
        this.f136270e = feedPostProgressEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        so2.u4 u4Var;
        int i17 = this.f136270e.f54250g.f6750b;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC = this.f136269d;
        finderPostRemindUIC.getClass();
        so2.v4 v4Var = i17 == 100 ? so2.v4.f410674g : so2.v4.f410673f;
        so2.a2 a2Var = finderPostRemindUIC.f133608e;
        if (a2Var != null && (u4Var = a2Var.f410252i) != null) {
            u4Var.f410637b = finderPostRemindUIC.f133609f;
            u4Var.f410638c = v4Var;
            u4Var.f410639d = i17;
        }
        finderPostRemindUIC.S6();
        return jz5.f0.f302826a;
    }
}
