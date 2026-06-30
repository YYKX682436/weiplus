package mx0;

/* loaded from: classes5.dex */
public final class r7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332288d;

    public r7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        this.f332288d = shootComposingPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx0.x musicTipsPlugin;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332288d;
        musicTipsPlugin = shootComposingPluginLayout.getMusicTipsPlugin();
        int i17 = shootComposingPluginLayout.O1;
        java.lang.String musicId = shootComposingPluginLayout.P1;
        mx0.q2 q2Var = (mx0.q2) musicTipsPlugin;
        q2Var.getClass();
        kotlin.jvm.internal.o.g(musicId, "musicId");
        mx0.k3 d17 = q2Var.d();
        d17.getClass();
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) d17.o().e()).s(i17, musicId, true);
    }
}
