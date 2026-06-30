package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ue extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f124267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, boolean z17) {
        super(0);
        this.f124266d = finderProfileTabUIC;
        this.f124267e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124266d;
        if (!finderProfileTabUIC.y7(13)) {
            boolean z17 = 4 == finderProfileTabUIC.getActivity().getIntent().getIntExtra("key_enter_profile_tab", 0);
            com.tencent.mm.plugin.finder.profile.uic.re reVar = new com.tencent.mm.plugin.finder.profile.uic.re(finderProfileTabUIC, 13);
            reVar.f477041b = 10000;
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftFragment finderProfileDraftFragment = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftFragment(this.f124267e);
            int size = finderProfileTabUIC.f7().size();
            finderProfileDraftFragment.f129265p = reVar.f124186k;
            finderProfileTabUIC.P6(size, reVar, finderProfileDraftFragment, z17);
            androidx.appcompat.app.AppCompatActivity activity = finderProfileTabUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a17, "drafttab", 0, null, 0, null, 30, null);
        }
        return jz5.f0.f302826a;
    }
}
