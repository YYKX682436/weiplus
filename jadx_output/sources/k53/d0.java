package k53;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoView f304352d;

    public d0(com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView) {
        this.f304352d = gameVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f304352d.f140132e;
        if (f1Var instanceof com.tencent.mm.pluginsdk.ui.CommonVideoView) {
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).D();
        }
    }
}
