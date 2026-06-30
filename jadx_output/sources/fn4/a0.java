package fn4;

/* loaded from: classes15.dex */
public class a0 extends androidx.recyclerview.widget.z {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264473t;

    public a0(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI, fn4.r rVar) {
        this.f264473t = topStoryBaseVideoUI;
    }

    @Override // androidx.recyclerview.widget.o3
    public void B(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264473t;
        topStoryBaseVideoUI.g7();
        topStoryBaseVideoUI.f175139s.c(topStoryBaseVideoUI);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onRemoveFinished %d", java.lang.Integer.valueOf(k3Var.getAdapterPosition()));
    }
}
