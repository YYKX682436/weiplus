package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce2.i f112301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, ce2.i iVar) {
        super(0);
        this.f112300d = hmVar;
        this.f112301e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112300d;
        df2.pk pkVar = (df2.pk) hmVar.U0(df2.pk.class);
        if (pkVar != null) {
            pkVar.h7(this.f112301e, hmVar.E1().f436569j);
        }
        return jz5.f0.f302826a;
    }
}
