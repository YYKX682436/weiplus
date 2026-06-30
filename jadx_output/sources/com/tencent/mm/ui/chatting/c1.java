package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class c1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f198511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.v0 f198512e;

    public c1(com.tencent.mm.ui.chatting.v0 v0Var, boolean z17) {
        this.f198512e = v0Var;
        this.f198511d = z17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        boolean z17 = this.f198511d;
        com.tencent.mm.ui.chatting.v0 v0Var = this.f198512e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "speaker true");
            android.content.Context context = v0Var.f202772r;
            if (context != null) {
                v0Var.f202771q.Z(com.tencent.mm.R.raw.icons_outlined_speaker, com.tencent.mm.R.color.f478502m, context.getString(com.tencent.mm.R.string.fdp), 2000L);
            }
            v0Var.G(true);
            v0Var.K();
            if (v0Var.f202760J) {
                v0Var.B(java.lang.Math.max(v0Var.f202778x - 2000, 0L));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "speaker off");
            v0Var.G(false);
            if (v0Var.f202760J) {
                v0Var.K();
                v0Var.B(java.lang.Math.max(v0Var.f202778x - 2000, 0L));
            } else if (((sl.j) v0Var.f202765h).c()) {
                ((sl.j) v0Var.f202765h).f409037j = false;
                v0Var.t(false, true);
            }
        }
        return false;
    }
}
