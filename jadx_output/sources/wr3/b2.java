package wr3;

/* loaded from: classes11.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment f448762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment) {
        super(0);
        this.f448762d = bizProfileTabVideoFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ul ulVar;
        r45.ul ulVar2;
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment = this.f448762d;
        r45.gl glVar = bizProfileTabVideoFragment.m0().f389237h;
        if ((glVar == null || (ulVar2 = glVar.f375326g) == null || ulVar2.f387453e != 0) ? false : true) {
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher n07 = bizProfileTabVideoFragment.n0();
            r45.gl glVar2 = bizProfileTabVideoFragment.m0().f389237h;
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.g(n07, n07.f154294y, new vr3.p(n07), 2, (glVar2 == null || (ulVar = glVar2.f375326g) == null) ? null : ulVar.f387452d, n07.f154284o, null, 32, null);
        }
        return jz5.f0.f302826a;
    }
}
