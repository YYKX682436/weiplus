package df2;

/* loaded from: classes3.dex */
public final class ih extends df2.de {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f230399p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f230400q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f230401r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f230402s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f230403t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f230404u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Integer f230405v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f230406w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f230407x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Integer f230408y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230399p = "Micro.LiveEmojiMsgConfigController";
        this.f230403t = true;
    }

    public final void m7(java.lang.Long l17, java.lang.String str) {
        java.lang.String str2 = this.f230399p;
        com.tencent.mars.xlog.Log.i(str2, "[refreshCanSendEmoji-" + str + "] flag = " + l17);
        if (l17 != null) {
            long longValue = l17.longValue();
            qs5.h[] hVarArr = qs5.h.f366433d;
            boolean A = pm0.v.A(longValue, 4);
            if (A != this.f230400q) {
                com.tencent.mars.xlog.Log.i(str2, "canSendEmojiMsg set to " + A);
            }
            this.f230400q = A;
            qs5.h[] hVarArr2 = qs5.h.f366433d;
            boolean A2 = pm0.v.A(longValue, 16);
            if (A2 != this.f230401r) {
                com.tencent.mars.xlog.Log.i(str2, "canShowEmojiPanel set to " + A2);
            }
            this.f230401r = A2;
            qs5.h[] hVarArr3 = qs5.h.f366433d;
            boolean A3 = pm0.v.A(longValue, 32);
            if (A3 != this.f230402s) {
                com.tencent.mars.xlog.Log.i(str2, "anchorEmojiSwitchGrayout set to " + A3);
            }
            this.f230402s = A3;
            qs5.h[] hVarArr4 = qs5.h.f366433d;
            boolean A4 = pm0.v.A(longValue, 8);
            if (A4 != this.f230403t) {
                com.tencent.mars.xlog.Log.i(str2, "anchorEmojiSwitchHide set to " + A4);
            }
            this.f230403t = A4;
            qs5.h[] hVarArr5 = qs5.h.f366433d;
            boolean A5 = pm0.v.A(longValue, 128);
            if (A5 != this.f230404u) {
                com.tencent.mars.xlog.Log.i(str2, "canShowEmojiRecommend set to " + A5);
            }
            this.f230404u = A5;
        }
    }

    @Override // df2.de, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        r45.up1 up1Var;
        super.onLiveMsg(r71Var);
        m7((r71Var == null || (up1Var = (r45.up1) r71Var.getCustom(32)) == null) ? null : java.lang.Long.valueOf(up1Var.getLong(5)), "onLiveMsg");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        r45.dp1 dp1Var;
        r45.up1 up1Var;
        super.onLiveStart(hc1Var);
        m7((hc1Var == null || (up1Var = (r45.up1) hc1Var.getCustom(68)) == null) ? null : java.lang.Long.valueOf(up1Var.getLong(5)), "onLiveStart");
        if (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.getCustom(85)) == null || (dp1Var = (r45.dp1) ic1Var.getCustom(18)) == null) {
            return;
        }
        this.f230405v = java.lang.Integer.valueOf((int) (dp1Var.getFloat(0) * O6().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)));
        this.f230406w = java.lang.Integer.valueOf((int) (dp1Var.getFloat(1) * O6().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)));
        this.f230407x = dp1Var.getBoolean(2);
        this.f230408y = java.lang.Integer.valueOf((int) (dp1Var.getFloat(3) * O6().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)));
        java.lang.String str = "isInLine = " + this.f230407x + ", barrageMaxSize = " + this.f230408y;
        java.lang.String str2 = this.f230399p;
        com.tencent.mars.xlog.Log.i(str2, str);
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Q7).getValue()).r()).intValue();
        java.lang.Integer valueOf = intValue > 0 ? java.lang.Integer.valueOf(O6().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) * intValue) : this.f230408y;
        com.tencent.mars.xlog.Log.i(str2, "syncBarrageMaxSizeToDanmakuSlice: fakeConfigValue=" + intValue + ", barrageMaxSize=" + this.f230408y + ", finalSize=" + valueOf);
        ((mm2.j2) getStore().getLiveRoomData().a(mm2.j2.class)).E = valueOf;
    }
}
