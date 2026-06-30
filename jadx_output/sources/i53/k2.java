package i53;

/* loaded from: classes3.dex */
public class k2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameTabGalleryUI f288633d;

    public k2(com.tencent.mm.plugin.game.media.GameTabGalleryUI gameTabGalleryUI) {
        this.f288633d = gameTabGalleryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.game.media.GameTabGalleryUI gameTabGalleryUI = this.f288633d;
        androidx.appcompat.app.AppCompatActivity context = gameTabGalleryUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        gameTabGalleryUI.finish();
    }
}
