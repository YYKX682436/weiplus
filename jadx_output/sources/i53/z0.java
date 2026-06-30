package i53;

/* loaded from: classes8.dex */
public class z0 implements i53.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameLocalGalleryView f288802a;

    public z0(com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView) {
        this.f288802a = gameLocalGalleryView;
    }

    public void a(int i17) {
        com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView = this.f288802a;
        if (i17 > 0) {
            gameLocalGalleryView.f140048g.setText(gameLocalGalleryView.getResources().getString(com.tencent.mm.R.string.fnf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(gameLocalGalleryView.f140049h)));
            gameLocalGalleryView.f140048g.setEnabled(true);
            gameLocalGalleryView.f140047f.setVisibility(0);
            gameLocalGalleryView.f140047f.setText(gameLocalGalleryView.getResources().getString(com.tencent.mm.R.string.fnh));
            return;
        }
        gameLocalGalleryView.f140048g.setText(gameLocalGalleryView.getResources().getString(com.tencent.mm.R.string.fne));
        gameLocalGalleryView.f140048g.setEnabled(false);
        if (gameLocalGalleryView.f140051m) {
            gameLocalGalleryView.f140047f.setVisibility(8);
        } else {
            gameLocalGalleryView.f140047f.setVisibility(0);
            gameLocalGalleryView.f140047f.setText(gameLocalGalleryView.getResources().getString(com.tencent.mm.R.string.fng));
        }
    }
}
