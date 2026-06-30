package us2;

/* loaded from: classes.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430563e = str;
        this.f430564f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new us2.v(this.f430563e, this.f430564f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.e21 e21Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f430562d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String finderNickName = this.f430563e;
                java.lang.String eventName = this.f430564f;
                ((c61.l7) b6Var).getClass();
                kotlin.jvm.internal.o.g(finderNickName, "finderNickName");
                kotlin.jvm.internal.o.g(eventName, "eventName");
                bq.p1 p1Var = new bq.p1(null, finderNickName, eventName);
                this.f430562d = 1;
                obj = rm0.h.a(p1Var, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.util.LinkedList list = ((r45.du2) obj).getList(2);
            if (list == null || (e21Var = (r45.e21) kz5.n0.Z(list)) == null) {
                return null;
            }
            if (e21Var.getInteger(12) != 1) {
                return e21Var;
            }
            return null;
        } catch (rm0.j e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TemplateEventInfoReqCgi", "getEventTopicInfo error >> " + e17);
            return null;
        }
    }
}
