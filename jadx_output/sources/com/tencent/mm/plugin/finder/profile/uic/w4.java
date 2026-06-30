package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(0);
        this.f124314d = finderProfileFeedUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean drawerMode;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124314d;
        androidx.appcompat.app.AppCompatActivity activity = finderProfileFeedUIC.getActivity();
        boolean isSelfFlag = finderProfileFeedUIC.isSelfFlag();
        drawerMode = finderProfileFeedUIC.getDrawerMode();
        return new com.tencent.mm.plugin.finder.profile.h(activity, isSelfFlag, 0, drawerMode, true);
    }
}
