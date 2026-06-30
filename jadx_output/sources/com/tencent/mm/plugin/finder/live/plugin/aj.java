package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class aj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.cj f111898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(com.tencent.mm.plugin.finder.live.plugin.cj cjVar) {
        super(0);
        this.f111898d = cjVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.cj cjVar = this.f111898d;
        com.tencent.mars.xlog.Log.i(cjVar.f112160h, "dynamicCardServerLost");
        qo0.c.a(cjVar.f112158f, qo0.b.G2, null, 2, null);
        return jz5.f0.f302826a;
    }
}
