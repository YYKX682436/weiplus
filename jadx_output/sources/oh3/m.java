package oh3;

/* loaded from: classes8.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh3.q f345440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(oh3.q qVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f345440e = qVar;
        this.f345441f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oh3.m(this.f345440e, this.f345441f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oh3.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f345439d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mh3.a aVar2 = new mh3.a(kz5.c0.i(new java.lang.Integer(1), new java.lang.Integer(3)));
            this.f345439d = 1;
            obj = rm0.h.b(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((com.tencent.mm.modelbase.f) obj).b()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            oh3.q qVar = this.f345440e;
            qVar.f345455h = currentTimeMillis;
            r45.vt vtVar = qVar.f345456i;
            boolean z17 = vtVar.f388511d != 0;
            qVar.Ai(vtVar);
            boolean z18 = vtVar.f388511d != 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doInit] source=");
            java.lang.String str = this.f345441f;
            sb6.append(str);
            sb6.append(", ");
            sb6.append(qVar.Bi(vtVar));
            sb6.append(" openEntrance=[");
            sb6.append(z17);
            sb6.append(" => ");
            sb6.append(z18);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i("PluginMMEcFeatureService", sb6.toString());
            java.util.Iterator it = qVar.f345457m.iterator();
            while (it.hasNext()) {
                ((p90.i) it.next()).a();
            }
            qVar.wi().n(str);
        }
        return jz5.f0.f302826a;
    }
}
