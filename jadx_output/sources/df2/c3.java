package df2;

/* loaded from: classes3.dex */
public final class c3 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.g3 f229853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f229854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f229855c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f229856d;

    public c3(df2.g3 g3Var, int i17, yz5.p pVar, int i18) {
        this.f229853a = g3Var;
        this.f229854b = i17;
        this.f229855c = pVar;
        this.f229856d = i18;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        df2.g3 g3Var = this.f229853a;
        mm2.c1 c1Var = (mm2.c1) g3Var.business(mm2.c1.class);
        int i19 = this.f229856d;
        c1Var.p8(i19);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("commonAnchorFlagClick failed, lastAnchorStateFlag:" + i19, (int) ((mm2.c1) g3Var.business(mm2.c1.class)).f328866q);
        yz5.p pVar = this.f229855c;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, cv2Var);
        }
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        df2.g3 g3Var = this.f229853a;
        ((mm2.c1) g3Var.business(mm2.c1.class)).q8(j17);
        ((mm2.c1) g3Var.business(mm2.c1.class)).Z9(j17);
        com.tencent.mm.plugin.finder.live.util.n2 n2Var = com.tencent.mm.plugin.finder.live.util.n2.f115640a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commonAnchorFlagClick succ, anchorStateFlag:");
        int i17 = this.f229854b;
        sb6.append(i17);
        n2Var.e(sb6.toString(), (int) ((mm2.c1) g3Var.business(mm2.c1.class)).f328866q);
        yz5.p pVar = this.f229855c;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, cv2Var);
        }
        int i18 = (int) j17;
        if (!pm0.v.z(i18, 64) || pm0.v.z(i18, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicSettingModeController", "commonAnchorFlagClick succ,is not enable link mic, anchorStateFlag:" + i17);
            if2.b.Y6(g3Var, qo0.b.R3, null, 2, null);
        }
    }
}
