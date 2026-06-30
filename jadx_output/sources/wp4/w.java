package wp4;

/* loaded from: classes4.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp4.x f448451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f448452g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String str, wp4.x xVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448450e = str;
        this.f448451f = xVar;
        this.f448452g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.w(this.f448450e, this.f448451f, this.f448452g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f448449d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zp4.e eVar = zp4.e.f474954a;
            java.lang.String str = this.f448450e;
            dm.q0 d17 = eVar.d(str);
            wp4.x xVar = this.f448451f;
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e(xVar.f448453d, "updateWorkTypeAndReportByUploadAction get info is null " + str);
                return f0Var;
            }
            int i18 = d17.field_work_type;
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            com.tencent.mars.xlog.Log.i(xVar.f448453d, "lastWorkType: " + i18 + ", " + str);
            int i19 = this.f448452g;
            if (i19 == 5) {
                b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).b(str);
                aq4.a.f13201a.a(d17.field_work_id);
                f0Var2.f310116d = com.google.android.gms.wearable.WearableStatusCodes.INVALID_TARGET_NODE;
            } else if (i19 == 6) {
                f0Var2.f310116d = i18 == 4001 ? com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE : i18;
            } else if (i19 == 9) {
                f0Var2.f310116d = 4009;
            }
            com.tencent.mars.xlog.Log.i(xVar.f448453d, "currentWorkType: " + f0Var2.f310116d + ", " + str);
            eVar.f(str, f0Var2.f310116d);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            wp4.v vVar = new wp4.v(this.f448452g, this.f448450e, i18, f0Var2, null);
            this.f448449d = 1;
            if (kotlinx.coroutines.l.g(g3Var, vVar, this) == aVar) {
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
