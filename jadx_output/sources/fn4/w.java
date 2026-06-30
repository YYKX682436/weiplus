package fn4;

/* loaded from: classes15.dex */
public class w extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264615d;

    public w(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI) {
        this.f264615d = topStoryBaseVideoUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264615d;
        if (!topStoryBaseVideoUI.A) {
            yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (i17 == 0) {
            if (topStoryBaseVideoUI.U) {
                topStoryBaseVideoUI.f175143w.c(topStoryBaseVideoUI);
            } else {
                topStoryBaseVideoUI.f175139s.c(topStoryBaseVideoUI);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264615d;
        if (!topStoryBaseVideoUI.A || i18 == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        } else {
            topStoryBaseVideoUI.g7();
            yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }
}
