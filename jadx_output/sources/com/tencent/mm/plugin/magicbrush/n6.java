package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public final class n6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.magicbrush.n6 f148087d = new com.tencent.mm.plugin.magicbrush.n6();

    public n6() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fq0.i iVar = (fq0.i) ((jz5.n) ((fq0.n) ((gq0.q) i95.n0.c(gq0.q.class))).f265457e).getValue();
        kotlin.jvm.internal.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.api.IMBPluginProvider");
        jz5.l lVar = new jz5.l("MagicSclPublicService", iVar);
        e10.j jVar = (e10.j) ((jz5.n) ((e10.n) ((d10.m) i95.n0.c(d10.m.class))).f246340d).getValue();
        kotlin.jvm.internal.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.api.IMBPluginProvider");
        return kz5.c1.i(lVar, new jz5.l("MagicEcsPublicService", jVar));
    }
}
