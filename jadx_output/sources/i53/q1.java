package i53;

/* loaded from: classes.dex */
public class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GamePublishGalleryUI f288695d;

    public q1(com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI) {
        this.f288695d = gamePublishGalleryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f288695d.finish();
    }
}
