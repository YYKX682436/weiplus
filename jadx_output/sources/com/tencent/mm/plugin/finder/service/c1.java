package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.s1 f126013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.finder.service.s1 s1Var, java.lang.String str) {
        super(1);
        this.f126013d = s1Var;
        this.f126014e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zy2.dc it = (zy2.dc) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f126013d.f126201i;
        java.lang.String str = this.f126014e;
        concurrentHashMap.remove(str);
        com.tencent.mars.xlog.Log.i("Finder.ContactService", "[checkContactExpired#result] talker=" + str + " nick=" + ((ya2.b2) it).w0());
        return jz5.f0.f302826a;
    }
}
