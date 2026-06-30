package mx0;

/* loaded from: classes5.dex */
public final class k9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(boolean z17, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332104e = z17;
        this.f332105f = shootComposingPluginLayout;
        this.f332106g = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.k9(this.f332104e, this.f332105f, this.f332106g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.k9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.g3 recordPlugin;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332103d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.f332104e && this.f332105f.f69557v.B1 == 1) {
                return f0Var;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "changeNormalRecord");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            mx0.j9 j9Var = new mx0.j9(this.f332105f, null);
            this.f332103d = 1;
            if (kotlinx.coroutines.l.g(g3Var, j9Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                mx0.z.i(this.f332105f, false, false, 2, null);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        recordPlugin = this.f332105f.getRecordPlugin();
        recordPlugin.c(9999000);
        this.f332105f.f69557v.B1 = 1;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332105f;
        yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
        bs0.j jVar = shootComposingPluginLayout.f69552q;
        bs0.h hVar = jVar instanceof bs0.h ? (bs0.h) jVar : null;
        java.util.List list = this.f332106g;
        this.f332103d = 2;
        b8Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchEmptyTemplate");
        kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.k6(b8Var, hVar, list, null), 3, null);
        if (f0Var == aVar) {
            return aVar;
        }
        mx0.z.i(this.f332105f, false, false, 2, null);
        return f0Var;
    }
}
