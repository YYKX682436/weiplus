package yy0;

/* loaded from: classes4.dex */
public final class u7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f468362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f468364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(java.lang.String str, yy0.g8 g8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468363e = str;
        this.f468364f = g8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.u7(this.f468363e, this.f468364f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.u7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468362d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            iz0.d dVar = iz0.d.f296044a;
            java.lang.String str = this.f468363e;
            dm.ib d17 = dVar.d(str);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e(this.f468364f.f468112d, "deleteWork get info is null " + str);
                return f0Var;
            }
            b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).b(str);
            hz0.m.f286283a.a(d17.field_work_id);
            dVar.e(str, 4002);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            yy0.t7 t7Var = new yy0.t7(d17, null);
            this.f468362d = 1;
            if (kotlinx.coroutines.l.g(g3Var, t7Var, this) == aVar) {
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
