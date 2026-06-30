package gn4;

/* loaded from: classes15.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f273646d;

    public p(gn4.z zVar) {
        this.f273646d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gn4.z zVar = this.f273646d;
        if (zVar.getFSVideoUIComponent().I2().f264576e) {
            gn4.c0 c0Var = zVar.G;
            if (!(c0Var instanceof gn4.g1) && c0Var.getVideoTotalTime() - zVar.G.getmPosition() < 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "cannot change play status in last 2 seconds");
                yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            zVar.getFSVideoUIComponent().o4().d(zVar.E);
            if (zVar.getFSVideoUIComponent().I2().d()) {
                zVar.getFSVideoUIComponent().I2().h();
                zVar.G.z();
            } else {
                zVar.getFSVideoUIComponent().I2().k();
                zVar.G.y();
            }
            zVar.i();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "no video play now");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
