package s72;

/* loaded from: classes12.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.p0 f404092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s72.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404092e = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.m0(this.f404092e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Integer num;
        o72.r2 F;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404091d;
        s72.p0 p0Var = this.f404092e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f404091d = 1;
            obj = p0Var.W6(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            p0Var.f404129o = false;
            p0Var.f404128n = false;
            return f0Var;
        }
        if (p0Var.f404128n) {
            if (p0Var.f404123f) {
                s72.l0 l0Var = p0Var.f404126i;
                if (l0Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[onPinOnTopItemNotExists]");
                    s72.p0 p0Var2 = l0Var.f404087a;
                    if (p0Var2.f404130p != null) {
                        iz4.r b17 = mz4.b0.c().b();
                        num = java.lang.Integer.valueOf((b17 == null || (F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(b17.f296140e)) == null || !((s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).T6(F)) ? -1 : F.field_id);
                    } else {
                        num = null;
                    }
                    if (num == null || num.intValue() == -1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "no local on top item found, banner is empty.");
                        p0Var2.Z6();
                        p0Var2.f404124g = -1;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "try to sync local on top item to the server, favId = " + num + '.');
                        int intValue = num.intValue();
                        p0Var2.f404124g = intValue;
                        p0Var2.Y6(intValue, true, null);
                    }
                    p0Var2.f404128n = false;
                }
            } else {
                s72.l0 l0Var2 = p0Var.f404126i;
                if (l0Var2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[onGetPinOnTopItemSuccess]");
                    o72.k4 oj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
                    s72.p0 p0Var3 = l0Var2.f404087a;
                    o72.r2 re6 = oj6.re(p0Var3.f404124g);
                    if (re6 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "set current on top item favId = " + p0Var3.f404124g);
                        if (!p0Var3.U6()) {
                            p0Var3.a7();
                        } else if (p0Var3.T6(re6)) {
                            p0Var3.a7();
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "detect an invalid favid, remove local top item.");
                            p0Var3.Z6();
                            p0Var3.f404124g = -1;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "favorites note does not show up in local storage, try pulling...");
                        ((s72.j0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(1, 9, new s72.k0(p0Var3));
                    }
                    p0Var3.f404128n = false;
                }
            }
        } else if (p0Var.f404129o) {
            if (p0Var.f404123f) {
                p0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[processCancelOnTopRequestAndReset]");
                o72.o5 o5Var = p0Var.f404132r;
                if (o5Var != null) {
                    o5Var.invoke();
                    p0Var.f404132r = null;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GetPinOnTopService", "cancelPinCallback is null");
                }
            } else {
                p0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[processOnTopRequestAndReset]");
                o72.o5 o5Var2 = p0Var.f404131q;
                if (o5Var2 != null) {
                    o5Var2.invoke();
                    p0Var.f404131q = null;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GetPinOnTopService", "pinCallback is null");
                }
            }
        } else if (p0Var.f404123f) {
            p0Var.Z6();
        } else {
            p0Var.a7();
        }
        p0Var.f404129o = false;
        return f0Var;
    }
}
