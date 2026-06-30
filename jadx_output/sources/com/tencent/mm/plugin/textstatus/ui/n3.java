package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class n3 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.q3 f174113d;

    public n3(com.tencent.mm.plugin.textstatus.ui.q3 q3Var) {
        this.f174113d = q3Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        kk4.b player;
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f174113d.M;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).C(true);
    }

    @Override // f25.f
    public void onResume() {
        kk4.b player;
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f174113d.M;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).C(false);
    }

    @Override // f25.f
    public void onStop() {
        kk4.b player;
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f174113d.M;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).C(true);
    }
}
