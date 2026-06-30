package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.q3 f173895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.textstatus.ui.q3 q3Var) {
        super(1);
        this.f173895d = q3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kk4.b player;
        kk4.b player2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = this.f173895d;
        q3Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserToggleMute: newMuted=");
        sb6.append(booleanValue);
        sb6.append(", hasVideo=");
        sb6.append(q3Var.M != null);
        sb6.append(", isLivePhoto=");
        mj4.h hVar = q3Var.A;
        sb6.append(hVar != null ? java.lang.Boolean.valueOf(((mj4.k) hVar).x()) : null);
        sb6.append(", thirdBack=");
        al5.a0 a0Var = q3Var.B1;
        sb6.append(a0Var != null ? a0Var.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i(q3Var.f174190e, sb6.toString());
        q3Var.Z = !booleanValue;
        if (booleanValue) {
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = q3Var.M;
            if (mMTPEffectVideoLayout != null && (player2 = mMTPEffectVideoLayout.getPlayer()) != null) {
                ((kk4.v) player2).C(true);
            }
            q3Var.G();
        } else {
            q3Var.J();
            mj4.h hVar2 = q3Var.A;
            if (hVar2 != null && ((mj4.k) hVar2).x()) {
                com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout2 = q3Var.M;
                com.tencent.mm.plugin.textstatus.ui.nd ndVar = q3Var.f174200p0;
                ndVar.getClass();
                if (mMTPEffectVideoLayout2 != null && (player = mMTPEffectVideoLayout2.getPlayer()) != null) {
                    ndVar.f174130b = false;
                    kk4.v vVar = (kk4.v) player;
                    vVar.A(false);
                    android.widget.FrameLayout frameLayout = q3Var.B;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(0.0f);
                    }
                    kk4.b.f(player, 0, false, null, 6, null);
                    vVar.O();
                }
            }
        }
        al5.a0 a0Var2 = q3Var.B1;
        if (a0Var2 != null) {
            a0Var2.a(booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
