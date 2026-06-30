package i53;

/* loaded from: classes.dex */
public class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GamePublishGalleryUI f288675d;

    public n1(com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI) {
        this.f288675d = gamePublishGalleryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GamePublishGalleryUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8767, 0, 2, 87, nj0.a.c(new java.util.HashMap()));
        com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI = this.f288675d;
        gamePublishGalleryUI.setResult(0);
        gamePublishGalleryUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
