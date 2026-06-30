package com.tencent.mm.plugin.profile.ui.tab;

@j95.b
/* loaded from: classes11.dex */
public final class s extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f154535d = "BizProfileDataUtil";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f154536e = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.g(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f154537f = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.n(this));

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f154538g = new java.util.concurrent.atomic.AtomicReference();

    public s() {
        kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.atomic.AtomicBoolean(false);
        new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final com.tencent.wechat.iam.biz.p1 Ai() {
        sr3.a aVar;
        sr3.g gVar = (sr3.g) this.f154538g.get();
        if (gVar == null || (aVar = gVar.g()) == null) {
            aVar = sr3.a.f411829e;
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            com.tencent.wechat.iam.biz.p1 p1Var = (com.tencent.wechat.iam.biz.p1) ((jz5.n) this.f154536e).getValue();
            kotlin.jvm.internal.o.d(p1Var);
            return p1Var;
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        com.tencent.wechat.iam.biz.p1 p1Var2 = (com.tencent.wechat.iam.biz.p1) ((jz5.n) this.f154537f).getValue();
        kotlin.jvm.internal.o.d(p1Var2);
        return p1Var2;
    }

    public final java.lang.String Bi() {
        java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368153a;
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.w(this.f154535d, "getPersonalCenterBiz failed");
        }
        return str;
    }

    public final java.lang.String Di() {
        java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f368148m.f368153a;
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.w(this.f154535d, "getPersonalCenterPhoto failed");
        }
        return str;
    }

    public final void Ni(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((r01.l1) i95.n0.c(r01.l1.class)).Ui(callback);
    }

    public final void Ri(sr3.g config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f154538g.set(config);
        com.tencent.mars.xlog.Log.i(this.f154535d, "setCurrentConfig: " + config.g());
    }

    public final void wi(int i17) {
        Ai().b(i17);
    }
}
