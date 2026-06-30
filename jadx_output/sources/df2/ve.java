package df2;

/* loaded from: classes3.dex */
public final class ve extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231595m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f231596n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f231597o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Boolean f231598p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Boolean f231599q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231595m = "Micro.LiveCheckRoleAndPrivacyController";
    }

    public final boolean Z6() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        return (gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L) & 32) != 0;
    }

    public final boolean a7() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        return (gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L) & 16) != 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onFloatMode() {
        super.onFloatMode();
        this.f231596n = java.lang.Integer.valueOf(((mm2.c1) business(mm2.c1.class)).I7().getInteger(2));
        this.f231597o = java.lang.Boolean.valueOf(a7());
        this.f231598p = java.lang.Boolean.valueOf(Z6());
        this.f231599q = java.lang.Boolean.valueOf((a7() || Z6()) ? false : true);
        com.tencent.mars.xlog.Log.i(this.f231595m, "save on Float: roleTypeOnFloatMode=" + this.f231596n + ", chooseInvisibleVip=" + this.f231597o + ", chooseHideIdentity=" + this.f231598p + ", chooseNormal=" + this.f231599q);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f231596n = null;
        this.f231597o = null;
        this.f231598p = null;
        this.f231599q = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onNormalMode() {
        super.onNormalMode();
        java.lang.Integer num = ((mm2.c1) business(mm2.c1.class)).Y3;
        java.lang.String str = this.f231595m;
        if (num != null) {
            com.tencent.mars.xlog.Log.i(str, "special live room, do nothing");
            return;
        }
        java.lang.Integer num2 = this.f231596n;
        java.lang.Boolean bool = this.f231597o;
        java.lang.Boolean bool2 = this.f231598p;
        java.lang.Boolean bool3 = this.f231599q;
        if (num2 != null && bool != null && bool2 != null && bool3 != null) {
            boolean booleanValue = bool3.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            boolean booleanValue3 = bool.booleanValue();
            int intValue = num2.intValue();
            g92.b bVar = g92.b.f269769e;
            boolean z17 = intValue != bVar.k2().getInteger(4);
            boolean z18 = (booleanValue == (!a7() && !Z6()) && booleanValue3 == a7() && booleanValue2 == Z6()) ? false : true;
            if (z17 || z18) {
                com.tencent.mars.xlog.Log.i(str, "[checkRestartLive] reJoinLive!!!");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("role:");
                sb6.append(intValue);
                sb6.append('-');
                sb6.append(bVar.k2().getInteger(4));
                sb6.append(", ifNormal:");
                sb6.append(booleanValue);
                sb6.append('-');
                sb6.append((a7() || Z6()) ? false : true);
                sb6.append(", ifInvisible:");
                sb6.append(booleanValue3);
                sb6.append('-');
                sb6.append(a7());
                sb6.append(", ifHideId:");
                sb6.append(booleanValue2);
                sb6.append('-');
                sb6.append(Z6());
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                long j17 = ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
                am.ia iaVar = feedUpdateEvent.f54252g;
                iaVar.f6918a = j17;
                iaVar.f6919b = 14;
                iaVar.f6930m = z17;
                feedUpdateEvent.e();
                if (zl2.q4.f473933a.E()) {
                    pm0.v.V(1000L, new df2.ue(this));
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "[checkRestartLive] do nothing");
            }
        }
        this.f231596n = null;
        this.f231597o = null;
        this.f231598p = null;
        this.f231599q = null;
    }
}
