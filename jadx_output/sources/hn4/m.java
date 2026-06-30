package hn4;

/* loaded from: classes15.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f282587d;

    public m(hn4.z zVar) {
        this.f282587d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hn4.z zVar = this.f282587d;
        if (!((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.f264576e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "no video play now");
        } else {
            if (zVar.G.getVideoTotalTime() - zVar.G.getmPosition() < 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "cannot change play status in last 2 seconds");
                yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).H.d(zVar.E);
            if (((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.d()) {
                ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.h();
                com.tencent.mm.sdk.platformtools.b4 b4Var = zVar.G.F;
                if (b4Var != null) {
                    b4Var.d();
                }
            } else {
                ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.k();
                hn4.c0 c0Var = zVar.G;
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = c0Var.F;
                if (b4Var2 != null) {
                    b4Var2.d();
                    c0Var.F.c(2000L, 2000L);
                }
            }
            zVar.i();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
