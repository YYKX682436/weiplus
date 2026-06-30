package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class we extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f124327d = finderProfileTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124327d;
        if (!finderProfileTabUIC.y7(9)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "addEmojiTab");
            boolean z17 = 10 == finderProfileTabUIC.getActivity().getIntent().getIntExtra("key_enter_profile_tab", 0);
            com.tencent.mm.plugin.finder.profile.uic.re reVar = new com.tencent.mm.plugin.finder.profile.uic.re(finderProfileTabUIC, 9);
            reVar.f477041b = 70;
            finderProfileTabUIC.w7(reVar, z17);
            androidx.appcompat.app.AppCompatActivity activity = finderProfileTabUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a17, "tab_profile_emoji", 0, null, 0, null, 30, null);
        }
        return jz5.f0.f302826a;
    }
}
