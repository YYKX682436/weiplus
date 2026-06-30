package k53;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI f304367d;

    public k(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI) {
        this.f304367d = gameVideoPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI = this.f304367d;
        p33.l x17 = gameVideoPreviewUI.f140116f.x(gameVideoPreviewUI.f140124q);
        if (x17 != null) {
            android.os.Bundle V6 = com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI.V6(gameVideoPreviewUI, gameVideoPreviewUI.f140124q);
            V6.putBoolean("game_straight_to_publish", gameVideoPreviewUI.f140128u);
            if (com.tencent.mm.vfs.w6.j(x17.f351617v)) {
                ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(gameVideoPreviewUI.f140114d, gameVideoPreviewUI.f140125r, x17.f351614s, x17.f351617v, null, null, 19722, V6, gameVideoPreviewUI.f140129v);
            } else {
                ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(gameVideoPreviewUI.f140114d, gameVideoPreviewUI.f140125r, x17.f351614s, null, x17.f351607i, x17.f351606h, 19722, V6, gameVideoPreviewUI.f140129v);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
