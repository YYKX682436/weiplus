package i53;

/* loaded from: classes.dex */
public class p1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GamePublishGalleryUI f288688d;

    public p1(com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI) {
        this.f288688d = gamePublishGalleryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI = this.f288688d;
        androidx.appcompat.app.AppCompatActivity context = gamePublishGalleryUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        gamePublishGalleryUI.finish();
    }
}
