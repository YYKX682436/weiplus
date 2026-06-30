package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class w2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f137726n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.e3 f137727o;

    public w2(com.tencent.mm.plugin.fts.logic.e3 e3Var, long j17) {
        this.f137727o = e3Var;
        this.f137726n = j17;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteServiceNotifyMsgTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f137727o.f137517h.F(o13.d.f342219e, this.f137726n);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{MsgId: %d}", java.lang.Long.valueOf(this.f137726n));
    }
}
