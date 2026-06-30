package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ud0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.de0 f114554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(com.tencent.mm.plugin.finder.live.plugin.de0 de0Var) {
        super(0);
        this.f114554d = de0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("FinderLiveTopCommentPlugin", new com.tencent.mm.plugin.finder.live.plugin.td0(this.f114554d));
        n3Var.setLogging(false);
        return n3Var;
    }
}
