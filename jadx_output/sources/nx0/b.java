package nx0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel f341069d;

    public b(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel beautifyPanel) {
        this.f341069d = beautifyPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nx0.g gVar = nx0.g.f341108d;
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel beautifyPanel = this.f341069d;
        beautifyPanel.f69573m = gVar;
        com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(beautifyPanel.f69569f, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
