package gn4;

/* loaded from: classes15.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f273660d;

    public w(gn4.z zVar) {
        this.f273660d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gn4.z zVar = this.f273660d;
        zVar.getFSVideoUIComponent().o4().f264477d = 2;
        if (zVar.getFSItemUIComponent() == null || ((gn4.d0) zVar.getFSItemUIComponent()).getAdapterPosition() != zVar.getFSVideoUIComponent().Y2()) {
            zVar.getFSVideoUIComponent().t1(zVar.f264528z.u());
            zVar.getFSVideoUIComponent().o4().d(zVar.E);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(zVar.getFSVideoUIComponent().r0(), zVar.E, zVar.f264528z.u(), 2, "");
        } else {
            zVar.n(!zVar.getFSVideoUIComponent().s1().f264567a, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
