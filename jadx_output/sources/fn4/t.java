package fn4;

/* loaded from: classes8.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264608d;

    public t(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI) {
        this.f264608d = topStoryBaseVideoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI.X;
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264608d;
        topStoryBaseVideoUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) topStoryBaseVideoUI.getContext(), 1, false);
        k0Var.f211872n = new fn4.u(topStoryBaseVideoUI);
        k0Var.f211881s = new fn4.v(topStoryBaseVideoUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
