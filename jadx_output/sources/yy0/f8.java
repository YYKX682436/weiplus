package yy0;

/* loaded from: classes4.dex */
public final class f8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f468096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f468098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(java.lang.String str, yy0.g8 g8Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468097e = str;
        this.f468098f = g8Var;
        this.f468099g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.f8(this.f468097e, this.f468098f, this.f468099g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.f8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468096d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            iz0.d dVar = iz0.d.f296044a;
            java.lang.String str = this.f468097e;
            dm.ib d17 = dVar.d(str);
            yy0.g8 g8Var = this.f468098f;
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e(g8Var.f468112d, "updateWorkTypeAndReportByUploadAction get info is null " + str);
                return f0Var;
            }
            int i18 = d17.field_work_type;
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            com.tencent.mars.xlog.Log.i(g8Var.f468112d, "lastWorkType: " + i18 + ", " + str);
            int i19 = this.f468099g;
            if (i19 == 5) {
                b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).b(str);
                hz0.m.f286283a.a(d17.field_work_id);
                f0Var2.f310116d = com.google.android.gms.wearable.WearableStatusCodes.INVALID_TARGET_NODE;
            } else if (i19 == 6) {
                f0Var2.f310116d = i18 == 4001 ? com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE : i18;
            } else if (i19 == 9) {
                f0Var2.f310116d = 4009;
            }
            com.tencent.mars.xlog.Log.i(g8Var.f468112d, "currentWorkType: " + f0Var2.f310116d + ", " + str);
            dVar.e(str, f0Var2.f310116d);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            yy0.e8 e8Var = new yy0.e8(this.f468099g, this.f468097e, i18, f0Var2, null);
            this.f468096d = 1;
            if (kotlinx.coroutines.l.g(g3Var, e8Var, this) == aVar) {
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
