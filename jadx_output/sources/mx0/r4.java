package mx0;

/* loaded from: classes5.dex */
public final class r4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332285d = shootComposingPluginLayout;
        this.f332286e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.r4(this.f332285d, this.f332286e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.r4 r4Var = (mx0.r4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        wx0.e0 cameraSwitchPlugin;
        wx0.s0 flashControlPlugin;
        wx0.s0 flashControlPlugin2;
        mx0.x musicTipsPlugin;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332285d;
        yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
        kotlinx.coroutines.y0 y0Var = b8Var.M;
        boolean z17 = this.f332286e;
        kotlinx.coroutines.l.d(y0Var, null, null, new yx0.x3(b8Var, z17, null), 3, null);
        cameraSwitchPlugin = shootComposingPluginLayout.getCameraSwitchPlugin();
        cameraSwitchPlugin.b(z17);
        flashControlPlugin = shootComposingPluginLayout.getFlashControlPlugin();
        flashControlPlugin2 = shootComposingPluginLayout.getFlashControlPlugin();
        flashControlPlugin.c(flashControlPlugin2.f450540m);
        musicTipsPlugin = shootComposingPluginLayout.getMusicTipsPlugin();
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) ((mx0.q2) musicTipsPlugin).d().o().e()).setCameraFacing(z17);
        return jz5.f0.f302826a;
    }
}
