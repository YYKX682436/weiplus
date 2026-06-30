package hn4;

/* loaded from: classes15.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f282599d;

    public s(hn4.z zVar) {
        this.f282599d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.un6 un6Var = new r45.un6();
        hn4.z zVar = this.f282599d;
        un6Var.f387506i = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175135o.f387506i;
        un6Var.f387512r = java.util.UUID.randomUUID().toString();
        un6Var.f387503f = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175135o.f387507m;
        un6Var.f387504g = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175135o.f387504g;
        un6Var.f387501d = zVar.E.V.f390259h;
        un6Var.f387502e = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175135o.f387502e;
        un6Var.f387509o = zVar.E.V;
        un6Var.f387508n = "topstory";
        un6Var.f387507m = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175135o.f387507m;
        r45.xn6 xn6Var = zVar.E;
        un6Var.f387505h = xn6Var.f390271v;
        un6Var.f387509o.L = xn6Var.L;
        un6Var.f387511q.addAll(xn6Var.V.W);
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = (com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent();
        topStoryBaseVideoUI.getClass();
        su4.r2.r(topStoryBaseVideoUI, un6Var);
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
