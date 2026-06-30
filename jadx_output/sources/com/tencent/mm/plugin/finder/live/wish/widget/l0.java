package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class l0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f120727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f120728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f120729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120730d;

    public l0(gk2.e eVar, int i17, boolean z17, int i18, com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120727a = eVar;
        this.f120728b = z17;
        this.f120729c = i18;
        this.f120730d = t0Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        int i19 = this.f120729c;
        gk2.e eVar = this.f120727a;
        boolean z17 = this.f120728b;
        if (z17) {
            mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            c1Var.p8(i19 & (-4194305));
        } else {
            mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            c1Var2.p8(i19 | 4194304);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f120730d.D;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("giftWallSwitchBtn");
            throw null;
        }
        mMSwitchBtn.setCheck(!z17);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("optGiftWall failed, flag:4194304", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        gk2.e eVar = this.f120727a;
        ((mm2.c1) eVar.a(mm2.c1.class)).q8(j17);
        ((mm2.c1) eVar.a(mm2.c1.class)).Z9(j17);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("optGiftWall succ, flag:4194304", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q);
    }
}
