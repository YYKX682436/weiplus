package i53;

/* loaded from: classes8.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GamePublishGalleryUI f288655d;

    public m1(com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI) {
        this.f288655d = gamePublishGalleryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GamePublishGalleryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI = this.f288655d;
        gamePublishGalleryUI.f140056e.setSelected(true);
        gamePublishGalleryUI.f140055d.setSelected(false);
        gamePublishGalleryUI.U6(1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
