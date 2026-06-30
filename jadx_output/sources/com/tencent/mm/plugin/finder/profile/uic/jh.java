package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class jh extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader f123863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC, com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader) {
        super(3);
        this.f123862d = finderProfileTingAudioUIC;
        this.f123863e = finderProfileTingAudioListLoader;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        if (!booleanValue2) {
            this.f123862d.getRlLayout().f();
        }
        com.tencent.mars.xlog.Log.i(this.f123863e.getF123427d(), "fetchCallback isInit:" + booleanValue + " hasMore:" + booleanValue2);
        return jz5.f0.f302826a;
    }
}
