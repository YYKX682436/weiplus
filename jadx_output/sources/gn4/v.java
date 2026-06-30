package gn4;

/* loaded from: classes15.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f273658d;

    public v(gn4.z zVar) {
        this.f273658d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gn4.z zVar = this.f273658d;
        if (zVar.C == fn4.f.MOBILE_NET) {
            zVar.getFSVideoUIComponent().s1().f264567a = true;
            zVar.A.k4(2);
        }
        if (zVar.getFSVideoUIComponent().s1().b()) {
            zVar.C = fn4.f.UNKNOWN;
            if (zVar.getFSVideoUIComponent().I2().f264576e) {
                zVar.getFSVideoUIComponent().I2().k();
            } else {
                zVar.n(true, false);
            }
            uu4.a.a(19);
        } else {
            uu4.a.a(20);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
