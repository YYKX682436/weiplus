package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class g0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.k0 f207508d;

    public g0(com.tencent.mm.ui.conversation.banner.k0 k0Var) {
        this.f207508d = k0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.conversation.banner.k0 k0Var = this.f207508d;
        k0Var.f207538y++;
        if (k0Var.f207538y > 99) {
            return false;
        }
        if (k0Var.f207537x == 1) {
            k0Var.f207526m.setText(((android.content.Context) k0Var.f402842g.get()).getResources().getString(com.tencent.mm.R.string.h7j, java.lang.Integer.valueOf(k0Var.f207538y)));
        }
        return true;
    }
}
