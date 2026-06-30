package gn4;

/* loaded from: classes15.dex */
public class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273649d;

    public q0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f273649d = topStoryFSVideoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273649d;
        topStoryFSVideoUI.G.a();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_video_play_info", com.tencent.mm.sdk.platformtools.t8.c1(topStoryFSVideoUI.G.f264480g, ";"));
        intent.putExtra("key_search_id", topStoryFSVideoUI.f175153i.f387507m);
        topStoryFSVideoUI.setResult(-1, intent);
        if (!topStoryFSVideoUI.f175167z.U(2, false)) {
            topStoryFSVideoUI.finish();
        }
        if (!topStoryFSVideoUI.f175166y.m0(2)) {
            topStoryFSVideoUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
