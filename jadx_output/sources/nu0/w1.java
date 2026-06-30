package nu0;

/* loaded from: classes5.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340128e = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.w1(this.f340128e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x006d. Please report as an issue. */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f340127d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f340128e.f339878o != nu0.c1.f339900m) {
                nu0.b4 b4Var = this.f340128e;
                java.lang.String b17 = j65.q.b(b4Var.getContext(), com.tencent.mm.R.string.lli);
                this.f340127d = 1;
                if (b4Var.A6(b17, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (i17 != 3) {
                    if (i17 == 4) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                nu0.b4.e7(this.f340128e);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[initAndStartup] state:" + this.f340128e.f339878o);
        switch (this.f340128e.f339878o.ordinal()) {
            case 0:
                nu0.b4 b4Var2 = this.f340128e;
                com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[doInit] state:" + b4Var2.f339878o);
                b4Var2.z7(nu0.c1.f339895e);
                b4Var2.f339881q = kotlinx.coroutines.l.d(b4Var2.getLifecycleScope(), null, null, new nu0.o1(b4Var2, null), 3, null);
                return f0Var;
            case 1:
                return f0Var;
            case 2:
                nu0.b4.e7(this.f340128e);
                return f0Var;
            case 3:
            case 5:
            case 7:
                kotlinx.coroutines.r2 r2Var = this.f340128e.f339881q;
                if (r2Var != null) {
                    nu0.b4 b4Var3 = this.f340128e;
                    this.f340127d = 3;
                    if (nu0.b4.b7(b4Var3, r2Var, "initAndStartup", this) == aVar) {
                        return aVar;
                    }
                }
                nu0.b4.e7(this.f340128e);
                return f0Var;
            case 4:
                nu0.b4 b4Var4 = this.f340128e;
                this.f340127d = 2;
                return b4Var4.E4(this) == aVar ? aVar : f0Var;
            case 6:
                return f0Var;
            case 8:
                nu0.b4 b4Var5 = this.f340128e;
                this.f340127d = 4;
                return b4Var5.E4(this) == aVar ? aVar : f0Var;
            default:
                return f0Var;
        }
    }
}
