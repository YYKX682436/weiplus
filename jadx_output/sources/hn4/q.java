package hn4;

/* loaded from: classes15.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f282595d;

    public q(hn4.z zVar) {
        this.f282595d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hn4.z zVar = this.f282595d;
        zVar.getClass();
        zVar.D = java.util.UUID.randomUUID().toString();
        hn4.c0 c0Var = zVar.G;
        com.tencent.mm.sdk.platformtools.b4 b4Var = c0Var.F;
        if (b4Var != null) {
            b4Var.d();
            c0Var.F.c(2000L, 2000L);
        }
        ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).H.f264477d = 2;
        ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.i(zVar.getListVideoUIComponent(), zVar.E, zVar.D, zVar.f264528z.u());
        zVar.i();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
