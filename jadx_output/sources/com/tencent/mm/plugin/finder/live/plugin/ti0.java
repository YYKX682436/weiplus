package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ti0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vi0 f114408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(com.tencent.mm.plugin.finder.live.plugin.vi0 vi0Var) {
        super(0);
        this.f114408d = vi0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.vi0 vi0Var = this.f114408d;
        vi0Var.K0(0);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ui0(vi0Var));
        com.tencent.mm.plugin.finder.live.plugin.si0 si0Var = new com.tencent.mm.plugin.finder.live.plugin.si0(vi0Var);
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = vi0Var.f114730r;
        finderLiveFloatContainer.animate().translationX(0.0f).setListener(new com.tencent.mm.plugin.finder.live.view.u4(finderLiveFloatContainer, si0Var)).setDuration(500L).start();
        return jz5.f0.f302826a;
    }
}
