package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ov implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f113784d;

    public ov(com.tencent.mm.plugin.finder.live.plugin.ow owVar) {
        this.f113784d = owVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f113784d;
        int[] iArr = owVar.S;
        if (iArr[0] != 0 && iArr[1] != 0) {
            if (owVar.R <= 0) {
                this.f113784d.F = false;
                return false;
            }
            com.tencent.mm.plugin.finder.live.plugin.ow owVar2 = this.f113784d;
            owVar2.R--;
            if (!this.f113784d.E) {
                com.tencent.mm.plugin.finder.live.plugin.ow owVar3 = this.f113784d;
                int[] iArr2 = owVar3.S;
                int i17 = iArr2[0];
                int i18 = iArr2[1];
                android.graphics.Bitmap G1 = owVar3.G1();
                if (G1 == null) {
                    com.tencent.mars.xlog.Log.e(owVar3.f113787p, "emitLikeConfettiToAnchor: bitmap is null");
                } else {
                    owVar3.x1(G1, i17, i18, true, owVar3.M, owVar3.N, 1.0f);
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.ow owVar4 = this.f113784d;
            int i19 = owVar4.U + 1;
            owVar4.U = i19;
            if (i19 % owVar4.T == 0) {
                int[] iArr3 = owVar4.S;
                owVar4.v1(iArr3[0], iArr3[1]);
                com.tencent.mm.plugin.finder.live.plugin.ow owVar5 = this.f113784d;
                owVar5.U = 0;
                owVar5.Q.clear();
            }
        }
        return true;
    }
}
