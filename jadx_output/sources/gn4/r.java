package gn4;

/* loaded from: classes15.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f273650d;

    public r(gn4.z zVar) {
        this.f273650d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gn4.z zVar = this.f273650d;
        gn4.a fSItemUIComponent = zVar.getFSItemUIComponent();
        int u17 = zVar.f264528z.u();
        gn4.d0 d0Var = (gn4.d0) fSItemUIComponent;
        fn4.b bVar = d0Var.f264583d;
        d0Var.r(bVar, bVar.B(), d0Var.f273605h, u17);
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
