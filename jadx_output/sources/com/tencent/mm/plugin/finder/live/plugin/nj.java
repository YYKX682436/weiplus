package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class nj extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f113637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f113638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(az2.f fVar, kotlinx.coroutines.q qVar) {
        super(2);
        this.f113637d = fVar;
        this.f113638e = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        this.f113637d.b();
        ((kotlinx.coroutines.r) this.f113638e).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue)));
        return jz5.f0.f302826a;
    }
}
