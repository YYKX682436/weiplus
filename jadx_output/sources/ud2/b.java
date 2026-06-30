package ud2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.d f426583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sh1.f f426585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ud2.d dVar, java.lang.String str, sh1.f fVar) {
        super(0);
        this.f426583d = dVar;
        this.f426584e = str;
        this.f426585f = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ig2.d dVar;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.nw1 liveInfo;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject3;
        r45.nw1 liveInfo2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject4;
        r45.nw1 liveInfo3;
        ud2.d dVar2 = this.f426583d;
        java.lang.String str = dVar2.f426611b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on Action ");
        java.lang.String str2 = this.f426584e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (kotlin.jvm.internal.o.b(str2, "enterLive")) {
            sh1.f fVar = this.f426585f;
            fVar.l();
            ud2.c0 c0Var = dVar2.f426612c;
            c0Var.getClass();
            com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
            int c17 = e8Var.c(null);
            int a17 = e8Var.a();
            c0Var.f426593d = c17;
            c0Var.f426594e = a17;
            mn0.b0 b0Var = c0Var.f426598i;
            if (b0Var != null) {
                b0Var.A(c17, a17);
            }
            c50.s0 s0Var = (c50.s0) i95.n0.c(c50.s0.class);
            long j17 = 0;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = c0Var.f426591b;
            long id6 = finderObject != null ? finderObject.getId() : 0L;
            boolean wh6 = ((pg2.j0) s0Var).wh();
            android.content.Context context = c0Var.f426590a;
            if (!wh6 || c0Var.f426598i == null) {
                ez2.f fVar2 = ez2.f.f257898e;
                ez2.d dVar3 = ez2.d.f257872h;
                ez2.a aVar = ez2.a.f257866r;
                ez2.g.f257902a = new ez2.e(id6, fVar2, dVar3, 13, -1L);
                mn0.b0 b0Var2 = c0Var.f426598i;
                boolean z17 = b0Var2 != null && ((mn0.y) b0Var2).b(false);
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = c0Var.f426596g;
                boolean z18 = (finderItem2 == null || (feedObject4 = finderItem2.getFeedObject()) == null || (liveInfo3 = feedObject4.getLiveInfo()) == null || liveInfo3.getInteger(2) != 1) ? false : true;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = c0Var.f426596g;
                if (finderItem3 != null && (feedObject3 = finderItem3.getFeedObject()) != null && (liveInfo2 = feedObject3.getLiveInfo()) != null) {
                    liveInfo2.getLong(32);
                }
                com.tencent.mars.xlog.Log.i(c0Var.f426595f, "getSwitchDirector, isPlaying = " + z17 + ", liveStatusOpen = " + z18);
                if (!z17 || (finderItem = c0Var.f426596g) == null || (feedObject = finderItem.getFeedObject()) == null) {
                    dVar = null;
                } else {
                    long id7 = feedObject.getId();
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = c0Var.f426596g;
                    if (finderItem4 != null && (feedObject2 = finderItem4.getFeedObject()) != null && (liveInfo = feedObject2.getLiveInfo()) != null) {
                        j17 = liveInfo.getLong(0);
                    }
                    ig2.n nVar = new ig2.n(aVar, id7, j17, null, c0Var.f426599j, c0Var.f426600k, c0Var.f426601l, c0Var.f426598i);
                    c0Var.f426598i = null;
                    ig2.m mVar = ig2.m.f291393a;
                    kotlin.jvm.internal.o.g(context, "context");
                    long j18 = nVar.f291403b;
                    dVar = new ig2.d();
                    dVar.f291370d = nVar;
                    com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "startSwitchOutFromShopWindow feedId: " + j18 + " director: " + dVar + ' ');
                    mVar.g();
                    ig2.m.f291400h.put(java.lang.Long.valueOf(j18), dVar);
                    ez2.g.f257902a = new ez2.e(j18, fVar2, dVar3, nVar.f291402a.ordinal(), -1L);
                }
                c0Var.f426604o = dVar;
                ig2.d dVar4 = dVar instanceof ig2.d ? dVar : null;
                if (dVar4 != null) {
                    dVar4.f291371e = new ud2.s(fVar);
                }
                if (dVar != null) {
                    new ud2.t(c0Var).invoke();
                }
            } else {
                ez2.f fVar3 = ez2.f.f257899f;
                ez2.d dVar5 = ez2.d.f257872h;
                ez2.a aVar2 = ez2.a.f257866r;
                ez2.g.f257902a = new ez2.e(id6, fVar3, dVar5, 13, -1L);
                mn0.b0 b0Var3 = c0Var.f426598i;
                c0Var.f426598i = null;
                android.graphics.Rect b17 = qg2.d.f362793a.b(c0Var.f426599j, c0Var.f426600k, false);
                pg2.j0 j0Var = (pg2.j0) i95.n0.c(pg2.j0.class);
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                int i17 = c0Var.f426599j;
                int i18 = c0Var.f426600k;
                kotlin.jvm.internal.o.d(b0Var3);
                java.util.HashMap i19 = kz5.c1.i(new jz5.l("key_enter_type", 2), new jz5.l("key_enter_scene", aVar2));
                c50.e1 e1Var = new c50.e1(0, 0L, 0.0f, 0, 12, null);
                ud2.r rVar = new ud2.r(c0Var);
                j0Var.getClass();
                j0Var.Zi(e1Var, b17, b17, activity, id6, i17, i18, b0Var3, i19, rVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
