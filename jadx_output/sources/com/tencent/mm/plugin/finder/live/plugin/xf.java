package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f115082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f115083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar) {
        super(0);
        this.f115082d = mgVar;
        this.f115083e = zfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "#showStickTopTitleMsg contentTv unFoldListener click");
        com.tencent.mm.plugin.finder.live.plugin.mg.v1(this.f115082d, this.f115083e);
        return jz5.f0.f302826a;
    }
}
