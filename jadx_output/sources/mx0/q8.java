package mx0;

/* loaded from: classes5.dex */
public final class q8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt3.p f332265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f332266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f332267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332268i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, vt3.p pVar, int i17, long j17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332264e = shootComposingPluginLayout;
        this.f332265f = pVar;
        this.f332266g = i17;
        this.f332267h = j17;
        this.f332268i = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.q8(this.f332264e, this.f332265f, this.f332266g, this.f332267h, this.f332268i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.q8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332263d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332264e;
            vt3.p pVar = this.f332265f;
            int i18 = this.f332266g;
            long j17 = this.f332267h;
            java.util.List list = this.f332268i;
            this.f332263d = 1;
            if (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.C(shootComposingPluginLayout, pVar, i18, j17, list, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
