package k53;

/* loaded from: classes8.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI f304371d;

    public m(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI) {
        this.f304371d = gameVideoPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI = this.f304371d;
        com.tencent.mm.game.report.l.c(gameVideoPreviewUI.f140114d, 87, 8768, 0, 2, gameVideoPreviewUI.f140129v, lj0.a.a(gameVideoPreviewUI.f140125r, null));
        android.view.View inflate = android.view.LayoutInflater.from(gameVideoPreviewUI.getContext()).inflate(com.tencent.mm.R.layout.bf_, (android.view.ViewGroup) null, false);
        y9.i iVar = new y9.i(gameVideoPreviewUI.getContext(), 0);
        iVar.setContentView(inflate);
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.gmo)).setOnClickListener(new k53.l(this, iVar));
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
