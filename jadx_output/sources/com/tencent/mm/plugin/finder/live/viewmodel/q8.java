package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class q8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f117347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.s8 f117348b;

    public q8(boolean z17, com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var) {
        this.f117347a = z17;
        this.f117348b = s8Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var = this.f117348b;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.p8(s8Var));
        int i17 = fVar.f70615a;
        boolean z17 = this.f117347a;
        if (i17 == 0 && fVar.f70616b == 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_SWITCH_ENABLE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        } else {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = s8Var.f117401f;
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setCheck(!z17);
            }
        }
        return jz5.f0.f302826a;
    }
}
