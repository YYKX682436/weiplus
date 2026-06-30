package wr3;

/* loaded from: classes11.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment f448910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment) {
        super(0);
        this.f448910d = bizProfileTabMsgFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ul ulVar;
        r45.ul ulVar2;
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment = this.f448910d;
        r45.gl glVar = bizProfileTabMsgFragment.m0().f389235f;
        if ((glVar == null || (ulVar2 = glVar.f375326g) == null || ulVar2.f387453e != 0) ? false : true) {
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher n07 = bizProfileTabMsgFragment.n0();
            r45.gl glVar2 = bizProfileTabMsgFragment.m0().f389235f;
            n07.f(n07.f154295z, new vr3.j(n07), 1, (glVar2 == null || (ulVar = glVar2.f375326g) == null) ? null : ulVar.f387452d, n07.f154283n, vr3.k.f439635d);
        }
        return jz5.f0.f302826a;
    }
}
