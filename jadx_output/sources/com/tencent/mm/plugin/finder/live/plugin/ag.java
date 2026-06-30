package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ag extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(java.lang.String str) {
        super(1);
        this.f111878d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.zf zfVar = (dk2.zf) obj;
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.D0(zfVar.j(), this.f111878d) && com.tencent.mm.sdk.platformtools.t8.D0(zfVar.a(), c01.z1.r()));
    }
}
