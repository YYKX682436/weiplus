package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ci implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC f123599d;

    public ci(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC) {
        this.f123599d = finderProfileTingAudioWithCollectionUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC = this.f123599d;
        androidx.appcompat.app.AppCompatActivity activity = finderProfileTingAudioWithCollectionUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class)).B7();
        gm0.j1.d().a(8460, new com.tencent.mm.plugin.finder.profile.uic.bi(finderProfileTingAudioWithCollectionUIC));
    }
}
