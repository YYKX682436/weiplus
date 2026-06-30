package mx0;

/* loaded from: classes5.dex */
public final class w4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332416d = shootComposingPluginLayout;
        this.f332417e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.w4(this.f332416d, this.f332417e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.w4 w4Var = (mx0.w4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332416d;
        shootComposingPluginLayout.z0();
        vt3.l lVar = vt3.l.f440005a;
        com.tencent.mars.xlog.Log.i("AssetInfoStatistics", "removeAllMedia");
        lVar.c(new vt3.g(2));
        if (this.f332417e) {
            if (shootComposingPluginLayout.U1 == mx0.r3.f332283e) {
                by0.c cVar = by0.c.f36323a;
                android.content.Context context = shootComposingPluginLayout.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (cVar.a(context) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "exitImportPreview: back to album");
                    shootComposingPluginLayout.O0(com.tencent.mm.plugin.appbrand.jsapi.appdownload.e0.CTRL_INDEX);
                }
            }
            shootComposingPluginLayout.g1(false, true);
        } else {
            db5.t7.i(shootComposingPluginLayout.getContext(), j65.q.b(shootComposingPluginLayout.getContext(), com.tencent.mm.R.string.m27), 0);
        }
        return jz5.f0.f302826a;
    }
}
