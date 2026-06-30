package wp4;

/* loaded from: classes4.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f448440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp4.x f448441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i17, int i18, wp4.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448439e = i17;
        this.f448440f = i18;
        this.f448441g = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.t(this.f448439e, this.f448440f, this.f448441g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f448438d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zp4.e eVar = zp4.e.f474954a;
            int i18 = this.f448440f;
            int i19 = this.f448439e;
            dm.q0 c17 = eVar.c(i19, i18);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.i(this.f448441g.f448453d, "updateWorkTimeOut get info is null, " + i19);
                return f0Var;
            }
            b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).b(c17.field_work_id);
            aq4.a.f13201a.a(c17.field_work_id);
            l75.k0 a17 = eVar.a();
            p75.n0 n0Var = dm.q0.R;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("work_type", java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE));
            p75.m0 i27 = dm.q0.V.i(java.lang.Integer.valueOf(i19));
            p75.h1 j17 = dm.q0.R.j(contentValues);
            j17.b(i27);
            com.tencent.mars.xlog.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "updateWorkTypeBySnsLocalId >> workType: 4003, result: " + j17.a().f(a17));
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            wp4.s sVar = new wp4.s(c17, null);
            this.f448438d = 1;
            if (kotlinx.coroutines.l.g(g3Var, sVar, this) == aVar) {
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
