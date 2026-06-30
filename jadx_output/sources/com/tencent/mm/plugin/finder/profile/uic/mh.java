package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class mh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        super(0);
        this.f123991d = finderProfileTingAudioUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC = this.f123991d;
        if (!finderProfileTingAudioUIC.getContext().isFinishing()) {
            finderProfileTingAudioUIC.T6();
        }
        return jz5.f0.f302826a;
    }
}
