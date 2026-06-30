package df2;

/* loaded from: classes3.dex */
public final class dg extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f229975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f229976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(df2.ug ugVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(2);
        this.f229975d = ugVar;
        this.f229976e = liveRoomControllerStore;
    }

    public static final void a(df2.ug ugVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, dk2.zf zfVar, android.view.View view, wp.i iVar) {
        java.lang.String f17 = zfVar.f();
        if (f17 != null) {
            ((mm2.j2) liveRoomControllerStore.getLiveRoomData().a(mm2.j2.class)).a7(new jz5.l(f17, 2));
        }
        se2.w wVar = se2.w.f406895a;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = ugVar.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        yg2.b viewScope = k0Var != null ? k0Var.getViewScope() : null;
        gk2.e liveRoomData = liveRoomControllerStore.getLiveRoomData();
        java.lang.Object obj = ugVar.f291099e;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
        android.content.Context context = ((android.view.View) obj).getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        wVar.l(viewScope, zfVar, view, liveRoomData, context, false);
        xs2.u uVar = ugVar.f231526q;
        if (uVar != null) {
            uVar.b(iVar);
        }
    }

    public static final void d(zp.m mVar, df2.ug ugVar, xs2.p0 p0Var) {
        long j17 = mVar.f474922a;
        float f17 = p0Var.f448338i - xp.d.f().f455848e;
        long j18 = p0Var.f448333d;
        float f18 = f17 - (((float) (j17 - j18)) * p0Var.G);
        if (f18 <= 0.0f) {
            com.tencent.mars.xlog.Log.i(ugVar.f231522m, "showEntireDanmaku waitToShowWidth:" + f18);
            return;
        }
        gm2.c1 c1Var = gm2.c1.f273320a;
        jz5.g gVar = gm2.c1.f273332m;
        float intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() + f18;
        p0Var.f448333d -= (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() + f18) / p0Var.G;
        com.tencent.mars.xlog.Log.i(ugVar.f231522m, "showEntireDanmaku waitToShowWidth:" + f18 + ",forwardDistance:" + intValue + ",sourceFirstDrawTime:" + j18 + ",after forward firstDrawTime:" + p0Var.f448333d);
        xs2.u uVar = ugVar.f231526q;
        if (uVar != null) {
            uVar.d(p0Var);
        }
        float f19 = mVar.f474925d - intValue;
        float f27 = mVar.f474926e;
        mVar.f474925d = f19;
        mVar.f474926e = f27;
    }

    public static final boolean e(zp.m mVar, android.view.View view) {
        if (view.getVisibility() == 0 && mVar.f474923b.x - mVar.f474925d >= view.getLeft()) {
            android.graphics.Point point = mVar.f474923b;
            if (point.x - mVar.f474925d <= view.getRight() && point.y - mVar.f474926e >= view.getTop() && point.y - mVar.f474926e <= view.getBottom()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01dc, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0857  */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instructions count: 2170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.dg.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
