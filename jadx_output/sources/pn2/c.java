package pn2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f356971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f356972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn2.f f356973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.Integer num, pn2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356972e = num;
        this.f356973f = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pn2.c(this.f356972e, this.f356973f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kn0.p pVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f356971d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        pn2.f fVar = this.f356973f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                int intValue = this.f356972e.intValue();
                long j17 = ((mm2.e1) fVar.P0(mm2.e1.class)).f328983m;
                gk2.e eVar = gk2.e.f272471n;
                com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f328985o : null);
                android.content.Context context = fVar.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ek2.i0 i0Var = new ek2.i0(intValue, j17, b17, xy2.c.e(context));
                this.f356971d = 1;
                obj = rm0.h.a(i0Var, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            r45.yk1 yk1Var = (r45.yk1) obj;
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowOrReserveCondition resp " + yk1Var.getInteger(1));
            boolean V6 = ((on2.z2) fVar.P0(on2.z2.class)).V6();
            co0.s u07 = dk2.ef.f233372a.u0();
            boolean z17 = (u07 == null || (pVar = u07.D) == null || !pVar.i()) ? false : true;
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "finallyRequestAttendLotteryWithFollowOrReserveCondition isRunning:" + V6 + ",normalMode:" + z17);
            if (V6) {
                if (yk1Var.getInteger(1) == 1) {
                    if (z17) {
                        fVar.v1();
                    } else {
                        on2.z2 z2Var = (on2.z2) fVar.P0(on2.z2.class);
                        z2Var.f347098s = z2Var.f347092m;
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "cacheLotteryInfo:" + z2Var.f347098s);
                    }
                } else if (pm0.v.z(yk1Var.getInteger(2), 4)) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.dzd), 0).show();
                }
            }
            return f0Var;
        } catch (rm0.j e17) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowOrReserveCondition errorCode=" + e17.f397425f + " errorType=" + e17.f397424e + " error.message " + e17.f397426g);
            return f0Var;
        }
    }
}
