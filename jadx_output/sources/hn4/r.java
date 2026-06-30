package hn4;

/* loaded from: classes15.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f282598d;

    public r(hn4.z zVar) {
        this.f282598d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hn4.z zVar = this.f282598d;
        if (zVar.getListItemUIComponent() != null && ((fn4.m) zVar.getListItemUIComponent()).u() != ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175135o.f387516v) {
            ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).H.f264477d = 2;
            ((com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI) zVar.getListVideoUIComponent()).t1(zVar.f264528z.u());
            ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).H.d(zVar.E);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175135o, zVar.E, zVar.f264528z.u(), 2, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
