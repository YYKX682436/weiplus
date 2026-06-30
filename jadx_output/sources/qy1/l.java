package qy1;

/* loaded from: classes13.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy1.m f367742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qy1.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367742e = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy1.l(this.f367742e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f367741d;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oy1.m mVar = oy1.m.f349885a;
            if (oy1.m.f349895k == null) {
                oy1.m.f349895k = java.lang.Long.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_data_report_sdk_cgi_receive_task_delay, 0L));
            }
            java.lang.Long l17 = oy1.m.f349895k;
            long longValue = l17 != null ? l17.longValue() : 0L;
            this.f367741d = 1;
            if (kotlinx.coroutines.k1.b(longValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                i17 = ((u26.c0) obj).f424141a;
                return u26.c0.b(i17);
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        u26.w wVar = this.f367742e.f367745c;
        this.f367741d = 2;
        i17 = ((u26.k) wVar).i(this);
        if (i17 == aVar) {
            return aVar;
        }
        return u26.c0.b(i17);
    }
}
