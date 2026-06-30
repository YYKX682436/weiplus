package yy0;

/* loaded from: classes4.dex */
public final class c8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f468046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f468047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f468049g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(int i17, int i18, yy0.g8 g8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468047e = i17;
        this.f468048f = i18;
        this.f468049g = g8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.c8(this.f468047e, this.f468048f, this.f468049g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.c8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468046d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            iz0.d dVar = iz0.d.f296044a;
            int i18 = this.f468048f;
            int i19 = this.f468047e;
            dm.ib c17 = dVar.c(i19, i18);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.i(this.f468049g.f468112d, "updateWorkTimeOut get info is null, " + i19);
                return f0Var;
            }
            b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).b(c17.field_work_id);
            hz0.m.f286283a.a(c17.field_work_id);
            l75.k0 a17 = dVar.a();
            p75.n0 n0Var = dm.ib.f237670y;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("work_type", java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE));
            p75.m0 i27 = dm.ib.C.i(java.lang.Integer.valueOf(i19));
            p75.h1 j17 = dm.ib.f237670y.j(contentValues);
            j17.b(i27);
            com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "updateWorkTypeBySnsLocalId >> workType: 4003, result: " + j17.a().f(a17));
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            yy0.b8 b8Var = new yy0.b8(c17, null);
            this.f468046d = 1;
            if (kotlinx.coroutines.l.g(g3Var, b8Var, this) == aVar) {
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
