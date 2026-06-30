package df2;

/* loaded from: classes3.dex */
public final class oz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xb2 f231024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(df2.a00 a00Var, r45.xb2 xb2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231023e = a00Var;
        this.f231024f = xb2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.oz(this.f231023e, this.f231024f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.oz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231022d;
        r45.xb2 xb2Var = this.f231024f;
        df2.a00 a00Var = this.f231023e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f231022d = 1;
            if (df2.a00.a7(a00Var, xb2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c76 = a00Var.c7();
        if (!(c76 != null && c76.getVisibility() == 0)) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.V;
            cl0.g gVar = new cl0.g();
            r45.bb7 bb7Var = (r45.bb7) xb2Var.getCustom(0);
            gVar.h("extra_report_json", bb7Var != null ? bb7Var.getString(4) : null);
            ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, gVar, null, null, null, false, null, 16126, null);
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c77 = a00Var.c7();
            if (c77 != null) {
                c77.e();
            }
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c78 = a00Var.c7();
            if (c78 != null) {
                c78.d();
            }
        }
        return jz5.f0.f302826a;
    }
}
