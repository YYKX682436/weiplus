package df2;

/* loaded from: classes3.dex */
public final class ss extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.h f231371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(df2.lt ltVar, dk2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231370e = ltVar;
        this.f231371f = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ss(this.f231370e, this.f231371f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ss) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231369d;
        df2.lt ltVar = this.f231370e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            df2.qs qsVar = new df2.qs(this.f231371f, ltVar, null);
            this.f231369d = 1;
            if (kotlinx.coroutines.l.g(p0Var, qsVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = df2.lt.W;
        ltVar.z7();
        android.view.ViewGroup viewGroup = ltVar.f230704J;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            pl2.s sVar = ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356684g;
            if (sVar != null) {
                sVar.i(true, new df2.rs(ltVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
