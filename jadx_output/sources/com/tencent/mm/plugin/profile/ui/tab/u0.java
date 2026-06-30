package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public class u0 implements com.tencent.mm.plugin.profile.ui.tab.d7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154603a;

    public u0(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        this.f154603a = m0Var;
    }

    public void a(sr3.a aVar) {
        sr3.a aVar2 = sr3.a.f411829e;
        java.lang.String Bi = aVar == aVar2 ? ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Bi() : ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Di();
        com.tencent.pigeon.biz_base.PersonalCenterJumpInfo personalCenterJumpInfo = new com.tencent.pigeon.biz_base.PersonalCenterJumpInfo("wx0b2ec076ec39c786", "pages/image_editor/image_editor.html?biz=" + android.net.Uri.encode(Bi) + "&from=profile", java.lang.Long.valueOf(aVar == aVar2 ? 1338 : 1414), "5", java.lang.Boolean.FALSE, null, -1L, "", java.lang.Long.valueOf(aVar.f411832d), Bi);
        ur1.e eVar = ur1.e.f430346d;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154603a;
        com.tencent.mm.ui.MMActivity context = m0Var.f154456h;
        int i17 = m0Var.f154452d.g().f411832d;
        eVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Bi(2, "", i17, com.tencent.wechat.mm.biz.h2.PUBLISH_SCENE_PROFILE)) {
            i95.m c17 = i95.n0.c(r01.l1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((r01.l1) c17).aj(context, personalCenterJumpInfo, null, null);
        } else {
            zw.o.f476536a.a(context, 45, 20, true, true, 1, new ur1.d(personalCenterJumpInfo, context), false);
        }
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var2 = this.f154603a;
        ((ku5.t0) ku5.t0.f312615d).k(new gr3.a(0L, "", 0L, 0L, 0L, 202L, m0Var2.f154467v, m0Var2.L, 0), 100L);
    }
}
