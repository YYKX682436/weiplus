package sx3;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f413575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx3.q f413576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j17, sx3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f413575e = j17;
        this.f413576f = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sx3.p(this.f413575e, this.f413576f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sx3.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f413574d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ux3.g gVar = new ux3.g(this.f413575e);
                this.f413574d = 1;
                obj = rm0.h.a(gVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            t45.u uVar = (t45.u) obj;
            androidx.appcompat.app.AppCompatActivity activity = this.f413576f.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            sx3.b bVar = (sx3.b) pf5.z.f353948a.a(activity).a(sx3.b.class);
            java.util.LinkedList Infos = uVar.f415646e;
            kotlin.jvm.internal.o.f(Infos, "Infos");
            boolean z17 = uVar.f415645d;
            bVar.getClass();
            bVar.f413547e = z17;
            kotlinx.coroutines.l.d(bVar.getMainScope(), null, null, new sx3.a(z17, Infos, bVar, null), 3, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneHistoryManager", "getHistoryRingBack failed: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
