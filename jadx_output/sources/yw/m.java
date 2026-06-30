package yw;

/* loaded from: classes9.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f466395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f466396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yw.y yVar, boolean z17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466394d = yVar;
        this.f466395e = z17;
        this.f466396f = i17;
    }

    public static final com.tencent.wechat.mm.biz.s5 a(boolean z17, boolean z18) {
        com.tencent.wechat.mm.biz.s5 s5Var = new com.tencent.wechat.mm.biz.s5();
        s5Var.f218625g = z18 ? 1 : 0;
        boolean[] zArr = s5Var.f218629n;
        zArr[4] = true;
        s5Var.f218626h = z17 ? 1 : 0;
        zArr[5] = true;
        return s5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw.m(this.f466394d, this.f466395e, this.f466396f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true);
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f227167r;
        boolean Ri = ((d85.d1) m0Var).Ri(g0Var, f0Var);
        this.f466394d.getClass();
        boolean z17 = false;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_feed_request_with_poi_android, 0) == 1;
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_disable_out_box_rec_feed_with_poi_android_v2, 0) == 1;
        tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar2).getClass();
        boolean d18 = j35.u.d(context2, "android.permission.ACCESS_FINE_LOCATION", true);
        boolean Ri2 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(g0Var, f0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "request rec feed location enable, hasSystemLocationPermission:" + d18 + ", disableOutBoxRequestRecFeedWithPoi:" + z19 + ", hasBusinessPermission:" + Ri2 + ", requestRecFeedLocationSwitch:" + z18);
        if (z18 && !z19 && d18 && Ri2) {
            z17 = true;
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (!z17) {
            ((ku5.t0) ku5.t0.f312615d).q(new yw.j(this.f466394d, this.f466396f, d17, Ri));
            return f0Var2;
        }
        if (!this.f466395e) {
            com.tencent.wechat.mm.biz.c cVar = this.f466394d.f466509a;
            if (cVar != null) {
                cVar.F0(this.f466396f, a(d17, Ri));
            }
        } else if (i95.n0.h(u60.g.class)) {
            ((ku5.t0) ku5.t0.f312615d).q(new yw.l(this.f466394d, this.f466396f, d17, Ri));
        } else {
            com.tencent.wechat.mm.biz.c cVar2 = this.f466394d.f466509a;
            if (cVar2 != null) {
                int i17 = this.f466396f;
                com.tencent.wechat.mm.biz.s5 a17 = a(d17, Ri);
                a17.f218628m = 1;
                a17.f218629n[7] = true;
                cVar2.F0(i17, a17);
            }
        }
        return f0Var2;
    }
}
