package df2;

/* loaded from: classes3.dex */
public final class j00 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f230443e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j00(df2.m00 m00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230443e = m00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.j00(this.f230443e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.j00) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230442d;
        df2.m00 m00Var = this.f230443e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List list = m00Var.f230741n;
            this.f230442d = 1;
            m00Var.getClass();
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new df2.c00(list, m00Var, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout d76 = m00Var.d7();
            if (d76 != null) {
                d76.c();
            }
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout d77 = m00Var.d7();
            if (d77 != null) {
                d77.d();
            }
        } else {
            com.tencent.mars.xlog.Log.e(m00Var.f230740m, "download res failed");
        }
        return jz5.f0.f302826a;
    }
}
