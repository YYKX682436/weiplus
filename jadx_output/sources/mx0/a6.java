package mx0;

/* loaded from: classes5.dex */
public final class a6 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f331828d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331829e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331831g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f331831g = shootComposingPluginLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mx0.a6 a6Var = new mx0.a6(this.f331831g, (kotlin.coroutines.Continuation) obj3);
        a6Var.f331829e = (java.lang.String) obj;
        a6Var.f331830f = (rx0.k) obj2;
        return a6Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f331828d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String resultMediaFilePath = (java.lang.String) this.f331829e;
            rx0.k kVar = (rx0.k) this.f331830f;
            ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
            kotlin.jvm.internal.o.g(resultMediaFilePath, "resultMediaFilePath");
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.r5(m7Var, null), 3, null);
            m7Var.hj("Completed", resultMediaFilePath);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map Ai = m7Var.Ai();
            Ai.put("view_id", "sc_asset_generate_clip");
            ((cy1.a) rVar).yj("sc_asset_generate_clip", null, Ai, 6, false);
            nu3.i.f340218a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(0));
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331831g;
            java.util.ArrayList d17 = kz5.c0.d(resultMediaFilePath);
            r45.q23 q23Var = kVar.f400937d;
            java.lang.String str = kVar.f400938e;
            yx0.u uVar = kVar.f400939f;
            com.tencent.maas.model.time.MJTime mJTime = kVar.f400940g;
            com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo = kVar.f400936c;
            java.util.List list = mJRecordingFinishInfo != null ? mJRecordingFinishInfo.f47823g : null;
            if (list == null) {
                list = kz5.p0.f313996d;
            }
            java.util.List list2 = list;
            this.f331829e = null;
            this.f331828d = 1;
            int i18 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
            if (shootComposingPluginLayout.F0(d17, q23Var, str, uVar, mJTime, false, list2, this) == aVar) {
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
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        mx0.z5 z5Var = new mx0.z5(this.f331831g, null);
        this.f331828d = 2;
        if (kotlinx.coroutines.l.g(g3Var, z5Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
