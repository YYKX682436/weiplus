package df2;

/* loaded from: classes3.dex */
public final class yg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.bh f231867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f231868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(df2.bh bhVar, jz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231867e = bhVar;
        this.f231868f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.yg(this.f231867e, this.f231868f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.yg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.ow owVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231866d;
        kotlinx.coroutines.a1 a1Var = kotlinx.coroutines.a1.UNDISPATCHED;
        df2.bh bhVar = this.f231867e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if2.d0 d0Var = bhVar.f229811t;
            if (d0Var != null) {
                d0Var.d(0);
            }
            com.tencent.mm.plugin.finder.live.widget.e30 e30Var = (com.tencent.mm.plugin.finder.live.widget.e30) bhVar.R6(com.tencent.mm.plugin.finder.live.widget.e30.class);
            if (e30Var != null) {
                com.tencent.mm.sdk.platformtools.u3.l(e30Var.I);
                ((mm2.c1) e30Var.P0(mm2.c1.class)).J1++;
                e30Var.f365323d.post(new com.tencent.mm.plugin.finder.live.widget.r20(e30Var, ((mm2.c1) e30Var.f118212q.P0(mm2.c1.class)).J1));
                e30Var.w1(false);
                com.tencent.mars.xlog.Log.i(e30Var.f118213r, "[ken_stopPostLike]");
                com.tencent.mm.plugin.finder.live.util.y.m(e30Var, null, a1Var, new com.tencent.mm.plugin.finder.live.widget.a30(e30Var, null), 1, null);
                e30Var.v1(true);
                pm0.v.V(e30Var.H - 10, new com.tencent.mm.plugin.finder.live.widget.q20(e30Var));
            }
            com.tencent.mm.plugin.finder.live.plugin.ow owVar2 = (com.tencent.mm.plugin.finder.live.plugin.ow) bhVar.R6(com.tencent.mm.plugin.finder.live.plugin.ow.class);
            android.graphics.Bitmap G1 = owVar2 != null ? owVar2.G1() : null;
            if (G1 != null && (owVar = (com.tencent.mm.plugin.finder.live.plugin.ow) bhVar.R6(com.tencent.mm.plugin.finder.live.plugin.ow.class)) != null) {
                jz5.l lVar = this.f231868f;
                int intValue = ((java.lang.Number) lVar.f302833d).intValue();
                int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
                this.f231866d = 1;
                if (owVar.y1(G1, intValue, intValue2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = bhVar.f229804m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anim end, channel.isEmpty = ");
        u26.w wVar = bhVar.f229806o;
        sb6.append(wVar.isEmpty());
        sb6.append(",animRoot.childCount = ");
        android.widget.FrameLayout frameLayout = bhVar.f229805n;
        sb6.append(frameLayout != null ? new java.lang.Integer(frameLayout.getChildCount()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (wVar.isEmpty()) {
            android.widget.FrameLayout frameLayout2 = bhVar.f229805n;
            if (frameLayout2 != null && frameLayout2.getChildCount() == 0) {
                com.tencent.mars.xlog.Log.i(bhVar.f229804m, "root gone");
                if2.d0 d0Var2 = bhVar.f229811t;
                if (d0Var2 != null) {
                    d0Var2.d(8);
                }
                com.tencent.mm.plugin.finder.live.widget.e30 e30Var2 = (com.tencent.mm.plugin.finder.live.widget.e30) bhVar.R6(com.tencent.mm.plugin.finder.live.widget.e30.class);
                if (e30Var2 != null) {
                    e30Var2.w1(false);
                    com.tencent.mars.xlog.Log.i(e30Var2.f118213r, "[ken_stopPostLike]");
                    com.tencent.mm.plugin.finder.live.util.y.m(e30Var2, null, a1Var, new com.tencent.mm.plugin.finder.live.widget.a30(e30Var2, null), 1, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
