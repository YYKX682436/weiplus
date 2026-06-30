package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes10.dex */
public final class d0 extends androidx.activity.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.uic.e0 f174749a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.ting.uic.e0 e0Var) {
        super(true);
        this.f174749a = e0Var;
    }

    @Override // androidx.activity.g
    public void handleOnBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFloatBallAnimationUICWrapper", "handleOnBackPressed");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.ting.uic.c0(this.f174749a, null), 3, null);
    }
}
