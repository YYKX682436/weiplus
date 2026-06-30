package gn4;

/* loaded from: classes15.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f273629d;

    public i(gn4.z zVar) {
        this.f273629d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        gn4.z zVar = this.f273629d;
        u1Var.g(zVar.getContext().getString(com.tencent.mm.R.string.k0e, zVar.E.Y.f383243n.f382386h));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.f490002i4);
        u1Var.b(new gn4.h(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
