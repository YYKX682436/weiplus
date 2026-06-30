package ee5;

/* loaded from: classes9.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252064d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f252065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.v1 f252066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f252067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(ee5.v1 v1Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252066f = v1Var;
        this.f252067g = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.u1 u1Var = new ee5.u1(this.f252066f, this.f252067g, continuation);
        u1Var.f252065e = obj;
        return u1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ot0.q v17;
        java.lang.String s17;
        ae5.i iVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252064d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f252065e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemPayUIC", "SearchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.v1 v1Var = this.f252066f;
            com.tencent.mm.storage.a3 z07 = com.tencent.mm.storage.z3.R4(v1Var.f252056o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(v1Var.f252056o) : null;
            long j17 = 0;
            for (com.tencent.mm.storage.f9 f9Var : this.f252067g) {
                if (!kotlinx.coroutines.z0.h(y0Var)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemPayUIC", "is no active");
                    return f0Var;
                }
                java.lang.String j18 = f9Var.j();
                if (j18 != null && (v17 = ot0.q.v(j18)) != null) {
                    long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(f9Var.getCreateTime()));
                    if (j17 != a17) {
                        arrayList.add(new ae5.b(f9Var.getCreateTime()));
                    }
                    boolean R4 = com.tencent.mm.storage.z3.R4(v1Var.f252056o);
                    java.lang.String str = "";
                    if (f9Var.A0() == 1) {
                        s17 = c01.z1.r();
                    } else {
                        s17 = R4 ? c01.w9.s(f9Var.j()) : "";
                        if (com.tencent.mm.sdk.platformtools.t8.K0(s17)) {
                            s17 = f9Var.Q0();
                        }
                    }
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s17, true);
                    if (z07 != null) {
                        if (!(s17 == null || s17.length() == 0)) {
                            str = z07.z0(s17);
                        }
                    }
                    java.lang.String str2 = str;
                    if (v1Var.Z6(f9Var.getType())) {
                        ae5.i iVar2 = new ae5.i(f9Var.getCreateTime(), v17.f348666i, v17.J0, f9Var.getMsgId(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str2, f9Var.Q0());
                        com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent();
                        walletQueryRemittanceStatusEvent.f54971g.f8421a = v17.L0;
                        walletQueryRemittanceStatusEvent.e();
                        int A0 = f9Var.A0();
                        am.z10 z10Var = walletQueryRemittanceStatusEvent.f54972h;
                        boolean z17 = A0 == 1 ? z10Var.f8506b : !z10Var.f8506b;
                        int i18 = z10Var.f8505a;
                        boolean z18 = i18 == -2 ? false : z17;
                        if (i18 <= 0) {
                            i18 = v17.I0;
                        }
                        int i19 = i18;
                        iVar2.f4402f = v1Var.getActivity().getResources().getString(com.tencent.mm.R.string.jjy, iVar2.f4402f);
                        iVar2.f4410l = (i19 == 1 || !(i19 == 3 || i19 == 4 || i19 == 5 || i19 == 6)) ? -352966 : -470621;
                        boolean z19 = z18;
                        iVar2.f4409k = ee5.v1.W6(v1Var, v1Var.getActivity(), f9Var, v17, z19, i19);
                        iVar2.f4408j = ee5.v1.X6(v1Var, v1Var.getActivity(), f9Var, v17, z19, i19);
                        iVar2.f4409k = ee5.v1.W6(v1Var, v1Var.getActivity(), f9Var, v17, z19, i19);
                        iVar2.f4409k = ee5.v1.W6(v1Var, v1Var.getActivity(), f9Var, v17, z19, i19);
                        iVar2.f4408j = ee5.v1.X6(v1Var, v1Var.getActivity(), f9Var, v17, z19, i19);
                        iVar = iVar2;
                    } else {
                        iVar = new ae5.i(f9Var.getCreateTime(), v17.f348666i, v17.f348680l1, f9Var.getMsgId(), n17.d1(), n17.f2(), n17.w0(), str2, f9Var.Q0());
                        if (com.tencent.mm.sdk.platformtools.t8.D1(v17.f348700q1, 0) == com.tencent.mm.sdk.platformtools.t8.D1("1001", 0)) {
                            iVar.f4402f = v1Var.getActivity().getResources().getString(com.tencent.mm.R.string.jjw, iVar.f4402f);
                            iVar.f4409k = com.tencent.mm.ui.chatting.x1.g(v17, f9Var.A0() == 1);
                            iVar.f4410l = com.tencent.mm.ui.chatting.x1.a(v17, f9Var.A0() == 1);
                            iVar.f4408j = com.tencent.mm.ui.chatting.x1.d(v17, f9Var.A0() == 1);
                        } else {
                            com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent = new com.tencent.mm.autogen.events.WalletQueryHbStatusEvent();
                            walletQueryHbStatusEvent.f54969g.f8253a = v17.f348704r1;
                            walletQueryHbStatusEvent.e();
                            iVar.f4402f = v1Var.getActivity().getResources().getString(com.tencent.mm.R.string.jjx, iVar.f4402f);
                            am.x10 x10Var = walletQueryHbStatusEvent.f54970h;
                            iVar.f4409k = com.tencent.mm.ui.chatting.x1.i(x10Var.f8335a, x10Var.f8336b, x10Var.f8337c, f9Var.A0() == 1, com.tencent.mm.storage.z3.R4(v1Var.f252056o), v1Var.f252056o, v17, null);
                            ot0.h y17 = v17.y(ot0.c.class);
                            kotlin.jvm.internal.o.f(y17, "piece(...)");
                            int identifier = v1Var.getActivity().getResources().getIdentifier(((ot0.c) y17).f348409b, "drawable", com.tencent.mm.sdk.platformtools.x2.f193072b);
                            int k17 = com.tencent.mm.ui.chatting.x1.k(x10Var.f8336b, x10Var.f8337c, f9Var.A0() == 1);
                            iVar.f4408j = k17;
                            if (k17 <= 0) {
                                iVar.f4408j = identifier;
                            }
                        }
                    }
                    arrayList.add(iVar);
                    j17 = a17;
                }
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ee5.t1 t1Var = new ee5.t1(v1Var, arrayList, null);
            this.f252064d = 1;
            if (kotlinx.coroutines.l.g(g3Var, t1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
