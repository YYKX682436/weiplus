package mx0;

/* loaded from: classes5.dex */
public final class m7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332155d;

    /* renamed from: e, reason: collision with root package name */
    public int f332156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx0.k f332158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, rx0.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332157f = shootComposingPluginLayout;
        this.f332158g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.m7(this.f332157f, this.f332158g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.m7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332156e;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332157f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = shootComposingPluginLayout.f69542J;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            str = recordConfigProvider.D;
            yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
            kotlin.jvm.internal.o.d(str);
            this.f332155d = str;
            this.f332156e = 1;
            b8Var.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.t7(b8Var, nVar, false, str, null), 3, null);
            a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            str = (java.lang.String) this.f332155d;
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        if (((java.lang.Boolean) a17).booleanValue()) {
            kotlin.jvm.internal.o.d(str);
            rx0.k kVar = this.f332158g;
            r45.q23 q23Var = kVar.f400937d;
            com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo = kVar.f400936c;
            java.util.List list = mJRecordingFinishInfo != null ? mJRecordingFinishInfo.f47823g : null;
            if (list == null) {
                list = kz5.p0.f313996d;
            }
            this.f332155d = null;
            this.f332156e = 2;
            if (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.h0(shootComposingPluginLayout, str, q23Var, list, this) == aVar) {
                return aVar;
            }
        } else {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            mx0.l7 l7Var = new mx0.l7(shootComposingPluginLayout, null);
            this.f332155d = null;
            this.f332156e = 3;
            if (kotlinx.coroutines.l.g(g3Var, l7Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
