package yx0;

/* loaded from: classes5.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467325e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.g2(this.f467325e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467324d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int ordinal = this.f467325e.f467192s.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                switch (ordinal) {
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        yx0.b8 b8Var = this.f467325e;
                        this.f467324d = 1;
                        obj = b8Var.w(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        break;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "getBeautyModel >> but state is " + this.f467325e.f467192s);
            nx0.y yVar = nx0.y.f341264b;
            return nx0.y.f341264b;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return obj;
    }
}
