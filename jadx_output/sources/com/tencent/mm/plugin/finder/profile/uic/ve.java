package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ve extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f124299d = finderProfileTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124299d;
        if (!finderProfileTabUIC.y7(9)) {
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmojiFragment finderProfileEmojiFragment = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmojiFragment();
            finderProfileTabUIC.I7(9, finderProfileEmojiFragment);
            androidx.appcompat.app.AppCompatActivity activity = finderProfileTabUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a17, "tab_profile_emoji", 0, null, 0, null, 30, null);
            com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC) zVar.b(finderProfileEmojiFragment).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.class);
            if (finderEmojiListUIC != null) {
                finderEmojiListUIC.T6();
            }
        }
        return jz5.f0.f302826a;
    }
}
