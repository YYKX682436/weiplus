package mx0;

/* loaded from: classes5.dex */
public final class i4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332044d = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.i4(this.f332044d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.i4 i4Var = (mx0.i4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.g3 recordPlugin;
        mx0.g3 recordPlugin2;
        mx0.l favoritePlugin;
        mx0.o1 materialImportUIPlugin;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332044d;
        shootComposingPluginLayout.y0();
        shootComposingPluginLayout.R0();
        recordPlugin = shootComposingPluginLayout.getRecordPlugin();
        recordPlugin.b(true);
        recordPlugin2 = shootComposingPluginLayout.getRecordPlugin();
        recordPlugin2.reset();
        favoritePlugin = shootComposingPluginLayout.getFavoritePlugin();
        favoritePlugin.c();
        materialImportUIPlugin = shootComposingPluginLayout.getMaterialImportUIPlugin();
        materialImportUIPlugin.setVisibility(0);
        return jz5.f0.f302826a;
    }
}
