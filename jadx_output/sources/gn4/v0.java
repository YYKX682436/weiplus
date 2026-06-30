package gn4;

/* loaded from: classes9.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273659d;

    public v0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f273659d = topStoryFSVideoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.T;
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273659d;
        topStoryFSVideoUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) topStoryFSVideoUI.getContext(), 1, false);
        k0Var.f211872n = new gn4.w0(topStoryFSVideoUI);
        k0Var.f211881s = new gn4.e0(topStoryFSVideoUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
