package gx0;

/* loaded from: classes5.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276617e = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.k6(this.f276617e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.k6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0056. Please report as an issue. */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276616d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f276617e.f277115r != gx0.y4.f277206m) {
                gx0.w8 w8Var = this.f276617e;
                java.lang.String b17 = j65.q.b(w8Var.getContext(), com.tencent.mm.R.string.lli);
                this.f276616d = 1;
                if (w8Var.A6(b17, this) == aVar) {
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
                gx0.w8.o7(this.f276617e);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        switch (this.f276617e.f277115r.ordinal()) {
            case 0:
                gx0.w8 w8Var2 = this.f276617e;
                w8Var2.getClass();
                w8Var2.J7(gx0.y4.f277201e);
                w8Var2.f277117t = kotlinx.coroutines.l.d(w8Var2.getLifecycleScope(), null, null, new gx0.d5(w8Var2, null), 3, null);
                return f0Var;
            case 1:
                return f0Var;
            case 2:
                gx0.w8.o7(this.f276617e);
                return f0Var;
            case 3:
            case 5:
            case 7:
                kotlinx.coroutines.r2 r2Var = this.f276617e.f277117t;
                if (r2Var != null) {
                    gx0.w8 w8Var3 = this.f276617e;
                    this.f276616d = 3;
                    if (gx0.w8.g7(w8Var3, r2Var, "initializeTimelineAndStartupPlayback", this) == aVar) {
                        return aVar;
                    }
                }
                gx0.w8.o7(this.f276617e);
                return f0Var;
            case 4:
                gx0.w8 w8Var4 = this.f276617e;
                this.f276616d = 2;
                return w8Var4.E4(this) == aVar ? aVar : f0Var;
            case 6:
                return f0Var;
            case 8:
                com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "initializeTimelineAndStartupPlayback >> but state is " + this.f276617e.f277115r);
                gx0.w8 w8Var5 = this.f276617e;
                this.f276616d = 4;
                return w8Var5.E4(this) == aVar ? aVar : f0Var;
            default:
                return f0Var;
        }
    }
}
