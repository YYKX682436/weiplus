package rf2;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.f f394701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rf2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394701e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.e(this.f394701e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394700d;
        java.lang.Object obj2 = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rf2.f fVar = this.f394701e;
            android.view.View view2 = fVar.f394717h;
            android.view.View view3 = fVar.f394716g;
            java.lang.Object obj3 = null;
            if (view2 != null && view3 != null) {
                java.lang.String str = fVar.f394715f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on vote_desc back click, before animation,winnerContainner:");
                df2.ln lnVar = fVar.f394714e;
                rf2.q qVar = lnVar.f230678o;
                sb6.append((qVar == null || (viewGroup2 = qVar.f394857h) == null) ? null : new java.lang.Integer(viewGroup2.getVisibility()));
                sb6.append(",participantContainner:");
                rf2.a aVar2 = lnVar.f230679p;
                sb6.append((aVar2 == null || (viewGroup = aVar2.f394639g) == null) ? null : new java.lang.Integer(viewGroup.getVisibility()));
                sb6.append(",voteDescContainer:");
                rf2.f fVar2 = lnVar.f230680q;
                if (fVar2 != null && (view = fVar2.f394717h) != null) {
                    obj3 = new java.lang.Integer(view.getVisibility());
                }
                sb6.append(obj3);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                rf2.t.b(rf2.t.f394890a, fVar.f394715f, view2, view3, false, new rf2.d(fVar, view2, view3), null, 32, null);
                obj3 = obj2;
            }
            if (obj3 == null) {
                com.tencent.mars.xlog.Log.i(fVar.f394715f, "on vote_desc back click without animation!");
                df2.ln lnVar2 = fVar.f394714e;
                r45.f02 f02Var = lnVar2.f230685v;
                if (f02Var != null) {
                    df2.dn dnVar = lnVar2.f230688y;
                    yz5.l lVar = lnVar2.f230687x;
                    this.f394700d = 1;
                    if (lnVar2.b7(dnVar, f02Var, false, false, lVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj2;
    }
}
