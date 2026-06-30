package sp2;

/* loaded from: classes2.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f411205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f411206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(sp2.d3 d3Var, com.tencent.mm.ui.MMActivity mMActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411205e = d3Var;
        this.f411206f = mMActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.s2(this.f411205e, this.f411206f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411204d;
        com.tencent.mm.ui.MMActivity mMActivity = this.f411206f;
        sp2.d3 d3Var = this.f411205e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            d3Var.d(mMActivity);
            this.f411204d = 1;
            kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new sp2.y2(mMActivity, d3Var, null), 3, null);
            d3Var.f411013g = b17;
            obj = ((kotlinx.coroutines.g1) b17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.k kVar = (yl2.k) obj;
        az2.f fVar = d3Var.f411015i;
        if (fVar != null) {
            fVar.b();
        }
        d3Var.f411015i = null;
        if (kVar != null) {
            this.f411204d = 2;
            if (sp2.d3.a(d3Var, mMActivity, kVar, this) == aVar) {
                return aVar;
            }
        } else {
            qz5.b.d(android.util.Log.i("Finder.LiveEntranceLiveChatHelper", "prepareJob failed, livePrepareInfo is null"));
        }
        return jz5.f0.f302826a;
    }
}
