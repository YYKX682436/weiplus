package mm2;

/* loaded from: classes3.dex */
public final class o2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f329300f;

    /* renamed from: g, reason: collision with root package name */
    public int f329301g;

    /* renamed from: h, reason: collision with root package name */
    public r45.lz1 f329302h;

    /* renamed from: i, reason: collision with root package name */
    public int f329303i;

    /* renamed from: m, reason: collision with root package name */
    public dk2.p f329304m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f329305n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f329306o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f329307p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f329308q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329300f = "LiveGamePostSlice@" + hashCode();
        this.f329302h = new r45.lz1();
        this.f329304m = new dk2.p();
    }

    public final void N6(r45.n73 gameUserInfo) {
        kotlin.jvm.internal.o.g(gameUserInfo, "gameUserInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initFromGameUserInfo] = ");
        r45.z73 z73Var = (r45.z73) gameUserInfo.getCustom(5);
        sb6.append(z73Var != null ? pm0.b0.g(z73Var) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f329300f;
        com.tencent.mars.xlog.Log.i(str, sb7);
        r45.z73 z73Var2 = (r45.z73) gameUserInfo.getCustom(5);
        if (z73Var2 != null) {
            ((mm2.o2) business(mm2.o2.class)).f329301g = z73Var2.getInteger(2);
            mm2.o2 o2Var = (mm2.o2) business(mm2.o2.class);
            r45.lz1 lz1Var = new r45.lz1();
            lz1Var.set(0, java.lang.Integer.valueOf(z73Var2.getInteger(3)));
            lz1Var.set(1, java.lang.Integer.valueOf(z73Var2.getInteger(4)));
            o2Var.f329302h = lz1Var;
            ((mm2.o2) business(mm2.o2.class)).f329303i = z73Var2.getInteger(5);
            dk2.p pVar = ((mm2.o2) business(mm2.o2.class)).f329304m;
            r45.xl1 xl1Var = (r45.xl1) z73Var2.getCustom(6);
            pVar.l(xl1Var != null ? xl1Var.getList(1) : null);
            ((mm2.o2) business(mm2.o2.class)).O6(z73Var2.getInteger(8) != 1);
            com.tencent.mars.xlog.Log.i(str, "[saveFuncSwitchFlag] flags = " + z73Var2.getLong(9));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, java.lang.Long.valueOf(z73Var2.getLong(9)));
            mm2.o2 o2Var2 = (mm2.o2) business(mm2.o2.class);
            r45.dc6 dc6Var = (r45.dc6) z73Var2.getCustom(12);
            o2Var2.f329308q = dc6Var != null ? dc6Var.getBoolean(2) : false;
            com.tencent.mars.xlog.Log.i(str, "[saveGameLiveGlobalFlag] flags = " + z73Var2.getInteger(15));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_GLOBAL_FLAG_INT_SYNC, java.lang.Integer.valueOf(z73Var2.getInteger(15)));
            mm2.o2 o2Var3 = (mm2.o2) business(mm2.o2.class);
            r45.kz0 kz0Var = (r45.kz0) z73Var2.getCustom(10);
            o2Var3.f329306o = pm0.v.z(kz0Var != null ? kz0Var.getInteger(1) : 0, 16);
            ((mm2.c1) business(mm2.c1.class)).f328805f6.setValue(java.lang.Boolean.valueOf(z73Var2.getBoolean(13)));
            ((mm2.c1) business(mm2.c1.class)).f328811g6 = (r45.yq1) z73Var2.getCustom(14);
            ((mm2.c1) business(mm2.c1.class)).t9((com.tencent.mm.protocal.protobuf.FinderJumpInfo) z73Var2.getCustom(20));
            ((mm2.o2) business(mm2.o2.class)).f329307p = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) z73Var2.getCustom(19);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("gamelive creatorCenterEntrance:");
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) z73Var2.getCustom(16);
            sb8.append(finderJumpInfo != null ? java.lang.Integer.valueOf(finderJumpInfo.hashCode()) : null);
            com.tencent.mars.xlog.Log.i(str, sb8.toString());
            ((mm2.c1) business(mm2.c1.class)).W2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) z73Var2.getCustom(18);
            ((mm2.c1) business(mm2.c1.class)).X2 = z73Var2.getBoolean(17);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("canShow3d: ");
            sb9.append(((mm2.c1) business(mm2.c1.class)).X2);
            sb9.append(", data: ");
            sb9.append(((mm2.c1) business(mm2.c1.class)).W2 != null);
            com.tencent.mars.xlog.Log.i(str, sb9.toString());
        }
    }

    public final void O6(boolean z17) {
        if (z17 != this.f329305n) {
            com.tencent.mars.xlog.Log.i(this.f329300f, "bindShop:from " + this.f329305n + " to " + z17 + '!');
            if (z17) {
                ((mm2.f6) business(mm2.f6.class)).e7(((mm2.c1) business(mm2.c1.class)).v7());
            }
        }
        this.f329305n = z17;
    }

    public final void P6(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f329307p = finderJumpInfo;
    }

    public final void Q6(boolean z17) {
        this.f329308q = z17;
    }

    public final void clear() {
        this.f329301g = 0;
        this.f329302h = new r45.lz1();
        this.f329303i = 0;
        this.f329304m = new dk2.p();
        O6(false);
        this.f329306o = false;
        this.f329307p = null;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        clear();
    }
}
